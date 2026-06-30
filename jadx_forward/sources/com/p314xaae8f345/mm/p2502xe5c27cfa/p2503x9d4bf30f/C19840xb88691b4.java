package com.p314xaae8f345.mm.p2502xe5c27cfa.p2503x9d4bf30f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/activity/RepairerActivityIgnoreBatteryOptimizations;", "Lq55/c;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.repairer.activity.RepairerActivityIgnoreBatteryOptimizations */
/* loaded from: classes5.dex */
public final class C19840xb88691b4 extends q55.c {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerActivity_IgnoreBatteryOptimizations";
    }

    @Override // q55.h
    public java.lang.String c() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        java.lang.Object systemService = context.getSystemService("power");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return "开启主进程回收（" + (((android.os.PowerManager) systemService).isIgnoringBatteryOptimizations(context.getPackageName()) ? "已开启" : "未开启，点击开启") + (char) 65289;
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20893xacab51a6.class;
    }

    @Override // q55.c
    public java.lang.String h() {
        return "com.tencent.mm.matrix.battery.debug.IgnoreBatteryOptimizationTrampoline";
    }
}
