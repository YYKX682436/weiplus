package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class k1 implements bf.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.o1 f79617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79618b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bf.i f79619c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ui1.z f79620d;

    public k1(com.tencent.mm.plugin.appbrand.jsapi.auth.o1 o1Var, com.tencent.mm.plugin.appbrand.y yVar, bf.i iVar, ui1.z zVar) {
        this.f79617a = o1Var;
        this.f79618b = yVar;
        this.f79619c = iVar;
        this.f79620d = zVar;
    }

    @Override // bf.h
    public final void a(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            ui1.z zVar = this.f79620d;
            com.tencent.mm.plugin.appbrand.jsapi.auth.o1 o1Var = this.f79617a;
            o1Var.e(o1Var.b(this.f79618b), bitmap, this.f79619c.fi(), "scope.userInfo", zVar);
        }
    }
}
