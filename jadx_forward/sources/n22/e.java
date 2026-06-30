package n22;

/* loaded from: classes9.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f415818f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415819g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415820h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f415821i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f415822m;

    public e(int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, int i19, android.app.Activity activity, int i27) {
        this.f415816d = str;
        this.f415817e = str2;
        this.f415818f = i18;
        this.f415819g = str3;
        this.f415820h = str4;
        this.f415821i = i19;
        this.f415822m = activity;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        if (itemId != 1001) {
            if (itemId == 1000) {
                y12.k.a(this.f415822m, this.f415816d, this.f415817e, this.f415819g, ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ni().R(), com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.c(this.f415818f, this.f415816d, this.f415817e, this.f415819g, this.f415820h, this.f415821i, null), 12);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13224, 2, 1, "", java.lang.Integer.valueOf(this.f415818f));
                return;
            }
            return;
        }
        se5.a aVar = new se5.a();
        aVar.l(n13.v.f415673a.a(this.f415816d, this.f415817e, this.f415818f, this.f415819g, this.f415820h, this.f415821i, null));
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        n13.r rVar = new n13.r();
        rVar.f415650a = true;
        rVar.f415653d.f415672a = 5;
        ((dk5.b0) b0Var).Bi(this.f415822m, aVar, rVar);
    }
}
