package bn1;

/* loaded from: classes14.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bn1.c0 f104371d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(bn1.c0 c0Var) {
        super(1);
        this.f104371d = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bn1.v it = (bn1.v) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        bn1.c0 c0Var = this.f104371d;
        java.util.Iterator it6 = c0Var.f104330o.iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a) it6.next()).b();
        }
        c0Var.f104330o.clear();
        return jz5.f0.f384359a;
    }
}
