package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class o0 implements kx5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.n0 f67239a;

    public o0(com.tencent.mm.feature.lite.n0 n0Var) {
        this.f67239a = n0Var;
    }

    @Override // kx5.k
    public void a() {
        com.tencent.mm.feature.lite.n0 n0Var = this.f67239a;
        n0Var.f67225d.f();
        ((java.util.Set) ((java.util.concurrent.ConcurrentHashMap) n0Var.f67231m.f67174i).computeIfAbsent(n0Var.f67225d.f46051r, new com.tencent.mm.feature.lite.o0$$a())).add(java.lang.Long.valueOf(n0Var.f67225d.getAppUuid()));
        ((java.util.Set) ((java.util.concurrent.ConcurrentHashMap) n0Var.f67231m.f67175m).computeIfAbsent(n0Var.f67225d.f46051r, new com.tencent.mm.feature.lite.o0$$b())).add(n0Var.f67225d.f46054u);
        q80.s sVar = n0Var.f67229h;
        if (sVar != null) {
            sVar.a(n0Var.f67225d);
        }
    }
}
