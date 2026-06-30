package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class i4 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f259740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 f259741b;

    public i4(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19016xf99a44c4 activityC19016xf99a44c4, android.app.Dialog dialog) {
        this.f259741b = activityC19016xf99a44c4;
        this.f259740a = dialog;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        this.f259740a.dismiss();
        if (obj instanceof at4.j0) {
            ((at4.j0) obj).a(this.f259741b.mo55332x76847179(), false);
        }
    }
}
