package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class n7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandStorageUsageUI f89883a;

    public n7(com.tencent.mm.plugin.appbrand.ui.AppBrandStorageUsageUI appBrandStorageUsageUI) {
        this.f89883a = appBrandStorageUsageUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appstorage.l0 l0Var;
        this.f89883a.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String j17 = gm0.j1.b().j();
        com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
        com.tencent.mm.vfs.r6[] b17 = com.tencent.mm.plugin.appbrand.appcache.d9.b();
        if (b17 == null) {
            b17 = new com.tencent.mm.vfs.r6[0];
        }
        for (com.tencent.mm.vfs.r6 r6Var : b17) {
            java.lang.String o17 = r6Var.o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            com.tencent.mm.plugin.appbrand.appcache.n9 p17 = Di.p(o17);
            if (p17 == null) {
                com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord i17 = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.i(o17);
                p17 = i17 != null ? com.tencent.mm.plugin.appbrand.appcache.r7.f(i17) : null;
            }
            if (p17 != null) {
                java.lang.String h17 = com.tencent.mm.plugin.appbrand.j0.f78443d.h(p17.field_appId);
                if (!hashMap.containsKey(h17)) {
                    com.tencent.mm.plugin.appbrand.appstorage.l0 l0Var2 = new com.tencent.mm.plugin.appbrand.appstorage.l0(null, null, null, 0L, 0L, 0, 0L, 0L, 255, null);
                    l0Var2.f76254a = h17;
                    hashMap.put(h17, l0Var2);
                }
                com.tencent.mm.plugin.appbrand.appstorage.l0 l0Var3 = (com.tencent.mm.plugin.appbrand.appstorage.l0) hashMap.get(h17);
                kotlin.jvm.internal.o.d(l0Var3);
                com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(o17);
                long j18 = m17 != null ? (int) m17.f213234d : 0;
                l0Var3.f76257d += j18;
                l0Var3.f76258e += j18;
                l0Var3.f76259f++;
            }
        }
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.plugin.appbrand.app.r9.ij().d1("appId", "brandIconURL", "nickname")).iterator();
        while (it.hasNext()) {
            k91.v5 v5Var = (k91.v5) it.next();
            java.lang.String str = v5Var.field_appId;
            if (hashMap.containsKey(str)) {
                java.lang.Object obj2 = hashMap.get(str);
                kotlin.jvm.internal.o.d(obj2);
                com.tencent.mm.plugin.appbrand.appstorage.l0 l0Var4 = (com.tencent.mm.plugin.appbrand.appstorage.l0) obj2;
                java.lang.String str2 = v5Var.field_brandIconURL;
                if (str2 == null) {
                    str2 = "";
                }
                l0Var4.f76255b = str2;
                java.lang.String str3 = v5Var.field_nickname;
                l0Var4.f76256c = str3 != null ? str3 : "";
            } else {
                kotlin.jvm.internal.o.d(str);
                com.tencent.mm.plugin.appbrand.appstorage.l0 l0Var5 = new com.tencent.mm.plugin.appbrand.appstorage.l0(null, null, null, 0L, 0L, 0, 0L, 0L, 255, null);
                l0Var5.f76254a = str;
                java.lang.String str4 = v5Var.field_brandIconURL;
                if (str4 == null) {
                    str4 = "";
                }
                l0Var5.f76255b = str4;
                java.lang.String str5 = v5Var.field_nickname;
                l0Var5.f76256c = str5 != null ? str5 : "";
                hashMap.put(str, l0Var5);
            }
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str6 = (java.lang.String) entry.getKey();
            com.tencent.mm.plugin.appbrand.g0 g0Var = com.tencent.mm.plugin.appbrand.j0.f78443d;
            kotlin.jvm.internal.o.d(j17);
            long b18 = g0Var.b(j17, str6, java.lang.Boolean.TRUE) + g0Var.c(j17, str6);
            com.tencent.mm.plugin.appbrand.appstorage.l0 l0Var6 = (com.tencent.mm.plugin.appbrand.appstorage.l0) entry.getValue();
            l0Var6.f76257d += b18;
            l0Var6.f76260g += b18;
        }
        com.tencent.mm.plugin.appbrand.appusage.d2 d2Var = (com.tencent.mm.plugin.appbrand.appusage.d2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.d2.class);
        if (d2Var != null) {
            for (java.util.Map.Entry entry2 : ((java.util.HashMap) d2Var.z0()).entrySet()) {
                if (hashMap.containsKey(entry2.getKey()) && (l0Var = (com.tencent.mm.plugin.appbrand.appstorage.l0) hashMap.get(entry2.getKey())) != null) {
                    l0Var.f76261h = ((java.lang.Number) entry2.getValue()).longValue();
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
        java.util.Iterator it6 = hashMap.entrySet().iterator();
        while (it6.hasNext()) {
            arrayList.add((com.tencent.mm.plugin.appbrand.appstorage.l0) ((java.util.Map.Entry) it6.next()).getValue());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            java.lang.Object next = it7.next();
            if (((com.tencent.mm.plugin.appbrand.appstorage.l0) next).f76257d > 0) {
                arrayList2.add(next);
            }
        }
        return kz5.n0.F0(arrayList2, new com.tencent.mm.plugin.appbrand.ui.j7());
    }
}
