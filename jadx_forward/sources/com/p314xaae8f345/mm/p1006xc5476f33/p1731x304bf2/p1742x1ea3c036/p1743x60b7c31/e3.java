package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public final class e3 implements rx5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3 f221161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221162c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221163d;

    public e3(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3 j3Var, android.content.Context context, java.lang.String str2) {
        this.f221160a = str;
        this.f221161b = j3Var;
        this.f221162c = context;
        this.f221163d = str2;
    }

    @Override // rx5.b
    public void a(java.lang.String str, java.lang.String str2, boolean z17) {
        u43.b bVar = new u43.b();
        bVar.f67992x7c02bf88 = str2;
        bVar.f67997xf2f12e3c = 1;
        bVar.f67989xf72be4b6 = true;
        java.lang.String str3 = this.f221160a;
        bVar.f67993x55b38832 = str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3 j3Var = this.f221161b;
        j3Var.j(j3Var.f221227e, bVar);
        bVar.f67996x1bb3b54a = java.lang.System.currentTimeMillis();
        ((u43.a) i95.n0.c(u43.a.class)).ya(bVar);
        android.content.Context context = this.f221162c;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j3.f(j3Var, context, str3, this.f221163d, bVar);
    }

    @Override // rx5.b
    public void b(java.lang.String str, int i17, boolean z17) {
        this.f221161b.i(this.f221160a, "download_patch_failed");
    }

    @Override // rx5.b
    public void c(java.lang.String str, long j17, long j18) {
    }
}
