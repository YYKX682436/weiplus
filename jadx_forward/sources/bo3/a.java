package bo3;

/* loaded from: classes.dex */
public final class a implements bo3.c {
    @Override // bo3.c
    public boolean a(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        android.content.Intent intent2 = new android.content.Intent(intent);
        intent2.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1932x64db885e.ui.ActivityC16747x5b999322.class);
        intent2.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/nfc_open/logic/BusCardRechargeNfcProcessor", "process", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/nfc_open/logic/BusCardRechargeNfcProcessor", "process", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Nfc.BusCardRechargeNfcProcessor", "process, intent to start NfcWebViewUI is unavailable");
            return false;
        }
    }

    @Override // bo3.c
    /* renamed from: getName */
    public java.lang.String mo10961xfb82e301() {
        return "BusCardRecharge";
    }

    @Override // bo3.c
    /* renamed from: getPriority */
    public int mo10962x3662b71a() {
        return Integer.MAX_VALUE;
    }
}
