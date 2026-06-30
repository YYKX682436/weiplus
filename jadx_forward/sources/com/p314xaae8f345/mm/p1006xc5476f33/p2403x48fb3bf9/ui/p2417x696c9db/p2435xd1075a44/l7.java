package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public class l7 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19492xd515f0ad f268923d;

    public l7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19492xd515f0ad c19492xd515f0ad) {
        this.f268923d = c19492xd515f0ad;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/WebViewSearchContentInputFooter$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19492xd515f0ad c19492xd515f0ad = this.f268923d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p7 p7Var = c19492xd515f0ad.f268622m;
        if (p7Var != null) {
            p7Var.mo74222x64f5800(view, i17, keyEvent);
        }
        if (i17 != 66 || c19492xd515f0ad.f268622m == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/widget/WebViewSearchContentInputFooter$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        android.content.Context context = view.getContext();
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo53060x36654fab(c19492xd515f0ad.f268617e);
        }
        c19492xd515f0ad.f268622m.b(c19492xd515f0ad);
        yj0.a.i(true, this, "com/tencent/mm/plugin/webview/ui/tools/widget/WebViewSearchContentInputFooter$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return true;
    }
}
