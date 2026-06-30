package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public final class h4 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j4 f221194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221196c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221197d;

    public h4(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j4 j4Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, java.lang.String str) {
        this.f221194a = j4Var;
        this.f221195b = context;
        this.f221196c = q5Var;
        this.f221197d = str;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        this.f221194a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("saveMiniGameVideoToAlbum", "gamelog.jsapi, web , saveMiniGameVideoToAlbum, success, destPath = ".concat(destPath));
        java.lang.Object[] objArr = {q75.c.c(destPath)};
        android.content.Context context = this.f221195b;
        dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7b, objArr), 1).show();
        q75.c.f(destPath, context);
        this.f221196c.a(null, null);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        this.f221194a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("saveMiniGameVideoToAlbum", "gamelog.jsapi, web , saveMiniGameVideoToAlbum, error videoId = " + this.f221197d + ", srcPath = " + srcPath);
        this.f221196c.a("onExportFail", null);
    }
}
