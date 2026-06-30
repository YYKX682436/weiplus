package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class l4 implements bf.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.u4 f79629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bf.i f79631c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.o f79632d;

    public l4(com.tencent.mm.plugin.appbrand.jsapi.auth.u4 u4Var, com.tencent.mm.plugin.appbrand.y yVar, bf.i iVar, fl1.o oVar) {
        this.f79629a = u4Var;
        this.f79630b = yVar;
        this.f79631c = iVar;
        this.f79632d = oVar;
    }

    @Override // bf.h
    public final void a(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.u4 u4Var = this.f79629a;
        u4Var.e(u4Var.b(this.f79630b), bitmap, this.f79631c.fi(), "scope.userInfo", this.f79632d);
    }
}
