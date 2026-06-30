package ax4;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public long f15118d;

    /* renamed from: e, reason: collision with root package name */
    public long f15119e;

    /* renamed from: a, reason: collision with root package name */
    public int f15115a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f15116b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f15117c = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f15120f = 0;

    public void a() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15871, 0, java.lang.Integer.valueOf(this.f15115a), java.lang.Integer.valueOf(this.f15116b), java.lang.Integer.valueOf(this.f15117c), java.lang.Long.valueOf(this.f15119e - this.f15118d), java.lang.Integer.valueOf(this.f15120f), com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "wifi" : com.tencent.mars.comm.NetStatusUtil.is5G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "5g" : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "4g" : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "3g" : com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "2g" : com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE);
    }
}
