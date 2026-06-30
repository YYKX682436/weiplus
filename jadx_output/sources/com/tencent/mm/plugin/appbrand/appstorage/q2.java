package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class q2 implements com.tencent.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f76308b;

    public q2(com.tencent.mm.plugin.appbrand.appstorage.r2 r2Var, java.lang.String str, java.util.List list) {
        this.f76307a = str;
        this.f76308b = list;
    }

    @Override // com.tencent.mm.vfs.t6
    public boolean accept(com.tencent.mm.vfs.r6 r6Var) {
        boolean z17 = !r6Var.getName().endsWith(".nomedia");
        if (z17 && !r6Var.y()) {
            com.tencent.mm.plugin.appbrand.appstorage.h2 h2Var = new com.tencent.mm.plugin.appbrand.appstorage.h2(com.tencent.mm.plugin.appbrand.appstorage.l1.h(r6Var.o().replaceFirst(this.f76307a, "")));
            com.tencent.mm.plugin.appbrand.appstorage.FileStat.vfsStat(r6Var.o(), h2Var);
            this.f76308b.add(h2Var);
        }
        return z17;
    }
}
