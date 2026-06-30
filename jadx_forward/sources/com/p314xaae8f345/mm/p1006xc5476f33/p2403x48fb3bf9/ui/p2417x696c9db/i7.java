package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class i7 implements db5.l4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f266362a;

    public i7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var) {
        this.f266362a = c6Var;
    }

    @Override // db5.l4
    public void a(android.widget.TextView textView, android.view.MenuItem menuItem) {
        java.lang.CharSequence charSequence;
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        if (textView != null) {
            boolean z17 = menuItem instanceof db5.h4;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = this.f266362a;
            if (z17 && (charSequence = ((db5.h4) menuItem).f309904o) != null) {
                java.lang.String charSequence2 = charSequence.toString();
                c6Var.getClass();
                textView.setText(charSequence2);
                return;
            }
            java.lang.String str2 = (java.lang.String) c6Var.f265581e.get(str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                textView.setText(str);
                return;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d c17 = c6Var.c();
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(c17, str2, textSize));
        }
    }
}
