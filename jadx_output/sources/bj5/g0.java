package bj5;

/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.k0 f21185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f21186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(bj5.k0 k0Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f21185d = k0Var;
        this.f21186e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f21185d.getIntent().getStringExtra("label_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return new j93.n1(this.f21186e, stringExtra);
    }
}
