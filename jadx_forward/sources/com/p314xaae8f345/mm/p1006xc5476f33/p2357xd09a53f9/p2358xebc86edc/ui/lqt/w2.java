package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class w2 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f259951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 f259952b;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936, android.app.Dialog dialog) {
        this.f259952b = activityC19014x45f83936;
        this.f259951a = dialog;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        this.f259951a.dismiss();
        if (obj instanceof at4.j0) {
            ((at4.j0) obj).a(this.f259952b.mo55332x76847179(), false);
        }
    }
}
