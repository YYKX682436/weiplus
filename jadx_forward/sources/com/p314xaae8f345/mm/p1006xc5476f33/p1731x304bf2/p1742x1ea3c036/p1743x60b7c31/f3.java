package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public final class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3 f221170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u43.b f221173g;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3 j3Var, android.content.Context context, java.lang.String str, u43.b bVar) {
        this.f221170d = j3Var;
        this.f221171e = context;
        this.f221172f = str;
        this.f221173g = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String pkgName = this.f221172f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pkgName, "$pkgName");
        u43.b bVar = this.f221173g;
        java.lang.String field_patchPath = bVar.f67992x7c02bf88;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_patchPath, "field_patchPath");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3.f(this.f221170d, this.f221171e, pkgName, field_patchPath, bVar);
    }
}
