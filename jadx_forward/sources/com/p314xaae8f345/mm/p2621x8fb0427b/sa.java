package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public final class sa implements com.p314xaae8f345.mm.app.y2 {
    @Override // com.p314xaae8f345.mm.app.y2
    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentTask", "isScreenOff : " + z17 + ", mCreateIndexThreadRunning = " + com.p314xaae8f345.mm.p2621x8fb0427b.va.f277823b);
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mTaskQueue.size = ");
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = com.p314xaae8f345.mm.p2621x8fb0427b.va.f277824c;
            sb6.append(concurrentLinkedQueue.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentTask", sb6.toString());
            if (com.p314xaae8f345.mm.p2621x8fb0427b.va.f277823b || concurrentLinkedQueue.isEmpty()) {
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.va.f277823b = true;
            com.p314xaae8f345.mm.p2621x8fb0427b.ra raVar = com.p314xaae8f345.mm.p2621x8fb0427b.ra.f276816d;
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.add(5, 1);
            calendar.set(11, 2);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis();
            long currentTimeMillis = (timeInMillis - java.lang.System.currentTimeMillis()) + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R(600000, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentTask", "targetTimeStamp = " + timeInMillis);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentTask", "delayTime = " + currentTimeMillis);
            com.p314xaae8f345.mm.p2621x8fb0427b.va.f277825d = ((ku5.t0) ku5.t0.f394148d).l(raVar, currentTimeMillis, "Silent-Task-Thread");
            return;
        }
        try {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.va.f277823b) {
                com.p314xaae8f345.mm.p2621x8fb0427b.va.f277823b = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentTask", "delayTask canceled");
                java.util.concurrent.Future future = com.p314xaae8f345.mm.p2621x8fb0427b.va.f277825d;
                if (future != null) {
                    future.cancel(true);
                }
                if (d95.f.f309203p) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentTask", "isVacuuming, kill self");
                    jx3.f.INSTANCE.d(25824, "", "", 0, 0, 0, "wakeup-kill", 0, 0, 0, 0, 0, 0);
                    int myPid = android.os.Process.myPid();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(myPid));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/storage/SilentTask$1", "onScreen", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(obj, "com/tencent/mm/storage/SilentTask$1", "onScreen", "(Z)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SilentTask", "delayTask cancel error : " + th6.getMessage());
        }
    }
}
