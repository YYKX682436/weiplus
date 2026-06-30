package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes15.dex */
public class u5 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223323e;

    public u5(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.z5 z5Var, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f223322d = textView;
        this.f223323e = textView2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.widget.TextView textView = this.f223322d;
        int lineCount = textView.getLineCount();
        android.widget.TextView textView2 = this.f223323e;
        if (lineCount <= 1) {
            textView2.setMaxLines(2);
        } else {
            textView.setMaxLines(2);
            textView2.setMaxLines(1);
        }
    }
}
