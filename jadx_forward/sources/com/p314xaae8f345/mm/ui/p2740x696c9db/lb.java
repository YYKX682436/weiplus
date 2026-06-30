package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class lb implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 f292087d;

    public lb(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752) {
        this.f292087d = activityC22534xec824752;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        float b17 = i65.a.b(this.f292087d.mo55332x76847179(), 12);
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
