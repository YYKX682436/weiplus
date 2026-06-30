package av4;

/* loaded from: classes15.dex */
public final class o0 implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final nw4.k f95849a;

    /* renamed from: b, reason: collision with root package name */
    public final nw4.y2 f95850b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f95851c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f95852d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f95853e;

    public o0(nw4.k env, nw4.y2 msg, java.lang.String filePath, java.lang.String scanUrl, java.lang.String uxInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanUrl, "scanUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uxInfo, "uxInfo");
        this.f95849a = env;
        this.f95850b = msg;
        this.f95851c = filePath;
        this.f95852d = scanUrl;
        this.f95853e = uxInfo;
    }

    @Override // p11.d
    public void a(boolean z17, java.lang.Object[] objArr) {
        java.lang.String str = this.f95852d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.StartAdQRScanJSApi", "ImageLoader downloadImage, isSuccess is " + z17 + ", scanUrl is " + str + ", filePath is " + this.f95851c);
            if (z17) {
                av4.q0.f95861d.e(this.f95849a, this.f95850b, this.f95851c, this.f95852d, this.f95853e);
            } else {
                ((ee0.l) ((fe0.r3) i95.n0.c(fe0.r3.class))).wi(this.f95853e, 1, str, 0);
                this.f95849a.f422396d.e(this.f95850b.f422546c, "startAdQRScan:failed. Image download failed", null);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.StartAdQRScanJSApi", "onImageDownload, exp is " + th6);
        }
    }
}
