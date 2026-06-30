package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class rg implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f195669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f195670e;

    public rg(android.view.View view, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f195669d = view;
        this.f195670e = h0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f195669d.setBackground((android.graphics.drawable.Drawable) this.f195670e.f391656d);
    }
}
