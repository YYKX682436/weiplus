package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public class s0 implements java.lang.Runnable {
    public s0(com.p314xaae8f345.mm.p642xad8b531f.u0 u0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyReceiver", "checkKillProcess, canKillProcess :%b", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.f144797h));
        synchronized (com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.f144794e) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 c4549xd1736fd9 = com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.f144790a;
            if (c4549xd1736fd9 != null) {
                c4549xd1736fd9.mo40017xcdd95364();
            }
            com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.f144790a = null;
        }
        if (com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.f144797h) {
            ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).getClass();
            com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l0.f145034a.c(-1, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
            int myPid = android.os.Process.myPid();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(myPid));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/booter/NotifyReceiver$NotifyIOnSceneEnd$2", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/booter/NotifyReceiver$NotifyIOnSceneEnd$2", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }
}
