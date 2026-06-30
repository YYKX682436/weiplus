package cj4;

/* loaded from: classes11.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.a0 f42052d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(cj4.a0 a0Var) {
        super(0);
        this.f42052d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cj4.a0 a0Var = this.f42052d;
        return java.lang.Integer.valueOf(ym5.x.a(a0Var.w(), 32.0f) + com.tencent.mm.ui.bk.p(a0Var.w()));
    }
}
