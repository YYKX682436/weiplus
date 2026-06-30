package j0;

/* loaded from: classes14.dex */
public final class c3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.j3 f377764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(j0.j3 j3Var) {
        super(1);
        this.f377764d = j3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        java.util.List it = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        a2.k1 k1Var = this.f377764d.f377915d.f377825e;
        if (k1Var != null) {
            it.add(k1Var);
            z17 = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
