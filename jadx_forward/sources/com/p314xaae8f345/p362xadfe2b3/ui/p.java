package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class p implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f127744d;

    public p(com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329, java.lang.ref.WeakReference weakReference) {
        this.f127744d = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329 = (com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) this.f127744d.get();
        if (c3717xac6c2329 != null) {
            c3717xac6c2329.e();
        }
    }
}
