package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 f284756d;

    /* renamed from: e, reason: collision with root package name */
    public wl5.v f284757e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.r0 f284758f;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.y5 f284760h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.a6 f284761i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.z5 f284762m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.n6 f284763n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.f6 f284764o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.i6 f284765p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6 f284766q;

    /* renamed from: g, reason: collision with root package name */
    public boolean f284759g = false;

    /* renamed from: r, reason: collision with root package name */
    public java.util.concurrent.Future f284767r = null;

    public static boolean J(java.lang.String str) {
        return !(com.p314xaae8f345.mm.p2621x8fb0427b.z3.z4(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R3(str) || c01.e2.G(str) || c01.e2.U(str)) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if ((c01.id.c() - r0) > r6) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if ((c01.id.c() - r0) > u04.d.f505010c) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006a, code lost:
    
        if ((c01.id.c() - r0) > r2) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006c, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean L(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r14, yb5.d r15) {
        /*
            long r0 = r14.mo78012x3fdd41df()
            java.lang.Class<e42.e0> r15 = e42.e0.class
            i95.m r2 = i95.n0.c(r15)
            e42.e0 r2 = (e42.e0) r2
            e42.d0 r3 = e42.d0.clicfg_message_file_revoke_time
            h62.d r2 = (h62.d) r2
            r4 = 120000(0x1d4c0, double:5.9288E-319)
            long r2 = r2.Ui(r3, r4)
            i95.m r6 = i95.n0.c(r15)
            e42.e0 r6 = (e42.e0) r6
            e42.d0 r7 = e42.d0.clicfg_android_transfer_revoke_timelimit
            h62.d r6 = (h62.d) r6
            long r6 = r6.Ui(r7, r4)
            boolean r8 = r14.k2()
            r9 = 419430449(0x19000031, float:6.6174836E-24)
            java.lang.String r10 = "MicroMsg.ChattingItem"
            r11 = 0
            r12 = 1
            if (r8 == 0) goto L80
            java.lang.String r8 = r14.j()
            ot0.q r8 = ot0.q.v(r8)
            if (r8 == 0) goto L70
            ez.v0 r13 = ez.v0.f339310a
            int r8 = r8.f430199i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r8 = r13.j(r8)
            if (r8 == 0) goto L70
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            long r5 = c01.id.c()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6}
            java.lang.String r5 = "File revoke time is ：%s, TimeHelper.getSyncServerTimeMs(): %s, msgTime: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r5, r4)
            long r4 = c01.id.c()
            long r4 = r4 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6e
        L6c:
            r0 = r12
            goto L8a
        L6e:
            r0 = r11
            goto L8a
        L70:
            int r2 = r14.mo78013xfb85f7b0()
            if (r2 != r9) goto L80
            long r2 = c01.id.c()
            long r2 = r2 - r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L6e
            goto L6c
        L80:
            long r2 = c01.id.c()
            long r2 = r2 - r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L6e
            goto L6c
        L8a:
            if (r0 == 0) goto La2
            java.lang.String r15 = r14.Q0()
            long r0 = r14.I0()
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r14 = new java.lang.Object[]{r15, r14}
            java.lang.String r15 = "isRevokeExpire, msg talker: %s, svr id: %s."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r15, r14)
            return r11
        La2:
            int r0 = r14.A0()
            if (r0 == r12) goto La9
            return r11
        La9:
            java.lang.Class<c25.e> r0 = c25.e.class
            lm0.a r0 = gm0.j1.s(r0)
            c25.e r0 = (c25.e) r0
            com.tencent.mm.plugin.zero.a r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) r0
            ip.j r0 = r0.b()
            java.lang.String r1 = "ShowRevokeMsgEntry"
            int r0 = r0.b(r1, r12)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "[oneliang][isRevokeMsgEnable] enable:%d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r2, r1)
            int r14 = r14.mo78013xfb85f7b0()
            if (r14 != r9) goto Le9
            i95.m r14 = i95.n0.c(r15)
            e42.e0 r14 = (e42.e0) r14
            e42.d0 r15 = e42.d0.clicfg_android_transfer_revoke_menu_config
            h62.d r14 = (h62.d) r14
            int r14 = r14.Ni(r15, r11)
            long r14 = (long) r14
            if (r0 != r12) goto Le8
            r0 = 1
            int r14 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r14 != 0) goto Le8
            r11 = r12
        Le8:
            return r11
        Le9:
            if (r12 != r0) goto Lec
            r11 = r12
        Lec:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(com.tencent.mm.storage.f9, yb5.d):boolean");
    }

    public static void T(android.widget.ImageView imageView, java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, str2);
        }
    }

    public static void U(android.widget.ImageView imageView, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bgo);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, str);
        }
    }

    public static void h(android.content.Intent intent, java.lang.String str) {
        if (intent == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.U4(str)) {
            return;
        }
        intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
    }

    public static void p(int i17, java.lang.CharSequence charSequence, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i0 i0Var) {
        ks5.a i18;
        int i19;
        java.util.Map d17;
        if (i17 == 0 || charSequence == null || charSequence.length() != c22624x85d69039.a().length() || (i18 = c22624x85d69039.i((int) (((c22624x85d69039.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561774sa) / j65.f.f379476g) - c22624x85d69039.getPaddingLeft()) - c22624x85d69039.getPaddingRight()), Integer.MAX_VALUE)) == null || (i19 = ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2839xbddafb2a.C23000xc9450414) i18).L) <= 0) {
            return;
        }
        int g17 = i19 <= 2 ? ((ks5.c) i18).g(0, (int) ((c22624x85d69039.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561774sa) / 2) * j65.f.f379476g)) : ((ks5.c) i18).g(2, 0.0f);
        if (g17 < 1 || g17 >= charSequence.length()) {
            return;
        }
        java.lang.String string = c22624x85d69039.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.w_);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = c22624x85d69039.getContext();
        int m84164x40077844 = (int) c22624x85d69039.m84164x40077844();
        ((ke0.e) xVar).getClass();
        android.text.SpannableString u17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.u(context, charSequence, m84164x40077844, 1, null, null, z17);
        android.text.SpannableString valueOf = android.text.SpannableString.valueOf(string);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.f0 f0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.f0(1, null, i0Var);
        valueOf.setSpan(f0Var, 0, string.length(), 17);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) u17);
        spannableStringBuilder.delete(g17, u17.length());
        spannableStringBuilder.append((java.lang.CharSequence) "...");
        spannableStringBuilder.append((java.lang.CharSequence) valueOf);
        android.text.SpannableString spannableString = new android.text.SpannableString(spannableStringBuilder.subSequence(0, spannableStringBuilder.length()));
        c22624x85d69039.c(spannableString, android.widget.TextView.BufferType.SPANNABLE, null);
        if (f9Var != null) {
            spannableString.removeSpan(f0Var);
            i0Var.a(spannableString);
            if (i17 == 2 && c01.ia.i(f9Var) == 0) {
                int i27 = g17 + 2;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.G) || (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(f9Var.G, "msgsource", null)) == null) {
                    return;
                }
                d17.put(".msgsource.sec_msg_node.clip-len", java.lang.String.valueOf(i27));
                c01.ia.O(f9Var, c01.ia.I(d17), true);
            }
        }
    }

    public static java.lang.String t(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String x17 = dVar.x();
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(x17) ? c01.w9.s(f9Var.j()) : x17;
    }

    public static java.lang.String v(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, boolean z18) {
        java.lang.String str = null;
        if (f9Var == null) {
            return null;
        }
        if (f9Var.A0() == 1) {
            return c01.z1.r();
        }
        if (z17) {
            str = c01.w9.s(f9Var.j());
        } else if (z18) {
            str = f9Var.u0();
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? f9Var.Q0() : str;
    }

    public static int y(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 z0Var) {
        int m75731xfb85f7b0 = z0Var.m75731xfb85f7b0();
        if (m75731xfb85f7b0 == 1 || m75731xfb85f7b0 == 27 || m75731xfb85f7b0 == 30) {
            return 2;
        }
        if (m75731xfb85f7b0 == 45) {
            return 6;
        }
        if (m75731xfb85f7b0 == 58) {
            return 5;
        }
        if (m75731xfb85f7b0 == 60) {
            return 7;
        }
        if (m75731xfb85f7b0 != 24) {
            return m75731xfb85f7b0 != 25 ? 0 : 3;
        }
        return 4;
    }

    public java.lang.String A(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (M()) {
            return dVar.t();
        }
        java.lang.String x17 = dVar.x();
        if (!c0(dVar)) {
            return x17;
        }
        if (!dVar.D()) {
            return f9Var != null ? f9Var.u0() : x17;
        }
        java.lang.String s17 = c01.w9.s(f9Var.j());
        return (s17 == null || s17.length() <= 0) ? x17 : s17;
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.n6 B(yb5.d dVar) {
        if (this.f284763n == null) {
            this.f284763n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.n6(dVar);
        }
        return this.f284763n;
    }

    public boolean C() {
        return !(this instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1);
    }

    public void D(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, boolean z17, java.lang.String str, boolean z18, java.lang.String str2, int i18) {
        E(dVar, f9Var, i17, z17, str, z18, str2, i18, null);
    }

    public void E(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, final int i17, boolean z17, final java.lang.String str, boolean z18, final java.lang.String str2, final int i18, final rq1.k0 k0Var) {
        final int i19 = dVar.C() ? 2 : 1;
        final java.lang.String x17 = dVar.C() ? dVar.x() : "0";
        final java.lang.String A = A(dVar, f9Var);
        final java.lang.String str3 = f9Var.I0() + "";
        final java.lang.String Zi = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Zi();
        final long Vi = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Vi();
        int i27 = z18 ? 65 : 34;
        if (!z17) {
            su4.k3.d(i17, str2, i27, 0, "", Zi, str3, A, i19, x17, Vi, str.length(), i18, "", "", -1, 0);
        } else {
            final int i28 = i27;
            ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.a0$$b
                @Override // java.lang.Runnable
                public final void run() {
                    int i29 = i17;
                    java.lang.String str4 = str2;
                    int i37 = i28;
                    java.lang.String str5 = Zi;
                    java.lang.String str6 = str3;
                    java.lang.String str7 = A;
                    int i38 = i19;
                    java.lang.String str8 = x17;
                    long j17 = Vi;
                    int i39 = i18;
                    rq1.k0 k0Var2 = rq1.k0.this;
                    java.lang.String str9 = str;
                    if (k0Var2 != null) {
                        su4.k3.d(i29, str4, i37, 1, k0Var2.f480286c, str5, str6, str7, i38, str8, j17, str9.length(), i39, k0Var2.f480284a, k0Var2.f480287d, k0Var2.f480285b, k0Var2.f480288e);
                    } else {
                        rq1.k0 wi6 = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).wi(str9);
                        su4.k3.d(i29, str4, i37, 1, wi6.f480286c, str5, str6, str7, i38, str8, j17, str9.length(), i39, wi6.f480284a, wi6.f480287d, wi6.f480285b, wi6.f480288e);
                    }
                }
            });
        }
    }

    public abstract android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view);

    public void G(yb5.d dVar, android.view.View view, java.lang.Object obj) {
        view.setTag(obj);
        if (this.f284764o == null) {
            this.f284764o = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.f6(dVar);
        }
        view.setOnClickListener(this.f284764o);
    }

    public void H(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        android.widget.ProgressBar progressBar = g0Var.f39501x4004bbf3;
        if (progressBar == null) {
            return;
        }
        progressBar.setTag(com.p314xaae8f345.mm.R.id.bpk, null);
        java.util.concurrent.Future future = this.f284767r;
        if (future != null) {
            future.cancel(false);
        }
        g0Var.f39501x4004bbf3.setVisibility(8);
        g0Var.f39501x4004bbf3.setTag(com.p314xaae8f345.mm.R.id.bpi, java.lang.Long.valueOf(f9Var.mo78012x3fdd41df()));
    }

    public boolean I(sb5.z zVar, long j17) {
        if (j17 <= 0) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar;
        long j18 = kVar.f279960y0;
        if (j18 == kVar.f279958x0) {
            kVar.f279960y0 = 0L;
            int mo8143x7444f759 = kVar.mo8143x7444f759() - 1;
            while (true) {
                if (-1 < mo8143x7444f759) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = kVar.mo75871xfb80e389(mo8143x7444f759);
                    if ((mo75871xfb80e389 != null && mo75871xfb80e389.A0() == 1) && (mo75871xfb80e389.F & 4) != 4) {
                        kVar.f279960y0 = mo75871xfb80e389.m124847x74d37ac6();
                        break;
                    }
                    mo8143x7444f759--;
                } else {
                    break;
                }
            }
            j18 = kVar.f279960y0;
        }
        return j18 == j17;
    }

    public boolean K() {
        return this instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b4;
    }

    public abstract boolean M();

    public boolean N() {
        return !(this instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1);
    }

    public boolean O(android.view.MenuItem menuItem, yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar) {
        return false;
    }

    public abstract boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2);

    public abstract boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar);

    public abstract boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var);

    public void S(yb5.d dVar, rd5.d dVar2) {
    }

    public void V(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, rd5.d dVar, java.lang.String str, boolean z17, yb5.d dVar2, com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 l6Var) {
        W(g0Var, dVar, str, true, z17, dVar2, l6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 r5, rd5.d r6, java.lang.String r7, boolean r8, boolean r9, yb5.d r10, com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 r11) {
        /*
            r4 = this;
            we5.a r0 = r6.f475787d
            com.tencent.mm.storage.f9 r0 = r0.f526833b
            int r1 = r0.A0()
            r2 = 1
            if (r1 != r2) goto L72
            int r0 = r0.P0()
            r1 = -1
            if (r0 == r2) goto L2a
            r2 = 2
            if (r0 == r2) goto L2a
            r2 = 3
            if (r0 == r2) goto L2a
            r2 = 4
            if (r0 == r2) goto L2a
            r2 = 5
            if (r0 == r2) goto L26
            java.lang.String r0 = "MicroMsg.ChattingItem"
            java.lang.String r2 = "getMsgStateResId: not found this state"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r2)
            goto L2a
        L26:
            r0 = 2131236455(0x7f081667, float:1.8089133E38)
            goto L2b
        L2a:
            r0 = r1
        L2b:
            r2 = 0
            if (r0 == r1) goto L31
            r4.Z(r5, r2, r8)
        L31:
            android.widget.ImageView r8 = r5.f39499x8eebed7e
            if (r8 != 0) goto L36
            return
        L36:
            com.tencent.mm.ui.chatting.viewitems.er r3 = new com.tencent.mm.ui.chatting.viewitems.er
            r3.<init>(r6, r9, r5, r7)
            r8.setTag(r3)
            android.widget.ImageView r6 = r5.f39499x8eebed7e
            com.tencent.mm.ui.chatting.b6 r7 = r4.f284766q
            if (r7 != 0) goto L4b
            com.tencent.mm.ui.chatting.viewitems.c0 r7 = new com.tencent.mm.ui.chatting.viewitems.c0
            r7.<init>(r4, r10, r11)
            r4.f284766q = r7
        L4b:
            com.tencent.mm.ui.chatting.b6 r7 = r4.f284766q
            r6.setOnClickListener(r7)
            if (r0 == r1) goto L6b
            android.widget.ImageView r6 = r5.f39499x8eebed7e
            r6.setImageResource(r0)
            android.widget.ImageView r6 = r5.f39499x8eebed7e
            r6.setVisibility(r2)
            android.widget.ImageView r5 = r5.f39499x8eebed7e
            android.content.Context r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r7 = 2131771874(0x7f1041e2, float:1.9175091E38)
            java.lang.String r6 = r6.getString(r7)
            r5.setContentDescription(r6)
            goto L72
        L6b:
            android.widget.ImageView r5 = r5.f39499x8eebed7e
            r6 = 8
            r5.setVisibility(r6)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.W(com.tencent.mm.ui.chatting.viewitems.g0, rd5.d, java.lang.String, boolean, boolean, yb5.d, com.tencent.mm.ui.chatting.l6):void");
    }

    public void X(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, java.lang.CharSequence charSequence) {
        android.widget.TextView textView;
        if (g0Var == null || (textView = g0Var.f39502xce2b2f8d) == null) {
            return;
        }
        if (charSequence == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        g0Var.f39502xce2b2f8d.setText(charSequence);
        g0Var.f39502xce2b2f8d.setVisibility(0);
    }

    public boolean Y(int i17) {
        return true;
    }

    public void Z(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, boolean z17, boolean z18) {
        if (g0Var.f39501x4004bbf3 == null) {
            return;
        }
        if (!z17) {
            g0Var.f39501x4004bbf3.setTag(com.p314xaae8f345.mm.R.id.bpk, java.lang.Boolean.FALSE);
            java.util.concurrent.Future future = this.f284767r;
            if (future != null) {
                future.cancel(false);
            }
            g0Var.f39501x4004bbf3.setVisibility(8);
            return;
        }
        if (!z18) {
            g0Var.f39501x4004bbf3.setVisibility(0);
            g0Var.f39501x4004bbf3.setTag(com.p314xaae8f345.mm.R.id.bpk, java.lang.Boolean.TRUE);
            return;
        }
        java.lang.Object tag = g0Var.f39501x4004bbf3.getTag(com.p314xaae8f345.mm.R.id.bpi);
        if (tag != null && ((java.lang.Long) tag).longValue() < c01.id.c() - 1000) {
            g0Var.f39501x4004bbf3.setVisibility(0);
            g0Var.f39501x4004bbf3.setTag(com.p314xaae8f345.mm.R.id.bpk, java.lang.Boolean.TRUE);
            return;
        }
        java.lang.Object tag2 = g0Var.f39501x4004bbf3.getTag(com.p314xaae8f345.mm.R.id.bpk);
        if (tag2 != null && ((java.lang.Boolean) tag2).booleanValue()) {
            g0Var.f39501x4004bbf3.setVisibility(0);
            return;
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d0 d0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d0(this, g0Var);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f284767r = t0Var.z(d0Var, 1000L, false);
    }

    public boolean a0() {
        return this instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o2;
    }

    public boolean b0() {
        return !(this instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1);
    }

    public boolean c0(yb5.d dVar) {
        if (M()) {
            return false;
        }
        return dVar.D() || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).f280286r;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return null;
    }

    public boolean j(yb5.d dVar, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        m33.b1 a17 = m33.a1.a();
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        android.app.Activity g17 = dVar.g();
        ((kt.c) i0Var).getClass();
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.q(g17, mVar) || a17 == null) {
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.Q)) {
            boolean wi6 = ((yb0.c) ((zb0.y) i95.n0.c(zb0.y.class))).wi(dVar.g(), mVar.Q);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItem", "oversea game info and gpdownload url is not empty, jump to google play directy:[%s], jump result: [%b]", mVar.Q, java.lang.Boolean.valueOf(wi6));
            if (wi6) {
                return true;
            }
        }
        int i17 = dVar.D() ? 2 : 1;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5570x77700c5a c5570x77700c5a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5570x77700c5a();
        am.ke keVar = c5570x77700c5a.f135890g;
        keVar.f88673a = 2;
        keVar.f88678f = i17;
        keVar.f88675c = mVar.f67370x28d45f97;
        keVar.f88674b = dVar.g();
        c5570x77700c5a.e();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.h0) a17).Di(dVar.g(), mVar.f67370x28d45f97, 1, i17, i17);
        return true;
    }

    public void k(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, int i17, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        qk.o x07;
        if (dVar.u() == null || !dVar.u().k2() || (x07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).x0()) == null || !x07.Q0()) {
            return;
        }
        int mo8143x7444f759 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).mo8143x7444f759();
        long j17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).f280284p;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) dVar.f542241c.a(sb5.f.class))).A0();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 talker = dVar.u();
        long j18 = r01.r1.f449749j;
        int i18 = r01.r1.f449750k;
        int i19 = r01.r1.f449751l;
        r01.j jVar = r01.j.f449652a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Object obj = r01.j.f449653b;
            if (((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) obj).get(java.lang.Long.valueOf(msg.m124847x74d37ac6())) != null) {
                java.lang.Object obj2 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) obj).get(java.lang.Long.valueOf(msg.m124847x74d37ac6()));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                if (currentTimeMillis - ((java.lang.Number) obj2).longValue() < 1000) {
                    return;
                }
            }
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) obj).put(java.lang.Long.valueOf(msg.m124847x74d37ac6()), java.lang.Long.valueOf(currentTimeMillis));
            ((ku5.t0) ku5.t0.f394148d).h(new r01.i(talker, msg, i17, mo8143x7444f759, j18, i18, i19), "BizServicesReportThread");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizChattingItemReportHelper", e17, "reportServiceMsgExpose exception", new java.lang.Object[0]);
        }
    }

    public abstract void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str);

    /* JADX WARN: Removed duplicated region for block: B:205:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 r11, yb5.d r12, java.lang.String r13, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r14) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.m(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, java.lang.String, com.tencent.mm.storage.f9):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if ((r3 != null && java.lang.System.currentTimeMillis() - r3.f66825xa783a79b >= 86400000) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 r17, final yb5.d r18, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r19, final java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.n(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, com.tencent.mm.storage.f9, java.lang.String):void");
    }

    public final void o(android.view.View view, boolean z17) {
        if (view != null && (this instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.hp)) {
            int[] iArr = {com.p314xaae8f345.mm.R.id.brr, com.p314xaae8f345.mm.R.id.brn, com.p314xaae8f345.mm.R.id.f565234bs0, com.p314xaae8f345.mm.R.id.vgx, com.p314xaae8f345.mm.R.id.brx, com.p314xaae8f345.mm.R.id.che};
            for (int i17 = 0; i17 < 6; i17++) {
                android.view.View findViewById = view.findViewById(iArr[i17]);
                if (findViewById != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                    if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                        if (z17) {
                            layoutParams2.addRule(11);
                            layoutParams2.addRule(0, 0);
                        } else {
                            layoutParams2.addRule(11, 0);
                            layoutParams2.addRule(0, com.p314xaae8f345.mm.R.id.f565178bk4);
                        }
                        findViewById.setLayoutParams(layoutParams2);
                    }
                }
            }
        }
    }

    public void q(yb5.d dVar, ot0.q qVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k0 k0Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k0) qVar.y(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k0.class);
        r(dVar, k0Var != null ? java.lang.Integer.valueOf(k0Var.f273274b) : null, qVar.f430179d, qVar.f430199i, qVar.X, f9Var);
    }

    public final void r(yb5.d dVar, java.lang.Integer num, java.lang.String str, int i17, java.lang.String str2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        m33.b1 a17 = m33.a1.a();
        if (a17 != null) {
            int i18 = dVar.D() ? 2 : 1;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.h0) a17).Ni(dVar.g(), str, t(dVar, f9Var), i17, i18, str2, f9Var.I0(), dVar.x(), num != null ? num.intValue() : 0);
        }
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.i6 s(yb5.d dVar) {
        if (this.f284765p == null) {
            this.f284765p = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.i6(dVar);
        }
        return this.f284765p;
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 u(yb5.d dVar) {
        if (this.f284756d == null) {
            this.f284756d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0(this, dVar);
        }
        return this.f284756d;
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.r0 w(yb5.d dVar) {
        if (this.f284758f == null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = dVar.f542250l;
            if (abstractC21611x7536149b instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21609x9a93ea89.AppBrandServiceChattingFmUI) abstractC21611x7536149b;
                appBrandServiceChattingFmUI.getClass();
                this.f284758f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.m0(appBrandServiceChattingFmUI, appBrandServiceChattingFmUI.f279685f, this);
            } else {
                this.f284758f = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.r0(dVar, this);
            }
        }
        return this.f284758f;
    }

    public wl5.v x(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 q0Var) {
        if (this.f284757e == null) {
            this.f284757e = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s0(q0Var);
        }
        return this.f284757e;
    }

    public java.lang.String z(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        s01.h hVar;
        java.lang.String Q0 = f9Var.Q0();
        sb5.f fVar = (sb5.f) dVar.f542241c.a(sb5.f.class);
        return (!((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) fVar).f280286r || (hVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) fVar).f280277f) == null) ? Q0 : hVar.f69169xf75e5c37;
    }
}
