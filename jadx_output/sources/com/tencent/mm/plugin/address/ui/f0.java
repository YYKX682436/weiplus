package com.tencent.mm.plugin.address.ui;

/* loaded from: classes5.dex */
public class f0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f74543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f74544e;

    public f0(com.tencent.mm.plugin.address.ui.g0 g0Var, android.widget.TextView textView, java.lang.CharSequence charSequence) {
        this.f74543d = textView;
        this.f74544e = charSequence;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f74543d.setText(this.f74544e);
    }
}
