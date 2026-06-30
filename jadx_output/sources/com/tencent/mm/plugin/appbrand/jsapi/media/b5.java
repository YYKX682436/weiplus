package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class b5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f81727b;

    public b5(com.tencent.mm.plugin.appbrand.jsapi.l lVar, boolean z17) {
        this.f81726a = lVar;
        this.f81727b = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.vfs.r6 r6Var = (com.tencent.mm.vfs.r6) obj;
        if (!this.f81726a.isRunning()) {
            km5.u.b().a(new java.lang.Exception("component not running"));
        } else {
            if (!this.f81727b) {
                return r6Var;
            }
            try {
                return new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.appbrand.jsapi.media.t7.e(r6Var.o()));
            } catch (java.lang.Exception e17) {
                if (z65.c.a()) {
                    throw e17;
                }
                km5.u.b().a(e17);
            }
        }
        return null;
    }
}
