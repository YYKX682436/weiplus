package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes15.dex */
public class n3 implements ec0.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 f224480d;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980) {
        this.f224480d = activityC16143x7673980;
    }

    @Override // ec0.e
    public void i3(java.util.ArrayList arrayList) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980 = this.f224480d;
        q83.g gVar = activityC16143x7673980.f224193p;
        gVar.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        gVar.f442310f = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = activityC16143x7673980.f224202y;
        if (arrayList == null || arrayList.size() <= 0) {
            android.app.ProgressDialog progressDialog = activityC16143x7673980.f224199v;
            if (progressDialog != null && progressDialog.isShowing()) {
                activityC16143x7673980.f224199v.dismiss();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "[onQueryFinish] result=null");
            activityC16143x7673980.f224189i = 10236;
            if (n3Var != null) {
                n3Var.mo50305x3d8a09a2(1002);
                return;
            }
            return;
        }
        activityC16143x7673980.f224185e = new java.lang.String[arrayList.size()];
        activityC16143x7673980.f224186f = new java.lang.String[arrayList.size()];
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.q3 q3Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.q3) arrayList.get(0);
        if (q3Var.f270949f != 10232) {
            android.app.ProgressDialog progressDialog2 = activityC16143x7673980.f224199v;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                activityC16143x7673980.f224199v.dismiss();
            }
            activityC16143x7673980.f224189i = q3Var.f270949f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "OnGoogleQueryFinish Product Failed Status:" + activityC16143x7673980.f224189i);
            if (n3Var != null) {
                n3Var.mo50305x3d8a09a2(1002);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "OnGoogleQueryFinish Product OK size=" + arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.q3 q3Var2 = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.q3) it.next();
            activityC16143x7673980.f224185e[i17] = new java.math.BigDecimal(q3Var2.f270948e).divide(new java.math.BigDecimal(1000000)).toString();
            activityC16143x7673980.f224186f[i17] = q3Var2.f270947d;
            i17++;
        }
        if (activityC16143x7673980.f224188h > 0) {
            java.lang.String[] strArr = activityC16143x7673980.f224186f;
            if (strArr.length > 0) {
                java.lang.String str = strArr[0];
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !str.equals(activityC16143x7673980.f224187g)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRechargeUI", "remote currency:" + activityC16143x7673980.f224187g + ",google wallet currency:" + str);
                    activityC16143x7673980.T6(str);
                    return;
                }
            }
        }
        android.app.ProgressDialog progressDialog3 = activityC16143x7673980.f224199v;
        if (progressDialog3 != null && progressDialog3.isShowing()) {
            activityC16143x7673980.f224199v.dismiss();
        }
        if (n3Var != null) {
            n3Var.mo50305x3d8a09a2(1002);
        }
    }
}
