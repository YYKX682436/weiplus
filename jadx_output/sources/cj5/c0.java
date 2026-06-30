package cj5;

/* loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f42079d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(wi5.n0 n0Var) {
        super(1);
        this.f42079d = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList it = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.Iterator it6 = it.iterator();
        while (it6.hasNext()) {
            ((ri5.j) it6.next()).f396127x = this.f42079d.e();
        }
        return jz5.f0.f302826a;
    }
}
