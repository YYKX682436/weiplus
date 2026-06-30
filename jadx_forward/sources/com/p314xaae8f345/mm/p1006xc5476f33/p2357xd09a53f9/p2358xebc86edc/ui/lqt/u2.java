package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class u2 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f259924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 f259925b;

    public u2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936, android.app.Dialog dialog) {
        this.f259925b = activityC19014x45f83936;
        this.f259924a = dialog;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        this.f259924a.dismiss();
        if (obj instanceof at4.j0) {
            ((at4.j0) obj).a(this.f259925b.mo55332x76847179(), false);
        }
    }
}
