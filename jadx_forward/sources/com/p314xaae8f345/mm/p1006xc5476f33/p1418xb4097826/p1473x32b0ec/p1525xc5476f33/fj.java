package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class fj extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: p, reason: collision with root package name */
    public final te2.n3 f194094p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f194095q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(android.view.ViewGroup root, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14319xdc54373f c14319xdc54373f, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        te2.r3 r3Var = new te2.r3(root, context, S0(), statusMonitor, this);
        this.f194094p = r3Var;
        android.content.Context context2 = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        r3Var.mo56536x3b13c504(new te2.t3(root, c14319xdc54373f, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, r3Var, S0()));
        K0(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            super.K0(i17);
        } else {
            this.f446856d.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveGameWelfareTaskBubblePlugin", "setVisible return for isTeenMode");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        this.f194095q = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGameWelfareTaskBubblePlugin", "#unMount");
        te2.n3 n3Var = this.f194094p;
        if (n3Var != null) {
            ((te2.r3) n3Var).mo979x3f5eee52();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:15:0x002f, B:17:0x0037, B:19:0x004e, B:24:0x005a, B:27:0x0060, B:30:0x006d, B:33:0x0076), top: B:14:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:15:0x002f, B:17:0x0037, B:19:0x004e, B:24:0x005a, B:27:0x0060, B:30:0x006d, B:33:0x0076), top: B:14:0x002f }] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l1(android.os.Bundle r13, java.lang.Object r14) {
        /*
            r12 = this;
            te2.n3 r0 = r12.f194094p
            if (r0 == 0) goto L9d
            te2.r3 r0 = (te2.r3) r0
            java.lang.String r1 = "FinderLiveGameWelfareTaskBubblePresenter"
            java.lang.String r2 = ""
            r3 = 0
            if (r13 == 0) goto L14
            java.lang.String r4 = "ACTION_POST_PORTRAIT"
            java.lang.String r13 = r13.getString(r4, r2)
            goto L15
        L14:
            r13 = r3
        L15:
            java.lang.String r4 = "PORTRAIT_ACTION_FinderLiveGameWelfareTaskBubblePresenter"
            boolean r13 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r13, r4)
            if (r13 == 0) goto L9d
            boolean r13 = r14 instanceof android.os.Bundle
            if (r13 == 0) goto L24
            r3 = r14
            android.os.Bundle r3 = (android.os.Bundle) r3
        L24:
            if (r3 == 0) goto L9d
            java.lang.String r13 = "PORTRAIT_ACTION_BUNDLE_OPEN_MINI_APP"
            r14 = 0
            boolean r13 = r3.getBoolean(r13, r14)
            if (r13 == 0) goto L9d
            java.lang.String r13 = "PORTRAIT_ACTION_BUNDLE_GAME_WELFARE_INFO"
            byte[] r13 = r3.getByteArray(r13)     // Catch: java.lang.Exception -> L87
            if (r13 == 0) goto L9d
            r45.t73 r3 = new r45.t73     // Catch: java.lang.Exception -> L87
            r3.<init>()     // Catch: java.lang.Exception -> L87
            com.tencent.mm.protobuf.f r13 = r3.mo11468x92b714fd(r13)     // Catch: java.lang.Exception -> L87
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GameWelfareWxaJumpInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r13, r3)     // Catch: java.lang.Exception -> L87
            r45.t73 r13 = (r45.t73) r13     // Catch: java.lang.Exception -> L87
            java.lang.String r3 = r13.m75945x2fec8307(r14)     // Catch: java.lang.Exception -> L87
            r4 = 1
            if (r3 == 0) goto L57
            int r3 = r3.length()     // Catch: java.lang.Exception -> L87
            if (r3 != 0) goto L55
            goto L57
        L55:
            r3 = r14
            goto L58
        L57:
            r3 = r4
        L58:
            if (r3 == 0) goto L60
            java.lang.String r13 = "#onPortraitAction-openMiniApp appid is null, return"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r13)     // Catch: java.lang.Exception -> L87
            goto L9d
        L60:
            te2.qc r5 = te2.qc.f499897a     // Catch: java.lang.Exception -> L87
            android.content.Context r6 = r0.f499905e     // Catch: java.lang.Exception -> L87
            java.lang.String r14 = r13.m75945x2fec8307(r14)     // Catch: java.lang.Exception -> L87
            if (r14 != 0) goto L6c
            r7 = r2
            goto L6d
        L6c:
            r7 = r14
        L6d:
            java.lang.String r14 = r13.m75945x2fec8307(r4)     // Catch: java.lang.Exception -> L87
            if (r14 != 0) goto L75
            r8 = r2
            goto L76
        L75:
            r8 = r14
        L76:
            r14 = 2
            int r9 = r13.m75939xb282bd08(r14)     // Catch: java.lang.Exception -> L87
            r14 = 3
            com.tencent.mm.protobuf.g r10 = r13.m75934xbce7f2f(r14)     // Catch: java.lang.Exception -> L87
            r11 = 0
            r5.b(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L87
            r0.f499910m = r4     // Catch: java.lang.Exception -> L87
            goto L9d
        L87:
            r13 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "onPortraitAction-openMiniApp"
            r14.<init>(r0)
            java.lang.String r13 = r13.getLocalizedMessage()
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r13)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fj.l1(android.os.Bundle, java.lang.Object):void");
    }

    /* renamed from: onResume */
    public final void m56941x57429eec() {
        te2.n3 n3Var = this.f194094p;
        if (n3Var != null) {
            te2.r3 r3Var = (te2.r3) n3Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGameWelfareTaskBubblePresenter", "#requestToPreloadMiniAppOnResume");
            if (r3Var.f499910m) {
                r3Var.f499910m = false;
            } else {
                r3Var.c();
            }
        }
        if (n3Var != null) {
            te2.r3 r3Var2 = (te2.r3) n3Var;
            r3Var2.g(r3Var2.f499908h, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGameWelfareTaskBubblePlugin", "#mount");
        this.f194095q = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGameWelfareTaskBubblePlugin", "#startPollingBannerData");
        dk2.ef.f314925k.e(5, new r45.ry2(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ej(this, r45.sy2.class), false);
    }
}
