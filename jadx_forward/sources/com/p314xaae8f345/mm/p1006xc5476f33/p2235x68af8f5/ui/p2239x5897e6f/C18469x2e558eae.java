package com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2239x5897e6f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumUI;", "Lcom/tencent/mm/ui/MMFragment;", "Lcf4/b;", "<init>", "()V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.story.ui.album.StoryAlbumUI */
/* loaded from: classes4.dex */
public final class C18469x2e558eae extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 implements cf4.b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f253400m = 0;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f253401d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f253402e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f253403f;

    /* renamed from: g, reason: collision with root package name */
    public qf4.f f253404g;

    /* renamed from: h, reason: collision with root package name */
    public cf4.a f253405h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f253406i = "";

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: dealContentView */
    public void mo26076x2105eeb2(android.view.View v17) {
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        super.mo26076x2105eeb2(v17);
        this.f253405h = new lf4.g(this);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        java.lang.String stringExtra = (mo7430x19263085 == null || (intent = mo7430x19263085.getIntent()) == null) ? null : intent.getStringExtra(dm.i4.f66875xa013b0d5);
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f253406i = stringExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAlbumUI", "initViews username=" + this.f253406i);
        android.view.View findViewById = v17.findViewById(com.p314xaae8f345.mm.R.id.f564444rk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f253401d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        android.view.View findViewById2 = v17.findViewById(com.p314xaae8f345.mm.R.id.f564447rn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = v17.findViewById(com.p314xaae8f345.mm.R.id.f564347ol);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = v17.findViewById(com.p314xaae8f345.mm.R.id.f564448ro);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = v17.findViewById(com.p314xaae8f345.mm.R.id.f564348om);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.view.View findViewById6 = v17.findViewById(com.p314xaae8f345.mm.R.id.f564443rj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f253402e = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = v17.findViewById(com.p314xaae8f345.mm.R.id.f564442ri);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f253403f = findViewById7;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById7, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/album/StoryAlbumUI", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById7, "com/tencent/mm/plugin/story/ui/album/StoryAlbumUI", "initViews", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        qf4.f fVar = new qf4.f();
        this.f253404g = fVar;
        fVar.f444232o = new qf4.n(this);
        fVar.f444233p = qf4.o.f444245d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f253401d;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        c1163xf1deaba4.mo7960x6cab2c8d(fVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f253401d;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo7430x19263085()));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f253401d;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        c1163xf1deaba43.i(new qf4.p(this));
        cf4.a aVar = this.f253405h;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPresenter");
            throw null;
        }
        java.lang.String userName = this.f253406i;
        lf4.g gVar = (lf4.g) aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        gVar.f399928e = userName;
        gVar.a(gVar.f399931h);
        gm0.j1.n().f354821b.a(191, gVar);
        gm0.j1.n().f354821b.a(3926, gVar);
        gm0.j1.n().f354821b.a(764, gVar);
        cf4.a aVar2 = this.f253405h;
        if (aVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPresenter");
            throw null;
        }
        ef4.v vVar = ef4.w.f334001t;
        vVar.l().mo50293x3498a0(new lf4.b((lf4.g) aVar2));
        cf4.a aVar3 = this.f253405h;
        if (aVar3 != null) {
            vVar.l().mo50293x3498a0(new lf4.c((lf4.g) aVar3));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPresenter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutId */
    public int getF153758d() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571076cw5;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo7496x9d4787cb(i17, i18, intent);
        if (i17 == 1) {
            cf4.a aVar = this.f253405h;
            if (aVar != null) {
                ef4.w.f334001t.l().mo50293x3498a0(new lf4.b((lf4.g) aVar));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPresenter");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        mo78694xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571517hg);
        mo78682x9c8c0d33(new qf4.m(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        cf4.a aVar = this.f253405h;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPresenter");
            throw null;
        }
        lf4.g gVar = (lf4.g) aVar;
        gm0.j1.n().f354821b.q(191, gVar);
        gm0.j1.n().f354821b.q(3926, gVar);
        gm0.j1.n().f354821b.q(764, gVar);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo25471x430f73e() {
        return false;
    }
}
