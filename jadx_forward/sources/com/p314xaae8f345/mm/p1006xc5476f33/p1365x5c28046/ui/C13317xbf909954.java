package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiSortFragment */
/* loaded from: classes15.dex */
public class C13317xbf909954 extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 implements l75.q0, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f179361q = 0;

    /* renamed from: d, reason: collision with root package name */
    public i12.k f179362d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 f179363e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0 f179364f;

    /* renamed from: g, reason: collision with root package name */
    public z12.z f179365g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.Vibrator f179366h;

    /* renamed from: i, reason: collision with root package name */
    public int f179367i;

    /* renamed from: m, reason: collision with root package name */
    public android.app.ProgressDialog f179368m;

    /* renamed from: n, reason: collision with root package name */
    public final vl5.o f179369n;

    /* renamed from: o, reason: collision with root package name */
    public final vl5.i f179370o;

    /* renamed from: p, reason: collision with root package name */
    public final vl5.s f179371p;

    public C13317xbf909954(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.e0 e0Var) {
        super(true);
        this.f179369n = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.g3(this);
        this.f179370o = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.h3(this);
        this.f179371p = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.i3(this);
        this.f179364f = e0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutId */
    public int getF153758d() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a7f;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().add(this);
        gm0.j1.n().f354821b.a(717, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().mo49775xc84af884(this);
        gm0.j1.n().f354821b.q(717, this);
        super.mo7504xac79a11b();
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        i12.k kVar;
        if (str == null || !str.equals("event_update_group") || (kVar = this.f179362d) == null) {
            return;
        }
        kVar.f368755f.mo54784x6761d4f();
        kVar.notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var != this.f179365g) {
            return;
        }
        android.app.ProgressDialog progressDialog = this.f179368m;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            db5.e1.t(mo7438x76847179(), m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.by9), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.j3(this));
            return;
        }
        this.f179364f.d();
        if (mo7430x19263085() != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sortRet", 0);
            mo7430x19263085().setResult(-1, intent);
        }
        mo78641xb4098c93();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        super.mo7518x594b1124(view, bundle);
        mo78682x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.d3(this));
        mo78695xbf7c1df6(m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.iql));
        m78633xd9193382(0, m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.e3(this));
        ((android.widget.TextView) mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.ddw)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.byy);
        this.f179366h = (android.os.Vibrator) mo7438x76847179().getSystemService("vibrator");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395) mo26077x4ff8c0f0(android.R.id.list);
        this.f179363e = c22722xd3be5395;
        c22722xd3be5395.m82185x4578645(this.f179369n);
        this.f179363e.m82189xa7c1925a(this.f179371p);
        this.f179363e.m82181x71eb6f8a(this.f179370o);
        i12.k kVar = new i12.k(mo7438x76847179(), this.f179364f);
        this.f179362d = kVar;
        this.f179363e.setAdapter((android.widget.ListAdapter) kVar);
    }
}
