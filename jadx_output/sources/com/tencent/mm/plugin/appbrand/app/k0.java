package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f75147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f75148f;

    public k0(java.lang.String str, com.tencent.mm.vfs.r6 r6Var, com.tencent.mm.vfs.r6 r6Var2) {
        this.f75146d = str;
        this.f75147e = r6Var;
        this.f75148f = r6Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.vfs.r6 r6Var = this.f75147e;
        java.lang.String str = this.f75146d;
        com.tencent.mm.plugin.appbrand.jsapi.file.i.a(str, "saved_temp", r6Var);
        com.tencent.mm.plugin.appbrand.jsapi.file.i.a(str, "normal_none_flatten", this.f75148f);
    }
}
