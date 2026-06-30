package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public final class i implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l f252690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f252691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f252692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f252693g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f252694h;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l lVar, android.view.View view, java.lang.Object obj, p3325xe03a0797.p3326xc267989b.y0 y0Var, java.lang.Object obj2) {
        this.f252690d = lVar;
        this.f252691e = view;
        this.f252692f = obj;
        this.f252693g = y0Var;
        this.f252694h = obj2;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$triggerPreDraw$1$1$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$triggerPreDraw$1$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l lVar = this.f252690d;
        java.lang.String j17 = lVar.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attachedFlow call at=");
        sb6.append(booleanValue);
        sb6.append(" view=");
        android.view.View view = this.f252691e;
        sb6.append(view.isAttachedToWindow());
        sb6.append(" model=");
        sb6.append(lVar.l(this.f252692f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        if (booleanValue && view.isAttachedToWindow()) {
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.h(view, lVar, this.f252694h, viewTreeObserver));
            p3325xe03a0797.p3326xc267989b.z0.e(this.f252693g, null, 1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$triggerPreDraw$1$1$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$triggerPreDraw$1$1$1");
        return f0Var;
    }
}
