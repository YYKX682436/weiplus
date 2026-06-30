package gm2;

/* loaded from: classes3.dex */
public class e implements gm2.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final gm2.c2 f354888a;

    /* renamed from: b, reason: collision with root package name */
    public final gm2.e2 f354889b;

    static {
        new gm2.d(null);
    }

    public e(gm2.c2 spanMode, gm2.e2 sizeMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanMode, "spanMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizeMode, "sizeMode");
        this.f354888a = spanMode;
        this.f354889b = sizeMode;
    }

    @Override // gm2.z1
    public int a(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0);
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int b(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 0;
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int c(java.lang.Object obj) {
        return i(((java.lang.Number) obj).intValue());
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int d(java.lang.Object obj) {
        return k(((java.lang.Number) obj).intValue());
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int[] e(java.lang.Object obj) {
        return l(((java.lang.Number) obj).intValue());
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int f(java.lang.Object obj) {
        return j(((java.lang.Number) obj).intValue());
    }

    @Override // gm2.z1
    public gm2.u1 g(int i17) {
        return null;
    }

    @Override // gm2.z1
    public gm2.v1 h(int i17) {
        return null;
    }

    public int i(int i17) {
        gm2.c2 c2Var = gm2.c2.f354883i;
        gm2.c2 c2Var2 = this.f354888a;
        return c2Var2 == c2Var ? com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77628xb498cd1d) : (c2Var2 == gm2.c2.f354881g || c2Var2 == gm2.c2.f354884m) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77628xb498cd1d);
    }

    public int j(int i17) {
        return 0;
    }

    public int k(int i17) {
        if (1 <= i17 && i17 < 7) {
            return com.p314xaae8f345.mm.R.C30861xcebc809e.c4e;
        }
        if (7 <= i17 && i17 < 13) {
            return com.p314xaae8f345.mm.R.C30861xcebc809e.c4f;
        }
        if (!(13 <= i17 && i17 < 18)) {
            if (!(18 <= i17 && i17 <= Integer.MAX_VALUE)) {
                return 0;
            }
        }
        return com.p314xaae8f345.mm.R.C30861xcebc809e.c4g;
    }

    public int[] l(int i17) {
        gm2.c1 c1Var = gm2.c1.f354853a;
        int h17 = c1Var.h();
        int intValue = ((java.lang.Number) ((jz5.n) gm2.c1.f354875w).mo141623x754a37bb()).intValue();
        int f17 = c1Var.f();
        int ordinal = this.f354889b.ordinal();
        return ordinal != 0 ? ordinal != 2 ? new int[]{intValue, intValue} : new int[]{f17, f17} : new int[]{h17, h17};
    }
}
