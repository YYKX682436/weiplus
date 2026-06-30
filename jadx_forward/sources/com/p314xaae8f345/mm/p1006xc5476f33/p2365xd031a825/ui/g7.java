package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class g7 implements qp5.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950 f261822a;

    public g7(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950 activityC19119xf1f23950) {
        this.f261822a = activityC19119xf1f23950;
    }

    @Override // qp5.t
    /* renamed from: onInputValidChange */
    public void mo26603x194c4a1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950 activityC19119xf1f23950 = this.f261822a;
        if (!z17) {
            activityC19119xf1f23950.f261609e.setEnabled(z17);
            activityC19119xf1f23950.f261609e.setClickable(z17);
            return;
        }
        java.lang.String string = activityC19119xf1f23950.m83105x7498fe14().getString("key_new_pwd1");
        java.lang.String m83156xc003f809 = activityC19119xf1f23950.f261608d.m83156xc003f809();
        if (string == null || !string.equals(m83156xc003f809)) {
            com.p314xaae8f345.mm.p2802xd031a825.a.b(activityC19119xf1f23950, com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15117xb77c61b3);
        } else {
            activityC19119xf1f23950.f261609e.setEnabled(z17);
            activityC19119xf1f23950.f261609e.setClickable(z17);
        }
    }
}
