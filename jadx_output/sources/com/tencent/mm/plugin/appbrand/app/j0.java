package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class j0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75137e;

    public j0(java.lang.String str, java.lang.String str2) {
        this.f75136d = str;
        this.f75137e = str2;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.task.k kVar = (com.tencent.mm.plugin.appbrand.task.k) com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().g(this.f75136d);
        if (kVar == null) {
            return;
        }
        kVar.f47645f = new com.tencent.mm.plugin.appbrand.app.i0(this.f75137e);
    }
}
