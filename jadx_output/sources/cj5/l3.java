package cj5;

/* loaded from: classes.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f42191d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f42191d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f42191d.getIntent().getBooleanExtra("need_show_multiSelect_bottom", false));
    }
}
