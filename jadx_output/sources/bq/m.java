package bq;

/* loaded from: classes2.dex */
public final class m extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.yj0 f23491o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.l60 f23492p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.finder.storage.yj0 localObj, r45.qt2 qt2Var, r45.l60 l60Var, com.tencent.mm.protobuf.g gVar, int i17) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(localObj, "localObj");
        this.f23491o = localObj;
        this.f23492p = l60Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.sy0 sy0Var = new r45.sy0();
        sy0Var.set(1, localObj.Z0());
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        sy0Var.set(2, java.lang.Long.valueOf(localObj.field_feedId));
        java.lang.String str = localObj.field_objectNonceId;
        sy0Var.set(11, str == null ? "" : str);
        sy0Var.set(6, localObj.W0());
        sy0Var.set(3, localObj.j());
        sy0Var.set(5, java.lang.Long.valueOf(localObj.T0()));
        sy0Var.set(8, localObj.getClientId());
        sy0Var.set(10, java.lang.Integer.valueOf(localObj.field_scene));
        sy0Var.set(9, java.lang.Long.valueOf(localObj.Y0()));
        sy0Var.set(7, 0);
        db2.t4 t4Var = db2.t4.f228171a;
        sy0Var.set(12, t4Var.b(3906, qt2Var));
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        long j17 = localObj.field_feedId;
        r45.kv0 kv0Var = (r45.kv0) sy0Var.getCustom(12);
        sy0Var.set(13, ((c61.p2) ybVar).Zi(j17, kv0Var != null ? kv0Var.getInteger(1) : 0, localObj.field_dupFlag));
        sy0Var.set(14, java.lang.Integer.valueOf(localObj.field_actionInfo.getInteger(8) >= 10001 ? 0 : localObj.field_actionInfo.getInteger(8)));
        sy0Var.set(15, localObj.field_actionInfo.getList(9));
        sy0Var.set(20, localObj.field_actionInfo.getList(10));
        sy0Var.set(16, localObj.f128398y0);
        sy0Var.set(17, localObj.f128394l1);
        sy0Var.set(18, java.lang.Integer.valueOf(localObj.w0()));
        sy0Var.set(19, localObj.v0());
        if (l60Var != null) {
            sy0Var.set(18, 4);
            r45.e60 e60Var = new r45.e60();
            e60Var.set(3, l60Var);
            sy0Var.set(19, e60Var);
            com.tencent.mars.xlog.Log.i("FinderCommentCGI", "CgiReplyFinderComment init: ref feed id=" + pm0.v.u(l60Var.getLong(0)) + ", type=" + l60Var.getInteger(1));
        }
        com.tencent.mars.xlog.Log.i("FinderCommentCGI", "commentPastedList = " + sy0Var.getList(16));
        r45.kv0 kv0Var2 = (r45.kv0) sy0Var.getCustom(12);
        r45.kv0 kv0Var3 = (r45.kv0) sy0Var.getCustom(12);
        t4Var.d(kv0Var2, new jz5.o(java.lang.Integer.valueOf(kv0Var3 != null ? kv0Var3.getInteger(1) : 0), java.lang.Long.valueOf(sy0Var.getLong(2)), localObj.field_dupFlag), qt2Var, localObj.f128394l1);
        if (i17 > 0 && gVar != null) {
            sy0Var.set(22, java.lang.Integer.valueOf(i17));
            sy0Var.set(21, gVar);
        }
        if (sy0Var.getInteger(7) == 0) {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f378396f = cu5Var;
            r45.kv0 kv0Var4 = (r45.kv0) sy0Var.getCustom(12);
            if (kv0Var4 != null) {
                kv0Var4.set(2, new com.tencent.mm.protobuf.g(k57Var.toByteArray()));
            }
            w04.l.INSTANCE.b(540999689);
        }
        lVar.f70664a = sy0Var;
        r45.ty0 ty0Var = new r45.ty0();
        ty0Var.set(0, new r45.ie());
        lVar.f70672i = 30000;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercomment";
        lVar.f70667d = 3906;
        lVar.f70665b = ty0Var;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        bu2.j jVar;
        com.tencent.mm.plugin.finder.storage.FinderItem h17;
        r45.ty0 resp = (r45.ty0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderCommentCGI", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = this.f23491o;
        if (i17 == 0 && i18 == 0) {
            jx3.f.INSTANCE.idkeyStat(1279L, 15L, 1L, false);
            yj0Var.u0().setCreatetime(c01.id.a() / 1000);
            yj0Var.u0().setCommentId(resp.getLong(1));
            java.util.LinkedList linkedList = yj0Var.f128398y0;
            if (linkedList != null) {
                linkedList.clear();
            }
            java.util.LinkedList list3 = resp.getList(4);
            if (com.tencent.mm.sdk.platformtools.t8.L0(list3) || (h17 = (jVar = bu2.j.f24534a).h(yj0Var.field_feedId)) == null) {
                i19 = 2;
            } else {
                com.tencent.mars.xlog.Log.i("FinderCommentCGI", "add CommentCount on " + h17.getFeedObject().hashCode() + ", " + h17.getId() + ", " + h17.getCommentCount());
                h17.getCommentList().clear();
                h17.getCommentList().addAll(list3);
                com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent finderExposeInfoChangeEvent = new com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent();
                long j17 = h17.field_id;
                am.cb cbVar = finderExposeInfoChangeEvent.f54272g;
                cbVar.f6343a = j17;
                r45.yl2 yl2Var = new r45.yl2();
                yl2Var.set(0, h17.getCommentList());
                cbVar.f6344b = yl2Var;
                finderExposeInfoChangeEvent.e();
                com.tencent.mars.xlog.Log.i("FinderCommentCGI", "update expose commentList, add");
                jVar.n(h17, bu2.i.f24523d);
                com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
                am.ia iaVar = feedUpdateEvent.f54252g;
                if (iaVar != null) {
                    iaVar.f6918a = h17.field_id;
                }
                if (iaVar == null) {
                    i19 = 2;
                } else {
                    i19 = 2;
                    iaVar.f6919b = 2;
                }
                feedUpdateEvent.e();
            }
            yj0Var.field_state = i19;
            r45.l60 l60Var = this.f23492p;
            if (l60Var != null) {
                com.tencent.mm.autogen.events.FinderPostRefFeedCommentEvent finderPostRefFeedCommentEvent = new com.tencent.mm.autogen.events.FinderPostRefFeedCommentEvent();
                am.uc ucVar = finderPostRefFeedCommentEvent.f54315g;
                if (ucVar != null) {
                    ucVar.f8075c = resp.getLong(1);
                }
                if (ucVar != null) {
                    ucVar.f8073a = l60Var.getLong(0);
                }
                if (ucVar != null) {
                    ucVar.f8074b = yj0Var.field_feedId;
                }
                finderPostRefFeedCommentEvent.e();
            }
            java.util.LinkedList Q0 = yj0Var.Q0();
            if (Q0 != null) {
                java.util.Iterator it = Q0.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.vfs.w6.h(((r45.j60) it.next()).getString(0));
                }
            }
            java.util.LinkedList Q02 = yj0Var.Q0();
            if (Q02 != null) {
                Q02.clear();
            }
            r45.j60 j60Var = (r45.j60) resp.getCustom(5);
            if (j60Var != null) {
                com.tencent.mars.xlog.Log.i("FinderCommentCGI", "update ImageUrl " + j60Var.getString(7) + j60Var.getString(8));
                r45.e60 content_info = yj0Var.u0().getContent_info();
                if (content_info != null && (list2 = content_info.getList(1)) != null) {
                    list2.clear();
                }
                r45.e60 content_info2 = yj0Var.u0().getContent_info();
                if (content_info2 != null && (list = content_info2.getList(1)) != null) {
                    list.add(j60Var);
                }
            }
        } else {
            jx3.f.INSTANCE.idkeyStat(1279L, 16L, 1L, false);
            yj0Var.field_state = 1;
        }
        hz2.d dVar = hz2.d.f286313a;
        dVar.h(i17, i18, str);
        dVar.d(i17, i18, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cpf));
        dVar.f(i17, i18, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cpd));
        com.tencent.mm.autogen.events.FinderCommentChangeEvent finderCommentChangeEvent = new com.tencent.mm.autogen.events.FinderCommentChangeEvent();
        long j18 = yj0Var.field_feedId;
        am.ta taVar = finderCommentChangeEvent.f54263g;
        taVar.f7993a = j18;
        taVar.f7994b = yj0Var.t0();
        int i27 = com.tencent.mm.plugin.finder.storage.wj0.Y;
        taVar.f7995c = i27;
        taVar.f7996d = yj0Var;
        finderCommentChangeEvent.e();
        com.tencent.mars.xlog.Log.i("FinderCommentCGI", "postEvent, feedId:" + yj0Var.field_feedId + ", commentId:" + yj0Var.t0() + ", localId:" + yj0Var.field_localCommentId + ", opType:" + i27);
    }
}
