package bj5;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.c0 f21165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(bj5.c0 c0Var) {
        super(0);
        this.f21165d = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f21165d.getIntent().getIntExtra("key_label_click_source", 0));
    }
}
