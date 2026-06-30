package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public final class f3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1 f145680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145681e;

    public f3(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1 activityC10343x243c08b1, java.lang.String str) {
        this.f145680d = activityC10343x243c08b1;
        this.f145681e = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        int i18 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1.f145292q;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10343x243c08b1 activityC10343x243c08b1 = this.f145680d;
            activityC10343x243c08b1.f145298i = db5.e1.Q(activityC10343x243c08b1.mo55332x76847179(), activityC10343x243c08b1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC10343x243c08b1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i49), true, false, null);
            java.lang.String str = this.f145681e;
            java.util.LinkedList V6 = activityC10343x243c08b1.V6(str, ",");
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(activityC10343x243c08b1.f145294e)) {
                pq5.g l17 = new kn.e(activityC10343x243c08b1.f145294e, V6).l();
                l17.f(activityC10343x243c08b1);
                l17.h(new com.p314xaae8f345.mm.p648x55baa833.ui.g3(activityC10343x243c08b1, str));
            } else {
                pq5.g l18 = new kn.g(activityC10343x243c08b1.f145294e, V6).l();
                l18.f(activityC10343x243c08b1);
                l18.h(new com.p314xaae8f345.mm.p648x55baa833.ui.h3(activityC10343x243c08b1, str));
            }
        }
    }
}
