package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes4.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p874xaefb6cc9.a0 f150529d = new com.p314xaae8f345.mm.p874xaefb6cc9.a0();

    public a0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String a17 = j62.e.g().a("clicfg_appbrand_wva_enable_android", null, false, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVA.WVAABTest", "WVAABTest getConfig: " + a17);
        if (a17 != null) {
            try {
                cl0.g gVar = new cl0.g(a17);
                java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("appid_pattern");
                long optLong = gVar.optLong("wvapkg_max_total_size_mb");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
                return new com.p314xaae8f345.mm.p874xaefb6cc9.b0(mo15082x48bce8a4, optLong, false);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WVA.WVAABTest", e17, "parse config failed", new java.lang.Object[0]);
            }
        }
        return new com.p314xaae8f345.mm.p874xaefb6cc9.b0("", 0L, true);
    }
}
