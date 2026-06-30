package cj5;

/* loaded from: classes.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f42226d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(cj5.l2 l2Var) {
        super(2);
        this.f42226d = l2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        androidx.recyclerview.widget.k3 holder = (androidx.recyclerview.widget.k3) obj2;
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f42226d.c7(booleanValue);
        return jz5.f0.f302826a;
    }
}
