package kc1;

/* loaded from: classes14.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    public static kc1.f f387825d;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2825x7e128009.C22958xbc43cdfb f387826a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f387827b = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f387828c = new java.util.ArrayList();

    public static synchronized kc1.f b() {
        kc1.f fVar;
        synchronized (kc1.f.class) {
            if (f387825d == null) {
                f387825d = new kc1.f();
            }
            fVar = f387825d;
        }
        return fVar;
    }

    public int a(kc1.c cVar) {
        switch (cVar) {
            case ResultOK:
                return 0;
            case ResultNotInit:
                return 1;
            case ResultInited:
                return 2;
            case ResultInitFail:
                return 3;
            case ResultNoLicense:
                return 4;
            case ResultFaceDetectedFail:
                return 5;
            case ResultStopFail:
                return 6;
            case ResultUndefinedError:
                return 7;
            default:
                return -1;
        }
    }
}
