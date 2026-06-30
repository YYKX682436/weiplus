package df2;

/* loaded from: classes3.dex */
public final class fi extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311676m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f311677n;

    /* renamed from: o, reason: collision with root package name */
    public r45.n73 f311678o;

    /* renamed from: p, reason: collision with root package name */
    public int f311679p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311676m = "LiveGameModePreviewController";
        this.f311679p = -1;
    }

    public final mn2.c1 Z6(java.lang.String str) {
        r45.mb4 mb4Var = new r45.mb4();
        java.lang.String str2 = str == null ? "" : str;
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("&?token=[^&]*");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(str2).replaceAll("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(replaceAll.getBytes()));
        mb4Var.set(0, str);
        mb4Var.set(1, str);
        java.lang.String k17 = hc2.l.k(replaceAll);
        mb4Var.set(46, k17);
        mb4Var.set(47, k17);
        return new mn2.c1(mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null);
    }

    public final android.graphics.Bitmap a7() {
        return this.f311677n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if ((r0.length() > 0) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b7(r45.n73 r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getGameBgUrl live_cover_url="
            r0.<init>(r1)
            r1 = 3
            com.tencent.mm.protobuf.f r2 = r8.m75936x14adae67(r1)
            r45.s63 r2 = (r45.s63) r2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L17
            java.lang.String r2 = r2.m75945x2fec8307(r4)
            goto L18
        L17:
            r2 = r3
        L18:
            r0.append(r2)
            java.lang.String r2 = ", default_live_cover_url = "
            r0.append(r2)
            com.tencent.mm.protobuf.f r2 = r8.m75936x14adae67(r4)
            r45.z53 r2 = (r45.z53) r2
            r5 = 9
            if (r2 == 0) goto L2f
            java.lang.String r2 = r2.m75945x2fec8307(r5)
            goto L30
        L2f:
            r2 = r3
        L30:
            r0.append(r2)
            java.lang.String r2 = ", icon_url = "
            r0.append(r2)
            com.tencent.mm.protobuf.f r2 = r8.m75936x14adae67(r4)
            r45.z53 r2 = (r45.z53) r2
            r6 = 2
            if (r2 == 0) goto L46
            java.lang.String r2 = r2.m75945x2fec8307(r6)
            goto L47
        L46:
            r2 = r3
        L47:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r7.f311676m
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            com.tencent.mm.protobuf.f r0 = r8.m75936x14adae67(r1)
            r45.s63 r0 = (r45.s63) r0
            r1 = 0
            if (r0 == 0) goto L71
            java.lang.String r0 = r0.m75945x2fec8307(r4)
            if (r0 == 0) goto L71
            int r2 = r0.length()
            if (r2 <= 0) goto L6a
            r2 = r4
            goto L6b
        L6a:
            r2 = r1
        L6b:
            if (r2 == 0) goto L6e
            goto L6f
        L6e:
            r0 = r3
        L6f:
            if (r0 != 0) goto L99
        L71:
            com.tencent.mm.protobuf.f r0 = r8.m75936x14adae67(r4)
            r45.z53 r0 = (r45.z53) r0
            if (r0 == 0) goto L89
            java.lang.String r0 = r0.m75945x2fec8307(r5)
            if (r0 == 0) goto L89
            int r2 = r0.length()
            if (r2 <= 0) goto L86
            r1 = r4
        L86:
            if (r1 == 0) goto L89
            goto L8a
        L89:
            r0 = r3
        L8a:
            if (r0 != 0) goto L99
            com.tencent.mm.protobuf.f r8 = r8.m75936x14adae67(r4)
            r45.z53 r8 = (r45.z53) r8
            if (r8 == 0) goto L9a
            java.lang.String r3 = r8.m75945x2fec8307(r6)
            goto L9a
        L99:
            r3 = r0
        L9a:
            if (r3 != 0) goto L9e
            java.lang.String r3 = ""
        L9e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.fi.b7(r45.n73):java.lang.String");
    }

    public final void c7(java.lang.String str) {
        wo0.c a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311676m, "onGameChange bitmapUrl=" + str);
        boolean f76 = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f7();
        pf5.u uVar = pf5.u.f435469a;
        if (f76) {
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).P).mo141623x754a37bb());
            java.lang.String a18 = com.p314xaae8f345.mm.ui.p2740x696c9db.qd.a(str, "andblur=true");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "safelyUrlConcatParam(...)");
            a17 = d1Var.a(Z6(a18));
        } else {
            a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(Z6(str));
        }
        df2.xh xhVar = new df2.xh(this);
        a17.getClass();
        a17.f529406d = xhVar;
        a17.f();
    }

    public final void d7(r45.q12 q12Var) {
        int i17;
        android.view.View S6 = S6(com.p314xaae8f345.mm.R.id.opb);
        if (S6 == null) {
            return;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (r4Var.T1(q12Var) || ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f7()) {
            if (this.f311679p == -1) {
                this.f311679p = com.p314xaae8f345.mm.ui.bl.c(O6());
            }
            android.view.View S62 = S6(com.p314xaae8f345.mm.R.id.opb);
            if (S62 != null) {
                r4Var.f(this.f311676m, S62, false, false, this.f311679p);
            }
            i17 = 0;
        } else {
            i17 = 8;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(S6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGameModePreviewController", "onModeChange", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveModeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        S6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(S6, "com/tencent/mm/plugin/finder/live/controller/LiveGameModePreviewController", "onModeChange", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveModeInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void e7() {
        r45.q12 q12Var;
        java.lang.String m75945x2fec8307;
        boolean T7 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).T7();
        boolean f76 = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311676m, "#setupCoverForScreenCastGame isLiveBefore=" + T7 + " isScreenCastGameMode=" + f76);
        if (T7 || !f76 || (q12Var = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410522s) == null) {
            return;
        }
        r45.n73 n73Var = this.f311678o;
        if (n73Var != null) {
            d7(q12Var);
            c7(b7(n73Var));
            return;
        }
        r45.xq1 xq1Var = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).C2;
        if (xq1Var == null || (m75945x2fec8307 = xq1Var.m75945x2fec8307(2)) == null) {
            return;
        }
        if (!(m75945x2fec8307.length() > 0)) {
            m75945x2fec8307 = null;
        }
        if (m75945x2fec8307 != null) {
            pq5.g l17 = new ke2.y(m75945x2fec8307, 0, false, null, false, null, 60, null).l();
            l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) O6());
            l17.K(new df2.ei(this, m75945x2fec8307, q12Var));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311676m, "#onLiveStart");
        e7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311676m, "#onViewMount");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.zh(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.bi(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.di(this, null), 3, null);
        e7();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
    }
}
