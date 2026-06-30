package com.p314xaae8f345.p552xbf8d97c1.p589xc06221fd;

/* renamed from: com.tencent.matrix.traffic.TrafficPlugin */
/* loaded from: classes12.dex */
public class C4718x22597b70 extends qi.b {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f134619i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f134620m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final nj.a f134621h;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("matrix-traffic");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/traffic/TrafficPlugin", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/matrix/traffic/TrafficPlugin", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public C4718x22597b70(nj.a aVar) {
        this.f134621h = aVar;
    }

    /* renamed from: nativeClearTrafficInfo */
    private static native void m41308x2ec829f5();

    /* renamed from: nativeGetAllStackTraceTrafficInfo */
    private static native java.lang.String m41309xa292fc2c();

    /* renamed from: nativeGetNativeBackTraceByKey */
    private static native java.lang.String m41310x6cb36e0(java.lang.String str);

    /* renamed from: nativeGetTrafficInfo */
    private static native java.lang.String m41311x4643a30c();

    /* renamed from: nativeGetTrafficInfoMap */
    private static native java.util.HashMap<java.lang.String, java.lang.String> m41312xb8fc1eb0(int i17);

    /* renamed from: nativeInitMatrixTraffic */
    private static native void m41313x98a5dc75(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, java.lang.String[] strArr);

    /* renamed from: nativeReleaseMatrixTraffic */
    private static native void m41314x10f534ec();

    /* renamed from: setFdStackTrace */
    private static void m41315xc0f1b47d(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.StackTraceElement stackTraceElement : java.lang.Thread.currentThread().getStackTrace()) {
            sb6.append(stackTraceElement.toString());
            sb6.append("\n");
        }
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = oj.m.f427241a;
        byte[] digest = ((java.security.MessageDigest) oj.m.f427244d.get()).digest(sb7.getBytes());
        int length = digest.length;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(length * 2);
        int i17 = length + 0;
        for (int i18 = 0; i18 < i17; i18++) {
            byte b17 = digest[i18];
            char[] cArr = oj.m.f427243c;
            char c17 = cArr[(b17 & 240) >> 4];
            char c18 = cArr[b17 & 15];
            stringBuffer.append(c17);
            stringBuffer.append(c18);
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) f134619i;
        if (!concurrentHashMap.containsKey(stringBuffer2)) {
            concurrentHashMap.put(stringBuffer2, sb6.toString());
        }
        ((java.util.concurrent.ConcurrentHashMap) f134620m).put(str, stringBuffer2);
    }

    @Override // qi.b
    public void e() {
        if (this.f444988g == 2) {
            return;
        }
        super.e();
        oj.j.c("TrafficPlugin", "start", new java.lang.Object[0]);
        nj.a aVar = this.f134621h;
        java.util.ArrayList arrayList = (java.util.ArrayList) aVar.f419331f;
        m41313x98a5dc75(aVar.f419326a, aVar.f419327b, aVar.f419328c, aVar.f419329d, aVar.f419330e, (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
    }

    public void f() {
        ((java.util.concurrent.ConcurrentHashMap) f134620m).clear();
        ((java.util.concurrent.ConcurrentHashMap) f134619i).clear();
        m41308x2ec829f5();
    }

    public java.lang.String g(java.lang.String str) {
        return !this.f134621h.f419329d ? "" : m41310x6cb36e0(str);
    }

    public java.util.HashMap h(int i17) {
        return m41312xb8fc1eb0(i17);
    }
}
