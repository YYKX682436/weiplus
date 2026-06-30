package cj5;

/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f42224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj5.d1 f42225e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.appcompat.app.AppCompatActivity appCompatActivity, cj5.d1 d1Var) {
        super(0);
        this.f42224d = appCompatActivity;
        this.f42225e = d1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f42224d.getIntent().getStringExtra("key_confirm_menu_name");
        return stringExtra == null ? this.f42225e.getString(com.tencent.mm.R.string.f490441v5) : stringExtra;
    }
}
