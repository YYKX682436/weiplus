package cj4;

/* loaded from: classes11.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.a0 f123531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(cj4.a0 a0Var) {
        super(0);
        this.f123531d = a0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cj4.a0 a0Var = this.f123531d;
        android.view.View view = a0Var.L1;
        return java.lang.Integer.valueOf(view != null ? view.getHeight() : ym5.x.a(a0Var.w(), 40.0f));
    }
}
