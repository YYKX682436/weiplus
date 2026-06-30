package ap1;

/* loaded from: classes5.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em.c4 f12742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(em.c4 c4Var) {
        super(1);
        this.f12742d = c4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        kotlin.jvm.internal.o.g(state, "state");
        java.util.HashSet hashSet = state.f12630n;
        int size = hashSet.size();
        em.c4 c4Var = this.f12742d;
        if (size <= 0 || hashSet.size() != state.f12629m.size()) {
            c4Var.e().setText(com.tencent.mm.R.string.f490681a75);
        } else {
            c4Var.e().setText(com.tencent.mm.R.string.a76);
        }
        return jz5.f0.f302826a;
    }
}
