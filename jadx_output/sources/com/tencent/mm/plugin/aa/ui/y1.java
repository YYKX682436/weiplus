package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.z1 f72894d;

    public y1(com.tencent.mm.plugin.aa.ui.z1 z1Var) {
        this.f72894d = z1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.z1 z1Var = this.f72894d;
        z1Var.f72909i.hideTenpayKB();
        if (z1Var.f72904d) {
            ((android.view.inputmethod.InputMethodManager) z1Var.f72909i.getContext().getSystemService("input_method")).showSoftInput(z1Var.f72906f, 0);
        }
    }
}
