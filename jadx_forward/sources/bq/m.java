package bq;

/* loaded from: classes2.dex */
public final class m extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 f105024o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.l60 f105025p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 localObj, r45.qt2 qt2Var, r45.l60 l60Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localObj, "localObj");
        this.f105024o = localObj;
        this.f105025p = l60Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.sy0 sy0Var = new r45.sy0();
        sy0Var.set(1, localObj.Z0());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        sy0Var.set(2, java.lang.Long.valueOf(localObj.f68959xf9a02e3e));
        java.lang.String str = localObj.f68962x2812d6a6;
        sy0Var.set(11, str == null ? "" : str);
        sy0Var.set(6, localObj.W0());
        sy0Var.set(3, localObj.j());
        sy0Var.set(5, java.lang.Long.valueOf(localObj.T0()));
        sy0Var.set(8, localObj.m60786xb1ff73bc());
        sy0Var.set(10, java.lang.Integer.valueOf(localObj.f68964x29cbf907));
        sy0Var.set(9, java.lang.Long.valueOf(localObj.Y0()));
        sy0Var.set(7, 0);
        db2.t4 t4Var = db2.t4.f309704a;
        sy0Var.set(12, t4Var.b(3906, qt2Var));
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        long j17 = localObj.f68959xf9a02e3e;
        r45.kv0 kv0Var = (r45.kv0) sy0Var.m75936x14adae67(12);
        sy0Var.set(13, ((c61.p2) ybVar).Zi(j17, kv0Var != null ? kv0Var.m75939xb282bd08(1) : 0, localObj.f68957xec748fc6));
        sy0Var.set(14, java.lang.Integer.valueOf(localObj.f68953x27838069.m75939xb282bd08(8) >= 10001 ? 0 : localObj.f68953x27838069.m75939xb282bd08(8)));
        sy0Var.set(15, localObj.f68953x27838069.m75941xfb821914(9));
        sy0Var.set(20, localObj.f68953x27838069.m75941xfb821914(10));
        sy0Var.set(16, localObj.f209931y0);
        sy0Var.set(17, localObj.f209927l1);
        sy0Var.set(18, java.lang.Integer.valueOf(localObj.w0()));
        sy0Var.set(19, localObj.v0());
        if (l60Var != null) {
            sy0Var.set(18, 4);
            r45.e60 e60Var = new r45.e60();
            e60Var.set(3, l60Var);
            sy0Var.set(19, e60Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentCGI", "CgiReplyFinderComment init: ref feed id=" + pm0.v.u(l60Var.m75942xfb822ef2(0)) + ", type=" + l60Var.m75939xb282bd08(1));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentCGI", "commentPastedList = " + sy0Var.m75941xfb821914(16));
        r45.kv0 kv0Var2 = (r45.kv0) sy0Var.m75936x14adae67(12);
        r45.kv0 kv0Var3 = (r45.kv0) sy0Var.m75936x14adae67(12);
        t4Var.d(kv0Var2, new jz5.o(java.lang.Integer.valueOf(kv0Var3 != null ? kv0Var3.m75939xb282bd08(1) : 0), java.lang.Long.valueOf(sy0Var.m75942xfb822ef2(2)), localObj.f68957xec748fc6), qt2Var, localObj.f209927l1);
        if (i17 > 0 && gVar != null) {
            sy0Var.set(22, java.lang.Integer.valueOf(i17));
            sy0Var.set(21, gVar);
        }
        if (sy0Var.m75939xb282bd08(7) == 0) {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f459929f = cu5Var;
            r45.kv0 kv0Var4 = (r45.kv0) sy0Var.m75936x14adae67(12);
            if (kv0Var4 != null) {
                kv0Var4.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(k57Var.mo14344x5f01b1f6()));
            }
            w04.l.INSTANCE.b(540999689);
        }
        lVar.f152197a = sy0Var;
        r45.ty0 ty0Var = new r45.ty0();
        ty0Var.set(0, new r45.ie());
        lVar.f152205i = 30000;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercomment";
        lVar.f152200d = 3906;
        lVar.f152198b = ty0Var;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        bu2.j jVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17;
        r45.ty0 resp = (r45.ty0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentCGI", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = this.f105024o;
        if (i17 == 0 && i18 == 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 15L, 1L, false);
            yj0Var.u0().m76115x6e101bcb(c01.id.a() / 1000);
            yj0Var.u0().m76109x2a50d98(resp.m75942xfb822ef2(1));
            java.util.LinkedList linkedList = yj0Var.f209931y0;
            if (linkedList != null) {
                linkedList.clear();
            }
            java.util.LinkedList m75941xfb8219143 = resp.m75941xfb821914(4);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(m75941xfb8219143) || (h17 = (jVar = bu2.j.f106067a).h(yj0Var.f68959xf9a02e3e)) == null) {
                i19 = 2;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentCGI", "add CommentCount on " + h17.getFeedObject().hashCode() + ", " + h17.m59251x5db1b11() + ", " + h17.m59216x8ed22866());
                h17.m59217x57341267().clear();
                h17.m59217x57341267().addAll(m75941xfb8219143);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5467x4cfefe32 c5467x4cfefe32 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5467x4cfefe32();
                long j17 = h17.f66939xc8a07680;
                am.cb cbVar = c5467x4cfefe32.f135805g;
                cbVar.f87876a = j17;
                r45.yl2 yl2Var = new r45.yl2();
                yl2Var.set(0, h17.m59217x57341267());
                cbVar.f87877b = yl2Var;
                c5467x4cfefe32.e();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentCGI", "update expose commentList, add");
                jVar.n(h17, bu2.i.f106056d);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
                am.ia iaVar = c5445x963cab3.f135785g;
                if (iaVar != null) {
                    iaVar.f88451a = h17.f66939xc8a07680;
                }
                if (iaVar == null) {
                    i19 = 2;
                } else {
                    i19 = 2;
                    iaVar.f88452b = 2;
                }
                c5445x963cab3.e();
            }
            yj0Var.f68965x29d3a50c = i19;
            r45.l60 l60Var = this.f105025p;
            if (l60Var != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5520x1f521b06 c5520x1f521b06 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5520x1f521b06();
                am.uc ucVar = c5520x1f521b06.f135848g;
                if (ucVar != null) {
                    ucVar.f89608c = resp.m75942xfb822ef2(1);
                }
                if (ucVar != null) {
                    ucVar.f89606a = l60Var.m75942xfb822ef2(0);
                }
                if (ucVar != null) {
                    ucVar.f89607b = yj0Var.f68959xf9a02e3e;
                }
                c5520x1f521b06.e();
            }
            java.util.LinkedList Q0 = yj0Var.Q0();
            if (Q0 != null) {
                java.util.Iterator it = Q0.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.vfs.w6.h(((r45.j60) it.next()).m75945x2fec8307(0));
                }
            }
            java.util.LinkedList Q02 = yj0Var.Q0();
            if (Q02 != null) {
                Q02.clear();
            }
            r45.j60 j60Var = (r45.j60) resp.m75936x14adae67(5);
            if (j60Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentCGI", "update ImageUrl " + j60Var.m75945x2fec8307(7) + j60Var.m75945x2fec8307(8));
                r45.e60 m76061x92825f2a = yj0Var.u0().m76061x92825f2a();
                if (m76061x92825f2a != null && (m75941xfb8219142 = m76061x92825f2a.m75941xfb821914(1)) != null) {
                    m75941xfb8219142.clear();
                }
                r45.e60 m76061x92825f2a2 = yj0Var.u0().m76061x92825f2a();
                if (m76061x92825f2a2 != null && (m75941xfb821914 = m76061x92825f2a2.m75941xfb821914(1)) != null) {
                    m75941xfb821914.add(j60Var);
                }
            }
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 16L, 1L, false);
            yj0Var.f68965x29d3a50c = 1;
        }
        hz2.d dVar = hz2.d.f367846a;
        dVar.h(i17, i18, str);
        dVar.d(i17, i18, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cpf));
        dVar.f(i17, i18, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cpd));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1 c5457xd6bc6fd1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5457xd6bc6fd1();
        long j18 = yj0Var.f68959xf9a02e3e;
        am.ta taVar = c5457xd6bc6fd1.f135796g;
        taVar.f89526a = j18;
        taVar.f89527b = yj0Var.t0();
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.Y;
        taVar.f89528c = i27;
        taVar.f89529d = yj0Var;
        c5457xd6bc6fd1.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentCGI", "postEvent, feedId:" + yj0Var.f68959xf9a02e3e + ", commentId:" + yj0Var.t0() + ", localId:" + yj0Var.f68961xf609be94 + ", opType:" + i27);
    }
}
