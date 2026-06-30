package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public abstract class o2 {
    public static final com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime, java.lang.String enterPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterPath, "enterPath");
        java.lang.String str = runtime.f156336n;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImageHelper", "resolveWxaInfo, appId is null");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 u07 = runtime.u0();
        java.lang.String str2 = u07 != null ? u07.f158812e : null;
        if (str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImageHelper", "resolveWxaInfo, nickname is null");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 u08 = runtime.u0();
        java.lang.String str3 = u08 != null ? u08.f158813f : null;
        if (str3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImageHelper", "resolveWxaInfo, iconUrl is null");
            return null;
        }
        com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e c11127xcc7d6e4e = new com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e(str, str2, str3, enterPath, "1", 1, runtime.f156338p.f158814g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImageHelper", "resolveWxaInfo, screenshotInfo: " + c11127xcc7d6e4e);
        return c11127xcc7d6e4e;
    }
}
