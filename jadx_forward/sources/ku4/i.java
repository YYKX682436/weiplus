package ku4;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final ku4.i f394047a = new ku4.i();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f394048b = jz5.h.b(ku4.e.f394043d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f394049c = jz5.h.b(ku4.d.f394042d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f394050d = jz5.h.b(ku4.f.f394044d);

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f394051e = true;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashSet f394052f;

    static {
        jz5.h.b(ku4.h.f394046d);
        jz5.h.b(ku4.g.f394045d);
        f394052f = new java.util.HashSet();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 a(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 q66 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class)).q6(appId, i17, 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPkgInfo appId=");
            sb6.append(appId);
            sb6.append(", pkgType=");
            sb6.append(i17);
            sb6.append(", md5=");
            sb6.append(q66 != null ? q66.f67186x912ff5eb : null);
            sb6.append(" download version= ");
            sb6.append(q66 != null ? java.lang.Integer.valueOf(q66.f67185x8987ca93) : null);
            sb6.append(" path=");
            sb6.append(q66 != null ? q66.f67183x55b471cc : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasPackageDownManager", sb6.toString());
            return q66;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebCanvasPackageDownManager", "getPkgInfo ex " + e17.getMessage());
            return null;
        }
    }

    public final void b(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.lang.String str = appId + '-' + i17;
        java.util.HashSet hashSet = f394052f;
        if (hashSet.contains(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasPackageDownManager", "setPkgIsOccupied start");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class);
        if (o6Var != null) {
            o6Var.Uf(appId, i17);
            hashSet.add(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasPackageDownManager", "setPkgIsOccupied appId = " + appId + " version=" + i17);
        }
    }
}
