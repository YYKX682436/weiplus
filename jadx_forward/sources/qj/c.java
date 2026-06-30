package qj;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f445390a = false;

    /* renamed from: b, reason: collision with root package name */
    public static int f445391b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static wu5.j f445392c = null;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f445393d = "";

    /* renamed from: e, reason: collision with root package name */
    public static volatile android.util.SparseBooleanArray f445394e = new android.util.SparseBooleanArray(5);

    /* renamed from: f, reason: collision with root package name */
    public static int f445395f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f445396g = true;

    public static void a(int i17) {
        f445391b = 0;
        int i18 = 0;
        while (i18 < 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SyncBarrierWatchDogPlus", "startCheckStrictly, token = %d, checkCount = %d ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            i18++;
            if (i17 != b()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SyncBarrierWatchDogPlus", "token != lastToken, just break");
                return;
            }
            qj.b bVar = new qj.b(android.os.Looper.getMainLooper());
            android.os.Message obtain = android.os.Message.obtain();
            boolean z17 = true;
            obtain.setAsynchronous(true);
            obtain.setTarget(bVar);
            obtain.arg1 = 0;
            android.os.Message obtain2 = android.os.Message.obtain();
            obtain2.arg1 = 1;
            bVar.sendMessage(obtain);
            bVar.sendMessage(obtain2);
            if (f445391b > 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SyncBarrierWatchDogPlus", "Maybe happens a barrier leak, token = %d, barrierCount = barrierCount", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(f445391b));
                if (i17 == b()) {
                    c(i17, 21, 11);
                } else {
                    c(i17, 20, 10);
                }
            } else {
                z17 = false;
            }
            if (z17) {
                return;
            } else {
                try {
                    java.lang.Thread.sleep(1000L);
                } catch (java.lang.InterruptedException unused) {
                }
            }
        }
    }

    public static int b() {
        try {
            android.os.MessageQueue queue = android.os.Looper.getMainLooper().getQueue();
            java.lang.reflect.Field declaredField = queue.getClass().getDeclaredField("mMessages");
            declaredField.setAccessible(true);
            android.os.Message message = (android.os.Message) declaredField.get(queue);
            if (message == null || message.getTarget() != null) {
                return -1;
            }
            return message.arg1;
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    public static void c(int i17, int i18, int i19) {
        if (f445394e.get(i17)) {
            return;
        }
        f445394e.put(i17, true);
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.mo68477x336bdfd8(1470L, i18, 1L, true);
        java.lang.String m41265x521f41b0 = com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p586x2eaf9f.C4711x5cbd1118.m41265x521f41b0();
        if (m41265x521f41b0 == null) {
            m41265x521f41b0 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SyncBarrierWatchDogPlus", "sync barrier leak happens in scene : %s, type : %d", m41265x521f41b0, java.lang.Integer.valueOf(i19));
        fVar.d(20739, m41265x521f41b0, java.lang.Integer.valueOf(i19));
    }
}
