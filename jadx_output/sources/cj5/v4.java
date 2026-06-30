package cj5;

/* loaded from: classes.dex */
public final class v4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f42259d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f42259d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f42259d.getIntent().getBooleanExtra("need_show_all_selected", false));
    }
}
