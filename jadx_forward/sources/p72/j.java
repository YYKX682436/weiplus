package p72;

/* loaded from: classes8.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f434027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f434028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f434029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434030g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p72.k f434031h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o72.r2 r2Var, int i17, int i18, java.lang.String str, p72.k kVar) {
        super(0);
        this.f434027d = r2Var;
        this.f434028e = i17;
        this.f434029f = i18;
        this.f434030g = str;
        this.f434031h = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateDelInfo() called with: itemid = ");
        o72.r2 r2Var = this.f434027d;
        sb6.append(r2Var.f67643xc8a07680);
        sb6.append(", delType = ");
        int i17 = this.f434028e;
        sb6.append(i17);
        sb6.append(", delFlag = ");
        int i18 = this.f434029f;
        sb6.append(i18);
        sb6.append(", callMsg = ");
        java.lang.String str = this.f434030g;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDelMgr", sb6.toString());
        this.f434031h.d(r2Var, str, i17, i18);
        return jz5.f0.f384359a;
    }
}
