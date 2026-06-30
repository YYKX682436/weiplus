package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at;

/* loaded from: classes.dex */
public final class c implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l f210411e;

    public c(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l lVar) {
        this.f210410d = view;
        this.f210411e = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f210410d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return true;
        }
        layoutParams.height = com.p314xaae8f345.mm.ui.bl.h(this.f210411e.getContext());
        return true;
    }
}
