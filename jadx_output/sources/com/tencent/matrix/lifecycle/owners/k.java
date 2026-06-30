package com.tencent.matrix.lifecycle.owners;

/* loaded from: classes12.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f52754d;

    public k(com.tencent.matrix.lifecycle.owners.l lVar, java.lang.Object obj) {
        this.f52754d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams;
        boolean isOverlayType;
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        oj.a0 field_ViewRootImpl_mView;
        android.view.View view;
        java.lang.Object obj = this.f52754d;
        android.view.View view2 = null;
        try {
            field_ViewRootImpl_mView = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE.getField_ViewRootImpl_mView();
            view = field_ViewRootImpl_mView != null ? (android.view.View) field_ViewRootImpl_mView.a(obj) : null;
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.OverlayWindowLifecycleOwner", th6, "", new java.lang.Object[0]);
        }
        if (view == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        view2 = view;
        if (view2 == null || (layoutParams = view2.getLayoutParams()) == null) {
            return;
        }
        com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE;
        isOverlayType = overlayWindowLifecycleOwner.isOverlayType(layoutParams);
        if (isOverlayType) {
            hashSet = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.overlayViews;
            if (hashSet.isEmpty()) {
                overlayWindowLifecycleOwner.turnOn();
            }
            hashSet2 = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.overlayViews;
            hashSet2.add(obj);
        }
    }
}
