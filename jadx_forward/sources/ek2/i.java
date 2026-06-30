package ek2;

/* loaded from: classes3.dex */
public final class i extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.h f334994u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f334995v;

    /* renamed from: w, reason: collision with root package name */
    public final org.json.JSONObject f334996w;

    /* renamed from: x, reason: collision with root package name */
    public final org.json.JSONObject f334997x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j17, long j18, java.lang.String str, byte[] bArr, int i17, r45.ch1 msg, ek2.h hVar) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f334994u = hVar;
        this.f334995v = "Finder.CgiFinderApplyLiveMic";
        r45.qk1 qk1Var = new r45.qk1();
        this.f334996w = new org.json.JSONObject();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f334997x = jSONObject;
        qk1Var.set(4, java.lang.Long.valueOf(j17));
        qk1Var.set(1, db2.t4.f309704a.a(5227));
        qk1Var.set(5, java.lang.Long.valueOf(j18));
        qk1Var.set(6, str);
        qk1Var.set(8, xy2.c.f(this.f97668n));
        qk1Var.set(7, java.lang.Integer.valueOf(i17));
        qk1Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        qk1Var.set(3, msg);
        jSONObject.put("liveId", j17);
        jSONObject.put("objectId", j18);
        jSONObject.put(dm.i4.f66875xa013b0d5, qk1Var.m75945x2fec8307(8));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderApplyLiveMic", "apply live id:" + j17 + " objectId:" + j18 + " objectNonceId:" + str);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = qk1Var;
        r45.rk1 rk1Var = new r45.rk1();
        rk1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) rk1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = rk1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveapplymicwithaudience";
        lVar.f152200d = 5227;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        fm2.c cVar;
        java.lang.String str2 = str;
        r45.rk1 resp = (r45.rk1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f334995v, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str2 + " thread=" + java.lang.Thread.currentThread());
        ek2.h hVar = this.f334994u;
        if (hVar != null) {
            um2.j5 j5Var = (um2.j5) hVar;
            um2.x5 x5Var = j5Var.f510379a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x5Var.f510565f, "ApplyLinkMic errCode:" + i18 + " errType:" + i17 + "  errMsg:" + str2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[linkApplyMic result] ");
            sb6.append(i18);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str3 = x5Var.f510565f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb7);
            java.lang.String m75945x2fec8307 = resp.m75945x2fec8307(1);
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8 y8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184272h, 70L);
                ((mm2.o4) x5Var.c(mm2.o4.class)).Q7(j5Var.f510380b == 1 ? 1 : 2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vi0 vi0Var = x5Var.f510584l0;
                if (vi0Var != null) {
                    vi0Var.w1();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = x5Var.f510608t0;
                if (ag0Var != null) {
                    ag0Var.D1();
                }
                mm2.o4 o4Var = (mm2.o4) x5Var.c(mm2.o4.class);
                java.lang.String m75945x2fec83072 = resp.m75945x2fec8307(3);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                o4Var.P7(m75945x2fec83072);
                long m75942xfb822ef2 = (resp.m75942xfb822ef2(4) * 1000) - c01.id.c();
                java.lang.Long valueOf = java.lang.Long.valueOf(m75942xfb822ef2);
                if ((valueOf.longValue() <= 0 ? 0 : 1) == 0) {
                    valueOf = null;
                }
                long longValue = valueOf != null ? valueOf.longValue() : 60000L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[linkApplyMic result] success, respSessionId: " + resp.m75945x2fec8307(3) + " offestTime: " + m75942xfb822ef2 + " confirm_expired_time: " + resp.m75942xfb822ef2(4) + " applyTime: " + longValue);
                mk2.h hVar2 = mk2.h.f408666a;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("startApplyMicTimer delay:");
                sb8.append(longValue);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LinkMicTimeoutTimer", sb8.toString());
                mk2.c cVar2 = mk2.h.f408667b;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(cVar2);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(cVar2, longValue);
                return;
            }
            pm0.v.X(new um2.n0(x5Var));
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = x5Var.f101138b;
            switch (i18) {
                case -200302:
                    db5.t7.g(activityC0065xcd7aa112, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lz7) : str2);
                    r7 = -1;
                    break;
                case -200108:
                    db5.t7.g(activityC0065xcd7aa112, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.duq) : str2);
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ml2.r0.ik((ml2.r0) c17, ml2.n4.f409285s, null, 0, 6, null);
                    ml2.m4[] m4VarArr = ml2.m4.f409250d;
                    r7 = 2;
                    break;
                case -200105:
                    db5.t7.g(activityC0065xcd7aa112, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dus) : str2);
                    i95.m c18 = i95.n0.c(ml2.r0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    ml2.r0.ik((ml2.r0) c18, ml2.n4.f409284r, null, 0, 6, null);
                    ml2.m4[] m4VarArr2 = ml2.m4.f409250d;
                    fm2.c cVar3 = x5Var.f101139c;
                    if (cVar3 != null) {
                        dk2.Cif.b(dk2.Cif.f315159a, cVar3, ((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0), dk2.hf.f315119d, false, 8, null);
                        break;
                    }
                    break;
                case -200104:
                    db5.t7.g(activityC0065xcd7aa112, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.duv) : str2);
                    i95.m c19 = i95.n0.c(ml2.r0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                    ml2.r0.ik((ml2.r0) c19, ml2.n4.f409283q, null, 0, 6, null);
                    ml2.m4[] m4VarArr3 = ml2.m4.f409250d;
                    r7 = 0;
                    break;
                case -200018:
                    java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dn6) : str2;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC0065xcd7aa112);
                    u1Var.n(activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                    u1Var.g(string);
                    u1Var.q(false);
                    r7 = -1;
                    break;
                case -200017:
                case -200010:
                    java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dn7) : str2;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC0065xcd7aa112);
                    u1Var2.n(activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                    u1Var2.g(string2);
                    u1Var2.q(false);
                    r7 = -1;
                    break;
                case -200016:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[linkApplyMic Err] need realname, url:" + m75945x2fec8307);
                    if (m75945x2fec8307 != null && (cVar = x5Var.f101139c) != null) {
                        cVar.m57648x167921cd();
                        new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ah(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14304xa96e914e(activityC0065xcd7aa112), cVar).t1(new um2.o0(x5Var));
                    }
                    r7 = -1;
                    break;
                case -200009:
                case -100064:
                    java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dn8) : str2;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC0065xcd7aa112);
                    u1Var3.n(activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                    u1Var3.g(string3);
                    u1Var3.q(false);
                    r7 = -1;
                    break;
                default:
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        str2 = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lz8);
                    }
                    db5.t7.g(activityC0065xcd7aa112, str2);
                    long m75942xfb822ef22 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8 y8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184265a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y8.f184272h, 71L);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicWatcher", "onVisitorApplyMicFail errCode: " + i18 + " errType: " + i17 + " liveId: " + m75942xfb822ef22);
                    pm0.z.b(xy2.b.f539688b, "mic_visitorApplyMicFail", false, null, null, false, false, new dk2.sa(i18, i17, m75942xfb822ef22), 60, null);
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[linkApplyMic Err] unkonwn errCode:$");
                    sb9.append(i18);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb9.toString());
                    r7 = -1;
                    break;
            }
            if (r7 != -1) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_link_err_event", x5Var.f101139c, kz5.b1.e(new jz5.l("link_err_type", java.lang.Integer.valueOf(r7))), 25561);
            }
        }
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f334997x;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f334996w;
    }
}
