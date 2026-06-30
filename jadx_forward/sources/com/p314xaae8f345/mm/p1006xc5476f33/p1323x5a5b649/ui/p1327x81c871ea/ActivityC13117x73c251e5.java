package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea;

@gm0.a2
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI */
/* loaded from: classes12.dex */
public class ActivityC13117x73c251e5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 {
    public static final /* synthetic */ int S = 0;
    public cw1.u2 M;
    public android.widget.ListView N;
    public java.util.Map Q;
    public final boolean P = !"0".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_clean_new_filters", "0"));
    public long R = 0;

    static {
        l75.e0 e0Var = ot1.h.P;
        l75.e0 e0Var2 = ot1.h.P;
        l75.e0 e0Var3 = ot1.h.P;
        l75.e0 e0Var4 = ot1.h.P;
        l75.e0 e0Var5 = ot1.h.P;
        l75.e0 e0Var6 = ot1.h.P;
        l75.e0 e0Var7 = ot1.h.P;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194
    public void U6(boolean z17, cw1.b3 b3Var, final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        final long[] Z6 = Z6();
        mt1.b0 b0Var = mt1.b0.f412724a;
        mt1.b0.f412734k = false;
        wz1.b.b(true);
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List list = this.M.f304882e;
        long j17 = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            cw1.c cVar = (cw1.c) list.get(size);
            if (cVar.f304368d == cVar.f304366b) {
                arrayList.add(cVar.f304365a);
                arrayList2.add(cVar);
                j17 += cVar.f304368d;
            }
        }
        final cw1.x4 x4Var = new cw1.x4(this, !z17, arrayList.size() == this.M.getCount(), j17, b3Var, c26987xeef691ab);
        ((ku5.t0) ku5.t0.f394148d).a(!z17 ? aw1.n0.b(arrayList2, Y6(z17), Z6[0], Z6[1], true, x4Var, c26987xeef691ab) : new java.lang.Runnable() { // from class: cw1.w4$$c
            @Override // java.lang.Runnable
            public final void run() {
                java.util.List list2 = arrayList;
                cw1.x4 x4Var2 = x4Var;
                com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab2 = c26987xeef691ab;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.S;
                c01.f8 f8Var = (c01.f8) i95.n0.c(c01.f8.class);
                long[] jArr = Z6;
                ((yv1.b1) f8Var).wi(list2, x4Var2, jArr[0], jArr[1], false, false, c26987xeef691ab2);
            }
        });
        yv1.f1 f1Var = yv1.g1.f547573p;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194
    public void V6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d l76 = l7();
        setResult(-1, new android.content.Intent().putExtra("select", l76));
        finish();
        mt1.b0.s(32, 0L, java.lang.Long.valueOf(l76.b()), java.lang.Long.valueOf(l76.a()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194
    public void e7(int[] iArr) {
        boolean z17;
        int length = iArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z17 = false;
                break;
            } else {
                if (iArr[i17] != 0) {
                    z17 = true;
                    break;
                }
                i17++;
            }
        }
        if (z17) {
            cw1.u2 u2Var = this.M;
            u2Var.f304882e = java.util.Collections.emptyList();
            u2Var.notifyDataSetChanged();
            X6();
            final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d l76 = l7();
            ku5.u0 u0Var = ku5.t0.f394148d;
            java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: cw1.w4$$l
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.S;
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.this.j7(l76);
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.x(callable, 0L, "CleanChattingLoad");
        } else {
            ((ku5.t0) ku5.t0.f394148d).b(new java.lang.Runnable() { // from class: cw1.w4$$b
                @Override // java.lang.Runnable
                public final void run() {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.S;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.this.m7();
                }
            }, "CleanChattingLoad");
        }
        this.N.setSelection(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194
    public void f7(boolean z17) {
        java.util.Set set;
        cw1.u2 u2Var = this.M;
        if (z17) {
            for (cw1.c cVar : u2Var.f304882e) {
                cVar.f304368d = cVar.f304366b;
                if (cVar.f304370f != null && (set = cVar.f304369e) != null) {
                    cVar.f304370f = set;
                }
            }
        } else {
            for (cw1.c cVar2 : u2Var.f304882e) {
                cVar2.f304368d = 0L;
                if (cVar2.f304370f != null) {
                    cVar2.f304370f = java.util.Collections.emptySet();
                }
            }
        }
        u2Var.notifyDataSetChanged();
        k7();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return this.P ? com.p314xaae8f345.mm.R.C30864xbddafb2a.e2r : com.p314xaae8f345.mm.R.C30864xbddafb2a.f570156yu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dc, code lost:
    
        if (((r1 != null ? r1.f1() : 8) & 8) != 8) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long[] j7(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d r36) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.j7(com.tencent.mm.plugin.clean.CleanService$SelectedItems):long[]");
    }

    public final void k7() {
        boolean z17 = !d7() && this.f177247v == 0;
        int i17 = 0;
        long j17 = 0;
        long j18 = 0;
        for (cw1.c cVar : this.M.f304882e) {
            if (cVar != null && cVar.f304368d > 0) {
                long j19 = cVar.f304366b;
                j17 += j19;
                if (z17) {
                    j19 = cVar.f304371g;
                }
                j18 += j19;
                i17++;
            }
        }
        i7(j17, j18, this.M.getCount(), i17, true);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d l7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d c13100x4dbf8b6d = new com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d();
        for (cw1.c cVar : this.M.f304882e) {
            java.util.Set msgIds = cVar.f304370f;
            if (msgIds == null) {
                msgIds = java.util.Collections.emptySet();
            }
            long j17 = cVar.f304368d;
            java.lang.String username = cVar.f304365a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgIds, "msgIds");
            boolean isEmpty = msgIds.isEmpty();
            java.util.HashMap hashMap = c13100x4dbf8b6d.f177174d;
            if (isEmpty) {
                hashMap.remove(username);
            } else {
                yv1.p0 p0Var = new yv1.p0();
                java.util.HashSet hashSet = msgIds instanceof java.util.HashSet ? (java.util.HashSet) msgIds : null;
                if (hashSet == null) {
                    hashSet = new java.util.HashSet(msgIds);
                }
                p0Var.f547667b = hashSet;
                p0Var.f547666a = j17;
                hashMap.put(username, p0Var);
            }
        }
        return c13100x4dbf8b6d;
    }

    public final void m7() {
        final java.util.ArrayList arrayList = new java.util.ArrayList(this.Q.size());
        for (cw1.c cVar : this.Q.values()) {
            if (cVar.f304366b > 0) {
                arrayList.add(cVar);
            }
        }
        int i17 = this.f177250y;
        java.util.Collections.sort(arrayList, i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? null : new cw1.C28179x6a51c2d() : new cw1.C28178x6a51c2c() : new cw1.C28177x6a51c2b() : new cw1.C28176x6a51c2a());
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: cw1.w4$$k
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5 activityC13117x73c251e5 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.this;
                cw1.u2 u2Var = activityC13117x73c251e5.M;
                u2Var.f304882e = arrayList;
                u2Var.notifyDataSetChanged();
                activityC13117x73c251e5.N.setVisibility(0);
                activityC13117x73c251e5.k7();
            }
        });
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 0 && i18 == -1 && intent != null) {
            final long[] longArrayExtra = intent.getLongArrayExtra("ds");
            intent.getIntArrayExtra("dc");
            if (longArrayExtra != null) {
                for (long j17 : longArrayExtra) {
                    r0 += j17;
                }
            }
            final long j18 = r0;
            this.R += j18;
            setResult(-1, new android.content.Intent().putExtra("tds", this.R));
            java.lang.Runnable runnable = this.F;
            if (runnable != null) {
                runnable.run();
            }
            final java.lang.String stringExtra = intent.getStringExtra("u");
            if (stringExtra == null) {
                return;
            } else {
                ((ku5.t0) ku5.t0.f394148d).b(new java.lang.Runnable() { // from class: cw1.w4$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5 activityC13117x73c251e5 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.this;
                        cw1.c cVar = (cw1.c) ((java.util.HashMap) activityC13117x73c251e5.Q).get(stringExtra);
                        if (cVar != null && longArrayExtra != null) {
                            cVar.f304366b -= j18;
                        }
                        activityC13117x73c251e5.m7();
                    }
                }, "CleanChattingLoad");
            }
        } else if (i17 == 1 && i18 == -1 && intent != null) {
            java.lang.String stringExtra2 = intent.getStringExtra("u");
            if (stringExtra2 == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d c13100x4dbf8b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d) intent.getParcelableExtra("select");
            cw1.c cVar = (cw1.c) ((java.util.HashMap) this.Q).get(stringExtra2);
            if (c13100x4dbf8b6d != null && cVar != null) {
                yv1.p0 p0Var = (yv1.p0) c13100x4dbf8b6d.f177174d.get(stringExtra2);
                cVar.f304368d = p0Var != null ? p0Var.f547666a : 0L;
                cVar.f304370f = c13100x4dbf8b6d.c(stringExtra2);
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingUI", "Enter CleanChattingUI, scene = " + this.f177232d);
        getIntent().hasExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.a_5);
        boolean d76 = d7();
        android.content.Intent intent = getIntent();
        java.lang.Boolean valueOf = intent.hasExtra("isSent") ? java.lang.Boolean.valueOf(intent.getBooleanExtra("isSent", false)) : null;
        this.f177251z = valueOf;
        if (d76) {
            mo56582xbf7c1df6(valueOf == java.lang.Boolean.TRUE ? com.p314xaae8f345.mm.R.C30867xcad56011.n8j : com.p314xaae8f345.mm.R.C30867xcad56011.n8i);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.a_5);
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d c13100x4dbf8b6d = d76 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d) intent.getParcelableExtra("select") : null;
        this.N = (android.widget.ListView) this.f177239n;
        cw1.u2 u2Var = new cw1.u2(this);
        this.M = u2Var;
        this.N.setAdapter((android.widget.ListAdapter) u2Var);
        this.N.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() { // from class: cw1.w4$$d
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
                java.util.Set set;
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.S;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5 activityC13117x73c251e5 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.this;
                activityC13117x73c251e5.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(adapterView);
                arrayList.add(view);
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", activityC13117x73c251e5, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(adapterView);
                arrayList2.add(view);
                arrayList2.add(java.lang.Integer.valueOf(i17));
                arrayList2.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", activityC13117x73c251e5, array2);
                cw1.u2 u2Var2 = activityC13117x73c251e5.M;
                cw1.c cVar = (cw1.c) u2Var2.f304882e.get(i17);
                if (cVar.f304368d > 0) {
                    cVar.f304368d = 0L;
                    if (cVar.f304370f != null) {
                        cVar.f304370f = java.util.Collections.emptySet();
                    }
                } else {
                    cVar.f304368d = cVar.f304366b;
                    if (cVar.f304370f != null && (set = cVar.f304369e) != null) {
                        cVar.f304370f = set;
                    }
                }
                u2Var2.notifyDataSetChanged();
                activityC13117x73c251e5.k7();
                yj0.a.h(activityC13117x73c251e5, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                yj0.a.h(activityC13117x73c251e5, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }
        });
        this.M.f304883f = new android.widget.AdapterView.OnItemClickListener() { // from class: cw1.w4$$e
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.S;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5 activityC13117x73c251e5 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.this;
                activityC13117x73c251e5.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(adapterView);
                arrayList.add(view);
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", activityC13117x73c251e5, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(adapterView);
                arrayList2.add(view);
                arrayList2.add(java.lang.Integer.valueOf(i17));
                arrayList2.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", activityC13117x73c251e5, array2);
                cw1.c item = activityC13117x73c251e5.M.getItem(i17);
                if (item != null) {
                    if (item.f304366b > 0) {
                        long[] Z6 = activityC13117x73c251e5.Z6();
                        int i19 = 1;
                        android.content.Intent putExtra = new android.content.Intent(activityC13117x73c251e5, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13116xef072354.class).putExtra("u", item.f304365a).putExtra("st", activityC13117x73c251e5.Y6(true)).putExtra("min", Z6[0]).putExtra("max", Z6[1]);
                        lk5.s.e(putExtra, true);
                        java.lang.Boolean bool = activityC13117x73c251e5.f177251z;
                        if (bool != null) {
                            putExtra.putExtra("isSent", bool.booleanValue());
                        }
                        if (activityC13117x73c251e5.B) {
                            putExtra.putExtra("onlyInSys", true);
                        }
                        if (activityC13117x73c251e5.d7()) {
                            putExtra.putExtra("select", activityC13117x73c251e5.l7());
                            putExtra.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 4);
                        } else {
                            putExtra.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
                            i19 = 0;
                        }
                        putExtra.putExtra("clean_ui_scene", activityC13117x73c251e5.f177233e);
                        activityC13117x73c251e5.startActivityForResult(putExtra, i19);
                        mt1.b0.s(8, 0L, new java.lang.Long[0]);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("select_detail_chat_history", "view_clk", java.util.Collections.singletonMap("storage_manage_sessionid", activityC13117x73c251e5.f177246u.f547576b), 32903);
                    } else {
                        db5.e1.i(activityC13117x73c251e5, com.p314xaae8f345.mm.R.C30867xcad56011.b8v, com.p314xaae8f345.mm.R.C30867xcad56011.jz9);
                    }
                }
                yj0.a.h(activityC13117x73c251e5, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                yj0.a.h(activityC13117x73c251e5, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingNewUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }
        };
        this.f177247v = 0;
        if (this.P) {
            c7(true, this.f177251z == null, true);
        } else {
            b7(true, true);
        }
        X6();
        ((ku5.t0) ku5.t0.f394148d).b(new java.lang.Runnable() { // from class: cw1.w4$$f
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.S;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5 activityC13117x73c251e5 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13117x73c251e5.this;
                activityC13117x73c251e5.getClass();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long[] j76 = activityC13117x73c251e5.j7(c13100x4dbf8b6d);
                mt1.b0.s(22, java.lang.System.currentTimeMillis() - currentTimeMillis, java.lang.Long.valueOf(j76[0] + j76[1]), java.lang.Long.valueOf(j76[0]), java.lang.Long.valueOf(j76[2]), java.lang.Long.valueOf(((java.util.HashMap) activityC13117x73c251e5.Q).size()));
            }
        }, "CleanChattingLoad");
    }
}
