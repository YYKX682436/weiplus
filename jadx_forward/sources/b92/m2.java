package b92;

@j95.b
/* loaded from: classes.dex */
public final class m2 extends i95.w implements zy2.n8 {

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f100019i;

    /* renamed from: n, reason: collision with root package name */
    public long f100021n;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f100014d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f100015e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f100016f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public long f100017g = 60000;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f100018h = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f100020m = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashSet f100022o = new java.util.HashSet();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f100023p = new java.util.concurrent.CopyOnWriteArrayList();

    public void Ai(long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveQosReportService", "reportCgiWithLiveId: isAdd=" + z17 + ", liveId=" + pm0.v.u(j17));
        java.util.HashSet hashSet = this.f100022o;
        if (z17) {
            hashSet.add(java.lang.Long.valueOf(j17));
        } else {
            hashSet.remove(java.lang.Long.valueOf(j17));
        }
    }

    public java.util.List wi(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        ae2.in inVar = ae2.in.f85221a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.K).mo141623x754a37bb()).r()).intValue();
        if (intValue <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveQosReportService", "getReportCgiQosList: switch is close, source=".concat(source));
            return kz5.p0.f395529d;
        }
        java.util.List L0 = kz5.n0.L0(new java.util.ArrayList(this.f100023p), intValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveQosReportService", "getReportCgiQosList: source=" + source + ", qosSize=" + L0.size());
        return L0;
    }
}
