package com.tencent.mm.plugin.appbrand.app;

@j95.b(dependencies = {ob0.h3.class, com.tencent.mm.plugin.appbrand.app.e1.class})
/* loaded from: classes12.dex */
public class x0 extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        com.tencent.mm.plugin.performance.watchdogs.b0 b0Var = com.tencent.mm.plugin.performance.watchdogs.b0.B;
        com.tencent.mm.plugin.appbrand.report.s0 s0Var = com.tencent.mm.plugin.appbrand.report.s0.f88399a;
        b0Var.n(s0Var);
        ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog.getDog().setExtraInfoFactory(s0Var);
    }
}
