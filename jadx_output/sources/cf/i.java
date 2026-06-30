package cf;

/* loaded from: classes7.dex */
public abstract class i {
    public static final java.lang.Object a(java.lang.String logName, yz5.a block) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(logName, "logName");
        kotlin.jvm.internal.o.g(block, "block");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Object invoke = block.invoke();
        if (invoke instanceof cf.h) {
            str = ((cf.h) invoke).I();
        } else if (invoke == null || (str = invoke.toString()) == null) {
            str = "";
        }
        boolean a17 = com.tencent.mm.plugin.appbrand.utils.d5.a();
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a17) {
            com.tencent.mars.xlog.Log.i("Luggage.Utils.Profile", "runProfiled:log:" + logName + " cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a17 + ' ');
        } else {
            com.tencent.mars.xlog.Log.w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / 16)) + " frames! runProfiled:log:" + logName + " cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a17 + ' ');
        }
        return invoke;
    }

    public static final java.lang.String b(java.lang.String logName, java.lang.Runnable run) {
        java.lang.String obj;
        kotlin.jvm.internal.o.g(logName, "logName");
        kotlin.jvm.internal.o.g(run, "run");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        run.run();
        if ("" instanceof cf.h) {
            obj = ((cf.h) "").I();
        } else {
            obj = "".toString();
            if (obj == null) {
                obj = "";
            }
        }
        boolean a17 = com.tencent.mm.plugin.appbrand.utils.d5.a();
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a17) {
            com.tencent.mars.xlog.Log.i("Luggage.Utils.Profile", "runProfiled:log:" + logName + " cost " + elapsedRealtime2 + " ms result:" + obj + " isMainThread: " + a17 + ' ');
        } else {
            com.tencent.mars.xlog.Log.w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / 16)) + " frames! runProfiled:log:" + logName + " cost " + elapsedRealtime2 + " ms result:" + obj + " isMainThread: " + a17 + ' ');
        }
        return "";
    }
}
