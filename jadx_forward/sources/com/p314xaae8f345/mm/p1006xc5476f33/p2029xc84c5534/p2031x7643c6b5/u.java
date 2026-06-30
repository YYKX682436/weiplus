package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes11.dex */
public class u implements java.lang.Runnable {
    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5 c17196xafa566d5) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.k2.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVCommCrossProcessReceiver", "KVCommCrossProcessReceiver shut_down_weixin need to kill process");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
            com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37523x79d8456e(0);
            if (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()) {
                com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84236x79d8456e(0);
            }
            int myPid = android.os.Process.myPid();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(myPid));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/report/service/KVCommCrossProcessReceiver$4", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(obj, "com/tencent/mm/plugin/report/service/KVCommCrossProcessReceiver$4", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }
}
