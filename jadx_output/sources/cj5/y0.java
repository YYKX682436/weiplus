package cj5;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f42278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f42278d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f42278d.getIntent().getBooleanExtra("need_show_expand_btn", false));
    }
}
