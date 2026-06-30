package b92;

@j95.b
/* loaded from: classes.dex */
public final class m2 extends i95.w implements zy2.n8 {

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f18486i;

    /* renamed from: n, reason: collision with root package name */
    public long f18488n;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f18481d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f18482e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f18483f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public long f18484g = 60000;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f18485h = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f18487m = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f18489o = new java.util.HashSet();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f18490p = new java.util.concurrent.CopyOnWriteArrayList();

    public void Ai(long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveQosReportService", "reportCgiWithLiveId: isAdd=" + z17 + ", liveId=" + pm0.v.u(j17));
        java.util.HashSet hashSet = this.f18489o;
        if (z17) {
            hashSet.add(java.lang.Long.valueOf(j17));
        } else {
            hashSet.remove(java.lang.Long.valueOf(j17));
        }
    }

    public java.util.List wi(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.K).getValue()).r()).intValue();
        if (intValue <= 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveQosReportService", "getReportCgiQosList: switch is close, source=".concat(source));
            return kz5.p0.f313996d;
        }
        java.util.List L0 = kz5.n0.L0(new java.util.ArrayList(this.f18490p), intValue);
        com.tencent.mars.xlog.Log.i("FinderLiveQosReportService", "getReportCgiQosList: source=" + source + ", qosSize=" + L0.size());
        return L0;
    }
}
