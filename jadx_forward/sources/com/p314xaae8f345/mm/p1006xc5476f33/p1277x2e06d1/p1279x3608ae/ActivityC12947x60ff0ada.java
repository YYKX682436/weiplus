package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* renamed from: com.tencent.mm.plugin.base.stub.WXPayEntryActivity */
/* loaded from: classes8.dex */
public class ActivityC12947x60ff0ada extends com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409 {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f175245f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i5 f175246g;

    /* renamed from: i, reason: collision with root package name */
    public int f175248i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f175243d = null;

    /* renamed from: e, reason: collision with root package name */
    public long f175244e = 0;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g5 f175247h = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.g5();

    /* renamed from: m, reason: collision with root package name */
    public boolean f175249m = true;

    public ActivityC12947x60ff0ada() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "Constructor");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public void W6(java.lang.String str) {
        java.lang.String str2 = str == null ? "" : str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayEntryActivity", "WXPayEntryActivity finish with report, reason: ".concat(str2));
        java.lang.String l17 = getIntent() != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8) : "";
        java.lang.String l18 = getIntent() != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), "_wxapi_payreq_prepayid") : "";
        java.lang.String l19 = getIntent() != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), "_wxapi_payreq_partnerid") : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayEntryActivity", "reportPkgName: %s, reportPrepayId: %s, reportPartnerId: %s", l17, l18, l19);
        if ("intent is null".equals(str2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(36486, "9", com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0, "", "", "apppay", "", "", "");
            return;
        }
        if ("preLogin fail".equals(str2)) {
            if (l17 == null) {
                l17 = "";
            }
            if (l19 == null) {
                l19 = "";
            }
            if (l18 == null) {
                l18 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(36486, "9", "11", "", "", "apppay", l17, l19, l18);
            return;
        }
        if ("not login".equals(str2)) {
            if (l17 == null) {
                l17 = "";
            }
            if (l19 == null) {
                l19 = "";
            }
            if (l18 == null) {
                l18 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(36486, "9", "12", "", "", "apppay", l17, l19, l18);
            return;
        }
        if (l17 == null) {
            l17 = "";
        }
        if (l19 == null) {
            l19 = "";
        }
        if (l18 == null) {
            l18 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(36486, "9", "13", "", str2, "apppay", l17, l19, l18);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:6|(1:(1:(5:10|(1:12)|(1:14)|(1:16)(1:208)|17)(6:209|(1:211)(1:220)|(1:213)(1:219)|(1:215)(1:218)|216|217))(6:221|(1:223)(1:232)|(1:225)(1:231)|(1:227)(1:230)|228|229))(2:233|(6:235|(1:237)(1:246)|(1:239)(1:245)|(1:241)(1:244)|242|243))|18|(1:20)(1:207)|(5:22|(1:24)(1:32)|(1:26)(1:31)|(1:28)(1:30)|29)|33|(2:35|(1:37)(17:38|39|40|41|42|43|44|(3:46|47|48)(1:199)|49|50|(1:194)(2:54|(1:193)(9:58|59|60|(5:62|(1:64)|65|(1:69)|70)(2:158|(14:160|(1:188)(3:164|(1:166)|167)|168|(1:170)|171|172|173|(1:175)|176|(1:178)|179|(1:181)|182|183)(1:189))|(1:72)|73|(1:75)|76|(2:78|79)(20:80|81|82|83|84|(1:86)|87|(3:89|(1:91)(1:93)|92)|94|(1:96)|97|(1:103)|104|(1:154)(1:110)|111|(1:113)(4:129|(1:131)(1:153)|132|(1:(3:139|(1:152)(1:(1:(1:150))(1:146))|151)(1:138))(1:135))|114|(1:116)|117|(4:119|(1:121)|122|123)(4:124|(1:126)|127|128))))|184|(0)|73|(0)|76|(0)(0)))|206|39|40|41|42|43|44|(0)(0)|49|50|(1:52)|194|184|(0)|73|(0)|76|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02f5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02f6, code lost:
    
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02f9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02fa, code lost:
    
        r3 = r21;
        r1 = r22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0533  */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p r27, android.content.Intent r28) {
        /*
            Method dump skipped, instructions count: 1696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12947x60ff0ada.X6(com.tencent.mm.pluginsdk.ui.p, android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean Y6(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "preLogin");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409
    public boolean Z6() {
        return true;
    }

    public final java.lang.String a7() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i5 i5Var = this.f175246g;
        return i5Var != null ? i5Var.a(this.f175243d) : this.f175243d;
    }

    public final com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6 b7() {
        com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6 jointPayReq = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(getIntent().getExtras(), "_wxapi_command_type", 0) == 27 ? new com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11304xacd729bf.JointPayReq() : new com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6();
        jointPayReq.mo48425x63aa4ccc(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.e(getIntent()));
        return jointPayReq;
    }

    public final void c7(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "sendPayResponse");
        com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6 b76 = b7();
        com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6.Options options = new com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6.Options();
        options.m48483x63aa4ccc(com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.e(getIntent()));
        com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11303x34488478 jointPayResp = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(getIntent().getExtras(), "_wxapi_command_type", 0) == 27 ? new com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11304xacd729bf.JointPayResp() : new com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11303x34488478();
        jointPayResp.f33265xb3bbab20 = b76.f33257xb3bbab20;
        jointPayResp.f33264xb21df56b = b76.f33252xb21df56b;
        jointPayResp.f32867xa7c470f2 = i17;
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8);
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.j.a(this, l17, jointPayResp, options);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onBackPressed");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onCreate");
        this.f175244e = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.m(getIntent(), "key_auto_login_wizard_exit", true);
        super.onCreate(bundle);
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8);
        java.lang.String l18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), "_wxapi_payreq_prepayid");
        java.lang.String l19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), "_wxapi_payreq_partnerid");
        long a17 = c01.id.a();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "reportStartActivitySuccess, source: open_sdk, reportPkgName: %s, reportPartnerId: %s, reportPrepayId: %s, localCurrentTimeMs: %d, serverTime: %d, costTimeMs: -1", l17, l19, l18, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(a17));
        m05.i.f404103a.e(3, "open_sdk", l17 != null ? l17 : "", l19 != null ? l19 : "", l18 != null ? l18 : "", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(a17), -1L);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onDestroy");
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractActivityC19634xcf005409, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onNewIntent");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onPause");
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRestart() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onRestart");
        super.onRestart();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onResume");
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onStart");
        super.onStart();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onStop");
        super.onStop();
    }
}
