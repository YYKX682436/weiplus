package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes15.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Parcelable f78425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.p0 f78426e;

    public o0(com.tencent.mm.plugin.appbrand.ipc.p0 p0Var, android.os.Parcelable parcelable) {
        this.f78426e = p0Var;
        this.f78425d = parcelable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ipc.p0 p0Var = this.f78426e;
        com.tencent.mm.plugin.appbrand.ipc.MainProcessTask.a(this.f78425d, p0Var.f78428d.f78431b);
        p0Var.f78428d.f78431b.y();
    }
}
