package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.preload.r1 f94423d = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.r1();

    public r1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.ActivityManager.RunningAppProcessInfo it = (android.app.ActivityManager.RunningAppProcessInfo) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = it.processName;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1 t1Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a;
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(str, (java.lang.String) ((jz5.n) com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94437c).getValue()));
    }
}
