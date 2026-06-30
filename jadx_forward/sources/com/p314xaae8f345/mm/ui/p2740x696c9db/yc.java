package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class yc implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 f292465d;

    public yc(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72) {
        this.f292465d = activityC22543x95896a72;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        float b17 = i65.a.b(this.f292465d.mo55332x76847179(), 12);
        if (view != null) {
            view.setOutlineProvider(new zl5.a(true, false, b17));
        }
        if (view == null) {
            return null;
        }
        view.setClipToOutline(true);
        return null;
    }
}
