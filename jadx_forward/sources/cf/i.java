package cf;

/* loaded from: classes7.dex */
public abstract class i {
    public static final java.lang.Object a(java.lang.String logName, yz5.a block) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logName, "logName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Object mo152xb9724478 = block.mo152xb9724478();
        if (mo152xb9724478 instanceof cf.h) {
            str = ((cf.h) mo152xb9724478).I();
        } else if (mo152xb9724478 == null || (str = mo152xb9724478.toString()) == null) {
            str = "";
        }
        boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a();
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Utils.Profile", "runProfiled:log:" + logName + " cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a17 + ' ');
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / 16)) + " frames! runProfiled:log:" + logName + " cost " + elapsedRealtime2 + " ms result:" + str + " isMainThread: " + a17 + ' ');
        }
        return mo152xb9724478;
    }

    public static final java.lang.String b(java.lang.String logName, java.lang.Runnable run) {
        java.lang.String obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logName, "logName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(run, "run");
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
        boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a();
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Utils.Profile", "runProfiled:log:" + logName + " cost " + elapsedRealtime2 + " ms result:" + obj + " isMainThread: " + a17 + ' ');
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / 16)) + " frames! runProfiled:log:" + logName + " cost " + elapsedRealtime2 + " ms result:" + obj + " isMainThread: " + a17 + ' ');
        }
        return "";
    }
}
