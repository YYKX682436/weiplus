package com.tencent.matrix.traffic;

/* loaded from: classes12.dex */
public class TrafficPlugin extends qi.b {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f53086i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f53087m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final nj.a f53088h;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("matrix-traffic");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/matrix/traffic/TrafficPlugin", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/matrix/traffic/TrafficPlugin", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public TrafficPlugin(nj.a aVar) {
        this.f53088h = aVar;
    }

    private static native void nativeClearTrafficInfo();

    private static native java.lang.String nativeGetAllStackTraceTrafficInfo();

    private static native java.lang.String nativeGetNativeBackTraceByKey(java.lang.String str);

    private static native java.lang.String nativeGetTrafficInfo();

    private static native java.util.HashMap<java.lang.String, java.lang.String> nativeGetTrafficInfoMap(int i17);

    private static native void nativeInitMatrixTraffic(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, java.lang.String[] strArr);

    private static native void nativeReleaseMatrixTraffic();

    private static void setFdStackTrace(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.StackTraceElement stackTraceElement : java.lang.Thread.currentThread().getStackTrace()) {
            sb6.append(stackTraceElement.toString());
            sb6.append("\n");
        }
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = oj.m.f345708a;
        byte[] digest = ((java.security.MessageDigest) oj.m.f345711d.get()).digest(sb7.getBytes());
        int length = digest.length;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(length * 2);
        int i17 = length + 0;
        for (int i18 = 0; i18 < i17; i18++) {
            byte b17 = digest[i18];
            char[] cArr = oj.m.f345710c;
            char c17 = cArr[(b17 & 240) >> 4];
            char c18 = cArr[b17 & 15];
            stringBuffer.append(c17);
            stringBuffer.append(c18);
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) f53086i;
        if (!concurrentHashMap.containsKey(stringBuffer2)) {
            concurrentHashMap.put(stringBuffer2, sb6.toString());
        }
        ((java.util.concurrent.ConcurrentHashMap) f53087m).put(str, stringBuffer2);
    }

    @Override // qi.b
    public void e() {
        if (this.f363455g == 2) {
            return;
        }
        super.e();
        oj.j.c("TrafficPlugin", "start", new java.lang.Object[0]);
        nj.a aVar = this.f53088h;
        java.util.ArrayList arrayList = (java.util.ArrayList) aVar.f337798f;
        nativeInitMatrixTraffic(aVar.f337793a, aVar.f337794b, aVar.f337795c, aVar.f337796d, aVar.f337797e, (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
    }

    public void f() {
        ((java.util.concurrent.ConcurrentHashMap) f53087m).clear();
        ((java.util.concurrent.ConcurrentHashMap) f53086i).clear();
        nativeClearTrafficInfo();
    }

    public java.lang.String g(java.lang.String str) {
        return !this.f53088h.f337796d ? "" : nativeGetNativeBackTraceByKey(str);
    }

    public java.util.HashMap h(int i17) {
        return nativeGetTrafficInfoMap(i17);
    }
}
