package gl5;

/* loaded from: classes5.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 f354448d;

    public c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023) {
        this.f354448d = viewTreeObserverOnPreDrawListenerC22668xe0605023;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = this.f354448d;
        boolean R = viewTreeObserverOnPreDrawListenerC22668xe0605023.R();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cmEdit.CMTextView", "checkInitAdaptEdt isNeedReuseMenuItems:" + R);
        if (R) {
            boolean isAttachedToWindow = viewTreeObserverOnPreDrawListenerC22668xe0605023.isAttachedToWindow();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cmEdit.CMTextView", "checkInitAdaptEdt isWindowAttached:" + isAttachedToWindow);
            if (isAttachedToWindow) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cmEdit.CMTextView", "checkInitAdaptEdt mIsInitAdapt:" + viewTreeObserverOnPreDrawListenerC22668xe0605023.f293128k2);
                if (viewTreeObserverOnPreDrawListenerC22668xe0605023.f293128k2) {
                    return;
                }
                viewTreeObserverOnPreDrawListenerC22668xe0605023.f293128k2 = true;
                try {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22665x6dcc3b79 c22665x6dcc3b79 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22665x6dcc3b79(viewTreeObserverOnPreDrawListenerC22668xe0605023.getContext());
                    if (viewTreeObserverOnPreDrawListenerC22668xe0605023.getParent() instanceof android.view.ViewGroup) {
                        ((android.view.ViewGroup) viewTreeObserverOnPreDrawListenerC22668xe0605023.getParent()).addView(c22665x6dcc3b79);
                        c22665x6dcc3b79.setVisibility(8);
                        viewTreeObserverOnPreDrawListenerC22668xe0605023.m81724xee8a612d(c22665x6dcc3b79);
                    }
                } catch (java.lang.Throwable th6) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("cmEdit.CMTextView", "initAdapt err:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
                    fl5.b.a(7);
                }
            }
        }
    }
}
