package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class y implements db5.l4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 f269139a;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 d0Var) {
        this.f269139a = d0Var;
    }

    @Override // db5.l4
    public final void a(android.widget.TextView textView, android.view.MenuItem menuItem) {
        java.lang.CharSequence charSequence;
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        if (textView != null) {
            boolean z17 = menuItem instanceof db5.h4;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 d0Var = this.f269139a;
            if (z17 && (charSequence = ((db5.h4) menuItem).f309904o) != null) {
                java.lang.String obj = charSequence.toString();
                d0Var.getClass();
                textView.setText(obj);
                return;
            }
            java.lang.String str2 = (java.lang.String) d0Var.f268678c.get(str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                textView.setText(str);
                return;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context d17 = d0Var.d();
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(d17, str2, textSize));
        }
    }
}
