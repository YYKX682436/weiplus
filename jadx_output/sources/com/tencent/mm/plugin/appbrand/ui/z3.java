package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes.dex */
public final class z3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.ui.z3 f90362d = new com.tencent.mm.plugin.appbrand.ui.z3();

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.f(0, "关闭Profiler");
        g4Var.f(1, "开启 基础库Profile");
        g4Var.f(2, "开启 Perfetto");
        g4Var.f(3, "开启 基础库Profile和Perfetto");
    }
}
