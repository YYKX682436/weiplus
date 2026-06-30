package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult f78434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.v f78435e;

    public s(com.tencent.mm.plugin.appbrand.ipc.v vVar, com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        this.f78435e = vVar;
        this.f78434d = appBrandProxyUIProcessTask$ProcessResult;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ipc.e0 e0Var;
        com.tencent.mm.plugin.appbrand.ipc.e0 e0Var2;
        com.tencent.mm.plugin.appbrand.ipc.v vVar = this.f78435e;
        e0Var = vVar.mProxyUI;
        if (e0Var == null) {
            return;
        }
        e0Var2 = vVar.mProxyUI;
        ((com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI) e0Var2).T6(this.f78434d);
    }
}
