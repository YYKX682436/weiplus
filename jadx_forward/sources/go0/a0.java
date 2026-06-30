package go0;

/* loaded from: classes14.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f355266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f355267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f355268f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(int i17, int i18, go0.f0 f0Var) {
        super(0);
        this.f355266d = i17;
        this.f355267e = i18;
        this.f355268f = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f355267e;
        go0.f0 f0Var = this.f355268f;
        int i18 = this.f355266d;
        if (i18 <= 0 || i17 <= 0) {
            java.lang.String debugText = "updateDrawSize error:" + i18 + " *" + i17 + ", default:" + f0Var.e() + " x " + f0Var.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugText, "debugText");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", debugText);
            ft0.d dVar = f0Var.f355297m;
            if (dVar != null) {
                dVar.e(null, f0Var.e(), f0Var.d());
            }
        } else {
            java.lang.String debugText2 = "updateDrawSize:" + i18 + " x " + i17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugText2, "debugText");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", debugText2);
            ft0.d dVar2 = f0Var.f355297m;
            if (dVar2 != null) {
                dVar2.e(null, i18, i17);
            }
        }
        return jz5.f0.f384359a;
    }
}
