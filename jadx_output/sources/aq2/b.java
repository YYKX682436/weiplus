package aq2;

/* loaded from: classes2.dex */
public class b extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final aq2.a f13119t;

    /* renamed from: u, reason: collision with root package name */
    public final int f13120u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f13121v;

    /* renamed from: w, reason: collision with root package name */
    public int f13122w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13123x;

    /* renamed from: y, reason: collision with root package name */
    public final r45.ck2 f13124y;

    public /* synthetic */ b(aq2.a aVar, r45.qt2 qt2Var, im5.b bVar, int i17, kotlin.jvm.internal.i iVar) {
        this(aVar, (i17 & 2) != 0 ? null : qt2Var, (i17 & 4) != 0 ? null : bVar);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String username;
        r45.h32 h32Var;
        com.tencent.mm.network.v0 reqResp;
        o45.ah respObj;
        r45.dk2 resp = (r45.dk2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiEnd: errType");
        sb6.append(i17);
        sb6.append(", errCode=");
        sb6.append(i18);
        sb6.append(" pullType: ");
        aq2.a aVar = this.f13119t;
        sb6.append(aVar.f13102a);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderNavLiveStream", sb6.toString());
        rq2.d dVar = rq2.d.f398816a;
        com.tencent.mm.protobuf.g byteString = resp.getByteString(4);
        r45.xw profile = (m1Var == null || (reqResp = m1Var.getReqResp()) == null || (respObj = reqResp.getRespObj()) == null) ? null : respObj.getProfile();
        int i19 = aVar.f13102a;
        int i27 = this.f13120u;
        rq2.a b17 = dVar.b(i19, i27);
        if (b17 != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onCgiBack: pullType=");
            sb7.append(i19);
            sb7.append(", tabType=");
            sb7.append(i27);
            sb7.append(", preloadType=");
            int i28 = aVar.f13111j;
            sb7.append(i28);
            com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", sb7.toString());
            b17.f398793d = android.os.SystemClock.elapsedRealtime();
            b17.f398799j = byteString;
            b17.f398810u = profile;
            b17.f398801l = i28;
        }
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList list = resp.getList(1);
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.util.LinkedList linkedList = ((r45.fa2) it.next()).f374129h;
                    if (linkedList != null) {
                        java.util.Iterator it6 = linkedList.iterator();
                        while (it6.hasNext()) {
                            r45.oa2 oa2Var = (r45.oa2) ((r45.ea2) it6.next()).getCustom(4);
                            if (oa2Var != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) oa2Var.getCustom(1)) != null && (username = finderContact.getUsername()) != null) {
                                if (!(username.length() > 0)) {
                                    username = null;
                                }
                                if (username != null && (h32Var = (r45.h32) oa2Var.getCustom(0)) != null) {
                                    c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                                    java.lang.String string = h32Var.getString(4);
                                    if (string == null) {
                                        string = "";
                                    }
                                    ((b92.d1) zbVar).Ai(username, string, h32Var);
                                }
                            }
                        }
                    }
                }
            }
            com.tencent.mm.protobuf.g byteString2 = resp.getByteString(20);
            if (byteString2 != null) {
                cq2.q.f221434g = byteString2;
                com.tencent.mars.xlog.Log.i("NewSquarePreloadUtil", "moreLiveObjectsBuffer: update buffer, value=" + byteString2);
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_NEARBY_MORE_LIVE_OBJECTS_BUFFER_STRING, com.tencent.mm.sdk.platformtools.t8.l(byteString2.f192156a));
            }
        }
    }

    public final boolean B() {
        int i17 = this.f13119t.f13102a;
        return i17 == 1 || i17 == 0 || i17 == 3 || i17 == 11 || i17 == 10 || i17 == 9 || i17 == 12 || i17 == 14 || i17 == 15 || i17 == 21;
    }

    @Override // az2.j, com.tencent.mm.modelbase.i
    public pq5.g l() {
        jz5.f0 f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cgi real run, pullType: ");
        aq2.a aVar = this.f13119t;
        sb6.append(aVar.f13102a);
        sb6.append(" tabId=");
        int i17 = this.f13120u;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderNavLiveStream", sb6.toString());
        rq2.d dVar = rq2.d.f398816a;
        int i18 = aVar.f13102a;
        java.lang.String a17 = dVar.a(i18, i17);
        if (dVar.c(i18, i17)) {
            rq2.a b17 = dVar.b(i18, i17);
            if (b17 != null) {
                com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "startCgi: tabType=" + i17 + ", pullType=" + i18);
                b17.f398792c = android.os.SystemClock.elapsedRealtime();
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "startCgi setOutSideStartCgiTsMap tabType=" + i17 + ", pullType=" + i18);
                rq2.d.f398822g.put(dVar.a(i18, i17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveNewSquareReporter", "startCgi: remove data, type=" + i17 + " key=" + a17);
            rq2.d.f398821f.remove(a17);
        }
        int i19 = aVar.f13102a;
        if (i19 == 21 || i19 == 10 || i19 == 9) {
            rq2.o.f398847a.c(rq2.b.f398811e, i19, this.f13122w == 1);
        }
        return super.l();
    }

    @Override // az2.j
    public java.util.List s() {
        return kz5.b0.c(new jz5.l("pull_type", java.lang.String.valueOf(this.f13124y.getInteger(7))));
    }

    @Override // az2.j, ay1.m
    /* renamed from: x */
    public java.lang.String getF123276h() {
        aq2.a aVar = this.f13119t;
        int i17 = aVar.f13102a;
        if (i17 == 1 || i17 == 21 || i17 == 24 || i17 == 9 || i17 == 10) {
            i17 = 0;
        }
        return super.getKey() + '+' + i17 + '+' + aVar.f13114m + '+' + aVar.f13103b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(aq2.a userRequest, r45.qt2 qt2Var, im5.b bVar) {
        super(qt2Var, bVar);
        int i17;
        r45.kd1 kd1Var;
        r45.nm1 nm1Var;
        java.util.LinkedList list;
        r45.dd2 dd2Var;
        int i18;
        kotlin.jvm.internal.o.g(userRequest, "userRequest");
        this.f13119t = userRequest;
        this.f13120u = 10000;
        this.f13121v = "";
        r45.ck2 ck2Var = new r45.ck2();
        this.f13124y = ck2Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        db2.t4 t4Var = db2.t4.f228171a;
        r45.kv0 a17 = t4Var.a(7312);
        int i19 = userRequest.f13107f;
        a17.set(1, java.lang.Integer.valueOf(i19));
        ck2Var.set(1, a17);
        ck2Var.set(2, userRequest.f13104c);
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        ck2Var.set(3, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        ck2Var.set(4, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        ck2Var.set(5, t4Var.n());
        int i27 = userRequest.f13102a;
        ck2Var.set(7, java.lang.Integer.valueOf(i27));
        ck2Var.set(15, "");
        zl2.q4 q4Var = zl2.q4.f473933a;
        ck2Var.set(16, q4Var.b());
        r45.xo1 xo1Var = new r45.xo1();
        cq2.q qVar = cq2.q.f221428a;
        xo1Var.set(2, java.lang.Integer.valueOf(cq2.q.f221440m));
        xo1Var.set(3, java.lang.Integer.valueOf(cq2.q.f221441n));
        xo1Var.set(4, java.lang.Integer.valueOf(cq2.q.f221442o));
        int i28 = userRequest.f13111j;
        xo1Var.set(5, java.lang.Integer.valueOf(i28));
        xo1Var.set(6, java.lang.Float.valueOf(userRequest.f13112k));
        int i29 = userRequest.f13107f;
        if (i29 == 9500001 || i29 == 9500002 || i29 == 9500004 || i29 == 9500003) {
            com.tencent.mars.xlog.Log.i("Finder.CgiFinderNavLiveStream", "buildRedDotRequest return for in operation game.");
            i17 = i28;
        } else {
            if (B()) {
                zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
                r45.xs2 Q = nk6.Q("NearbyLiveTab");
                this.f13123x = Q != null;
                boolean z17 = userRequest.f13117p;
                int i37 = userRequest.f13102a;
                i17 = i28;
                if (z17 && (i37 == 10 || i37 == 9)) {
                    xo1Var.set(0, java.lang.Boolean.TRUE);
                    r45.wo1 d17 = qVar.d();
                    xo1Var.set(1, d17 != null ? d17.getByteString(9) : null);
                }
                ck2Var.set(12, new r45.kd1());
                if (!z17 && (kd1Var = (r45.kd1) ck2Var.getCustom(12)) != null) {
                    if (Q != null) {
                        this.f13122w = Q.getInteger(13);
                        this.f13121v = nk6.V0("NearbyLiveTab");
                        kd1Var.set(0, java.lang.Long.valueOf(Q.getLong(3)));
                        kd1Var.set(1, Q.getString(8));
                        kd1Var.set(2, Q.getByteString(7));
                        if (c92.g.f39738a.b()) {
                            kd1Var.set(3, "FinderLiveEntrance");
                        } else {
                            kd1Var.set(3, "NearbyEntrance");
                        }
                        if (i37 == 10 || i37 == 9) {
                            xo1Var.set(0, java.lang.Boolean.TRUE);
                            r45.wo1 wo1Var = (r45.wo1) Q.getCustom(30);
                            xo1Var.set(1, wo1Var != null ? wo1Var.getByteString(5) : null);
                        }
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[buildRedDotRequest] pullType:");
                    sb6.append(i37);
                    sb6.append(" isRedDotRequest=");
                    sb6.append(this.f13123x);
                    sb6.append(" tab_tips_path=");
                    sb6.append(kd1Var.getString(3));
                    sb6.append("  tabTipsByPassInfo=");
                    sb6.append(kd1Var.getByteString(2) != null);
                    sb6.append(" objectId=");
                    sb6.append(pm0.v.u(kd1Var.getLong(0)));
                    sb6.append(' ');
                    com.tencent.mars.xlog.Log.i("Finder.CgiFinderNavLiveStream", sb6.toString());
                }
            } else {
                i17 = i28;
            }
            ck2Var.set(22, xo1Var);
            com.tencent.mars.xlog.Log.i("Finder.CgiFinderNavLiveStream", "preloadInfo: total_preload_cnt=" + xo1Var.getInteger(2) + ", total_fail_preload_cnt=" + xo1Var.getInteger(3) + ", total_effective_preload_cnt=" + xo1Var.getInteger(4) + ", is_preload_request=" + xo1Var.getBoolean(0) + ", preload_type=" + xo1Var.getInteger(5) + ", client_predict_score=" + xo1Var.getFloat(6));
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("resetPreloadCnt total_preload_cnt: ");
            sb7.append(cq2.q.f221440m);
            sb7.append(" total_fail_preload_cnt: ");
            sb7.append(cq2.q.f221441n);
            sb7.append(" total_effective_preload_cnt: ");
            sb7.append(cq2.q.f221442o);
            com.tencent.mars.xlog.Log.i("NewSquarePreloadUtil", sb7.toString());
            cq2.q.f221440m = 0;
            cq2.q.f221441n = 0;
            cq2.q.f221442o = 0;
        }
        if (B()) {
            r45.n40 n40Var = new r45.n40();
            com.tencent.mm.plugin.finder.assist.h4 h4Var = com.tencent.mm.plugin.finder.assist.h4.f102221a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            dp2.a aVar = dp2.a.f242183a;
            android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
            com.tencent.mm.ui.ah a18 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.lang.System.nanoTime();
            boolean z18 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            int i38 = a18.f197135a;
            if (!z18 && i38 > (i18 = a18.f197136b)) {
                i38 = i18;
            }
            n40Var.set(0, java.lang.Integer.valueOf(h4Var.d(context, ((((i38 - com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 36)) / 2) - resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9)) - resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv)) - resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn), 12.0f)));
            ck2Var.set(26, n40Var);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("buildClientSpecificConfig: pullType=");
            sb8.append(i27);
            sb8.append(", recommend_reason_len=");
            r45.n40 n40Var2 = (r45.n40) ck2Var.getCustom(26);
            sb8.append(n40Var2 != null ? java.lang.Integer.valueOf(n40Var2.getInteger(0)) : null);
            com.tencent.mars.xlog.Log.i("Finder.CgiFinderNavLiveStream", sb8.toString());
        }
        ck2Var.set(11, 0);
        ck2Var.set(24, userRequest.f13105d);
        ck2Var.set(18, java.lang.Long.valueOf(userRequest.f13108g));
        ck2Var.set(17, java.lang.Integer.valueOf(userRequest.f13103b));
        ck2Var.getList(19).addAll(userRequest.f13106e);
        ck2Var.set(6, zl2.q4.d(q4Var, null, new java.util.LinkedList(((b92.m2) ((zy2.n8) i95.n0.c(zy2.n8.class))).wi("FinderNavLiveStream")), 1, null));
        ck2Var.set(21, userRequest.f13109h);
        ck2Var.set(20, userRequest.f13110i);
        ck2Var.set(23, userRequest.f13115n);
        ck2Var.set(25, userRequest.f13116o);
        ck2Var.set(27, userRequest.f13118q);
        lVar.f70664a = ck2Var;
        r45.dk2 dk2Var = new r45.dk2();
        dk2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) dk2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = dk2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findernavlivestream";
        lVar.f70667d = 7312;
        r45.dd2 dd2Var2 = userRequest.f13110i;
        int integer = dd2Var2 != null ? dd2Var2.getInteger(0) : 10000;
        this.f13120u = integer;
        p(lVar.a());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[CgiFinderNavLiveStream#init] commentScene=");
        sb9.append(i19);
        sb9.append(", from_comment_scene=");
        sb9.append(ck2Var.getString(24));
        sb9.append(", pullType=");
        sb9.append(i27);
        sb9.append(", preloadType=");
        sb9.append(i17);
        sb9.append(", longitude=");
        sb9.append(ck2Var.getFloat(3));
        sb9.append(" latitude=");
        sb9.append(ck2Var.getFloat(4));
        sb9.append(" lastBuffer:");
        sb9.append(ck2Var.getByteString(2));
        sb9.append(",liveTabId: ");
        r45.dd2 dd2Var3 = (r45.dd2) ck2Var.getCustom(20);
        sb9.append(dd2Var3 != null ? java.lang.Integer.valueOf(dd2Var3.getInteger(0)) : null);
        sb9.append(",tabId: ");
        sb9.append(integer);
        sb9.append(", subTabId: ");
        r45.dd2 dd2Var4 = (r45.dd2) ck2Var.getCustom(20);
        sb9.append((dd2Var4 == null || (list = dd2Var4.getList(6)) == null || (dd2Var = (r45.dd2) kz5.n0.a0(list, 0)) == null) ? null : java.lang.Integer.valueOf(dd2Var.getInteger(0)));
        sb9.append(",liveReportInfo: ");
        sb9.append((r45.o72) ck2Var.getCustom(21));
        sb9.append(",speed=");
        r45.om1 om1Var = (r45.om1) ck2Var.getCustom(16);
        sb9.append((om1Var == null || (nm1Var = (r45.nm1) om1Var.getCustom(0)) == null) ? null : java.lang.Integer.valueOf(nm1Var.getInteger(0)));
        sb9.append(", pre_navlive_more_live_objects_buffer=");
        sb9.append(ck2Var.getByteString(25));
        sb9.append("end_nav_buffer.object_id_list:");
        r45.rk0 rk0Var = (r45.rk0) ck2Var.getCustom(27);
        sb9.append(rk0Var != null ? rk0Var.getList(0) : null);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderNavLiveStream", sb9.toString());
    }
}
