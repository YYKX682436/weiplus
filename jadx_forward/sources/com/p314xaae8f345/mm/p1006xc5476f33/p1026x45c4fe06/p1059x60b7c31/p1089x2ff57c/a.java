package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

/* loaded from: classes7.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f162567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 f162569f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.List list, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba321) {
        super(0);
        this.f162567d = list;
        this.f162568e = str;
        this.f162569f = c12567x34ba321;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List<jz5.l> list = this.f162567d;
        java.lang.String str = this.f162568e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba321 = this.f162569f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (jz5.l lVar : list) {
            java.lang.String str2 = (java.lang.String) lVar.f384367e;
            cm.f fVar = null;
            if (str2 == null || r26.n0.N(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandFileOccupationReporter", "reportOccupation: prefix = [%s] got a null path", lVar.f384366d);
            } else {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7071x1f0975d8 c7071x1f0975d8 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7071x1f0975d8();
                c7071x1f0975d8.f143796j = 0L;
                c7071x1f0975d8.f143790d = c7071x1f0975d8.b("AppId", str, true);
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.e(str) != null) {
                    c7071x1f0975d8.f143791e = r10.f387385r.f33456x1c82a56c;
                } else {
                    c7071x1f0975d8.f143791e = c12567x34ba321.f169672i;
                }
                int i17 = c12567x34ba321.f169669f;
                if (i17 == 1) {
                    fVar = cm.f.release;
                } else if (i17 == 2) {
                    fVar = cm.f.debug;
                } else if (i17 == 3) {
                    fVar = cm.f.demo;
                }
                c7071x1f0975d8.f143792f = fVar;
                c7071x1f0975d8.f143793g = c12567x34ba321.f169670g;
                c7071x1f0975d8.f143794h = a06.d.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.c(new com.p314xaae8f345.mm.vfs.r6(str2)) / 1024.0d);
                c7071x1f0975d8.f143795i = c7071x1f0975d8.b("DirPrefix", (java.lang.String) lVar.f384366d, true);
                fVar = c7071x1f0975d8;
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7071x1f0975d8 c7071x1f0975d82 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7071x1f0975d8) it.next();
            if (kz5.v.f(new java.lang.String[]{"tmp", "usr", "opendata", "ad"}).contains(c7071x1f0975d82.f143795i)) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c7071x1f0975d82.f143795i, "tmp")) {
                    try {
                        c7071x1f0975d82.f143797k = a06.d.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.c(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.e())) / 1024.0d);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandFileOccupationReporter", "reportOccupation total temp folder size: " + c7071x1f0975d82.f143797k);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandFileOccupationReporter", "reportOccupation total temp folder get exception:" + e17);
                    }
                }
                c7071x1f0975d82.k();
            }
        }
        return jz5.f0.f384359a;
    }
}
