package gl5;

/* loaded from: classes5.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f354588d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(gl5.d1 d1Var) {
        super(0);
        this.f354588d = d1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gl5.d1 d1Var = this.f354588d;
        android.view.View findViewById = d1Var.e().findViewById(com.p314xaae8f345.mm.R.id.f565021b04);
        findViewById.setOnClickListener(new gl5.n0(d1Var));
        return findViewById;
    }
}
