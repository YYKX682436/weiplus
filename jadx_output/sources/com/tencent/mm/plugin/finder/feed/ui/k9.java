package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class k9 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI f110219d;

    public k9(com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI) {
        this.f110219d = finderLiveDelManagerUI;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        android.text.Editable editableText;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI = this.f110219d;
        if (z17) {
            java.lang.Object systemService = finderLiveDelManagerUI.getContext().getSystemService("input_method");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(finderLiveDelManagerUI.f109362e, 2);
        }
        bm2.m2 m2Var = finderLiveDelManagerUI.f109361d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = finderLiveDelManagerUI.f109362e;
        m2Var.y(java.lang.String.valueOf((mMEditText == null || (editableText = mMEditText.getEditableText()) == null) ? null : r26.n0.u0(editableText)));
    }
}
