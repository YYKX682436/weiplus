package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

/* loaded from: classes8.dex */
public abstract class d {
    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        java.lang.String[] split;
        if (c19091x9511676c == null) {
            return false;
        }
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(196659, null);
        if (!android.text.TextUtils.isEmpty(str) && (split = str.split("&")) != null && split.length != 0) {
            for (java.lang.String str2 : split) {
                if (str2 != null && str2.equals(c19091x9511676c.f69223x58802fcb)) {
                    return false;
                }
            }
        }
        return true;
    }
}
