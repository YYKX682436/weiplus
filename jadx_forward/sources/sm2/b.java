package sm2;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.f f490896d;

    public b(sm2.f fVar) {
        this.f490896d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rl2.i iVar = (rl2.i) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).f148530u).mo141623x754a37bb();
        java.lang.String liveId = java.lang.String.valueOf(((mm2.e1) ((mm2.c1) this.f490896d.c(mm2.c1.class)).m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
        iVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveId, "liveId");
        iVar.f478731e.A("FinderLiveLastRewardInfo", "DELETE FROM FinderLiveLastRewardInfo WHERE liveId = '" + liveId + '\'');
    }
}
