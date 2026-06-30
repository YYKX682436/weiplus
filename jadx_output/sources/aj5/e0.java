package aj5;

/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f5419d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f5419d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f5419d.getIntent().getBooleanExtra("default_multi_search", false));
    }
}
