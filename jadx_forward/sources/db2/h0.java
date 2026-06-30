package db2;

/* loaded from: classes2.dex */
public final class h0 extends az2.j {

    /* renamed from: x, reason: collision with root package name */
    public static long f309531x;

    /* renamed from: t, reason: collision with root package name */
    public final db2.a5 f309532t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f309533u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.w21 f309534v;

    /* renamed from: w, reason: collision with root package name */
    public final long f309535w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(db2.a5 params, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f309532t = params;
        this.f309533u = "Finder.CgiFinderFavFeed";
        long c17 = c01.id.c();
        this.f309535w = c17;
        long j17 = f309531x;
        if (c17 < j17) {
            f309531x = 1 + j17;
            this.f309535w = j17;
        }
        f309531x = this.f309535w;
        r45.w21 w21Var = new r45.w21();
        this.f309534v = w21Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        long j18 = params.f309424a;
        w21Var.set(2, java.lang.Long.valueOf(j18));
        w21Var.set(4, params.f309426c);
        w21Var.set(5, java.lang.Long.valueOf(this.f309535w));
        w21Var.set(6, xy2.c.f(qt2Var));
        boolean z17 = params.f309427d;
        w21Var.set(3, java.lang.Integer.valueOf(z17 ? 1 : 2));
        db2.t4 t4Var = db2.t4.f309704a;
        w21Var.set(1, t4Var.b(3515, qt2Var));
        i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        w21Var.set(7, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.fk((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18, params.f309424a, params.f309425b, qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0, qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0, null, 16, null));
        w21Var.set(8, java.lang.Integer.valueOf(params.f309429f));
        w21Var.set(9, params.f309431h);
        w21Var.set(10, params.f309432i);
        t4Var.h((r45.kv0) w21Var.m75936x14adae67(1), qt2Var, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0), java.lang.Long.valueOf(j18), params.f309425b)));
        if (w21Var.m75939xb282bd08(3) == 1) {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            fo3.s sVar = fo3.s.INSTANCE;
            cu5Var.d(sVar.Ci("ce_feed_fav"));
            k57Var.f459928e = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(sVar.h());
            k57Var.f459929f = cu5Var2;
            r45.kv0 kv0Var = (r45.kv0) w21Var.m75936x14adae67(1);
            if (kv0Var != null) {
                kv0Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(k57Var.mo14344x5f01b1f6()));
            }
            w04.l.INSTANCE.b(540999701);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("likeId:");
        long j19 = this.f309535w;
        sb6.append(j19);
        sb6.append(" objectId:");
        sb6.append(w21Var.m75942xfb822ef2(2));
        sb6.append(" opType:");
        sb6.append(w21Var.m75939xb282bd08(3));
        sb6.append(" likeId:");
        sb6.append(w21Var.m75942xfb822ef2(5));
        sb6.append(" username:");
        sb6.append(w21Var.m75945x2fec8307(6));
        sb6.append(" action:");
        sb6.append(z17);
        sb6.append(" sourceType:");
        sb6.append(params.f309429f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderFavFeed", sb6.toString());
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = w21Var;
        r45.x21 x21Var = new r45.x21();
        x21Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) x21Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = x21Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderfav";
        lVar.f152200d = 3515;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderFavFeed", "likeId:" + j19 + " CgiFinderLikeComment init " + w21Var.m75942xfb822ef2(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.x21 resp = (r45.x21) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("likeId:");
        sb6.append(this.f309535w);
        sb6.append(" [onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(" objectId:");
        r45.w21 w21Var = this.f309534v;
        sb6.append(w21Var.m75942xfb822ef2(2));
        sb6.append(" opType:");
        sb6.append(w21Var.m75939xb282bd08(3));
        sb6.append(" likeId:");
        sb6.append(w21Var.m75942xfb822ef2(5));
        sb6.append(" username:");
        sb6.append(w21Var.m75945x2fec8307(6));
        sb6.append(" action:");
        sb6.append(this.f309532t.f309427d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309533u, sb6.toString());
        hz2.d.f367846a.h(i17, i18, str);
    }
}
