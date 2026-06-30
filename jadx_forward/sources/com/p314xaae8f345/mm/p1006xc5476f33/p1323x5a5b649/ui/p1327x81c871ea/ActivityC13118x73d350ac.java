package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea;

@gm0.a2
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI */
/* loaded from: classes12.dex */
public class ActivityC13118x73d350ac extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final long[] B = {-2, 7862400000L, 31536000000L, -1};
    public static final int[] C = {0, 2, 3, 4};
    public static final int[][] D = {null, ot1.h.Q, ot1.h.T, ot1.h.Z, ot1.h.f430374x1};
    public static final int[][] E = {null, null, ot1.h.X, ot1.h.f430370l1, ot1.h.f430377z1};

    /* renamed from: d, reason: collision with root package name */
    public cw1.y4 f177272d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f177273e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f177274f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f177275g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f177276h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f177277i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f177278m;

    /* renamed from: n, reason: collision with root package name */
    public long f177279n;

    /* renamed from: o, reason: collision with root package name */
    public long f177280o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f177281p;

    /* renamed from: r, reason: collision with root package name */
    public java.util.Map f177283r;

    /* renamed from: u, reason: collision with root package name */
    public volatile long[] f177286u;

    /* renamed from: q, reason: collision with root package name */
    public final long f177282q = java.lang.System.currentTimeMillis();

    /* renamed from: s, reason: collision with root package name */
    public volatile int f177284s = 0;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f177285t = -2;

    /* renamed from: v, reason: collision with root package name */
    public volatile int f177287v = 0;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f177288w = false;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f177289x = false;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f177290y = false;

    /* renamed from: z, reason: collision with root package name */
    public long f177291z = 0;
    public final java.lang.Runnable A = new cw1.RunnableC28100x56f8b7e(this);

    public final long[] T6() {
        return (this.f177285t != -1 || this.f177286u == null) ? this.f177285t > 0 ? new long[]{0, this.f177282q - this.f177285t} : new long[]{0, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697} : this.f177286u;
    }

    public final void U6() {
        cw1.y4 y4Var = this.f177272d;
        java.util.HashSet hashSet = y4Var.f305052e;
        if (y4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CleanChattingUI", "on click check box but adapter is null");
            return;
        }
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.Iterator it = hashSet.iterator();
        long j17 = 0;
        long j18 = 0;
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            cw1.a item = this.f177272d.getItem(intValue);
            if (item != null) {
                j17 += item.f304244b[this.f177284s];
                j18 += this.f177284s == 0 ? item.f304244b[1] : 0L;
            } else {
                hashSet2.add(java.lang.Integer.valueOf(intValue));
            }
        }
        java.util.Iterator it6 = hashSet2.iterator();
        while (it6.hasNext()) {
            hashSet.remove((java.lang.Integer) it6.next());
        }
        int size = hashSet.size();
        int i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f571527hu;
        if (size != 0 || j17 > 0) {
            this.f177274f.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bom, fp.n0.a(j17)));
            this.f177277i.setEnabled(true);
            android.widget.Button button = this.f177278m;
            if (hashSet.size() == this.f177272d.getCount()) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.aq8;
            }
            button.setText(i17);
        } else {
            this.f177274f.setText("");
            this.f177277i.setEnabled(false);
            this.f177278m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571527hu);
        }
        this.f177279n = j17;
        this.f177280o = j18;
    }

    public final void V6(final int i17, long j17, final long j18) {
        final android.content.res.Resources resources = getResources();
        boolean z17 = i17 == 1 && j17 <= 0;
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(this, z17 ? 2 : 1, 0, true);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this);
        if (j18 > 0 && j17 == 0) {
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570151ff, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bxb)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.a9y));
            inflate.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.a5$$s
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    long j19 = j18;
                    long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.B;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.this;
                    activityC13118x73d350ac.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = z2Var;
                    arrayList.add(z2Var2);
                    arrayList.add(java.lang.Long.valueOf(j19));
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13118x73d350ac, array);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(z2Var2);
                    arrayList2.add(java.lang.Long.valueOf(j19));
                    arrayList2.add(view);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13118x73d350ac, array2);
                    z2Var2.B();
                    activityC13118x73d350ac.V6(0, j19, 0L);
                    yj0.a.h(activityC13118x73d350ac, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(activityC13118x73d350ac, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            z2Var.p(inflate);
        }
        android.view.View inflate2 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.afp, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.bxh);
        android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.bxg);
        if (z17) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a_2);
            textView.setGravity(17);
            textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.a_0, fp.n0.a(j18)));
            textView2.setGravity(17);
            z2Var.x(0);
            z2Var.y(getString(com.p314xaae8f345.mm.R.C30867xcad56011.a_1));
            z2Var.F = new v61.C30646x56d4592(z2Var);
        } else {
            int b17 = i65.a.b(this, 14);
            final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this, 1, true);
            k0Var.r(resources.getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559522j)[i17], 17, b17, null);
            k0Var.f293405n = new db5.o4() { // from class: cw1.a5$$t
                @Override // db5.o4
                /* renamed from: onCreateMMMenu */
                public final void mo887xc459429a(db5.g4 g4Var) {
                    long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.B;
                    android.content.res.Resources resources2 = resources;
                    g4Var.d(1, resources2.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31), resources2.getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559520d)[i17]);
                }
            };
            k0Var.f293414s = new db5.t4() { // from class: cw1.a5$$u
                @Override // db5.t4
                /* renamed from: onMMMenuItemSelected */
                public final void mo888x34063ac(android.view.MenuItem menuItem, int i18) {
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.this;
                    final int i19 = i17;
                    long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.B;
                    final long[] T6 = activityC13118x73d350ac.T6();
                    mt1.b0 b0Var = mt1.b0.f412724a;
                    mt1.b0.f412734k = false;
                    wz1.b.b(true);
                    java.util.ArrayList arrayList = new java.util.ArrayList(activityC13118x73d350ac.f177272d.f305052e);
                    java.util.Collections.sort(arrayList);
                    java.util.Collections.reverse(arrayList);
                    final java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it = arrayList.iterator();
                    long j19 = 0;
                    while (it.hasNext()) {
                        cw1.a item = activityC13118x73d350ac.f177272d.getItem(((java.lang.Integer) it.next()).intValue());
                        if (item != null) {
                            arrayList2.add(item.f304243a);
                            j19 += item.f304244b[i19];
                        }
                    }
                    boolean z18 = arrayList.size() == activityC13118x73d350ac.f177272d.getCount();
                    boolean z19 = i19 != 0;
                    int size = arrayList2.size();
                    if (i19 == 0) {
                        size *= 2;
                    }
                    final cw1.e5 e5Var = new cw1.e5(activityC13118x73d350ac, j19, z19, z18, size, i19 == 0 && activityC13118x73d350ac.f177285t == -2 && z18);
                    final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
                    ((ku5.t0) ku5.t0.f394148d).a(aw1.n0.b(arrayList2, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.D[i19], T6[0], T6[1], i19 != 0, e5Var, c26987xeef691ab));
                    ((ku5.t0) ku5.t0.f394148d).a(new java.lang.Runnable() { // from class: cw1.a5$$i
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab2 = c26987xeef691ab;
                            cw1.e5 e5Var2 = e5Var;
                            java.util.List list = arrayList2;
                            long[] jArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.B;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.this.getClass();
                            bw1.u wi6 = bw1.u.wi();
                            wi6.getClass();
                            if (z65.c.a()) {
                                long[] jArr3 = wi6.f106379e;
                                if (jArr3[3] > 0) {
                                    for (long j27 = 0; j27 < jArr3[3]; j27 += 1000) {
                                        try {
                                            java.lang.Thread.sleep(1000L);
                                        } catch (java.lang.InterruptedException unused) {
                                        }
                                        if (c26987xeef691ab2 != null && c26987xeef691ab2.m108008xc9602be3()) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                            }
                            if (i19 != 0) {
                                e5Var2.d(c26987xeef691ab2.m108008xc9602be3(), 0);
                            } else {
                                boolean z27 = !((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_clean_sync_delete_message", "1").equals("0");
                                long[] jArr4 = T6;
                                if (z27) {
                                    c01.w9.j(list, e5Var2, jArr4[0], jArr4[1], c26987xeef691ab2);
                                } else {
                                    c01.w9.i(list, e5Var2, jArr4[1]);
                                }
                                for (int i27 = 0; i27 < list.size(); i27++) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingUI", "deleteImageQueryHistory >> path: %s", list.get(i27));
                                    ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ai((java.lang.String) list.get(i27));
                                }
                            }
                            yv1.f1 f1Var = yv1.g1.f547573p;
                        }
                    });
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC13118x73d350ac, activityC13118x73d350ac.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC13118x73d350ac.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8w, 0), false, true, new android.content.DialogInterface.OnCancelListener() { // from class: cw1.a5$$j
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(android.content.DialogInterface dialogInterface) {
                            final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac2 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.this;
                            final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab2 = c26987xeef691ab;
                            long[] jArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.B;
                            activityC13118x73d350ac2.getClass();
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC13118x73d350ac2);
                            u1Var.a(false);
                            u1Var.b(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1() { // from class: cw1.a5$$m
                                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
                                public final void a(boolean z27, java.lang.String str) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac3 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.this;
                                    if (!z27) {
                                        long[] jArr3 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.B;
                                        activityC13118x73d350ac3.getClass();
                                        c26987xeef691ab2.m108007xae7a2e7a();
                                    }
                                    activityC13118x73d350ac3.f177281p.show();
                                }
                            });
                            if (aw1.m1.f96142a) {
                                u1Var.g(activityC13118x73d350ac2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a7_));
                                u1Var.n(activityC13118x73d350ac2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a_1));
                            } else {
                                u1Var.g(activityC13118x73d350ac2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8g));
                                u1Var.n(activityC13118x73d350ac2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a79));
                                u1Var.j(activityC13118x73d350ac2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a78));
                            }
                            u1Var.q(false);
                        }
                    });
                    activityC13118x73d350ac.f177281p = Q;
                    Q.show();
                }
            };
            textView.setText(resources.getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559524l)[i17]);
            textView.setGravity(8388611);
            textView2.setText(java.lang.String.format(resources.getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559523k)[i17], fp.n0.a(j18 - j17)));
            textView2.setGravity(8388611);
            z2Var.o(2);
            z2Var.v(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            z2Var.m(resources.getText(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), java.lang.String.format(resources.getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559521i)[i17], fp.n0.a(j17)));
            v61.C30646x56d4592 c30646x56d4592 = new v61.C30646x56d4592(z2Var);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 p3Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3() { // from class: cw1.a5$$b
                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
                public final void a() {
                    long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.B;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0.this.v();
                    z2Var.B();
                }
            };
            z2Var.D = c30646x56d4592;
            z2Var.E = p3Var;
        }
        z2Var.j(inflate2);
        z2Var.C();
    }

    public final void W6() {
        final java.util.ArrayList arrayList = new java.util.ArrayList(this.f177283r.size());
        for (cw1.a aVar : this.f177283r.values()) {
            if (aVar.f304244b[this.f177284s] > 0) {
                arrayList.add(aVar);
            }
        }
        java.util.Collections.sort(arrayList, new java.util.Comparator() { // from class: cw1.a5$$c
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.this;
                cw1.a aVar2 = (cw1.a) obj;
                cw1.a aVar3 = (cw1.a) obj2;
                return activityC13118x73d350ac.f177287v == 0 ? java.lang.Long.compare(aVar3.f304244b[activityC13118x73d350ac.f177284s], aVar2.f304244b[activityC13118x73d350ac.f177284s]) : java.lang.Long.compare(aVar2.f304245c[activityC13118x73d350ac.f177284s], aVar3.f304245c[activityC13118x73d350ac.f177284s]);
            }
        });
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: cw1.a5$$d
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.this;
                java.util.ArrayList arrayList2 = arrayList;
                cw1.y4 y4Var = activityC13118x73d350ac.f177272d;
                int i17 = activityC13118x73d350ac.f177284s;
                y4Var.f305053f = arrayList2;
                y4Var.f305055h = i17;
                y4Var.notifyDataSetChanged();
                activityC13118x73d350ac.f177278m.setEnabled(!arrayList2.isEmpty());
                activityC13118x73d350ac.f177275g.setVisibility(8);
                activityC13118x73d350ac.f177276h.setVisibility(arrayList2.isEmpty() ? 0 : 8);
                activityC13118x73d350ac.f177273e.setVisibility(0);
                cw1.y4 y4Var2 = activityC13118x73d350ac.f177272d;
                y4Var2.f305052e.clear();
                y4Var2.notifyDataSetChanged();
                activityC13118x73d350ac.U6();
            }
        });
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bvk;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, final android.content.Intent intent) {
        if (intent != null) {
            ((ku5.t0) ku5.t0.f394148d).b(new java.lang.Runnable() { // from class: cw1.a5$$a
                @Override // java.lang.Runnable
                public final void run() {
                    long j17;
                    long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.B;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.this;
                    activityC13118x73d350ac.getClass();
                    android.content.Intent intent2 = intent;
                    java.lang.String stringExtra = intent2.getStringExtra("key_username");
                    if (stringExtra == null) {
                        return;
                    }
                    cw1.a aVar = (cw1.a) activityC13118x73d350ac.f177283r.get(stringExtra);
                    if (aVar != null) {
                        long longExtra = intent2.getLongExtra("key_delete_image_size", 0L);
                        long j18 = longExtra + 0;
                        long[] jArr2 = aVar.f304244b;
                        jArr2[0] = jArr2[0] - longExtra;
                        jArr2[1] = jArr2[1] - longExtra;
                        jArr2[2] = jArr2[2] - longExtra;
                        long longExtra2 = intent2.getLongExtra("key_delete_video_size", 0L);
                        long j19 = j18 + longExtra2;
                        jArr2[0] = jArr2[0] - longExtra2;
                        jArr2[1] = jArr2[1] - longExtra2;
                        jArr2[3] = jArr2[3] - longExtra2;
                        long longExtra3 = intent2.getLongExtra("key_delete_file_size", 0L);
                        long j27 = j19 + longExtra3;
                        jArr2[0] = jArr2[0] - longExtra3;
                        jArr2[1] = jArr2[1] - longExtra3;
                        jArr2[4] = jArr2[4] - longExtra3;
                        long longExtra4 = intent2.getLongExtra("key_delete_misc_size", 0L);
                        j17 = j27 + longExtra4;
                        jArr2[0] = jArr2[0] - longExtra4;
                        jArr2[1] = jArr2[1] - longExtra4;
                    } else {
                        j17 = 0;
                    }
                    mt1.b0.s(9, intent2.getLongExtra("key_delete_time", 0L), java.lang.Long.valueOf(j17));
                    activityC13118x73d350ac.W6();
                }
            }, "CleanChattingLoad");
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingUI", "Create!!");
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.a_5);
        mo78530x8b45058f();
        this.f177273e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f565279tf);
        cw1.y4 y4Var = new cw1.y4(this);
        this.f177272d = y4Var;
        this.f177273e.setAdapter((android.widget.ListAdapter) y4Var);
        this.f177275g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iml);
        this.f177276h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565761dg2);
        this.f177274f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ctb);
        this.f177278m = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f568332mi1);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.crz);
        this.f177277i = button;
        button.setEnabled(false);
        mo54448x9c8c0d33(new android.view.MenuItem.OnMenuItemClickListener() { // from class: cw1.a5$$l
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.B;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.this.finish();
                return false;
            }
        });
        this.f177273e.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() { // from class: cw1.a5$$n
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
                long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.B;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.this;
                activityC13118x73d350ac.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(adapterView);
                arrayList.add(view);
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", activityC13118x73d350ac, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(adapterView);
                arrayList2.add(view);
                arrayList2.add(java.lang.Integer.valueOf(i17));
                arrayList2.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", activityC13118x73d350ac, array2);
                cw1.y4 y4Var2 = activityC13118x73d350ac.f177272d;
                java.util.HashSet hashSet = y4Var2.f305052e;
                if (!hashSet.add(java.lang.Integer.valueOf(i17))) {
                    hashSet.remove(java.lang.Integer.valueOf(i17));
                }
                y4Var2.notifyDataSetChanged();
                activityC13118x73d350ac.U6();
                yj0.a.h(activityC13118x73d350ac, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                yj0.a.h(activityC13118x73d350ac, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }
        });
        this.f177272d.f305054g = new android.widget.AdapterView.OnItemClickListener() { // from class: cw1.a5$$o
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.this;
                long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.B;
                activityC13118x73d350ac.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(adapterView);
                arrayList.add(view);
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", activityC13118x73d350ac, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(adapterView);
                arrayList2.add(view);
                arrayList2.add(java.lang.Integer.valueOf(i17));
                arrayList2.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", activityC13118x73d350ac, array2);
                cw1.a item = activityC13118x73d350ac.f177272d.getItem(i17);
                if (item == null) {
                    yj0.a.h(activityC13118x73d350ac, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    yj0.a.h(activityC13118x73d350ac, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
                if (item.f304244b[1] > 0) {
                    long[] T6 = activityC13118x73d350ac.T6();
                    android.content.Intent intent = new android.content.Intent(activityC13118x73d350ac, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b.class);
                    intent.putExtra("key_username", item.f304243a);
                    intent.putExtra("key_subtype", com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.E[activityC13118x73d350ac.f177284s]);
                    intent.putExtra("key_min_time", T6[0]);
                    intent.putExtra("key_max_time", T6[1]);
                    activityC13118x73d350ac.startActivityForResult(intent, 0);
                    mt1.b0.s(8, 0L, new java.lang.Long[0]);
                } else {
                    db5.e1.i(activityC13118x73d350ac, com.p314xaae8f345.mm.R.C30867xcad56011.b8v, com.p314xaae8f345.mm.R.C30867xcad56011.jz9);
                }
                yj0.a.h(activityC13118x73d350ac, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                yj0.a.h(activityC13118x73d350ac, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }
        };
        this.f177277i.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.a5$$p
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.this;
                long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.B;
                activityC13118x73d350ac.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13118x73d350ac, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13118x73d350ac, array2);
                if (activityC13118x73d350ac.f177284s == 0) {
                    activityC13118x73d350ac.V6(1, activityC13118x73d350ac.f177280o, activityC13118x73d350ac.f177279n);
                } else {
                    activityC13118x73d350ac.V6(activityC13118x73d350ac.f177284s, activityC13118x73d350ac.f177279n, 0L);
                }
                yj0.a.h(activityC13118x73d350ac, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(activityC13118x73d350ac, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f177278m.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.a5$$q
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long[] jArr = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.B;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac activityC13118x73d350ac = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13118x73d350ac.this;
                activityC13118x73d350ac.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13118x73d350ac, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13118x73d350ac, array2);
                cw1.y4 y4Var2 = activityC13118x73d350ac.f177272d;
                java.util.HashSet hashSet = y4Var2.f305052e;
                if (hashSet.size() == y4Var2.getCount()) {
                    hashSet.clear();
                } else {
                    for (int i17 = 0; i17 < y4Var2.getCount(); i17++) {
                        hashSet.add(java.lang.Integer.valueOf(i17));
                    }
                }
                y4Var2.notifyDataSetChanged();
                activityC13118x73d350ac.U6();
                yj0.a.h(activityC13118x73d350ac, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(activityC13118x73d350ac, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        android.content.res.Resources resources = getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] stringArray = resources.getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559515ay);
        arrayList.add(new cw1.b5(this, stringArray, 0, stringArray));
        arrayList.add(new cw1.c5(this, resources.getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559518b1), 0));
        arrayList.add(new cw1.d5(this, resources.getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559512m), 0));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0 c22684x1bd928a0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0) findViewById(com.p314xaae8f345.mm.R.id.e4f);
        c22684x1bd928a0.m81949xf0b64aeb(arrayList);
        if (arrayList.size() == 1) {
            c22684x1bd928a0.m81950xe77956e5(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.x2.AlignLeft);
        }
        ((ku5.t0) ku5.t0.f394148d).b(this.A, "CleanChattingLoad");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        android.app.ProgressDialog progressDialog = this.f177281p;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f177281p.dismiss();
        }
        super.onDestroy();
    }
}
