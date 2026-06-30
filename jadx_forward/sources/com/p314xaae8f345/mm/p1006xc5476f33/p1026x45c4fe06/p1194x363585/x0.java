package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public enum x0 {
    WASERVICE(1, Integer.MAX_VALUE, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7.class),
    WAGAME(2, 2, fa1.t.class, pa1.o.class),
    NIL(0, 0, null, null);


    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f170745d;

    x0(int i17, int i18, java.lang.Class cls, java.lang.Class cls2) {
        this.f170745d = cls;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 d(boolean z17) {
        return z17 ? WAGAME : WASERVICE;
    }

    public static int h() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_wagame_task_num, 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandServiceType", "getGameTaskExptNum exp:%d", java.lang.Integer.valueOf(Ni));
        if (Ni <= 0) {
            return 2;
        }
        return Ni;
    }
}
