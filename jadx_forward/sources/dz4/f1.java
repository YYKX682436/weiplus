package dz4;

/* loaded from: classes5.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib f326772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz4.k1 f326773e;

    public f1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar, dz4.k1 k1Var) {
        this.f326772d = ibVar;
        this.f326773e = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz4.k1 k1Var = this.f326773e;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = this.f326772d;
        try {
            ibVar.f();
            ibVar.setVisibility(8);
            android.view.ViewParent parent = ibVar.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(ibVar);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.f326851b, "closeVoiceInputView: panel closed and removed");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(k1Var.f326851b, "closeVoiceInputView: error closing panel", e17);
        }
    }
}
