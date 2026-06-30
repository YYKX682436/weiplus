package sc1;

/* loaded from: classes10.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f487230a;

    /* renamed from: b, reason: collision with root package name */
    public static java.util.List f487231b;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        f487231b = null;
    }

    public static void a() {
        if (f487230a) {
            return;
        }
        com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveLogConfig v2TXLiveLogConfig = new com.p314xaae8f345.p420x6236cc6.C3874x853c3939.V2TXLiveLogConfig();
        v2TXLiveLogConfig.f15324x2946a979 = true;
        v2TXLiveLogConfig.f15325x76f472a0 = 1;
        v2TXLiveLogConfig.f15322x7b70ae54 = false;
        v2TXLiveLogConfig.f15323x571193dd = false;
        com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.m31905xb488c164(v2TXLiveLogConfig);
        com.p314xaae8f345.p420x6236cc6.C3877x3eb9c7a0.m31906x8b59f158(new sc1.l1());
        java.util.List list = f487231b;
        if (list == null || list.isEmpty()) {
            f487231b = null;
        } else {
            java.util.Iterator it = f487231b.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
            f487231b.clear();
            f487231b = null;
        }
        f487230a = true;
    }
}
