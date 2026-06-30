package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public final class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f72723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage f72724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f72725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f72726g;

    public l6(com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage paylistAARemarkInputHalfPage, com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.ui.widget.MMEditText mMEditText) {
        this.f72724e = paylistAARemarkInputHalfPage;
        this.f72725f = z2Var;
        this.f72726g = mMEditText;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        if (!this.f72724e.f72535d.isFinishing() && !this.f72724e.f72535d.isDestroyed()) {
            com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f72724e.f72537f;
            com.tencent.mm.ui.widget.dialog.z2 z2Var2 = this.f72725f;
            if (z2Var == z2Var2 && z2Var2.h()) {
                boolean isAttachedToWindow = this.f72726g.isAttachedToWindow();
                boolean requestFocus = isAttachedToWindow ? this.f72726g.requestFocus() : false;
                boolean hasWindowFocus = this.f72726g.hasWindowFocus();
                android.view.View view = this.f72725f.f212058g;
                android.os.IBinder windowToken = view != null ? view.getWindowToken() : null;
                java.lang.Object systemService = this.f72724e.f72535d.getSystemService("input_method");
                android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
                boolean isActive = inputMethodManager != null ? inputMethodManager.isActive(this.f72726g) : false;
                boolean showSoftInput = (!isAttachedToWindow || inputMethodManager == null) ? false : inputMethodManager.showSoftInput(this.f72726g, 0);
                com.tencent.mm.ui.widget.MMEditText mMEditText = this.f72726g;
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.g3 a17 = n3.b1.a(mMEditText);
                boolean f17 = a17 != null ? a17.f(8) : false;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[showKeyboardRunnable] retry=");
                sb6.append(this.f72723d);
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
                com.tencent.mars.xlog.Log.i("MicroMsg.PaylistAARemarkInputHalfPage", sb6.toString());
                if (!(isAttachedToWindow && showSoftInput && hasWindowFocus) && (i17 = this.f72723d) < 5) {
                    this.f72723d = i17 + 1;
                    ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
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
                com.tencent.mars.xlog.Log.w("MicroMsg.PaylistAARemarkInputHalfPage", "[showKeyboardRunnable] 键盘拉起失败告警！达到最大重试次数。 最终状态 -> attached: " + isAttachedToWindow + ", hasWindowFocus: " + hasWindowFocus + ", showed: " + showSoftInput + ", imeVisible: " + f17 + ", dialogIsShowing: " + this.f72725f.h());
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PaylistAARemarkInputHalfPage", "[showKeyboardRunnable] skip, activity/dialog invalid");
    }
}
