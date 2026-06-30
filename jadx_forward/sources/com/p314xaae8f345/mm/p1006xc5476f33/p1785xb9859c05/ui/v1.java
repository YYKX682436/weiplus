package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes14.dex */
public class v1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f224572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f2 f224573e;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f2 f2Var, android.view.View view) {
        this.f224573e = f2Var;
        this.f224572d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f224572d;
        view.getWindowVisibleDisplayFrame(rect);
        if (view.getRootView().getHeight() - (rect.bottom - rect.top) > 100) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f2 f2Var = this.f224573e;
            f2Var.f224343i.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.w1(f2Var), 100L);
        }
    }
}
