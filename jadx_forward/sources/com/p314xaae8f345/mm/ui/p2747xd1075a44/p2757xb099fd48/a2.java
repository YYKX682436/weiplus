package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes3.dex */
public class a2 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f293274d;

    public a2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f293274d = y1Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f293274d;
        android.view.ViewTreeObserver viewTreeObserver = y1Var.f293565n;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                y1Var.f293565n = y1Var.f293564m.getViewTreeObserver();
            }
            y1Var.f293565n.removeGlobalOnLayoutListener(y1Var);
            y1Var.f293565n = null;
        }
        if (!y1Var.f293566o) {
            y1Var.f293558d = null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2 h2Var = y1Var.f293570s;
        if (h2Var != null) {
            h2Var.mo51018xb349b3ab();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i2 i2Var = y1Var.f293571t;
        if (i2Var != null && !y1Var.f293572u) {
            i2Var.mo60973xb349b3ab();
        }
        y1Var.B.setTranslationX(0.0f);
        y1Var.B.setVisibility(0);
        y1Var.C.removeAllViews();
        y1Var.D.clear();
    }
}
