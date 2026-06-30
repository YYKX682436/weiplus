package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class Log extends com.p314xaae8f345.p542x3306d5.p550x382fcc.Log {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f273946a = 0;

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19724x6219b84 = 6;
    }

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8;
        if (interfaceC4601x87fc7208 == null || interfaceC4601x87fc7208.mo40548xf2ceb016(0L) > 1) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        sb6.append("  ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8.mo40555x32c585(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), sb6.toString());
    }

    public static void b(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8;
        if (interfaceC4601x87fc7208 == null || interfaceC4601x87fc7208.mo40548xf2ceb016(0L) > 4) {
            return;
        }
        java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        if (format == null) {
            format = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8.mo40552x32c580(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format + "  " + android.util.Log.getStackTraceString(th6));
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8;
        if (interfaceC4601x87fc7208 == null || interfaceC4601x87fc7208.mo40548xf2ceb016(0L) > 2) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        sb6.append("  ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8.mo40555x32c585(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), sb6.toString());
    }

    public static void g(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8;
        if (interfaceC4601x87fc7208 == null || interfaceC4601x87fc7208.mo40548xf2ceb016(0L) > 4) {
            return;
        }
        java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        if (format == null) {
            format = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8.mo40555x32c585(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format + "  " + android.util.Log.getStackTraceString(th6));
    }

    public static void h(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8;
        if (interfaceC4601x87fc7208 == null || interfaceC4601x87fc7208.mo40548xf2ceb016(0L) > 4) {
            return;
        }
        java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        if (format == null) {
            format = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8.mo40557x32c593(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format + "  " + android.util.Log.getStackTraceString(th6));
    }

    public static com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 j(com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc7208) {
        final java.util.ArrayList<com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4603xdc0e824d> m40576x187c394f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 interfaceC4601x87fc72082 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19725xbe9785e8 = interfaceC4601x87fc7208;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f19723x20a68ff1 = null;
        if ((interfaceC4601x87fc72082 instanceof com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4604x3c6e5e3f) && (m40576x187c394f = ((com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4604x3c6e5e3f) interfaceC4601x87fc72082).m40576x187c394f(interfaceC4601x87fc7208)) != null) {
            ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: com.tencent.mm.sdk.platformtools.o2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.Iterator it = m40576x187c394f.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PendingLogs", ((com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.C4603xdc0e824d) it.next()).m40574x6bfa1bcd());
                    }
                }
            });
        }
        return interfaceC4601x87fc72082;
    }
}
