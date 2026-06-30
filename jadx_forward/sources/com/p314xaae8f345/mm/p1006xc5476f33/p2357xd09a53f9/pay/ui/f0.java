package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class f0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 f260294d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3) {
        this.f260294d = activityC19036x32c728a3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05;
        java.util.List list;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3 = this.f260294d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC19036x32c728a3.f260245d, "click cancel pay");
        if (activityC19036x32c728a3.f260262u != null && (c19099x8d444f05 = activityC19036x32c728a3.f260246e) != null && (list = c19099x8d444f05.M) != null && ((java.util.ArrayList) list).size() > 0) {
            if (activityC19036x32c728a3.f260262u.f273642e == 8) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15368, 2, 2, 2, ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) activityC19036x32c728a3.f260246e.M).get(0)).f261247r);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15368, 1, 2, 2, ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) activityC19036x32c728a3.f260246e.M).get(0)).f261247r);
            }
        }
        activityC19036x32c728a3.finish();
    }
}
