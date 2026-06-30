package zk3;

/* loaded from: classes8.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f555034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f555035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f555036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f555037g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f555038h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(zk3.g0 g0Var, java.util.List list, boolean z17, boolean z18, boolean z19) {
        super(0);
        this.f555034d = g0Var;
        this.f555035e = list;
        this.f555036f = z17;
        this.f555037g = z18;
        this.f555038h = z19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 m7957x4145728;
        this.f555034d.f554985g.clear();
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c> list = this.f555035e;
        if (list != null) {
            zk3.g0 g0Var = this.f555034d;
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c : list) {
                if (c16601x7ed0e40c.f66793x2262335f != -1) {
                    g0Var.f554985g.add(new uk3.a(c16601x7ed0e40c));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "unknown type, info: " + c16601x7ed0e40c.mo124851xcc313de3());
                }
            }
        }
        boolean z17 = true;
        this.f555034d.f554984f = true;
        if (this.f555036f) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f555034d.f554987i;
            if (c22849x81a93d252 != null) {
                c22849x81a93d252.removeAllViewsInLayout();
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f555034d.f554987i;
            if (c22849x81a93d253 != null && (m7957x4145728 = c22849x81a93d253.m7957x4145728()) != null) {
                m7957x4145728.a();
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f555034d.f554995t;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.f295250v.clear();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "clear Pool and RemoveAllViews");
            if (this.f555035e != null) {
                ((d73.i) i95.n0.c(d73.i.class)).wd(this.f555035e);
            }
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f555034d.f554995t;
        if (c22848x6ddd90cf2 != null) {
            c22848x6ddd90cf2.m8146xced61ae5();
        }
        if (this.f555037g) {
            this.f555034d.X6();
            if (this.f555034d.f554985g.size() == 1) {
                zk3.g0 g0Var2 = this.f555034d;
                g0Var2.d7(((uk3.a) g0Var2.f554985g.get(0)).f510057d, true, false);
            } else {
                this.f555034d.d7(null, true, false);
            }
        }
        if (this.f555038h && (c22849x81a93d25 = this.f555034d.f554987i) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c22849x81a93d25, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initDataUI$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
            c22849x81a93d25.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$initDataUI$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        java.util.List list2 = this.f555035e;
        if (list2 != null && !list2.isEmpty()) {
            z17 = false;
        }
        if (z17 && ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).Di()) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.Ff((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) c17, 6, null, 0, 6, null);
        }
        return jz5.f0.f384359a;
    }
}
