package com.tencent.mm.normsgcontent;

/* loaded from: classes10.dex */
final class e {

    /* loaded from: classes10.dex */
    public static final class m {
        static {
            java.lang.StringBuilder reverse = new java.lang.StringBuilder("wg").reverse();
            reverse.append(new java.lang.StringBuilder("ofni").reverse().toString());
            java.lang.String sb6 = reverse.toString();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(sb6);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/normsgcontent/e$m", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/normsgcontent/e$m", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }

        public static native byte[] aa(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18);
    }

    /* loaded from: classes13.dex */
    public static final class n {

        /* renamed from: a, reason: collision with root package name */
        public static volatile com.tencent.mm.normsgcontent.a f72219a;

        public static synchronized void c0(com.tencent.mm.normsgcontent.a aVar) {
            synchronized (com.tencent.mm.normsgcontent.e.n.class) {
                f72219a = aVar;
            }
        }

        public static synchronized void c1(int i17, java.lang.String str) {
            synchronized (com.tencent.mm.normsgcontent.e.n.class) {
                if (f72219a != null) {
                    ((com.tencent.mm.plugin.normsg.u) f72219a).getClass();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
                }
            }
        }

        public static synchronized void c2(int i17, int i18, int i19) {
            synchronized (com.tencent.mm.normsgcontent.e.n.class) {
                if (f72219a != null) {
                    ((com.tencent.mm.plugin.normsg.u) f72219a).getClass();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(i17, i18, i19);
                }
            }
        }

        public static synchronized void c3(int i17, int i18, int i19, int i27) {
            synchronized (com.tencent.mm.normsgcontent.e.n.class) {
                if (f72219a != null) {
                    ((com.tencent.mm.plugin.normsg.u) f72219a).getClass();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.m(i17, i18, i19, i27, true);
                }
            }
        }

        private static boolean c4(java.lang.String str, byte[] bArr) {
            if (f72219a != null) {
                return ((com.tencent.mm.plugin.normsg.u) f72219a).Zi(str, bArr);
            }
            return false;
        }

        private static byte[] c5(java.lang.String str) {
            return f72219a != null ? ((com.tencent.mm.plugin.normsg.u) f72219a).Bi(str) : new byte[0];
        }

        private static void c6(java.lang.String str) {
            if (f72219a != null) {
                ((com.tencent.mm.plugin.normsg.u) f72219a).aj(str);
            }
        }

        private static java.lang.String c7() {
            if (f72219a == null) {
                return "";
            }
            java.lang.String Ui = ((com.tencent.mm.plugin.normsg.u) f72219a).Ui();
            return !android.text.TextUtils.isEmpty(Ui) ? Ui : "";
        }
    }
}
