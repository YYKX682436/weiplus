package df2;

/* loaded from: classes3.dex */
public final class bd extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311329m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311329m = "LiveAnchorShopMsgDataController";
    }

    public final void Z6(java.lang.String str, java.lang.Long l17) {
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (r4Var.y1(getStore().getLiveRoomData())) {
            boolean z17 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).P;
            if (l17 != null) {
                long longValue = l17.longValue();
                mm2.c1 c1Var = (mm2.c1) m56788xbba4bfc0(mm2.c1.class);
                qs5.h[] hVarArr = qs5.h.f447966d;
                c1Var.P = pm0.v.A(longValue, 2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311329m, "[checkEnableAndInsertRedDot] scene = " + str + ", flag = " + l17 + ", enableAnchorAskProduction = " + ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).P);
            }
            if (z17 || !r4Var.o(getStore().getLiveRoomData())) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r45.f03 f03Var = new r45.f03();
            f03Var.f455420d = 1;
            f03Var.f455424h = 1;
            f03Var.f455425i = "anchorlive.more.commentmanage";
            f03Var.f455426m = "anchorlive.bottom.tools";
            f03Var.f455433t = 1;
            arrayList.add(f03Var);
            r45.f03 f03Var2 = new r45.f03();
            f03Var2.f455424h = 2;
            f03Var2.f455425i = "anchorlive.bottom.tools";
            arrayList.add(f03Var2);
            ll2.e.f400666a.i(24005, arrayList, "live_more_comment_management");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        r45.up1 up1Var;
        super.mo14867x5aa1c816(r71Var);
        Z6("onLiveMsg", (r71Var == null || (up1Var = (r45.up1) r71Var.m75936x14adae67(32)) == null) ? null : java.lang.Long.valueOf(up1Var.m75942xfb822ef2(5)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        r45.up1 up1Var;
        super.mo14863x39a513b7(hc1Var);
        Z6("onLiveStart", (hc1Var == null || (up1Var = (r45.up1) hc1Var.m75936x14adae67(68)) == null) ? null : java.lang.Long.valueOf(up1Var.m75942xfb822ef2(5)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
    }
}
