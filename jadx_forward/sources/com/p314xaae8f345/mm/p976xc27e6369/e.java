package com.p314xaae8f345.mm.p976xc27e6369;

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
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/normsgcontent/e$m", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }

        public static native byte[] aa(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18);
    }

    /* loaded from: classes13.dex */
    public static final class n {

        /* renamed from: a, reason: collision with root package name */
        public static volatile com.p314xaae8f345.mm.p976xc27e6369.a f153752a;

        public static synchronized void c0(com.p314xaae8f345.mm.p976xc27e6369.a aVar) {
            synchronized (com.tencent.mm.normsgcontent.e.n.class) {
                f153752a = aVar;
            }
        }

        public static synchronized void c1(int i17, java.lang.String str) {
            synchronized (com.tencent.mm.normsgcontent.e.n.class) {
                if (f153752a != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153752a).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(i17, str);
                }
            }
        }

        public static synchronized void c2(int i17, int i18, int i19) {
            synchronized (com.tencent.mm.normsgcontent.e.n.class) {
                if (f153752a != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153752a).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(i17, i18, i19);
                }
            }
        }

        public static synchronized void c3(int i17, int i18, int i19, int i27) {
            synchronized (com.tencent.mm.normsgcontent.e.n.class) {
                if (f153752a != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153752a).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.m(i17, i18, i19, i27, true);
                }
            }
        }

        private static boolean c4(java.lang.String str, byte[] bArr) {
            if (f153752a != null) {
                return ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153752a).Zi(str, bArr);
            }
            return false;
        }

        private static byte[] c5(java.lang.String str) {
            return f153752a != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153752a).Bi(str) : new byte[0];
        }

        private static void c6(java.lang.String str) {
            if (f153752a != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153752a).aj(str);
            }
        }

        private static java.lang.String c7() {
            if (f153752a == null) {
                return "";
            }
            java.lang.String Ui = ((com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u) f153752a).Ui();
            return !android.text.TextUtils.isEmpty(Ui) ? Ui : "";
        }
    }
}
