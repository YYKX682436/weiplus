package cj5;

/* loaded from: classes.dex */
public final class m4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f123729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj5.q4 f123730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, cj5.q4 q4Var) {
        super(0);
        this.f123729d = activityC0065xcd7aa112;
        this.f123730e = q4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f123729d.getIntent().getStringExtra("key_confirm_menu_name");
        return stringExtra == null ? this.f123730e.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5) : stringExtra;
    }
}
