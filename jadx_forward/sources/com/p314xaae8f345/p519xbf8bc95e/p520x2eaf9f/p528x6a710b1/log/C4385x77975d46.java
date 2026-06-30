package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log;

/* renamed from: com.tencent.mapsdk.core.utils.log.LogUtil */
/* loaded from: classes13.dex */
public class C4385x77975d46 {

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.Map<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky> f130278a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky f130279b;

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky a(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar;
        java.util.Map<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky> map = f130278a;
        if (map.containsKey(java.lang.Integer.valueOf(i17)) && (kyVar = map.get(java.lang.Integer.valueOf(i17))) != null) {
            return kyVar;
        }
        if (f130279b == null) {
            f130279b = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky.class, "Methods invoke by default Logger !");
        }
        return f130279b;
    }

    public static void b(int i17) {
        java.util.Map<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky> map = f130278a;
        if (map.containsKey(java.lang.Integer.valueOf(i17))) {
            map.remove(java.lang.Integer.valueOf(i17));
        }
    }

    public static void c(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.c(str, str2);
        } else {
            f(str, str2);
        }
    }

    private static void d(java.lang.String str, java.lang.Throwable th6) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.a(str, th6);
        } else {
            f(str, th6);
        }
    }

    private static void e(java.lang.String str, java.lang.Throwable th6) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.c(str, th6);
        } else {
            f(str, th6);
        }
    }

    private static void f(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.a(str);
        } else {
            java.lang.System.out.println(str);
        }
    }

    private static void g(java.lang.String str) {
        java.lang.System.out.println(str);
    }

    /* renamed from: printNativeLog */
    public static void m36140x16236f80(java.lang.String str, java.lang.String str2) {
        java.util.Map<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky> map = f130278a;
        if (map.isEmpty()) {
            return;
        }
        a(((java.lang.Integer) new java.util.ArrayList(map.keySet()).get(0)).intValue()).b(str, str2);
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.b(str, str2);
        } else {
            f(str, str2);
        }
    }

    public static void c(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.d(str);
        } else {
            java.lang.System.out.println(str);
        }
    }

    private static void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.a(str, str2, th6);
        } else {
            f(str, str2, th6);
        }
    }

    private static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.c(str, str2, th6);
        } else {
            f(str, str2, th6);
        }
    }

    private static void f(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        java.lang.System.out.println("[" + str + "]:" + str2 + th6);
    }

    public static void b(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.c(str);
        } else {
            java.lang.System.out.println(str);
        }
    }

    private static void f(java.lang.String str, java.lang.Throwable th6) {
        java.lang.System.out.println(str + th6);
    }

    public static void c(java.lang.String str, java.lang.Throwable th6) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.e(str, th6);
        } else {
            f(str, th6);
        }
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.d(str, str2);
        } else {
            f(str, str2);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.e(str, str2);
        } else {
            f(str, str2);
        }
    }

    public static void a(int i17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar) {
        java.util.Map<java.lang.Integer, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky> map = f130278a;
        if (map.containsKey(java.lang.Integer.valueOf(i17))) {
            return;
        }
        map.put(java.lang.Integer.valueOf(i17), kyVar);
    }

    private static void f(java.lang.String str, java.lang.String str2) {
        java.lang.System.out.println("[" + str + "]:" + str2);
    }

    public static void b(java.lang.String str, java.lang.Throwable th6) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.d(str, th6);
        } else {
            f(str, th6);
        }
    }

    public static void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar) {
        f130279b = kyVar;
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.e(str, str2, th6);
        } else {
            f(str, str2, th6);
        }
    }

    public static void d(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.e(str);
        } else {
            java.lang.System.out.println(str);
        }
    }

    public static boolean e(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            return kyVar.a(3, str);
        }
        return false;
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.a(str, str2);
        } else {
            f(str, str2);
        }
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.d(str, str2, th6);
        } else {
            f(str, str2, th6);
        }
    }

    public static void a(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.b(str);
        } else {
            java.lang.System.out.println(str);
        }
    }

    public static void a(java.lang.String str, java.lang.Throwable th6) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.b(str, th6);
        } else {
            f(str, th6);
        }
    }

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            kyVar.b(str, str2, th6);
        } else {
            f(str, str2, th6);
        }
    }

    public static java.lang.String a() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ky kyVar = f130279b;
        if (kyVar != null) {
            return kyVar.c();
        }
        return null;
    }
}
