package db2;

/* loaded from: classes2.dex */
public final class x1 extends az2.j {

    /* renamed from: x, reason: collision with root package name */
    public static long f309761x;

    /* renamed from: t, reason: collision with root package name */
    public final db2.c5 f309762t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f309763u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.qd1 f309764v;

    /* renamed from: w, reason: collision with root package name */
    public final long f309765w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(db2.c5 params, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        r45.pd1 pd1Var = null;
        this.f309762t = params;
        this.f309763u = "Finder.CgiFinderLikeFeed";
        long c17 = c01.id.c();
        this.f309765w = c17;
        long j17 = f309761x;
        if (c17 < j17) {
            f309761x = 1 + j17;
            this.f309765w = j17;
        }
        f309761x = this.f309765w;
        r45.qd1 qd1Var = new r45.qd1();
        this.f309764v = qd1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        long j18 = params.f309460a;
        qd1Var.set(1, java.lang.Long.valueOf(j18));
        qd1Var.set(8, params.f309462c);
        qd1Var.set(4, java.lang.Long.valueOf(this.f309765w));
        qd1Var.set(6, xy2.c.f(qt2Var));
        qd1Var.set(7, java.lang.Integer.valueOf(params.f309465f));
        qd1Var.set(15, java.lang.Integer.valueOf(params.f309466g));
        java.lang.String str = params.f309468i;
        if (str != null) {
            pd1Var = new r45.pd1();
            pd1Var.set(0, str);
            pd1Var.set(1, str);
        }
        qd1Var.set(18, pd1Var);
        boolean z17 = params.f309463d;
        qd1Var.set(3, java.lang.Integer.valueOf(z17 ? 3 : 4));
        qd1Var.set(12, java.lang.Integer.valueOf(params.f309464e ? 1 : 0));
        db2.t4 t4Var = db2.t4.f309704a;
        qd1Var.set(9, t4Var.b(3710, qt2Var));
        i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18;
        long j19 = params.f309460a;
        java.lang.String str2 = params.f309461b;
        r45.kv0 kv0Var = (r45.kv0) qd1Var.m75936x14adae67(9);
        qd1Var.set(10, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.fk(o3Var, j19, str2, kv0Var != null ? kv0Var.m75939xb282bd08(1) : 0, qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0, null, 16, null));
        java.lang.String str3 = params.f309467h;
        if (str3 != null) {
            qd1Var.set(16, str3);
        }
        r45.kv0 kv0Var2 = (r45.kv0) qd1Var.m75936x14adae67(9);
        r45.kv0 kv0Var3 = (r45.kv0) qd1Var.m75936x14adae67(9);
        t4Var.h(kv0Var2, qt2Var, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(kv0Var3 != null ? kv0Var3.m75939xb282bd08(1) : 0), java.lang.Long.valueOf(j18), params.f309461b)));
        if (qd1Var.m75939xb282bd08(3) == 3) {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            fo3.s sVar = fo3.s.INSTANCE;
            cu5Var.d(sVar.Ci("ce_feed_like"));
            k57Var.f459928e = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(sVar.h());
            k57Var.f459929f = cu5Var2;
            r45.kv0 kv0Var4 = (r45.kv0) qd1Var.m75936x14adae67(9);
            if (kv0Var4 != null) {
                kv0Var4.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(k57Var.mo14344x5f01b1f6()));
            }
            w04.l.INSTANCE.Ch(540999691, 5);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("likeId:");
        long j27 = this.f309765w;
        sb6.append(j27);
        sb6.append(" objectId:");
        sb6.append(qd1Var.m75942xfb822ef2(1));
        sb6.append(" opType:");
        sb6.append(qd1Var.m75939xb282bd08(3));
        sb6.append(" likeId:");
        sb6.append(qd1Var.m75942xfb822ef2(4));
        sb6.append(" username:");
        sb6.append(qd1Var.m75945x2fec8307(6));
        sb6.append(" action:");
        sb6.append(z17);
        sb6.append(", private:");
        sb6.append(params.f309464e);
        sb6.append(" sourceType:");
        sb6.append(params.f309466g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLikeFeed", sb6.toString());
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = qd1Var;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLikeFeed", "likeId:" + j27 + " CgiFinderLikeComment init " + qd1Var.m75942xfb822ef2(1));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.rd1 resp = (r45.rd1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("likeId:");
        sb6.append(this.f309765w);
        sb6.append(" [onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(" objectId:");
        r45.qd1 qd1Var = this.f309764v;
        sb6.append(qd1Var.m75942xfb822ef2(1));
        sb6.append(" opType:");
        sb6.append(qd1Var.m75939xb282bd08(3));
        sb6.append(" likeId:");
        sb6.append(qd1Var.m75942xfb822ef2(4));
        sb6.append(" username:");
        sb6.append(qd1Var.m75945x2fec8307(6));
        sb6.append(" action:");
        sb6.append(this.f309762t.f309463d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309763u, sb6.toString());
        hz2.d dVar = hz2.d.f367846a;
        dVar.h(i17, i18, str);
        dVar.d(i17, i18, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d1i));
        dVar.f(i17, i18, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d1h));
    }
}
