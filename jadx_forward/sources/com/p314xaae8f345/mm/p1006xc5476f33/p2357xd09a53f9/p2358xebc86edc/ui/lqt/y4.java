package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class y4 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f259985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19017x85a03192 f259986b;

    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19017x85a03192 activityC19017x85a03192, android.app.Dialog dialog) {
        this.f259986b = activityC19017x85a03192;
        this.f259985a = dialog;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        this.f259985a.dismiss();
        if (obj instanceof at4.j0) {
            ((at4.j0) obj).a(this.f259986b.mo55332x76847179(), false);
        }
    }
}
