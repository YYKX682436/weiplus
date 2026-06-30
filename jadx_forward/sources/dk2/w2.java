package dk2;

/* loaded from: classes.dex */
public final class w2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f315804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f315805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.o12 f315806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315807h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.hx0 f315808i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315809m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(int i17, int i18, yz5.q qVar, r45.o12 o12Var, java.lang.String str, r45.hx0 hx0Var, dk2.r4 r4Var) {
        super(0);
        this.f315803d = i17;
        this.f315804e = i18;
        this.f315805f = qVar;
        this.f315806g = o12Var;
        this.f315807h = str;
        this.f315808i = hx0Var;
        this.f315809m = r4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f315803d;
        r45.o12 o12Var = this.f315806g;
        yz5.q qVar = this.f315805f;
        if (i17 == 0 && this.f315804e == 0) {
            if (qVar != null) {
                qVar.mo147xb9724478(java.lang.Boolean.TRUE, "", o12Var);
            }
        } else if (qVar != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            java.lang.String str = this.f315807h;
            qVar.mo147xb9724478(bool, str != null ? str : "", o12Var);
        }
        r45.hx0 hx0Var = this.f315808i;
        if (hx0Var.m75939xb282bd08(0) == 106) {
            r45.l12 l12Var = new r45.l12();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = hx0Var.m75934xbce7f2f(1);
            l12Var.mo11468x92b714fd(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
            ((ws2.j2) this.f315809m.m(ws2.j2.class)).f530594h.remove(java.lang.Long.valueOf(l12Var.m75942xfb822ef2(0)));
        }
        return jz5.f0.f384359a;
    }
}
