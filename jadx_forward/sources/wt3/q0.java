package wt3;

/* loaded from: classes5.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt3.t0 f531011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(wt3.t0 t0Var) {
        super(3);
        this.f531011d = t0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.util.LinkedList it = (java.util.LinkedList) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        wt3.t0 t0Var = this.f531011d;
        t0Var.f530938n = false;
        yz5.q qVar = t0Var.f531032t;
        if (qVar != null) {
            qVar.mo147xb9724478(it, java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(booleanValue2));
        }
        return jz5.f0.f384359a;
    }
}
