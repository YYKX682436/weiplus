package cj5;

/* loaded from: classes.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f42196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj5.q4 f42197e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(androidx.appcompat.app.AppCompatActivity appCompatActivity, cj5.q4 q4Var) {
        super(0);
        this.f42196d = appCompatActivity;
        this.f42197e = q4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f42196d.getIntent().getStringExtra("key_confirm_menu_name");
        return stringExtra == null ? this.f42197e.getString(com.tencent.mm.R.string.f490441v5) : stringExtra;
    }
}
