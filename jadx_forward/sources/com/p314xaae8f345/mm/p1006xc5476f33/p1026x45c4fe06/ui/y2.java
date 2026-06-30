package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class y2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.y2 f171877d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.y2();

    public y2() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe it = (com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean z17 = false;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.g()) {
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("libiao", 4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sharedPreferences, "getSharedPreferences(...)");
            z17 = sharedPreferences.getBoolean("enable_fake_native_profile_skyline", false);
        }
        it.f301633d = z17;
        return jz5.f0.f384359a;
    }
}
