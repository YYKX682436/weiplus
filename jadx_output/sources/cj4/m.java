package cj4;

/* loaded from: classes11.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.a0 f41998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(cj4.a0 a0Var) {
        super(0);
        this.f41998d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cj4.a0 a0Var = this.f41998d;
        android.view.View view = a0Var.L1;
        return java.lang.Integer.valueOf(view != null ? view.getHeight() : ym5.x.a(a0Var.w(), 40.0f));
    }
}
