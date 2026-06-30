package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class wg implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f196461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f196462e;

    public wg(android.view.View view, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f196461d = view;
        this.f196462e = h0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f196461d.setBackground((android.graphics.drawable.Drawable) this.f196462e.f391656d);
    }
}
