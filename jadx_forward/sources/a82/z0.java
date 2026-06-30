package a82;

/* loaded from: classes12.dex */
public class z0 implements com.p314xaae8f345.mm.p944x882e457a.u0, o72.m4 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f83779i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f83780m = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f83781d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f83782e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f83783f = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Queue f83784g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f83785h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new a82.c1(this), false);

    public z0() {
        gm0.j1.d().a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60870xaffa30c6, this);
    }

    public static boolean a(a82.z0 z0Var) {
        o72.r2 r2Var;
        boolean z17;
        java.lang.String str;
        boolean z18;
        r45.gp0 gp0Var;
        java.util.List<o72.r2> qh6;
        boolean z19;
        z0Var.getClass();
        z0Var.f83782e = java.lang.System.currentTimeMillis();
        boolean z27 = z0Var.f83783f;
        java.util.Queue queue = z0Var.f83784g;
        java.util.Map map = f83779i;
        boolean z28 = false;
        if (!z27) {
            java.util.LinkedList linkedList = (java.util.LinkedList) queue;
            if (linkedList.size() == 0 && (qh6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().qh()) != null && qh6.size() != 0) {
                for (o72.r2 r2Var2 : qh6) {
                    java.util.Iterator it = l82.a.a(r2Var2.f67645x88be67a1).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z19 = true;
                            break;
                        }
                        o72.e2 e2Var = (o72.e2) it.next();
                        if (e2Var.f67095x2262335f == 0 && e2Var.f67093x10a0fed7 != 3) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavModService", "cdnInfo is not upload end %s", e2Var.f67085xf604e54a);
                            z19 = false;
                            break;
                        }
                    }
                    if (z19) {
                        java.util.HashMap hashMap = (java.util.HashMap) map;
                        if (hashMap.containsKey(java.lang.Integer.valueOf(r2Var2.f67643xc8a07680))) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavModService", "File is Already running:" + r2Var2.f67643xc8a07680);
                        } else {
                            linkedList.add(r2Var2);
                            hashMap.put(java.lang.Integer.valueOf(r2Var2.f67643xc8a07680), null);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavModService", "cdn info is not upload end");
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavModService", "klem GetNeedRun procing:" + ((java.util.HashMap) map).size() + ",send:" + linkedList.size() + "]");
                linkedList.size();
            }
        }
        if (!z0Var.f83783f && ((java.util.LinkedList) queue).size() <= 0) {
            ((java.util.LinkedList) queue).clear();
            ((java.util.HashMap) map).clear();
            z0Var.f83781d = false;
            z0Var.f83783f = false;
            ((java.util.HashMap) f83780m).clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavModService", "klem No Data Any More , Stop Service");
            return false;
        }
        if (!z0Var.f83783f) {
            java.util.LinkedList linkedList2 = (java.util.LinkedList) queue;
            if (linkedList2.size() > 0 && (r2Var = (o72.r2) linkedList2.poll()) != null && r2Var.f67643xc8a07680 > 0) {
                z0Var.f83783f = true;
                java.lang.String f17 = o72.s2.f(r2Var.f67645x88be67a1);
                java.lang.Long valueOf = java.lang.Long.valueOf(r2Var.f67645x88be67a1);
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(r2Var.f67643xc8a07680);
                java.util.Iterator it6 = r2Var.f67640x5ab01132.f452497f.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        z17 = false;
                        break;
                    }
                    if (((r45.gp0) it6.next()).f456935b2 != 0) {
                        z17 = true;
                        break;
                    }
                }
                o72.s2.g("MicroMsg.Fav.FavModService", f17, "Start ModFavItem: localId=%d, favId=%d, isResend=%b, type=%d", valueOf, valueOf2, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(r2Var.f67657x2262335f));
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                java.util.LinkedList linkedList4 = new java.util.LinkedList();
                if (o72.d3.f424858e) {
                    java.lang.Object[] objArr = new java.lang.Object[3];
                    objArr[0] = java.lang.Long.valueOf(r2Var.f67645x88be67a1);
                    r45.bq0 bq0Var = r2Var.f67640x5ab01132;
                    objArr[1] = java.lang.Integer.valueOf(bq0Var != null ? bq0Var.E : -1);
                    objArr[2] = java.lang.Long.valueOf(r2Var.f67659xa783a79b);
                    str = java.lang.String.format("%d_%d_%d", objArr);
                } else {
                    str = "";
                }
                java.util.Iterator it7 = r2Var.f67640x5ab01132.f452497f.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        z18 = false;
                        break;
                    }
                    if (((r45.gp0) it7.next()).f456935b2 != 0) {
                        z18 = true;
                        break;
                    }
                }
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavModService", "Resend Item %d", java.lang.Long.valueOf(r2Var.f67645x88be67a1));
                    o72.s2.g("MicroMsg.Fav.FavModService", f17, "Resend mode: localId=%d", java.lang.Long.valueOf(r2Var.f67645x88be67a1));
                    o72.l5 l5Var = new o72.l5(r2Var, linkedList3, linkedList4, o72.r2.G0(r2Var), 1);
                    l5Var.f424940q = str;
                    gm0.j1.d().g(l5Var);
                } else if (r2Var.f67657x2262335f != 18) {
                    o72.s2.g("MicroMsg.Fav.FavModService", f17, "Non-note type: localId=%d, type=%d", java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67657x2262335f));
                    long j17 = r2Var.f67645x88be67a1;
                    r45.bo4 bo4Var = new r45.bo4();
                    int i17 = 4;
                    bo4Var.f452451d = 4;
                    bo4Var.f452452e = 0;
                    linkedList3.add(bo4Var);
                    java.util.List<o72.e2> ng6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().ng(j17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavModService", "setModAfterClientUpload %d modcdnlistsize %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(ng6.size()));
                    for (o72.e2 e2Var2 : ng6) {
                        java.lang.String str2 = e2Var2.f67085xf604e54a;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = o72.x1.f425048a;
                        boolean endsWith = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? z28 : str2.endsWith("_t");
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e2Var2.f67084xf47770e7) || endsWith) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavModService", "setModAfterClientUpload cdnUrl:%s, isThumb:%b,  favLocalId:%d", e2Var2.f67084xf47770e7, java.lang.Boolean.valueOf(endsWith), java.lang.Long.valueOf(j17));
                        } else {
                            r45.eo4 eo4Var = new r45.eo4();
                            eo4Var.f455155d = "dataitem." + e2Var2.f67085xf604e54a + ".cdn_dataurl";
                            eo4Var.f455157f = e2Var2.f67084xf47770e7;
                            linkedList4.add(eo4Var);
                            r45.eo4 eo4Var2 = new r45.eo4();
                            eo4Var2.f455155d = "dataitem." + e2Var2.f67085xf604e54a + ".cdn_datakey";
                            eo4Var2.f455157f = e2Var2.f67083xf47749d7;
                            linkedList4.add(eo4Var2);
                            r45.eo4 eo4Var3 = new r45.eo4();
                            eo4Var3.f455155d = "dataitem." + e2Var2.f67085xf604e54a;
                            eo4Var3.f455156e = "datastatus";
                            eo4Var3.f455157f = "0";
                            linkedList4.add(eo4Var3);
                            o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(e2Var2.f67088x958756b0);
                            if (F != null) {
                                if (F.f67657x2262335f == i17) {
                                    java.lang.String str3 = e2Var2.f67085xf604e54a;
                                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && F.f67640x5ab01132.f452497f.size() != 0) {
                                        java.util.Iterator it8 = F.f67640x5ab01132.f452497f.iterator();
                                        while (it8.hasNext()) {
                                            gp0Var = (r45.gp0) it8.next();
                                            if (gp0Var.T.equals(str3)) {
                                                break;
                                            }
                                        }
                                    }
                                    gp0Var = null;
                                    if (gp0Var != null) {
                                        r45.eo4 eo4Var4 = new r45.eo4();
                                        eo4Var4.f455155d = "dataitem." + e2Var2.f67085xf604e54a + ".stream_videoid";
                                        eo4Var4.f455157f = gp0Var.f456986z1;
                                        linkedList4.add(eo4Var4);
                                    }
                                }
                            }
                        }
                        z28 = false;
                        i17 = 4;
                    }
                    o72.l5 l5Var2 = new o72.l5(r2Var, linkedList3, linkedList4);
                    l5Var2.f424940q = str;
                    gm0.j1.d().g(l5Var2);
                } else {
                    o72.s2.g("MicroMsg.Fav.FavModService", f17, "Note type: localId=%d", java.lang.Long.valueOf(r2Var.f67645x88be67a1));
                    r45.bo4 bo4Var2 = new r45.bo4();
                    bo4Var2.f452451d = 1;
                    bo4Var2.f452452e = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                    linkedList3.add(bo4Var2);
                    o72.l5 l5Var3 = new o72.l5(r2Var, linkedList3, linkedList4, o72.r2.G0(r2Var));
                    l5Var3.f424940q = str;
                    gm0.j1.d().g(l5Var3);
                }
                return true;
            }
        }
        return false;
    }

    public void b() {
        gm0.j1.e().j(new a82.b1(this));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 426 && (m1Var instanceof o72.l5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavModService", "onSceneEnd %s %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            gm0.j1.e().j(new a82.a1(this, m1Var, i17, i18, str));
        }
    }
}
