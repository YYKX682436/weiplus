package ap1;

/* loaded from: classes5.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em.c4 f94275d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(em.c4 c4Var) {
        super(1);
        this.f94275d = c4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        java.util.HashSet hashSet = state.f94163n;
        int size = hashSet.size();
        em.c4 c4Var = this.f94275d;
        if (size <= 0 || hashSet.size() != state.f94162m.size()) {
            c4Var.e().setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572214a75);
        } else {
            c4Var.e().setText(com.p314xaae8f345.mm.R.C30867xcad56011.a76);
        }
        return jz5.f0.f384359a;
    }
}
