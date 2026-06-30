package dz4;

/* loaded from: classes5.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f326850a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f326851b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib f326852c;

    /* renamed from: d, reason: collision with root package name */
    public int f326853d;

    public k1(ih0.p holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f326850a = holder;
        this.f326851b = "MicroMsg.WeNoteFlutterDictationHelper";
    }

    public final void a() {
        java.lang.String str = this.f326851b;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = this.f326852c;
        this.f326852c = null;
        if (ibVar == null) {
            return;
        }
        try {
            ibVar.animate().cancel();
            ibVar.f();
            ibVar.setVisibility(8);
            android.view.ViewParent parent = ibVar.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(ibVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "cleanupPanelSilently: panel cleaned up successfully");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "cleanupPanelSilently: error during cleanup", e17);
        }
    }

    public final void b(dz4.q0 callback, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String str = this.f326851b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "closeVoiceInputView: start");
        java.lang.ref.WeakReference weakReference = ((ez4.u) this.f326850a).f339477c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "closeVoiceInputView: activity invalid, cleanup silently");
            a();
            return;
        }
        c(new dz4.e1(callback));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = this.f326852c;
        boolean z17 = false;
        if (ibVar != null) {
            try {
                if (ibVar.getVisibility() == 0) {
                    if (ibVar.getParent() != null) {
                        z17 = true;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "voiceInputIsShowing: error checking panel state", e17);
                this.f326852c = null;
            }
        }
        if (z17) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar2 = this.f326852c;
            if (ibVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "closeVoiceInputView: panel is null");
                return;
            }
            this.f326852c = null;
            ibVar2.animate().cancel();
            ibVar2.animate().translationY(f17).withEndAction(new dz4.f1(ibVar2, this)).start();
        }
    }

    public final void c(yz5.a aVar) {
        java.lang.String str = this.f326851b;
        try {
            java.lang.ref.WeakReference weakReference = ((ez4.u) this.f326850a).f339477c;
            android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                aVar.mo152xb9724478();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "safeNotifyCallback: activity invalid, skip");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "safeNotifyCallback: error during callback", e17);
        }
    }

    public final void d(int i17) {
        java.lang.ref.WeakReference weakReference = ((ez4.u) this.f326850a).f339477c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        java.lang.String str = this.f326851b;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "showVoiceInputPanel: activity invalid, cleanup");
            a();
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = this.f326852c;
        if (ibVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "showVoiceInputPanel: panel is null");
            return;
        }
        try {
            ibVar.k(true);
            ibVar.h();
            ibVar.setVisibility(0);
            ibVar.setTranslationY(i17);
            ibVar.animate().cancel();
            ibVar.animate().translationY(0.0f).withEndAction(new dz4.j1(ibVar)).start();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "showVoiceInputPanel: error during animation", e17);
            a();
        }
    }
}
