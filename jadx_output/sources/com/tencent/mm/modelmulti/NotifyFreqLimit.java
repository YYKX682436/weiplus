package com.tencent.mm.modelmulti;

/* loaded from: classes.dex */
public class NotifyFreqLimit extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f71257a = new byte[0];

    static {
        new java.util.LinkedList();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        try {
            synchronized (f71257a) {
                if (intent != null) {
                    if ("com.tencent.mm.NotifyFreqLimit.AlarmReceiver".equals(intent.getAction())) {
                        long longExtra = intent.getLongExtra("hashCode", 0L);
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        long currentTimeMillis = java.lang.System.currentTimeMillis() - longExtra;
                        int intExtra = intent.getIntExtra("pid", 0);
                        long longExtra2 = intent.getLongExtra("delaySecond", 0L) * 1000;
                        int myPid = android.os.Process.myPid();
                        long id6 = java.lang.Thread.currentThread().getId();
                        com.tencent.mars.xlog.Log.i("MicroMsg.NotifyFreqLimit", "AlarmReceiver(%s) onReceive alarmPid:%s my[%s:%s] timediff:%s delay:%s sender:%s func:%s", java.lang.Long.valueOf(longExtra), java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(myPid), java.lang.Long.valueOf(id6), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(longExtra2), null, null);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(99L, 156L, 1L, false);
                        com.tencent.mars.xlog.Log.e("MicroMsg.NotifyFreqLimit", "AlarmReceiver(%s) onReceive ERR: SENDER NULL alarmPid:%s my[%s:%s] timediff:%s delay:%s sender:%s func:%s", java.lang.Long.valueOf(longExtra), java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(myPid), java.lang.Long.valueOf(id6), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(longExtra2), null, null);
                        return;
                    }
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = intent == null ? "intent is null" : intent.getAction();
                com.tencent.mars.xlog.Log.e("MicroMsg.NotifyFreqLimit", "AlarmReceiver onReceive intent:%s", objArr);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(99L, 151L, 1L, false);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.NotifyFreqLimit", "AlarmReceiver onReceive e:%s", com.tencent.mm.sdk.platformtools.z3.c(th6));
        }
    }
}
