package al1;

/* loaded from: classes7.dex */
public final class u extends al1.q {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f87346i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f87347m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f87348n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, java.util.Map params, yz5.l onViewCreated) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onViewCreated, "onViewCreated");
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.dm9, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.fg9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        m2261x764b6bfb((android.widget.ImageView) findViewById);
        m2264x6ae74eb9(onViewCreated);
        this.f87346i = java.lang.String.valueOf(params.get("key_appid"));
        this.f87347m = java.lang.String.valueOf(params.get("key_page_path"));
        this.f87348n = java.lang.String.valueOf(params.get("key_session_buffer"));
        a(java.lang.String.valueOf(params.get("key_img_url")), false);
        a(java.lang.String.valueOf(params.get("key_img_url_dark")), true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j2 j2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j2) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j2.class);
        java.lang.String str = this.f87346i;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appId");
            throw null;
        }
        java.lang.String str2 = this.f87347m;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pagePath");
            throw null;
        }
        java.lang.String str3 = this.f87348n;
        if (str3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sessionBuffer");
            throw null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.a) j2Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.f(str, str2, str3, 1, 1);
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j2 j2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j2) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j2.class);
        java.lang.String str = this.f87346i;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appId");
            throw null;
        }
        java.lang.String str2 = this.f87347m;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pagePath");
            throw null;
        }
        java.lang.String str3 = this.f87348n;
        if (str3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sessionBuffer");
            throw null;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.a) j2Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.f(str, str2, str3, 2, 1);
        return super.onTouchEvent(motionEvent);
    }
}
