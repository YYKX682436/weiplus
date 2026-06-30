package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class u implements r.a {
    public u(com.tencent.mm.plugin.appbrand.p pVar) {
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        k91.v5 v5Var = (k91.v5) obj;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = v5Var == null ? "null" : v5Var.field_appId;
        com.tencent.mars.xlog.Log.i("AppBrandCommand", "prefetch contact get %s", objArr);
        return null;
    }
}
