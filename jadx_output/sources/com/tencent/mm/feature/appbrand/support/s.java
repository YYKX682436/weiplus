package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes7.dex */
public final class s implements ft.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.o f65114d;

    public s(com.tencent.mm.plugin.appbrand.task.o oVar) {
        this.f65114d = oVar;
    }

    @Override // ft.c
    /* renamed from: a */
    public boolean getF65046f() {
        return this.f65114d.f89105i == com.tencent.luggage.sdk.launching.p.HEADLESS;
    }

    @Override // ft.c
    /* renamed from: b */
    public java.lang.String getF65044d() {
        return this.f65114d.f47684a;
    }

    @Override // ft.c
    /* renamed from: c */
    public ft.d getF65045e() {
        return this.f65114d.f89109m ? ft.d.WAGAME : ft.d.WASERVICE;
    }
}
