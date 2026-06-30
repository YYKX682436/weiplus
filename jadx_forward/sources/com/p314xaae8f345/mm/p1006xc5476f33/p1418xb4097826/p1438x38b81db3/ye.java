package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ye extends in5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.d1 f186547b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tw2.h f186548c;

    public ye(in5.s0 s0Var, so2.d1 d1Var, tw2.h hVar) {
        this.f186546a = s0Var;
        this.f186547b = d1Var;
        this.f186548c = hVar;
    }

    @Override // in5.i
    public java.lang.Object a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        int m8183xf806b362;
        if (k3Var == null || (m8183xf806b362 = k3Var.m8183xf806b362()) == -1) {
            return null;
        }
        tw2.h hVar = this.f186548c;
        int mo1894x7e414b06 = hVar.mo1894x7e414b06();
        if (m8183xf806b362 < 0 || m8183xf806b362 >= mo1894x7e414b06) {
            return null;
        }
        return (r45.mb4) hVar.x(m8183xf806b362);
    }

    @Override // in5.i
    public long b(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        return (k3Var != null ? k3Var.f3639x46306858 : null) != null ? r3.hashCode() : 0;
    }

    @Override // in5.i
    public void c(java.util.Set recordsSet) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ye yeVar = this;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        android.content.Context context = yeVar.f186546a.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.qt2 d17 = xy2.c.d(context);
        if (d17 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullImageConvert", "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.Iterator it = recordsSet.iterator();
        while (it.hasNext()) {
            in5.e eVar = (in5.e) it.next();
            r45.mb4 mb4Var = (r45.mb4) eVar.f374555a;
            long j17 = eVar.f374556b;
            long j18 = eVar.f374557c;
            android.view.View view = eVar.f374560f;
            if (view != null) {
                java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.teh);
                java.lang.Long l17 = tag instanceof java.lang.Long ? (java.lang.Long) tag : null;
                long longValue = l17 != null ? l17.longValue() : 0L;
                java.lang.Object tag2 = view.getTag(com.p314xaae8f345.mm.R.id.tei);
                java.lang.String str = tag2 instanceof java.lang.String ? (java.lang.String) tag2 : null;
                if (str == null) {
                    str = "";
                }
                long max = longValue == 0 ? j18 - j17 : java.lang.Math.max(longValue - j17, 0L);
                if (!(str.length() > 0)) {
                    str = mb4Var.m75945x2fec8307(1) + mb4Var.m75945x2fec8307(19);
                }
                bu2.r rVar = bu2.r.f106092a;
                java.lang.String valueOf = java.lang.String.valueOf(mb4Var.m75945x2fec8307(9));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 c0Var = bu2.r.f106094c;
                boolean z17 = !(c0Var.b(valueOf) != null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                so2.d1 d1Var = yeVar.f186547b;
                java.lang.String ek6 = o3Var.ek(d1Var.mo2128x1ed62e84(), d1Var.w(), d17.m75939xb282bd08(5));
                dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[11];
                lVarArr[0] = new jz5.l("feed_id", pm0.v.u(d1Var.mo2128x1ed62e84()));
                lVarArr[1] = new jz5.l("finder_context_id", d17.m75945x2fec8307(1));
                lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(d17.m75939xb282bd08(5)));
                lVarArr[3] = new jz5.l("session_buffer", ek6);
                lVarArr[4] = new jz5.l("finder_username", d1Var.getFeedObject().m59299x6bf53a6c());
                lVarArr[5] = new jz5.l("extra_info", d17.m75945x2fec8307(11));
                lVarArr[6] = new jz5.l("white_pic_time", java.lang.Long.valueOf(max));
                lVarArr[7] = new jz5.l("pic_index", java.lang.Integer.valueOf(eVar.f374559e));
                lVarArr[8] = new jz5.l("pic_url", str);
                lVarArr[9] = new jz5.l("is_livephoto", java.lang.Integer.valueOf(((r45.a42) mb4Var.m75936x14adae67(67)) != null ? 1 : 0));
                lVarArr[10] = new jz5.l("first_expose", java.lang.Integer.valueOf(z17 ? 1 : 2));
                ((cy1.a) rVar2).Bj("finder_feed_photo", "finder_photo_optimize", kz5.c1.k(lVarArr), 1, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullImageConvert", "Current feed: " + hc2.o0.t(d1Var) + ", pos: " + eVar.f374559e + ", mediaID: " + mb4Var.m75945x2fec8307(9) + ", whiteScreenTime: " + max + ", isFirstExposed: " + z17 + ", picUrl: " + str);
                java.lang.String valueOf2 = java.lang.String.valueOf(mb4Var.m75945x2fec8307(9));
                c0Var.d(valueOf2, valueOf2);
            }
            yeVar = this;
        }
    }
}
