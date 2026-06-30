package j0;

/* loaded from: classes14.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f377742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(j0.c5 c5Var) {
        super(1);
        this.f377742d = c5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        java.util.List it = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        j0.d5 d5Var = this.f377742d.f377772g;
        if (d5Var != null) {
            it.add(d5Var.f377798a);
            z17 = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
