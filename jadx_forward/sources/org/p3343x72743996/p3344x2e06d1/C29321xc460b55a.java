package org.p3343x72743996.p3344x2e06d1;

@org.p3343x72743996.p3353x59bc66e.p3354xc6ad7b24.InterfaceC29461x94c0977e
/* renamed from: org.chromium.base.MemoryPressureListener */
/* loaded from: classes13.dex */
public class C29321xc460b55a {

    /* renamed from: ACTION_LOW_MEMORY */
    private static final java.lang.String f73335x59314a15 = "org.chromium.base.ACTION_LOW_MEMORY";

    /* renamed from: ACTION_TRIM_MEMORY */
    private static final java.lang.String f73336xaccbe735 = "org.chromium.base.ACTION_TRIM_MEMORY";

    /* renamed from: ACTION_TRIM_MEMORY_MODERATE */
    private static final java.lang.String f73337x6f0482cd = "org.chromium.base.ACTION_TRIM_MEMORY_MODERATE";

    /* renamed from: ACTION_TRIM_MEMORY_RUNNING_CRITICAL */
    private static final java.lang.String f73338xf30a8609 = "org.chromium.base.ACTION_TRIM_MEMORY_RUNNING_CRITICAL";

    /* renamed from: sCallbacks */
    private static org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.p3348xbfc2bd01.InterfaceC29402x69e010eb> f73339xf637d99b;

    /* renamed from: org.chromium.base.MemoryPressureListener$Natives */
    /* loaded from: classes13.dex */
    public interface Natives {
        /* renamed from: onMemoryPressure */
        void mo152523xde904e25(int i17);
    }

    /* renamed from: addCallback */
    public static void m152514xbba9cc06(org.p3343x72743996.p3344x2e06d1.p3348xbfc2bd01.InterfaceC29402x69e010eb interfaceC29402x69e010eb) {
        org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152651x286f5ca3();
        if (f73339xf637d99b == null) {
            f73339xf637d99b = new org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<>();
        }
        f73339xf637d99b.m152532xdab4fe97(interfaceC29402x69e010eb);
    }

    /* renamed from: addNativeCallback */
    private static void m152515x9902e47d() {
        org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152651x286f5ca3();
        m152514xbba9cc06(new org.p3343x72743996.p3344x2e06d1.C29322xb210a047());
    }

    /* renamed from: handleDebugIntent */
    public static boolean m152516xb1dbbf87(android.app.Activity activity, java.lang.String str) {
        org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152651x286f5ca3();
        if (f73335x59314a15.equals(str)) {
            m152520xf95af5e(activity);
            return true;
        }
        if (f73336xaccbe735.equals(str)) {
            m152521xd1fa5a34(activity, 80);
            return true;
        }
        if (f73338xf30a8609.equals(str)) {
            m152521xd1fa5a34(activity, 15);
            return true;
        }
        if (!f73337x6f0482cd.equals(str)) {
            return false;
        }
        m152521xd1fa5a34(activity, 60);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addNativeCallback$0 */
    public static /* synthetic */ void m152517xda728d6c(int i17) {
        org.p3343x72743996.p3344x2e06d1.C29323xb21137eb.get().mo152523xde904e25(i17);
    }

    /* renamed from: notifyMemoryPressure */
    public static void m152518xa90e160f(int i17) {
        org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152651x286f5ca3();
        org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.p3348xbfc2bd01.InterfaceC29402x69e010eb> c29324xf28570b4 = f73339xf637d99b;
        if (c29324xf28570b4 == null) {
            return;
        }
        java.util.Iterator<org.p3343x72743996.p3344x2e06d1.p3348xbfc2bd01.InterfaceC29402x69e010eb> it = c29324xf28570b4.iterator();
        while (it.hasNext()) {
            it.next().mo152522x59083944(i17);
        }
    }

    /* renamed from: removeCallback */
    public static void m152519x96b2b8e9(org.p3343x72743996.p3344x2e06d1.p3348xbfc2bd01.InterfaceC29402x69e010eb interfaceC29402x69e010eb) {
        org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152651x286f5ca3();
        org.p3343x72743996.p3344x2e06d1.C29324xf28570b4<org.p3343x72743996.p3344x2e06d1.p3348xbfc2bd01.InterfaceC29402x69e010eb> c29324xf28570b4 = f73339xf637d99b;
        if (c29324xf28570b4 == null) {
            return;
        }
        c29324xf28570b4.m152537xb5bdeb7a(interfaceC29402x69e010eb);
    }

    /* renamed from: simulateLowMemoryPressureSignal */
    private static void m152520xf95af5e(android.app.Activity activity) {
        activity.getApplication().onLowMemory();
        activity.onLowMemory();
    }

    /* renamed from: simulateTrimMemoryPressureSignal */
    private static void m152521xd1fa5a34(android.app.Activity activity, int i17) {
        activity.getApplication().onTrimMemory(i17);
        activity.onTrimMemory(i17);
    }
}
