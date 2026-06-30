package a73;

/* loaded from: classes15.dex */
public class d implements b73.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.ActivityC16083x362a71b4 f83464a;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.ActivityC16083x362a71b4 activityC16083x362a71b4) {
        this.f83464a = activityC16083x362a71b4;
    }

    @Override // b73.g
    public void a(b73.j jVar) {
        boolean z17 = jVar.f99755a == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.ActivityC16083x362a71b4 activityC16083x362a71b4 = this.f83464a;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GWalletUI", "Problem setting up in-app billing: " + jVar);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("RESPONSE_CODE", jVar.a());
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.ActivityC16083x362a71b4.f223778f;
            activityC16083x362a71b4.setResult(-1, intent);
            activityC16083x362a71b4.finish();
            return;
        }
        if (!"com.tencent.mm.gwallet.ACTION_PAY_REQUEST".equals(activityC16083x362a71b4.getIntent().getAction())) {
            activityC16083x362a71b4.K6(activityC16083x362a71b4.getIntent().getBooleanExtra("is_direct", true));
            return;
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.ActivityC16083x362a71b4.f223778f;
        android.content.Intent intent2 = activityC16083x362a71b4.getIntent();
        java.lang.String stringExtra = intent2.getStringExtra("product_id");
        java.lang.String stringExtra2 = intent2.getStringExtra("developer_pay_load");
        b73.i iVar = activityC16083x362a71b4.f223779d;
        a73.e eVar = new a73.e(activityC16083x362a71b4);
        iVar.c("launchPurchaseFlow");
        try {
            android.os.Bundle e17 = ((j6.a) iVar.f99750b).e(3, iVar.f99749a.getPackageName(), stringExtra, "inapp", stringExtra2);
            int e18 = iVar.e(e17);
            if (e18 != 0) {
                eVar.a(new b73.j(e18, "Unable to buy item"), null);
            } else {
                android.app.PendingIntent pendingIntent = (android.app.PendingIntent) e17.getParcelable("BUY_INTENT");
                iVar.f99753e = 10001;
                iVar.f99754f = eVar;
                android.content.IntentSender intentSender = pendingIntent.getIntentSender();
                android.content.Intent intent3 = new android.content.Intent();
                java.lang.Integer num = 0;
                int intValue = num.intValue();
                java.lang.Integer num2 = 0;
                int intValue2 = num2.intValue();
                java.lang.Integer num3 = 0;
                activityC16083x362a71b4.startIntentSenderForResult(intentSender, 10001, intent3, intValue, intValue2, num3.intValue());
            }
        } catch (android.content.IntentSender.SendIntentException e19) {
            iVar.g("SendIntentException while launching purchase flow for sku " + stringExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IabHelper", e19, "", new java.lang.Object[0]);
            eVar.a(new b73.j(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15120x37ee42f0, "Failed to send intent."), null);
        } catch (android.os.RemoteException e27) {
            iVar.g("RemoteException while launching purchase flow for sku " + stringExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.IabHelper", e27, "", new java.lang.Object[0]);
            eVar.a(new b73.j(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15116xa552212a, "Remote exception while starting purchase flow"), null);
        }
    }
}
