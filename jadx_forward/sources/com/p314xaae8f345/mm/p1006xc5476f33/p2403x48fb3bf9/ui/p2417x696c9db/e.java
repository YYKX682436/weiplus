package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes5.dex */
public class e implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 f265645d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 activityC19307x65cbeee9) {
        this.f265645d = activityC19307x65cbeee9;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 6 || (keyEvent != null && keyEvent.getKeyCode() == 66)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19307x65cbeee9 activityC19307x65cbeee9 = this.f265645d;
            activityC19307x65cbeee9.f265117d = (android.view.inputmethod.InputMethodManager) activityC19307x65cbeee9.getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = activityC19307x65cbeee9.f265117d;
            if (inputMethodManager != null && inputMethodManager.isActive()) {
                activityC19307x65cbeee9.f265117d.hideSoftInputFromWindow(activityC19307x65cbeee9.getCurrentFocus().getWindowToken(), 0);
                activityC19307x65cbeee9.f265118e.setCursorVisible(false);
                activityC19307x65cbeee9.getWindow().getDecorView().requestFocus();
            }
        }
        return false;
    }
}
