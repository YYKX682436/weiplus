package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public abstract class up {
    public static void a(android.content.Context context, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.tp tpVar = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.tp.NOTSET;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckySoundUtil", "play Err context:%s pathId:%d speekeron:%s looping:%b", context, java.lang.Integer.valueOf(i17), tpVar, java.lang.Boolean.FALSE);
            return;
        }
        if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Zi()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckySoundUtil", "do not play: system is mute");
        } else if (ip.b.s() && ip.b.b()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.d(context, i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x5.f274617d, false, null);
        }
    }
}
