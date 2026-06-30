package com.tencent.mm.plugin.appbrand.launching.teenmode;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.t2 f85192d;

    public c(com.tencent.mm.plugin.appbrand.appusage.t2 t2Var) {
        this.f85192d = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.launching.teenmode.k kVar = com.tencent.mm.plugin.appbrand.launching.teenmode.k.f85200a;
        com.tencent.mm.plugin.appbrand.appusage.t2 t2Var = this.f85192d;
        kVar.a(t2Var.field_username, t2Var.field_versionType);
    }
}
