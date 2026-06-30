package com.p314xaae8f345.mm.p977xf15b111;

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
                new android.os.Handler(android.os.Looper.getMainLooper()).postAtFrontOfQueue(new com.p314xaae8f345.mm.p977xf15b111.e(sb6, countDownLatch));
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
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/normsgext/d$m", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }

        public static native boolean ba(int i17, byte[] bArr, int i18, int i19, com.p314xaae8f345.mm.p977xf15b111.C11194x8f222ba0<java.lang.Integer> c11194x8f222ba0, com.p314xaae8f345.mm.p977xf15b111.C11194x8f222ba0<java.lang.Integer> c11194x8f222ba02, com.p314xaae8f345.mm.p977xf15b111.C11194x8f222ba0<byte[]> c11194x8f222ba03);
    }

    /* loaded from: classes13.dex */
    public static final class n {

        /* renamed from: a, reason: collision with root package name */
        public static volatile com.p314xaae8f345.mm.p977xf15b111.a f153753a;

        public static synchronized void c0(com.p314xaae8f345.mm.p977xf15b111.a aVar) {
            synchronized (com.tencent.mm.normsgext.d.n.class) {
                f153753a = aVar;
            }
        }

        public static synchronized java.lang.String c1() {
            synchronized (com.tencent.mm.normsgext.d.n.class) {
                if (f153753a == null) {
                    return "";
                }
                f153753a.getClass();
                return "";
            }
        }

        private static java.lang.String c10() {
            if (f153753a == null) {
                return "";
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153753a).getClass();
            return wo.w0.k();
        }

        private static boolean c11(java.lang.String str, byte[] bArr) {
            if (f153753a != null) {
                return ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153753a).Zi(str, bArr);
            }
            return false;
        }

        private static byte[] c12(java.lang.String str) {
            return f153753a != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153753a).Bi(str) : new byte[0];
        }

        private static void c13(java.lang.String str) {
            if (f153753a != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153753a).aj(str);
            }
        }

        private static java.lang.String c14() {
            return f153753a != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153753a).k9() : "";
        }

        private static java.lang.String c15(android.content.Context context, java.lang.String str) {
            return f153753a != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153753a).Ai(context, str) : str;
        }

        private static boolean c16(android.content.Context context) {
            if (f153753a != null) {
                return ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153753a).Ni(context);
            }
            return false;
        }

        public static synchronized long c2() {
            synchronized (com.tencent.mm.normsgext.d.n.class) {
                if (f153753a == null) {
                    return 0L;
                }
                return ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153753a).Di();
            }
        }

        public static synchronized void c3(int i17, java.lang.String str) {
            synchronized (com.tencent.mm.normsgext.d.n.class) {
                if (f153753a != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153753a).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(i17, str);
                }
            }
        }

        public static synchronized void c4(int i17, int i18, int i19) {
            synchronized (com.tencent.mm.normsgext.d.n.class) {
                if (f153753a != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153753a).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(i17, i18, i19);
                }
            }
        }

        public static synchronized void c5(int i17, int i18, int i19, int i27) {
            synchronized (com.tencent.mm.normsgext.d.n.class) {
                if (f153753a != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153753a).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.m(i17, i18, i19, i27, true);
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
                if (f153753a == null) {
                    return "";
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153753a).getClass();
                java.lang.String str = re4.u.a().f476086a;
                if (str == null) {
                    str = "";
                }
                return str;
            }
        }

        private static boolean c8() {
            if (f153753a == null) {
                return false;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153753a).getClass();
            return ko3.r0.f391529b;
        }

        private static java.lang.String c9() {
            if (f153753a == null) {
                return "";
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153753a).getClass();
            java.lang.String str = re4.u.a().f476087b;
            return str != null ? str : "";
        }
    }
}
