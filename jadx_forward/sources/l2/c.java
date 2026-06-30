package l2;

/* loaded from: classes14.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f396641a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f396642b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f396643c;

    static {
        a(0);
        a(50);
        f396641a = 50;
        a(-1);
        f396642b = -1;
        a(100);
        f396643c = 100;
    }

    public static int a(int i17) {
        boolean z17 = true;
        if (!(i17 >= 0 && i17 < 101) && i17 != -1) {
            z17 = false;
        }
        if (z17) {
            return i17;
        }
        throw new java.lang.IllegalStateException("topRatio should be in [0..100] range or -1".toString());
    }
}
