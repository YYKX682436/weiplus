package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class qb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.ac f75923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(com.tencent.mm.plugin.appbrand.appcache.ac acVar, java.lang.String str) {
        super(0);
        this.f75923d = acVar;
        this.f75924e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.appcache.ac acVar = this.f75923d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = acVar.f75447f;
        java.lang.String str = this.f75924e;
        com.tencent.mm.plugin.appbrand.appcache.x3 x3Var = (com.tencent.mm.plugin.appbrand.appcache.x3) concurrentHashMap.get(str);
        com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = x3Var != null ? x3Var.f76043d : null;
        if (y8Var != null) {
            return y8Var;
        }
        for (java.util.Map.Entry entry : acVar.f75447f.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            com.tencent.mm.plugin.appbrand.appcache.x3 x3Var2 = (com.tencent.mm.plugin.appbrand.appcache.x3) entry.getValue();
            if (r26.i0.A(str2, str, false, 2, null)) {
                return x3Var2.f76043d;
            }
        }
        return null;
    }
}
