package com.tencent.mm.normsg;

/* loaded from: classes13.dex */
final class c {

    /* loaded from: classes13.dex */
    public static final class p {
        static {
            java.lang.StringBuilder reverse = new java.lang.StringBuilder("tahcew").reverse();
            reverse.append(new java.lang.StringBuilder("gsmron").reverse().toString());
            java.lang.String sb6 = reverse.toString();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(sb6);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/normsg/c$p", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/normsg/c$p", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }

        public static native byte[] aa(int i17, int i18, int i19, byte[] bArr);

        public static native boolean ab();

        public static native java.lang.String ac(java.lang.String str, boolean z17);

        public static native byte[] ad();

        public static native byte[] ae(int i17);

        public static native byte[] af(int i17);

        public static native boolean ag();

        public static native boolean ah();

        public static native boolean ai();

        public static native boolean aj();

        public static native void ak();

        public static native boolean al();

        public static native byte[] am(android.content.Intent intent);

        public static native byte[] an(java.lang.String str, long j17, java.lang.String str2, int i17);

        public static native int ao();

        public static native byte[] ap(int i17, java.lang.String str, long j17, int i18, java.lang.String str2);

        public static native byte[] aq(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17);

        public static native byte[] ar(long j17, java.lang.Object obj, java.lang.Object obj2, long j18, java.lang.Object obj3, java.lang.Object obj4);

        public static native byte[] as(byte[] bArr);

        public static native byte[] at(int i17, java.util.List<com.tencent.mm.normsg.j> list, int i18);

        public static native byte[] au(byte[] bArr);

        public static native java.lang.String ba(int i17);

        public static native java.lang.String bb(int i17);

        public static native boolean bc(int i17, byte[] bArr, int i18, int i19, com.tencent.mm.normsg.PValue<java.lang.Integer> pValue, com.tencent.mm.normsg.PValue<java.lang.Integer> pValue2, com.tencent.mm.normsg.PValue<byte[]> pValue3);

        public static native boolean bd(byte[] bArr, int i17, int i18, com.tencent.mm.normsg.PValue<byte[]> pValue, com.tencent.mm.normsg.PValue<byte[]> pValue2);

        public static native boolean be(byte[] bArr, int i17, int i18, com.tencent.mm.normsg.PValue<byte[]> pValue, com.tencent.mm.normsg.PValue<byte[]> pValue2);

        public static native boolean ca(java.lang.Object obj, java.lang.Class<?> cls);

        public static native boolean cb(java.lang.Object obj);

        public static native void da(java.lang.String str);

        public static native void db(java.lang.String str);

        public static native void dc(java.lang.String str);

        public static native boolean dd(java.lang.String str);

        public static native byte[] de(java.lang.String str);

        public static native void df(java.lang.String str, java.lang.String str2, java.lang.String str3);

        public static native void dg(java.lang.String str, android.view.MotionEvent motionEvent, int i17, java.lang.String str2, int i18);

        public static native void dh(java.lang.String str);

        public static native boolean di(java.lang.String str);

        public static native byte[] dj(java.lang.String str, java.lang.Object obj);

        public static native java.lang.String dk(java.lang.String str);

        public static native void dl(java.lang.String str, int i17);

        public static native boolean dm(java.lang.String str, android.view.MotionEvent motionEvent, java.lang.String str2);

        public static native byte[] dn(java.lang.String str);

        public static native void dp(java.lang.String str);

        public static native byte[] ea(int i17, int i18);

        public static native boolean eb(byte[] bArr, int i17, int i18);

        public static native boolean ec();

        public static native byte[] ed();

        public static native byte[] ee();

        public static native java.lang.String ef();

        public static native java.lang.String eg();

        public static native java.lang.String eh();

        public static native void fa(java.lang.String str, int i17, int i18);

        public static native void fb(int i17, java.util.List<com.tencent.mm.normsg.h> list);

        public static native boolean fc();

        public static native void fd();

        public static native void fe(int i17);

        public static native void ff(int i17);

        public static native boolean fg(java.lang.String str);

        public static native void fh(java.lang.String str);

        public static native byte[] fi(java.lang.String str);

        public static native void fj(java.lang.String str);

        public static native void fk();

        public static native int fl(java.lang.String str);
    }

    /* loaded from: classes13.dex */
    public static final class q {

        /* renamed from: a, reason: collision with root package name */
        public static volatile com.tencent.mm.normsg.b f72193a;

        public static synchronized void c0(com.tencent.mm.normsg.b bVar) {
            synchronized (com.tencent.mm.normsg.c.q.class) {
                f72193a = bVar;
            }
        }

        public static synchronized java.lang.String c1() {
            synchronized (com.tencent.mm.normsg.c.q.class) {
                if (f72193a == null) {
                    return "";
                }
                f72193a.getClass();
                return "";
            }
        }

        private static java.lang.String c10() {
            if (f72193a == null) {
                return "";
            }
            ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
            return wo.w0.k();
        }

        private static boolean c11(java.lang.String str, byte[] bArr) {
            if (f72193a != null) {
                return ((com.tencent.mm.plugin.normsg.u) f72193a).Zi(str, bArr);
            }
            return false;
        }

        private static byte[] c12(java.lang.String str) {
            return f72193a != null ? ((com.tencent.mm.plugin.normsg.u) f72193a).Bi(str) : new byte[0];
        }

        private static void c13(java.lang.String str) {
            if (f72193a != null) {
                ((com.tencent.mm.plugin.normsg.u) f72193a).aj(str);
            }
        }

        private static java.lang.String c14() {
            return f72193a != null ? ((com.tencent.mm.plugin.normsg.u) f72193a).k9() : "";
        }

        private static java.lang.String c15(android.content.Context context, java.lang.String str) {
            return f72193a != null ? ((com.tencent.mm.plugin.normsg.u) f72193a).Ai(context, str) : str;
        }

        private static boolean c16(android.content.Context context) {
            if (f72193a != null) {
                return ((com.tencent.mm.plugin.normsg.u) f72193a).Ni(context);
            }
            return false;
        }

        private static boolean c17() {
            java.lang.String u17;
            if (f72193a == null) {
                return false;
            }
            ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
            try {
                u17 = (java.lang.String) gm0.j1.u().c().l(274436, null);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NormsgSourceImpl", th6, "[-] Error happened.", new java.lang.Object[0]);
                u17 = com.tencent.mm.sdk.platformtools.o4.M("mmkv_crossprocess_infos").u("mmkv_key_user_reg_ic", null);
            }
            if (android.text.TextUtils.isEmpty(u17)) {
                return true;
            }
            java.util.Set set = ko3.f0.f309955a;
            if (u11.c.f(u17)) {
                return true;
            }
            ko3.f0.f309955a.contains(u17.toUpperCase());
            return true;
        }

        private static java.lang.String c18(int i17) {
            if (f72193a == null) {
                return "";
            }
            ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
            return (i17 & 1) > 0 ? com.tencent.mm.sdk.platformtools.v0.f193027a.j(false) : com.tencent.mm.sdk.platformtools.v0.f193027a.j(true);
        }

        private static java.lang.String c19(int i17) {
            if (f72193a == null) {
                return "";
            }
            ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
            return (i17 & 1) > 0 ? com.tencent.mm.sdk.platformtools.v0.f193027a.f(false) : com.tencent.mm.sdk.platformtools.v0.f193027a.f(true);
        }

        public static synchronized long c2() {
            synchronized (com.tencent.mm.normsg.c.q.class) {
                if (f72193a == null) {
                    return 0L;
                }
                return ((com.tencent.mm.plugin.normsg.u) f72193a).Di();
            }
        }

        private static java.util.List<java.lang.String> c20() {
            if (f72193a == null) {
                return new java.util.ArrayList();
            }
            com.tencent.mm.plugin.normsg.u uVar = (com.tencent.mm.plugin.normsg.u) f72193a;
            uVar.getClass();
            try {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.Collections.sort(linkedList, new com.tencent.mm.plugin.normsg.k(uVar));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < linkedList.size(); i17++) {
                    java.lang.String str = ((com.tencent.mm.sdk.platformtools.u0) linkedList.get(i17)).f193001b;
                    if (!android.text.TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                        if (arrayList.size() >= 5) {
                            return arrayList;
                        }
                    }
                }
                return arrayList;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NormsgSourceImpl", th6, "[-] Error happened.", new java.lang.Object[0]);
                return new java.util.ArrayList();
            }
        }

        private static long c21() {
            if (f72193a == null) {
                return -1L;
            }
            ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
            try {
                return com.tencent.mars.comm.NetworkSignalUtil.getGSMSignalStrength();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NormsgSourceImpl", th6, "[-] Error happened.", new java.lang.Object[0]);
                return -1L;
            }
        }

        private static java.lang.String c22() {
            if (f72193a == null) {
                return "";
            }
            ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
            return wo.w0.c();
        }

        private static boolean c23() {
            if (f72193a == null) {
                return false;
            }
            ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
            return !(!"false".equalsIgnoreCase(lp0.a.f320247a));
        }

        private static int c24(android.content.Context context) {
            if (f72193a == null) {
                return 2;
            }
            ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
            int i17 = com.tencent.mm.plugin.normsg.NormsgDataService.f152400f;
            try {
                android.os.Bundle a17 = com.tencent.mm.util.HotpotService.a(context, com.tencent.mm.plugin.normsg.NormsgDataService.class, 3, null);
                if (a17 != null) {
                    return a17.getInt("result");
                }
                return 2;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NormsgDS", th6, "Fail to call m3.", new java.lang.Object[0]);
                return 2;
            }
        }

        private static java.lang.Object c25() {
            if (f72193a == null) {
                return null;
            }
            ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
            try {
                r45.lw4 h17 = ko3.l0.INSTANCE.h();
                if (h17 != null) {
                    return new com.tencent.mm.normsg.g(h17.f379885d, h17.f379886e, h17.f379887f, h17.f379888g);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NormsgSourceImpl", "get sri error: %s", e17.toString());
            }
            return new com.tencent.mm.normsg.g(0, "", 0L, "");
        }

        private static int c26() {
            if (f72193a == null) {
                return 0;
            }
            ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
            if (!gm0.j1.a()) {
                return 0;
            }
            ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
            if (vq4.p0.d()) {
                return 1;
            }
            if (iq.b.H()) {
                return 3;
            }
            ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).getClass();
            return vq4.p0.c() ? 4 : 0;
        }

        private static java.lang.String c27() {
            if (f72193a == null) {
                return "";
            }
            ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
            return wo.w0.p();
        }

        private static boolean c28() {
            if (f72193a == null) {
                return false;
            }
            ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
            return com.tencent.mm.app.w.INSTANCE.f53889n;
        }

        private static java.util.List<java.lang.String> c29() {
            if (f72193a == null) {
                return new java.util.ArrayList();
            }
            ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_check_installed_pkgs, "", true);
                if (!android.text.TextUtils.isEmpty(Zi)) {
                    for (java.lang.String str : Zi.split("[|]")) {
                        if (!android.text.TextUtils.isEmpty(str.trim())) {
                            arrayList.add(str.trim());
                        }
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
            return arrayList;
        }

        public static synchronized void c3(int i17, java.lang.String str) {
            synchronized (com.tencent.mm.normsg.c.q.class) {
                if (f72193a != null) {
                    ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
                }
            }
        }

        public static synchronized void c4(int i17, int i18, int i19) {
            synchronized (com.tencent.mm.normsg.c.q.class) {
                if (f72193a != null) {
                    ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(i17, i18, i19);
                }
            }
        }

        public static synchronized void c5(int i17, int i18, int i19, int i27) {
            synchronized (com.tencent.mm.normsg.c.q.class) {
                if (f72193a != null) {
                    ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.m(i17, i18, i19, i27, true);
                }
            }
        }

        public static synchronized java.lang.String c6() {
            synchronized (com.tencent.mm.normsg.c.q.class) {
            }
            return "";
        }

        public static synchronized java.lang.String c7() {
            synchronized (com.tencent.mm.normsg.c.q.class) {
                if (f72193a == null) {
                    return "";
                }
                ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
                java.lang.String str = re4.u.a().f394553a;
                if (str == null) {
                    str = "";
                }
                return str;
            }
        }

        private static boolean c8() {
            if (f72193a == null) {
                return false;
            }
            ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
            return ko3.r0.f309996b;
        }

        private static java.lang.String c9() {
            if (f72193a == null) {
                return "";
            }
            ((com.tencent.mm.plugin.normsg.u) f72193a).getClass();
            java.lang.String str = re4.u.a().f394554b;
            return str != null ? str : "";
        }
    }
}
