package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class l9 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI f110261d;

    public l9(com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI) {
        this.f110261d = finderLiveDelManagerUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (6 != i17) {
            return false;
        }
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI = this.f110261d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = finderLiveDelManagerUI.f109362e;
        if (mMEditText != null) {
            mMEditText.clearFocus();
        }
        java.lang.Object systemService = finderLiveDelManagerUI.getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = finderLiveDelManagerUI.f109362e;
        inputMethodManager.hideSoftInputFromWindow(mMEditText2 != null ? mMEditText2.getWindowToken() : null, 0);
        return true;
    }
}
