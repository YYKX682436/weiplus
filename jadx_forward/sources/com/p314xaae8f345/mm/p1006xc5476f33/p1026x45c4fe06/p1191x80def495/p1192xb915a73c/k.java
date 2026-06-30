package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c;

/* loaded from: classes14.dex */
public class k implements android.view.ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnFocusChangeListener f170433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l f170434e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l lVar, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f170434e = lVar;
        this.f170433d = onFocusChangeListener;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l lVar = this.f170434e;
        this.f170433d.onFocusChange(lVar, io.p3284xd2ae381c.p3319x36f002.C28973x1922e4ec.m139425x7337df9a(lVar));
    }
}
