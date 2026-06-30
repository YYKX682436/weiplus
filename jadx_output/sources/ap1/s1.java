package ap1;

/* loaded from: classes5.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f12738d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(yz5.l lVar) {
        super(1);
        this.f12738d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        yz5.l lVar = this.f12738d;
        if (dVar != null && (dVar instanceof ap1.a)) {
            lVar.invoke(state);
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof ap1.h2)) {
            lVar.invoke(state);
        }
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof ap1.g2)) {
            lVar.invoke(state);
        }
        return jz5.f0.f302826a;
    }
}
