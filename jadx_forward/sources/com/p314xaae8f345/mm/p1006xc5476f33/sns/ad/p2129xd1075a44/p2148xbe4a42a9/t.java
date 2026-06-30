package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9;

/* loaded from: classes4.dex */
public final class t implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f245296a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f245297b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Long f245298c;

    public t(java.lang.ref.WeakReference helperRef, java.lang.String snsId, java.lang.Long l17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helperRef, "helperRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        this.f245296a = helperRef;
        this.f245297b = snsId;
        this.f245298c = l17;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v vVar;
        int i18;
        java.lang.String str = this.f245297b;
        java.lang.Long l17 = this.f245298c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion$FinderLiveStatusCallback");
        try {
            vVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v) this.f245296a.get();
        } catch (java.lang.Throwable unused) {
        }
        if (vVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion$FinderLiveStatusCallback");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doRequestFinderObject, onLiveStatusCallback, snsId is ");
        sb6.append(str);
        sb6.append(", liveId is ");
        sb6.append(l17);
        sb6.append(", respLiveId is ");
        sb6.append(j17);
        sb6.append(", status is ");
        sb6.append(i17);
        sb6.append(", mShouldVideoPlay is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMShouldVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        boolean z17 = vVar.f245303c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMShouldVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        sb6.append(z17);
        sb6.append(", mPlayerStatus is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 e17 = vVar.e();
        sb6.append(e17 != null ? java.lang.Integer.valueOf(e17.m69625x45e4bf8a()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLivingStreamHelper", sb6.toString());
        boolean z18 = false;
        if (l17 != null && j17 == l17.longValue()) {
            if (i17 != 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 e18 = vVar.e();
                if (e18 != null) {
                    e18.m69652x3a3868c2(false);
                }
                i18 = 770;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 e19 = vVar.e();
                if (e19 != null) {
                    e19.m69652x3a3868c2(true);
                }
                i18 = 771;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.i0.g(str, i18);
        }
        if (j17 == l17.longValue() && (obj instanceof r45.l71)) {
            if (((r45.nw1) ((r45.l71) obj).m75936x14adae67(1)) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLivingStreamHelper", "liveInfoResp liveInfo is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion$FinderLiveStatusCallback");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 e27 = vVar.e();
            if (e27 != null) {
                e27.m69649xf4835575((r45.l71) obj);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
            c19792x256d2725.m76887xcb0dd23c((r45.nw1) ((r45.l71) obj).m75936x14adae67(1));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 e28 = vVar.e();
            if (e28 != null) {
                e28.m69647x36d0ed0(c19792x256d2725);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMShouldVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
            boolean z19 = vVar.f245303c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMShouldVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
            if (z19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17803x7f9d5a75 e29 = vVar.e();
                if (e29 != null && e29.m69625x45e4bf8a() == 0) {
                    z18 = true;
                }
                if (z18) {
                    vVar.e().p();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion$FinderLiveStatusCallback");
    }
}
