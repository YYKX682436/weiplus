package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c;

/* loaded from: classes7.dex */
public final class m0 implements kf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170454a;

    public m0(int i17) {
        this.f170454a = i17;
    }

    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0.f170435a;
        int i19 = this.f170454a;
        sh1.g b17 = k0Var.b(i19);
        if (b17 != null) {
            b17.a(i17, i18);
            return;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(dm.i4.f66865x76d1ec5a, i19);
        bundle.putInt("width", i17);
        bundle.putInt("height", i18);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.i0.f170430d.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.j0.f170432d);
    }
}
