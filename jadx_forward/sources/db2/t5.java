package db2;

/* loaded from: classes2.dex */
public final class t5 extends az2.v {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309711g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309712h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f309713i;

    /* renamed from: m, reason: collision with root package name */
    public int f309714m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f309715n;

    /* renamed from: o, reason: collision with root package name */
    public final int f309716o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(java.lang.String topic, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.Long l17, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, r45.qt2 qt2Var, java.lang.String str, r45.a34 a34Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(qt2Var);
        java.lang.String str2 = (i18 & 128) != 0 ? null : str;
        r45.a34 a34Var2 = (i18 & 256) != 0 ? null : a34Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
        this.f309713i = "Finder.NetSceneFinderGetTopicFeed";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 817;
        r45.na1 na1Var = new r45.na1();
        na1Var.set(3, java.lang.Integer.valueOf(i17));
        na1Var.set(4, topic);
        na1Var.set(13, java.lang.Long.valueOf(j17));
        na1Var.set(2, gVar2);
        na1Var.set(14, gVar);
        if (l17 != null) {
            l17.longValue();
            na1Var.set(7, java.lang.Long.valueOf(l17.longValue()));
        }
        na1Var.set(18, 1);
        na1Var.set(19, qt2Var != null ? qt2Var.m75945x2fec8307(18) : null);
        db2.t4 t4Var = db2.t4.f309704a;
        na1Var.set(1, t4Var.b(817, qt2Var));
        na1Var.set(12, t4Var.n());
        M(na1Var, str2);
        db2.t4.i(t4Var, (r45.kv0) na1Var.m75936x14adae67(1), kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0), java.lang.Long.valueOf(na1Var.m75942xfb822ef2(7)))), null, 4, null);
        t4Var.k((r45.kv0) na1Var.m75936x14adae67(1), a34Var2);
        lVar.f152197a = na1Var;
        lVar.f152200d = 817;
        lVar.f152198b = new r45.oa1();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f309711g = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word init: " + topic + ", " + i17 + ", " + j17 + ", " + l17);
        this.f309716o = i17;
    }

    @Override // az2.v, az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        super.J(i17, i18, i19, str, this.f309711g, bArr);
        java.lang.String str2 = this.f309713i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "pullType " + this.f309714m + " selectedTag" + this.f309715n + ' ' + hc2.o0.k(P()));
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309711g.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
            r45.oa1 oa1Var = (r45.oa1) fVar;
            yr2.a aVar = yr2.a.f546192a;
            r45.sq2 sq2Var = (r45.sq2) oa1Var.m75936x14adae67(9);
            java.util.LinkedList m75941xfb821914 = oa1Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
            aVar.b(sq2Var, m75941xfb821914, 817);
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309712h;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        r45.qt2 qt2Var = this.f97687d;
        if (qt2Var != null) {
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : P()) {
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(c19792x256d2725, qt2Var.m75939xb282bd08(5), null);
            }
        }
    }

    @Override // az2.v
    public java.util.List K(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        java.util.LinkedList P = P();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(P, 10));
        java.util.Iterator it = P.iterator();
        while (it.hasNext()) {
            arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next(), 0, 2, null));
        }
        return arrayList;
    }

    @Override // az2.v
    public long L() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309711g.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListRequest");
        r45.kv0 kv0Var = (r45.kv0) ((r45.na1) fVar).m75936x14adae67(1);
        if (kv0Var != null) {
            return kv0Var.m75942xfb822ef2(5);
        }
        return 0L;
    }

    public final void M(r45.na1 na1Var, java.lang.String str) {
        if (str != null) {
            byte[] bytes = str.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            na1Var.set(17, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length));
        }
    }

    public final r45.o03 N() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309711g.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
        r45.r03 r03Var = (r45.r03) ((r45.oa1) fVar).m75936x14adae67(5);
        if (r03Var != null) {
            return (r45.o03) r03Var.m75936x14adae67(12);
        }
        return null;
    }

    public final int O() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309711g.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
        return ((r45.oa1) fVar).m75939xb282bd08(3);
    }

    public final java.util.LinkedList P() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309711g.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListResponse");
        java.util.LinkedList m75941xfb821914 = ((r45.oa1) fVar).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        return m75941xfb821914;
    }

    public final int Q() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309711g.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListRequest");
        return ((r45.na1) fVar).m75939xb282bd08(3);
    }

    public final int R() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309711g.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetTopicListRequest");
        return ((r45.na1) fVar).m75939xb282bd08(16);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        r45.qt2 qt2Var = this.f97687d;
        o3Var.f206748n.put(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0, java.lang.Long.valueOf(c01.id.c()));
        this.f309712h = u0Var;
        return mo9409x10f9447a(sVar, this.f309711g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 817;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(java.lang.String topic, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.Long l17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, r45.xu2 xu2Var, r45.qt2 qt2Var, java.lang.String str, r45.a34 a34Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(qt2Var);
        java.lang.String str2 = (i17 & 128) != 0 ? null : str;
        r45.a34 a34Var2 = (i17 & 256) != 0 ? null : a34Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
        this.f309713i = "Finder.NetSceneFinderGetTopicFeed";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 817;
        r45.na1 na1Var = new r45.na1();
        na1Var.set(3, 5);
        na1Var.set(4, topic);
        na1Var.set(13, java.lang.Long.valueOf(j17));
        na1Var.set(2, gVar2);
        na1Var.set(14, gVar);
        if (l17 != null) {
            l17.longValue();
            na1Var.set(7, java.lang.Long.valueOf(l17.longValue()));
        }
        na1Var.set(10, xu2Var);
        db2.t4 t4Var = db2.t4.f309704a;
        na1Var.set(1, t4Var.b(817, qt2Var));
        na1Var.set(19, qt2Var != null ? qt2Var.m75945x2fec8307(18) : null);
        na1Var.set(18, 1);
        na1Var.set(12, t4Var.n());
        M(na1Var, str2);
        db2.t4.i(t4Var, (r45.kv0) na1Var.m75936x14adae67(1), kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0), java.lang.Long.valueOf(na1Var.m75942xfb822ef2(7)))), null, 4, null);
        t4Var.k((r45.kv0) na1Var.m75936x14adae67(1), a34Var2);
        lVar.f152197a = na1Var;
        lVar.f152200d = 817;
        lVar.f152198b = new r45.oa1();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f309711g = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word init: " + topic + ", " + l17);
        this.f309716o = this.f309716o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(java.lang.String topic, long j17, java.lang.Long l17, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3, r45.a34 a34Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(qt2Var);
        int i19;
        int i27;
        java.lang.String str3 = null;
        java.lang.String str4 = (i18 & 64) != 0 ? null : str;
        java.lang.String str5 = (i18 & 128) != 0 ? null : str2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = (i18 & 256) != 0 ? null : gVar2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = (i18 & 512) != 0 ? null : gVar3;
        r45.a34 a34Var2 = (i18 & 1024) != 0 ? null : a34Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
        this.f309713i = "Finder.NetSceneFinderGetTopicFeed";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 817;
        r45.na1 na1Var = new r45.na1();
        na1Var.set(3, java.lang.Integer.valueOf(i17));
        na1Var.set(4, topic);
        na1Var.set(13, java.lang.Long.valueOf(j17));
        na1Var.set(2, gVar);
        if (l17 != null) {
            l17.longValue();
            na1Var.set(7, java.lang.Long.valueOf(l17.longValue()));
        }
        if (str5 != null) {
            str3 = str5;
        } else if (qt2Var != null) {
            str3 = qt2Var.m75945x2fec8307(18);
        }
        na1Var.set(19, str3);
        na1Var.set(18, 1);
        db2.t4 t4Var = db2.t4.f309704a;
        na1Var.set(1, t4Var.b(817, qt2Var));
        na1Var.set(12, t4Var.n());
        na1Var.set(21, gVar4);
        na1Var.set(14, gVar5);
        M(na1Var, str4);
        r45.kv0 kv0Var = (r45.kv0) na1Var.m75936x14adae67(1);
        if (qt2Var != null) {
            i19 = 7;
            i27 = qt2Var.m75939xb282bd08(7);
        } else {
            i19 = 7;
            i27 = 0;
        }
        db2.t4.i(t4Var, kv0Var, kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(i27), java.lang.Long.valueOf(na1Var.m75942xfb822ef2(i19)))), null, 4, null);
        t4Var.k((r45.kv0) na1Var.m75936x14adae67(1), a34Var2);
        lVar.f152197a = na1Var;
        lVar.f152200d = 817;
        lVar.f152198b = new r45.oa1();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f309711g = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word init: " + topic + ", " + l17 + " finderUsername=" + str5);
        this.f309716o = i17;
    }

    public t5(int i17, long j17, java.lang.Long l17, java.lang.String str, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var, java.lang.String str2, r45.a34 a34Var) {
        super(qt2Var);
        this.f309713i = "Finder.NetSceneFinderGetTopicFeed";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 817;
        r45.na1 na1Var = new r45.na1();
        na1Var.set(3, java.lang.Integer.valueOf(i17));
        na1Var.set(13, java.lang.Long.valueOf(j17));
        na1Var.set(4, java.lang.String.valueOf(j17));
        if (l17 != null) {
            l17.longValue();
            na1Var.set(7, java.lang.Long.valueOf(l17.longValue()));
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            na1Var.set(11, 4);
        }
        na1Var.set(15, str == null ? "" : str);
        na1Var.set(2, gVar);
        na1Var.set(16, java.lang.Integer.valueOf(i18));
        na1Var.set(19, qt2Var != null ? qt2Var.m75945x2fec8307(18) : null);
        db2.t4 t4Var = db2.t4.f309704a;
        na1Var.set(1, t4Var.b(817, qt2Var));
        na1Var.set(18, 1);
        na1Var.set(12, t4Var.n());
        M(na1Var, str2);
        db2.t4.i(t4Var, (r45.kv0) na1Var.m75936x14adae67(1), kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0), java.lang.Long.valueOf(na1Var.m75942xfb822ef2(7)))), null, 4, null);
        t4Var.k((r45.kv0) na1Var.m75936x14adae67(1), a34Var);
        lVar.f152197a = na1Var;
        lVar.f152200d = 817;
        lVar.f152198b = new r45.oa1();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f309711g = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get eventTopic init eventTopicId:" + j17 + ", " + l17 + " encryptedTopicId:" + str + " innerTabType:" + i18 + " pullType:" + this.f309714m);
        this.f309716o = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(java.lang.String topic, java.lang.Long l17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.xu2 xu2Var, r45.qt2 qt2Var, int i17, java.lang.String str, int i18, r45.a34 a34Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topic, "topic");
        this.f309713i = "Finder.NetSceneFinderGetTopicFeed";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 817;
        r45.na1 na1Var = new r45.na1();
        na1Var.set(3, 1);
        na1Var.set(4, topic);
        na1Var.set(2, gVar);
        if (l17 != null) {
            l17.longValue();
            na1Var.set(7, java.lang.Long.valueOf(l17.longValue()));
        }
        na1Var.set(18, 1);
        na1Var.set(10, xu2Var);
        na1Var.set(16, java.lang.Integer.valueOf(i17));
        na1Var.set(19, qt2Var != null ? qt2Var.m75945x2fec8307(18) : null);
        db2.t4 t4Var = db2.t4.f309704a;
        na1Var.set(1, t4Var.b(817, qt2Var));
        na1Var.set(20, java.lang.Integer.valueOf(i18));
        na1Var.set(12, t4Var.n());
        M(na1Var, str);
        db2.t4.i(t4Var, (r45.kv0) na1Var.m75936x14adae67(1), kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0), java.lang.Long.valueOf(na1Var.m75942xfb822ef2(7)))), null, 4, null);
        t4Var.k((r45.kv0) na1Var.m75936x14adae67(1), a34Var);
        lVar.f152197a = na1Var;
        lVar.f152200d = 817;
        lVar.f152198b = new r45.oa1();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f309711g = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word init: " + topic + ", " + l17);
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderGetTopicFeed", "NetSceneFinderGetTopicFeed get word req: " + na1Var.mo12245xcc313de3());
        }
        this.f309716o = this.f309716o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(java.lang.String poiClassifyId, float f17, float f18, java.lang.Long l17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, r45.xn5 xn5Var, r45.xu2 xu2Var, r45.qt2 qt2Var, java.lang.String str, r45.a34 a34Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiClassifyId, "poiClassifyId");
        this.f309713i = "Finder.NetSceneFinderGetTopicFeed";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 817;
        r45.na1 na1Var = new r45.na1();
        na1Var.set(3, 2);
        na1Var.set(4, poiClassifyId);
        na1Var.set(5, java.lang.Float.valueOf(f17));
        na1Var.set(6, java.lang.Float.valueOf(f18));
        na1Var.set(2, gVar);
        if (l17 != null) {
            l17.longValue();
            na1Var.set(7, java.lang.Long.valueOf(l17.longValue()));
        }
        na1Var.set(10, xu2Var);
        na1Var.set(11, 1);
        if (xu2Var != null) {
            na1Var.set(11, 2);
        }
        na1Var.set(19, qt2Var != null ? qt2Var.m75945x2fec8307(18) : null);
        na1Var.set(18, 1);
        na1Var.set(8, java.lang.Integer.valueOf(i17));
        M(na1Var, str);
        if (xn5Var != null) {
            r45.ao6 ao6Var = new r45.ao6();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList m75941xfb821914 = xn5Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getTopic_list(...)");
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                linkedList.add(java.lang.Long.valueOf(((r45.r03) it.next()).m75942xfb822ef2(1)));
            }
            ao6Var.set(0, linkedList);
            na1Var.set(9, ao6Var);
            this.f309715n = ((r45.r03) xn5Var.m75941xfb821914(0).get(0)).m75945x2fec8307(0);
        }
        db2.t4 t4Var = db2.t4.f309704a;
        na1Var.set(12, t4Var.n());
        na1Var.set(1, t4Var.b(817, qt2Var));
        db2.t4.i(t4Var, (r45.kv0) na1Var.m75936x14adae67(1), kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0), java.lang.Long.valueOf(na1Var.m75942xfb822ef2(7)))), null, 4, null);
        t4Var.k((r45.kv0) na1Var.m75936x14adae67(1), a34Var);
        lVar.f152197a = na1Var;
        lVar.f152200d = 817;
        lVar.f152198b = new r45.oa1();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergettopiclist";
        this.f309711g = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309713i, "NetSceneFinderGetTopicFeed get poi init: " + poiClassifyId + ' ' + l17);
        this.f309716o = this.f309716o;
    }
}
