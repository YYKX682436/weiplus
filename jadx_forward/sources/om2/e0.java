package om2;

/* loaded from: classes10.dex */
public final class e0 extends om2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final om2.o f427832a;

    /* renamed from: b, reason: collision with root package name */
    public final om2.p f427833b;

    public e0(om2.o songInfo, om2.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        this.f427832a = songInfo;
        this.f427833b = pVar;
    }

    @Override // om2.d0
    public boolean a(om2.d0 newState) {
        r45.xn1 xn1Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        r45.xn1 xn1Var2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        if (om2.e0.class != newState.getClass()) {
            return true;
        }
        om2.e0 e0Var = (om2.e0) newState;
        java.lang.String str = null;
        om2.o oVar = this.f427832a;
        java.lang.String m76197x6c03c64c = (oVar == null || (xn1Var2 = oVar.f427894b) == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76197x6c03c64c();
        om2.o oVar2 = e0Var.f427832a;
        if (oVar2 != null && (xn1Var = oVar2.f427894b) != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null) {
            str = c19782x23db1cfa.m76197x6c03c64c();
        }
        return (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m76197x6c03c64c, str) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427833b, e0Var.f427833b)) ? false : true;
    }
}
