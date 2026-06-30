package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839 f267091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f267093f;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839 c5868xe54ea839, java.lang.String str) {
        this.f267093f = c1Var;
        this.f267091d = c5868xe54ea839;
        this.f267092e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839 c5868xe54ea839 = this.f267091d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "JSOAUTH errCode[%s], isAccept[%s]", java.lang.Integer.valueOf(c5868xe54ea839.f136177h.f88786a), java.lang.Boolean.valueOf(c5868xe54ea839.f136177h.f88787b));
        am.lp lpVar = c5868xe54ea839.f136177h;
        int i17 = lpVar.f88786a;
        if (i17 == -119) {
            return;
        }
        java.lang.String str = this.f267092e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f267093f;
        if (i17 != 0) {
            c1Var.i5(c1Var.f266509e, str + "fail", null);
            return;
        }
        if (!lpVar.f88787b) {
            c1Var.i5(c1Var.f266509e, str + "cancel", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str2 = c5868xe54ea839.f136177h.f88788c;
        if (str2 != null && str2.length() > 6) {
            str2 = str2.substring(0, 6);
        }
        hashMap.put("nationalCode", str2);
        hashMap.put("nationalCodeFull", c5868xe54ea839.f136177h.f88788c);
        hashMap.put("userName", c5868xe54ea839.f136177h.f88790e);
        hashMap.put("telNumber", c5868xe54ea839.f136177h.f88789d);
        hashMap.put("addressPostalCode", c5868xe54ea839.f136177h.f88791f);
        hashMap.put("proviceFirstStageName", c5868xe54ea839.f136177h.f88792g);
        hashMap.put("addressCitySecondStageName", c5868xe54ea839.f136177h.f88793h);
        hashMap.put("addressCountiesThirdStageName", c5868xe54ea839.f136177h.f88794i);
        am.lp lpVar2 = c5868xe54ea839.f136177h;
        java.lang.String str3 = lpVar2.f88795j;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = lpVar2.f88796k;
        java.lang.String format = (android.text.TextUtils.isEmpty(str3) || str4.startsWith(str3)) ? str4 : java.lang.String.format("%s%s", str3, str4);
        hashMap.put("addressStreetFourthStageName", str3);
        hashMap.put("addressDetailInfo", format);
        hashMap.put("addressDetailInfoNew", str4);
        c1Var.i5(c1Var.f266509e, str + "ok", hashMap);
    }
}
