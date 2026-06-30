package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class yv implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew f186596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys f186597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fp0.r f186598f;

    public yv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar, fp0.r rVar) {
        this.f186596d = ewVar;
        this.f186597e = ysVar;
        this.f186598f = rVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.n0
    /* renamed from: onFetchDone */
    public void mo55587xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        r45.z91 z91Var;
        r45.ni6 ni6Var;
        so2.j5 j5Var;
        fp0.r rVar = this.f186598f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar = this.f186596d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStreamCardAlbumConvert", "[preloadContent] errType=" + response.getErrType() + " errCode=" + response.getErrCode());
        try {
            if (response.getErrType() == 0 && response.getErrCode() == 0) {
                java.util.List m56409x97891cf7 = response.m56409x97891cf7();
                if ((m56409x97891cf7 == null || (j5Var = (so2.j5) kz5.n0.Z(m56409x97891cf7)) == null || j5Var.h() != 4) ? false : true) {
                    java.util.List m56409x97891cf72 = response.m56409x97891cf7();
                    so2.j5 j5Var2 = m56409x97891cf72 != null ? (so2.j5) kz5.n0.Z(m56409x97891cf72) : null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2 : null;
                    if (abstractC14490x69736cb5 == null) {
                        ewVar.f184842x = false;
                        rVar.b(fp0.u.f346823f);
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(abstractC14490x69736cb5.getFeedObject().getFeedObject(), hc2.d0.d(ewVar.f184827f)));
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    linkedList.addAll(p17.getFeedObject().m59264x7efe73ec());
                    jz5.l lVar = new jz5.l(p17, kz5.n0.V0(linkedList));
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    linkedList2.add(lVar);
                    ((ds2.b0) ((jz5.n) ewVar.f184828g).mo141623x754a37bb()).e(new ek4.b(1, -1, hc2.d0.b(ewVar.f184827f), 1, 0L, null, 0, 112, null), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec.b(abstractC14490x69736cb5.getFeedObject()), kz5.n0.V0(linkedList2), 0);
                    if (response instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m1) {
                        r45.ww2 ww2Var = (r45.ww2) kz5.n0.Z(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.m1) response).f189707c);
                        java.lang.String m75945x2fec8307 = ww2Var != null ? ww2Var.m75945x2fec8307(1) : null;
                        long j17 = 0;
                        java.lang.String u17 = pm0.v.u(ww2Var != null ? ww2Var.m75942xfb822ef2(14) : 0L);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preload this feed video. cardId=");
                        sb6.append(u17);
                        sb6.append(" titleWording=");
                        sb6.append(m75945x2fec8307);
                        sb6.append(" card request id=");
                        r45.xw2 xw2Var = (r45.xw2) this.f186597e.f192725d.m75936x14adae67(22);
                        if (xw2Var != null && (z91Var = (r45.z91) xw2Var.m75936x14adae67(2)) != null && (ni6Var = (r45.ni6) z91Var.m75936x14adae67(20)) != null) {
                            j17 = ni6Var.m75942xfb822ef2(0);
                        }
                        sb6.append(pm0.v.u(j17));
                        sb6.append(" first feedId=");
                        sb6.append(pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStreamCardAlbumConvert", sb6.toString());
                    }
                }
            }
            ewVar.f184842x = false;
            rVar.b(fp0.u.f346823f);
        } catch (java.lang.Throwable th6) {
            ewVar.f184842x = false;
            rVar.b(fp0.u.f346823f);
            throw th6;
        }
    }
}
