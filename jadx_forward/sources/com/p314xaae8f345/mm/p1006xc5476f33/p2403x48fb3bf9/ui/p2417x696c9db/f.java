package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes5.dex */
public class f implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 f265696d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 activityC19307x65cbeee9) {
        this.f265696d = activityC19307x65cbeee9;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (i17 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 activityC19307x65cbeee9 = this.f265696d;
            activityC19307x65cbeee9.f265117d = (android.view.inputmethod.InputMethodManager) activityC19307x65cbeee9.getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = activityC19307x65cbeee9.f265117d;
            if (inputMethodManager != null && inputMethodManager.isActive()) {
                activityC19307x65cbeee9.f265117d.hideSoftInputFromWindow(activityC19307x65cbeee9.getCurrentFocus().getWindowToken(), 0);
                activityC19307x65cbeee9.f265118e.setCursorVisible(false);
                activityC19307x65cbeee9.getWindow().getDecorView().requestFocus();
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/CreateAvatarUI$4", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
