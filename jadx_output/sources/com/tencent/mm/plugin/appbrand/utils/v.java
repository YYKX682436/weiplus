package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class v implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f90581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90583f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.y3 f90584g;

    public v(int i17, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.utils.y3 y3Var) {
        this.f90581d = i17;
        this.f90582e = str;
        this.f90583f = str2;
        this.f90584g = y3Var;
    }

    @Override // z2.f
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRequestPermissionsResult, requestCode: ");
        sb6.append(i17);
        sb6.append(", permissions: ");
        java.lang.String arrays = java.util.Arrays.toString(permissions);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", grantResults: ");
        java.lang.String arrays2 = java.util.Arrays.toString(grantResults);
        kotlin.jvm.internal.o.f(arrays2, "toString(...)");
        sb6.append(arrays2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEnvExt", sb6.toString());
        if (i17 != this.f90581d) {
            return;
        }
        si1.e1.b(this.f90582e, this);
        boolean b17 = kotlin.jvm.internal.o.b(this.f90583f, kz5.z.U(permissions, 0));
        com.tencent.mm.plugin.appbrand.utils.y3 y3Var = this.f90584g;
        if (b17) {
            java.lang.Integer S = kz5.z.S(grantResults, 0);
            y3Var.a((S != null ? S.intValue() : -1) == 0 ? com.tencent.mm.plugin.appbrand.utils.i4.f90479e : com.tencent.mm.plugin.appbrand.utils.i4.f90480f);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandEnvExt", "onRequestPermissionsResult, permission not found");
            y3Var.a(com.tencent.mm.plugin.appbrand.utils.i4.f90480f);
        }
    }
}
