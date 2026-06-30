package df2;

/* loaded from: classes3.dex */
public final class s8 extends if2.b implements if2.e, vd2.j5 {
    public android.view.View A;
    public final jz5.g A1;
    public android.view.View B;
    public df2.h7 B1;
    public android.view.View C;
    public final jz5.g C1;
    public android.widget.TextView D;
    public final jz5.g D1;
    public android.widget.TextView E;
    public final java.lang.String E1;
    public android.widget.TextView F;
    public android.widget.TextView G;
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ImageView f312830J;
    public android.view.View K;
    public android.widget.TextView L;
    public android.widget.TextView M;
    public android.view.View N;
    public android.widget.TextView P;
    public android.widget.TextView Q;
    public android.view.View R;
    public android.view.View S;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 T;
    public android.view.View U;
    public android.view.ViewGroup V;
    public android.view.ViewGroup W;
    public p3325xe03a0797.p3326xc267989b.r2 X;
    public p3325xe03a0797.p3326xc267989b.r2 Y;
    public p3325xe03a0797.p3326xc267989b.r2 Z;

    /* renamed from: l1, reason: collision with root package name */
    public long f312831l1;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312832m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f312833n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f312834o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f312835p;

    /* renamed from: p0, reason: collision with root package name */
    public android.animation.ObjectAnimator f312836p0;

    /* renamed from: p1, reason: collision with root package name */
    public final java.lang.String f312837p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f312838q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ScrollView f312839r;

    /* renamed from: s, reason: collision with root package name */
    public r45.e84 f312840s;

    /* renamed from: t, reason: collision with root package name */
    public final int f312841t;

    /* renamed from: u, reason: collision with root package name */
    public final long f312842u;

    /* renamed from: v, reason: collision with root package name */
    public final long f312843v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f312844w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f312845x;

    /* renamed from: x0, reason: collision with root package name */
    public final int f312846x0;

    /* renamed from: x1, reason: collision with root package name */
    public final java.lang.String f312847x1;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f312848y;

    /* renamed from: y0, reason: collision with root package name */
    public final long f312849y0;

    /* renamed from: y1, reason: collision with root package name */
    public if2.d0 f312850y1;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f312851z;

    /* renamed from: z1, reason: collision with root package name */
    public final jz5.g f312852z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312832m = "GiftFundingCardController";
        this.f312833n = "assets://finder_live_gift_single_click_crowfunding.pag";
        this.f312841t = 30;
        this.f312842u = 5000L;
        this.f312843v = 1500L;
        this.f312844w = jz5.h.b(new df2.f7(this));
        this.f312845x = jz5.h.b(new df2.e7(this));
        this.f312848y = jz5.h.b(df2.b7.f311319d);
        this.f312851z = jz5.h.b(new df2.c7(this));
        this.f312846x0 = 1;
        long longValue = ((java.lang.Number) ae2.in.f85221a.H().r()).longValue() * 1000;
        this.f312849y0 = longValue;
        this.f312831l1 = longValue;
        this.f312837p1 = "{$@";
        this.f312847x1 = "@$}";
        this.f312852z1 = jz5.h.b(new df2.o8(this));
        this.A1 = jz5.h.b(new df2.j7(this));
        this.B1 = df2.h7.f311840m;
        this.C1 = jz5.h.b(df2.d7.f311479d);
        this.D1 = jz5.h.b(df2.g7.f311736d);
        this.E1 = " ";
    }

    public static final void Z6(df2.s8 s8Var, java.lang.String str) {
        java.util.LinkedList m75941xfb821914;
        r45.nz3 nz3Var;
        r45.e84 e84Var = s8Var.f312840s;
        if (e84Var == null || (m75941xfb821914 = e84Var.m75941xfb821914(2)) == null || (nz3Var = (r45.nz3) kz5.n0.Z(m75941xfb821914)) == null) {
            return;
        }
        boolean z17 = nz3Var.m75939xb282bd08(2) >= nz3Var.m75939xb282bd08(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s8Var.f312832m, "[" + str + "] after send funding gift, curSize:" + nz3Var.m75939xb282bd08(2) + ", maxSize:" + nz3Var.m75939xb282bd08(1) + ", status:" + s8Var.B1);
        if (z17) {
            df2.h7 h7Var = df2.h7.f311840m;
            df2.h7 h7Var2 = df2.h7.f311837g;
            if (kz5.z.G(new df2.h7[]{h7Var, h7Var2, df2.h7.f311839i, df2.h7.f311838h}, s8Var.B1)) {
                return;
            }
            s8Var.m7(h7Var2);
        }
    }

    public static final int a7(df2.s8 s8Var) {
        return ((java.lang.Number) ((jz5.n) s8Var.D1).mo141623x754a37bb()).intValue();
    }

    @Override // vd2.j5
    public void C4() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        df2.a9 a9Var = (df2.a9) m56789x25fe639c(df2.a9.class);
        if (a9Var != null && (c14227x4262fb44 = a9Var.A) != null) {
            c14227x4262fb44.mo7808x76db6cb1(java.lang.Boolean.TRUE);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[notify2Visible] hashCode = ");
        android.view.View view = this.f312834o;
        sb6.append(view != null ? java.lang.Integer.valueOf(view.hashCode()) : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f312832m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if2.d0 d0Var = this.f312850y1;
        if (d0Var != null) {
            d0Var.d(0);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[notify2Visible] end hashCode = ");
        android.view.View view2 = this.f312834o;
        sb8.append(view2 != null ? java.lang.Integer.valueOf(view2.hashCode()) : null);
        sb8.append(", visible = ");
        android.view.View view3 = this.f312834o;
        sb8.append(view3 != null ? java.lang.Integer.valueOf(view3.getVisibility()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
        k7(1);
        if (((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410413s3 <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.i(this, oz5.m.f431862d, p3325xe03a0797.p3326xc267989b.a1.DEFAULT, new df2.a8(this, null));
        }
        if (this.B1 == df2.h7.f311835e) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.Y;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            m7(df2.h7.f311834d);
        }
    }

    @Override // vd2.j5
    public java.lang.String Q() {
        return this.f312832m;
    }

    public final void b7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312832m, "[closedOnAnimFinish]");
        df2.a9 a9Var = (df2.a9) m56789x25fe639c(df2.a9.class);
        if (a9Var != null) {
            r45.e84 e84Var = this.f312840s;
            java.lang.String m75945x2fec8307 = e84Var != null ? e84Var.m75945x2fec8307(5) : null;
            if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                java.util.LinkedList linkedList = a9Var.f311230w;
                if (!linkedList.contains(m75945x2fec8307)) {
                    linkedList.add(m75945x2fec8307);
                }
            }
        }
        m7(df2.h7.f311839i);
    }

    public final int c7() {
        return ((java.lang.Number) ((jz5.n) this.f312851z).mo141623x754a37bb()).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r1.m75933x41a8a7f2(8) == true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r3 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l d7() {
        /*
            r4 = this;
            df2.h7 r0 = r4.B1
            r45.e84 r1 = r4.f312840s
            r2 = 0
            if (r1 == 0) goto L16
            if (r1 == 0) goto L13
            r3 = 8
            boolean r1 = r1.m75933x41a8a7f2(r3)
            r3 = 1
            if (r1 != r3) goto L13
            goto L14
        L13:
            r3 = r2
        L14:
            if (r3 == 0) goto L18
        L16:
            df2.h7 r0 = df2.h7.f311840m
        L18:
            r45.e84 r1 = r4.f312840s
            if (r1 == 0) goto L2f
            r3 = 2
            java.util.LinkedList r1 = r1.m75941xfb821914(r3)
            if (r1 == 0) goto L2f
            java.lang.Object r1 = kz5.n0.Z(r1)
            r45.nz3 r1 = (r45.nz3) r1
            if (r1 == 0) goto L2f
            int r2 = r1.m75939xb282bd08(r3)
        L2f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[getCardStatus] status="
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r3 = ", curProgress="
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = r4.f312832m
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            jz5.l r1 = new jz5.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.s8.d7():jz5.l");
    }

    public final int e7(r45.e84 e84Var) {
        int i17;
        if (e84Var == null) {
            return 0;
        }
        int e17 = c01.id.e();
        int m75939xb282bd08 = e84Var.m75939xb282bd08(0);
        int m75939xb282bd082 = e84Var.m75939xb282bd08(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312832m, "[getRestTime] curTime=" + e17 + ", startTime=" + m75939xb282bd08 + ", endTime=" + m75939xb282bd082);
        if (e17 < m75939xb282bd08) {
            i17 = m75939xb282bd082 - m75939xb282bd08;
            if (i17 < 0) {
                return 0;
            }
        } else if (e17 > m75939xb282bd082 || (i17 = m75939xb282bd082 - e17) < 0) {
            return 0;
        }
        return i17;
    }

    public final android.view.View f7() {
        java.util.LinkedList m75941xfb821914;
        r45.nz3 nz3Var;
        java.util.LinkedList m75941xfb8219142;
        r45.nz3 nz3Var2;
        android.view.View view = this.C;
        r45.e84 e84Var = this.f312840s;
        boolean z17 = true;
        if (!((e84Var == null || (m75941xfb8219142 = e84Var.m75941xfb821914(2)) == null || (nz3Var2 = (r45.nz3) kz5.n0.Z(m75941xfb8219142)) == null || nz3Var2.m75939xb282bd08(3) != 0) ? false : true)) {
            r45.e84 e84Var2 = this.f312840s;
            if (!((e84Var2 == null || (m75941xfb821914 = e84Var2.m75941xfb821914(2)) == null || (nz3Var = (r45.nz3) kz5.n0.Z(m75941xfb821914)) == null || nz3Var.m75939xb282bd08(3) != 1) ? false : true)) {
                z17 = false;
            }
        }
        if (z17) {
            return view;
        }
        return null;
    }

    public final java.lang.String g7(int i17, int i18) {
        java.lang.String str;
        java.lang.String str2;
        int i19 = i17 - i18;
        if (i19 <= this.f312841t) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(i19);
            sb6.append('S');
            return sb6.toString();
        }
        int i27 = i19 / 60;
        if (i27 > 10) {
            str = java.lang.String.valueOf(i27);
        } else {
            str = "0" + i27;
        }
        int i28 = i19 - (i27 * 60);
        if (i28 < 0) {
            i28 = 0;
        }
        if (i28 > 10) {
            str2 = java.lang.String.valueOf(i28);
        } else {
            str2 = "0" + i28;
        }
        return str + ':' + str2;
    }

    public final boolean h7(r45.e84 e84Var) {
        r45.e84 e84Var2 = this.f312840s;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e84Var2 != null ? e84Var2.m75945x2fec8307(5) : null, e84Var != null ? e84Var.m75945x2fec8307(5) : null) && this.B1 == df2.h7.f311840m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r0 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i7(boolean r27) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.s8.i7(boolean):void");
    }

    public final void k7(int i17) {
        r45.nz3 nz3Var;
        if (zl2.r4.f555483a.w1()) {
            return;
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f408749a2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        r45.e84 e84Var = this.f312840s;
        if (e84Var != null) {
            jSONObject.put("task_id", e84Var.m75945x2fec8307(5));
            java.util.LinkedList m75941xfb821914 = e84Var.m75941xfb821914(2);
            if (m75941xfb821914 != null && (nz3Var = (r45.nz3) kz5.n0.Z(m75941xfb821914)) != null) {
                jSONObject.put("gift_id", nz3Var.m75945x2fec8307(0));
            }
        }
        ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void l7() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.X;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.Y;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var3 = this.Z;
        if (r2Var3 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
        }
        android.animation.ObjectAnimator objectAnimator = this.f312836p0;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        android.animation.ObjectAnimator objectAnimator2 = this.f312836p0;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.f312836p0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7(df2.h7 r27) {
        /*
            Method dump skipped, instructions count: 2320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.s8.m7(df2.h7):void");
    }

    public final void n7(android.widget.TextView textView, java.lang.String str, long j17, boolean z17) {
        int L = r26.n0.L(str, this.f312837p1, 0, false, 6, null);
        int L2 = r26.n0.L(str, this.f312847x1, 0, false, 6, null);
        if (L2 > L) {
            if (L >= 0 && L < str.length()) {
                if (L2 >= 0 && L2 < str.length()) {
                    java.lang.String substring = str.substring(this.f312837p1.length() + L, L2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    ce2.i iVar = (ce2.i) dk2.u7.f315718e.get(substring);
                    java.lang.String R0 = iVar != null ? iVar.R0() : null;
                    textView.setText(str);
                    if (R0 != null) {
                        java.lang.String str2 = R0.length() > 0 ? R0 : null;
                        if (str2 != null) {
                            android.text.SpannableString spannableString = new android.text.SpannableString(str);
                            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
                            a17.f529406d = new df2.q8(this, spannableString, L, L2, textView, j17, z17);
                            a17.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        textView.setText(str);
        android.widget.TextView textView2 = this.E;
        if (textView2 != null) {
            textView2.invalidate();
            textView2.post(new df2.p7(textView2, this, j17, z17));
        }
    }

    @Override // vd2.j5
    public void o1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        android.view.View view;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[notify2Gone] begin hashCode = ");
        android.view.View view2 = this.f312834o;
        sb6.append(view2 != null ? java.lang.Integer.valueOf(view2.hashCode()) : null);
        sb6.append(", visibleBarrier = ");
        sb6.append(this.f312850y1);
        sb6.append(", visibleBarrier-View = ");
        if2.d0 d0Var = this.f312850y1;
        sb6.append((d0Var == null || (view = d0Var.f372638a) == null) ? null : java.lang.Integer.valueOf(view.hashCode()));
        sb6.append(", isBarrierOn = ");
        if2.d0 d0Var2 = this.f312850y1;
        sb6.append(d0Var2 != null ? java.lang.Boolean.valueOf(d0Var2.f372642e) : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f312832m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        df2.a9 a9Var = (df2.a9) m56789x25fe639c(df2.a9.class);
        if (a9Var != null && (c14227x4262fb44 = a9Var.A) != null) {
            c14227x4262fb44.mo7808x76db6cb1(java.lang.Boolean.FALSE);
        }
        if2.d0 d0Var3 = this.f312850y1;
        if (d0Var3 != null) {
            d0Var3.d(8);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[notify2Gone] end hashCode = ");
        android.view.View view3 = this.f312834o;
        sb8.append(view3 != null ? java.lang.Integer.valueOf(view3.hashCode()) : null);
        sb8.append(", visible = ");
        android.view.View view4 = this.f312834o;
        sb8.append(view4 != null ? java.lang.Integer.valueOf(view4.getVisibility()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
    }

    public final void o7() {
        android.view.View view = this.C;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l R6 = R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq.class);
        if (view == null || R6 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312832m, "[unRegisterSendAgainBtnView]");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq) R6).N;
        if (tVar != null) {
            tVar.d(view);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17 c14226x69ca5d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14226x69ca5d17 c14226x69ca5d172;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo8998x9f682d55(view);
        df2.a9 a9Var = (df2.a9) m56789x25fe639c(df2.a9.class);
        if (a9Var != null && (c14226x69ca5d172 = a9Var.f311231x) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(ubVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
            c14226x69ca5d172.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar, new df2.i8(this));
        }
        df2.a9 a9Var2 = (df2.a9) m56789x25fe639c(df2.a9.class);
        if (a9Var2 != null && (c14226x69ca5d17 = a9Var2.f311232y) != null) {
            c14226x69ca5d17.f193193d = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar2 = this.f372632e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(ubVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
            c14226x69ca5d17.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar2, new df2.j8(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb442 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410419t3;
        c14227x4262fb442.f193193d = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar3 = this.f372632e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(ubVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        c14227x4262fb442.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar3, new df2.k8(this));
        je2.t tVar = (je2.t) m56788xbba4bfc0(je2.t.class);
        if (tVar != null && (c14227x4262fb44 = tVar.f380803p) != null) {
            c14227x4262fb44.f193193d = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar4 = this.f372632e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(ubVar4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
            c14227x4262fb44.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar4, new df2.l8(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb443 = ((je2.h) m56788xbba4bfc0(je2.h.class)).f380766f;
        c14227x4262fb443.f193193d = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar5 = this.f372632e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(ubVar5, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        c14227x4262fb443.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar5, new df2.m8(this));
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312832m, "[resetAllView]");
        this.f312834o = null;
        this.f312835p = null;
        this.f312838q = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.f312830J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.f312839r = null;
        this.f312850y1 = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.X;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f312840s = null;
        m7(df2.h7.f311840m);
        o7();
    }

    @Override // vd2.j5
    /* renamed from: priority */
    public int mo56972xba8879a4() {
        return 1;
    }
}
