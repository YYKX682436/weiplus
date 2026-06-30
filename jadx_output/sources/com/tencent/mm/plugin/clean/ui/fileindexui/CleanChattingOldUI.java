package com.tencent.mm.plugin.clean.ui.fileindexui;

@gm0.a2
@ul5.d(0)
/* loaded from: classes12.dex */
public class CleanChattingOldUI extends com.tencent.mm.ui.MMActivity {
    public static final long[] B = {-2, 7862400000L, 31536000000L, -1};
    public static final int[] C = {0, 2, 3, 4};
    public static final int[][] D = {null, ot1.h.Q, ot1.h.T, ot1.h.Z, ot1.h.f348841x1};
    public static final int[][] E = {null, null, ot1.h.X, ot1.h.f348837l1, ot1.h.f348844z1};

    /* renamed from: d, reason: collision with root package name */
    public cw1.y4 f95739d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f95740e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f95741f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f95742g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f95743h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f95744i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f95745m;

    /* renamed from: n, reason: collision with root package name */
    public long f95746n;

    /* renamed from: o, reason: collision with root package name */
    public long f95747o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f95748p;

    /* renamed from: r, reason: collision with root package name */
    public java.util.Map f95750r;

    /* renamed from: u, reason: collision with root package name */
    public volatile long[] f95753u;

    /* renamed from: q, reason: collision with root package name */
    public final long f95749q = java.lang.System.currentTimeMillis();

    /* renamed from: s, reason: collision with root package name */
    public volatile int f95751s = 0;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f95752t = -2;

    /* renamed from: v, reason: collision with root package name */
    public volatile int f95754v = 0;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f95755w = false;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f95756x = false;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f95757y = false;

    /* renamed from: z, reason: collision with root package name */
    public long f95758z = 0;
    public final java.lang.Runnable A = new cw1.a5$$r(this);

    public final long[] T6() {
        return (this.f95752t != -1 || this.f95753u == null) ? this.f95752t > 0 ? new long[]{0, this.f95749q - this.f95752t} : new long[]{0, com.tencent.wcdb.core.Database.DictDefaultMatchValue} : this.f95753u;
    }

    public final void U6() {
        cw1.y4 y4Var = this.f95739d;
        java.util.HashSet hashSet = y4Var.f223519e;
        if (y4Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CleanChattingUI", "on click check box but adapter is null");
            return;
        }
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.Iterator it = hashSet.iterator();
        long j17 = 0;
        long j18 = 0;
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            cw1.a item = this.f95739d.getItem(intValue);
            if (item != null) {
                j17 += item.f222711b[this.f95751s];
                j18 += this.f95751s == 0 ? item.f222711b[1] : 0L;
            } else {
                hashSet2.add(java.lang.Integer.valueOf(intValue));
            }
        }
        java.util.Iterator it6 = hashSet2.iterator();
        while (it6.hasNext()) {
            hashSet.remove((java.lang.Integer) it6.next());
        }
        int size = hashSet.size();
        int i17 = com.tencent.mm.R.string.f489994hu;
        if (size != 0 || j17 > 0) {
            this.f95741f.setText(getString(com.tencent.mm.R.string.bom, fp.n0.a(j17)));
            this.f95744i.setEnabled(true);
            android.widget.Button button = this.f95745m;
            if (hashSet.size() == this.f95739d.getCount()) {
                i17 = com.tencent.mm.R.string.aq8;
            }
            button.setText(i17);
        } else {
            this.f95741f.setText("");
            this.f95744i.setEnabled(false);
            this.f95745m.setText(com.tencent.mm.R.string.f489994hu);
        }
        this.f95746n = j17;
        this.f95747o = j18;
    }

    public final void V6(final int i17, long j17, final long j18) {
        final android.content.res.Resources resources = getResources();
        boolean z17 = i17 == 1 && j17 <= 0;
        final com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(this, z17 ? 2 : 1, 0, true);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this);
        if (j18 > 0 && j17 == 0) {
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.f488618ff, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.bxb)).setText(getString(com.tencent.mm.R.string.a9y));
            inflate.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.a5$$s
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    long j19 = j18;
                    long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.B;
                    com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.this;
                    cleanChattingOldUI.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.tencent.mm.ui.widget.dialog.z2 z2Var2 = z2Var;
                    arrayList.add(z2Var2);
                    arrayList.add(java.lang.Long.valueOf(j19));
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingOldUI, array);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(z2Var2);
                    arrayList2.add(java.lang.Long.valueOf(j19));
                    arrayList2.add(view);
                    java.lang.Object[] array2 = arrayList2.toArray();
                    arrayList2.clear();
                    yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingOldUI, array2);
                    z2Var2.B();
                    cleanChattingOldUI.V6(0, j19, 0L);
                    yj0.a.h(cleanChattingOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(cleanChattingOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            z2Var.p(inflate);
        }
        android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.afp, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.bxh);
        android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.bxg);
        if (z17) {
            textView.setText(com.tencent.mm.R.string.a_2);
            textView.setGravity(17);
            textView2.setText(getString(com.tencent.mm.R.string.a_0, fp.n0.a(j18)));
            textView2.setGravity(17);
            z2Var.x(0);
            z2Var.y(getString(com.tencent.mm.R.string.a_1));
            z2Var.F = new v61.a0$$a(z2Var);
        } else {
            int b17 = i65.a.b(this, 14);
            final com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, true);
            k0Var.r(resources.getStringArray(com.tencent.mm.R.array.f477989j)[i17], 17, b17, null);
            k0Var.f211872n = new db5.o4() { // from class: cw1.a5$$t
                @Override // db5.o4
                public final void onCreateMMMenu(db5.g4 g4Var) {
                    long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.B;
                    android.content.res.Resources resources2 = resources;
                    g4Var.d(1, resources2.getColor(com.tencent.mm.R.color.f479482a31), resources2.getStringArray(com.tencent.mm.R.array.f477987d)[i17]);
                }
            };
            k0Var.f211881s = new db5.t4() { // from class: cw1.a5$$u
                @Override // db5.t4
                public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                    final com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.this;
                    final int i19 = i17;
                    long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.B;
                    final long[] T6 = cleanChattingOldUI.T6();
                    mt1.b0 b0Var = mt1.b0.f331191a;
                    mt1.b0.f331201k = false;
                    wz1.b.b(true);
                    java.util.ArrayList arrayList = new java.util.ArrayList(cleanChattingOldUI.f95739d.f223519e);
                    java.util.Collections.sort(arrayList);
                    java.util.Collections.reverse(arrayList);
                    final java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it = arrayList.iterator();
                    long j19 = 0;
                    while (it.hasNext()) {
                        cw1.a item = cleanChattingOldUI.f95739d.getItem(((java.lang.Integer) it.next()).intValue());
                        if (item != null) {
                            arrayList2.add(item.f222710a);
                            j19 += item.f222711b[i19];
                        }
                    }
                    boolean z18 = arrayList.size() == cleanChattingOldUI.f95739d.getCount();
                    boolean z19 = i19 != 0;
                    int size = arrayList2.size();
                    if (i19 == 0) {
                        size *= 2;
                    }
                    final cw1.e5 e5Var = new cw1.e5(cleanChattingOldUI, j19, z19, z18, size, i19 == 0 && cleanChattingOldUI.f95752t == -2 && z18);
                    final com.tencent.wcdb.support.CancellationSignal cancellationSignal = new com.tencent.wcdb.support.CancellationSignal();
                    ((ku5.t0) ku5.t0.f312615d).a(aw1.n0.b(arrayList2, com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.D[i19], T6[0], T6[1], i19 != 0, e5Var, cancellationSignal));
                    ((ku5.t0) ku5.t0.f312615d).a(new java.lang.Runnable() { // from class: cw1.a5$$i
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.wcdb.support.CancellationSignal cancellationSignal2 = cancellationSignal;
                            cw1.e5 e5Var2 = e5Var;
                            java.util.List list = arrayList2;
                            long[] jArr2 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.B;
                            com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.this.getClass();
                            bw1.u wi6 = bw1.u.wi();
                            wi6.getClass();
                            if (z65.c.a()) {
                                long[] jArr3 = wi6.f24846e;
                                if (jArr3[3] > 0) {
                                    for (long j27 = 0; j27 < jArr3[3]; j27 += 1000) {
                                        try {
                                            java.lang.Thread.sleep(1000L);
                                        } catch (java.lang.InterruptedException unused) {
                                        }
                                        if (cancellationSignal2 != null && cancellationSignal2.isCanceled()) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                            }
                            if (i19 != 0) {
                                e5Var2.d(cancellationSignal2.isCanceled(), 0);
                            } else {
                                boolean z27 = !((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_clean_sync_delete_message", "1").equals("0");
                                long[] jArr4 = T6;
                                if (z27) {
                                    c01.w9.j(list, e5Var2, jArr4[0], jArr4[1], cancellationSignal2);
                                } else {
                                    c01.w9.i(list, e5Var2, jArr4[1]);
                                }
                                for (int i27 = 0; i27 < list.size(); i27++) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingUI", "deleteImageQueryHistory >> path: %s", list.get(i27));
                                    ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ai((java.lang.String) list.get(i27));
                                }
                            }
                            yv1.f1 f1Var = yv1.g1.f466040p;
                        }
                    });
                    com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(cleanChattingOldUI, cleanChattingOldUI.getString(com.tencent.mm.R.string.f490573yv), cleanChattingOldUI.getString(com.tencent.mm.R.string.b8w, 0), false, true, new android.content.DialogInterface.OnCancelListener() { // from class: cw1.a5$$j
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(android.content.DialogInterface dialogInterface) {
                            final com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI2 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.this;
                            final com.tencent.wcdb.support.CancellationSignal cancellationSignal2 = cancellationSignal;
                            long[] jArr2 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.B;
                            cleanChattingOldUI2.getClass();
                            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(cleanChattingOldUI2);
                            u1Var.a(false);
                            u1Var.b(new com.tencent.mm.ui.widget.dialog.w1() { // from class: cw1.a5$$m
                                @Override // com.tencent.mm.ui.widget.dialog.w1
                                public final void a(boolean z27, java.lang.String str) {
                                    com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI3 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.this;
                                    if (!z27) {
                                        long[] jArr3 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.B;
                                        cleanChattingOldUI3.getClass();
                                        cancellationSignal2.cancel();
                                    }
                                    cleanChattingOldUI3.f95748p.show();
                                }
                            });
                            if (aw1.m1.f14609a) {
                                u1Var.g(cleanChattingOldUI2.getString(com.tencent.mm.R.string.a7_));
                                u1Var.n(cleanChattingOldUI2.getString(com.tencent.mm.R.string.a_1));
                            } else {
                                u1Var.g(cleanChattingOldUI2.getString(com.tencent.mm.R.string.b8g));
                                u1Var.n(cleanChattingOldUI2.getString(com.tencent.mm.R.string.a79));
                                u1Var.j(cleanChattingOldUI2.getString(com.tencent.mm.R.string.a78));
                            }
                            u1Var.q(false);
                        }
                    });
                    cleanChattingOldUI.f95748p = Q;
                    Q.show();
                }
            };
            textView.setText(resources.getStringArray(com.tencent.mm.R.array.f477991l)[i17]);
            textView.setGravity(8388611);
            textView2.setText(java.lang.String.format(resources.getStringArray(com.tencent.mm.R.array.f477990k)[i17], fp.n0.a(j18 - j17)));
            textView2.setGravity(8388611);
            z2Var.o(2);
            z2Var.v(resources.getColor(com.tencent.mm.R.color.FG_0));
            z2Var.m(resources.getText(com.tencent.mm.R.string.aq7), java.lang.String.format(resources.getStringArray(com.tencent.mm.R.array.f477988i)[i17], fp.n0.a(j17)));
            v61.a0$$a a0__a = new v61.a0$$a(z2Var);
            com.tencent.mm.ui.widget.dialog.p3 p3Var = new com.tencent.mm.ui.widget.dialog.p3() { // from class: cw1.a5$$b
                @Override // com.tencent.mm.ui.widget.dialog.p3
                public final void a() {
                    long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.B;
                    com.tencent.mm.ui.widget.dialog.k0.this.v();
                    z2Var.B();
                }
            };
            z2Var.D = a0__a;
            z2Var.E = p3Var;
        }
        z2Var.j(inflate2);
        z2Var.C();
    }

    public final void W6() {
        final java.util.ArrayList arrayList = new java.util.ArrayList(this.f95750r.size());
        for (cw1.a aVar : this.f95750r.values()) {
            if (aVar.f222711b[this.f95751s] > 0) {
                arrayList.add(aVar);
            }
        }
        java.util.Collections.sort(arrayList, new java.util.Comparator() { // from class: cw1.a5$$c
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.this;
                cw1.a aVar2 = (cw1.a) obj;
                cw1.a aVar3 = (cw1.a) obj2;
                return cleanChattingOldUI.f95754v == 0 ? java.lang.Long.compare(aVar3.f222711b[cleanChattingOldUI.f95751s], aVar2.f222711b[cleanChattingOldUI.f95751s]) : java.lang.Long.compare(aVar2.f222712c[cleanChattingOldUI.f95751s], aVar3.f222712c[cleanChattingOldUI.f95751s]);
            }
        });
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: cw1.a5$$d
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.this;
                java.util.ArrayList arrayList2 = arrayList;
                cw1.y4 y4Var = cleanChattingOldUI.f95739d;
                int i17 = cleanChattingOldUI.f95751s;
                y4Var.f223520f = arrayList2;
                y4Var.f223522h = i17;
                y4Var.notifyDataSetChanged();
                cleanChattingOldUI.f95745m.setEnabled(!arrayList2.isEmpty());
                cleanChattingOldUI.f95742g.setVisibility(8);
                cleanChattingOldUI.f95743h.setVisibility(arrayList2.isEmpty() ? 0 : 8);
                cleanChattingOldUI.f95740e.setVisibility(0);
                cw1.y4 y4Var2 = cleanChattingOldUI.f95739d;
                y4Var2.f223519e.clear();
                y4Var2.notifyDataSetChanged();
                cleanChattingOldUI.U6();
            }
        });
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bvk;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, final android.content.Intent intent) {
        if (intent != null) {
            ((ku5.t0) ku5.t0.f312615d).b(new java.lang.Runnable() { // from class: cw1.a5$$a
                @Override // java.lang.Runnable
                public final void run() {
                    long j17;
                    long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.B;
                    com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.this;
                    cleanChattingOldUI.getClass();
                    android.content.Intent intent2 = intent;
                    java.lang.String stringExtra = intent2.getStringExtra("key_username");
                    if (stringExtra == null) {
                        return;
                    }
                    cw1.a aVar = (cw1.a) cleanChattingOldUI.f95750r.get(stringExtra);
                    if (aVar != null) {
                        long longExtra = intent2.getLongExtra("key_delete_image_size", 0L);
                        long j18 = longExtra + 0;
                        long[] jArr2 = aVar.f222711b;
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
                    cleanChattingOldUI.W6();
                }
            }, "CleanChattingLoad");
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingUI", "Create!!");
        setMMTitle(com.tencent.mm.R.string.a_5);
        hideActionbarLine();
        this.f95740e = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f483746tf);
        cw1.y4 y4Var = new cw1.y4(this);
        this.f95739d = y4Var;
        this.f95740e.setAdapter((android.widget.ListAdapter) y4Var);
        this.f95742g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iml);
        this.f95743h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484228dg2);
        this.f95741f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ctb);
        this.f95745m = (android.widget.Button) findViewById(com.tencent.mm.R.id.f486799mi1);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.crz);
        this.f95744i = button;
        button.setEnabled(false);
        setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: cw1.a5$$l
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.B;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.this.finish();
                return false;
            }
        });
        this.f95740e.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() { // from class: cw1.a5$$n
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
                long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.B;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.this;
                cleanChattingOldUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(adapterView);
                arrayList.add(view);
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", cleanChattingOldUI, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(adapterView);
                arrayList2.add(view);
                arrayList2.add(java.lang.Integer.valueOf(i17));
                arrayList2.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", cleanChattingOldUI, array2);
                cw1.y4 y4Var2 = cleanChattingOldUI.f95739d;
                java.util.HashSet hashSet = y4Var2.f223519e;
                if (!hashSet.add(java.lang.Integer.valueOf(i17))) {
                    hashSet.remove(java.lang.Integer.valueOf(i17));
                }
                y4Var2.notifyDataSetChanged();
                cleanChattingOldUI.U6();
                yj0.a.h(cleanChattingOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                yj0.a.h(cleanChattingOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }
        });
        this.f95739d.f223521g = new android.widget.AdapterView.OnItemClickListener() { // from class: cw1.a5$$o
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.this;
                long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.B;
                cleanChattingOldUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(adapterView);
                arrayList.add(view);
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", cleanChattingOldUI, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(adapterView);
                arrayList2.add(view);
                arrayList2.add(java.lang.Integer.valueOf(i17));
                arrayList2.add(java.lang.Long.valueOf(j17));
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", cleanChattingOldUI, array2);
                cw1.a item = cleanChattingOldUI.f95739d.getItem(i17);
                if (item == null) {
                    yj0.a.h(cleanChattingOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    yj0.a.h(cleanChattingOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
                if (item.f222711b[1] > 0) {
                    long[] T6 = cleanChattingOldUI.T6();
                    android.content.Intent intent = new android.content.Intent(cleanChattingOldUI, (java.lang.Class<?>) com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI.class);
                    intent.putExtra("key_username", item.f222710a);
                    intent.putExtra("key_subtype", com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.E[cleanChattingOldUI.f95751s]);
                    intent.putExtra("key_min_time", T6[0]);
                    intent.putExtra("key_max_time", T6[1]);
                    cleanChattingOldUI.startActivityForResult(intent, 0);
                    mt1.b0.s(8, 0L, new java.lang.Long[0]);
                } else {
                    db5.e1.i(cleanChattingOldUI, com.tencent.mm.R.string.b8v, com.tencent.mm.R.string.jz9);
                }
                yj0.a.h(cleanChattingOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                yj0.a.h(cleanChattingOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            }
        };
        this.f95744i.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.a5$$p
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.this;
                long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.B;
                cleanChattingOldUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingOldUI, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingOldUI, array2);
                if (cleanChattingOldUI.f95751s == 0) {
                    cleanChattingOldUI.V6(1, cleanChattingOldUI.f95747o, cleanChattingOldUI.f95746n);
                } else {
                    cleanChattingOldUI.V6(cleanChattingOldUI.f95751s, cleanChattingOldUI.f95746n, 0L);
                }
                yj0.a.h(cleanChattingOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(cleanChattingOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f95745m.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.a5$$q
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long[] jArr = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.B;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI cleanChattingOldUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingOldUI.this;
                cleanChattingOldUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingOldUI, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingOldUI, array2);
                cw1.y4 y4Var2 = cleanChattingOldUI.f95739d;
                java.util.HashSet hashSet = y4Var2.f223519e;
                if (hashSet.size() == y4Var2.getCount()) {
                    hashSet.clear();
                } else {
                    for (int i17 = 0; i17 < y4Var2.getCount(); i17++) {
                        hashSet.add(java.lang.Integer.valueOf(i17));
                    }
                }
                y4Var2.notifyDataSetChanged();
                cleanChattingOldUI.U6();
                yj0.a.h(cleanChattingOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(cleanChattingOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        android.content.res.Resources resources = getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] stringArray = resources.getStringArray(com.tencent.mm.R.array.f477982ay);
        arrayList.add(new cw1.b5(this, stringArray, 0, stringArray));
        arrayList.add(new cw1.c5(this, resources.getStringArray(com.tencent.mm.R.array.f477985b1), 0));
        arrayList.add(new cw1.d5(this, resources.getStringArray(com.tencent.mm.R.array.f477979m), 0));
        com.tencent.mm.ui.widget.dialog.MMFilterDialog mMFilterDialog = (com.tencent.mm.ui.widget.dialog.MMFilterDialog) findViewById(com.tencent.mm.R.id.e4f);
        mMFilterDialog.setFilterItemList(arrayList);
        if (arrayList.size() == 1) {
            mMFilterDialog.setLayoutStyle(com.tencent.mm.ui.widget.dialog.x2.AlignLeft);
        }
        ((ku5.t0) ku5.t0.f312615d).b(this.A, "CleanChattingLoad");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.app.ProgressDialog progressDialog = this.f95748p;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f95748p.dismiss();
        }
        super.onDestroy();
    }
}
