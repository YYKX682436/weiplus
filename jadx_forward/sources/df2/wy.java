package df2;

/* loaded from: classes10.dex */
public final class wy extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f313269m;

    /* renamed from: n, reason: collision with root package name */
    public int f313270n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f313271o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f313272p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ja0 f313273q;

    /* renamed from: r, reason: collision with root package name */
    public dk2.u4 f313274r;

    /* renamed from: s, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f313275s;

    /* renamed from: t, reason: collision with root package name */
    public final java.text.DecimalFormat f313276t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f313277u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313269m = "Finder.PKCritController";
        this.f313272p = "";
        this.f313275s = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(1, 0, u26.u.DROP_OLDEST, 2, null);
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.##");
        decimalFormat.setRoundingMode(java.math.RoundingMode.FLOOR);
        this.f313276t = decimalFormat;
    }

    public static final void Z6(df2.wy wyVar, java.lang.String str) {
        wyVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wyVar.f313269m, "jumpGiftPanel giftId:" + str);
        r45.zb4 zb4Var = new r45.zb4();
        if (str == null) {
            str = "";
        }
        zb4Var.set(0, str);
        zb4Var.set(1, java.lang.Boolean.TRUE);
        ((mm2.s2) wyVar.m56788xbba4bfc0(mm2.s2.class)).f410944p.mo7808x76db6cb1(zb4Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x00b3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(df2.wy r22, r45.ja0 r23, long r24, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r26) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.wy.a7(df2.wy, r45.ja0, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b7(dk2.u4 u4Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("emitBattleData lastBattleData:");
        dk2.u4 u4Var2 = this.f313274r;
        sb6.append(u4Var2 != null ? u4Var2.m124666x8cdac1b() : 0);
        sb6.append(", curBattle:");
        sb6.append(u4Var != null ? u4Var.m124666x8cdac1b() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313269m, sb6.toString());
        this.f313274r = u4Var;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) this.f313275s).e(u4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ViewGroup c7() {
        /*
            r8 = this;
            java.lang.Class<zi2.w> r0 = zi2.w.class
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r8.R6(r0)
            zi2.w r0 = (zi2.w) r0
            r1 = 0
            if (r0 == 0) goto L1f
            fi2.m r0 = r0.x1()
            android.view.View r0 = r0.k()
            if (r0 == 0) goto L1f
            r2 = 2131306084(0x7f092664, float:1.8230357E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto L20
        L1f:
            r0 = r1
        L20:
            java.lang.Class<zi2.w> r2 = zi2.w.class
            com.tencent.mm.plugin.finder.live.plugin.l r2 = r8.R6(r2)
            zi2.w r2 = (zi2.w) r2
            if (r2 == 0) goto L45
            java.lang.Class<mm2.c1> r3 = mm2.c1.class
            androidx.lifecycle.c1 r3 = r8.m56788xbba4bfc0(r3)
            mm2.c1 r3 = (mm2.c1) r3
            java.lang.String r3 = r3.f410385o
            fi2.m r2 = r2.x1()
            fi2.a r2 = (fi2.a) r2
            lj2.u0 r2 = r2.y(r3)
            if (r2 == 0) goto L45
            android.widget.FrameLayout r2 = r2.mo124426x1ce0d634()
            goto L46
        L45:
            r2 = r1
        L46:
            java.lang.Class<mm2.o4> r3 = mm2.o4.class
            androidx.lifecycle.c1 r3 = r8.m56788xbba4bfc0(r3)
            mm2.o4 r3 = (mm2.o4) r3
            java.util.List r3 = r3.f410857s
            int r3 = r3.size()
            if (r3 <= 0) goto La5
            java.lang.Class<mm2.o4> r1 = mm2.o4.class
            androidx.lifecycle.c1 r1 = r8.m56788xbba4bfc0(r1)
            mm2.o4 r1 = (mm2.o4) r1
            java.util.List r1 = r1.f410860v
            java.lang.String r3 = "<get-audienceLinkMicUserList>(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r3)
            monitor-enter(r1)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La2
            r3.<init>()     // Catch: java.lang.Throwable -> La2
            java.util.Iterator r4 = r1.iterator()     // Catch: java.lang.Throwable -> La2
        L6f:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> La2
            if (r5 == 0) goto L8c
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> La2
            r6 = r5
            km2.q r6 = (km2.q) r6     // Catch: java.lang.Throwable -> La2
            java.lang.Boolean r6 = r6.f390722t     // Catch: java.lang.Throwable -> La2
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> La2
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r7)     // Catch: java.lang.Throwable -> La2
            r6 = r6 ^ 1
            if (r6 == 0) goto L6f
            r3.add(r5)     // Catch: java.lang.Throwable -> La2
            goto L6f
        L8c:
            monitor-exit(r1)
            boolean r1 = r3.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L9b
            if (r2 == 0) goto La1
            r2.removeAllViews()
            goto La1
        L9b:
            if (r0 == 0) goto La0
            r0.removeAllViews()
        La0:
            r0 = r2
        La1:
            return r0
        La2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        La5:
            if (r0 == 0) goto Laa
            r0.removeAllViews()
        Laa:
            if (r2 == 0) goto Laf
            r2.removeAllViews()
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.wy.c7():android.view.ViewGroup");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if ((r5 == null || r5.length() == 0) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d7(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r4.f313270n
            r1 = 6
            java.lang.Class<mm2.c1> r2 = mm2.c1.class
            r3 = 0
            if (r0 != r1) goto L3c
            androidx.lifecycle.c1 r0 = r4.m56788xbba4bfc0(r2)
            mm2.c1 r0 = (mm2.c1) r0
            java.lang.String r0 = r0.f410385o
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r5)
            if (r0 != 0) goto L24
            if (r5 == 0) goto L21
            int r0 = r5.length()
            if (r0 != 0) goto L1f
            goto L21
        L1f:
            r0 = r3
            goto L22
        L21:
            r0 = 1
        L22:
            if (r0 == 0) goto L3c
        L24:
            r45.ja0 r0 = r4.f313273q
            if (r0 == 0) goto L3c
            r1 = 5
            java.util.LinkedList r0 = r0.m75941xfb821914(r1)
            if (r0 == 0) goto L3c
            java.lang.Object r0 = kz5.n0.Z(r0)
            r45.ai5 r0 = (r45.ai5) r0
            if (r0 == 0) goto L3c
            int r0 = r0.m75939xb282bd08(r3)
            r3 = r0
        L3c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getPKExtraTimes ret:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", curStage:"
            r0.append(r1)
            int r1 = r4.f313270n
            r0.append(r1)
            java.lang.String r1 = ", finderUserName:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = ", anchorUsername:"
            r0.append(r5)
            androidx.lifecycle.c1 r5 = r4.m56788xbba4bfc0(r2)
            mm2.c1 r5 = (mm2.c1) r5
            java.lang.String r5 = r5.f410385o
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = r4.f313269m
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.wy.d7(java.lang.String):int");
    }

    @Override // mf2.c
    public void e1() {
        b7(this.f313274r);
    }

    public final java.lang.String e7(r45.ja0 ja0Var) {
        r45.ai5 ai5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ja0Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("current_stage:");
        sb6.append(ja0Var.m75939xb282bd08(8));
        sb6.append(", stage_time_left:");
        sb6.append(ja0Var.m75939xb282bd08(9));
        sb6.append(", crit_quest_id:");
        sb6.append(ja0Var.m75945x2fec8307(11));
        sb6.append(", delivery_crit_quest:");
        sb6.append(ja0Var.m75933x41a8a7f2(6));
        sb6.append(", reward:");
        java.util.LinkedList m75941xfb821914 = ja0Var.m75941xfb821914(5);
        sb6.append((m75941xfb821914 == null || (ai5Var = (r45.ai5) kz5.n0.Z(m75941xfb821914)) == null) ? null : java.lang.Integer.valueOf(ai5Var.m75939xb282bd08(0)));
        sb6.append(", progress:");
        java.util.LinkedList m75941xfb8219142 = ja0Var.m75941xfb821914(4);
        sb6.append(m75941xfb8219142 != null ? kz5.n0.g0(m75941xfb8219142, null, null, null, 0, null, df2.dy.f311539d, 31, null) : null);
        return sb6.toString();
    }

    public final void f7(boolean z17) {
        java.util.ArrayList arrayList;
        if (((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).f410857s.size() > 0) {
            java.util.List list = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj).f390722t, java.lang.Boolean.TRUE)) {
                        arrayList.add(obj);
                    }
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                km2.q qVar = (km2.q) it.next();
                zi2.w wVar = (zi2.w) R6(zi2.w.class);
                if (wVar != null) {
                    lj2.u0 y17 = ((fi2.a) wVar.x1()).y(qVar.f390705c);
                    if (y17 != null) {
                        y17.j(z17);
                    }
                }
            }
        }
    }

    public final void g7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 giftShowInfo) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftShowInfo, "giftShowInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313269m, "onShowGiftInfo curStage:" + this.f313270n + ", giftShowInfo.targetUserName:" + giftShowInfo.f197134s);
        int m75939xb282bd08 = giftShowInfo.f197125g.m75939xb282bd08(12);
        if (this.f313270n == 6 || m75939xb282bd08 > 0) {
            java.lang.String str = giftShowInfo.f197134s;
            boolean z17 = true;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410385o)) {
                java.util.List list = ((mm2.o4) m56788xbba4bfc0(mm2.o4.class)).f410860v;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
                synchronized (list) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        km2.q qVar = (km2.q) obj;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar.f390722t, java.lang.Boolean.FALSE) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, qVar.f390705c)) {
                            break;
                        }
                    }
                }
                if (obj == null) {
                    z17 = false;
                }
            }
            if (z17) {
                float m75939xb282bd082 = (giftShowInfo.f197125g.m75939xb282bd08(10) - 100.0f) / 100.0f;
                r45.kv1 kv1Var = (r45.kv1) giftShowInfo.f197125g.m75936x14adae67(3);
                ce2.i b17 = kv1Var != null ? ce2.i.U1.b(kv1Var) : null;
                float P0 = b17 != null ? b17.P0() : 0.0f;
                float f17 = giftShowInfo.f197128m * m75939xb282bd082 * P0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313269m, "pkExtraTimes:" + m75939xb282bd082 + ", extraCount:" + f17 + ", price:" + P0 + ", giftCount:" + giftShowInfo.f197128m + ", gift id:" + giftShowInfo.f197133r + ", extraValue: " + m75939xb282bd08);
                java.lang.Number valueOf = m75939xb282bd08 > 0 ? java.lang.Integer.valueOf(m75939xb282bd08) : java.lang.Float.valueOf(f17);
                if (valueOf.floatValue() > 0.0f) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.ny(this, giftShowInfo, valueOf, null), 3, null);
                }
            }
        }
    }

    public final void h7() {
        android.view.View k17;
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313269m, "resetCriticalLayout");
        zi2.w wVar = (zi2.w) R6(zi2.w.class);
        if (wVar != null) {
            java.util.ArrayList<lj2.u0> t17 = wVar.x1().t();
            if (t17 == null) {
                t17 = new java.util.ArrayList();
            }
            for (lj2.u0 u0Var : t17) {
                android.widget.FrameLayout mo124426x1ce0d634 = u0Var.mo124426x1ce0d634();
                if (mo124426x1ce0d634 != null) {
                    mo124426x1ce0d634.removeAllViews();
                }
                android.widget.FrameLayout mo124429x4ed4a76f = u0Var.mo124429x4ed4a76f();
                if (mo124429x4ed4a76f != null) {
                    mo124429x4ed4a76f.removeAllViews();
                }
            }
        }
        zi2.w wVar2 = (zi2.w) R6(zi2.w.class);
        if (wVar2 == null || (k17 = wVar2.x1().k()) == null || (viewGroup = (android.view.ViewGroup) k17.findViewById(com.p314xaae8f345.mm.R.id.ewe)) == null) {
            return;
        }
        viewGroup.removeAllViews();
    }

    public final void i7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15392x7f6daf59 c15392x7f6daf59;
        android.view.ViewGroup c76 = c7();
        if (c76 != null) {
            android.view.View childAt = c76.getChildAt(0);
            if (childAt == null || !(childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15392x7f6daf59)) {
                c76.removeAllViews();
                android.content.Context context = c76.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                c15392x7f6daf59 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15392x7f6daf59(context);
                c76.addView(c15392x7f6daf59, new android.view.ViewGroup.LayoutParams(-1, -2));
            } else {
                c15392x7f6daf59 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15392x7f6daf59) childAt;
            }
            f7(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313269m, "setupBuffComputingUI");
            c15392x7f6daf59.setOnClickListener(df2.ry.f312808d);
            c15392x7f6daf59.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k7(r45.ja0 r17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r18) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.wy.k7(r45.ja0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void l7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15394x1f635308 c15394x1f635308;
        android.view.ViewGroup c76 = c7();
        if (c76 != null) {
            android.view.View childAt = c76.getChildAt(0);
            if (childAt == null || !(childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15394x1f635308)) {
                c76.removeAllViews();
                android.content.Context context = c76.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                c15394x1f635308 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15394x1f635308(context);
                c76.addView(c15394x1f635308, new android.view.ViewGroup.LayoutParams(-1, -2));
            } else {
                c15394x1f635308 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1663x2eb9da.C15394x1f635308) childAt;
            }
            f7(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313269m, "setupQuestComputingUI");
            c15394x1f635308.c(3, null);
            c15394x1f635308.setOnClickListener(df2.vy.f313177d);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.qy(this, null), 3, null);
    }
}
