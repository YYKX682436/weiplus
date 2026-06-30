package m05;

/* loaded from: classes.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f404099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f404100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f404101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404102g;

    public h(java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, java.lang.Integer num, java.lang.String str) {
        this.f404099d = weakReference;
        this.f404100e = weakReference2;
        this.f404101f = num;
        this.f404102g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Integer num;
        int intValue;
        try {
            android.app.Activity activity = (android.app.Activity) this.f404099d.get();
            if (activity == null) {
                return;
            }
            android.view.View view = (android.view.View) this.f404100e.get();
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                if (view == null && (num = this.f404101f) != null && (intValue = num.intValue()) != 0) {
                    view = activity.findViewById(intValue);
                }
                java.lang.String resId = this.f404102g;
                if (view == null && (activity.getWindow().getDecorView() instanceof android.view.ViewGroup)) {
                    android.view.View decorView = activity.getWindow().getDecorView();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resId, "tag");
                    view = m05.e.a((android.view.ViewGroup) decorView, com.p314xaae8f345.mm.R.id.pgt, resId, 0);
                }
                if (view == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WcPayReport|WcPayBtnDisabledReport", "not find targetview: " + resId);
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resId, "resId");
                    ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity).m78730xd9026919(new m05.g(activity.getClass().getSimpleName() + '-' + resId, view));
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WcPayReport|WcPayBtnDisabledReport", th6, "", new java.lang.Object[0]);
        }
    }
}
