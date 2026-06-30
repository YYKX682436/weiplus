package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes8.dex */
public class d0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizLogic", "Safe Launch WXBizEntry checkStartWXBizEntry intent:%s", com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.f175265b);
            android.content.Intent intent = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.f175265b;
            if (intent == null) {
                return;
            }
            long longExtra = intent.getLongExtra("__BIZ_ENTRY_ENTER_ID", 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis() - longExtra;
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.m(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.f175265b) && java.lang.Math.abs(currentTimeMillis) < 5000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXBizLogic", "Safe Launch WXBizEntry checkStartWXBizEntry startActivity costTime %d for enterId:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(longExtra));
                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.f175265b.putExtra("__BIZ_ENTRY_FROM_RETRY", true);
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                android.content.Intent intent2 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.f175265b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/base/stub/WXBizLogic", "doCheckStartWXBizEntry", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/base/stub/WXBizLogic", "doCheckStartWXBizEntry", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.class) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.f175265b = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.q(30);
                }
            }
        }
    }
}
