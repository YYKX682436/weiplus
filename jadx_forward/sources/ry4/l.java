package ry4;

/* loaded from: classes.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.c0 f483191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b f483192e;

    public l(ry4.c0 c0Var, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21525x1d56253b c21525x1d56253b) {
        this.f483191d = c0Var;
        this.f483192e = c21525x1d56253b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = this.f483191d.m158354x19263085();
        if (m158354x19263085 == null) {
            return;
        }
        java.lang.Object systemService = m158354x19263085.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutCommandEditUIC", "[autoFocus] showSoftInput=%s", java.lang.Boolean.valueOf(inputMethodManager.showSoftInput(this.f483192e, 0)));
    }
}
