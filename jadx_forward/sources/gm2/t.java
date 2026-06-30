package gm2;

/* loaded from: classes3.dex */
public final class t implements gm2.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final gm2.c2 f355012a;

    public t(gm2.c2 spanMode, gm2.e2 sizeMode, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        spanMode = (i17 & 1) != 0 ? gm2.c2.f354881g : spanMode;
        sizeMode = (i17 & 2) != 0 ? gm2.e2.f354894g : sizeMode;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanMode, "spanMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizeMode, "sizeMode");
        this.f355012a = spanMode;
    }

    @Override // gm2.z1
    public int a(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        int ordinal = this.f355012a.ordinal();
        if (ordinal == 1) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92);
        }
        if (ordinal == 2 && !com.p314xaae8f345.mm.ui.bk.C()) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92);
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77684x8113c231);
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int b(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 0;
    }

    @Override // gm2.z1
    public int c(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        int ordinal = this.f355012a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77906xd1a78a03);
            }
            if (ordinal == 2) {
                return com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77628xb498cd1d);
            }
            if (ordinal != 3) {
                throw new jz5.j();
            }
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b);
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
