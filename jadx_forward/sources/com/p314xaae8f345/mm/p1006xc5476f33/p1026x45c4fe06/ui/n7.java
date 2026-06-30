package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class n7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandStorageUsageUI f171416a;

    public n7(com.tencent.mm.plugin.appbrand.ui.AppBrandStorageUsageUI appBrandStorageUsageUI) {
        this.f171416a = appBrandStorageUsageUI;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0 l0Var;
        this.f171416a.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String j17 = gm0.j1.b().j();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
        com.p314xaae8f345.mm.vfs.r6[] b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.d9.b();
        if (b17 == null) {
            b17 = new com.p314xaae8f345.mm.vfs.r6[0];
        }
        for (com.p314xaae8f345.mm.vfs.r6 r6Var : b17) {
            java.lang.String o17 = r6Var.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 p17 = Di.p(o17);
            if (p17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.i(o17);
                p17 = i17 != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r7.f(i17) : null;
            }
            if (p17 != null) {
                java.lang.String h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159976d.h(p17.f67177x28d45f97);
                if (!hashMap.containsKey(h17)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0 l0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0(null, null, null, 0L, 0L, 0, 0L, 0L, 255, null);
                    l0Var2.f157787a = h17;
                    hashMap.put(h17, l0Var2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0 l0Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0) hashMap.get(h17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l0Var3);
                com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(o17);
                long j18 = m17 != null ? (int) m17.f294767d : 0;
                l0Var3.f157790d += j18;
                l0Var3.f157791e += j18;
                l0Var3.f157792f++;
            }
        }
        java.util.Iterator it = ((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().d1("appId", "brandIconURL", "nickname")).iterator();
        while (it.hasNext()) {
            k91.v5 v5Var = (k91.v5) it.next();
            java.lang.String str = v5Var.f68904x28d45f97;
            if (hashMap.containsKey(str)) {
                java.lang.Object obj2 = hashMap.get(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0 l0Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0) obj2;
                java.lang.String str2 = v5Var.f68910xea1bd3d4;
                if (str2 == null) {
                    str2 = "";
                }
                l0Var4.f157788b = str2;
                java.lang.String str3 = v5Var.f68913x21f9b213;
                l0Var4.f157789c = str3 != null ? str3 : "";
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0 l0Var5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0(null, null, null, 0L, 0L, 0, 0L, 0L, 255, null);
                l0Var5.f157787a = str;
                java.lang.String str4 = v5Var.f68910xea1bd3d4;
                if (str4 == null) {
                    str4 = "";
                }
                l0Var5.f157788b = str4;
                java.lang.String str5 = v5Var.f68913x21f9b213;
                l0Var5.f157789c = str5 != null ? str5 : "";
                hashMap.put(str, l0Var5);
            }
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str6 = (java.lang.String) entry.getKey();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159976d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
            long b18 = g0Var.b(j17, str6, java.lang.Boolean.TRUE) + g0Var.c(j17, str6);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0 l0Var6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0) entry.getValue();
            l0Var6.f157790d += b18;
            l0Var6.f157793g += b18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2 d2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.d2.class);
        if (d2Var != null) {
            for (java.util.Map.Entry entry2 : ((java.util.HashMap) d2Var.z0()).entrySet()) {
                if (hashMap.containsKey(entry2.getKey()) && (l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0) hashMap.get(entry2.getKey())) != null) {
                    l0Var.f157794h = ((java.lang.Number) entry2.getValue()).longValue();
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
        java.util.Iterator it6 = hashMap.entrySet().iterator();
        while (it6.hasNext()) {
            arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0) ((java.util.Map.Entry) it6.next()).getValue());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            java.lang.Object next = it7.next();
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l0) next).f157790d > 0) {
                arrayList2.add(next);
            }
        }
        return kz5.n0.F0(arrayList2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.j7());
    }
}
