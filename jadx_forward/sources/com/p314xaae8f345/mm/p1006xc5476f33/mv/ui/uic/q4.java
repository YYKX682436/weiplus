package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class q4 implements gm3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 f232916a;

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 v4Var) {
        this.f232916a = v4Var;
    }

    @Override // gm3.f
    public void a(int i17, gm3.c item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerFlexEditUIC", "OnDelBtnClicked, pos:" + i17 + ", type:" + item.f355077e);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 v4Var = this.f232916a;
        gm3.f fVar = v4Var.f233028o;
        if (fVar != null) {
            fVar.a(i17, item);
        }
        v4Var.f233024h.u(item);
        v4Var.f233024h.D();
    }
}
