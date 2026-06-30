package ek2;

/* loaded from: classes3.dex */
public final class b extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.a f334945u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f334946v;

    /* renamed from: w, reason: collision with root package name */
    public final org.json.JSONObject f334947w;

    /* renamed from: x, reason: collision with root package name */
    public final org.json.JSONObject f334948x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j17, long j18, java.lang.String str, byte[] bArr, int i17, r45.ch1 msg, ek2.a aVar) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f334945u = aVar;
        this.f334946v = "Finder.CgiFinderAcceptLiveMic";
        r45.xd1 xd1Var = new r45.xd1();
        this.f334947w = new org.json.JSONObject();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f334948x = jSONObject;
        xd1Var.set(4, java.lang.Long.valueOf(j17));
        xd1Var.set(1, db2.t4.f309704a.a(6852));
        xd1Var.set(5, java.lang.Long.valueOf(j18));
        xd1Var.set(6, str);
        xd1Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        xd1Var.set(8, xy2.c.f(this.f97668n));
        xd1Var.set(7, java.lang.Integer.valueOf(i17));
        xd1Var.set(3, msg);
        jSONObject.put("liveId", j17);
        jSONObject.put("objectId", j18);
        jSONObject.put(dm.i4.f66875xa013b0d5, xd1Var.m75945x2fec8307(8));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = xd1Var;
        r45.yd1 yd1Var = new r45.yd1();
        yd1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) yd1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = yd1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveacceptmicwithaudience";
        lVar.f152200d = 6852;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.nw1 nw1Var;
        sm2.o4 m129724xca56ce03;
        r45.kf5 kf5Var;
        tn0.w0 w0Var;
        java.lang.String str2 = str;
        r45.yd1 resp = (r45.yd1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f334946v, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str2 + " thread=" + java.lang.Thread.currentThread());
        ek2.a aVar = this.f334945u;
        if (aVar != null) {
            qf2.e eVar = (qf2.e) aVar;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("acceptLinkMic ");
            km2.q qVar = eVar.f443869a;
            sb6.append(qVar.f390706d);
            sb6.append(' ');
            sb6.append(qVar.f390703a);
            sb6.append(" errCode:");
            sb6.append(i18);
            sb6.append(" errType:");
            sb6.append(i17);
            sb6.append(" errMsg:");
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicCloudController", sb6.toString());
            boolean z17 = true;
            qf2.l lVar = eVar.f443870b;
            if (i18 == 0 && i17 == 0) {
                java.util.List list = ((mm2.y2) lVar.m56788xbba4bfc0(mm2.y2.class)).f411102v;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
                pm0.v.G(list, new mm2.w2(qVar));
                list.add(qVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLinkMicLogicSlice", "safeAddReportAudienceMicUserList , user = " + qVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183996d, 60L);
                if (qVar.f390707e == 1) {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f409352f, "", -1, -1);
                } else {
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f409353g, "", -1, -1);
                }
                fj2.s.f344716a.f(3, qVar.f390703a, "");
                ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                ml2.q2 q2Var = ml2.q2.f409364r;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) eVar.f443871c.m75936x14adae67(0);
                java.lang.String m76197x6c03c64c = c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null;
                ml2.h3[] h3VarArr = ml2.h3.f409055d;
                ml2.m2[] m2VarArr = ml2.m2.f409245d;
                j0Var.Vj(q2Var, m76197x6c03c64c, 2, 2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9) lVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.class);
                if (o9Var != null) {
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i9(o9Var, qVar.f390703a, 0));
                }
                zl2.r4 r4Var = zl2.r4.f555483a;
                java.lang.String str3 = qVar.f390703a;
                if (str3 == null) {
                    str3 = "";
                }
                int l86 = ((mm2.c1) lVar.m56788xbba4bfc0(mm2.c1.class)).l8();
                km2.q l76 = ((mm2.o4) lVar.m56788xbba4bfc0(mm2.o4.class)).l7();
                if (r4Var.q3(str3, l86, false, l76 != null ? l76.f390708f : null) && (w0Var = dk2.ef.f314911d) != null) {
                    w0Var.M0(false);
                }
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = resp.m75934xbce7f2f(4);
                if (m75934xbce7f2f != null) {
                    r45.t74 t74Var = new r45.t74();
                    byte[] bArr = m75934xbce7f2f.f273689a;
                    if (bArr != null) {
                        try {
                            t74Var.mo11468x92b714fd(bArr);
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                        }
                    }
                    r45.il4 il4Var = t74Var.f467731g;
                    if (il4Var != null && (kf5Var = il4Var.f458665g) != null) {
                        int i19 = kf5Var.f460189d * 60;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.H, "set payDuration : " + i19);
                        qVar.K = i19;
                    }
                }
                ((mm2.o4) lVar.m56788xbba4bfc0(mm2.o4.class)).N7(qVar);
                ((mm2.o4) lVar.m56788xbba4bfc0(mm2.o4.class)).f410855q.clear();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4) lVar.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4.class);
                if (c4Var != null) {
                    c4Var.E1();
                }
            } else {
                if (str2 != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    str2 = null;
                }
                if (i18 == -200074) {
                    android.content.Context O6 = lVar.O6();
                    if (str2 == null) {
                        str2 = lVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dm7);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getString(...)");
                    }
                    db5.t7.m123883x26a183b(O6, str2, 0).show();
                } else {
                    android.content.Context O62 = lVar.O6();
                    if (str2 == null) {
                        str2 = lVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lun);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getString(...)");
                    }
                    db5.t7.m123883x26a183b(O62, str2, 0).show();
                    mm2.e1 e1Var = (mm2.e1) lVar.m56788xbba4bfc0(mm2.e1.class);
                    long m75942xfb822ef2 = (e1Var == null || (nw1Var = e1Var.f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicWatcher", "onAnchorAcceptMicFail errCode: " + i18 + " errType: " + i17 + " liveId: " + m75942xfb822ef2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 p8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183996d, 62L);
                    pm0.z.b(xy2.b.f539688b, "mic_anchorAcceptMicFail", false, null, null, false, false, new dk2.oa(i18, i17, m75942xfb822ef2), 60, null);
                }
                mk2.h.f408666a.c(qVar.f390708f);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = lVar.f372632e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 v1Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1) ubVar : null;
                if (v1Var != null && (m129724xca56ce03 = v1Var.m129724xca56ce03()) != null) {
                    sm2.o4.H(m129724xca56ce03, eVar.f443869a, 1, false, false, qf2.a.f443812d, 12, null);
                }
                java.util.List list2 = ((mm2.o4) lVar.m56788xbba4bfc0(mm2.o4.class)).f410868z;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-linkMicUserInfoList>(...)");
                java.lang.String str4 = eVar.f443872d;
                pm0.v.G(list2, new qf2.b(str4));
                java.util.List list3 = ((mm2.o4) lVar.m56788xbba4bfc0(mm2.o4.class)).f410851o;
                if (list3 != null) {
                    pm0.v.G(list3, new qf2.c(str4));
                }
                qVar.f390714l = 0;
            }
            pm0.v.X(new qf2.d(lVar));
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f334948x;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f334947w;
    }
}
