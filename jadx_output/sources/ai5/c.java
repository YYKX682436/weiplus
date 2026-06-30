package ai5;

/* loaded from: classes12.dex */
public abstract class c implements mf3.k {

    /* renamed from: a, reason: collision with root package name */
    public final r45.gp0 f5207a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5208b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f5209c;

    /* renamed from: d, reason: collision with root package name */
    public final hu.f f5210d;

    public c(r45.gp0 favData, long j17, java.lang.String str, hu.f fVar) {
        kotlin.jvm.internal.o.g(favData, "favData");
        this.f5207a = favData;
        this.f5208b = j17;
        this.f5209c = str;
        this.f5210d = fVar;
    }

    public final tt.h b(zu.b dataType, java.lang.String downloadPath) {
        com.tencent.mm.storage.f9 l17;
        oi3.e eVar;
        kotlin.jvm.internal.o.g(dataType, "dataType");
        kotlin.jvm.internal.o.g(downloadPath, "downloadPath");
        s15.h e17 = bt3.x2.e(this.f5207a);
        hu.f fVar = this.f5210d;
        tt.h hVar = new tt.h(((ot.w) ((pt.l0) i95.n0.c(pt.l0.class))).aj(new zt.k("RecordImgGallery", e17, fVar != null ? fVar.j() : 1)), dataType, e17, downloadPath);
        if (((fVar == null || (eVar = fVar.f285004d) == null || eVar.getInteger(eVar.f345617d + 9) != 1) ? false : true) && (l17 = pt0.f0.f358209b1.l(this.f5209c, e17.A())) != null) {
            hVar.f421768e = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(l17);
        }
        hVar.f421769f = 4;
        hVar.f421770g = 30;
        return hVar;
    }

    public abstract tt.h d();

    @Override // mf3.k
    public java.lang.String g() {
        zt.k kVar = new zt.k("RecordImgGallery", bt3.x2.e(this.f5207a), 1);
        hu.f fVar = this.f5210d;
        kVar.f475547d = fVar != null ? fVar.f285004d : null;
        java.lang.String imageKey = ((ot.w) i95.n0.c(ot.w.class)).aj(kVar);
        ((ot.w) i95.n0.c(ot.w.class)).getClass();
        kotlin.jvm.internal.o.g(imageKey, "imageKey");
        oi3.e eVar = kVar.f475547d;
        if (eVar != null) {
            oi3.e eVar2 = eVar.getLong(eVar.f345617d + 0) > 0 ? eVar : null;
            if (eVar2 != null) {
                int i17 = eVar2.f345617d;
                long j17 = eVar2.getLong(i17 + 0);
                long j18 = eVar2.getLong(i17 + 1);
                java.lang.String msgTalker = eVar2.getString(i17 + 3);
                int i18 = kVar.f475546c;
                s15.h dataItem = kVar.f475545b;
                kotlin.jvm.internal.o.g(dataItem, "dataItem");
                kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
                return ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).fj(dataItem, msgTalker, j17, j18, i18);
            }
        }
        java.lang.String o17 = new com.tencent.mm.vfs.r6(((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Vi(), imageKey.concat("_data")).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    @Override // mf3.k
    public java.lang.String getId() {
        return "favData.dataId@" + this.f5207a.T;
    }

    public final java.lang.String h() {
        java.lang.String str;
        int ordinal = getType().ordinal();
        if (ordinal == 1) {
            str = "RecordDetailImg";
        } else {
            if (ordinal != 2) {
                return "";
            }
            str = "RecordDetailVideo";
        }
        hu.f fVar = this.f5210d;
        zt.k kVar = new zt.k(str, bt3.x2.e(this.f5207a), fVar != null ? fVar.j() : 1);
        kVar.f475547d = fVar != null ? fVar.f285004d : null;
        return ((ot.w) i95.n0.c(ot.w.class)).bj(((ot.w) i95.n0.c(ot.w.class)).aj(kVar), kVar);
    }

    public abstract tt.h i();
}
