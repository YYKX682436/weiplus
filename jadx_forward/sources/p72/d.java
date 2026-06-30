package p72;

/* loaded from: classes8.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f434013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f434014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f434015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434016g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p72.e f434017h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o72.r2 r2Var, int i17, int i18, java.lang.String str, p72.e eVar) {
        super(0);
        this.f434013d = r2Var;
        this.f434014e = i17;
        this.f434015f = i18;
        this.f434016g = str;
        this.f434017h = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateDelInfo() called with: itemid = ");
        o72.r2 r2Var = this.f434013d;
        sb6.append(r2Var.f67643xc8a07680);
        sb6.append(", delType = ");
        int i17 = this.f434014e;
        sb6.append(i17);
        sb6.append(", delFlag = ");
        int i18 = this.f434015f;
        sb6.append(i18);
        sb6.append(", callMsg = ");
        java.lang.String str = this.f434016g;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDelMgr", sb6.toString());
        this.f434017h.d(r2Var, str, i17, i18);
        return jz5.f0.f384359a;
    }
}
