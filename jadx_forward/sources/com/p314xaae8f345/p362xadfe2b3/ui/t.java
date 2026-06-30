package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class t implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f127755d;

    public t(com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063, java.lang.ref.WeakReference weakReference) {
        this.f127755d = weakReference;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063 = (com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063) this.f127755d.get();
        if (c3719xb0aa2063 != null) {
            int i17 = com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063.Q;
            c3719xb0aa2063.n0();
        }
    }
}
