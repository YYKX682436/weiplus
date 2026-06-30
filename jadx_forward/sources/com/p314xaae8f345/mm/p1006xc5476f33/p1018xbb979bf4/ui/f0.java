package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes5.dex */
public class f0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f156076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f156077e;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.g0 g0Var, android.widget.TextView textView, java.lang.CharSequence charSequence) {
        this.f156076d = textView;
        this.f156077e = charSequence;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f156076d.setText(this.f156077e);
    }
}
