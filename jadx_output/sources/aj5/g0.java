package aj5;

/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aj5.r0 f5430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(aj5.r0 r0Var) {
        super(1);
        this.f5430d = r0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            state.f446320p.addAll((java.util.HashSet) ((jz5.n) this.f5430d.f5507h).getValue());
        }
        return jz5.f0.f302826a;
    }
}
