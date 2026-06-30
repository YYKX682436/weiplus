package com.tencent.mm.plugin.address.ui;

/* loaded from: classes9.dex */
public final class k implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.AddrItemView f74570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f74571e;

    public k(com.tencent.mm.plugin.address.ui.AddrItemView addrItemView, android.content.Context context) {
        this.f74570d = addrItemView;
        this.f74571e = context;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 6) {
            return false;
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f74570d.f74406p;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("itemTextET");
            throw null;
        }
        mMEditText.clearFocus();
        java.lang.Object systemService = this.f74571e.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(textView.getWindowToken(), 0);
        return true;
    }
}
