package com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10;

/* loaded from: classes13.dex */
public class g extends android.content.BroadcastReceiver {
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u uVar) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        try {
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormsgSourceImpl", "[+] Explained by src, g1.");
                return;
            }
            if ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction()) && intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormsgSourceImpl", "[+] Explained by src, g2.");
            } else {
                if (!"android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                    return;
                }
                w04.l.INSTANCE.ic(intent);
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NormsgSourceImpl", "[+] Explained by src, g3.");
        }
    }
}
