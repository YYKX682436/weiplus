package ms4;

/* loaded from: classes8.dex */
public final class t extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: x, reason: collision with root package name */
    public static final ms4.p f412641x = new ms4.p(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f412642d;

    /* renamed from: p, reason: collision with root package name */
    public boolean f412651p;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f412653r;

    /* renamed from: s, reason: collision with root package name */
    public int f412654s;

    /* renamed from: t, reason: collision with root package name */
    public r45.v11 f412655t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29.C19062x526af630 f412656u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f412657v;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412643e = new p012xc85e97e9.p093xedfae76a.j0();

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412644f = new p012xc85e97e9.p093xedfae76a.j0();

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412645g = new p012xc85e97e9.p093xedfae76a.j0();

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412646h = new p012xc85e97e9.p093xedfae76a.j0();

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412647i = new p012xc85e97e9.p093xedfae76a.j0();

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412648m = new p012xc85e97e9.p093xedfae76a.j0();

    /* renamed from: n, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412649n = new p012xc85e97e9.p093xedfae76a.j0();

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412650o = new p012xc85e97e9.p093xedfae76a.j0();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f412652q = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f412658w = "";

    public t(int i17) {
        this.f412642d = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N6(android.app.Activity r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ms4.r
            if (r0 == 0) goto L13
            r0 = r9
            ms4.r r0 = (ms4.r) r0
            int r1 = r0.f412636g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f412636g = r1
            goto L18
        L13:
            ms4.r r0 = new ms4.r
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f412634e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f412636g
            r3 = 1
            java.lang.String r4 = "MicroMsg.WeCoinIncomeDetailViewModel"
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f412633d
            ms4.t r8 = (ms4.t) r8
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L5a
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            java.lang.String r9 = "getRealNameAuthRequest"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r9)
            androidx.lifecycle.j0 r9 = r7.f412650o
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            os4.a.a(r9, r2)
            java.lang.Class<s40.b1> r9 = s40.b1.class
            i95.m r9 = i95.n0.c(r9)
            s40.b1 r9 = (s40.b1) r9
            r0.f412633d = r7
            r0.f412636g = r3
            com.tencent.mm.feature.finder.live.t6 r9 = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) r9
            java.lang.Object r9 = r9.Ai(r8, r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            r8 = r7
        L5a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            androidx.lifecycle.j0 r0 = r8.f412650o
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            os4.a.a(r0, r1)
            if (r9 == 0) goto L76
            java.lang.String r9 = "getRealNameAuthRequest succ."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r9)
            androidx.lifecycle.j0 r8 = r8.f412649n
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.mo7808x76db6cb1(r9)
            goto L8e
        L76:
            java.lang.String r9 = "getRealNameAuthRequest failed."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r9)
            androidx.lifecycle.j0 r8 = r8.f412648m
            ms4.a r9 = new ms4.a
            r1 = 3
            r2 = -1
            java.lang.String r3 = ""
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.mo7808x76db6cb1(r9)
        L8e:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ms4.t.N6(android.app.Activity, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O6(android.app.Activity r10, java.lang.String r11, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof ms4.s
            if (r0 == 0) goto L13
            r0 = r12
            ms4.s r0 = (ms4.s) r0
            int r1 = r0.f412640g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f412640g = r1
            goto L18
        L13:
            ms4.s r0 = new ms4.s
            r0.<init>(r9, r12)
        L18:
            r5 = r0
            java.lang.Object r12 = r5.f412638e
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f412640g
            r2 = 1
            java.lang.String r8 = "MicroMsg.WeCoinIncomeDetailViewModel"
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r10 = r5.f412637d
            ms4.t r10 = (ms4.t) r10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L64
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            java.lang.String r12 = "getRealNameAuthRequest"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r12)
            androidx.lifecycle.j0 r12 = r9.f412650o
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            os4.a.a(r12, r1)
            java.lang.Class<s40.b1> r12 = s40.b1.class
            i95.m r12 = i95.n0.c(r12)
            java.lang.String r1 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r12, r1)
            r1 = r12
            s40.b1 r1 = (s40.b1) r1
            r4 = 0
            r6 = 4
            r7 = 0
            r5.f412637d = r9
            r5.f412640g = r2
            r2 = r10
            r3 = r11
            java.lang.Object r12 = s40.b1.d7(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L63
            return r0
        L63:
            r10 = r9
        L64:
            com.tencent.mm.modelbase.f r12 = (com.p314xaae8f345.mm.p944x882e457a.f) r12
            boolean r11 = r12.b()
            androidx.lifecycle.j0 r12 = r10.f412650o
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            os4.a.a(r12, r0)
            if (r11 == 0) goto L80
            java.lang.String r11 = "getRealNameNewAuthRequest succ."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r11)
            androidx.lifecycle.j0 r10 = r10.f412649n
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10.mo7808x76db6cb1(r11)
            goto L98
        L80:
            java.lang.String r11 = "getRealNameNewAuthRequest failed."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r11)
            androidx.lifecycle.j0 r10 = r10.f412648m
            ms4.a r11 = new ms4.a
            r1 = 3
            r2 = -1
            java.lang.String r3 = ""
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.mo7808x76db6cb1(r11)
        L98:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ms4.t.O6(android.app.Activity, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void P6(boolean z17, r45.v11 prepareInfo) {
        r45.kj5 kj5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prepareInfo, "prepareInfo");
        this.f412655t = prepareInfo;
        this.f412651p = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailViewModel", "refreshData use_studio_new_style:" + z17 + ", tips:" + prepareInfo.m75945x2fec8307(7));
        int i17 = 1;
        if (z17) {
            java.lang.String m75945x2fec8307 = prepareInfo.m75945x2fec8307(7);
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                this.f412651p = true;
            }
        }
        java.lang.String m75945x2fec83072 = prepareInfo.m75945x2fec8307(7);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        this.f412652q = m75945x2fec83072;
        this.f412643e.mo7808x76db6cb1(prepareInfo.m75945x2fec8307(1));
        this.f412644f.mo7808x76db6cb1(java.lang.Long.valueOf(prepareInfo.m75942xfb822ef2(0)));
        this.f412645g.mo7808x76db6cb1(java.lang.Long.valueOf(prepareInfo.m75942xfb822ef2(2)));
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f412646h;
        r45.gs2 gs2Var = (r45.gs2) prepareInfo.m75936x14adae67(5);
        if (gs2Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailViewModel", "has_realname_auth:" + gs2Var.m75933x41a8a7f2(5) + " appid:" + gs2Var.m75945x2fec8307(0) + ", category_id:" + gs2Var.m75941xfb821914(1));
            kj5Var = new r45.kj5();
            kj5Var.f460294d = gs2Var.m75945x2fec8307(0);
            kj5Var.f460295e = gs2Var.m75941xfb821914(1);
            kj5Var.f460296f = gs2Var.m75939xb282bd08(2);
            kj5Var.f460297g = gs2Var.m75945x2fec8307(3);
            kj5Var.f460298h = gs2Var.m75945x2fec8307(4);
            if ((gs2Var.m75939xb282bd08(6) != 2 && gs2Var.m75933x41a8a7f2(5)) || (gs2Var.m75939xb282bd08(6) == 2 && gs2Var.m75939xb282bd08(8) == 1)) {
                i17 = 2;
            }
            kj5Var.f460299i = i17;
        } else {
            kj5Var = null;
        }
        j0Var.mo7808x76db6cb1(kj5Var);
        this.f412653r = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) prepareInfo.m75936x14adae67(3);
        this.f412654s = prepareInfo.m75939xb282bd08(4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getIncomePageInfoRequest encashScene:");
        sb6.append(this.f412654s);
        sb6.append(", encashInterceptJumpInfo: ");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f412653r;
        sb6.append(c19786x6a1e2862 != null ? f412641x.a(c19786x6a1e2862) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailViewModel", sb6.toString());
    }

    public final void Q6(java.lang.String str, int i17, int i18, int i19, java.lang.String str2) {
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29.C19062x526af630 c19062x526af630 = this.f412656u;
        if (c19062x526af630 == null || (str3 = c19062x526af630.f260670e) == null) {
            str3 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(c19062x526af630 != null ? c19062x526af630.f260669d : 1);
        objArr[1] = str3;
        objArr[2] = str;
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = java.lang.Integer.valueOf(i18);
        objArr[5] = java.lang.Integer.valueOf(i19);
        objArr[6] = str2;
        g0Var.d(22129, objArr);
    }

    public final void R6(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29.C19062x526af630 c19062x526af630 = this.f412656u;
        if (c19062x526af630 != null) {
            java.lang.String str = c19062x526af630.f260670e;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = c19062x526af630.f260671f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21655, java.lang.Integer.valueOf(c19062x526af630.f260669d), str, java.lang.Integer.valueOf(i17), str2 != null ? str2 : "");
        }
    }
}
