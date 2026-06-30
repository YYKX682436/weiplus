package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj1.c f89029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.i f89030e;

    public h(bj1.c cVar, com.tencent.mm.plugin.appbrand.task.i iVar) {
        this.f89029d = cVar;
        this.f89030e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.task.i iVar = this.f89030e;
        try {
            this.f89029d.c4(2);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            iVar.a("onServiceConnected");
            throw th6;
        }
        iVar.a("onServiceConnected");
    }
}
