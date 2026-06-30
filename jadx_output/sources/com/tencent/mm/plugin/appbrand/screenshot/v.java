package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class v implements qj5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f88578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f88579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f88580c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.w f88581d;

    public v(com.tencent.mm.plugin.appbrand.o6 o6Var, boolean z17, android.content.Context context, com.tencent.mm.plugin.appbrand.screenshot.w wVar) {
        this.f88578a = o6Var;
        this.f88579b = z17;
        this.f88580c = context;
        this.f88581d = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(com.tencent.mm.plugin.appbrand.screenshot.v r30, android.content.Context r31, java.lang.String r32, java.lang.String r33, kotlin.coroutines.Continuation r34) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.screenshot.v.j(com.tencent.mm.plugin.appbrand.screenshot.v, android.content.Context, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qj5.q
    public java.lang.String a() {
        return i65.a.r(this.f88580c, com.tencent.mm.R.string.n8m);
    }

    @Override // qj5.q
    public p15.n b(boolean z17) {
        if (this.f88579b) {
            return null;
        }
        p15.n nVar = new p15.n();
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f88578a;
        com.tencent.mm.plugin.appbrand.screenshot.w wVar = this.f88581d;
        p15.m mVar = new p15.m();
        mVar.l(14);
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
        mVar.n(u07 != null ? u07.f77280f : null);
        nVar.n(mVar);
        p15.x xVar = new p15.x();
        xVar.p(o6Var.f74803n);
        java.lang.String str = wVar.f88586a;
        if (str == null) {
            com.tencent.mm.plugin.appbrand.page.d5 x07 = o6Var.x0();
            str = x07 != null ? x07.getCurrentUrl() : null;
        }
        xVar.q(str);
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u08 = o6Var.u0();
        xVar.u(u08 != null ? u08.f77279e : null);
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u09 = o6Var.u0();
        xVar.t(u09 != null ? u09.f77280f : null);
        int i17 = 1;
        xVar.w(1);
        xVar.x(o6Var.f74805p.f77281g);
        if (z17) {
            i17 = 2;
            if (r26.n0.D(wVar.f88587b, "wxa_default_poster_", false, 2, null)) {
                com.tencent.mm.plugin.appbrand.screenshot.u1[] u1VarArr = com.tencent.mm.plugin.appbrand.screenshot.u1.f88577d;
                i17 = 3;
            } else {
                com.tencent.mm.plugin.appbrand.screenshot.u1[] u1VarArr2 = com.tencent.mm.plugin.appbrand.screenshot.u1.f88577d;
            }
        } else {
            com.tencent.mm.plugin.appbrand.screenshot.u1[] u1VarArr3 = com.tencent.mm.plugin.appbrand.screenshot.u1.f88577d;
        }
        xVar.r(i17);
        nVar.o(xVar);
        return nVar;
    }

    @Override // qj5.q
    public java.lang.Object d(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        java.lang.String o17;
        java.lang.String o18;
        if (this.f88580c == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandScreenshotComponentHelper", "getGenImgPath: context is null, returning null");
            return null;
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f88578a;
        com.tencent.mm.vfs.r6 allocTempFile = o6Var.getFileSystem().allocTempFile("wxa_custom_poster_" + java.lang.System.currentTimeMillis() + ".png");
        com.tencent.mm.vfs.r6 allocTempFile2 = o6Var.getFileSystem().allocTempFile("wxa_default_poster_" + java.lang.System.currentTimeMillis() + ".png");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getGenImgPath: allocated temp file custom : ");
        sb6.append(allocTempFile != null ? allocTempFile.o() : null);
        sb6.append(" default: ");
        sb6.append(allocTempFile2 != null ? allocTempFile2.o() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotComponentHelper", sb6.toString());
        if (allocTempFile == null || (o17 = allocTempFile.o()) == null || allocTempFile2 == null || (o18 = allocTempFile2.o()) == null) {
            return null;
        }
        return kotlinx.coroutines.z0.f(new com.tencent.mm.plugin.appbrand.screenshot.u(this.f88581d, this.f88578a, o17, this, this.f88580c, o18, str, allocTempFile2, null), continuation);
    }

    @Override // qj5.q
    public qj5.p h() {
        qj5.p pVar = new qj5.p();
        if (this.f88578a.q2()) {
            pVar.f363995a = true;
            pVar.f363996b = true;
            pVar.f363997c = true;
        }
        return pVar;
    }

    @Override // qj5.q
    public int i() {
        return !this.f88579b ? 0 : 8;
    }
}
