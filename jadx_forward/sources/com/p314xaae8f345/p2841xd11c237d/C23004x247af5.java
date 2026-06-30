package com.p314xaae8f345.p2841xd11c237d;

/* renamed from: com.tencent.paymars.Mars */
/* loaded from: classes12.dex */
public class C23004x247af5 {
    protected static final java.lang.String TAG = "PayMars";

    /* renamed from: libAndromeda */
    public static final java.lang.String f40051x8fc4bb64 = "andromeda";

    /* renamed from: libMarsBase */
    public static final java.lang.String f40052xd7c0c0eb = "wechatbase";

    /* renamed from: libMarsMM */
    public static final java.lang.String f40053xf14e861a = "wechatmm";

    /* renamed from: libMarsNetwork */
    public static final java.lang.String f40054xe9a831d4 = "wechatnetwork";

    /* renamed from: libMarsQuic */
    public static final java.lang.String f40055xd7c7dc58 = "marsquic";

    /* renamed from: libMarsXlog */
    public static final java.lang.String f40056xd7cae9e6 = "wechatxlog";

    /* renamed from: _hellAccFlag_ */
    private byte f40058x7f11beae;

    /* renamed from: libModules */
    protected static java.util.ArrayList<java.lang.String[]> f40057x4fa22d42 = new java.util.ArrayList<>();

    /* renamed from: hasInitialized */
    protected static volatile boolean f40050x4383f7da = false;

    /* renamed from: checkLoadedModules */
    public static synchronized void m84195xab22279a(java.util.ArrayList<java.lang.String> arrayList, java.lang.String str) {
        synchronized (com.p314xaae8f345.p2841xd11c237d.C23004x247af5.class) {
            if (arrayList == null) {
                return;
            }
            int i17 = 0;
            java.lang.String[] strArr = new java.lang.String[0];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "loaded modules: " + java.util.Arrays.toString(arrayList.toArray(strArr)));
            java.util.Arrays.sort(strArr);
            f40057x4fa22d42.add(strArr);
            boolean z17 = true;
            for (int i18 = 0; i18 < f40057x4fa22d42.size(); i18++) {
                if (!java.util.Arrays.equals(f40057x4fa22d42.get(i18), f40057x4fa22d42.get(0))) {
                    z17 = false;
                }
            }
            if (!z17) {
                while (i17 < f40057x4fa22d42.size()) {
                    int i19 = i17 + 1;
                    for (int i27 = i19; i27 < f40057x4fa22d42.size() && (!m84197xb22a9223(f40057x4fa22d42.get(i17), f40057x4fa22d42.get(i27))); i27++) {
                    }
                    if (!z17) {
                        break;
                    } else {
                        i17 = i19;
                    }
                }
            }
            if (!z17) {
                throw new java.lang.IllegalStateException("mars lib module custom made error, pls check your *.so.");
            }
        }
    }

    /* renamed from: getCallStack */
    public static java.lang.String m84196xc06a9414() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.StackTraceElement stackTraceElement : java.lang.Thread.currentThread().getStackTrace()) {
            sb6.append(stackTraceElement.toString());
            sb6.append("\n");
        }
        return sb6.toString();
    }

    /* renamed from: hasInterSection */
    public static boolean m84197xb22a9223(java.lang.String[] strArr, java.lang.String[] strArr2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            arrayList.add(str);
        }
        for (java.lang.String str2 : strArr2) {
            if (arrayList.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: init */
    public static void m84198x316510(android.content.Context context, android.os.Handler handler) {
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.m40107x316510(context, handler);
        f40050x4383f7da = true;
    }

    /* renamed from: loadCppSharedLibrary */
    public static void m84199x351470b9() {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("c++_shared");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/paymars/Mars", "loadCppSharedLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/paymars/Mars", "loadCppSharedLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: loadDependentLibraries */
    public static void m84200x13c589e0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "load mars from %s", m84196xc06a9414());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("wechatbase");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/paymars/Mars", "loadDependentLibraries", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/paymars/Mars", "loadDependentLibraries", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add("andromeda");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/paymars/Mars", "loadDependentLibraries", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/paymars/Mars", "loadDependentLibraries", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("wechatmm");
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/paymars/Mars", "loadDependentLibraries", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList3.get(0));
        yj0.a.f(obj3, "com/tencent/paymars/Mars", "loadDependentLibraries", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: loadDependentLibrariesAll */
    public static void m84201xd8c8aba1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "load mars from %s", m84196xc06a9414());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("wechatbase");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add("andromeda");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("marsquic");
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList3.get(0));
        yj0.a.f(obj3, "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add("wechatmm");
        java.lang.Object obj4 = new java.lang.Object();
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(obj4, arrayList4.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList4.get(0));
        yj0.a.f(obj4, "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add("wechatnetwork");
        java.lang.Object obj5 = new java.lang.Object();
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(obj5, arrayList5.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList5.get(0));
        yj0.a.f(obj5, "com/tencent/paymars/Mars", "loadDependentLibrariesAll", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: loadDependentLibrariesForNetwork */
    public static void m84202xb66baf25() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "load mars from %s", m84196xc06a9414());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("wechatbase");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add("marsquic");
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList2.get(0));
        yj0.a.f(obj2, "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("wechatmm");
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList3.get(0));
        yj0.a.f(obj3, "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add("wechatnetwork");
        java.lang.Object obj4 = new java.lang.Object();
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(obj4, arrayList4.toArray(), "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList4.get(0));
        yj0.a.f(obj4, "com/tencent/paymars/Mars", "loadDependentLibrariesForNetwork", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: onCreate */
    public static void m84204x3e5a77bb(boolean z17) {
        if (z17 && f40050x4383f7da) {
            m84203x3e5a77bb();
        } else {
            if (!z17) {
                m84203x3e5a77bb();
                return;
            }
            throw new java.lang.IllegalStateException("function MarsCore.init must be executed before Mars.onCreate when application firststartup.");
        }
    }

    /* renamed from: onDestroy */
    public static void m84205xac79a11b() {
        m84206xa66071db();
    }

    /* renamed from: onDestroyImpl */
    private static void m84206xa66071db() {
        com.p314xaae8f345.p2841xd11c237d.C23002x9c03629.m84188xac79a11b();
    }

    /* renamed from: onExceptionCrash */
    public static void m84207x2a942457() {
        com.p314xaae8f345.p2841xd11c237d.C23002x9c03629.m84189x2a942457();
    }

    /* renamed from: onForeground */
    public static void m84208x3d65c882(boolean z17) {
        com.p314xaae8f345.p2841xd11c237d.C23002x9c03629.m84190x3d65c882(z17);
    }

    /* renamed from: onInit */
    public static void m84209xc39adf8f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mars", "packerEncoderVersion %s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p2841xd11c237d.C23002x9c03629.m84191xcb55566b(i17);
    }

    /* renamed from: onNetworkChange */
    public static void m84210xde9f63df() {
        com.p314xaae8f345.p2841xd11c237d.C23002x9c03629.m84192xde9f63df();
    }

    /* renamed from: onSingalCrash */
    public static void m84211x79d8456e(int i17) {
        com.p314xaae8f345.p2841xd11c237d.C23002x9c03629.m84193x79d8456e(i17);
    }

    /* renamed from: onCreate */
    public static void m84203x3e5a77bb() {
        com.p314xaae8f345.p2841xd11c237d.C23002x9c03629.m84187x3e5a77bb();
    }
}
