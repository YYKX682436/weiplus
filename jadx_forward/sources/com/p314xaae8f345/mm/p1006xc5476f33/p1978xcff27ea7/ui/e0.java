package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* loaded from: classes9.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f236687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.h0 f236688e;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.h0 h0Var, java.lang.String str) {
        this.f236688e = h0Var;
        this.f236687d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 activityC16959x6229db69 = this.f236688e.f236722a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69.Q;
        activityC16959x6229db69.getClass();
        java.lang.String str = this.f236687d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "handle phone number: %s", str);
        vs3.a Di = us3.e.Di();
        if (Di == null || !str.equals(Di.f521408a)) {
            java.util.List list = activityC16959x6229db69.M;
            if (list == null || list.isEmpty()) {
                activityC16959x6229db69.M = o25.b.e(activityC16959x6229db69.mo55332x76847179());
            }
            java.util.List list2 = activityC16959x6229db69.M;
            int[] iArr = vs3.a.f521406f;
            if (list2 != null && !list2.isEmpty()) {
                java.util.Iterator it = activityC16959x6229db69.M.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Di = new vs3.a(str, "", 1);
                        Di.f521412e = iArr;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "not in address");
                        break;
                    }
                    java.lang.String[] strArr = (java.lang.String[]) it.next();
                    java.lang.String a17 = vs3.b.a(strArr[2]);
                    if (str.equals(a17)) {
                        vs3.a aVar = new vs3.a(a17, strArr[1], 1);
                        aVar.f521412e = iArr;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "find in address number");
                        Di = aVar;
                        break;
                    }
                }
            } else {
                java.util.List Bi = us3.e.Ai().Bi();
                if (!Bi.isEmpty()) {
                    java.util.Iterator it6 = Bi.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            Di = new vs3.a(str, activityC16959x6229db69.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kxv), 0);
                            Di.f521412e = iArr;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "not find in history");
                            break;
                        } else {
                            vs3.a aVar2 = (vs3.a) it6.next();
                            if (aVar2.f521408a.equals(str)) {
                                Di = new vs3.a(str, aVar2.f521409b, aVar2.f521410c, 2);
                                Di.f521412e = iArr;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "find in history");
                                break;
                            }
                        }
                    }
                } else {
                    Di = new vs3.a(str, "", 0);
                    Di.f521412e = iArr;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "empty history");
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneRechargeUI", "find bind mobile");
        }
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.d0(this, Di));
    }
}
