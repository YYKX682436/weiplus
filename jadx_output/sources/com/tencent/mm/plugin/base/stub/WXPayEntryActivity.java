package com.tencent.mm.plugin.base.stub;

/* loaded from: classes8.dex */
public class WXPayEntryActivity extends com.tencent.mm.pluginsdk.ui.AutoLoginActivity {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f93712f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.i5 f93713g;

    /* renamed from: i, reason: collision with root package name */
    public int f93715i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f93710d = null;

    /* renamed from: e, reason: collision with root package name */
    public long f93711e = 0;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.app.g5 f93714h = new com.tencent.mm.pluginsdk.model.app.g5();

    /* renamed from: m, reason: collision with root package name */
    public boolean f93716m = true;

    public WXPayEntryActivity() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "Constructor");
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public void W6(java.lang.String str) {
        java.lang.String str2 = str == null ? "" : str;
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayEntryActivity", "WXPayEntryActivity finish with report, reason: ".concat(str2));
        java.lang.String l17 = getIntent() != null ? com.tencent.mm.sdk.platformtools.c2.l(getIntent(), com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE) : "";
        java.lang.String l18 = getIntent() != null ? com.tencent.mm.sdk.platformtools.c2.l(getIntent(), "_wxapi_payreq_prepayid") : "";
        java.lang.String l19 = getIntent() != null ? com.tencent.mm.sdk.platformtools.c2.l(getIntent(), "_wxapi_payreq_partnerid") : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayEntryActivity", "reportPkgName: %s, reportPrepayId: %s, reportPartnerId: %s", l17, l18, l19);
        if ("intent is null".equals(str2)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(36486, "9", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "", "", "apppay", "", "", "");
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
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(36486, "9", "11", "", "", "apppay", l17, l19, l18);
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
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(36486, "9", "12", "", "", "apppay", l17, l19, l18);
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
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(36486, "9", "13", "", str2, "apppay", l17, l19, l18);
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
    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X6(com.tencent.mm.pluginsdk.ui.p r27, android.content.Intent r28) {
        /*
            Method dump skipped, instructions count: 1696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.base.stub.WXPayEntryActivity.X6(com.tencent.mm.pluginsdk.ui.p, android.content.Intent):void");
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public boolean Y6(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "preLogin");
        return true;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity
    public boolean Z6() {
        return true;
    }

    public final java.lang.String a7() {
        com.tencent.mm.pluginsdk.model.app.i5 i5Var = this.f93713g;
        return i5Var != null ? i5Var.a(this.f93710d) : this.f93710d;
    }

    public final com.tencent.mm.opensdk.modelpay.PayReq b7() {
        com.tencent.mm.opensdk.modelpay.PayReq jointPayReq = com.tencent.mm.sdk.platformtools.c2.f(getIntent().getExtras(), "_wxapi_command_type", 0) == 27 ? new com.tencent.mm.opensdk.modelpay.WXJointPay.JointPayReq() : new com.tencent.mm.opensdk.modelpay.PayReq();
        jointPayReq.fromBundle(com.tencent.mm.sdk.platformtools.c2.e(getIntent()));
        return jointPayReq;
    }

    public final void c7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "sendPayResponse");
        com.tencent.mm.opensdk.modelpay.PayReq b76 = b7();
        com.tencent.mm.opensdk.modelpay.PayReq.Options options = new com.tencent.mm.opensdk.modelpay.PayReq.Options();
        options.fromBundle(com.tencent.mm.sdk.platformtools.c2.e(getIntent()));
        com.tencent.mm.opensdk.modelpay.PayResp jointPayResp = com.tencent.mm.sdk.platformtools.c2.f(getIntent().getExtras(), "_wxapi_command_type", 0) == 27 ? new com.tencent.mm.opensdk.modelpay.WXJointPay.JointPayResp() : new com.tencent.mm.opensdk.modelpay.PayResp();
        jointPayResp.prepayId = b76.prepayId;
        jointPayResp.extData = b76.extData;
        jointPayResp.errCode = i17;
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(getIntent(), com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE);
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        com.tencent.mm.plugin.wallet_index.ui.j.a(this, l17, jointPayResp, options);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onBackPressed");
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onCreate");
        this.f93711e = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.c2.m(getIntent(), "key_auto_login_wizard_exit", true);
        super.onCreate(bundle);
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(getIntent(), com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE);
        java.lang.String l18 = com.tencent.mm.sdk.platformtools.c2.l(getIntent(), "_wxapi_payreq_prepayid");
        java.lang.String l19 = com.tencent.mm.sdk.platformtools.c2.l(getIntent(), "_wxapi_payreq_partnerid");
        long a17 = c01.id.a();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "reportStartActivitySuccess, source: open_sdk, reportPkgName: %s, reportPartnerId: %s, reportPrepayId: %s, localCurrentTimeMs: %d, serverTime: %d, costTimeMs: -1", l17, l19, l18, java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(a17));
        m05.i.f322570a.e(3, "open_sdk", l17 != null ? l17 : "", l19 != null ? l19 : "", l18 != null ? l18 : "", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(a17), -1L);
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onDestroy");
        super.onDestroy();
    }

    @Override // com.tencent.mm.pluginsdk.ui.AutoLoginActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onNewIntent");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onPause");
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRestart() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onRestart");
        super.onRestart();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onResume");
        super.onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onStart");
        super.onStart();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WXPayEntryActivity" + hashCode(), "onStop");
        super.onStop();
    }
}
