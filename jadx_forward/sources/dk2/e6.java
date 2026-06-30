package dk2;

/* loaded from: classes3.dex */
public final class e6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.t f314890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.k6 f314891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f314892f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(yz5.t tVar, dk2.k6 k6Var, gk2.e eVar) {
        super(7);
        this.f314890d = tVar;
        this.f314891e = k6Var;
        this.f314892f = eVar;
    }

    @Override // yz5.u
    public java.lang.Object K(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        java.lang.String errMsg = (java.lang.String) obj4;
        kn0.g liveRoomInfo = (kn0.g) obj5;
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams trtcParams = (com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams) obj6;
        r45.hc1 resp = (r45.hc1) obj7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveRoomInfo, "liveRoomInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trtcParams, "trtcParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveExternalHelper", "joinLive success:" + booleanValue + ", errCode:" + intValue + " cliBuff:" + resp.m75945x2fec8307(17));
        this.f314890d.J(java.lang.Boolean.valueOf(booleanValue), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), errMsg, new android.os.Bundle(), null);
        if (booleanValue) {
            dk2.k6 k6Var = this.f314891e;
            k6Var.getClass();
            boolean w17 = zl2.r4.f555483a.w1();
            gk2.e eVar = this.f314892f;
            if (w17) {
                boolean z17 = resp.m75939xb282bd08(23) != 1;
                boolean N6 = ((mm2.f6) eVar.a(mm2.f6.class)).N6();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveExternalHelper", "handleJoinLiveWxshopResponse haveBindShop:" + N6 + ", shopping_not_available:" + resp.m75939xb282bd08(23) + ", canShowShopEntrance:" + z17);
                if (z17 && !N6) {
                    ((mm2.f6) eVar.a(mm2.f6.class)).U6(true);
                }
                i95.m c17 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.yb.t2((c61.yb) c17, 14, null, 2, null);
            }
            ((mm2.c1) eVar.a(mm2.c1.class)).f410336f4.f390582a.clear();
            ((mm2.c1) eVar.a(mm2.c1.class)).f410336f4.f390582a.addAll(resp.m75941xfb821914(18));
            ((mm2.c1) eVar.a(mm2.c1.class)).f410336f4.f390583b = resp.m75945x2fec8307(17);
            ((mm2.c1) eVar.a(mm2.c1.class)).Q8(true);
            if (((mm2.e1) eVar.a(mm2.e1.class)).f410523t == null) {
                ((mm2.e1) eVar.a(mm2.e1.class)).o7(new kn0.i(trtcParams, liveRoomInfo, new kn0.h("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI")));
            } else {
                kn0.i iVar = ((mm2.e1) eVar.a(mm2.e1.class)).f410523t;
                if (iVar != null) {
                    iVar.f391090a = trtcParams;
                }
                kn0.i iVar2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410523t;
                if (iVar2 != null) {
                    iVar2.f391091b = liveRoomInfo;
                }
                kn0.i iVar3 = ((mm2.e1) eVar.a(mm2.e1.class)).f410523t;
                if (iVar3 != null) {
                    iVar3.f391092c = new kn0.h("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI");
                }
            }
            k6Var.f315217b.set(0, java.lang.Integer.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75939xb282bd08(4)));
            k6Var.f315217b.set(1, java.lang.Long.valueOf(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
            dk2.ef efVar = dk2.ef.f314905a;
            efVar.D();
            r45.nw1 nw1Var = (r45.nw1) resp.m75936x14adae67(3);
            efVar.v(0L, nw1Var != null ? nw1Var.m75942xfb822ef2(0) : 0L);
        }
        return jz5.f0.f384359a;
    }
}
