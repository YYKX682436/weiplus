package df2;

/* loaded from: classes3.dex */
public final class ug extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f313055m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f313056n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f313057o;

    /* renamed from: p, reason: collision with root package name */
    public if2.d0 f313058p;

    /* renamed from: q, reason: collision with root package name */
    public xs2.u f313059q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f313060r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f313061s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f313062t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Bitmap f313063u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f313064v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f313065w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313055m = "Finder.LiveDanmakuController";
        this.f313056n = jz5.h.b(df2.rg.f312779d);
        this.f313057o = jz5.h.b(new df2.eg(this, store));
        this.f313060r = jz5.h.b(df2.tg.f312973d);
        this.f313061s = jz5.h.b(df2.sg.f312872d);
        this.f313062t = jz5.h.b(df2.vf.f313133d);
        this.f313065w = jz5.h.b(df2.uf.f313054d);
    }

    public final void Z6(java.lang.String str, android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar;
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
        if (ubVar == null || (khVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh) ubVar.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh.class)) == null || (view2 = khVar.f194782w) == null) {
            return;
        }
        java.lang.String str2 = this.f313055m;
        if (z17) {
            mm2.y1 P6 = ((mm2.j2) m56788xbba4bfc0(mm2.j2.class)).P6();
            if ((P6 != null ? P6.f411085a : null) == mm2.e2.f410531e) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = 0;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(" root final topMargin:");
                android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                sb6.append(marginLayoutParams2 != null ? java.lang.Integer.valueOf(marginLayoutParams2.topMargin) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                return;
            }
        }
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        int height = iArr[1] + view2.getHeight();
        if (height > 0) {
            android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.topMargin = (U6() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn)) + height;
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str);
        sb7.append(" root final topMargin:");
        android.view.ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
        sb7.append(marginLayoutParams4 != null ? java.lang.Integer.valueOf(marginLayoutParams4.topMargin) : null);
        sb7.append(",anchorBottomPoxY:");
        sb7.append(height);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
    }

    public final void a7(java.lang.String str) {
        xs2.o oVar;
        if ((this.f313058p == null || this.f313059q == null) ? false : true) {
            return;
        }
        boolean U6 = U6();
        xs2.f0 a17 = xs2.f0.f537855d.a(((mm2.j2) m56788xbba4bfc0(mm2.j2.class)).R6(), ((mm2.j2) m56788xbba4bfc0(mm2.j2.class)).P6(), ((mm2.j2) m56788xbba4bfc0(mm2.j2.class)).f410694f);
        java.lang.String str2 = this.f313055m;
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, str + " checkInit but config is null");
            return;
        }
        mm2.j2 j2Var = (mm2.j2) m56788xbba4bfc0(mm2.j2.class);
        xp.a aVar = a17.f537861c;
        j2Var.W6(aVar != null ? aVar.f537343h : 1.0f);
        ((mm2.j2) m56788xbba4bfc0(mm2.j2.class)).Y6(aVar != null ? aVar.f537337b : 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" checkInit old config:");
        xs2.u uVar = this.f313059q;
        jz5.f0 f0Var = null;
        sb6.append((uVar == null || (oVar = uVar.f537921d) == null) ? null : ((xs2.e) oVar).f537849c);
        sb6.append("\nnew config:");
        sb6.append(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        android.view.View T6 = T6(com.p314xaae8f345.mm.R.id.i79, com.p314xaae8f345.mm.R.id.i78);
        if (T6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, str + " init view but root view is null!");
            return;
        }
        int intValue = ((java.lang.Number) ae2.in.J3.r()).intValue();
        xs2.p pVar = intValue != 1 ? intValue != 2 ? intValue != 3 ? (xs2.p) T6.findViewById(com.p314xaae8f345.mm.R.id.jfa) : (xs2.p) T6.findViewById(com.p314xaae8f345.mm.R.id.jfa) : (xs2.p) T6.findViewById(com.p314xaae8f345.mm.R.id.cq_) : (xs2.p) T6.findViewById(com.p314xaae8f345.mm.R.id.cq8);
        if (pVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, str + " init view but bullet view is null!");
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(str);
        sb7.append(" isLandscape:");
        sb7.append(U6);
        sb7.append(", initView bullet:");
        sb7.append(pVar.mo58803xfb86a31b());
        sb7.append(" root origin topMargin:");
        android.view.ViewGroup.LayoutParams layoutParams = T6.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        sb7.append(marginLayoutParams != null ? java.lang.Integer.valueOf(marginLayoutParams.topMargin) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
        Z6(str, T6, U6);
        android.view.View findViewById = T6.findViewById(com.p314xaae8f345.mm.R.id.b1w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        pVar.mo58805xcf1614fc(findViewById);
        xs2.u uVar2 = new xs2.u(getStore().getLiveRoomData(), pVar, a17, (yz5.p) ((jz5.n) this.f313057o).mo141623x754a37bb());
        this.f313059q = uVar2;
        xs2.o oVar2 = uVar2.f537921d;
        if (oVar2 != null) {
            xs2.p pVar2 = uVar2.f537918a;
            pVar2.b(oVar2, null);
            android.view.View mo58803xfb86a31b = pVar2.mo58803xfb86a31b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo58803xfb86a31b, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuAdapter", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo58803xfb86a31b.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo58803xfb86a31b, "com/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuAdapter", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(uVar2.f537920c, "onAttach but manager is null!");
        }
        if2.d0 d0Var = new if2.d0(T6, this);
        this.f313058p = d0Var;
        d0Var.d(0);
    }

    public final java.lang.Runnable b7() {
        return (java.lang.Runnable) ((jz5.n) this.f313056n).mo141623x754a37bb();
    }

    public final void c7(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313055m, source.concat(" hide!"));
        xs2.u uVar = this.f313059q;
        if (uVar != null) {
            xs2.o oVar = uVar.f537921d;
            if (oVar != null) {
                ((xs2.e) oVar).n();
            }
            xs2.p pVar = uVar.f537918a;
            pVar.mo58804x3f5eee52();
            android.view.View mo58803xfb86a31b = pVar.mo58803xfb86a31b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo58803xfb86a31b, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuAdapter", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo58803xfb86a31b.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo58803xfb86a31b, "com/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuAdapter", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if2.d0 d0Var = this.f313058p;
        if (d0Var != null) {
            d0Var.d(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc ocVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214314a;
        if (ocVar.b()) {
            pm0.v.C(b7());
            ocVar.a();
        }
        this.f313058p = null;
        this.f313059q = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if ((r8 != null && r8.getHeight() == r3) == false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d7(byte[] r19) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ug.d7(byte[]):void");
    }

    public final synchronized void e7(java.lang.String source, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (z17) {
            a7(source);
        }
        f7(source);
        if (z17) {
            g7(source.concat("_updateConfig"));
        }
    }

    public final void f7(java.lang.String str) {
        xs2.o oVar;
        boolean z17 = (this.f313058p == null || this.f313059q == null) ? false : true;
        boolean U6 = U6();
        xs2.f0 a17 = xs2.f0.f537855d.a(((mm2.j2) m56788xbba4bfc0(mm2.j2.class)).R6(), ((mm2.j2) m56788xbba4bfc0(mm2.j2.class)).P6(), ((mm2.j2) m56788xbba4bfc0(mm2.j2.class)).f410694f);
        java.lang.String str2 = this.f313055m;
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, str + " updateConfig but create config null!");
            return;
        }
        android.view.View T6 = T6(com.p314xaae8f345.mm.R.id.i79, com.p314xaae8f345.mm.R.id.i78);
        if (T6 != null) {
            Z6(str, T6, U6);
        }
        xs2.u uVar = this.f313059q;
        xs2.f0 f0Var = null;
        if (uVar != null && (oVar = uVar.f537921d) != null) {
            f0Var = ((xs2.e) oVar).f537849c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str + " updateConfig hasInit:" + z17 + ", isLandscape:" + U6 + ", commentConfig:" + ((mm2.j2) m56788xbba4bfc0(mm2.j2.class)).P6() + ", cacheDanmakuConfig:" + f0Var + ", liveDanmakuConfig:" + a17);
        xs2.u uVar2 = this.f313059q;
        if (uVar2 != null) {
            xs2.o oVar2 = uVar2.f537921d;
            if (oVar2 != null) {
                ((xs2.e) oVar2).f537849c = a17;
            }
            if (oVar2 != null) {
                ((xs2.e) oVar2).k(U6);
            }
        }
        mm2.j2 j2Var = (mm2.j2) m56788xbba4bfc0(mm2.j2.class);
        xp.a aVar = a17.f537861c;
        j2Var.W6(aVar != null ? aVar.f537343h : 1.0f);
        ((mm2.j2) m56788xbba4bfc0(mm2.j2.class)).Y6(aVar != null ? aVar.f537337b : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[Catch: all -> 0x0074, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0011, B:8:0x0015, B:11:0x001d, B:13:0x003c, B:15:0x0043, B:17:0x004a, B:19:0x005f, B:20:0x0064, B:22:0x0068, B:23:0x006f, B:27:0x0022, B:28:0x0027, B:29:0x0028, B:31:0x002e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[Catch: all -> 0x0074, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0011, B:8:0x0015, B:11:0x001d, B:13:0x003c, B:15:0x0043, B:17:0x004a, B:19:0x005f, B:20:0x0064, B:22:0x0068, B:23:0x006f, B:27:0x0022, B:28:0x0027, B:29:0x0028, B:31:0x002e), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g7(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "LiveDanmaku_step2_"
            monitor-enter(r5)
            java.lang.Class<mm2.j2> r1 = mm2.j2.class
            androidx.lifecycle.c1 r1 = r5.m56788xbba4bfc0(r1)     // Catch: java.lang.Throwable -> L74
            mm2.j2 r1 = (mm2.j2) r1     // Catch: java.lang.Throwable -> L74
            mm2.y1 r2 = r1.f410706u     // Catch: java.lang.Throwable -> L74
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L39
            mm2.e2 r2 = r2.f411085a     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L39
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L28
            if (r2 != r3) goto L22
            java.util.List r1 = r1.Q6()     // Catch: java.lang.Throwable -> L74
            goto L3a
        L22:
            jz5.j r6 = new jz5.j     // Catch: java.lang.Throwable -> L74
            r6.<init>()     // Catch: java.lang.Throwable -> L74
            throw r6     // Catch: java.lang.Throwable -> L74
        L28:
            boolean r2 = r1.R6()     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L39
            jz5.g r1 = r1.f410700o     // Catch: java.lang.Throwable -> L74
            jz5.n r1 = (jz5.n) r1     // Catch: java.lang.Throwable -> L74
            java.lang.Object r1 = r1.mo141623x754a37bb()     // Catch: java.lang.Throwable -> L74
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L74
            goto L3a
        L39:
            r1 = r4
        L3a:
            if (r1 == 0) goto L72
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L74
            r2 = r2 ^ r3
            if (r2 == 0) goto L72
            r5.a7(r6)     // Catch: java.lang.Throwable -> L74
            xs2.u r2 = r5.f313059q     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L66
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L74
            r3.append(r6)     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "tag"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)     // Catch: java.lang.Throwable -> L74
            xs2.o r0 = r2.f537921d     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L64
            xs2.i0 r0 = (xs2.i0) r0     // Catch: java.lang.Throwable -> L74
            r0.c(r1, r6)     // Catch: java.lang.Throwable -> L74
        L64:
            jz5.f0 r4 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L74
        L66:
            if (r4 != 0) goto L6f
            java.lang.String r6 = r5.f313055m     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "LiveDanmaku_step2_updateDanmaku but adapter is null!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r0)     // Catch: java.lang.Throwable -> L74
        L6f:
            r1.clear()     // Catch: java.lang.Throwable -> L74
        L72:
            monitor-exit(r5)
            return
        L74:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ug.g7(java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313055m, "onLiveActivate");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        g7("onLiveStart");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.gg(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.ig(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.lg(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.ng(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new df2.pg(this, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        c7("onViewUnmount");
    }
}
