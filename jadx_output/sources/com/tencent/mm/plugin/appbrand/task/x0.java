package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public enum x0 {
    WASERVICE(1, Integer.MAX_VALUE, com.tencent.mm.plugin.appbrand.service.c0.class, com.tencent.mm.plugin.appbrand.page.n7.class),
    WAGAME(2, 2, fa1.t.class, pa1.o.class),
    NIL(0, 0, null, null);


    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f89212d;

    x0(int i17, int i18, java.lang.Class cls, java.lang.Class cls2) {
        this.f89212d = cls;
    }

    public static com.tencent.mm.plugin.appbrand.task.x0 d(boolean z17) {
        return z17 ? WAGAME : WASERVICE;
    }

    public static int h() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_wagame_task_num, 2);
        com.tencent.mars.xlog.Log.i("AppBrandServiceType", "getGameTaskExptNum exp:%d", java.lang.Integer.valueOf(Ni));
        if (Ni <= 0) {
            return 2;
        }
        return Ni;
    }
}
