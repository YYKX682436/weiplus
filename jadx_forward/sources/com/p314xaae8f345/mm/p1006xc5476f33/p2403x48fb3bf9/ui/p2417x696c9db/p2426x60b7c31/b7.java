package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f266493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.h7 f266494e;

    public b7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.h7 h7Var) {
        this.f266494e = h7Var;
        this.f266493d = new java.lang.ref.WeakReference(h7Var.f266707g.f266508d);
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = (android.content.Context) this.f266493d.get();
        if (context != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.h7 h7Var = this.f266494e;
            if (h7Var.f266707g.f266513i && (context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
                h7Var.f266707g.f266512h = db5.e1.Q(context, null, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574098gz5), true, false, null);
            }
        }
    }
}
