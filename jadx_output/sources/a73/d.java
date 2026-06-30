package a73;

/* loaded from: classes15.dex */
public class d implements b73.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gwallet.GWalletUI f1931a;

    public d(com.tencent.mm.plugin.gwallet.GWalletUI gWalletUI) {
        this.f1931a = gWalletUI;
    }

    @Override // b73.g
    public void a(b73.j jVar) {
        boolean z17 = jVar.f18222a == 0;
        com.tencent.mm.plugin.gwallet.GWalletUI gWalletUI = this.f1931a;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GWalletUI", "Problem setting up in-app billing: " + jVar);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("RESPONSE_CODE", jVar.a());
            int i17 = com.tencent.mm.plugin.gwallet.GWalletUI.f142245f;
            gWalletUI.setResult(-1, intent);
            gWalletUI.finish();
            return;
        }
        if (!"com.tencent.mm.gwallet.ACTION_PAY_REQUEST".equals(gWalletUI.getIntent().getAction())) {
            gWalletUI.K6(gWalletUI.getIntent().getBooleanExtra("is_direct", true));
            return;
        }
        int i18 = com.tencent.mm.plugin.gwallet.GWalletUI.f142245f;
        android.content.Intent intent2 = gWalletUI.getIntent();
        java.lang.String stringExtra = intent2.getStringExtra("product_id");
        java.lang.String stringExtra2 = intent2.getStringExtra("developer_pay_load");
        b73.i iVar = gWalletUI.f142246d;
        a73.e eVar = new a73.e(gWalletUI);
        iVar.c("launchPurchaseFlow");
        try {
            android.os.Bundle e17 = ((j6.a) iVar.f18217b).e(3, iVar.f18216a.getPackageName(), stringExtra, "inapp", stringExtra2);
            int e18 = iVar.e(e17);
            if (e18 != 0) {
                eVar.a(new b73.j(e18, "Unable to buy item"), null);
            } else {
                android.app.PendingIntent pendingIntent = (android.app.PendingIntent) e17.getParcelable("BUY_INTENT");
                iVar.f18220e = 10001;
                iVar.f18221f = eVar;
                android.content.IntentSender intentSender = pendingIntent.getIntentSender();
                android.content.Intent intent3 = new android.content.Intent();
                java.lang.Integer num = 0;
                int intValue = num.intValue();
                java.lang.Integer num2 = 0;
                int intValue2 = num2.intValue();
                java.lang.Integer num3 = 0;
                gWalletUI.startIntentSenderForResult(intentSender, 10001, intent3, intValue, intValue2, num3.intValue());
            }
        } catch (android.content.IntentSender.SendIntentException e19) {
            iVar.g("SendIntentException while launching purchase flow for sku " + stringExtra);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IabHelper", e19, "", new java.lang.Object[0]);
            eVar.a(new b73.j(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_VALUEISNULL, "Failed to send intent."), null);
        } catch (android.os.RemoteException e27) {
            iVar.g("RemoteException while launching purchase flow for sku " + stringExtra);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IabHelper", e27, "", new java.lang.Object[0]);
            eVar.a(new b73.j(com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMNOTFOUND, "Remote exception while starting purchase flow"), null);
        }
    }
}
