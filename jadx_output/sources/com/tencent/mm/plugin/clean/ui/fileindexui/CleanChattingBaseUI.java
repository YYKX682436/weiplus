package com.tencent.mm.plugin.clean.ui.fileindexui;

/* loaded from: classes12.dex */
public abstract class CleanChattingBaseUI extends com.tencent.mm.ui.vas.VASActivity {
    public static final long[] H = {-2, 31536000000L, 7862400000L, -1};
    public static final int[][] I;

    /* renamed from: J, reason: collision with root package name */
    public static final int[][] f95698J;
    public static final int[][] K;
    public static final int[][] L;
    public java.lang.Runnable F;

    /* renamed from: d, reason: collision with root package name */
    public int f95699d;

    /* renamed from: e, reason: collision with root package name */
    public int f95700e;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f95702g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f95703h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f95704i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f95705m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f95706n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f95707o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f95708p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f95709q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.drawable.Drawable f95710r;

    /* renamed from: s, reason: collision with root package name */
    public long f95711s;

    /* renamed from: t, reason: collision with root package name */
    public long f95712t;

    /* renamed from: u, reason: collision with root package name */
    public yv1.g1 f95713u;

    /* renamed from: v, reason: collision with root package name */
    public int f95714v;

    /* renamed from: x, reason: collision with root package name */
    public long[] f95716x;

    /* renamed from: f, reason: collision with root package name */
    public final long f95701f = java.lang.System.currentTimeMillis();

    /* renamed from: w, reason: collision with root package name */
    public long f95715w = -2;

    /* renamed from: y, reason: collision with root package name */
    public int f95717y = 0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Boolean f95718z = null;
    public int A = 0;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public final int[] G = new int[5];

    static {
        int[] iArr = ot1.h.U;
        int[] iArr2 = ot1.h.f348838p0;
        I = new int[][]{ot1.h.Q, iArr, iArr2, ot1.h.f348843y1, iArr, iArr2};
        int[] iArr3 = ot1.h.Y;
        int[] iArr4 = ot1.h.f348839p1;
        f95698J = new int[][]{null, iArr3, iArr4, ot1.h.A1, iArr3, iArr4};
        int[] iArr5 = ot1.h.V;
        int[] iArr6 = ot1.h.f348840x0;
        K = new int[][]{ot1.h.R, iArr5, iArr6, iArr5, iArr6};
        int[] iArr7 = ot1.h.W;
        int[] iArr8 = ot1.h.f348842y0;
        L = new int[][]{ot1.h.S, iArr7, iArr8, iArr7, iArr8};
    }

    public abstract void U6(boolean z17, cw1.b3 b3Var, com.tencent.wcdb.support.CancellationSignal cancellationSignal);

    public abstract void V6();

    public final void W6(int i17, int i18) {
        this.G[i17] = i18;
        e7(new int[]{i17});
    }

    public void X6() {
        h7(0L, 0, 0);
        android.view.View view = this.f95706n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "enterLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "enterLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f95707o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "enterLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "enterLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f95708p;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "enterLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "enterLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public int[] Y6(boolean z17) {
        return (d7() ? z17 ? L : K : z17 ? f95698J : I)[this.f95714v];
    }

    public long[] Z6() {
        long[] jArr;
        long j17 = this.f95715w;
        return (j17 != -1 || (jArr = this.f95716x) == null) ? j17 > 0 ? new long[]{0, this.f95701f - j17} : new long[]{0, com.tencent.wcdb.core.Database.DictDefaultMatchValue} : jArr;
    }

    public int a7() {
        if (this instanceof com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI) {
            return 2;
        }
        return this.f95699d == 0 ? 3 : 1;
    }

    public void b7(boolean z17, boolean z18) {
        android.content.res.Resources resources = getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new cw1.x2(this, resources.getStringArray(com.tencent.mm.R.array.f477978f), 0));
        if (z17) {
            java.lang.String[] stringArray = resources.getStringArray(com.tencent.mm.R.array.f477980g);
            arrayList.add(new cw1.y2(this, stringArray, 0, stringArray));
        }
        if (z18) {
            arrayList.add(new cw1.z2(this, d7() ? resources.getStringArray(com.tencent.mm.R.array.f477986b9) : resources.getStringArray(com.tencent.mm.R.array.f477983h), 0));
        }
        com.tencent.mm.ui.widget.dialog.MMFilterDialog mMFilterDialog = (com.tencent.mm.ui.widget.dialog.MMFilterDialog) findViewById(com.tencent.mm.R.id.e4f);
        mMFilterDialog.setFilterItemList(arrayList);
        if (arrayList.size() == 1) {
            mMFilterDialog.setLayoutStyle(com.tencent.mm.ui.widget.dialog.x2.AlignLeft);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v5 cw1.o5, still in use, count: 2, list:
          (r13v5 cw1.o5) from 0x009e: MOVE (r7v8 cw1.o5) = (r13v5 cw1.o5)
          (r13v5 cw1.o5) from 0x0098: MOVE (r7v11 cw1.o5) = (r13v5 cw1.o5)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public void c7(boolean r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.c7(boolean, boolean, boolean):void");
    }

    public final boolean d7() {
        int i17 = this.f95699d;
        return i17 == 3 || i17 == 4;
    }

    public abstract void e7(int[] iArr);

    public abstract void f7(boolean z17);

    public final void g7(final int i17, final int i18, final long j17, long j18) {
        com.tencent.mm.ui.widget.dialog.z2 z2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showDeleteConfirm, getDiskFull = ");
        boolean z17 = l75.d1.f316945a;
        sb6.append(l75.d1.f316945a);
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingBaseUI", sb6.toString());
        boolean z18 = j18 == 0;
        long j19 = z18 ? j17 : j18;
        boolean z19 = j18 >= j17;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("storage_manage_sessionid", this.f95713u.f466043b);
        hashMap.put("chat_history_remove_scene", java.lang.Integer.valueOf(a7()));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(z18 ? "chat_history_text_confirm_float" : "chat_history_remove_confirm_float", "view_exp", hashMap, 32903);
        final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: cw1.w2$$v
            @Override // java.lang.Runnable
            public final void run() {
                long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.this;
                cleanChattingBaseUI.getClass();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("storage_ui_version", java.lang.Integer.valueOf(aw1.v.c() ? 2 : 1));
                hashMap2.put("storage_manage_sessionid", cleanChattingBaseUI.f95713u.f466043b);
                hashMap2.put("storage_enter_scene", java.lang.Integer.valueOf(i17));
                hashMap2.put("chat_history_remove_scene", java.lang.Integer.valueOf(cleanChattingBaseUI.a7()));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("chat_history_remove_ack", "view_clk", hashMap2, 32903);
            }
        };
        final java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: cw1.w2$$w
            @Override // java.lang.Runnable
            public final void run() {
                long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.this;
                cleanChattingBaseUI.getClass();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("storage_ui_version", java.lang.Integer.valueOf(aw1.v.c() ? 2 : 1));
                hashMap2.put("storage_manage_sessionid", cleanChattingBaseUI.f95713u.f466043b);
                hashMap2.put("storage_enter_scene", java.lang.Integer.valueOf(i17));
                hashMap2.put("chat_history_remove_scene", java.lang.Integer.valueOf(cleanChattingBaseUI.a7()));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("chat_history_remove_double_ack_btn", "view_clk", hashMap2, 32903);
            }
        };
        final boolean z27 = z18;
        final java.lang.Runnable runnable3 = new java.lang.Runnable() { // from class: cw1.w2$$x
            @Override // java.lang.Runnable
            public final void run() {
                int i19 = i18;
                long j27 = j17;
                long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.this;
                cleanChattingBaseUI.getClass();
                final com.tencent.wcdb.support.CancellationSignal cancellationSignal = new com.tencent.wcdb.support.CancellationSignal();
                com.tencent.mm.ui.widget.dialog.z2 z2Var2 = new com.tencent.mm.ui.widget.dialog.z2(cleanChattingBaseUI, 2, 0, false);
                android.view.View inflate = android.view.LayoutInflater.from(cleanChattingBaseUI).inflate(com.tencent.mm.R.layout.b6y, (android.view.ViewGroup) null);
                android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.ilt);
                android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.d2a);
                android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.dsh);
                final android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.fxu);
                final android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.enk);
                textView.setText(cleanChattingBaseUI.getString(com.tencent.mm.R.string.b8w, 0));
                textView2.setText("");
                final android.widget.TextView textView3 = (android.widget.TextView) z2Var2.f212058g.findViewById(com.tencent.mm.R.id.b1e);
                textView3.setBackgroundColor(cleanChattingBaseUI.getColor(com.tencent.mm.R.color.a9e));
                textView3.setTextColor(cleanChattingBaseUI.getColor(com.tencent.mm.R.color.f479312vs));
                z2Var2.y(cleanChattingBaseUI.getString(com.tencent.mm.R.string.b8d));
                z2Var2.F = new com.tencent.mm.ui.widget.dialog.p3() { // from class: cw1.w2$$f
                    @Override // com.tencent.mm.ui.widget.dialog.p3
                    public final void a() {
                        long[] jArr2 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                        com.tencent.wcdb.support.CancellationSignal.this.cancel();
                        textView3.setVisibility(8);
                        textView.setText(com.tencent.mm.R.string.b8h);
                        textView2.setText("");
                    }
                };
                z2Var2.j(inflate);
                z2Var2.C();
                cw1.a3 a3Var = new cw1.a3(cleanChattingBaseUI, textView3, findViewById, j27, findViewById3, textView, textView2, z2Var2, findViewById2, i19);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("storage_ui_version", java.lang.Integer.valueOf(aw1.v.c() ? 2 : 1));
                hashMap2.put("storage_manage_sessionid", cleanChattingBaseUI.f95713u.f466043b);
                hashMap2.put("storage_enter_scene", java.lang.Integer.valueOf(i17));
                hashMap2.put("chat_history_remove_scene", java.lang.Integer.valueOf(cleanChattingBaseUI.a7()));
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                boolean z28 = z27;
                ((cy1.a) rVar).Hj(z28 ? "chat_history_text_remove_ack" : "chat_history_remove_ack", "view_clk", hashMap2, 32903);
                cleanChattingBaseUI.U6(z28, a3Var, cancellationSignal);
            }
        };
        java.lang.String str = null;
        if (aw1.v.c()) {
            java.lang.String string = getString(z18 ? com.tencent.mm.R.string.f491297nj5 : z19 ? com.tencent.mm.R.string.f491295nj3 : com.tencent.mm.R.string.f491296nj4);
            java.lang.String string2 = z18 ? getString(com.tencent.mm.R.string.f491294nj2, fp.n0.a(j19)) : getString(com.tencent.mm.R.string.f491292nj0, fp.n0.a(j19));
            if (!z18 && !z19) {
                str = getString(com.tencent.mm.R.string.n99, fp.n0.a(j17 - j18));
            }
            final boolean z28 = z18;
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.W6(this, string, z18, string2, str, new java.lang.Runnable() { // from class: cw1.w2$$b
                @Override // java.lang.Runnable
                public final void run() {
                    long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                    com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.this;
                    cleanChattingBaseUI.getClass();
                    runnable.run();
                    java.lang.String string3 = cleanChattingBaseUI.getString(z28 ? com.tencent.mm.R.string.niz : com.tencent.mm.R.string.niy);
                    final java.lang.Runnable runnable4 = runnable3;
                    final java.lang.Runnable runnable5 = runnable2;
                    com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.X6(cleanChattingBaseUI, string3, null, null, new java.lang.Runnable() { // from class: cw1.w2$$o
                        @Override // java.lang.Runnable
                        public final void run() {
                            long[] jArr2 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                            runnable4.run();
                            runnable5.run();
                        }
                    });
                }
            });
            return;
        }
        final android.content.res.Resources resources = getResources();
        final com.tencent.mm.ui.widget.dialog.z2 z2Var2 = new com.tencent.mm.ui.widget.dialog.z2(this, 1, 0, true);
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.f488617yo, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.bxh);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.bxg);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.sss);
        z2Var2.m(getString(com.tencent.mm.R.string.apj), getString(com.tencent.mm.R.string.c5q, fp.n0.a(j19)));
        z2Var2.o(2);
        v61.a0$$a a0__a = new v61.a0$$a(z2Var2);
        final boolean z29 = z18;
        com.tencent.mm.ui.widget.dialog.p3 p3Var = new com.tencent.mm.ui.widget.dialog.p3() { // from class: cw1.w2$$c
            @Override // com.tencent.mm.ui.widget.dialog.p3
            public final void a() {
                int i19;
                final int i27;
                long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.this;
                cleanChattingBaseUI.getClass();
                z2Var2.B();
                runnable.run();
                final java.lang.Runnable runnable4 = runnable3;
                final java.lang.Runnable runnable5 = runnable2;
                db5.t4 t4Var = new db5.t4() { // from class: cw1.w2$$g
                    @Override // db5.t4
                    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i28) {
                        long[] jArr2 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                        runnable4.run();
                        runnable5.run();
                    }
                };
                if (z29) {
                    i19 = com.tencent.mm.R.string.n97;
                    i27 = com.tencent.mm.R.string.f490913n95;
                } else {
                    i19 = com.tencent.mm.R.string.n96;
                    i27 = com.tencent.mm.R.string.f490912n94;
                }
                int b17 = i65.a.b(cleanChattingBaseUI, 14);
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) cleanChattingBaseUI, 1, true);
                k0Var.r(cleanChattingBaseUI.getString(i19), 17, b17, null);
                final android.content.res.Resources resources2 = resources;
                k0Var.f211872n = new db5.o4() { // from class: cw1.w2$$h
                    @Override // db5.o4
                    public final void onCreateMMMenu(db5.g4 g4Var) {
                        long[] jArr2 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                        g4Var.x(1, i27, resources2.getColor(com.tencent.mm.R.color.f479482a31));
                    }
                };
                k0Var.f211881s = t4Var;
                k0Var.v();
            }
        };
        z2Var2.D = a0__a;
        z2Var2.E = p3Var;
        if (z18) {
            textView.setText(com.tencent.mm.R.string.n9b);
            textView2.setText(com.tencent.mm.R.string.n9_);
        } else {
            textView.setText(com.tencent.mm.R.string.n9a);
            textView2.setText(com.tencent.mm.R.string.n98);
            if (j18 < j17) {
                z2Var = z2Var2;
                textView3.setText(getString(com.tencent.mm.R.string.n99, fp.n0.a(j17 - j18)));
                textView3.setVisibility(0);
                z2Var.j(inflate);
                z2Var.C();
            }
        }
        z2Var = z2Var2;
        z2Var.j(inflate);
        z2Var.C();
    }

    public void h7(long j17, int i17, int i18) {
        i7(j17, j17, i17, i18, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i7(long j17, long j18, int i17, int i18, boolean z17) {
        java.lang.String str;
        boolean d76 = d7();
        boolean z18 = true;
        this.f95702g.setEnabled(i18 < i17 && i17 > 0);
        this.f95703h.setEnabled(i18 > 0);
        this.f95705m.setEnabled(d76 || i18 > 0);
        if (d76 || j17 <= 0) {
            this.f95704i.setText("");
            this.f95709q.setEnabled(false);
        } else {
            if (z17) {
                java.lang.String string = getString(com.tencent.mm.R.string.d7_, fp.n0.a(j17));
                android.text.SpannableString spannableString = new android.text.SpannableString(string + "  ");
                spannableString.setSpan(new android.text.style.ImageSpan(this.f95710r, 0), string.length() + 1, string.length() + 2, 33);
                str = spannableString;
            } else {
                z18 = false;
                str = getString(com.tencent.mm.R.string.bom, fp.n0.a(j17));
            }
            this.f95704i.setText(str);
            this.f95709q.setEnabled(z18);
        }
        this.f95711s = j17;
        this.f95712t = j18;
        android.view.View view = this.f95706n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "updateSelection", "(JJIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "updateSelection", "(JJIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f95707o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "updateSelection", "(JJIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "updateSelection", "(JJIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f95708p;
        int i19 = i17 == 0 ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "updateSelection", "(JJIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "updateSelection", "(JJIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f95700e = getIntent().getIntExtra("clean_ui_scene", 0);
        this.f95699d = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingBaseUI", "Enter CleanChattingUI, scene = " + this.f95699d);
        this.f95713u = yv1.g1.f466040p.b(getIntent().getIntExtra("session", -1));
        if (isFragmentMode()) {
            getSupportActionBar().o();
        }
        hideActionbarLine();
        setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: cw1.w2$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.this.finish();
                return false;
            }
        });
        setNavigationbarColor(getColor(com.tencent.mm.R.color.agv));
        android.view.LayoutInflater.from(this).inflate(i65.a.D(this) ? com.tencent.mm.R.layout.e2n : com.tencent.mm.R.layout.f488615yq, (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.skk), true);
        this.f95704i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ctb);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.f486799mi1);
        this.f95702g = button;
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.w2$$l
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.this;
                cleanChattingBaseUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingBaseUI, array);
                cleanChattingBaseUI.f7(true);
                yj0.a.h(cleanChattingBaseUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.vkg);
        this.f95703h = button2;
        button2.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.w2$$q
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.this;
                cleanChattingBaseUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingBaseUI, array);
                cleanChattingBaseUI.f7(false);
                yj0.a.h(cleanChattingBaseUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (d7()) {
            android.widget.Button button3 = (android.widget.Button) findViewById(com.tencent.mm.R.id.d2_);
            this.f95705m = button3;
            button3.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.w2$$r
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                    com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.this;
                    cleanChattingBaseUI.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingBaseUI, array);
                    cleanChattingBaseUI.V6();
                    yj0.a.h(cleanChattingBaseUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        } else {
            android.widget.Button button4 = (android.widget.Button) findViewById(com.tencent.mm.R.id.crz);
            this.f95705m = button4;
            button4.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.w2$$s
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                    final com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.this;
                    cleanChattingBaseUI.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingBaseUI, array);
                    long j17 = cleanChattingBaseUI.f95712t;
                    if (j17 == 0) {
                        final long j18 = cleanChattingBaseUI.f95711s;
                        if (j18 > 0) {
                            final com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(cleanChattingBaseUI, 2, 0, true);
                            android.view.LayoutInflater from = android.view.LayoutInflater.from(cleanChattingBaseUI);
                            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.f488618ff, (android.view.ViewGroup) null);
                            inflate.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.w2$$e
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view2) {
                                    long j19 = j18;
                                    long[] jArr2 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                                    com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI2 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.this;
                                    cleanChattingBaseUI2.getClass();
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    com.tencent.mm.ui.widget.dialog.z2 z2Var2 = z2Var;
                                    arrayList2.add(z2Var2);
                                    arrayList2.add(java.lang.Long.valueOf(j19));
                                    arrayList2.add(view2);
                                    java.lang.Object[] array2 = arrayList2.toArray();
                                    arrayList2.clear();
                                    yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingBaseUI2, array2);
                                    z2Var2.B();
                                    cleanChattingBaseUI2.g7(cleanChattingBaseUI2.f95700e, 0, j19, 0L);
                                    yj0.a.h(cleanChattingBaseUI2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                }
                            });
                            if (l75.d1.f316945a) {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList2.add(4);
                                java.util.Collections.reverse(arrayList2);
                                yj0.a.d(inflate, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "showDeleteMessageTip", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                yj0.a.f(inflate, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "showDeleteMessageTip", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            z2Var.p(inflate);
                            z2Var.x(0);
                            z2Var.y(cleanChattingBaseUI.getString(com.tencent.mm.R.string.a_1));
                            z2Var.F = new v61.a0$$a(z2Var);
                            android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.f488617yo, (android.view.ViewGroup) null);
                            android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.bxh);
                            android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.bxg);
                            if (aw1.v.c()) {
                                z2Var.x(1);
                                textView.setText(com.tencent.mm.R.string.nj6);
                                textView.setGravity(3);
                                textView2.setText(cleanChattingBaseUI.getString(com.tencent.mm.R.string.f491293nj1, fp.n0.a(j18)));
                                textView2.setGravity(3);
                                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.bxb)).setText(com.tencent.mm.R.string.nix);
                                android.view.View findViewById = inflate2.findViewById(com.tencent.mm.R.id.ssw);
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                                arrayList3.add(8);
                                java.util.Collections.reverse(arrayList3);
                                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "showDeleteMessageTip", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                                yj0.a.f(findViewById, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "showDeleteMessageTip", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            } else {
                                textView.setText(com.tencent.mm.R.string.a_2);
                                textView.setGravity(17);
                                textView2.setText(cleanChattingBaseUI.getString(com.tencent.mm.R.string.a_0, fp.n0.a(j18)));
                                textView2.setGravity(17);
                            }
                            z2Var.j(inflate2);
                            z2Var.C();
                            yj0.a.h(cleanChattingBaseUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        }
                    }
                    cleanChattingBaseUI.g7(cleanChattingBaseUI.f95700e, cleanChattingBaseUI.f95699d, cleanChattingBaseUI.f95711s, j17);
                    yj0.a.h(cleanChattingBaseUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        this.f95705m.setEnabled(false);
        this.f95705m.setVisibility(0);
        this.f95706n = findViewById(com.tencent.mm.R.id.i3p);
        this.f95707o = findViewById(com.tencent.mm.R.id.iml);
        this.f95708p = findViewById(com.tencent.mm.R.id.f484228dg2);
        this.f95709q = findViewById(com.tencent.mm.R.id.saq);
        this.f95710r = com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.info_circle_regular, getColor(com.tencent.mm.R.color.f479232tk));
        int dimension = (int) (getResources().getDimension(com.tencent.mm.R.dimen.aii) * i65.a.m(this));
        this.f95710r.setBounds(0, 0, dimension, dimension);
        this.f95709q.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.w2$$t
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.this;
                cleanChattingBaseUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingBaseUI, array);
                long j17 = cleanChattingBaseUI.f95711s;
                com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(cleanChattingBaseUI, 2, 0, true);
                android.view.View inflate = android.view.LayoutInflater.from(cleanChattingBaseUI).inflate(com.tencent.mm.R.layout.f488617yo, (android.view.ViewGroup) null);
                java.lang.String a17 = fp.n0.a(j17);
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.bxh)).setText(cleanChattingBaseUI.getString(com.tencent.mm.R.string.d7_, a17));
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.bxg);
                textView.setText(cleanChattingBaseUI.getString(com.tencent.mm.R.string.d78, a17));
                textView.setGravity(8388659);
                z2Var.j(inflate);
                z2Var.x(1);
                z2Var.y(cleanChattingBaseUI.getString(com.tencent.mm.R.string.b8n));
                z2Var.F = new v61.a0$$a(z2Var);
                z2Var.C();
                yj0.a.h(cleanChattingBaseUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        boolean d76 = d7();
        android.content.Intent intent = getIntent();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (!d76) {
            cy1.a aVar = (cy1.a) rVar;
            aVar.pk(this.f95705m, "chat_history_remove");
            aVar.fk(this.f95705m, "storage_ui_version", java.lang.Integer.valueOf(aw1.v.c() ? 2 : 1));
            aVar.fk(this.f95705m, "storage_enter_scene", java.lang.Integer.valueOf(this.f95700e));
            aVar.fk(this.f95705m, "storage_manage_sessionid", this.f95713u.f466043b);
            aVar.fk(this.f95705m, "chat_history_remove_scene", java.lang.Integer.valueOf(a7()));
            aVar.ik(this.f95705m, 8, 32903);
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("cleanSessionID");
        long longExtra = intent.getLongExtra("totalSize", 0L);
        cy1.a aVar2 = (cy1.a) rVar;
        aVar2.ak(this, iy1.c.VisualContentSelectionPage);
        aVar2.fk(this, "cache_remove_sessionid", stringExtra);
        aVar2.fk(this, "storage_manage_sessionid", this.f95713u.f466043b);
        aVar2.pk(this.f95705m, "visual_content_ack");
        aVar2.fk(this.f95705m, "cache_remove_sessionid", stringExtra);
        aVar2.fk(this.f95705m, "storage_manage_sessionid", this.f95713u.f466043b);
        aVar2.fk(this.f95705m, "cache_visual_type", java.lang.Integer.valueOf(intent.getBooleanExtra("isSent", false) ? 1 : 2));
        aVar2.fk(this.f95705m, "visual_view_type", java.lang.Integer.valueOf(this instanceof com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI ? 1 : 2));
        aVar2.fk(this.f95705m, "visual_total_size", java.lang.Long.valueOf(longExtra));
        aVar2.Ai(this.f95705m, new ly1.a() { // from class: cw1.w2$$d
            @Override // ly1.a
            public final java.util.Map b(java.lang.String str) {
                long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.H;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI.this;
                cleanChattingBaseUI.getClass();
                return "view_clk".equals(str) ? java.util.Collections.singletonMap("visual_selected_size", java.lang.Long.valueOf(cleanChattingBaseUI.f95711s)) : java.util.Collections.emptyMap();
            }
        });
        aVar2.ik(this.f95705m, 8, 32903);
    }
}
