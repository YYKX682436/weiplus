package w35;

/* loaded from: classes8.dex */
public final class r implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f524296a;

    public r(java.lang.ref.WeakReference openWayControllerMiniProgram) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openWayControllerMiniProgram, "openWayControllerMiniProgram");
        this.f524296a = openWayControllerMiniProgram;
    }

    @Override // zh1.a1
    public void a(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 openMaterialCollection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialCollection, "openMaterialCollection");
        w35.t tVar = (w35.t) this.f524296a.get();
        if (tVar != null) {
            java.lang.String str = tVar.f524301e;
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "onOpenMaterialsGot: failed, mimeType: " + tVar.f524258c + ", path: " + tVar.f524259d);
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21> appBrandOpenMaterialDetailModels = openMaterialCollection.f167785g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
            if (!appBrandOpenMaterialDetailModels.isEmpty()) {
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21 : appBrandOpenMaterialDetailModels) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w();
                    wVar.f272548e = c12474x8b872a21;
                    arrayList.add(wVar);
                }
            } else {
                java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2> appBrandOpenMaterialModels = openMaterialCollection.f167784f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appBrandOpenMaterialModels, "appBrandOpenMaterialModels");
                if (!appBrandOpenMaterialModels.isEmpty()) {
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b2 : appBrandOpenMaterialModels) {
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar2 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w();
                        java.lang.String str2 = c12475x7cfc32b2.f167795d;
                        int i17 = c12475x7cfc32b2.f167796e;
                        java.lang.String str3 = c12475x7cfc32b2.f167797f;
                        java.lang.String str4 = c12475x7cfc32b2.f167798g;
                        java.lang.String str5 = c12475x7cfc32b2.f167799h;
                        kz5.p0 p0Var = kz5.p0.f395529d;
                        wVar2.f272548e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21(str2, i17, str3, str4, str5, p0Var, 0.0f, "", false, "", p0Var);
                        arrayList.add(wVar2);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "get openway count: " + arrayList.size());
            w35.a aVar = tVar.f524257b;
            if (aVar != null) {
                aVar.a(arrayList);
            }
        }
    }
}
