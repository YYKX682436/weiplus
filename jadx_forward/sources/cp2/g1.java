package cp2;

/* loaded from: classes2.dex */
public final class g1 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cp2.q1 f302342a;

    public g1(cp2.q1 q1Var) {
        this.f302342a = q1Var;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        cp2.q1 q1Var;
        java.util.Iterator it;
        int intValue;
        java.lang.String s07;
        r45.dd2 dd2Var;
        r45.s92 s92Var;
        java.lang.Object tag;
        java.lang.Object tag2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        java.lang.String str = "NearbyLiveViewCallback";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveViewCallback", "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it6 = recordsSet.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            q1Var = this.f302342a;
            if (!hasNext) {
                break;
            }
            in5.j jVar = (in5.j) it6.next();
            in5.c cVar = jVar.f374603a;
            if (cVar instanceof so2.h1) {
                r45.ni4 ni4Var = new r45.ni4();
                in5.c cVar2 = jVar.f374603a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedLive");
                so2.h1 h1Var = (so2.h1) cVar2;
                ni4Var.set(0, java.lang.Long.valueOf(h1Var.mo2128x1ed62e84()));
                so2.h3.f491925d.f(ni4Var, q1Var.f302417f.mo122374x8fadefe3(), -1);
                ni4Var.set(5, java.lang.Integer.valueOf((int) jVar.f374606d));
                ni4Var.set(6, java.lang.Integer.valueOf(jVar.f374607e));
                ni4Var.set(4, h1Var.g0());
                android.view.View view = jVar.f374608f;
                if (view == null || (tag2 = view.getTag(com.p314xaae8f345.mm.R.id.f567633k62)) == null) {
                    java.lang.Integer num = 0;
                    intValue = num.intValue();
                } else {
                    long longValue = tag2 instanceof java.lang.Long ? ((java.lang.Long) tag2).longValue() : 0L;
                    intValue = java.lang.Integer.valueOf(longValue != 0 ? (int) (android.os.SystemClock.elapsedRealtime() - longValue) : 0).intValue();
                }
                ni4Var.set(7, java.lang.Integer.valueOf(intValue));
                android.view.View view2 = jVar.f374608f;
                ni4Var.set(8, java.lang.Boolean.valueOf((view2 == null || (tag = view2.getTag(com.p314xaae8f345.mm.R.id.k67)) == null) ? false : java.lang.Boolean.valueOf(((java.lang.Boolean) tag).booleanValue()).booleanValue()));
                ni4Var.set(9, java.lang.Long.valueOf(jVar.f374604b));
                ni4Var.set(13, java.lang.Long.valueOf(jVar.f374604b));
                ni4Var.set(12, java.lang.Integer.valueOf(ni4Var.m75939xb282bd08(5)));
                cq2.r rVar = cq2.r.f302977a;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = q1Var.f302415d;
                int i17 = jVar.f374607e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar2;
                r45.fd1 fd1Var = cp2.b.f302308x;
                int m75939xb282bd08 = (fd1Var == null || (s92Var = (r45.s92) fd1Var.m75936x14adae67(11)) == null) ? 0 : s92Var.m75939xb282bd08(0);
                int q17 = q1Var.q();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301 = q1Var.f302416e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd = abstractC14499x6ba3301 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) abstractC14499x6ba3301 : null;
                org.json.JSONObject d17 = rVar.d(abstractActivityC21394xb3d2c0cf, i17, abstractC14490x69736cb5, m75939xb282bd08, q17, (c14521x246f2bd == null || (dd2Var = c14521x246f2bd.f203053t) == null) ? 0 : dd2Var.m75939xb282bd08(0), q1Var.q() != 0, false);
                cp2.c cVar3 = q1Var.f302417f;
                java.lang.String commentScene = java.lang.String.valueOf(cVar3.mo122374x8fadefe3());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
                sp2.i iVar = sp2.i.f492580a;
                it = it6;
                java.lang.String str2 = str;
                long j17 = jVar.f374607e;
                ml2.x1 x1Var = ml2.x1.f409751y;
                d17.put("exp_time", (int) jVar.f374606d);
                java.lang.String jSONObject = d17.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                iVar.a(h1Var, j17, x1Var, commentScene, jSONObject);
                linkedList.add(ni4Var);
                q1Var.f302427s.h(h1Var, jVar.f374607e, ml2.x1.f409735f, java.lang.String.valueOf(cVar3.mo122374x8fadefe3()), (abstractC14499x6ba3301 == null || (s07 = abstractC14499x6ba3301.s0()) == null) ? "" : s07, q1Var.f302429u.a(jVar.f374607e, jVar.f374608f, "onExpose"));
                str = str2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onExposeTimeRecorded pos:" + jVar.f374607e + " feedId: " + ni4Var.m75942xfb822ef2(0) + "  startTime: " + jVar.f374604b + " auto_play_time_ms:" + ni4Var.m75939xb282bd08(7) + " auto_play_with_sound:" + ni4Var.m75933x41a8a7f2(8) + " exposeTime:" + jVar.f374606d + " nick:" + h1Var.getFeedObject().getFeedObject().m76801x8010e5e4());
            } else {
                it = it6;
                if (cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) {
                    java.lang.String m75945x2fec8307 = q1Var.a().m75945x2fec8307(2);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6464xd152d07e c6464xd152d07e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6464xd152d07e();
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    c6464xd152d07e.f138070d = java.lang.System.currentTimeMillis();
                    c6464xd152d07e.u("");
                    c6464xd152d07e.p(q1Var.f302429u.a(jVar.f374607e, jVar.f374608f, "onExpose"));
                    c6464xd152d07e.A("");
                    c6464xd152d07e.y("");
                    java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
                    if (Ri == null) {
                        Ri = "";
                    }
                    c6464xd152d07e.w(Ri);
                    c6464xd152d07e.r(q1Var.a().m75945x2fec8307(1));
                    c6464xd152d07e.q(java.lang.String.valueOf(q1Var.a().m75939xb282bd08(5)));
                    c6464xd152d07e.f138078l = c6464xd152d07e.b("TabContextID", m75945x2fec8307, true);
                    c6464xd152d07e.x("");
                    c6464xd152d07e.v("");
                    c6464xd152d07e.f138081o = c6464xd152d07e.b("ref_commentscene", "", true);
                    c6464xd152d07e.s("all_my_follow");
                    c6464xd152d07e.t("");
                    c6464xd152d07e.z(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
                    c6464xd152d07e.k();
                }
            }
            it6 = it;
        }
        rq2.v.f480424a.g(q1Var.f302417f.mo122374x8fadefe3(), linkedList);
        if (cp2.b.f302307w) {
            return;
        }
        so2.h3.f491925d.d(linkedList);
    }

    @Override // in5.p
    public void d(in5.j item) {
        r45.dd2 dd2Var;
        r45.s92 s92Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        in5.c cVar = item.f374603a;
        if (cVar instanceof so2.h1) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.ni4 ni4Var = new r45.ni4();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedLive");
            so2.h1 h1Var = (so2.h1) cVar;
            ni4Var.set(0, java.lang.Long.valueOf(h1Var.mo2128x1ed62e84()));
            ni4Var.set(5, java.lang.Integer.valueOf((int) item.f374604b));
            ni4Var.set(9, java.lang.Long.valueOf(item.f374604b));
            ni4Var.set(6, java.lang.Integer.valueOf(item.f374607e));
            ni4Var.set(4, h1Var.g0());
            ni4Var.set(11, 2);
            android.view.View view = item.f374608f;
            if (view != null) {
                view.setTag(com.p314xaae8f345.mm.R.id.k67, java.lang.Boolean.FALSE);
            }
            android.view.View view2 = item.f374608f;
            if (view2 != null) {
                view2.setTag(com.p314xaae8f345.mm.R.id.f567633k62, 0L);
            }
            so2.h3 h3Var = so2.h3.f491925d;
            cp2.q1 q1Var = this.f302342a;
            h3Var.f(ni4Var, q1Var.f302417f.mo122374x8fadefe3(), -1);
            rq2.v vVar = rq2.v.f480424a;
            cp2.c cVar2 = q1Var.f302417f;
            ((java.util.LinkedList) vVar.a(cVar2.mo122374x8fadefe3())).add(ni4Var);
            linkedList.add(ni4Var);
            if (!cp2.b.f302307w) {
                h3Var.d(linkedList);
            }
            cq2.r rVar = cq2.r.f302977a;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = q1Var.f302415d;
            int i17 = item.f374607e;
            so2.j5 j5Var = (so2.j5) cVar;
            r45.fd1 fd1Var = cp2.b.f302308x;
            int m75939xb282bd08 = (fd1Var == null || (s92Var = (r45.s92) fd1Var.m75936x14adae67(11)) == null) ? 0 : s92Var.m75939xb282bd08(0);
            int q17 = q1Var.q();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301 = q1Var.f302416e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd = abstractC14499x6ba3301 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) abstractC14499x6ba3301 : null;
            org.json.JSONObject d17 = rVar.d(abstractActivityC21394xb3d2c0cf, i17, j5Var, m75939xb282bd08, q17, (c14521x246f2bd == null || (dd2Var = c14521x246f2bd.f203053t) == null) ? 0 : dd2Var.m75939xb282bd08(0), q1Var.q() != 0, false);
            sp2.i iVar = sp2.i.f492580a;
            long j17 = item.f374607e;
            ml2.x1 x1Var = ml2.x1.f409750x;
            java.lang.String valueOf = java.lang.String.valueOf(cVar2.mo122374x8fadefe3());
            java.lang.String jSONObject = d17.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            iVar.a(h1Var, j17, x1Var, valueOf, jSONObject);
            ni4Var.m75942xfb822ef2(0);
            h1Var.getFeedObject().getFeedObject().m76801x8010e5e4();
        }
    }
}
