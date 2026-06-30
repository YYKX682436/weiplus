package nv2;

/* loaded from: classes2.dex */
public final class f1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nv2.g1 f422020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nv2.o1 f422021b;

    public f1(nv2.g1 g1Var, nv2.o1 o1Var) {
        this.f422020a = g1Var;
        this.f422021b = o1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str;
        r45.yz3 yz3Var;
        r45.zu0 zu0Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LikeActionTask", "LikeActionTask callback " + fVar.f152148a + ' ' + fVar.f152149b + ' ' + fVar.f152150c);
        int i17 = fVar.f152148a;
        nv2.o1 o1Var = this.f422021b;
        nv2.g1 g1Var = this.f422020a;
        if (i17 == 0 && fVar.f152149b == 0) {
            int m59254xf4204902 = g1Var.f422024d.m59254xf4204902();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = g1Var.f422024d;
            int m59255xbd8ebd19 = c14994x9b99c079.m59255xbd8ebd19();
            int m59247xf67fd084 = c14994x9b99c079.m59247xf67fd084();
            boolean z17 = g1Var.f422027g;
            if (z17) {
                c14994x9b99c079.m59385x50740976(c14994x9b99c079.m59254xf4204902() + (c14994x9b99c079.m59255xbd8ebd19() != 0 ? 0 : 1));
            } else {
                c14994x9b99c079.m59385x50740976(c14994x9b99c079.m59254xf4204902() + (c14994x9b99c079.m59255xbd8ebd19() != 0 ? -1 : 0));
            }
            boolean z18 = g1Var.f422028h;
            if (m59255xbd8ebd19 == 1 && (!z17 || z18)) {
                c14994x9b99c079.m59382x2d5669f8(c14994x9b99c079.m59247xf67fd084() - 1);
            } else if (m59255xbd8ebd19 != 1 && z17 && !z18) {
                c14994x9b99c079.m59382x2d5669f8(c14994x9b99c079.m59247xf67fd084() + 1);
            }
            if (!z17 || z18) {
                nv2.n1.f422084h.o(c14994x9b99c079.m59256xbd916e4b());
            } else {
                nv2.n1.f422084h.a(c14994x9b99c079.m59256xbd916e4b());
            }
            c14994x9b99c079.m59386xb8471e25((z17 && z18) ? 2 : z17 ? 1 : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LikeAction", "CgiFinderLikeFeed end likeFlag:" + c14994x9b99c079.m59255xbd8ebd19() + " likeCount " + c14994x9b99c079.m59254xf4204902() + " friendLikeCount:" + c14994x9b99c079.m59247xf67fd084() + ",  " + m59255xbd8ebd19 + ' ' + m59254xf4204902 + ", oldFriendLikeCount:" + m59247xf67fd084);
            nv2.n1.f422084h.m(g1Var);
            o1Var.a(fp0.u.f346823f, false);
            r45.yz3 yz3Var2 = (r45.yz3) ((r45.rd1) fVar.f152151d).m75936x14adae67(2);
            if (yz3Var2 != null && (zu0Var = (r45.zu0) yz3Var2.m75936x14adae67(2)) != null) {
                i95.m c17 = i95.n0.c(cq.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((cq.k) c17).Vi(c14994x9b99c079.m59299x6bf53a6c(), zu0Var);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
            am.ia iaVar = c5445x963cab3.f135785g;
            long j17 = g1Var.f422025e;
            iaVar.f88451a = j17;
            iaVar.f88455e = (z17 && z18) ? 2 : z17 ? 1 : 0;
            iaVar.f88456f = c14994x9b99c079.m59254xf4204902();
            iaVar.f88454d = 1;
            r45.yz3 yz3Var3 = (r45.yz3) ((r45.rd1) fVar.f152151d).m75936x14adae67(2);
            iaVar.f88461k = yz3Var3 != null ? yz3Var3.m75939xb282bd08(0) : 0;
            r45.yz3 yz3Var4 = (r45.yz3) ((r45.rd1) fVar.f152151d).m75936x14adae67(2);
            if (yz3Var4 == null || (str = yz3Var4.m75945x2fec8307(1)) == null) {
                str = "";
            }
            iaVar.f88462l = str;
            iaVar.f88452b = 4;
            c5445x963cab3.e();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0 c5795x6c1c62d0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0();
            java.lang.String u17 = pm0.v.u(j17);
            am.qm qmVar = c5795x6c1c62d0.f136104g;
            qmVar.f89251a = u17;
            nv2.o oVar = nv2.o.f422091e;
            qmVar.f89255e = oVar.b(c14994x9b99c079.getFeedObject());
            qmVar.f89254d = oVar.c(c14994x9b99c079.getFeedObject());
            qmVar.f89253c = c14994x9b99c079.m59254xf4204902();
            qmVar.f89252b = c14994x9b99c079.m59255xbd8ebd19() != 0;
            c5795x6c1c62d0.e();
            r45.rd1 rd1Var = (r45.rd1) fVar.f152151d;
            if (rd1Var != null && (yz3Var = (r45.yz3) rd1Var.m75936x14adae67(2)) != null) {
                nv2.e1.a(yz3Var, z17, j17, false);
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Map b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.U.b(c14994x9b99c079);
            if (b17 != null) {
                linkedHashMap.putAll(b17);
            }
            java.util.Map b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a.b(g1Var.f422031k, null);
            if (b18 != null) {
                linkedHashMap.putAll(b18);
            }
            linkedHashMap.put("is_action_like", java.lang.Integer.valueOf(z17 ? 1 : 0));
            linkedHashMap.put("is_private", java.lang.Integer.valueOf(z18 ? 1 : 0));
            linkedHashMap.put("is_long_video", 0);
            linkedHashMap.put("old_like_count", java.lang.Integer.valueOf(m59254xf4204902));
            linkedHashMap.put("cur_like_count", java.lang.Integer.valueOf(c14994x9b99c079.m59247xf67fd084()));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_like_real_click", null, linkedHashMap, 24617);
        } else if (i17 == 4) {
            nv2.n1.f422084h.m(g1Var);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab32 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
            am.ia iaVar2 = c5445x963cab32.f135785g;
            iaVar2.f88451a = g1Var.f422025e;
            iaVar2.f88452b = 4;
            c5445x963cab32.e();
            o1Var.a(fp0.u.f346824g, false);
        } else {
            o1Var.a(fp0.u.f346824g, true);
        }
        return jz5.f0.f384359a;
    }
}
