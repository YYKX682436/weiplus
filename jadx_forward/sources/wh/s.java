package wh;

/* loaded from: classes12.dex */
public class s {
    public java.lang.String a(int i17) {
        if (i17 == android.os.Process.myTid()) {
            return b();
        }
        if (i17 == android.os.Process.myPid()) {
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mainLooper, "Looper.getMainLooper()");
            java.lang.Thread thread = mainLooper.getThread();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(thread, "Looper.getMainLooper().thread");
            java.lang.StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace == null) {
                return "";
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(stackTrace.length);
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                java.lang.String className = stackTraceElement.getClassName();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "className");
                if (!r26.n0.B(className, "com.tencent.matrix", false) && !r26.n0.B(className, "java.lang.reflect", false) && !r26.n0.B(className, "$Proxy2", false) && !r26.n0.B(className, "android.os", false)) {
                    arrayList.add(stackTraceElement);
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.StackTraceElement stackTraceElement2 = (java.lang.StackTraceElement) it.next();
                sb6.append(sb6.length() == 0 ? "" : "\n");
                sb6.append("at ");
                sb6.append(stackTraceElement2);
            }
            if (sb6.length() == 0) {
                return "";
            }
            return "Matrix\n" + ((java.lang.Object) sb6);
        }
        if (com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.d() && com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4651xcb23ec9a.e(false, 1, null)) {
            return com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4651xcb23ec9a.f(i17, null, false, null, 14, null);
        }
        for (java.lang.Thread thread2 : java.lang.Thread.getAllStackTraces().keySet()) {
            if ((thread2 instanceof android.os.HandlerThread) && ((android.os.HandlerThread) thread2).getThreadId() == i17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thread2, "thread");
                java.lang.StackTraceElement[] stackTrace2 = thread2.getStackTrace();
                if (stackTrace2 == null) {
                    return "";
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(stackTrace2.length);
                for (java.lang.StackTraceElement stackTraceElement3 : stackTrace2) {
                    java.lang.String className2 = stackTraceElement3.getClassName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className2, "className");
                    if (!r26.n0.B(className2, "com.tencent.matrix", false) && !r26.n0.B(className2, "java.lang.reflect", false) && !r26.n0.B(className2, "$Proxy2", false) && !r26.n0.B(className2, "android.os", false)) {
                        arrayList2.add(stackTraceElement3);
                    }
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    java.lang.StackTraceElement stackTraceElement4 = (java.lang.StackTraceElement) it6.next();
                    sb7.append(sb7.length() == 0 ? "" : "\n");
                    sb7.append("at ");
                    sb7.append(stackTraceElement4);
                }
                if (sb7.length() == 0) {
                    return "";
                }
                return "Matrix\n" + ((java.lang.Object) sb7);
            }
        }
        return "";
    }

    public java.lang.String b() {
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        if (stackTrace == null) {
            return "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(stackTrace.length);
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            java.lang.String className = stackTraceElement.getClassName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "className");
            if (!r26.n0.B(className, "com.tencent.matrix", false) && !r26.n0.B(className, "java.lang.reflect", false) && !r26.n0.B(className, "$Proxy2", false) && !r26.n0.B(className, "android.os", false)) {
                arrayList.add(stackTraceElement);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.StackTraceElement stackTraceElement2 = (java.lang.StackTraceElement) it.next();
            sb6.append(sb6.length() == 0 ? "" : "\n");
            sb6.append("at ");
            sb6.append(stackTraceElement2);
        }
        if (sb6.length() == 0) {
            return "";
        }
        return "Matrix\n" + ((java.lang.Object) sb6);
    }

    public boolean c(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return (str.length() > 0) || r26.i0.y(str, "Matrix", false) || r26.i0.y(str, "JUnwind", false) || r26.i0.y(str, "HOTTEST_PATH", false) || r26.i0.y(str, "RUNNING", false);
    }
}
