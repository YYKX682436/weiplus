package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* loaded from: classes16.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ boolean a(sun.misc.Unsafe unsafe, java.lang.Object obj, long j17, java.lang.Object obj2, java.lang.Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j17, obj2, obj3)) {
            if (unsafe.getObject(obj, j17) != obj2) {
                return false;
            }
        }
        return true;
    }
}
