package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class p5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 f232890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm3.q f232891e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var, fm3.q qVar) {
        super(0);
        this.f232890d = z5Var;
        this.f232891e = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kk4.b player;
        kk4.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var = this.f232890d;
        kk4.d dVar = z5Var.f233112r;
        long mo100917x37a7fa50 = (dVar == null || (player = dVar.getPlayer()) == null || (cVar = ((kk4.v) player).f390110b) == null) ? 0L : ((kk4.f0) cVar).mo100917x37a7fa50();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "setVideoDuration: origin:" + z5Var.f233114t + ", player:" + mo100917x37a7fa50);
        if (mo100917x37a7fa50 > 0 && z5Var.f233114t != mo100917x37a7fa50) {
            fm3.o oVar = this.f232891e.f345646n;
            if (oVar != null) {
                oVar.c(mo100917x37a7fa50);
            }
            z5Var.f233114t = mo100917x37a7fa50;
            int childCount = z5Var.Q6().getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16682xd79fb962 c16682xd79fb962 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16682xd79fb962) z5Var.Q6().getChildAt(i17);
                if (c16682xd79fb962 != null) {
                    java.lang.Object obj = z5Var.P6().f233059d.get(z5Var.Q6().u0(c16682xd79fb962));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    kp4.a aVar = (kp4.a) obj;
                    aVar.f392609f = (z5Var.f233116v * ((float) z5Var.f233114t)) / (((z5Var.C * 1.0f) / aVar.f392605b) * aVar.f392604a);
                    aVar.f();
                    c16682xd79fb962.m67303x873c5e57(aVar);
                    c16682xd79fb962.requestLayout();
                }
            }
        }
        z5Var.T6().setVisibility(4);
        kk4.d dVar2 = z5Var.f233112r;
        if (dVar2 != null) {
            dVar2.mo71993xabb6f01d(null);
        }
        return jz5.f0.f384359a;
    }
}
