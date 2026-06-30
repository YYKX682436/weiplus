package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9;

/* loaded from: classes4.dex */
public final class d implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f245231d;

    public d(java.lang.ref.WeakReference containerRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerRef, "containerRef");
        this.f245231d = containerRef;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 c17803x7f9d5a75;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
        com.p314xaae8f345.mm.p944x882e457a.f result = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        try {
            c17803x7f9d5a75 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75) this.f245231d.get();
        } catch (java.lang.Throwable unused) {
        }
        if (c17803x7f9d5a75 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
            jz5.f0 f0Var = jz5.f0.f384359a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
            return f0Var;
        }
        if (result.f152148a == 0 && result.f152149b == 0) {
            r45.up1 up1Var = (r45.up1) ((r45.hc1) result.f152151d).m75936x14adae67(68);
            if ((((int) (up1Var != null ? up1Var.m75942xfb822ef2(1) : 0L)) & 1) != 1) {
                c17803x7f9d5a75.m69654x339f7ac1(false);
            }
            c17803x7f9d5a75.m69646x6f305cf7((r45.hc1) result.f152151d);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("do joinLiveRequest callback, result errType is ");
        sb6.append(result.f152148a);
        sb6.append(", errCode is ");
        sb6.append(result.f152149b);
        sb6.append(", preview_joinlive_flag is ");
        r45.up1 up1Var2 = (r45.up1) ((r45.hc1) result.f152151d).m75936x14adae67(68);
        sb6.append(up1Var2 != null ? java.lang.Long.valueOf(up1Var2.m75942xfb822ef2(1)) : null);
        sb6.append(", mNeedExitAdRoomReq is ");
        sb6.append(c17803x7f9d5a75.m69621x9c73f8b5());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLivingStreamContainer", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
        return f0Var2;
    }
}
