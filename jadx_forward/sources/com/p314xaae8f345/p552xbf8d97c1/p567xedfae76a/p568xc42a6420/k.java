package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420;

/* loaded from: classes12.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f134287d;

    public k(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.l lVar, java.lang.Object obj) {
        this.f134287d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams;
        boolean m41034x93b63c20;
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        oj.a0 m41031xe178d755;
        android.view.View view;
        java.lang.Object obj = this.f134287d;
        android.view.View view2 = null;
        try {
            m41031xe178d755 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.f19946x4fbc8495.m41031xe178d755();
            view = m41031xe178d755 != null ? (android.view.View) m41031xe178d755.a(obj) : null;
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
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9 c4670x2e7549c9 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.f19946x4fbc8495;
        m41034x93b63c20 = c4670x2e7549c9.m41034x93b63c20(layoutParams);
        if (m41034x93b63c20) {
            hashSet = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.overlayViews;
            if (hashSet.isEmpty()) {
                c4670x2e7549c9.m40993xcc985f3c();
            }
            hashSet2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.overlayViews;
            hashSet2.add(obj);
        }
    }
}
