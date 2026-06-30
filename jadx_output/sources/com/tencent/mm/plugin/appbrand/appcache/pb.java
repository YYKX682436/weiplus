package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class pb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.ac f75725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(com.tencent.mm.plugin.appbrand.appcache.ac acVar) {
        super(0);
        this.f75725d = acVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.appcache.ac acVar = this.f75725d;
        java.util.Set<java.util.Map.Entry> entrySet = acVar.f75446e.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            kotlin.jvm.internal.o.d(entry);
            ((com.tencent.mm.plugin.appbrand.appcache.y8) entry.getValue()).close();
        }
        acVar.f75446e.clear();
        acVar.f75447f.clear();
        return jz5.f0.f302826a;
    }
}
