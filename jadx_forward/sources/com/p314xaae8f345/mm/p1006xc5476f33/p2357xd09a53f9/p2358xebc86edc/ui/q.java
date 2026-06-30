package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class q implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb f260027a;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb) {
        this.f260027a = activityC18999x8e4b0cb;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceFetchUI", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC18999x8e4b0cb activityC18999x8e4b0cb = this.f260027a;
        activityC18999x8e4b0cb.M = null;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            activityC18999x8e4b0cb.f259328t.removeAllViews();
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            java.util.LinkedList linkedList = ((r45.dw) fVar.f152151d).f454308d;
            if (linkedList != null && !linkedList.isEmpty()) {
                java.util.Iterator it = ((r45.dw) fVar.f152151d).f454308d.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    r45.rl6 rl6Var = (r45.rl6) it.next();
                    android.widget.TextView textView = new android.widget.TextView(activityC18999x8e4b0cb.mo55332x76847179());
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.j(textView, rl6Var);
                    if (i17 != 0) {
                        layoutParams.topMargin = i65.a.h(activityC18999x8e4b0cb.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561096f);
                    }
                    activityC18999x8e4b0cb.f259328t.addView(textView, layoutParams);
                    i17++;
                }
            }
        }
        return null;
    }
}
