package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.bu f176912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f f176913e;

    public u(r45.bu buVar, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f) {
        this.f176912d = buVar;
        this.f176913e = activityC13069x47bc6a4f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$updateHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.bu buVar = this.f176912d;
        int i17 = buVar.f452591g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f activityC13069x47bc6a4f = this.f176913e;
        if (i17 == 1) {
            lu1.d.j((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC13069x47bc6a4f.mo55332x76847179(), buVar.f452592h, 0);
        } else if (i17 == 2) {
            r45.iu iuVar = buVar.f452593i;
            if (iuVar != null) {
                lu1.d.f(iuVar.f458861d, iuVar.f458862e, iuVar.f458863f);
                activityC13069x47bc6a4f.f176780t = true;
            }
        } else if (i17 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(activityC13069x47bc6a4f.f176767d, "unknown type " + buVar.f452591g);
        } else if ("weixin://mktcard/cert".equals(buVar.f452594m)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13069x47bc6a4f.f176767d, "go to cert list");
            activityC13069x47bc6a4f.startActivityForResult(new android.content.Intent(activityC13069x47bc6a4f.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13068x5a32e52e.class), 2);
        } else if ("weixin://mktcard/membercard".equals(buVar.f452594m)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13069x47bc6a4f.f176767d, "go to vip card list");
            activityC13069x47bc6a4f.startActivityForResult(new android.content.Intent(activityC13069x47bc6a4f.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf.class), 1);
        } else if ("weixin://mktcard/coupon".equals(buVar.f452594m)) {
            java.lang.String str = buVar.f452589e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13069x47bc6a4f.f176767d, "go to vip card list");
            android.content.Intent intent = new android.content.Intent(activityC13069x47bc6a4f.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8.class);
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str);
            activityC13069x47bc6a4f.startActivityForResult(intent, 3);
        } else if ("weixin://mktcard/couponv2".equals(buVar.f452594m)) {
            java.lang.String str2 = buVar.f452589e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13069x47bc6a4f.f176767d, "go to coupon gift card list");
            android.content.Intent intent2 = new android.content.Intent(activityC13069x47bc6a4f.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1.class);
            intent2.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str2);
            activityC13069x47bc6a4f.startActivityForResult(intent2, 5);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19673, buVar.f452589e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$updateHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
