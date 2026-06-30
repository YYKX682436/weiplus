package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c;

/* loaded from: classes7.dex */
public final class o0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f170462d;

    public o0(int i17) {
        this.f170462d = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v
    public final void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        int i17 = this.f170462d;
        sb6.append(i17);
        sb6.append(" onBackground");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineNativeViewPluginHandler", sb6.toString());
        sh1.g b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.k0.f170435a.b(i17);
        if (b17 != null) {
            b17.mo45014x65825f6();
            return;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(dm.i4.f66865x76d1ec5a, i17);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.z.f170491d.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.a0.f170420d);
    }
}
