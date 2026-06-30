package com.tencent.mm.plugin.base.stub;

/* loaded from: classes8.dex */
public class g1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f93749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.WXPayEntryActivity f93750e;

    public g1(com.tencent.mm.plugin.base.stub.WXPayEntryActivity wXPayEntryActivity, android.content.Intent intent) {
        this.f93750e = wXPayEntryActivity;
        this.f93749d = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.WXPayEntryActivity", "postLogin, cross platform cashier is paying");
        android.content.Intent intent = this.f93749d;
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE);
        java.lang.String l18 = com.tencent.mm.sdk.platformtools.c2.l(intent, "_wxapi_payreq_prepayid");
        java.lang.String l19 = com.tencent.mm.sdk.platformtools.c2.l(intent, "_wxapi_payreq_partnerid");
        if (l17 == null) {
            l17 = "";
        }
        if (l19 == null) {
            l19 = "";
        }
        if (l18 == null) {
            l18 = "";
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(36486, "9", "9", "", "", "apppay", l17, l19, l18);
        this.f93750e.finish();
    }
}
