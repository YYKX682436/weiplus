package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class n2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback {
    public boolean F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public long J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(android.content.Context context, bi4.k1 showParam) {
        super(context, showParam);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showParam, "showParam");
        P(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3
    public void E() {
        boolean z17 = this.I1;
        android.widget.FrameLayout frameLayout = this.P;
        if (z17) {
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        if (!this.G1 || this.F1) {
            super.E();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3
    public void F() {
        if (!this.G1 || this.F1) {
            J();
            super.F();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N() {
        /*
            r7 = this;
            cj4.l1 r0 = r7.C
            cj4.q1 r1 = r0.g()
            cj4.q1 r0 = r0.g()
            int r0 = r0.ordinal()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == r3) goto Lb2
            r5 = 2
            if (r0 == r5) goto L18
            goto Lc7
        L18:
            java.lang.String r0 = "context"
            android.content.Context r5 = r7.f255730n
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            pf5.z r0 = pf5.z.f435481a
            boolean r6 = r5 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r6 == 0) goto La6
            androidx.appcompat.app.AppCompatActivity r5 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r5
            pf5.v r0 = r0.a(r5)
            java.lang.Class<com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC> r5 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class
            androidx.lifecycle.c1 r0 = r0.a(r5)
            java.lang.String r5 = "get(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r5)
            com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) r0
            bi4.n0 r5 = r0.P6()
            com.tencent.mm.plugin.textstatus.ui.w1 r0 = r0.O6()
            if (r0 == 0) goto L4f
            java.util.ArrayList r0 = r0.m71902xdb53ff24()
            if (r0 == 0) goto L4f
            java.lang.Object r0 = kz5.n0.a0(r0, r2)
            in5.c r0 = (in5.c) r0
            goto L50
        L4f:
            r0 = r4
        L50:
            boolean r6 = r0 instanceof ij4.d
            if (r6 == 0) goto L57
            ij4.d r0 = (ij4.d) r0
            goto L58
        L57:
            r0 = r4
        L58:
            if (r0 == 0) goto L65
            mj4.h r0 = r0.f373250d
            if (r0 == 0) goto L65
            mj4.k r0 = (mj4.k) r0
            java.lang.String r0 = r0.l()
            goto L66
        L65:
            r0 = r4
        L66:
            mj4.h r6 = r7.A
            if (r6 == 0) goto L71
            mj4.k r6 = (mj4.k) r6
            java.lang.String r6 = r6.l()
            goto L72
        L71:
            r6 = r4
        L72:
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r6)
            if (r0 != 0) goto L89
            if (r5 == 0) goto L7f
            int r0 = r5.hashCode()
            goto L80
        L7f:
            r0 = r2
        L80:
            int r5 = r7.hashCode()
            if (r0 != r5) goto L87
            goto L89
        L87:
            r0 = r2
            goto L8a
        L89:
            r0 = r3
        L8a:
            java.util.Objects.toString(r1)
            bk4.f r1 = bk4.i.a()
            mj4.h r5 = r7.A
            if (r5 == 0) goto L99
            pj4.o0 r4 = xe0.j0.a(r5, r2, r3, r4)
        L99:
            r1.m(r4)
            if (r0 == 0) goto La2
            r7.P(r2)
            goto Lc7
        La2:
            r7.P(r3)
            goto Lc7
        La6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lb2:
            java.util.Objects.toString(r1)
            bk4.f r0 = bk4.i.a()
            mj4.h r1 = r7.A
            if (r1 == 0) goto Lc1
            pj4.o0 r4 = xe0.j0.a(r1, r2, r3, r4)
        Lc1:
            r0.m(r4)
            r7.P(r3)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2.N():void");
    }

    public final void O(android.view.View view, float f17, float f18, float f19) {
        if (view != null) {
            if (f18 <= f17 && f17 <= 1.0f) {
                float f27 = f19 * f17;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(f27));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/ProfileBackStatusCardView", "setViewAlphaByPercent", "(Landroid/view/View;FFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/ProfileBackStatusCardView", "setViewAlphaByPercent", "(Landroid/view/View;FFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                return;
            }
            if (f17 < f18) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/ProfileBackStatusCardView", "setViewAlphaByPercent", "(Landroid/view/View;FFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/ProfileBackStatusCardView", "setViewAlphaByPercent", "(Landroid/view/View;FFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    public final void P(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f255723e, "updateViewsAlpha: canShow=" + z17);
        if (z17) {
            r(1.0f, 0.0f, 0.0f);
        } else {
            r(0.0f, 0.0f, 0.0f);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    public void b(int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    public void e() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    public void j(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3
    public void l(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        N();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3, bi4.p0
    public void m(java.lang.String username, mj4.h hVar, pj4.u0 u0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.A = hVar;
        N();
        super.m(username, hVar, u0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3
    public void n(al5.a0 a0Var) {
        android.content.Context context = this.f255730n;
        if (!(context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) || a0Var == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        a0Var.J0((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3
    public void o(al5.a0 a0Var) {
        android.content.Context context = this.f255730n;
        if (!(context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) || a0Var == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        a0Var.x8((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    /* renamed from: onPostClose */
    public void mo14951x73fef619() {
        android.widget.FrameLayout frameLayout;
        pj4.p0 p0Var;
        long c17 = c01.id.c() - this.J1;
        mj4.h hVar = this.A;
        boolean z17 = hVar != null && ((mj4.k) hVar).x();
        bi4.k1 k1Var = this.f255722d;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = this.M;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.nd ndVar = this.f255733p0;
            ndVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusLivePlayHandler", "onPostClose");
            ndVar.f255665d = false;
            android.widget.FrameLayout frameLayout2 = this.B;
            if (frameLayout2 != null) {
                frameLayout2.setOnTouchListener(null);
                frameLayout2.setOnLongClickListener(null);
                ndVar.b(c18690x34c5bc78, frameLayout2, false);
            }
        } else if (!k1Var.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432)) {
            java.lang.String str = this.f255732p;
            if (!(str == null || r26.n0.N(str))) {
                D();
                k();
                L();
                G();
            }
        }
        al5.a0 a0Var = this.B1;
        if (a0Var != null && (p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(this.f255730n, 9, pj4.p0.class)) != null) {
            if (k1Var.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432)) {
                p0Var.f436780r = c01.id.c() - 0;
            } else {
                p0Var.f436780r += c17;
            }
            p0Var.f436781s = a0Var.d();
        }
        al5.a0 a0Var2 = this.B1;
        if (a0Var2 != null) {
            a0Var2.g();
        }
        if (y() && this.H1) {
            b21.m.g();
        }
        bi4.o0 d17 = ((cj4.i1) this.C).d();
        if ((d17 != null && d17.k()) && (frameLayout = this.P) != null) {
            frameLayout.setVisibility(8);
        }
        this.G1 = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    /* renamed from: onPostOpen */
    public void mo14952xd2370609(boolean z17) {
        al5.a0 a0Var;
        pj4.p0 p0Var;
        al5.a0 a0Var2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f255723e, "onPostOpen");
        int i17 = 0;
        this.G1 = false;
        this.F1 = true;
        this.J1 = c01.id.c();
        if (y()) {
            boolean c17 = b21.m.c();
            this.H1 = c17;
            if (c17) {
                b21.m.f();
            }
        }
        mj4.h hVar = this.A;
        if (hVar != null && ((mj4.k) hVar).x()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.nd ndVar = this.f255733p0;
            ndVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusLivePlayHandler", "onPostOpen");
            ndVar.f255665d = true;
        }
        F();
        if ((!this.Y.f255369j ? false : !this.Z) && (a0Var2 = this.B1) != null) {
            a0Var2.a(true);
        }
        al5.a0 a0Var3 = this.B1;
        if (a0Var3 != null) {
            a0Var3.h();
        }
        boolean l17 = this.f255722d.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432);
        android.content.Context context = this.f255730n;
        if (l17 && (a0Var = this.B1) != null && (p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 9, pj4.p0.class)) != null) {
            p0Var.f436780r = c01.id.c() - 0;
            p0Var.f436781s = a0Var.d();
        }
        mj4.h hVar2 = this.A;
        if (hVar2 == null || this.f255732p == null) {
            return;
        }
        java.lang.String l18 = ((mj4.k) hVar2).l();
        java.lang.String str = this.f255732p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Intent intent = context instanceof android.app.Activity ? ((android.app.Activity) context).getIntent() : null;
        int intExtra = intent != null ? intent.getIntExtra("CONTACT_INFO_UI_SOURCE", 0) : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.tsReport", "profileReferPath:" + intExtra);
        jz5.l lVar = new jz5.l("textstatusid", l18);
        jz5.l lVar2 = new jz5.l("wx_username", str);
        jz5.l lVar3 = new jz5.l("referpath", java.lang.Integer.valueOf(intExtra));
        if (intExtra == 1 || intExtra == 6 || (intExtra >= 101 && intExtra <= 108)) {
            i17 = 1;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("textstatus_pull_exp", kz5.c1.k(lVar, lVar2, lVar3, new jz5.l("is_sns_enter_profile", java.lang.Integer.valueOf(i17))), 33629);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    /* renamed from: onPreClose */
    public void mo14953x56608c14() {
        this.G1 = true;
        al5.a0 a0Var = this.B1;
        if (a0Var != null) {
            a0Var.i();
        }
        J();
        android.content.Context context = this.f255730n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((uj4.m) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(uj4.m.class)).O6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    /* renamed from: onPreOpen */
    public void mo14954x3c9d44ae() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f255723e, "onPreOpen: ");
        this.G1 = true;
        this.F1 = false;
        al5.a0 a0Var = this.B1;
        if (a0Var != null) {
            a0Var.j();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e4 e4Var = this.Y;
        if (e4Var.f255369j) {
            e4Var.c(true);
        }
        J();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    public void p() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback
    public void q(int i17) {
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f8  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3, bi4.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(float r21, float r22, float r23) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2.r(float, float, float):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3
    public boolean s() {
        return this.f255722d.l(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3
    public int t() {
        int ordinal = this.C.g().ordinal();
        return (ordinal == 1 || ordinal == 2) ? 1 : 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3
    public boolean u(mj4.h hVar) {
        boolean u17 = super.u(hVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleThirdBack: isShowLayoutThirdContainer=");
        sb6.append(u17);
        sb6.append(", ");
        al5.a0 a0Var = this.B1;
        sb6.append(a0Var != null ? java.lang.Integer.valueOf(a0Var.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f255723e, sb6.toString());
        this.I1 = u17;
        return u17;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x() {
        /*
            r6 = this;
            boolean r0 = super.x()
            java.lang.String r1 = r6.f255723e
            r2 = 1
            if (r0 == 0) goto L10
            java.lang.String r0 = "isMute: super true"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            return r2
        L10:
            cj4.l1 r0 = r6.C
            cj4.q1 r0 = r0.g()
            cj4.q1 r3 = cj4.q1.f123555f
            if (r0 != r3) goto L1b
            return r2
        L1b:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            mj4.h r3 = r6.A
            r4 = 0
            if (r3 == 0) goto L2e
            mj4.k r3 = (mj4.k) r3
            mj4.a r3 = r3.f408600b
            int r3 = r3.f76525x91a52c19
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L2f
        L2e:
            r3 = r4
        L2f:
            r5 = 0
            r0[r5] = r3
            mj4.h r3 = r6.A
            if (r3 == 0) goto L3c
            mj4.k r3 = (mj4.k) r3
            java.lang.String r4 = r3.j()
        L3c:
            r0[r2] = r4
            java.lang.String r3 = r6.f255732p
            r4 = 2
            r0[r4] = r3
            java.lang.String r3 = "isNeedPlayVideo  mediaType:%s, field_MediaUrl:%s, username:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3, r0)
            mj4.h r0 = r6.A
            if (r0 == 0) goto L58
            r3 = r0
            mj4.k r3 = (mj4.k) r3
            mj4.a r3 = r3.f408600b
            int r3 = r3.f76525x91a52c19
            if (r3 != r4) goto L58
            r3 = r2
            goto L59
        L58:
            r3 = r5
        L59:
            if (r3 != 0) goto L6d
            if (r0 == 0) goto L67
            mj4.k r0 = (mj4.k) r0
            boolean r0 = r0.x()
            if (r0 != r2) goto L67
            r0 = r2
            goto L68
        L67:
            r0 = r5
        L68:
            if (r0 == 0) goto L6b
            goto L6d
        L6b:
            r0 = r5
            goto L6e
        L6d:
            r0 = r2
        L6e:
            if (r0 != 0) goto L71
            return r5
        L71:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "isMute: isInOpen="
            r0.<init>(r3)
            boolean r3 = r6.G1
            r0.append(r3)
            java.lang.String r3 = ", isPostOpen="
            r0.append(r3)
            boolean r3 = r6.F1
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            boolean r0 = r6.F1
            if (r0 == 0) goto L99
            boolean r0 = r6.G1
            if (r0 == 0) goto L98
            goto L99
        L98:
            r2 = r5
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n2.x():boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3
    public boolean y() {
        al5.a0 a0Var = this.B1;
        if (a0Var != null && a0Var.f()) {
            return true;
        }
        mj4.h hVar = this.A;
        return hVar != null && ((mj4.k) hVar).f408600b.f76525x91a52c19 == 2;
    }
}
