package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes.dex */
public final class o3 implements pb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90522a;

    public o3(java.lang.String str) {
        this.f90522a = str;
    }

    @Override // pb.c
    public void load(java.lang.String libName) {
        kotlin.jvm.internal.o.g(libName, "libName");
        if (kotlin.jvm.internal.o.b(libName, "luggage_trace")) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load ");
            java.lang.String str = this.f90522a;
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageTraceBooter", sb6.toString());
            com.tencent.cso.CsoLoader.g(str);
        }
    }
}
