package av4;

/* loaded from: classes15.dex */
public final class o0 implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final nw4.k f14316a;

    /* renamed from: b, reason: collision with root package name */
    public final nw4.y2 f14317b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f14318c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f14319d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f14320e;

    public o0(nw4.k env, nw4.y2 msg, java.lang.String filePath, java.lang.String scanUrl, java.lang.String uxInfo) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(scanUrl, "scanUrl");
        kotlin.jvm.internal.o.g(uxInfo, "uxInfo");
        this.f14316a = env;
        this.f14317b = msg;
        this.f14318c = filePath;
        this.f14319d = scanUrl;
        this.f14320e = uxInfo;
    }

    @Override // p11.d
    public void a(boolean z17, java.lang.Object[] objArr) {
        java.lang.String str = this.f14319d;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.StartAdQRScanJSApi", "ImageLoader downloadImage, isSuccess is " + z17 + ", scanUrl is " + str + ", filePath is " + this.f14318c);
            if (z17) {
                av4.q0.f14328d.e(this.f14316a, this.f14317b, this.f14318c, this.f14319d, this.f14320e);
            } else {
                ((ee0.l) ((fe0.r3) i95.n0.c(fe0.r3.class))).wi(this.f14320e, 1, str, 0);
                this.f14316a.f340863d.e(this.f14317b.f341013c, "startAdQRScan:failed. Image download failed", null);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.StartAdQRScanJSApi", "onImageDownload, exp is " + th6);
        }
    }
}
