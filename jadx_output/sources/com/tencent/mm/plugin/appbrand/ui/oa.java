package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public final class oa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f89906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f89907e;

    public oa(android.content.Context context, yz5.l lVar) {
        this.f89906d = context;
        this.f89907e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object systemService = this.f89906d.getSystemService("power");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        this.f89907e.invoke(java.lang.Boolean.valueOf(((android.os.PowerManager) systemService).isInteractive()));
    }
}
