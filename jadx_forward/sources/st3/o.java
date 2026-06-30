package st3;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final st3.o f494090a = new st3.o();

    /* renamed from: b, reason: collision with root package name */
    public static int f494091b;

    /* renamed from: c, reason: collision with root package name */
    public static int f494092c;

    /* renamed from: d, reason: collision with root package name */
    public static int f494093d;

    public final int a() {
        if (f494091b <= 0) {
            c();
        }
        return f494091b;
    }

    public final android.graphics.Point b(int i17, int i18) {
        int a17 = a();
        android.graphics.Point point = new android.graphics.Point(i17, i18);
        if (i17 > i18) {
            if (i18 > a17) {
                point.y = a17;
                point.x = (int) (i17 * (a17 / i18));
            }
        } else if (i17 > a17) {
            point.x = a17;
            point.y = (int) ((i18 * a17) / i17);
        }
        return point;
    }

    public final synchronized android.graphics.Point c() {
        if (f494092c <= 0 || f494093d <= 0) {
            int i17 = d11.s.fj().rj().f152724d;
            android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i18 = (h17.y * i17) / h17.x;
            if (i18 % 16 != 0) {
                i18 = ai3.d.a(i18);
            }
            if (i17 % 16 != 0) {
                i17 = ai3.d.a(i17);
            }
            f494092c = i17;
            f494093d = i18;
            f494091b = i17;
        }
        return new android.graphics.Point(f494092c, f494093d);
    }
}
