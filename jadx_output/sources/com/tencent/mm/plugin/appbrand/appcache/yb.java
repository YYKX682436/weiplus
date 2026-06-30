package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class yb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.ac f76077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f76078e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(com.tencent.mm.plugin.appbrand.appcache.ac acVar, java.lang.String str) {
        super(0);
        this.f76077d = acVar;
        this.f76078e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.appcache.ac acVar = this.f76077d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = acVar.f75447f;
        java.lang.String str = this.f76078e;
        com.tencent.mm.plugin.appbrand.appcache.x3 x3Var = (com.tencent.mm.plugin.appbrand.appcache.x3) concurrentHashMap.get(str);
        if (x3Var != null) {
            return x3Var;
        }
        java.lang.String[] strArr = {com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true), com.tencent.mm.plugin.appbrand.appstorage.l1.i(str)};
        com.tencent.mm.plugin.appbrand.appcache.x3 x3Var2 = null;
        for (int i17 = 0; i17 < 2; i17++) {
            java.lang.String str2 = strArr[i17];
            if (!kotlin.jvm.internal.o.b(str2, str) && (x3Var2 = (com.tencent.mm.plugin.appbrand.appcache.x3) acVar.f75447f.get(str2)) != null) {
                break;
            }
        }
        return x3Var2;
    }
}
