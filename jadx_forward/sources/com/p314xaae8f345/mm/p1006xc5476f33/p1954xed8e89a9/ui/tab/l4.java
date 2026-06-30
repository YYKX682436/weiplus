package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes9.dex */
public final class l4 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 f235939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f235940e;

    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var, java.lang.CharSequence charSequence) {
        this.f235939d = s4Var;
        this.f235940e = charSequence;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f235939d.B(this.f235940e);
    }
}
