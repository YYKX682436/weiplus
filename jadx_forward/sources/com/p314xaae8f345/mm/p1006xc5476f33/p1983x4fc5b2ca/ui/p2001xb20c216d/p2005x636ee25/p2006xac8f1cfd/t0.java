package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public final class t0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1 f237847d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1 b1Var) {
        this.f237847d = b1Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1 b1Var = this.f237847d;
        if (3 != i17) {
            boolean z17 = false;
            if (6 != i17) {
                return false;
            }
            if (b1Var.f237707o != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1.q(b1Var, false);
                android.widget.EditText editText = b1Var.f237707o;
                if (editText != null && true == editText.hasFocus()) {
                    z17 = true;
                }
                if (z17) {
                    editText.clearFocus();
                }
            }
            return true;
        }
        java.lang.String str = b1Var.f237714v;
        if (str != null) {
            java.lang.CharSequence text = textView.getText();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, text != null ? text.toString() : null)) {
                wt3.u uVar = wt3.v.f531037h;
                wt3.v.f531039j.f143085e = 2L;
                uVar.a();
                wt3.v.f531039j.f143089i = 0L;
            }
        }
        java.lang.CharSequence text2 = textView.getText();
        java.lang.String obj = text2 != null ? text2.toString() : null;
        b1Var.f237714v = obj;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            b1Var.A();
        }
        return true;
    }
}
