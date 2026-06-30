package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class m2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0 {

    /* renamed from: CTRL_INDEX */
    private static final int f35133x366c91de = 49;

    /* renamed from: NAME */
    public static final java.lang.String f35134x24728b = "onAppEnterBackground";

    public void x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        java.lang.String str;
        java.util.HashMap hashMap = new java.util.HashMap(1);
        int ordinal = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(c11510xdd90c2f2.f156336n).ordinal();
        if (ordinal == 0) {
            str = "close";
        } else if (ordinal != 1) {
            str = "hide";
            if (ordinal != 2) {
                if (ordinal == 3) {
                    str = "hang";
                } else if (ordinal != 4 && ordinal != 6 && ordinal == 7) {
                    str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.l.f34522x24728b;
                }
            }
        } else {
            str = "back";
        }
        hashMap.put("mode", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0 t17 = t(hashMap);
        t17.u(c11510xdd90c2f2.C0());
        t17.m();
    }
}
