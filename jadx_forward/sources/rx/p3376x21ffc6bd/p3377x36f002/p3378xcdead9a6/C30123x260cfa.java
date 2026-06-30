package rx.p3376x21ffc6bd.p3377x36f002.p3378xcdead9a6;

/* renamed from: rx.internal.util.unsafe.Pow2 */
/* loaded from: classes14.dex */
public final class C30123x260cfa {
    private C30123x260cfa() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    /* renamed from: isPowerOfTwo */
    public static boolean m163294x9acb37ba(int i17) {
        return (i17 & (i17 + (-1))) == 0;
    }

    /* renamed from: roundToPowerOfTwo */
    public static int m163295xa94ca879(int i17) {
        return 1 << (32 - java.lang.Integer.numberOfLeadingZeros(i17 - 1));
    }
}
