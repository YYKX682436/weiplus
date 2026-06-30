package wu3;

/* loaded from: classes10.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 f531260d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282) {
        this.f531260d = c17042xf8121282;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282 = this.f531260d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) c17042xf8121282.getContext().getSystemService("input_method");
        if (c17042xf8121282.getMode() == 0 || c17042xf8121282.getMode() == 2) {
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(c17042xf8121282.f237533o, 0);
            }
        } else if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(c17042xf8121282.f237541w, 0);
        }
    }
}
