package yu4;

/* loaded from: classes8.dex */
public final class o implements yu4.p {

    /* renamed from: d, reason: collision with root package name */
    public final yu4.k f547439d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xi0 f547440e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f547441f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f547442g;

    /* renamed from: h, reason: collision with root package name */
    public final xu4.d f547443h;

    /* renamed from: i, reason: collision with root package name */
    public final xu4.h f547444i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d f547445m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f547446n;

    public o(yu4.k dialog, r45.xi0 homeContext, ur.l listener, android.view.View dialogView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialog, "dialog");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(homeContext, "homeContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dialogView, "dialogView");
        this.f547439d = dialog;
        this.f547440e = homeContext;
        this.f547441f = "MicroMsg.WebSearch.EmojiSearchMoreTab";
        this.f547442g = dialogView.findViewById(com.p314xaae8f345.mm.R.id.jrs);
        android.view.View findViewById = dialogView.findViewById(com.p314xaae8f345.mm.R.id.f567517js2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        xu4.d dVar = new xu4.d(this);
        this.f547443h = dVar;
        this.f547444i = new xu4.h(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d c19226x5a0e667d = new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d(H());
        this.f547445m = c19226x5a0e667d;
        c19226x5a0e667d.J0(new aw4.s(), new aw4.u(10));
        boolean z17 = this.f547440e.f471660s == 1;
        this.f547446n = z17;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.EmojiSearchMoreTab", "init: forceDarkMode");
            c19226x5a0e667d.setBackgroundColor(0);
            c19226x5a0e667d.getBackground().setAlpha(0);
            c19226x5a0e667d.mo120153xd15cf999().B(2);
        }
        c19226x5a0e667d.mo120128x74041feb(dVar, "emojiWebSearchJSApi");
        frameLayout.addView(c19226x5a0e667d);
    }

    @Override // aw4.p
    public void C4(java.lang.String query, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
    }

    @Override // yu4.p
    public void D(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        this.f547439d.E(id6);
    }

    @Override // aw4.q
    public android.content.Context H() {
        android.content.Context context = this.f547439d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return context;
    }

    @Override // yu4.p
    public void O2(r45.sn3 shareContent, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareContent, "shareContent");
        this.f547439d.D(shareContent, str);
    }

    @Override // aw4.q
    public aw4.l b() {
        return this.f547443h;
    }

    @Override // yu4.p
    public void b4(r45.lw5 emoticon, r45.rn3 request, byte[] bArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emoticon, "emoticon");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        this.f547439d.F(emoticon, request, bArr);
    }

    @Override // aw4.q
    public aw4.a c() {
        return this.f547444i;
    }

    @Override // yu4.p
    public void g5(r45.xi0 moreContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moreContext, "moreContext");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f547441f, "start to load url %s", this.f547440e.f471651g);
        this.f547445m.mo32265x141096a9(this.f547440e.f471651g);
        android.view.View view = this.f547442g;
        if (view.getX() == 0.0f) {
            view.setX(i65.a.B(H()));
        }
        view.animate().translationX(0.0f).setStartDelay(200L).setDuration(300L).start();
        android.view.View view2 = this.f547442g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/websearch/emojisearch/ui/EmojiSearchMoreTab", "startMoreTab", "(Lcom/tencent/mm/protocal/protobuf/EmojiSearchHomeContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/websearch/emojisearch/ui/EmojiSearchMoreTab", "startMoreTab", "(Lcom/tencent/mm/protocal/protobuf/EmojiSearchHomeContext;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // av4.j
    /* renamed from: getWebView */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3() {
        return this.f547445m;
    }

    @Override // aw4.q
    /* renamed from: hideVKB */
    public void mo9205x36654fab() {
    }

    @Override // aw4.q
    public java.lang.Object m4() {
        return this.f547440e;
    }

    @Override // aw4.q
    /* renamed from: showVKB */
    public void mo9206x7b383410() {
    }

    @Override // aw4.o, aw4.q
    public aw4.w b() {
        return this.f547443h;
    }

    @Override // aw4.o, aw4.q
    public aw4.v c() {
        return this.f547444i;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.b0 b() {
        return this.f547443h;
    }

    @Override // aw4.p, aw4.o, aw4.q
    public aw4.y c() {
        return this.f547444i;
    }

    @Override // yu4.p, aw4.p, aw4.o, aw4.q
    public xu4.d b() {
        return this.f547443h;
    }

    @Override // yu4.p, aw4.p, aw4.o, aw4.q
    public xu4.h c() {
        return this.f547444i;
    }
}
