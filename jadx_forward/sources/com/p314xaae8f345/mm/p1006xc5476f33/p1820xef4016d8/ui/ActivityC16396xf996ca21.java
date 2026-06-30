package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

@db5.a(m123858x6ac9171 = 7)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneySpareActivityEight;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneySpareActivityEight */
/* loaded from: classes9.dex */
public final class ActivityC16396xf996ca21 extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {
    public static void W6(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16396xf996ca21 activityC16396xf996ca21, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = "";
        }
        if (activityC16396xf996ca21.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[showAlert] this.isFinishing");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = activityC16396xf996ca21.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g39);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC16396xf996ca21.mo55332x76847179());
        u1Var.a(false);
        u1Var.g(str);
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.fp(activityC16396xf996ca21, str));
        u1Var.n(activityC16396xf996ca21.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
        u1Var.q(false);
    }

    public final void U6(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[doFinish] " + str);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0336  */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43, types: [android.util.ArrayMap] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r9v18, types: [android.app.Activity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16396xf996ca21.V6(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[onBackPressed] finish " + this);
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264;
        super.onCreate(bundle);
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575933m2);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        if (mo2533x106ab264() != null && (mo2533x106ab264 = mo2533x106ab264()) != null) {
            mo2533x106ab264.o();
        }
        android.content.Intent intent = getIntent();
        android.net.Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneySpareActivityEight", "[onCreate] callbackUri == null");
            W6(this, null, 1, null);
            return;
        }
        try {
            java.lang.String queryParameter = data.getQueryParameter("token");
            java.lang.String str = "";
            if (queryParameter == null) {
                queryParameter = "";
            }
            java.lang.String queryParameter2 = data.getQueryParameter("image_url");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            try {
                android.content.ComponentName componentName = getComponentName();
                if (componentName != null) {
                    android.content.pm.ActivityInfo activityInfo = getPackageManager().getActivityInfo(componentName, 0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityInfo, "getActivityInfo(...)");
                    java.lang.String str2 = activityInfo.taskAffinity;
                    if (str2 != null) {
                        str = str2;
                    }
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[onCreate] " + this + "，taskAffinity: " + str + "、tokenData: " + queryParameter + "、imageUrl: " + queryParameter2);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter2)) {
                java.lang.String decode = java.net.URLDecoder.decode(queryParameter2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
                r45.qg7 b17 = hc3.c.f361889a.b(queryParameter);
                if (b17 != null) {
                    V6(b17.f465510d, decode, b17.f465514h, b17.f465515i);
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneySpareActivityEight", "[onCreate] cacheData is InValid");
                    W6(this, null, 1, null);
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneySpareActivityEight", "[onCreate] tokenData.isEmpty() || imageUrl.isEmpty()");
            W6(this, null, 1, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneySpareActivityEight", "[onCreate] try-catch :%s", e17.toString());
            W6(this, null, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[onDestroy] " + this);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[onPause] " + this);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneySpareActivityEight", "[onResume] " + this);
    }
}
