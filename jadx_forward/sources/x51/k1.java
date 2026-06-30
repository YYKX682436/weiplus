package x51;

/* loaded from: classes8.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f533560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f533561g;

    public k1(java.lang.String str, java.lang.String str2, boolean z17, int i17) {
        this.f533558d = str;
        this.f533559e = str2;
        this.f533560f = z17;
        this.f533561g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f533558d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        java.lang.String str2 = this.f533559e;
        if (K0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StackReportUploader", "uploadFile param err file:%s  user:%s", str, str2);
            return;
        }
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
        if (k17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StackReportUploader", "uploadFile err len file:%s len:%d", str, java.lang.Integer.valueOf(k17));
            return;
        }
        boolean z17 = this.f533560f;
        int i17 = this.f533561g;
        if (k17 <= 128000) {
            if (x51.l1.b(com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1), str, str2, i17) && z17) {
                com.p314xaae8f345.mm.vfs.w6.f(str);
                return;
            }
            return;
        }
        int i18 = (k17 / 127988) + 1;
        byte[] bArr = new byte[com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48026xbfd28259];
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = com.p314xaae8f345.mm.vfs.w6.E(str);
                int i19 = 0;
                while (true) {
                    if (i19 < i18) {
                        int read = inputStream.read(bArr, 12, 127988);
                        if (read < 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StackReportUploader", "uploadFile read failed file:%s", str);
                            break;
                        }
                        x51.l1.a(currentTimeMillis, bArr, 0);
                        x51.l1.a(i19, bArr, 4);
                        x51.l1.a(read, bArr, 8);
                        if (read < 127988) {
                            int i27 = read + 12;
                            byte[] bArr2 = new byte[i27];
                            java.lang.System.arraycopy(bArr, 0, bArr2, 0, i27);
                            x51.l1.b(bArr2, str, str2, i17);
                        } else {
                            x51.l1.b(bArr, str, str2, i17);
                        }
                        i19++;
                    } else {
                        if (z17) {
                            com.p314xaae8f345.mm.vfs.w6.f(str);
                        }
                        if (inputStream == null) {
                            return;
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StackReportUploader", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StackReportUploader", "uploadFile read except file:%s", str);
                if (0 == 0) {
                    return;
                }
            }
            try {
                inputStream.close();
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th6) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th6;
        }
    }
}
