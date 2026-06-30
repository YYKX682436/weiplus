package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class yv implements com.tencent.mm.plugin.finder.feed.model.internal.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ew f105063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ys f105064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fp0.r f105065f;

    public yv(com.tencent.mm.plugin.finder.convert.ew ewVar, com.tencent.mm.plugin.finder.feed.ys ysVar, fp0.r rVar) {
        this.f105063d = ewVar;
        this.f105064e = ysVar;
        this.f105065f = rVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        r45.z91 z91Var;
        r45.ni6 ni6Var;
        so2.j5 j5Var;
        fp0.r rVar = this.f105065f;
        com.tencent.mm.plugin.finder.convert.ew ewVar = this.f105063d;
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mars.xlog.Log.i("Finder.FinderStreamCardAlbumConvert", "[preloadContent] errType=" + response.getErrType() + " errCode=" + response.getErrCode());
        try {
            if (response.getErrType() == 0 && response.getErrCode() == 0) {
                java.util.List incrementList = response.getIncrementList();
                if ((incrementList == null || (j5Var = (so2.j5) kz5.n0.Z(incrementList)) == null || j5Var.h() != 4) ? false : true) {
                    java.util.List incrementList2 = response.getIncrementList();
                    so2.j5 j5Var2 = incrementList2 != null ? (so2.j5) kz5.n0.Z(incrementList2) : null;
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2 : null;
                    if (baseFinderFeed == null) {
                        ewVar.f103309x = false;
                        rVar.b(fp0.u.f265290f);
                        return;
                    }
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(baseFinderFeed.getFeedObject().getFeedObject(), hc2.d0.d(ewVar.f103294f)));
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    linkedList.addAll(p17.getFeedObject().getMediaList());
                    jz5.l lVar = new jz5.l(p17, kz5.n0.V0(linkedList));
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    linkedList2.add(lVar);
                    ((ds2.b0) ((jz5.n) ewVar.f103295g).getValue()).e(new ek4.b(1, -1, hc2.d0.b(ewVar.f103294f), 1, 0L, null, 0, 112, null), com.tencent.mm.plugin.finder.storage.FeedData.Companion.b(baseFinderFeed.getFeedObject()), kz5.n0.V0(linkedList2), 0);
                    if (response instanceof com.tencent.mm.plugin.finder.feed.model.m1) {
                        r45.ww2 ww2Var = (r45.ww2) kz5.n0.Z(((com.tencent.mm.plugin.finder.feed.model.m1) response).f108174c);
                        java.lang.String string = ww2Var != null ? ww2Var.getString(1) : null;
                        long j17 = 0;
                        java.lang.String u17 = pm0.v.u(ww2Var != null ? ww2Var.getLong(14) : 0L);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preload this feed video. cardId=");
                        sb6.append(u17);
                        sb6.append(" titleWording=");
                        sb6.append(string);
                        sb6.append(" card request id=");
                        r45.xw2 xw2Var = (r45.xw2) this.f105064e.f111192d.getCustom(22);
                        if (xw2Var != null && (z91Var = (r45.z91) xw2Var.getCustom(2)) != null && (ni6Var = (r45.ni6) z91Var.getCustom(20)) != null) {
                            j17 = ni6Var.getLong(0);
                        }
                        sb6.append(pm0.v.u(j17));
                        sb6.append(" first feedId=");
                        sb6.append(pm0.v.u(baseFinderFeed.getItemId()));
                        com.tencent.mars.xlog.Log.i("Finder.FinderStreamCardAlbumConvert", sb6.toString());
                    }
                }
            }
            ewVar.f103309x = false;
            rVar.b(fp0.u.f265290f);
        } catch (java.lang.Throwable th6) {
            ewVar.f103309x = false;
            rVar.b(fp0.u.f265290f);
            throw th6;
        }
    }
}
