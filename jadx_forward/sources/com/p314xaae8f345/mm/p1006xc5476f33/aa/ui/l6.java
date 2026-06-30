package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes5.dex */
public final class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f154256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11354x3aa9ae06 f154257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f154258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f154259g;

    public l6(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11354x3aa9ae06 c11354x3aa9ae06, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017) {
        this.f154257e = c11354x3aa9ae06;
        this.f154258f = z2Var;
        this.f154259g = c22621x7603e017;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        if (!this.f154257e.f154068d.isFinishing() && !this.f154257e.f154068d.isDestroyed()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f154257e.f154070f;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = this.f154258f;
            if (z2Var == z2Var2 && z2Var2.h()) {
                boolean isAttachedToWindow = this.f154259g.isAttachedToWindow();
                boolean requestFocus = isAttachedToWindow ? this.f154259g.requestFocus() : false;
                boolean hasWindowFocus = this.f154259g.hasWindowFocus();
                android.view.View view = this.f154258f.f293591g;
                android.os.IBinder windowToken = view != null ? view.getWindowToken() : null;
                java.lang.Object systemService = this.f154257e.f154068d.getSystemService("input_method");
                android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
                boolean isActive = inputMethodManager != null ? inputMethodManager.isActive(this.f154259g) : false;
                boolean showSoftInput = (!isAttachedToWindow || inputMethodManager == null) ? false : inputMethodManager.showSoftInput(this.f154259g, 0);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f154259g;
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.g3 a17 = n3.b1.a(c22621x7603e017);
                boolean f17 = a17 != null ? a17.f(8) : false;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[showKeyboardRunnable] retry=");
                sb6.append(this.f154256d);
                sb6.append(", focusOk=");
                sb6.append(requestFocus);
                sb6.append(", attached=");
                sb6.append(isAttachedToWindow);
                sb6.append(", hasWindowFocus=");
                sb6.append(hasWindowFocus);
                sb6.append(", rootTokenNonNull=");
                sb6.append(windowToken != null);
                sb6.append(", isActive=");
                sb6.append(isActive);
                sb6.append(", showed=");
                sb6.append(showSoftInput);
                sb6.append(", imeVisible=");
                sb6.append(f17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PaylistAARemarkInputHalfPage", sb6.toString());
                if (!(isAttachedToWindow && showSoftInput && hasWindowFocus) && (i17 = this.f154256d) < 5) {
                    this.f154256d = i17 + 1;
                    ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
                    t0Var.getClass();
                    t0Var.z(this, 100L, false);
                    return;
                }
                if (f17) {
                    return;
                }
                if (isAttachedToWindow && showSoftInput && hasWindowFocus) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PaylistAARemarkInputHalfPage", "[showKeyboardRunnable] 键盘拉起失败告警！达到最大重试次数。 最终状态 -> attached: " + isAttachedToWindow + ", hasWindowFocus: " + hasWindowFocus + ", showed: " + showSoftInput + ", imeVisible: " + f17 + ", dialogIsShowing: " + this.f154258f.h());
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PaylistAARemarkInputHalfPage", "[showKeyboardRunnable] skip, activity/dialog invalid");
    }
}
