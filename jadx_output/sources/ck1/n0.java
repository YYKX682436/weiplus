package ck1;

/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ck1.n0 f42354a = new ck1.n0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f42355b = new java.util.HashMap();

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ck1.m0
            if (r0 == 0) goto L13
            r0 = r7
            ck1.m0 r0 = (ck1.m0) r0
            int r1 = r0.f42352g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42352g = r1
            goto L18
        L13:
            ck1.m0 r0 = new ck1.m0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f42350e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f42352g
            java.util.Map r3 = ck1.n0.f42355b
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r6 = r0.f42349d
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto La2
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "getUsageInfo, appId: "
            r7.<init>(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.UserInfoRevokeRepository"
            com.tencent.mars.xlog.Log.i(r2, r7)
            r7 = r3
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.Object r7 = r7.get(r6)
            r45.uf7 r7 = (r45.uf7) r7
            if (r7 == 0) goto L5c
            java.lang.String r6 = "getUsageInfo, cache hit"
            com.tencent.mars.xlog.Log.i(r2, r6)
            return r7
        L5c:
            r0.f42349d = r6
            r0.f42352g = r4
            oz5.n r7 = new oz5.n
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r7.<init>(r0)
            com.tencent.mm.modelbase.l r0 = new com.tencent.mm.modelbase.l
            r0.<init>()
            java.lang.String r2 = "/cgi-bin/mmbiz-bin/wxaapp_getauthinfo"
            r0.f70666c = r2
            r2 = 1115(0x45b, float:1.562E-42)
            r0.f70667d = r2
            r45.cc7 r2 = new r45.cc7
            r2.<init>()
            r2.f371475d = r6
            k91.g3 r4 = k91.g3.f305592a
            int r4 = r4.a(r6)
            r2.f371476e = r4
            r0.f70664a = r2
            r45.dc7 r2 = new r45.dc7
            r2.<init>()
            r0.f70665b = r2
            com.tencent.mm.modelbase.o r0 = r0.a()
            ck1.i r2 = new ck1.i
            r2.<init>(r7)
            r4 = 0
            com.tencent.mm.modelbase.z2.d(r0, r2, r4)
            java.lang.Object r7 = r7.a()
            if (r7 != r1) goto La2
            return r1
        La2:
            r45.dc7 r7 = (r45.dc7) r7
            r45.uf7 r7 = r7.f372316f
            if (r7 == 0) goto Lae
            java.util.HashMap r3 = (java.util.HashMap) r3
            r3.put(r6, r7)
            return r7
        Lae:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "use_user_info is null"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ck1.n0.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean b(r45.kv5 kv5Var) {
        if (kv5Var == null) {
            return false;
        }
        java.lang.String str = kv5Var.f378979d;
        if (str == null || str.length() == 0) {
            return false;
        }
        int i17 = kv5Var.f378981f;
        return i17 == 0 || 1 == i17 || 7 == i17;
    }

    public final java.lang.Object c(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.UserInfoRevokeRepository", "revokeAppUseUserInfo, appId: " + str + ", scope: " + str2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (str != null && str2 != null) {
            ck1.k kVar = ck1.k.f42337a;
            r45.bp4 bp4Var = new r45.bp4();
            bp4Var.f370944d = str;
            bp4Var.f370945e = null;
            bp4Var.f370946f = str2;
            bp4Var.f370947g = 7;
            java.lang.Object a17 = kVar.a(bp4Var, continuation);
            pz5.a aVar = pz5.a.f359186d;
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return a17;
            }
        }
        return f0Var;
    }

    public final java.lang.Object d(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.UserInfoRevokeRepository", "revokePluginUseUserInfo, appId: " + str + ", pluginAppId: " + str2 + ", scope: " + str3);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (str != null && str2 != null && str3 != null) {
            ck1.k kVar = ck1.k.f42337a;
            r45.bp4 bp4Var = new r45.bp4();
            bp4Var.f370944d = str;
            bp4Var.f370945e = str2;
            bp4Var.f370946f = str3;
            bp4Var.f370947g = 7;
            java.lang.Object a17 = kVar.a(bp4Var, continuation);
            pz5.a aVar = pz5.a.f359186d;
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return a17;
            }
        }
        return f0Var;
    }

    public final boolean e(r45.uf7 uf7Var) {
        boolean z17;
        boolean z18;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        boolean z19;
        java.util.LinkedList linkedList3;
        java.util.LinkedList linkedList4;
        if (uf7Var == null) {
            return false;
        }
        r45.vf7 vf7Var = uf7Var.f387341d;
        if (vf7Var == null) {
            z17 = false;
        } else {
            java.lang.String str = vf7Var.f388193d;
            z17 = !(str == null || str.length() == 0);
        }
        if (!z17) {
            return false;
        }
        r45.vf7 vf7Var2 = uf7Var.f387341d;
        ck1.n0 n0Var = f42354a;
        if (vf7Var2 != null && (linkedList4 = vf7Var2.f388196g) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList4) {
                if (n0Var.b((r45.kv5) obj)) {
                    arrayList.add(obj);
                }
            }
            linkedList4.clear();
            linkedList4.addAll(arrayList);
        }
        r45.vf7 vf7Var3 = uf7Var.f387341d;
        boolean z27 = (vf7Var3 == null || (linkedList3 = vf7Var3.f388196g) == null || linkedList3.isEmpty()) ? false : true;
        java.util.LinkedList<r45.vf7> linkedList5 = uf7Var.f387342e;
        if (!((linkedList5 == null || linkedList5.isEmpty()) ? false : true) || linkedList5 == null) {
            z18 = false;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : linkedList5) {
                r45.vf7 vf7Var4 = (r45.vf7) obj2;
                if (vf7Var4 == null) {
                    z19 = false;
                } else {
                    java.lang.String str2 = vf7Var4.f388193d;
                    z19 = !(str2 == null || str2.length() == 0);
                }
                if (z19) {
                    arrayList2.add(obj2);
                }
            }
            linkedList5.clear();
            linkedList5.addAll(arrayList2);
            z18 = false;
            for (r45.vf7 vf7Var5 : linkedList5) {
                if (vf7Var5 != null && (linkedList2 = vf7Var5.f388196g) != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj3 : linkedList2) {
                        if (n0Var.b((r45.kv5) obj3)) {
                            arrayList3.add(obj3);
                        }
                    }
                    linkedList2.clear();
                    linkedList2.addAll(arrayList3);
                }
                if ((vf7Var5 == null || (linkedList = vf7Var5.f388196g) == null || linkedList.isEmpty()) ? false : true) {
                    z18 = true;
                }
            }
        }
        return z27 || z18;
    }
}
