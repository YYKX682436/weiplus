package db2;

/* loaded from: classes2.dex */
public final class w1 extends az2.j {

    /* renamed from: w, reason: collision with root package name */
    public static long f309742w;

    /* renamed from: t, reason: collision with root package name */
    public final nv2.w1 f309743t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f309744u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.qd1 f309745v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(nv2.w1 action, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        int i17;
        r45.kv0 kv0Var;
        java.util.LinkedList<r45.fl2> m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f309743t = action;
        this.f309744u = "Finder.CgiFinderLikeComment";
        long c17 = c01.id.c();
        long j17 = f309742w;
        if (c17 < j17) {
            f309742w = 1 + j17;
            c17 = j17;
        }
        f309742w = c17;
        r45.qd1 qd1Var = new r45.qd1();
        this.f309745v = qd1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        long j18 = action.f422145d;
        qd1Var.set(1, java.lang.Long.valueOf(j18));
        qd1Var.set(8, action.f422147f);
        qd1Var.set(2, java.lang.Long.valueOf(action.f422148g.u0().m76058xa6514d24()));
        qd1Var.set(4, java.lang.Long.valueOf(c17));
        int i18 = action.f422150i;
        if (i18 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(j18);
            qd1Var.set(6, hc2.o0.H(h17 != null ? h17.getFeedObject() : null) ? h17 != null ? h17.f66949xdec927b : null : xy2.c.f(qt2Var));
        }
        db2.t4 t4Var = db2.t4.f309704a;
        qd1Var.set(9, t4Var.b(3710, qt2Var));
        qd1Var.set(7, java.lang.Integer.valueOf(i18));
        switch (action.f422149h.ordinal()) {
            case 0:
                i17 = 1;
                break;
            case 1:
                i17 = 2;
                break;
            case 2:
                i17 = 7;
                break;
            case 3:
                i17 = 9;
                break;
            case 4:
                i17 = 10;
                break;
            case 5:
                i17 = 11;
                break;
            case 6:
                i17 = 12;
                break;
            case 7:
                i17 = 13;
                break;
            default:
                throw new jz5.j();
        }
        qd1Var.set(3, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        r45.kv0 kv0Var2 = (r45.kv0) qd1Var.m75936x14adae67(9);
        int m75939xb282bd08 = kv0Var2 != null ? kv0Var2.m75939xb282bd08(1) : 0;
        java.lang.String str = action.f422146e;
        qd1Var.set(10, o3Var.ek(j18, str, m75939xb282bd08));
        r45.kv0 kv0Var3 = (r45.kv0) qd1Var.m75936x14adae67(9);
        r45.kv0 kv0Var4 = (r45.kv0) qd1Var.m75936x14adae67(9);
        t4Var.h(kv0Var3, qt2Var, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(kv0Var4 != null ? kv0Var4.m75939xb282bd08(1) : 0), java.lang.Long.valueOf(j18), str)));
        java.lang.String str2 = action.f422155n;
        java.lang.String t17 = str2 != null ? r26.i0.t(str2, ";", ",", false) : null;
        if (!(t17 == null || t17.length() == 0) && (kv0Var = (r45.kv0) qd1Var.m75936x14adae67(9)) != null && (m75941xfb821914 = kv0Var.m75941xfb821914(7)) != null) {
            for (r45.fl2 fl2Var : m75941xfb821914) {
                db2.t4 t4Var2 = db2.t4.f309704a;
                java.lang.String m75945x2fec8307 = fl2Var.m75945x2fec8307(5);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                fl2Var.set(5, db2.t4.m(t4Var2, m75945x2fec8307, t17, false, 4, null));
            }
        }
        nv2.w1 w1Var = this.f309743t;
        int i19 = w1Var.f422154m;
        if (i19 > 0 && w1Var.f422153l != null) {
            this.f309745v.set(21, java.lang.Integer.valueOf(i19));
            this.f309745v.set(20, this.f309743t.f422153l);
        }
        if (this.f309745v.m75939xb282bd08(3) == 1) {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            fo3.s sVar = fo3.s.INSTANCE;
            cu5Var.d(sVar.Ci("ce_feed_comment_like"));
            k57Var.f459928e = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(sVar.h());
            k57Var.f459929f = cu5Var2;
            r45.kv0 kv0Var5 = (r45.kv0) this.f309745v.m75936x14adae67(9);
            if (kv0Var5 != null) {
                kv0Var5.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(k57Var.mo14344x5f01b1f6()));
            }
            w04.l.INSTANCE.Ch(540999690, 4);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.qd1 qd1Var2 = this.f309745v;
        lVar.f152197a = qd1Var2;
        r45.rd1 rd1Var = new r45.rd1();
        rd1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) rd1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = rd1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlike";
        lVar.f152200d = 3710;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309744u, "CgiFinderLikeComment init " + qd1Var2.m75942xfb822ef2(1) + " and userName " + qd1Var2.m75945x2fec8307(6) + " comment:" + this.f309743t.f422148g);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.rd1 resp = (r45.rd1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309744u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        hz2.d dVar = hz2.d.f367846a;
        dVar.h(i17, i18, str);
        dVar.f(i17, i18, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d1g));
        if (this.f309743t.f422149h != nv2.x1.f422164i) {
            dVar.d(i17, i18, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d1i));
            return;
        }
        dVar.d(i17, i18, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p3l) : str);
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p3n) : str;
        if (i17 == 4 && i18 == -4301 && string != null) {
            dVar.m(string);
        }
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oit) : str;
        if (i17 == 4 && i18 == -4011 && string2 != null) {
            dVar.m(string2);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p3m);
        }
        if (i17 == 4 && i18 == -4012 && str != null) {
            dVar.m(str);
        }
    }
}
