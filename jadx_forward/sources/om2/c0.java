package om2;

/* loaded from: classes10.dex */
public final class c0 extends om2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final om2.o f427813a;

    /* renamed from: b, reason: collision with root package name */
    public final om2.o f427814b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.ia4 f427815c;

    public c0(om2.o songInfo, om2.o oVar, r45.ia4 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f427813a = songInfo;
        this.f427814b = oVar;
        this.f427815c = state;
    }

    @Override // om2.d0
    public boolean a(om2.d0 newState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        if (om2.c0.class != newState.getClass()) {
            return true;
        }
        om2.o oVar = this.f427813a;
        boolean z17 = oVar.f427899g;
        om2.o oVar2 = ((om2.c0) newState).f427813a;
        return (z17 == oVar2.f427899g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oVar.f427894b, oVar2.f427894b)) ? false : true;
    }
}
