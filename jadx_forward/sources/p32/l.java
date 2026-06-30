package p32;

/* loaded from: classes12.dex */
public class l extends h32.a {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f433017f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f433018g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f433019h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f433020i;

    /* renamed from: m, reason: collision with root package name */
    public r32.a f433021m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f433022n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.ArrayList f433023o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f433024p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f433025q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f433026r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f433027s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f433028t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f433029u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f433030v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f433031w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f433032x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.ref.WeakReference f433033y;

    /* renamed from: z, reason: collision with root package name */
    public p32.k f433034z;

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, h32.b bVar) {
        this.f433033y = new java.lang.ref.WeakReference(bVar);
        this.f433026r = str;
        this.f433018g = str;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f433019h = str2 == null ? "" : str2;
        this.f433017f = z17;
        this.f433020i = str3;
    }

    @Override // h32.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f I() {
        return new r45.sq3();
    }

    @Override // h32.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f J() {
        return new r45.tq3();
    }

    @Override // h32.a
    public void K(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.sq3 sq3Var = (r45.sq3) fVar;
        sq3Var.f467456f = this.f433019h;
        sq3Var.f467455e = this.f433018g;
        sq3Var.f467454d = this.f433017f;
        sq3Var.f467457g = this.f433020i;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1042;
    }

    @Override // h32.a
    /* renamed from: getUri */
    public java.lang.String mo132826xb5887636() {
        return "/cgi-bin/mmbiz-bin/rank/getuserranklike";
    }

    @Override // h32.a, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r32.a aVar;
        q32.f fVar;
        r32.e eVar;
        r32.d dVar;
        r32.c cVar;
        if (i18 == 0 && i19 == 0) {
            r45.tq3 tq3Var = (r45.tq3) H();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetRankInfo", "get rank info success, log_msg:%s", tq3Var.f468235y);
            this.f433023o = new java.util.ArrayList();
            java.util.LinkedList linkedList = tq3Var.f468227q;
            java.lang.String str2 = this.f433019h;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.e43 e43Var = (r45.e43) it.next();
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(e43Var.f454538e)) {
                        java.lang.String str3 = tq3Var.f468222i;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
                            cVar = null;
                        } else {
                            cVar = new r32.c();
                            cVar.f67115xde6292c = str3;
                            cVar.f67118xdec927b = e43Var.f454538e;
                            cVar.f67117x2261aaf1 = e43Var.f454539f;
                            cVar.f67114x84a2aa32 = str2;
                        }
                        if (cVar != null) {
                            this.f433023o.add(cVar);
                        }
                    } else {
                        gm0.j1.n().f354821b.g(new p32.i(e43Var.f454538e, null));
                    }
                }
            }
            this.f433022n = new java.util.ArrayList();
            java.util.LinkedList linkedList2 = tq3Var.f468217d;
            java.lang.String str4 = "";
            if (linkedList2 != null) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (it6.hasNext()) {
                    r45.dh7 dh7Var = (r45.dh7) it6.next();
                    java.lang.String str5 = tq3Var.f468222i;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) || dh7Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
                        dVar = null;
                    } else {
                        dVar = new r32.d();
                        dVar.f67217x84a2aa32 = str2;
                        dVar.f67219xde6292c = str5;
                        dVar.f67218x9113f2d3 = dh7Var.f454011g;
                        dVar.f67220xaedf8d95 = dh7Var.f454010f;
                        dVar.f67221x29cc1f0d = dh7Var.f454009e;
                        dVar.f67222x3a0346c9 = dh7Var.f454012h;
                        dVar.f67224xdec927b = dh7Var.f454008d;
                        dVar.f67223x448d7120 = dh7Var.f454013i;
                    }
                    if (dVar != null) {
                        if (dVar.f67220xaedf8d95 == 1) {
                            str4 = dVar.f67224xdec927b;
                        }
                        this.f433022n.add(dVar);
                    }
                }
            }
            this.f433024p = new java.util.ArrayList();
            java.util.LinkedList linkedList3 = tq3Var.f468218e;
            if (linkedList3 != null) {
                java.util.Iterator it7 = linkedList3.iterator();
                while (it7.hasNext()) {
                    r45.eh7 eh7Var = (r45.eh7) it7.next();
                    java.lang.String str6 = tq3Var.f468222i;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6) || eh7Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
                        eVar = null;
                    } else {
                        eVar = new r32.e();
                        eVar.f66780x84a2aa32 = str2;
                        eVar.f66782xde6292c = str6;
                        eVar.f66783x9de75411 = eh7Var.f455040d;
                        eVar.f66784xdec927b = eh7Var.f455041e;
                    }
                    if (eVar != null) {
                        this.f433024p.add(eVar);
                    }
                }
            }
            this.f433025q = new java.util.ArrayList();
            java.util.LinkedList linkedList4 = tq3Var.f468219f;
            if (linkedList4 != null) {
                java.util.Iterator it8 = linkedList4.iterator();
                while (it8.hasNext()) {
                    this.f433025q.add((java.lang.String) it8.next());
                }
            }
            java.lang.String str7 = this.f433020i;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                str4 = str7;
            }
            java.lang.String str8 = tq3Var.f468220g;
            java.lang.String str9 = tq3Var.f468221h;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceRankConverter", "hy: param error");
                aVar = null;
            } else {
                aVar = new r32.a();
                aVar.f66506xdec927b = str4;
                aVar.f66505x850adc81 = str8;
                aVar.f66504x6d53d39f = str9;
            }
            this.f433021m = aVar;
            java.lang.String str10 = tq3Var.f468222i;
            this.f433026r = str10;
            this.f433028t = tq3Var.f468226p;
            this.f433027s = tq3Var.f468224n;
            this.f433029u = tq3Var.f468225o;
            this.f433030v = tq3Var.f468231u == 1;
            this.f433031w = tq3Var.f468232v;
            this.f433032x = tq3Var.f468228r;
            java.lang.String str11 = this.f433018g;
            if ((str11 == null || !str11.equals(str10)) && (fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.cj().f441462d) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7) fVar).f180883x = this.f433026r;
            }
            p32.k kVar = this.f433034z;
            boolean z17 = this.f433017f;
            if (kVar != null && z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7) kVar;
                activityC13477xb2a3ecd7.getClass();
                activityC13477xb2a3ecd7.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.i6(activityC13477xb2a3ecd7));
                activityC13477xb2a3ecd7.G = this.f433027s;
                activityC13477xb2a3ecd7.H = this.f433028t;
                activityC13477xb2a3ecd7.f180865J = this.f433031w;
                boolean z18 = this.f433030v;
                activityC13477xb2a3ecd7.I = z18;
                activityC13477xb2a3ecd7.P = this.f433032x;
                java.util.ArrayList arrayList = this.f433022n;
                activityC13477xb2a3ecd7.D = arrayList;
                java.util.ArrayList arrayList2 = this.f433023o;
                activityC13477xb2a3ecd7.C = arrayList2;
                activityC13477xb2a3ecd7.B = activityC13477xb2a3ecd7.f180867e.a(arrayList2, arrayList, z18);
                activityC13477xb2a3ecd7.R = ((r45.tq3) H()).f468234x;
                activityC13477xb2a3ecd7.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.j6(activityC13477xb2a3ecd7, this));
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ri().P0(this.f433023o);
            }
            s32.d fj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.fj();
            java.lang.String str12 = this.f433026r;
            fj6.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceRankInfoStg", "delete rankInfo by rankId failed, rankId is null or nil.");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceRankInfoStg", "delete rankInfo by rankId (%s).(r : %d)", str12, java.lang.Integer.valueOf(fj6.f483997d.mo70514xb06685ab("HardDeviceRankInfo", "rankID = ? ", new java.lang.String[]{str12})));
            }
            s32.d fj7 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.fj();
            java.lang.String str13 = this.f433026r;
            java.util.ArrayList arrayList3 = this.f433022n;
            fj7.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str13) || arrayList3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceRankInfoStg", "insertOrUpdateRankInfo failed, rank id is null or nil or data is null.");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceRankInfoStg", "insertOrUpdateRankInfo, rankId(%s) , size(%d).", str13, java.lang.Integer.valueOf(arrayList3.size()));
                for (int i27 = 0; i27 < arrayList3.size(); i27++) {
                    fj7.z0((r32.d) arrayList3.get(i27), false);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.hj().a("HardDeviceRankInfo", new q32.d(str13, null, null));
            }
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Boolean.valueOf(this.f433029u);
            java.util.ArrayList arrayList4 = this.f433023o;
            objArr[1] = java.lang.Integer.valueOf(arrayList4 != null ? arrayList4.size() : 0);
            java.util.ArrayList arrayList5 = this.f433022n;
            objArr[2] = java.lang.Integer.valueOf(arrayList5 != null ? arrayList5.size() : 0);
            java.util.ArrayList arrayList6 = this.f433024p;
            objArr[3] = java.lang.Integer.valueOf(arrayList6 != null ? arrayList6.size() : 0);
            r45.dh7 dh7Var2 = tq3Var.f468233w;
            objArr[4] = dh7Var2;
            objArr[5] = java.lang.Integer.valueOf(dh7Var2 != null ? dh7Var2.f454009e : -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetRankInfo", "isCacheExist(%s), RankFollowInfo size(%s), RankInfo size(%d), LikeInfo size(%d). myInfo:%s myInfo.score:%s", objArr);
            s32.e bj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.bj();
            java.lang.String str14 = this.f433026r;
            java.util.ArrayList arrayList7 = this.f433024p;
            bj6.getClass();
            iz5.a.g(null, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str14));
            if (arrayList7 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExdeviceRankLikeUserStg", "batchInsertOrUpdate failed, data is null.");
            } else {
                java.util.Iterator it9 = arrayList7.iterator();
                while (it9.hasNext()) {
                    r32.e eVar2 = (r32.e) it9.next();
                    iz5.a.g(null, eVar2 != null);
                    if (!bj6.mo9952xce0038c9(eVar2, "rankID", dm.i4.f66875xa013b0d5) && !bj6.mo880xb970c2b9(eVar2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExdeviceRankLikeUserStg", "hy: insert or update failed");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.hj().a("HardDeviceLikeUser", new q32.d(str14, str2, null));
            }
            if (this.f433021m != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.wi().z0(this.f433021m, true);
            }
        }
        super.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
        h32.b bVar = (h32.b) this.f433033y.get();
        if (bVar != null) {
            bVar.a(i18, i19, str, this);
        }
    }
}
