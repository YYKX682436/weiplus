package yj5;

/* loaded from: classes8.dex */
public final class p extends yj5.a {

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f544257f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.u9 f544258g = new com.p314xaae8f345.mm.ui.u9();

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.s9 f544259h = new yj5.m(this);

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f536418g;
        return xj5.a.f536424p;
    }

    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerInfo, "talkerInfo");
        java.util.HashSet hashSet = com.p314xaae8f345.mm.ui.u9.f292606d;
        java.util.LinkedList<oo0.a> D0 = ((oo0.e) ((v80.k) ((w80.i) i95.n0.c(w80.i.class))).wi()).D0(talkerInfo.f542275a);
        if (D0.size() <= 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (oo0.a aVar : D0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
            linkedList.add(new xj5.f(aVar));
        }
        this.f544257f = D0;
        return linkedList;
    }

    @Override // yj5.a
    public void n0() {
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.p(ui6, tipsBarContext, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        this.f544258g.f292607a = this.f280113d.x();
        com.p314xaae8f345.mm.ui.s9 s9Var = this.f544259h;
        java.util.HashSet hashSet = com.p314xaae8f345.mm.ui.u9.f292606d;
        if (hashSet != null) {
            hashSet.add(s9Var);
        }
        pm0.v.O("LiveTipsBarProcessor", new yj5.o(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        com.p314xaae8f345.mm.ui.s9 s9Var = this.f544259h;
        java.util.HashSet hashSet = com.p314xaae8f345.mm.ui.u9.f292606d;
        if (hashSet != null) {
            hashSet.remove(s9Var);
        }
        pm0.v.O("LiveTipsBarProcessor", new yj5.n(this));
    }
}
