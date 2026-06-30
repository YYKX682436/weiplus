package fj5;

/* loaded from: classes.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.c0 f344775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fj5.e f344776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wi5.c0 c0Var, fj5.e eVar) {
        super(0);
        this.f344775d = c0Var;
        this.f344776e = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wi5.c0 c0Var = this.f344775d;
        if (!c0Var.f527815b.isEmpty()) {
            java.lang.String str = (java.lang.String) kz5.n0.X(c0Var.f527815b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Forward.ClawBotReturnUIC", "ClawBot selected: " + str);
            fj5.e eVar = this.f344776e;
            eVar.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", str);
            eVar.m158354x19263085().setResult(-1, intent);
            eVar.m158354x19263085().finish();
        }
        return jz5.f0.f384359a;
    }
}
