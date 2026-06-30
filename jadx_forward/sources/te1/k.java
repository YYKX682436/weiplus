package te1;

/* loaded from: classes13.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te1.g f499319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f499320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f499321f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ te1.l f499322g;

    public k(te1.l lVar, te1.g gVar, long j17, te1.h hVar, java.lang.String str) {
        this.f499322g = lVar;
        this.f499319d = gVar;
        this.f499320e = j17;
        this.f499321f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        long j18;
        java.lang.String str = this.f499319d.f499311b;
        this.f499322g.getClass();
        se1.n nVar = new se1.n("com.tencent.mm.video", null, null);
        java.lang.String str2 = "VideoManager/sendUrlRequest/" + this.f499321f;
        int i17 = 512;
        byte[] bArr = new byte[512];
        ve1.g.p(4, str2, "sendUrlRequest start url=" + str, null);
        long j19 = -1;
        long j27 = 0;
        try {
            try {
                nVar.c(new se1.i(android.net.Uri.parse(str), 0L, 0L, -1L, null, 0, null));
                j17 = nVar.f488351t;
                long j28 = 0;
                while (true) {
                    try {
                        byte[] bArr2 = bArr;
                        long a17 = nVar.a(bArr, 0, i17);
                        if (a17 == -1) {
                            break;
                        }
                        j28 += a17;
                        long j29 = this.f499320e;
                        if (j29 > 0 && j29 != -1 && j28 >= j29) {
                            break;
                        }
                        bArr = bArr2;
                        i17 = 512;
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        j27 = j28;
                    }
                }
                j18 = j28;
                try {
                    ve1.g.p(4, str2, "sendUrlRequest finish, totalReadBytes=" + j18, null);
                    try {
                        nVar.mo162210x5a5ddf8();
                    } catch (java.lang.Exception e18) {
                        ve1.g.p(4, str2, "sendUrlRequest closeException" + e18, null);
                    }
                } catch (java.lang.Exception e19) {
                    e = e19;
                    j27 = j18;
                    j19 = j17;
                    ve1.g.p(4, str2, "sendUrlRequest fail with message" + e.getMessage(), null);
                    try {
                        nVar.mo162210x5a5ddf8();
                    } catch (java.lang.Exception e27) {
                        ve1.g.p(4, str2, "sendUrlRequest closeException" + e27, null);
                    }
                    j17 = j19;
                    j18 = j27;
                    ve1.g.p(4, str2, "sendUrlRequest totalLength=" + j17 + ", totalReadBytes=" + j18, null);
                }
            } catch (java.lang.Exception e28) {
                e = e28;
            }
            ve1.g.p(4, str2, "sendUrlRequest totalLength=" + j17 + ", totalReadBytes=" + j18, null);
        } finally {
        }
    }
}
