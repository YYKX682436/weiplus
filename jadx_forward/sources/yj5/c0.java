package yj5;

/* loaded from: classes5.dex */
public final class c0 extends yj5.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f544241f = "TopMsg.TopMsgTipsBarProcessor";

    /* renamed from: g, reason: collision with root package name */
    public final o75.a f544242g = new yj5.b0(this);

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f536418g;
        return xj5.a.f536420i;
    }

    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerInfo, "talkerInfo");
        ak5.g0 g0Var = (ak5.g0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c6.class));
        java.lang.String str = talkerInfo.f542275a;
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.db> Ri = g0Var.Ri(str);
        if (((java.util.LinkedList) Ri).size() <= 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (com.p314xaae8f345.mm.p2621x8fb0427b.db dbVar : Ri) {
            if (!dbVar.v0()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str, dbVar.w0().f454138f);
                if (o27 != null) {
                    linkedList.add(new xj5.n(dbVar, o27));
                }
            }
        }
        return linkedList;
    }

    @Override // yj5.a
    public void n0() {
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.e0(ui6, tipsBarContext, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        dm.kb.f319657t.m127126x9d92d11c(this.f280113d.f542250l, this.f544242g);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        dm.kb.f319657t.mo127128xb5bdeb7a(this.f544242g);
    }
}
