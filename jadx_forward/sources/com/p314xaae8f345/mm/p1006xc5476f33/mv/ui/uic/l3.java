package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class l3 implements com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 f232802a;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var) {
        this.f232802a = h4Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.b
    public void a(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPageSettle: ");
        sb6.append(i17);
        sb6.append(", last ");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var = this.f232802a;
        sb6.append(h4Var.f232702p);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", sb6.toString());
        if (h4Var.f232702p == i17) {
            return;
        }
        h4Var.V6(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4.O6(h4Var, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g3 g3Var = h4Var.f232704r;
        if (g3Var != null) {
            java.lang.Object obj = h4Var.f232694e.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            fm3.q qVar = (fm3.q) obj;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.f232401u;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a Z6 = ((jm3.c0) g3Var).f381833a.Z6();
            if (Z6 != null) {
                Z6.p(false, qVar.f345641f - qVar.f345640e);
            }
        }
    }
}
