package cj5;

/* loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f42217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f42217d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f42217d.getIntent().getIntExtra("key_confirm_menu_color", 0));
    }
}
