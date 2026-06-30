package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes9.dex */
public final class z4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 f269155d;

    public z4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var) {
        this.f269155d = z5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19487x960af8af m74871x7512f2b0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19487x960af8af m74871x7512f2b02;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var = this.f269155d;
        boolean z17 = z5Var.K;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = z5Var.B;
        if (z17) {
            java.lang.String obj = c22621x7603e017.getText().toString();
            nw4.n nVar = z5Var.m74886x86b9ebe3().f265377p0;
            if (nVar != null) {
                nVar.y0(1, obj, 1);
            }
        } else {
            z5Var.m74886x86b9ebe3().mo48674x36654fab();
            m74871x7512f2b0 = z5Var.m74871x7512f2b0();
            if (m74871x7512f2b0.h()) {
                m74871x7512f2b02 = z5Var.m74871x7512f2b0();
                m74871x7512f2b02.f268576h.h();
                m74871x7512f2b02.f268576h.setVisibility(8);
                m74871x7512f2b02.setVisibility(8);
            }
            r45.m9 m9Var = new r45.m9();
            m9Var.f461793e = c22621x7603e017.getText().toString();
            m9Var.f461795g = 1;
            int i17 = z5Var.M;
            if (i17 != 0) {
                m9Var.f461795g = 3;
                m9Var.f461796h = i17;
            }
            z5Var.r(m9Var);
            cx4.a.c(10);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
