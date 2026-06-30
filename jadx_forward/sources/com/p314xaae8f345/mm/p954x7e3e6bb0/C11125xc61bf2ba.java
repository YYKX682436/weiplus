package com.p314xaae8f345.mm.p954x7e3e6bb0;

/* renamed from: com.tencent.mm.modelmulti.NotifyFreqLimit */
/* loaded from: classes.dex */
public class C11125xc61bf2ba extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f152790a = new byte[0];

    static {
        new java.util.LinkedList();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        try {
            synchronized (f152790a) {
                if (intent != null) {
                    if ("com.tencent.mm.NotifyFreqLimit.AlarmReceiver".equals(intent.getAction())) {
                        long longExtra = intent.getLongExtra("hashCode", 0L);
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        long currentTimeMillis = java.lang.System.currentTimeMillis() - longExtra;
                        int intExtra = intent.getIntExtra("pid", 0);
                        long longExtra2 = intent.getLongExtra("delaySecond", 0L) * 1000;
                        int myPid = android.os.Process.myPid();
                        long id6 = java.lang.Thread.currentThread().getId();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyFreqLimit", "AlarmReceiver(%s) onReceive alarmPid:%s my[%s:%s] timediff:%s delay:%s sender:%s func:%s", java.lang.Long.valueOf(longExtra), java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(myPid), java.lang.Long.valueOf(id6), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(longExtra2), null, null);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(99L, 156L, 1L, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotifyFreqLimit", "AlarmReceiver(%s) onReceive ERR: SENDER NULL alarmPid:%s my[%s:%s] timediff:%s delay:%s sender:%s func:%s", java.lang.Long.valueOf(longExtra), java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(myPid), java.lang.Long.valueOf(id6), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(longExtra2), null, null);
                        return;
                    }
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = intent == null ? "intent is null" : intent.getAction();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotifyFreqLimit", "AlarmReceiver onReceive intent:%s", objArr);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(99L, 151L, 1L, false);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotifyFreqLimit", "AlarmReceiver onReceive e:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(th6));
        }
    }
}
