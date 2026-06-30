package com.tencent.mm.plugin.base.stub;

/* loaded from: classes8.dex */
public class d0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        synchronized (com.tencent.mm.plugin.base.stub.e0.class) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "Safe Launch WXBizEntry checkStartWXBizEntry intent:%s", com.tencent.mm.plugin.base.stub.e0.f93732b);
            android.content.Intent intent = com.tencent.mm.plugin.base.stub.e0.f93732b;
            if (intent == null) {
                return;
            }
            long longExtra = intent.getLongExtra("__BIZ_ENTRY_ENTER_ID", 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis() - longExtra;
            if (!com.tencent.mm.plugin.base.stub.e0.m(com.tencent.mm.plugin.base.stub.e0.f93732b) && java.lang.Math.abs(currentTimeMillis) < 5000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WXBizLogic", "Safe Launch WXBizEntry checkStartWXBizEntry startActivity costTime %d for enterId:%d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(longExtra));
                com.tencent.mm.plugin.base.stub.e0.f93732b.putExtra("__BIZ_ENTRY_FROM_RETRY", true);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                android.content.Intent intent2 = com.tencent.mm.plugin.base.stub.e0.f93732b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/base/stub/WXBizLogic", "doCheckStartWXBizEntry", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/base/stub/WXBizLogic", "doCheckStartWXBizEntry", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                synchronized (com.tencent.mm.plugin.base.stub.e0.class) {
                    com.tencent.mm.plugin.base.stub.e0.f93732b = null;
                    com.tencent.mm.plugin.base.stub.e0.q(30);
                }
            }
        }
    }
}
