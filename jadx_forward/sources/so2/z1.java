package so2;

/* loaded from: classes10.dex */
public final class z1 {

    /* renamed from: a */
    public static final so2.z1 f492263a = new so2.z1();

    public static void c(so2.z1 z1Var, r45.qt2 contextObj, java.lang.String finderUser, int i17, long j17, java.lang.String str, boolean z17, int i18, r45.o72 o72Var, java.lang.Integer num, long j18, int i19, java.lang.Object obj) {
        boolean z18 = (i19 & 32) != 0 ? false : z17;
        int i27 = (i19 & 64) != 0 ? 0 : i18;
        r45.o72 o72Var2 = (i19 & 128) != 0 ? null : o72Var;
        java.lang.Integer num2 = (i19 & 256) != 0 ? 0 : num;
        long j19 = (i19 & 512) != 0 ? 0L : j18;
        z1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUser, "finderUser");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("follow event commentScene=");
        sb6.append(contextObj.m75939xb282bd08(7));
        sb6.append(", user=");
        sb6.append(finderUser);
        sb6.append(", opType=");
        sb6.append(i17);
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(j17));
        sb6.append(", commentId=");
        sb6.append(pm0.v.u(j19));
        sb6.append(" form ");
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFollowLogic", sb6.toString());
        jx3.f.INSTANCE.mo68477x336bdfd8(1278L, i17 == 2 ? 5L : 4L, 1L, false);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).xj(contextObj, contextObj.m75942xfb822ef2(6), str, finderUser, i17 == 2 ? 1 : 2);
        new db2.m0(new nv2.a0(finderUser, i17, j17, str, contextObj, false, i27, null, o72Var2, num2, null, null, 0, j19, 0, null, null, null, 253056, null), z18).l().K(new so2.x1(finderUser, i17, contextObj));
    }

    public static void d(so2.z1 z1Var, r45.qt2 contextObj, java.lang.String finderUser, int i17, long j17, java.lang.String str, boolean z17, java.lang.String str2, r45.o72 o72Var, java.lang.Integer num, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, int i19, r45.p31 p31Var, java.lang.String str3, java.lang.String str4, int i27, java.lang.Object obj) {
        long j18 = (i27 & 8) != 0 ? 0L : j17;
        boolean z18 = (i27 & 32) != 0 ? false : z17;
        java.lang.String participantFinderUsername = (i27 & 64) != 0 ? "" : str2;
        r45.o72 o72Var2 = (i27 & 128) != 0 ? null : o72Var;
        java.lang.Integer num2 = (i27 & 256) != 0 ? 0 : num;
        int i28 = (i27 & 512) != 0 ? 0 : i18;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = (i27 & 1024) != 0 ? null : gVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = (i27 & 2048) != 0 ? null : gVar2;
        int i29 = (i27 & 4096) != 0 ? 0 : i19;
        r45.p31 newLifeReportInfo = (i27 & 8192) != 0 ? new r45.p31() : p31Var;
        java.lang.String nonceId = (i27 & 16384) != 0 ? "" : str3;
        java.lang.String micId = (i27 & 32768) != 0 ? "" : str4;
        z1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUser, "finderUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(participantFinderUsername, "participantFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newLifeReportInfo, "newLifeReportInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micId, "micId");
        java.lang.String str5 = micId;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("follow event commentScene:");
        sb6.append(contextObj.m75939xb282bd08(7));
        sb6.append(" user:");
        sb6.append(finderUser);
        sb6.append(" opType: ");
        sb6.append(i17);
        sb6.append(" participantFinderUsername:");
        sb6.append(participantFinderUsername);
        sb6.append(" form ");
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        sb6.append(" enterType:");
        sb6.append(i28);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFollowLogic", sb6.toString());
        jx3.f.INSTANCE.mo68477x336bdfd8(1278L, i17 == 2 ? 5L : 4L, 1L, false);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).xj(contextObj, contextObj.m75942xfb822ef2(6), str, finderUser, i17 == 2 ? 1 : 2);
        nv2.d0.f422003e.a(finderUser, i17, j18, str, contextObj, z18, i28, participantFinderUsername, o72Var2, num2, gVar3, gVar4, i29, newLifeReportInfo, nonceId, str5);
        if (i17 == 2) {
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            qs5.e eVar = qs5.e.f447962d;
            com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4 v4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var;
            v4Var.getClass();
            rl2.a aVar = (rl2.a) ((jz5.n) v4Var.f148533x).mo141623x754a37bb();
            aVar.getClass();
            java.lang.String y07 = aVar.y0(finderUser, eVar);
            synchronized (aVar) {
                ce2.a aVar2 = new ce2.a();
                aVar2.f67096xa66fc07f = y07;
                aVar2.f67097x27886e88 = java.lang.System.currentTimeMillis();
                aVar.mo11260x413cb2b4(aVar2);
            }
        }
    }

    public final void a(android.content.Context context, r45.qt2 contextObj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, int i17, boolean z17, int i18) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        r45.xk m59211x37f6d02b = feed.getFeedObject().m59211x37f6d02b();
        if (m59211x37f6d02b != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            long m75942xfb822ef2 = contextObj.m75942xfb822ef2(6);
            java.lang.String m75945x2fec8307 = contextObj.m75945x2fec8307(21);
            ya2.b2 contact = feed.getContact();
            o3Var.xj(contextObj, m75942xfb822ef2, m75945x2fec8307, contact != null ? contact.D0() : "", i17 == 2 ? 1 : 2);
            o25.a aVar = new o25.a();
            aVar.f424002g = false;
            java.lang.String m76829x97edf6c0 = feed.getFeedObject().getFeedObject().m76829x97edf6c0();
            aVar.f423998c = m76829x97edf6c0 == null || m76829x97edf6c0.length() == 0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(feed.getFeedObject().m59251x5db1b11(), feed.w(), contextObj.m75939xb282bd08(5)) : feed.getFeedObject().getFeedObject().m76829x97edf6c0();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("commentscene", contextObj.m75939xb282bd08(5));
            jSONObject.put("clicktabcontextid", contextObj.m75945x2fec8307(2));
            jSONObject.put("findercontextid", contextObj.m75945x2fec8307(1));
            jSONObject.put("feedid", pm0.v.u(feed.mo2128x1ed62e84()));
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            aVar.f423999d = r26.i0.t(jSONObject2, ",", ";", false);
            aVar.f424003h = false;
            ((r35.o) ((r35.p) ((o25.o1) i95.n0.c(o25.o1.class))).Ai(context, m59211x37f6d02b.m75945x2fec8307(0), 212, true, new so2.w1(feed), aVar)).f();
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            ya2.b2 contact2 = feed.getContact();
            c(this, contextObj, contact2 != null ? contact2.D0() : "", i17, feed.mo2128x1ed62e84(), feed.w(), z17, i18, null, null, 0L, ce1.h.f4368x366c91de, null);
        }
    }
}
