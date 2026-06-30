package ov2;

/* loaded from: classes10.dex */
public final class c extends pv2.f {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f430702b = "PostLog.FinderPipeline";

    /* renamed from: c, reason: collision with root package name */
    public final pv2.c f430703c = new pv2.c("FinderPlDefault", 1);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f430704d;

    /* renamed from: e, reason: collision with root package name */
    public final ov2.d f430705e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f430706f;

    public c() {
        pv2.c cVar = new pv2.c("FinderPlResult", 1);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(1, new pv2.c("FinderPostPrepareStage", 1));
        linkedHashMap.put(2, new pv2.c("FinderMediaProcessStage", 1));
        linkedHashMap.put(3, new pv2.c("FinderUploadStage", 1));
        linkedHashMap.put(4, new pv2.c("FinderPostCgiStage", 1));
        linkedHashMap.put(100, cVar);
        this.f430704d = linkedHashMap;
        this.f430705e = new ov2.d();
        this.f430706f = new java.util.ArrayList();
    }

    public final void b(pv2.g gVar) {
        pv2.m c17;
        java.util.List list = this.f430706f;
        boolean z17 = !list.isEmpty();
        java.lang.String str = this.f430702b;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80) ((java.util.ArrayList) list).remove(0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checking post-waiting ad draft from memory， next will post: ");
            sb6.append(x80Var != null ? java.lang.Long.valueOf(x80Var.f66236x88be67a1) : null);
            sb6.append(' ');
            sb6.append(x80Var != null ? java.lang.Integer.valueOf(x80Var.f66231xac3be4e) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (x80Var == null) {
                return;
            }
            a(new sv2.g(x80Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doNextPostDraft, localId:" + x80Var.f66236x88be67a1);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 L0 = ((c61.l7) i95.n0.c(c61.l7.class)).Pj().L0();
        if (L0 != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checking post-waiting finder feed from db, next will post: ");
            sb7.append(L0.m59260x51f8f5b0());
            sb7.append(' ');
            sb7.append(L0.m59221x3fdd41df());
            sb7.append(' ');
            r45.qb4 m59277xa8f45ee4 = L0.m59277xa8f45ee4();
            sb7.append(m59277xa8f45ee4 != null ? java.lang.Integer.valueOf(m59277xa8f45ee4.m75939xb282bd08(1)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
            pv2.m c18 = c(L0);
            if (c18 != null) {
                a(c18);
                return;
            }
            return;
        }
        cu2.n Oj = ((c61.l7) i95.n0.c(c61.l7.class)).Oj();
        Oj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80();
        java.lang.String str2 = "SELECT * FROM FinderDraftItem  WHERE " + Oj.f303957e + " AND " + Oj.f303958f + " AND " + Oj.f303960h + " ORDER BY " + Oj.f303956d + ".localId ASC LIMIT 1";
        android.database.Cursor f17 = Oj.f303961i.f(str2, null, 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDraftStorage", "getWaitingPost " + str2);
        if (f17.moveToFirst()) {
            x80Var2.mo9015xbf5d97fd(f17);
            f17.close();
        } else {
            f17.close();
            x80Var2 = null;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("checking post-waiting finder draft from db, next will post: ");
        sb8.append(x80Var2 != null ? java.lang.Long.valueOf(x80Var2.f66236x88be67a1) : null);
        sb8.append(' ');
        sb8.append(x80Var2 != null ? java.lang.Integer.valueOf(x80Var2.f66231xac3be4e) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
        if (x80Var2 != null && (c17 = c(x80Var2)) != null) {
            a(c17);
        } else {
            if (gVar == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.b(), "PostFileClearStage")) {
                return;
            }
            a(new rv2.b());
        }
    }

    public final pv2.m c(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) obj;
            return c14994x9b99c079.m59317xe8cd5cb1() ? new wv2.g(c14994x9b99c079) : c14994x9b99c079.m59322x4b694432() ? new xv2.f(c14994x9b99c079) : new tv2.p(c14994x9b99c079);
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209490u).mo141623x754a37bb()).r()).intValue() == 0) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80) obj;
        return x80Var.f66239xf8be237e == 2 ? new sv2.c0(x80Var) : new sv2.r(x80Var);
    }
}
