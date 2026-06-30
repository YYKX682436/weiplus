package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.utils.c0 f90628e;

    public z(java.lang.String str, com.tencent.mm.plugin.appbrand.utils.c0 c0Var) {
        this.f90627d = str;
        this.f90628e = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = com.tencent.mm.plugin.appbrand.utils.d0.f90403b;
        java.lang.String str = this.f90627d;
        if (!((java.util.HashMap) map).containsKey(str)) {
            ((java.util.HashMap) map).put(str, new java.util.ArrayList());
        }
        ((java.util.List) ((java.util.HashMap) map).get(str)).add(this.f90628e);
    }
}
