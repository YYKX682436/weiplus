package y43;

/* loaded from: classes2.dex */
public final class k implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f540886d;

    public k(java.lang.String str) {
        this.f540886d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        if (i17 == 0 && i18 == 0 && (fVar = oVar.f152244b.f152233a) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.luggage.game.GetUrlLiteConfResponse");
            o33.d dVar = (o33.d) fVar;
            java.util.LinkedList linkedList = dVar.f424264d;
            if (!(linkedList == null || linkedList.isEmpty())) {
                ((ku5.t0) ku5.t0.f394148d).g(new y43.j(dVar, this.f540886d));
            }
        }
        return 0;
    }
}
