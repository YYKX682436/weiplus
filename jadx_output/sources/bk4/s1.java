package bk4;

/* loaded from: classes9.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f21557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(bk4.c2 c2Var) {
        super(1);
        this.f21557d = c2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.CharSequence text = (java.lang.CharSequence) obj;
        kotlin.jvm.internal.o.g(text, "text");
        bk4.c2 c2Var = this.f21557d;
        c2Var.f21421l = text;
        c2Var.f21410a.getLayout();
        return jz5.f0.f302826a;
    }
}
