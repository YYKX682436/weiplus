package jh1;

/* loaded from: classes7.dex */
public class c implements n01.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f381332d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f381333e;

    /* renamed from: f, reason: collision with root package name */
    public nf.a f381334f;

    /* renamed from: g, reason: collision with root package name */
    public long f381335g;

    public c(java.lang.String str, java.lang.String str2) {
        this.f381334f = null;
        this.f381332d = str;
        this.f381333e = str2;
        this.f381334f = b(str, str2);
    }

    public int a() {
        java.lang.String str;
        nf.a aVar = this.f381334f;
        java.lang.String str2 = this.f381332d;
        if (aVar == null) {
            this.f381334f = b(str2, this.f381333e);
        }
        if (this.f381334f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAudioDataSource", "[getAudioType] inputStream is null");
            return 0;
        }
        if (str2.toLowerCase().endsWith(".mp3")) {
            return 2;
        }
        if (str2.toLowerCase().contains(".wav")) {
            return 3;
        }
        if (str2.toLowerCase().contains(".ogg")) {
            return 4;
        }
        try {
            try {
                byte[] bArr = new byte[64];
                this.f381334f.b(0);
                this.f381334f.read(bArr);
                str = new java.lang.String(bArr);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAudioDataSource", "getAudioType", e17);
                this.f381334f.b(0);
                str = null;
            }
            return (str == null || !str.contains("ftyp")) ? 0 : 1;
        } finally {
            this.f381334f.b(0);
        }
    }

    public final nf.a b(java.lang.String str, java.lang.String str2) {
        java.lang.System.nanoTime();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAudioDataSource", "pkgpath is null, return");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str2)));
        if (!y8Var.f157604g) {
            y8Var.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAudioDataSource", "pkg invalid");
            return null;
        }
        if (!y8Var.a()) {
            y8Var.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAudioDataSource", "pkg readInfo failed");
            return null;
        }
        java.io.InputStream c17 = y8Var.c(str);
        if (c17 == null) {
            y8Var.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAudioDataSource", "inputstream for %s is null", str);
            return null;
        }
        y8Var.close();
        java.lang.System.nanoTime();
        return (nf.a) c17;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        nf.a aVar = this.f381334f;
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAudioDataSource", "close");
            aVar.close();
            this.f381334f = null;
        }
    }

    @Override // n01.f
    /* renamed from: getSize */
    public long mo140932xfb854877() {
        if (this.f381334f != null) {
            return r0.f418105d.limit();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAudioDataSource", "[getSize] inputStream is null");
        return 0L;
    }

    @Override // n01.f
    /* renamed from: readAt */
    public int mo140933xc8455469(long j17, byte[] bArr, int i17, int i18) {
        if (this.f381334f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAudioDataSource", "[readAt]inputstream is null");
            return -1;
        }
        if (bArr == null || bArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAudioDataSource", "[readAt]bytes is null");
            return -1;
        }
        if (j17 < 0 || i17 < 0 || i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAudioDataSource", "position:%d, offset:%d, size:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return -1;
        }
        if (i17 + i18 > bArr.length) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAudioDataSource", "offset:%d, size:%d, bytes.length:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(bArr.length));
            return -1;
        }
        if (i18 + j17 > mo140932xfb854877()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAudioDataSource", "position:%d, size:%d, getSize():%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(mo140932xfb854877()));
        }
        if (this.f381335g != j17) {
            this.f381334f.b((int) j17);
            this.f381335g = j17;
        }
        int read = this.f381334f.read(bArr, i17, i18);
        if (read >= 0) {
            this.f381335g += read;
        }
        return read;
    }
}
