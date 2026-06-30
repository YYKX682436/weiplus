package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes5.dex */
public final class q3 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f211252d;

    public q3(android.widget.EditText editText) {
        this.f211252d = editText;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (5 != i17) {
            return false;
        }
        this.f211252d.clearFocus();
        return false;
    }
}
