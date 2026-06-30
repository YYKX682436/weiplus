package gm2;

/* loaded from: classes3.dex */
public final class x implements gm2.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final gm2.c2 f355056a;

    public x(gm2.c2 spanMode, gm2.e2 sizeMode, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        spanMode = (i17 & 1) != 0 ? gm2.c2.f354881g : spanMode;
        sizeMode = (i17 & 2) != 0 ? gm2.e2.f354894g : sizeMode;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanMode, "spanMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizeMode, "sizeMode");
        this.f355056a = spanMode;
    }

    @Override // gm2.z1
    public int a(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230);
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int b(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 0;
    }

    @Override // gm2.z1
    public int c(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        gm2.c2 c2Var = gm2.c2.f354883i;
        gm2.c2 c2Var2 = this.f355056a;
        return c2Var2 == c2Var ? com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77628xb498cd1d) : (c2Var2 == gm2.c2.f354881g || c2Var2 == gm2.c2.f354884m) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77628xb498cd1d);
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int d(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 0;
    }

    @Override // gm2.z1
    public int[] e(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return new int[2];
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int f(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 0;
    }

    @Override // gm2.z1
    public gm2.u1 g(int i17) {
        return null;
    }

    @Override // gm2.z1
    public gm2.v1 h(int i17) {
        return null;
    }
}
