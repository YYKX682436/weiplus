package t22;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f496626a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f496627b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.m5 f496628c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f496629d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f496630e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f496631f;

    /* renamed from: g, reason: collision with root package name */
    public final t22.j f496632g;

    public l(android.content.Context context, java.lang.String url, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.m5 onResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onResult, "onResult");
        this.f496626a = context;
        this.f496627b = url;
        this.f496628c = onResult;
        this.f496629d = "MicroMsg.CheckStickerDownload";
        java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571913td);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.f496631f = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, string, true, 0, new t22.k(this));
        t22.j jVar = new t22.j(this);
        this.f496632g = jVar;
        u85.i iVar = u85.i.f507240a;
        iVar.e(jVar);
        com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1 c21046x5cf452f1 = new com.p314xaae8f345.mm.p2618x8f55093d.p2619xbe953013.C21046x5cf452f1(1);
        c21046x5cf452f1.f275227i = url;
        iVar.d(c21046x5cf452f1);
    }

    public final void a(boolean z17) {
        this.f496631f.dismiss();
        u85.i.f507240a.f(this.f496632g);
        this.f496628c.a(z17);
    }
}
