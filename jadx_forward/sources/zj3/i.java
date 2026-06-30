package zj3;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final zj3.i f554861a = new zj3.i();

    /* renamed from: b, reason: collision with root package name */
    public static final zj3.h[] f554862b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f554863c;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f554864d;

    /* renamed from: e, reason: collision with root package name */
    public static long f554865e;

    /* renamed from: f, reason: collision with root package name */
    public static long f554866f;

    /* renamed from: g, reason: collision with root package name */
    public static long f554867g;

    /* renamed from: h, reason: collision with root package name */
    public static long f554868h;

    /* renamed from: i, reason: collision with root package name */
    public static int f554869i;

    static {
        zj3.h[] hVarArr = new zj3.h[5];
        for (int i17 = 0; i17 < 5; i17++) {
            hVarArr[i17] = new zj3.h(i17, 0L, 0);
        }
        f554862b = hVarArr;
        f554863c = kz5.c1.k(new jz5.l(0, 0), new jz5.l(1, 3), new jz5.l(2, 6), new jz5.l(3, 9), new jz5.l(4, 12));
        f554864d = new int[2];
    }

    public final void a(int i17, long j17) {
        zj3.h hVar = f554862b[i17];
        hVar.f554860c++;
        hVar.f554859b += j17;
    }

    public final void b(int i17) {
        if (f554869i == 0) {
            f554865e = java.lang.System.currentTimeMillis();
        }
        if (i17 != f554869i) {
            int[] iArr = f554864d;
            if (i17 == 1) {
                iArr[0] = iArr[0] + 1;
                long currentTimeMillis = java.lang.System.currentTimeMillis() - f554865e;
                f554867g += currentTimeMillis;
                f554866f += currentTimeMillis;
            } else if (i17 == 2) {
                iArr[1] = iArr[1] + 1;
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - f554865e;
                f554868h += currentTimeMillis2;
                f554866f += currentTimeMillis2;
            }
            f554865e = java.lang.System.currentTimeMillis();
            f554869i = i17;
        }
    }

    public final void c(int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultitalkReportHelper", "report avg key: " + i17 + " value: " + j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.f.f34332x366c91de, i17, i17 + 1, (int) j17, false);
    }

    public final void d() {
        zj3.h[] hVarArr = f554862b;
        for (int i17 = 0; i17 < 5; i17++) {
            zj3.h hVar = hVarArr[i17];
            hVar.f554859b = 0L;
            hVar.f554860c = 0;
        }
        int[] iArr = f554864d;
        int length = iArr.length;
        for (int i18 = 0; i18 < length; i18++) {
            iArr[i18] = 0;
        }
        f554865e = 0L;
        f554866f = 0L;
        f554868h = 0L;
        f554867g = 0L;
        f554869i = 0;
    }
}
