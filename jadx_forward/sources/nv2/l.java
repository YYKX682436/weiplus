package nv2;

/* loaded from: classes2.dex */
public final class l extends nv2.r {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f422052d;

    /* renamed from: e, reason: collision with root package name */
    public final long f422053e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f422054f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f422055g;

    /* renamed from: h, reason: collision with root package name */
    public final int f422056h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.qt2 f422057i;

    /* renamed from: j, reason: collision with root package name */
    public final int f422058j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f422059k;

    /* renamed from: l, reason: collision with root package name */
    public final r45.t21 f422060l;

    /* renamed from: m, reason: collision with root package name */
    public final r45.bc1 f422061m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObject, long j17, java.lang.String objectNonceId, boolean z17, int i17, nv2.i1 i1Var, r45.qt2 contextObj, int i18, java.lang.String str, r45.t21 newLifeReportInfo, r45.bc1 bc1Var) {
        super(i1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newLifeReportInfo, "newLifeReportInfo");
        this.f422052d = finderObject;
        this.f422053e = j17;
        this.f422054f = objectNonceId;
        this.f422055g = z17;
        this.f422056h = i17;
        this.f422057i = contextObj;
        this.f422058j = i18;
        this.f422059k = str;
        this.f422060l = newLifeReportInfo;
        this.f422061m = bc1Var;
    }

    @Override // nv2.r
    public void a(nv2.o1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.a(callback);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f422052d;
        boolean m59338xecb5e178 = c14994x9b99c079.m59338xecb5e178();
        r45.qt2 qt2Var = this.f422057i;
        if (!m59338xecb5e178) {
            new db2.h0(new db2.a5(this.f422053e, c14994x9b99c079.m59229xb5af1dd5(), this.f422054f, this.f422055g, this.f422056h, this.f422058j, this.f422059k, this.f422060l, this.f422061m), qt2Var).l().K(new nv2.k(this, callback));
            return;
        }
        int i17 = this.f422055g ? 3 : 103;
        java.lang.String f17 = xy2.c.f(qt2Var);
        java.lang.String str = this.f422059k;
        if (str == null) {
            str = "";
        }
        new ho2.h(i17, f17, str, this.f422052d, "FinderLocal_" + java.lang.System.nanoTime()).l().K(new nv2.j(this, callback));
    }

    @Override // nv2.r
    public java.lang.String c() {
        return "id_" + this.f422053e + '_' + this.f422055g;
    }

    public final void d(nv2.o1 callback, com.p314xaae8f345.mm.p944x882e457a.f cgiBack) {
        int m59235xb80ecc2a;
        int i17;
        java.lang.String str;
        r45.yz3 yz3Var;
        r45.yz3 yz3Var2;
        r45.yz3 yz3Var3;
        r45.yz3 yz3Var4;
        r45.zu0 zu0Var;
        r45.pm2 pm2Var;
        r45.ll2 ll2Var;
        r45.jn2 jn2Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        r45.dm2 m76806xdef68064;
        r45.pm2 pm2Var2;
        r45.ll2 ll2Var2;
        r45.jn2 jn2Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiBack, "cgiBack");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FavActionTask", "FavActionTask callback " + cgiBack.f152148a + ' ' + cgiBack.f152149b + ' ' + cgiBack.f152150c);
        int i18 = cgiBack.f152148a;
        long j17 = this.f422053e;
        if (i18 != 0 || cgiBack.f152149b != 0) {
            if (i18 != 4) {
                callback.a(fp0.u.f346824g, true);
                return;
            }
            nv2.o oVar = nv2.o.f422091e;
            nv2.o.f422091e.d(this);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
            c5445x963cab3.f135785g.f88451a = j17;
            c5445x963cab3.e();
            callback.a(fp0.u.f346824g, false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f422052d;
        int m59235xb80ecc2a2 = c14994x9b99c079.m59235xb80ecc2a();
        int m59236xfdaf34f1 = c14994x9b99c079.m59236xfdaf34f1();
        boolean z17 = this.f422055g;
        if (z17) {
            m59235xb80ecc2a = c14994x9b99c079.m59235xb80ecc2a();
            if (c14994x9b99c079.m59236xfdaf34f1() != 1) {
                i17 = 1;
            }
            i17 = 0;
        } else {
            m59235xb80ecc2a = c14994x9b99c079.m59235xb80ecc2a();
            if (c14994x9b99c079.m59236xfdaf34f1() == 1) {
                i17 = -1;
            }
            i17 = 0;
        }
        int i19 = m59235xb80ecc2a + i17;
        e(c14994x9b99c079, z17 ? 1 : 0, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(c14994x9b99c079.m59233x87980ca());
        long j18 = -1;
        long m75942xfb822ef2 = (h17 == null || (feedObject = h17.getFeedObject()) == null || (m76806xdef68064 = feedObject.m76806xdef68064()) == null || (pm2Var2 = (r45.pm2) m76806xdef68064.m75936x14adae67(12)) == null || (ll2Var2 = (r45.ll2) pm2Var2.m75936x14adae67(0)) == null || (jn2Var2 = (r45.jn2) ll2Var2.m75936x14adae67(4)) == null) ? -1L : jn2Var2.m75942xfb822ef2(0);
        r45.dm2 m76806xdef680642 = c14994x9b99c079.getFeedObject().m76806xdef68064();
        if (m76806xdef680642 != null && (pm2Var = (r45.pm2) m76806xdef680642.m75936x14adae67(12)) != null && (ll2Var = (r45.ll2) pm2Var.m75936x14adae67(0)) != null && (jn2Var = (r45.jn2) ll2Var.m75936x14adae67(4)) != null) {
            j18 = jn2Var.m75942xfb822ef2(0);
        }
        if (m75942xfb822ef2 == j18) {
            e(h17, z17 ? 1 : 0, i19);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FavAction", "CgiFinderFavFeed end favFlag:" + c14994x9b99c079.m59236xfdaf34f1() + " favCount " + c14994x9b99c079.m59235xb80ecc2a() + ' ' + m59236xfdaf34f1 + ' ' + m59235xb80ecc2a2);
        nv2.o oVar2 = nv2.o.f422091e;
        nv2.o.f422091e.d(this);
        callback.a(fp0.u.f346823f, false);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = cgiBack.f152151d;
        r45.x21 x21Var = fVar instanceof r45.x21 ? (r45.x21) fVar : null;
        if (x21Var != null && (yz3Var4 = (r45.yz3) x21Var.m75936x14adae67(1)) != null && (zu0Var = (r45.zu0) yz3Var4.m75936x14adae67(2)) != null) {
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((cq.k) c17).Vi(c14994x9b99c079.m59299x6bf53a6c(), zu0Var);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab32 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
        am.ia iaVar = c5445x963cab32.f135785g;
        iaVar.f88451a = j17;
        iaVar.f88453c = z17 ? 1 : 2;
        iaVar.f88454d = 1;
        iaVar.f88461k = (x21Var == null || (yz3Var3 = (r45.yz3) x21Var.m75936x14adae67(1)) == null) ? 0 : yz3Var3.m75939xb282bd08(0);
        if (x21Var == null || (yz3Var2 = (r45.yz3) x21Var.m75936x14adae67(1)) == null || (str = yz3Var2.m75945x2fec8307(1)) == null) {
            str = "";
        }
        iaVar.f88462l = str;
        iaVar.f88452b = 5;
        iaVar.f88467q = c14994x9b99c079.m59235xb80ecc2a();
        c5445x963cab32.e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0 c5795x6c1c62d0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0();
        java.lang.String u17 = pm0.v.u(j17);
        am.qm qmVar = c5795x6c1c62d0.f136104g;
        qmVar.f89251a = u17;
        qmVar.f89255e = c14994x9b99c079.m59235xb80ecc2a();
        qmVar.f89254d = c14994x9b99c079.m59236xfdaf34f1() == 1;
        nv2.h1 h1Var = nv2.n1.f422083g;
        nv2.n1 n1Var = nv2.n1.f422084h;
        qmVar.f89253c = n1Var.l(c14994x9b99c079.getFeedObject());
        qmVar.f89252b = ((java.lang.Boolean) n1Var.k(c14994x9b99c079.getFeedObject()).f384366d).booleanValue();
        c5795x6c1c62d0.e();
        if (x21Var != null && (yz3Var = (r45.yz3) x21Var.m75936x14adae67(1)) != null) {
            nv2.e1.a(yz3Var, z17, j17, true);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Map b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.U.b(c14994x9b99c079);
        if (b17 != null) {
            linkedHashMap.putAll(b17);
        }
        java.util.Map b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a.b(this.f422057i, null);
        if (b18 != null) {
            linkedHashMap.putAll(b18);
        }
        linkedHashMap.put("is_action_fav", java.lang.Integer.valueOf(z17 ? 1 : 0));
        linkedHashMap.put("is_long_video", 0);
        linkedHashMap.put("old_fav_count", java.lang.Integer.valueOf(m59235xb80ecc2a2));
        linkedHashMap.put("cur_fav_count", java.lang.Integer.valueOf(c14994x9b99c079.m59235xb80ecc2a()));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_fav_real_click", null, linkedHashMap, 24617);
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, int i17, int i18) {
        if (c14994x9b99c079 == null) {
            return;
        }
        c14994x9b99c079.m59374x71208265(i17);
        c14994x9b99c079.getFeedObject().m76861xb2c72d36(i18);
        en3.d0.a(en3.d0.b(en3.d0.c(c14994x9b99c079.getFeedObject()))).set(3, java.lang.Integer.valueOf(i18));
    }

    /* renamed from: toString */
    public java.lang.String m150143x9616526c() {
        return "action_" + this.f422053e + '_' + this.f422055g + '_' + this.f422056h + '_' + this.f422108c;
    }
}
