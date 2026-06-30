package ai5;

/* loaded from: classes12.dex */
public abstract class c implements mf3.k {

    /* renamed from: a, reason: collision with root package name */
    public final r45.gp0 f86740a;

    /* renamed from: b, reason: collision with root package name */
    public final long f86741b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f86742c;

    /* renamed from: d, reason: collision with root package name */
    public final hu.f f86743d;

    public c(r45.gp0 favData, long j17, java.lang.String str, hu.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favData, "favData");
        this.f86740a = favData;
        this.f86741b = j17;
        this.f86742c = str;
        this.f86743d = fVar;
    }

    public final tt.h b(zu.b dataType, java.lang.String downloadPath) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 l17;
        oi3.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataType, "dataType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadPath, "downloadPath");
        s15.h e17 = bt3.x2.e(this.f86740a);
        hu.f fVar = this.f86743d;
        tt.h hVar = new tt.h(((ot.w) ((pt.l0) i95.n0.c(pt.l0.class))).aj(new zt.k("RecordImgGallery", e17, fVar != null ? fVar.j() : 1)), dataType, e17, downloadPath);
        if (((fVar == null || (eVar = fVar.f366537d) == null || eVar.m75939xb282bd08(eVar.f427150d + 9) != 1) ? false : true) && (l17 = pt0.f0.f439742b1.l(this.f86742c, e17.A())) != null) {
            hVar.f503301e = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(l17);
        }
        hVar.f503302f = 4;
        hVar.f503303g = 30;
        return hVar;
    }

    public abstract tt.h d();

    @Override // mf3.k
    public java.lang.String g() {
        zt.k kVar = new zt.k("RecordImgGallery", bt3.x2.e(this.f86740a), 1);
        hu.f fVar = this.f86743d;
        kVar.f557080d = fVar != null ? fVar.f366537d : null;
        java.lang.String imageKey = ((ot.w) i95.n0.c(ot.w.class)).aj(kVar);
        ((ot.w) i95.n0.c(ot.w.class)).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageKey, "imageKey");
        oi3.e eVar = kVar.f557080d;
        if (eVar != null) {
            oi3.e eVar2 = eVar.m75942xfb822ef2(eVar.f427150d + 0) > 0 ? eVar : null;
            if (eVar2 != null) {
                int i17 = eVar2.f427150d;
                long m75942xfb822ef2 = eVar2.m75942xfb822ef2(i17 + 0);
                long m75942xfb822ef22 = eVar2.m75942xfb822ef2(i17 + 1);
                java.lang.String msgTalker = eVar2.m75945x2fec8307(i17 + 3);
                int i18 = kVar.f557079c;
                s15.h dataItem = kVar.f557078b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
                return ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).fj(dataItem, msgTalker, m75942xfb822ef2, m75942xfb822ef22, i18);
            }
        }
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Vi(), imageKey.concat("_data")).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }

    @Override // mf3.k
    /* renamed from: getId */
    public java.lang.String mo2110x5db1b11() {
        return "favData.dataId@" + this.f86740a.T;
    }

    public final java.lang.String h() {
        java.lang.String str;
        int ordinal = mo2109xfb85f7b0().ordinal();
        if (ordinal == 1) {
            str = "RecordDetailImg";
        } else {
            if (ordinal != 2) {
                return "";
            }
            str = "RecordDetailVideo";
        }
        hu.f fVar = this.f86743d;
        zt.k kVar = new zt.k(str, bt3.x2.e(this.f86740a), fVar != null ? fVar.j() : 1);
        kVar.f557080d = fVar != null ? fVar.f366537d : null;
        return ((ot.w) i95.n0.c(ot.w.class)).bj(((ot.w) i95.n0.c(ot.w.class)).aj(kVar), kVar);
    }

    public abstract tt.h i();
}
