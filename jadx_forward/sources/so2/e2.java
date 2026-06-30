package so2;

/* loaded from: classes2.dex */
public final class e2 {

    /* renamed from: a */
    public static final so2.e2 f491861a = new so2.e2();

    public static void a(so2.e2 e2Var, r45.qt2 contextObj, long j17, java.lang.String str, java.lang.String objectNonceId, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 comment, boolean z17, int i17, boolean z18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18, java.lang.String str2, nv2.i1 i1Var, int i19, java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = (i19 & 256) != 0 ? null : gVar;
        int i27 = (i19 & 512) != 0 ? 0 : i18;
        java.lang.String str3 = (i19 & 1024) != 0 ? null : str2;
        nv2.i1 i1Var2 = (i19 & 2048) != 0 ? null : i1Var;
        e2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        if (hz2.d.f367846a.a("like")) {
            return;
        }
        int i28 = (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.j().r()).intValue() == 1 || com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.M != 1) ? i17 : 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLikeLogic", "likeComment scene: " + i28 + ", scene1:" + i17);
        jx3.f.INSTANCE.mo68477x336bdfd8(1278L, z17 ? 2L : 3L, 1L, false);
        int i29 = z17 ? 2 : 1;
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).zj(contextObj, j17, str, 4, i29, 1, comment.Z0(), i28, (r29 & 256) != 0 ? false : false, (r29 & 512) != 0 ? false : false, (r29 & 1024) != 0 ? 0 : 0);
        nv2.n1.f422084h.e(j17, str, objectNonceId, comment, z17 ? nv2.x1.f422159d : nv2.x1.f422160e, i28, i1Var2, contextObj, z18, gVar2, i27, str3);
    }

    public final void b(r45.qt2 contextObj, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObject, boolean z17, boolean z18, int i18, boolean z19, boolean z27, boolean z28, r45.bc1 bc1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        if (hz2.d.f367846a.a("like")) {
            return;
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(1278L, z17 ? 0L : 1L, 1L, false);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).zj(contextObj, finderObject.m59251x5db1b11(), finderObject.m59229xb5af1dd5(), (z18 || z27) ? 6 : 1, z17 ? 2 : 1, i17, "", i18, z19, z28, (z28 || z18 || z27 || cu2.f0.f303924a.e(finderObject.getFeedObject().m76805x2dd7a70f()) == null) ? 0 : 1);
        int i19 = (i17 == 1 || i17 != 2) ? 0 : 1;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.m2().r()).booleanValue()) {
            nv2.d1 d1Var = nv2.d1.f422008b;
            nv2.d1.b(nv2.d1.f422008b, finderObject, z17, z18, i18, i19, contextObj, null, bc1Var, 64, null);
        } else {
            nv2.h1 h1Var = nv2.n1.f422083g;
            nv2.n1.c(nv2.n1.f422084h, finderObject, z17, z18, i18, i19, null, contextObj, null, null, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60852x9b1ed3e8, null);
        }
    }
}
