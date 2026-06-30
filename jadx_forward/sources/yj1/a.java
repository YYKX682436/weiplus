package yj1;

/* loaded from: classes7.dex */
public abstract class a {
    public static final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 rt6, android.content.res.Configuration oldConfig, android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldConfig, "oldConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        boolean f17 = rt6.m0() != null ? rt6.m0().f() : false;
        boolean z17 = (newConfig.uiMode & 48) != (oldConfig.uiMode & 48);
        boolean F = com.p314xaae8f345.mm.ui.bk.F();
        boolean I = com.p314xaae8f345.mm.ui.bk.I();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBandDarkModeHelper", "darkModeThemeChanged  isDarkModeSupportForCurrentWxa=%b  isNightModeEnableForWeChat=%b  isDarkModeFollowSystem=%b  nightModeChanged=%b", java.lang.Boolean.valueOf(f17), java.lang.Boolean.valueOf(F), java.lang.Boolean.valueOf(I), java.lang.Boolean.valueOf(z17));
        if (!f17 || !F || !z17 || !I) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Theme change into ");
        sb6.append(32 == (newConfig.uiMode & 48) ? "NIGHT" : "DAY");
        sb6.append(" mode");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBandDarkModeHelper", sb6.toString());
        return true;
    }
}
