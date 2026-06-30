package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public final class h implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f252675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l f252676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f252677f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver f252678g;

    public h(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l lVar, java.lang.Object obj, android.view.ViewTreeObserver viewTreeObserver) {
        this.f252675d = view;
        this.f252676e = lVar;
        this.f252677f = obj;
        this.f252678g = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$triggerPreDraw$1$1$1$1");
        boolean isAttachedToWindow = this.f252675d.isAttachedToWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l lVar = this.f252676e;
        java.lang.Object i17 = lVar.i();
        java.lang.String j17 = lVar.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preDraw call: lastModel = ");
        java.lang.Object obj = this.f252677f;
        sb6.append(lVar.l(obj));
        sb6.append(" currentModel = ");
        sb6.append(lVar.l(i17));
        sb6.append(" onPreDrawListenerList.size = ");
        sb6.append(((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l.b(lVar)).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        java.util.List b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l.b(lVar);
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f> arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f) it.next());
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f fVar : arrayList) {
            fVar.a(isAttachedToWindow, obj, i17);
            ((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l.b(lVar)).remove(fVar);
        }
        this.f252678g.removeOnPreDrawListener(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$triggerPreDraw$1$1$1$1");
        return true;
    }
}
