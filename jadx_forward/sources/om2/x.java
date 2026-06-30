package om2;

/* loaded from: classes10.dex */
public final class x extends om2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final om2.o f427921a;

    public x(om2.o songInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        this.f427921a = songInfo;
    }

    @Override // om2.d0
    public boolean a(om2.d0 newState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        if (om2.x.class != newState.getClass()) {
            return true;
        }
        om2.x xVar = (om2.x) newState;
        om2.o oVar = this.f427921a;
        r45.xn1 xn1Var = oVar != null ? oVar.f427894b : null;
        om2.o oVar2 = xVar.f427921a;
        return (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xn1Var, oVar2 != null ? oVar2.f427894b : null) && oVar.f427899g == xVar.f427921a.f427899g) ? false : true;
    }
}
