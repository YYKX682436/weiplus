package cj5;

/* loaded from: classes.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f123787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(wi5.n0 n0Var) {
        super(1);
        this.f123787d = n0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList it = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.Iterator it6 = it.iterator();
        while (it6.hasNext()) {
            ((ri5.j) it6.next()).f477660x = this.f123787d.e();
        }
        return jz5.f0.f384359a;
    }
}
