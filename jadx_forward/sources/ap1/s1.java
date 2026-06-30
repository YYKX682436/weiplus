package ap1;

/* loaded from: classes5.dex */
public final class s1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f94271d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(yz5.l lVar) {
        super(1);
        this.f94271d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        yz5.l lVar = this.f94271d;
        if (dVar != null && (dVar instanceof ap1.a)) {
            lVar.mo146xb9724478(state);
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof ap1.h2)) {
            lVar.mo146xb9724478(state);
        }
        j75.d dVar3 = state.f379599d;
        if (dVar3 != null && (dVar3 instanceof ap1.g2)) {
            lVar.mo146xb9724478(state);
        }
        return jz5.f0.f384359a;
    }
}
