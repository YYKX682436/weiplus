package hv4;

/* loaded from: classes8.dex */
public final class o implements hv4.b {

    /* renamed from: d, reason: collision with root package name */
    public final hv4.l f366859d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ck6 f366860e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f366861f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f366862g;

    /* renamed from: h, reason: collision with root package name */
    public final gv4.a f366863h;

    /* renamed from: i, reason: collision with root package name */
    public final gv4.e f366864i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d f366865m;

    public o(hv4.l dialog, r45.ck6 homeContext, hv4.a listener, android.view.View dialogView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(homeContext, "homeContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialogView, "dialogView");
        this.f366859d = dialog;
        this.f366860e = homeContext;
        this.f366861f = "MicroMsg.WebSearch.TagSearchMoreTab";
        this.f366862g = dialogView.findViewById(com.p314xaae8f345.mm.R.id.jrs);
        android.view.View findViewById = dialogView.findViewById(com.p314xaae8f345.mm.R.id.f567517js2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        gv4.a aVar = new gv4.a(this);
        this.f366863h = aVar;
        this.f366864i = new gv4.e(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d c19226x5a0e667d = new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d(H());
        this.f366865m = c19226x5a0e667d;
        c19226x5a0e667d.J0(new aw4.s(), new aw4.u(6));
        c19226x5a0e667d.mo120128x74041feb(aVar, "tagWebSearchJSApi");
        ((android.widget.FrameLayout) findViewById).addView(c19226x5a0e667d);
    }

    @Override // aw4.p
    public void C4(java.lang.String query, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
    }

    @Override // hv4.b
    public void D(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        this.f366859d.F(id6);
    }

    @Override // aw4.q
    public android.content.Context H() {
        android.content.Context context = this.f366859d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }

    @Override // hv4.b
    public void M5(r45.sn3 shareContent, android.graphics.Bitmap bitmap, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareContent, "shareContent");
        this.f366859d.D(shareContent, bitmap, str);
    }

    @Override // hv4.b
    public void a5(java.lang.String tag, java.lang.String sessionId, java.lang.String searchId, java.lang.String requestId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchId, "searchId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
    }

    @Override // aw4.q
    public aw4.l b() {
        return this.f366863h;
    }

    @Override // aw4.q
    public aw4.a c() {
        return this.f366864i;
    }

    @Override // av4.j
    /* renamed from: getWebView */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3() {
        return this.f366865m;
    }

    @Override // aw4.q
    /* renamed from: hideVKB */
    public void mo9205x36654fab() {
    }

    @Override // aw4.q
    public java.lang.Object m4() {
        return this.f366860e;
    }

    @Override // hv4.b
    public void r1(r45.ck6 moreContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moreContext, "moreContext");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f366861f, "start to load url %s", this.f366860e.f453158g);
        this.f366865m.mo32265x141096a9(this.f366860e.f453158g);
        android.view.View view = this.f366862g;
        if (view.getX() == 0.0f) {
            view.setX(i65.a.B(H()));
        }
        view.animate().translationX(0.0f).setStartDelay(200L).setDuration(300L).start();
        android.view.View view2 = this.f366862g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/websearch/tagsearch/ui/TagSearchMoreTab", "startMoreTab", "(Lcom/tencent/mm/protocal/protobuf/TagSearchHomeContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/websearch/tagsearch/ui/TagSearchMoreTab", "startMoreTab", "(Lcom/tencent/mm/protocal/protobuf/TagSearchHomeContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // aw4.q
    /* renamed from: showVKB */
    public void mo9206x7b383410() {
    }

    @Override // aw4.o, aw4.q
    public aw4.w b() {
        return this.f366863h;
    }

    @Override // aw4.o, aw4.q
    public aw4.v c() {
        return this.f366864i;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.b0 b() {
        return this.f366863h;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.y c() {
        return this.f366864i;
    }

    @Override // hv4.b, aw4.p, aw4.o, aw4.q
    public gv4.a b() {
        return this.f366863h;
    }

    @Override // hv4.b, aw4.p, aw4.o, aw4.q
    public gv4.e c() {
        return this.f366864i;
    }
}
