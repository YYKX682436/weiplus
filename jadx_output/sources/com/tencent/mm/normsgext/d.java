package com.tencent.mm.normsgext;

/* loaded from: classes10.dex */
final class d {

    /* loaded from: classes10.dex */
    public static final class m {
        static {
            java.lang.StringBuilder reverse = new java.lang.StringBuilder("tahcew").reverse();
            reverse.append(new java.lang.StringBuilder("txegsmron").reverse().toString());
            java.lang.String sb6 = reverse.toString();
            if (android.os.Process.myPid() != android.os.Process.myTid()) {
                java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                new android.os.Handler(android.os.Looper.getMainLooper()).postAtFrontOfQueue(new com.tencent.mm.normsgext.e(sb6, countDownLatch));
                try {
                    countDownLatch.await();
                    return;
                } catch (java.lang.Throwable unused) {
                    return;
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(sb6);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/normsgext/d$m", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/normsgext/d$m", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }

        public static native boolean ba(int i17, byte[] bArr, int i18, int i19, com.tencent.mm.normsgext.QValue<java.lang.Integer> qValue, com.tencent.mm.normsgext.QValue<java.lang.Integer> qValue2, com.tencent.mm.normsgext.QValue<byte[]> qValue3);
    }

    /* loaded from: classes13.dex */
    public static final class n {

        /* renamed from: a, reason: collision with root package name */
        public static volatile com.tencent.mm.normsgext.a f72220a;

        public static synchronized void c0(com.tencent.mm.normsgext.a aVar) {
            synchronized (com.tencent.mm.normsgext.d.n.class) {
                f72220a = aVar;
            }
        }

        public static synchronized java.lang.String c1() {
            synchronized (com.tencent.mm.normsgext.d.n.class) {
                if (f72220a == null) {
                    return "";
                }
                f72220a.getClass();
                return "";
            }
        }

        private static java.lang.String c10() {
            if (f72220a == null) {
                return "";
            }
            ((com.tencent.mm.plugin.normsg.u) f72220a).getClass();
            return wo.w0.k();
        }

        private static boolean c11(java.lang.String str, byte[] bArr) {
            if (f72220a != null) {
                return ((com.tencent.mm.plugin.normsg.u) f72220a).Zi(str, bArr);
            }
            return false;
        }

        private static byte[] c12(java.lang.String str) {
            return f72220a != null ? ((com.tencent.mm.plugin.normsg.u) f72220a).Bi(str) : new byte[0];
        }

        private static void c13(java.lang.String str) {
            if (f72220a != null) {
                ((com.tencent.mm.plugin.normsg.u) f72220a).aj(str);
            }
        }

        private static java.lang.String c14() {
            return f72220a != null ? ((com.tencent.mm.plugin.normsg.u) f72220a).k9() : "";
        }

        private static java.lang.String c15(android.content.Context context, java.lang.String str) {
            return f72220a != null ? ((com.tencent.mm.plugin.normsg.u) f72220a).Ai(context, str) : str;
        }

        private static boolean c16(android.content.Context context) {
            if (f72220a != null) {
                return ((com.tencent.mm.plugin.normsg.u) f72220a).Ni(context);
            }
            return false;
        }

        public static synchronized long c2() {
            synchronized (com.tencent.mm.normsgext.d.n.class) {
                if (f72220a == null) {
                    return 0L;
                }
                return ((com.tencent.mm.plugin.normsg.u) f72220a).Di();
            }
        }

        public static synchronized void c3(int i17, java.lang.String str) {
            synchronized (com.tencent.mm.normsgext.d.n.class) {
                if (f72220a != null) {
                    ((com.tencent.mm.plugin.normsg.u) f72220a).getClass();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
                }
            }
        }

        public static synchronized void c4(int i17, int i18, int i19) {
            synchronized (com.tencent.mm.normsgext.d.n.class) {
                if (f72220a != null) {
                    ((com.tencent.mm.plugin.normsg.u) f72220a).getClass();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(i17, i18, i19);
                }
            }
        }

        public static synchronized void c5(int i17, int i18, int i19, int i27) {
            synchronized (com.tencent.mm.normsgext.d.n.class) {
                if (f72220a != null) {
                    ((com.tencent.mm.plugin.normsg.u) f72220a).getClass();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.m(i17, i18, i19, i27, true);
                }
            }
        }

        public static synchronized java.lang.String c6() {
            synchronized (com.tencent.mm.normsgext.d.n.class) {
            }
            return "";
        }

        public static synchronized java.lang.String c7() {
            synchronized (com.tencent.mm.normsgext.d.n.class) {
                if (f72220a == null) {
                    return "";
                }
                ((com.tencent.mm.plugin.normsg.u) f72220a).getClass();
                java.lang.String str = re4.u.a().f394553a;
                if (str == null) {
                    str = "";
                }
                return str;
            }
        }

        private static boolean c8() {
            if (f72220a == null) {
                return false;
            }
            ((com.tencent.mm.plugin.normsg.u) f72220a).getClass();
            return ko3.r0.f309996b;
        }

        private static java.lang.String c9() {
            if (f72220a == null) {
                return "";
            }
            ((com.tencent.mm.plugin.normsg.u) f72220a).getClass();
            java.lang.String str = re4.u.a().f394554b;
            return str != null ? str : "";
        }
    }
}
