package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class a5 implements mr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5 f255249a;

    public a5(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5 activityC18624x35d9f9b5) {
        this.f255249a = activityC18624x35d9f9b5;
    }

    @Override // mr.a
    /* renamed from: onPageSelected */
    public void mo71861x510f45c9(int i17) {
        bi4.n0 n0Var;
        in5.s0 s0Var;
        in5.s0 s0Var2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "onPageSelected pos:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5 activityC18624x35d9f9b5 = this.f255249a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 c18676x82a91782 = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) activityC18624x35d9f9b5.m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4 h4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255011o;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 Y6 = activityC18624x35d9f9b5.Y6();
        c18676x82a91782.getClass();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = Y6.q0(i17, false);
        in5.s0 s0Var3 = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
        if (s0Var3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedUIC", "onPageListSelected: failed, pos=" + i17 + ", childCount=" + Y6.getChildCount());
        } else {
            java.lang.ref.WeakReference weakReference = c18676x82a91782.f255307e;
            boolean z17 = ((weakReference == null || (s0Var2 = (in5.s0) weakReference.get()) == null) ? null : s0Var2.f374657h) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1;
            c18676x82a91782.f255307e = new java.lang.ref.WeakReference(s0Var3);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPageListSelected: ");
            sb6.append(i17);
            sb6.append(", fromPagerScroll=");
            sb6.append(z17);
            sb6.append(", pagerIdentify=");
            java.lang.ref.WeakReference weakReference2 = c18676x82a91782.f255307e;
            java.lang.Object obj = (weakReference2 == null || (s0Var = (in5.s0) weakReference2.get()) == null) ? null : s0Var.f374657h;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 w1Var = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1) obj : null;
            sb6.append(w1Var != null ? w1Var.m71906x73c2ac82() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedUIC", sb6.toString());
            if (z17) {
                in5.s0 Q6 = c18676x82a91782.Q6();
                java.lang.Object obj2 = Q6 != null ? Q6.f374657h : null;
                n0Var = obj2 instanceof bi4.n0 ? (bi4.n0) obj2 : null;
                if (n0Var != null) {
                    n0Var.d();
                }
                c18676x82a91782.W6(true);
            } else {
                in5.s0 Q62 = c18676x82a91782.Q6();
                java.lang.Object obj3 = Q62 != null ? Q62.f374657h : null;
                n0Var = obj3 instanceof bi4.n0 ? (bi4.n0) obj3 : null;
                if (n0Var != null) {
                    n0Var.a();
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activityC18624x35d9f9b5.f255015d, "SCENE_HISTORY_FEED");
    }
}
