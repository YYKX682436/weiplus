package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class b3 implements com.tencent.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f76148b;

    public b3(com.tencent.mm.plugin.appbrand.appstorage.c3 c3Var, java.lang.String str, java.util.List list) {
        this.f76147a = str;
        this.f76148b = list;
    }

    @Override // com.tencent.mm.vfs.t6
    public boolean accept(com.tencent.mm.vfs.r6 r6Var) {
        boolean z17 = !r6Var.getName().endsWith(".nomedia");
        if (z17) {
            com.tencent.mm.plugin.appbrand.appstorage.h1 h1Var = new com.tencent.mm.plugin.appbrand.appstorage.h1();
            h1Var.f76193a = com.tencent.mm.plugin.appbrand.appstorage.l1.h(r6Var.o().replaceFirst(this.f76147a, ""));
            this.f76148b.add(h1Var);
        }
        return z17;
    }
}
