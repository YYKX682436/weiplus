package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public class x2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.b3 f90617a;

    public x2(com.tencent.mm.plugin.appbrand.utils.b3 b3Var) {
        this.f90617a = b3Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.appbrand.utils.b3 b3Var = this.f90617a;
        if (str == null || !str.contains("11111")) {
            if (b3Var != null) {
                b3Var.b(str);
            }
        } else if (b3Var != null) {
            b3Var.onSuccess(str);
        }
    }
}
