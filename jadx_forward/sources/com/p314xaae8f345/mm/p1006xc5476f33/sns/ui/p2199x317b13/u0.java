package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public final class u0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 {

    /* renamed from: q, reason: collision with root package name */
    public static final ed4.x f250955q = new ed4.x(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f250956r = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 268);

    public final void F(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a c18734x8eb4224a) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateMusicViewWidth", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
        if (c18734x8eb4224a == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMusicViewWidth", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = c18734x8eb4224a.getLayoutParams();
        boolean z17 = false;
        if (layoutParams != null && layoutParams.width == i17) {
            z17 = true;
        }
        if (!z17) {
            android.view.ViewGroup.LayoutParams layoutParams2 = c18734x8eb4224a.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = i17;
            } else {
                layoutParams2 = null;
            }
            c18734x8eb4224a.setLayoutParams(layoutParams2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMusicViewWidth", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void h(android.view.ViewStub viewStub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
        if (baseViewHolder == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.t0 t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.t0) baseViewHolder;
        android.view.ViewStub r17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder);
        if (r17 != null) {
            if (r17.getParent() != null) {
                r17.setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.csk);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTingMuicStubHas", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                boolean z17 = t0Var.D0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTingMuicStubHas", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                if (!z17) {
                    android.view.View inflate = r17.inflate();
                    android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.o9l);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRoot", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                    t0Var.E0 = findViewById;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRoot", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a c18734x8eb4224a = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a) inflate.findViewById(com.p314xaae8f345.mm.R.id.qap);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMusicView", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                    t0Var.F0 = c18734x8eb4224a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMusicView", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTingMuicStubHas", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                    t0Var.D0 = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTingMuicStubHas", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                }
            } else {
                android.view.View findViewById2 = t0Var.f250805h.findViewById(com.p314xaae8f345.mm.R.id.o9l);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRoot", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                t0Var.E0 = findViewById2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRoot", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a c18734x8eb4224a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a) t0Var.f250805h.findViewById(com.p314xaae8f345.mm.R.id.qap);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMusicView", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                t0Var.F0 = c18734x8eb4224a2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMusicView", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTingMuicStubHas", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
                t0Var.D0 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTingMuicStubHas", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a b17 = t0Var.b();
        android.view.View m72270x79dd64d2 = b17 != null ? b17.m72270x79dd64d2() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMusicMvRoot", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
        t0Var.G0 = m72270x79dd64d2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMusicMvRoot", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a b18 = t0Var.b();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m72272x11eba6ce = b18 != null ? b18.m72272x11eba6ce() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMusicMediaIcon", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
        t0Var.H0 = m72272x11eba6ce;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMusicMediaIcon", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem$TingMusicViewHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v5 java.lang.String, still in use, count: 2, list:
          (r14v5 java.lang.String) from 0x011f: IF  (r14v5 java.lang.String) == (null java.lang.String)  -> B:146:0x0121 A[HIDDEN]
          (r14v5 java.lang.String) from 0x0123: PHI (r14v8 java.lang.String) = (r14v5 java.lang.String), (r14v7 java.lang.String), (r14v24 java.lang.String) binds: [B:150:0x011f, B:146:0x0121, B:57:0x0116] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:53)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024e  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder r18, int r19, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns r20, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 r21, int r22, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs r23) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.u0.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public java.lang.String u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.TingMusicTimeLineItem");
        return "TingMusicTimeLineItem";
    }
}
