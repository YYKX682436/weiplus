package a73;

/* loaded from: classes15.dex */
public class g extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gwallet.GWalletUI f1935a;

    public g(com.tencent.mm.plugin.gwallet.GWalletUI gWalletUI) {
        this.f1935a = gWalletUI;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST".equals(intent.getAction())) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("tokens");
            boolean booleanExtra = intent.getBooleanExtra("IS_FAILED_CONSUME", false);
            com.tencent.mm.plugin.gwallet.GWalletUI gWalletUI = this.f1935a;
            if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                int i17 = com.tencent.mm.plugin.gwallet.GWalletUI.f142245f;
                gWalletUI.setResult(0, null);
                gWalletUI.finish();
            } else {
                b73.i iVar = gWalletUI.f142246d;
                a73.f fVar = new a73.f(this, booleanExtra);
                iVar.getClass();
                s75.d.b(new b73.d(iVar, stringArrayListExtra, fVar, new com.tencent.mm.sdk.platformtools.n3()), "IabHelper_consumeAsync");
            }
        }
    }
}
