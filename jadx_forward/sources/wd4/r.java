package wd4;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final wd4.r f526548a = new wd4.r();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f526549b = jz5.h.b(wd4.l.f526479d);

    public static final wd4.g a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials", "buildMaterialInfo, snsInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
            return null;
        }
        if (jj4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials", "buildMaterialInfo, mediaObj is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
            return null;
        }
        boolean e17 = wd4.x0.e(c17933xe8d1b226);
        java.lang.String c17 = wd4.x0.c(e17, jj4Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials", "buildMaterialInfo, isImage: " + e17 + ", mediaPath: " + c17);
        wd4.g gVar = new wd4.g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622.b(c17, e17 ? "jpg" : "mp4"), e17 ? bi1.g.SNS_IMAGE : bi1.g.SNS_VIDEO);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        return gVar;
    }

    public static /* synthetic */ java.lang.Object d(wd4.r rVar, wd4.h hVar, java.util.List list, java.util.List list2, java.util.List list3, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryEnable$default", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        java.lang.Object c17 = rVar.c(hVar, list, list2, list3, (i17 & 16) != 0 ? null : aVar, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryEnable$default", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        return c17;
    }

    public final wd4.a b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var, wd4.h hVar, java.util.List list) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z18 = true;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                wd4.e eVar = (wd4.e) it.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterials", "checkConditions, condition: " + eVar.mo173543xfb82e301());
                if (eVar instanceof wd4.d) {
                    z17 = ((wd4.q) ((wd4.d) eVar)).c(k5Var, hVar);
                } else {
                    if (!(eVar instanceof wd4.c)) {
                        jz5.j jVar = new jz5.j();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
                        throw jVar;
                    }
                    java.lang.Boolean a17 = ((wd4.c) eVar).a(k5Var, hVar);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Boolean.FALSE, a17)) {
                        z17 = false;
                    } else {
                        if (a17 == null) {
                            arrayList.add(eVar);
                        }
                        z17 = true;
                    }
                }
                if (!z17) {
                    z18 = false;
                    break;
                }
            }
        }
        wd4.a aVar = new wd4.a(z18, arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkConditions", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(wd4.h r34, java.util.List r35, java.util.List r36, java.util.List r37, yz5.a r38, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r39) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wd4.r.c(wd4.h, java.util.List, java.util.List, java.util.List, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
