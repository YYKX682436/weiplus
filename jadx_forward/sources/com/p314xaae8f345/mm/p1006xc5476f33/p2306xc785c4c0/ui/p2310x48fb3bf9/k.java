package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes8.dex */
public class k extends aw4.u {

    /* renamed from: e, reason: collision with root package name */
    public final r45.in6 f256746e;

    public k(r45.in6 in6Var) {
        super(1);
        this.f256746e = in6Var;
    }

    @Override // aw4.u, com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewClient", "onPageFinished %s  %d", str, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        super.n(c27816xac2547f9, str);
        wm4.u.b(this.f256746e, "pageFinish", java.lang.System.currentTimeMillis());
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, android.graphics.Bitmap bitmap) {
        wm4.u.b(this.f256746e, "pageStart", java.lang.System.currentTimeMillis());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewClient", "onPageStarted %s %d", str, java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
    }
}
