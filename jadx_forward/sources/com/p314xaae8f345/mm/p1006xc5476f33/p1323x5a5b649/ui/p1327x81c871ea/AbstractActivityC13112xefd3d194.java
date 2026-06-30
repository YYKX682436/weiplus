package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea;

/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI */
/* loaded from: classes12.dex */
public abstract class AbstractActivityC13112xefd3d194 extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {
    public static final long[] H = {-2, 31536000000L, 7862400000L, -1};
    public static final int[][] I;

    /* renamed from: J, reason: collision with root package name */
    public static final int[][] f177231J;
    public static final int[][] K;
    public static final int[][] L;
    public java.lang.Runnable F;

    /* renamed from: d, reason: collision with root package name */
    public int f177232d;

    /* renamed from: e, reason: collision with root package name */
    public int f177233e;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f177235g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f177236h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f177237i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f177238m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f177239n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f177240o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f177241p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f177242q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.drawable.Drawable f177243r;

    /* renamed from: s, reason: collision with root package name */
    public long f177244s;

    /* renamed from: t, reason: collision with root package name */
    public long f177245t;

    /* renamed from: u, reason: collision with root package name */
    public yv1.g1 f177246u;

    /* renamed from: v, reason: collision with root package name */
    public int f177247v;

    /* renamed from: x, reason: collision with root package name */
    public long[] f177249x;

    /* renamed from: f, reason: collision with root package name */
    public final long f177234f = java.lang.System.currentTimeMillis();

    /* renamed from: w, reason: collision with root package name */
    public long f177248w = -2;

    /* renamed from: y, reason: collision with root package name */
    public int f177250y = 0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Boolean f177251z = null;
    public int A = 0;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public final int[] G = new int[5];

    static {
        int[] iArr = ot1.h.U;
        int[] iArr2 = ot1.h.f430371p0;
        I = new int[][]{ot1.h.Q, iArr, iArr2, ot1.h.f430376y1, iArr, iArr2};
        int[] iArr3 = ot1.h.Y;
        int[] iArr4 = ot1.h.f430372p1;
        f177231J = new int[][]{null, iArr3, iArr4, ot1.h.A1, iArr3, iArr4};
        int[] iArr5 = ot1.h.V;
        int[] iArr6 = ot1.h.f430373x0;
        K = new int[][]{ot1.h.R, iArr5, iArr6, iArr5, iArr6};
        int[] iArr7 = ot1.h.W;
        int[] iArr8 = ot1.h.f430375y0;
        L = new int[][]{ot1.h.S, iArr7, iArr8, iArr7, iArr8};
    }

    public abstract void U6(boolean z17, cw1.b3 b3Var, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab);

    public abstract void V6();

    public final void W6(int i17, int i18) {
        this.G[i17] = i18;
        e7(new int[]{i17});
    }

    public void X6() {
        h7(0L, 0, 0);
        android.view.View view = this.f177239n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "enterLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "enterLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f177240o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "enterLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "enterLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f177241p;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "enterLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "enterLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public int[] Y6(boolean z17) {
        return (d7() ? z17 ? L : K : z17 ? f177231J : I)[this.f177247v];
    }

    public long[] Z6() {
        long[] jArr;
        long j17 = this.f177248w;
        return (j17 != -1 || (jArr = this.f177249x) == null) ? j17 > 0 ? new long[]{0, this.f177234f - j17} : new long[]{0, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697} : jArr;
    }

    public int a7() {
        if (this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5) {
            return 2;
        }
        return this.f177232d == 0 ? 3 : 1;
    }

    public void b7(boolean z17, boolean z18) {
        android.content.res.Resources resources = getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new cw1.x2(this, resources.getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559511f), 0));
        if (z17) {
            java.lang.String[] stringArray = resources.getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559513g);
            arrayList.add(new cw1.y2(this, stringArray, 0, stringArray));
        }
        if (z18) {
            arrayList.add(new cw1.z2(this, d7() ? resources.getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559519b9) : resources.getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559516h), 0));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0 c22684x1bd928a0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0) findViewById(com.p314xaae8f345.mm.R.id.e4f);
        c22684x1bd928a0.m81949xf0b64aeb(arrayList);
        if (arrayList.size() == 1) {
            c22684x1bd928a0.m81950xe77956e5(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.x2.AlignLeft);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.c7(boolean, boolean, boolean):void");
    }

    public final boolean d7() {
        int i17 = this.f177232d;
        return i17 == 3 || i17 == 4;
    }

    public abstract void e7(int[] iArr);

    public abstract void f7(boolean z17);

    public final void g7(final int i17, final int i18, final long j17, long j18) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showDeleteConfirm, getDiskFull = ");
        boolean z17 = l75.d1.f398478a;
        sb6.append(l75.d1.f398478a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingBaseUI", sb6.toString());
        boolean z18 = j18 == 0;
        long j19 = z18 ? j17 : j18;
        boolean z19 = j18 >= j17;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("storage_manage_sessionid", this.f177246u.f547576b);
        hashMap.put("chat_history_remove_scene", java.lang.Integer.valueOf(a7()));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(z18 ? "chat_history_text_confirm_float" : "chat_history_remove_confirm_float", "view_exp", hashMap, 32903);
        final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: cw1.w2$$v
            @Override // java.lang.Runnable
            public final void run() {
                long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.this;
                abstractActivityC13112xefd3d194.getClass();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("storage_ui_version", java.lang.Integer.valueOf(aw1.v.c() ? 2 : 1));
                hashMap2.put("storage_manage_sessionid", abstractActivityC13112xefd3d194.f177246u.f547576b);
                hashMap2.put("storage_enter_scene", java.lang.Integer.valueOf(i17));
                hashMap2.put("chat_history_remove_scene", java.lang.Integer.valueOf(abstractActivityC13112xefd3d194.a7()));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("chat_history_remove_ack", "view_clk", hashMap2, 32903);
            }
        };
        final java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: cw1.w2$$w
            @Override // java.lang.Runnable
            public final void run() {
                long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.this;
                abstractActivityC13112xefd3d194.getClass();
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("storage_ui_version", java.lang.Integer.valueOf(aw1.v.c() ? 2 : 1));
                hashMap2.put("storage_manage_sessionid", abstractActivityC13112xefd3d194.f177246u.f547576b);
                hashMap2.put("storage_enter_scene", java.lang.Integer.valueOf(i17));
                hashMap2.put("chat_history_remove_scene", java.lang.Integer.valueOf(abstractActivityC13112xefd3d194.a7()));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("chat_history_remove_double_ack_btn", "view_clk", hashMap2, 32903);
            }
        };
        final boolean z27 = z18;
        final java.lang.Runnable runnable3 = new java.lang.Runnable() { // from class: cw1.w2$$x
            @Override // java.lang.Runnable
            public final void run() {
                int i19 = i18;
                long j27 = j17;
                long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.this;
                abstractActivityC13112xefd3d194.getClass();
                final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(abstractActivityC13112xefd3d194, 2, 0, false);
                android.view.View inflate = android.view.LayoutInflater.from(abstractActivityC13112xefd3d194).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b6y, (android.view.ViewGroup) null);
                android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.ilt);
                android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.d2a);
                android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.dsh);
                final android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.fxu);
                final android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.enk);
                textView.setText(abstractActivityC13112xefd3d194.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8w, 0));
                textView2.setText("");
                final android.widget.TextView textView3 = (android.widget.TextView) z2Var2.f293591g.findViewById(com.p314xaae8f345.mm.R.id.b1e);
                textView3.setBackgroundColor(abstractActivityC13112xefd3d194.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                textView3.setTextColor(abstractActivityC13112xefd3d194.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560845vs));
                z2Var2.y(abstractActivityC13112xefd3d194.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8d));
                z2Var2.F = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3() { // from class: cw1.w2$$f
                    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
                    public final void a() {
                        long[] jArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.this.m108007xae7a2e7a();
                        textView3.setVisibility(8);
                        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b8h);
                        textView2.setText("");
                    }
                };
                z2Var2.j(inflate);
                z2Var2.C();
                cw1.a3 a3Var = new cw1.a3(abstractActivityC13112xefd3d194, textView3, findViewById, j27, findViewById3, textView, textView2, z2Var2, findViewById2, i19);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("storage_ui_version", java.lang.Integer.valueOf(aw1.v.c() ? 2 : 1));
                hashMap2.put("storage_manage_sessionid", abstractActivityC13112xefd3d194.f177246u.f547576b);
                hashMap2.put("storage_enter_scene", java.lang.Integer.valueOf(i17));
                hashMap2.put("chat_history_remove_scene", java.lang.Integer.valueOf(abstractActivityC13112xefd3d194.a7()));
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                boolean z28 = z27;
                ((cy1.a) rVar).Hj(z28 ? "chat_history_text_remove_ack" : "chat_history_remove_ack", "view_clk", hashMap2, 32903);
                abstractActivityC13112xefd3d194.U6(z28, a3Var, c26987xeef691ab);
            }
        };
        java.lang.String str = null;
        if (aw1.v.c()) {
            java.lang.String string = getString(z18 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572830nj5 : z19 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572828nj3 : com.p314xaae8f345.mm.R.C30867xcad56011.f572829nj4);
            java.lang.String string2 = z18 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572827nj2, fp.n0.a(j19)) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572825nj0, fp.n0.a(j19));
            if (!z18 && !z19) {
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.n99, fp.n0.a(j17 - j18));
            }
            final boolean z28 = z18;
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.W6(this, string, z18, string2, str, new java.lang.Runnable() { // from class: cw1.w2$$b
                @Override // java.lang.Runnable
                public final void run() {
                    long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.this;
                    abstractActivityC13112xefd3d194.getClass();
                    runnable.run();
                    java.lang.String string3 = abstractActivityC13112xefd3d194.getString(z28 ? com.p314xaae8f345.mm.R.C30867xcad56011.niz : com.p314xaae8f345.mm.R.C30867xcad56011.niy);
                    final java.lang.Runnable runnable4 = runnable3;
                    final java.lang.Runnable runnable5 = runnable2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b.X6(abstractActivityC13112xefd3d194, string3, null, null, new java.lang.Runnable() { // from class: cw1.w2$$o
                        @Override // java.lang.Runnable
                        public final void run() {
                            long[] jArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                            runnable4.run();
                            runnable5.run();
                        }
                    });
                }
            });
            return;
        }
        final android.content.res.Resources resources = getResources();
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(this, 1, 0, true);
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570150yo, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bxh);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bxg);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.sss);
        z2Var2.m(getString(com.p314xaae8f345.mm.R.C30867xcad56011.apj), getString(com.p314xaae8f345.mm.R.C30867xcad56011.c5q, fp.n0.a(j19)));
        z2Var2.o(2);
        v61.C30646x56d4592 c30646x56d4592 = new v61.C30646x56d4592(z2Var2);
        final boolean z29 = z18;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 p3Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3() { // from class: cw1.w2$$c
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
            public final void a() {
                int i19;
                final int i27;
                long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.this;
                abstractActivityC13112xefd3d194.getClass();
                z2Var2.B();
                runnable.run();
                final java.lang.Runnable runnable4 = runnable3;
                final java.lang.Runnable runnable5 = runnable2;
                db5.t4 t4Var = new db5.t4() { // from class: cw1.w2$$g
                    @Override // db5.t4
                    /* renamed from: onMMMenuItemSelected */
                    public final void mo888x34063ac(android.view.MenuItem menuItem, int i28) {
                        long[] jArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                        runnable4.run();
                        runnable5.run();
                    }
                };
                if (z29) {
                    i19 = com.p314xaae8f345.mm.R.C30867xcad56011.n97;
                    i27 = com.p314xaae8f345.mm.R.C30867xcad56011.f572446n95;
                } else {
                    i19 = com.p314xaae8f345.mm.R.C30867xcad56011.n96;
                    i27 = com.p314xaae8f345.mm.R.C30867xcad56011.f572445n94;
                }
                int b17 = i65.a.b(abstractActivityC13112xefd3d194, 14);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) abstractActivityC13112xefd3d194, 1, true);
                k0Var.r(abstractActivityC13112xefd3d194.getString(i19), 17, b17, null);
                final android.content.res.Resources resources2 = resources;
                k0Var.f293405n = new db5.o4() { // from class: cw1.w2$$h
                    @Override // db5.o4
                    /* renamed from: onCreateMMMenu */
                    public final void mo887xc459429a(db5.g4 g4Var) {
                        long[] jArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                        g4Var.x(1, i27, resources2.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
                    }
                };
                k0Var.f293414s = t4Var;
                k0Var.v();
            }
        };
        z2Var2.D = c30646x56d4592;
        z2Var2.E = p3Var;
        if (z18) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.n9b);
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.n9_);
        } else {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.n9a);
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.n98);
            if (j18 < j17) {
                z2Var = z2Var2;
                textView3.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.n99, fp.n0.a(j17 - j18)));
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
        this.f177235g.setEnabled(i18 < i17 && i17 > 0);
        this.f177236h.setEnabled(i18 > 0);
        this.f177238m.setEnabled(d76 || i18 > 0);
        if (d76 || j17 <= 0) {
            this.f177237i.setText("");
            this.f177242q.setEnabled(false);
        } else {
            if (z17) {
                java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.d7_, fp.n0.a(j17));
                android.text.SpannableString spannableString = new android.text.SpannableString(string + "  ");
                spannableString.setSpan(new android.text.style.ImageSpan(this.f177243r, 0), string.length() + 1, string.length() + 2, 33);
                str = spannableString;
            } else {
                z18 = false;
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.bom, fp.n0.a(j17));
            }
            this.f177237i.setText(str);
            this.f177242q.setEnabled(z18);
        }
        this.f177244s = j17;
        this.f177245t = j18;
        android.view.View view = this.f177239n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "updateSelection", "(JJIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "updateSelection", "(JJIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f177240o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "updateSelection", "(JJIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "updateSelection", "(JJIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f177241p;
        int i19 = i17 == 0 ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "updateSelection", "(JJIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "updateSelection", "(JJIIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f177233e = getIntent().getIntExtra("clean_ui_scene", 0);
        this.f177232d = getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingBaseUI", "Enter CleanChattingUI, scene = " + this.f177232d);
        this.f177246u = yv1.g1.f547573p.b(getIntent().getIntExtra("session", -1));
        if (m81210x448cda5d()) {
            mo2533x106ab264().o();
        }
        mo78530x8b45058f();
        mo54448x9c8c0d33(new android.view.MenuItem.OnMenuItemClickListener() { // from class: cw1.w2$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.this.finish();
                return false;
            }
        });
        mo78578x8b18f126(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.agv));
        android.view.LayoutInflater.from(this).inflate(i65.a.D(this) ? com.p314xaae8f345.mm.R.C30864xbddafb2a.e2n : com.p314xaae8f345.mm.R.C30864xbddafb2a.f570148yq, (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.skk), true);
        this.f177237i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ctb);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f568332mi1);
        this.f177235g = button;
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.w2$$l
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.this;
                abstractActivityC13112xefd3d194.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", abstractActivityC13112xefd3d194, array);
                abstractActivityC13112xefd3d194.f7(true);
                yj0.a.h(abstractActivityC13112xefd3d194, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.vkg);
        this.f177236h = button2;
        button2.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.w2$$q
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.this;
                abstractActivityC13112xefd3d194.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", abstractActivityC13112xefd3d194, array);
                abstractActivityC13112xefd3d194.f7(false);
                yj0.a.h(abstractActivityC13112xefd3d194, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (d7()) {
            android.widget.Button button3 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.d2_);
            this.f177238m = button3;
            button3.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.w2$$r
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.this;
                    abstractActivityC13112xefd3d194.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", abstractActivityC13112xefd3d194, array);
                    abstractActivityC13112xefd3d194.V6();
                    yj0.a.h(abstractActivityC13112xefd3d194, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        } else {
            android.widget.Button button4 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.crz);
            this.f177238m = button4;
            button4.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.w2$$s
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.this;
                    abstractActivityC13112xefd3d194.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", abstractActivityC13112xefd3d194, array);
                    long j17 = abstractActivityC13112xefd3d194.f177245t;
                    if (j17 == 0) {
                        final long j18 = abstractActivityC13112xefd3d194.f177244s;
                        if (j18 > 0) {
                            final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(abstractActivityC13112xefd3d194, 2, 0, true);
                            android.view.LayoutInflater from = android.view.LayoutInflater.from(abstractActivityC13112xefd3d194);
                            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570151ff, (android.view.ViewGroup) null);
                            inflate.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.w2$$e
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view2) {
                                    long j19 = j18;
                                    long[] jArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d1942 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.this;
                                    abstractActivityC13112xefd3d1942.getClass();
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = z2Var;
                                    arrayList2.add(z2Var2);
                                    arrayList2.add(java.lang.Long.valueOf(j19));
                                    arrayList2.add(view2);
                                    java.lang.Object[] array2 = arrayList2.toArray();
                                    arrayList2.clear();
                                    yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", abstractActivityC13112xefd3d1942, array2);
                                    z2Var2.B();
                                    abstractActivityC13112xefd3d1942.g7(abstractActivityC13112xefd3d1942.f177233e, 0, j19, 0L);
                                    yj0.a.h(abstractActivityC13112xefd3d1942, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                }
                            });
                            if (l75.d1.f398478a) {
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                arrayList2.add(4);
                                java.util.Collections.reverse(arrayList2);
                                yj0.a.d(inflate, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "showDeleteMessageTip", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                                yj0.a.f(inflate, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "showDeleteMessageTip", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            z2Var.p(inflate);
                            z2Var.x(0);
                            z2Var.y(abstractActivityC13112xefd3d194.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a_1));
                            z2Var.F = new v61.C30646x56d4592(z2Var);
                            android.view.View inflate2 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570150yo, (android.view.ViewGroup) null);
                            android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.bxh);
                            android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.bxg);
                            if (aw1.v.c()) {
                                z2Var.x(1);
                                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.nj6);
                                textView.setGravity(3);
                                textView2.setText(abstractActivityC13112xefd3d194.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572826nj1, fp.n0.a(j18)));
                                textView2.setGravity(3);
                                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bxb)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.nix);
                                android.view.View findViewById = inflate2.findViewById(com.p314xaae8f345.mm.R.id.ssw);
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                                arrayList3.add(8);
                                java.util.Collections.reverse(arrayList3);
                                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "showDeleteMessageTip", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                                yj0.a.f(findViewById, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "showDeleteMessageTip", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            } else {
                                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a_2);
                                textView.setGravity(17);
                                textView2.setText(abstractActivityC13112xefd3d194.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a_0, fp.n0.a(j18)));
                                textView2.setGravity(17);
                            }
                            z2Var.j(inflate2);
                            z2Var.C();
                            yj0.a.h(abstractActivityC13112xefd3d194, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        }
                    }
                    abstractActivityC13112xefd3d194.g7(abstractActivityC13112xefd3d194.f177233e, abstractActivityC13112xefd3d194.f177232d, abstractActivityC13112xefd3d194.f177244s, j17);
                    yj0.a.h(abstractActivityC13112xefd3d194, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        this.f177238m.setEnabled(false);
        this.f177238m.setVisibility(0);
        this.f177239n = findViewById(com.p314xaae8f345.mm.R.id.i3p);
        this.f177240o = findViewById(com.p314xaae8f345.mm.R.id.iml);
        this.f177241p = findViewById(com.p314xaae8f345.mm.R.id.f565761dg2);
        this.f177242q = findViewById(com.p314xaae8f345.mm.R.id.saq);
        this.f177243r = com.p314xaae8f345.mm.ui.uk.e(this, com.p314xaae8f345.mm.R.raw.f80390xa5480ade, getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        int dimension = (int) (getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.aii) * i65.a.m(this));
        this.f177243r.setBounds(0, 0, dimension, dimension);
        this.f177242q.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.w2$$t
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.this;
                abstractActivityC13112xefd3d194.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", abstractActivityC13112xefd3d194, array);
                long j17 = abstractActivityC13112xefd3d194.f177244s;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(abstractActivityC13112xefd3d194, 2, 0, true);
                android.view.View inflate = android.view.LayoutInflater.from(abstractActivityC13112xefd3d194).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570150yo, (android.view.ViewGroup) null);
                java.lang.String a17 = fp.n0.a(j17);
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bxh)).setText(abstractActivityC13112xefd3d194.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d7_, a17));
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bxg);
                textView.setText(abstractActivityC13112xefd3d194.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d78, a17));
                textView.setGravity(8388659);
                z2Var.j(inflate);
                z2Var.x(1);
                z2Var.y(abstractActivityC13112xefd3d194.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8n));
                z2Var.F = new v61.C30646x56d4592(z2Var);
                z2Var.C();
                yj0.a.h(abstractActivityC13112xefd3d194, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingBaseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        boolean d76 = d7();
        android.content.Intent intent = getIntent();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (!d76) {
            cy1.a aVar = (cy1.a) rVar;
            aVar.pk(this.f177238m, "chat_history_remove");
            aVar.fk(this.f177238m, "storage_ui_version", java.lang.Integer.valueOf(aw1.v.c() ? 2 : 1));
            aVar.fk(this.f177238m, "storage_enter_scene", java.lang.Integer.valueOf(this.f177233e));
            aVar.fk(this.f177238m, "storage_manage_sessionid", this.f177246u.f547576b);
            aVar.fk(this.f177238m, "chat_history_remove_scene", java.lang.Integer.valueOf(a7()));
            aVar.ik(this.f177238m, 8, 32903);
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("cleanSessionID");
        long longExtra = intent.getLongExtra("totalSize", 0L);
        cy1.a aVar2 = (cy1.a) rVar;
        aVar2.ak(this, iy1.c.VisualContentSelectionPage);
        aVar2.fk(this, "cache_remove_sessionid", stringExtra);
        aVar2.fk(this, "storage_manage_sessionid", this.f177246u.f547576b);
        aVar2.pk(this.f177238m, "visual_content_ack");
        aVar2.fk(this.f177238m, "cache_remove_sessionid", stringExtra);
        aVar2.fk(this.f177238m, "storage_manage_sessionid", this.f177246u.f547576b);
        aVar2.fk(this.f177238m, "cache_visual_type", java.lang.Integer.valueOf(intent.getBooleanExtra("isSent", false) ? 1 : 2));
        aVar2.fk(this.f177238m, "visual_view_type", java.lang.Integer.valueOf(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5 ? 1 : 2));
        aVar2.fk(this.f177238m, "visual_total_size", java.lang.Long.valueOf(longExtra));
        aVar2.Ai(this.f177238m, new ly1.a() { // from class: cw1.w2$$d
            @Override // ly1.a
            public final java.util.Map b(java.lang.String str) {
                long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.H;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 abstractActivityC13112xefd3d194 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194.this;
                abstractActivityC13112xefd3d194.getClass();
                return "view_clk".equals(str) ? java.util.Collections.singletonMap("visual_selected_size", java.lang.Long.valueOf(abstractActivityC13112xefd3d194.f177244s)) : java.util.Collections.emptyMap();
            }
        });
        aVar2.ik(this.f177238m, 8, 32903);
    }
}
