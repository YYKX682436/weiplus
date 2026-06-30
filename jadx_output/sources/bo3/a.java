package bo3;

/* loaded from: classes.dex */
public final class a implements bo3.c {
    @Override // bo3.c
    public boolean a(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        android.content.Intent intent2 = new android.content.Intent(intent);
        intent2.setClass(context, com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI.class);
        intent2.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/nfc_open/logic/BusCardRechargeNfcProcessor", "process", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/nfc_open/logic/BusCardRechargeNfcProcessor", "process", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Nfc.BusCardRechargeNfcProcessor", "process, intent to start NfcWebViewUI is unavailable");
            return false;
        }
    }

    @Override // bo3.c
    public java.lang.String getName() {
        return "BusCardRecharge";
    }

    @Override // bo3.c
    public int getPriority() {
        return Integer.MAX_VALUE;
    }
}
