package so2;

/* loaded from: classes10.dex */
public final class v0 {

    /* renamed from: a */
    public static final so2.v0 f492177a = new so2.v0();

    public static void a(so2.v0 v0Var, r45.vx0 vx0Var, r45.ev2 finderShareCollection, android.app.Activity context, java.lang.String str, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            str = null;
        }
        if ((i17 & 16) != 0) {
            lVar = null;
        }
        v0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderShareCollection, "finderShareCollection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (hz2.d.f367846a.a(ya.a.f77453x4b357bf)) {
            return;
        }
        if (vx0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("doCollectionFav", "but collectionInfo is null");
            return;
        }
        if (vx0Var.m75942xfb822ef2(0) == 0 || finderShareCollection.m75942xfb822ef2(0) == 0 || finderShareCollection.m75942xfb822ef2(0) != vx0Var.m75942xfb822ef2(0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("doCollectionFav", "but collectionInfo=" + vx0Var.mo12245xcc313de3() + " \t finderShareCollection=" + finderShareCollection.mo12245xcc313de3());
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(c01.z1.r());
        jq0Var.d("" + vx0Var.m75942xfb822ef2(0));
        jq0Var.c((long) vx0Var.m75939xb282bd08(7));
        jq0Var.i(pm0.v.u(vx0Var.m75942xfb822ef2(0)));
        jq0Var.g(38);
        bq0Var.o(jq0Var);
        bq0Var.Q = finderShareCollection;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87851d = "";
        c4Var.f87848a = bq0Var;
        c4Var.f87850c = 34;
        if (lVar != null) {
            lVar.mo146xb9724478(c5303xc75d2f73);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("doCollectionFav", "finderShareCollection=" + finderShareCollection.mo12245xcc313de3());
        c4Var.f87865r = str;
        c4Var.f87856i = context;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFavLogic", "publish fav collection event, id:".concat(pm0.v.u(vx0Var.m75942xfb822ef2(0))));
        c5303xc75d2f73.e();
    }

    public static void b(so2.v0 v0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, android.app.Activity context, java.lang.String str, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str = null;
        }
        if ((i17 & 8) != 0) {
            lVar = null;
        }
        v0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (hz2.d.f367846a.a(ya.a.f77453x4b357bf)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feed2 = feed.getFeedObject();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed2, "feed");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(c01.z1.r());
        jq0Var.d("" + feed2.m59251x5db1b11());
        jq0Var.c(feed2.m59221x3fdd41df());
        jq0Var.i("FavSourceId" + feed2.m59251x5db1b11());
        jq0Var.g(31);
        bq0Var.o(jq0Var);
        bq0Var.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.j(n7Var, feed2, false, null, 6, null));
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87851d = "";
        c4Var.f87848a = bq0Var;
        c4Var.f87850c = 20;
        if (lVar != null) {
            lVar.mo146xb9724478(c5303xc75d2f73);
        }
        c4Var.f87865r = str;
        c4Var.f87856i = context;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFavLogic", "publish fav event, id:" + feed.mo2128x1ed62e84());
        c5303xc75d2f73.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a.c(V6, feed.getFeedObject(), 42, "", V6 != null ? V6.m75939xb282bd08(5) : 0);
    }

    public static /* synthetic */ void d(so2.v0 v0Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, boolean z17, int i17, int i18, java.lang.String str, r45.bc1 bc1Var, int i19, java.lang.Object obj) {
        v0Var.c(activityC0065xcd7aa112, c14994x9b99c079, z17, i17, (i19 & 16) != 0 ? 0 : i18, (i19 & 32) != 0 ? null : str, (i19 & 64) != 0 ? null : bc1Var);
    }

    public final void c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObject, boolean z17, int i17, int i18, java.lang.String str, r45.bc1 bc1Var) {
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFavLogic", "favFeed, id:" + finderObject.m59251x5db1b11() + ", pf:" + finderObject.getFeedObject().m76810x98d986d1());
        pf5.z zVar = pf5.z.f435481a;
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        if (z17) {
            java.lang.Object a17 = zVar.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
            if (e27 != null) {
                e27.a(new ec2.a(10, finderObject.m59251x5db1b11(), finderObject.m59229xb5af1dd5()));
            }
        } else {
            java.lang.Object a18 = zVar.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
            ec2.d e28 = zy2.ra.e2((zy2.ra) a18, 0, 1, null);
            if (e28 != null) {
                e28.a(new ec2.a(11, finderObject.m59251x5db1b11(), finderObject.m59229xb5af1dd5()));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        long m59251x5db1b11 = finderObject.m59251x5db1b11();
        java.lang.String m59229xb5af1dd5 = finderObject.m59229xb5af1dd5();
        int i27 = z17 ? 2 : 1;
        o3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 dk6 = o3Var.dk(m59251x5db1b11);
        if (dk6 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6476xa46ff357 c6476xa46ff357 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6476xa46ff357();
            c6476xa46ff357.f138182d = c6476xa46ff357.b("SessionId", V6.m75945x2fec8307(0), true);
            c6476xa46ff357.f138183e = c6476xa46ff357.b("ClickUI", "", true);
            c6476xa46ff357.f138184f = c6476xa46ff357.b("FeedId", o3Var.Ui(m59251x5db1b11), true);
            c6476xa46ff357.f138185g = c6476xa46ff357.b("FeedUsr", dk6.m59299x6bf53a6c(), true);
            c6476xa46ff357.f138186h = 5L;
            c6476xa46ff357.f138187i = i27;
            c6476xa46ff357.f138188j = 0L;
            c6476xa46ff357.f138189k = c6476xa46ff357.b("ReplyUsr", "", true);
            c6476xa46ff357.f138190l = 2L;
            c6476xa46ff357.f138191m = dk6.m59254xf4204902();
            c6476xa46ff357.f138192n = dk6.m59216x8ed22866();
            c6476xa46ff357.f138193o = dk6.m59247xf67fd084();
            c6476xa46ff357.f138194p = dk6.getMediaType();
            c6476xa46ff357.f138195q = c6476xa46ff357.b("Tag", r26.i0.t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.f206740s.a(dk6), ",", ";", false), true);
            c6476xa46ff357.f138196r = c6476xa46ff357.b("TagId", "", true);
            c6476xa46ff357.f138197s = V6.m75939xb282bd08(5);
            c6476xa46ff357.f138198t = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dk6.m59299x6bf53a6c(), xy2.c.f(V6)) ? 1L : 0L;
            java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            c6476xa46ff357.f138200v = c6476xa46ff357.b("ContextId", m75945x2fec8307, true);
            i19 = 2;
            java.lang.String m75945x2fec83072 = V6.m75945x2fec8307(2);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            c6476xa46ff357.f138201w = c6476xa46ff357.b("ClickTabContextId", m75945x2fec83072, true);
            c6476xa46ff357.f138202x = c6476xa46ff357.b("SessionBuffer", o3Var.ek(m59251x5db1b11, m59229xb5af1dd5, V6.m75939xb282bd08(5)), true);
            java.lang.String m75945x2fec83073 = V6.m75945x2fec8307(11);
            c6476xa46ff357.f138204z = c6476xa46ff357.b("ExtraInfo", m75945x2fec83073 != null ? r26.i0.t(m75945x2fec83073, ",", ";", false) : "", true);
            java.lang.String m75945x2fec83074 = V6.m75945x2fec8307(12);
            c6476xa46ff357.A = c6476xa46ff357.b("enterSourceInfo", m75945x2fec83074 != null ? r26.i0.t(m75945x2fec83074, ",", ";", false) : "", true);
            c6476xa46ff357.k();
            o3Var.Zk(c6476xa46ff357);
        } else {
            i19 = 2;
        }
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.d2().r()).booleanValue()) {
            nv2.d1.a(nv2.d1.f422008b, finderObject, z17, i17, V6, i18, str, null, bc1Var, 64, null);
            return;
        }
        nv2.o.a(nv2.o.f422091e, finderObject, z17, i17, null, V6, i18, str, null, bc1Var, 136, null);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
        long m59251x5db1b112 = finderObject.m59251x5db1b11();
        am.ia iaVar = c5445x963cab3.f135785g;
        iaVar.f88451a = m59251x5db1b112;
        iaVar.f88453c = z17 ? 1 : i19;
        iaVar.f88452b = 5;
        c5445x963cab3.e();
    }
}
