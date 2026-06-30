package com.tencent.mm.plugin.clean.ui.fileindexui;

@gm0.a2
/* loaded from: classes12.dex */
public class CleanChattingDetailOldUI extends com.tencent.mm.ui.MMActivity implements bw1.k {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f95724t = 0;

    /* renamed from: d, reason: collision with root package name */
    public cw1.j3 f95725d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f95726e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f95727f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f95728g;

    /* renamed from: h, reason: collision with root package name */
    public android.app.ProgressDialog f95729h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f95730i;

    /* renamed from: m, reason: collision with root package name */
    public yv1.g1 f95731m;

    /* renamed from: n, reason: collision with root package name */
    public long f95732n;

    /* renamed from: o, reason: collision with root package name */
    public long f95733o;

    /* renamed from: p, reason: collision with root package name */
    public long f95734p;

    /* renamed from: q, reason: collision with root package name */
    public long f95735q;

    /* renamed from: r, reason: collision with root package name */
    public long f95736r;

    /* renamed from: s, reason: collision with root package name */
    public long f95737s;

    @Override // bw1.k
    public void K2(final int i17, final int i18) {
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: cw1.s4$$h
            @Override // java.lang.Runnable
            public final void run() {
                int i19;
                int i27 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI.f95724t;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI cleanChattingDetailOldUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI.this;
                cleanChattingDetailOldUI.getClass();
                int i28 = i18;
                if (i28 <= 0 || (i19 = i17) > i28) {
                    return;
                }
                cleanChattingDetailOldUI.f95729h.setMessage(cleanChattingDetailOldUI.getString(com.tencent.mm.R.string.b8w, java.lang.Integer.valueOf((i19 * 100) / i28)));
            }
        });
    }

    @Override // bw1.k
    public void Y4() {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.any;
    }

    @Override // bw1.k
    public void j6(boolean z17, final long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingDetailUI", "onDeleteEnd [%d] ", java.lang.Long.valueOf(j17));
        yv1.g1 g1Var = this.f95731m;
        synchronized (g1Var) {
            g1Var.f466044c -= j17;
            g1Var.f466046e -= j17;
        }
        this.f95737s += java.lang.System.currentTimeMillis() - this.f95736r;
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: cw1.s4$$e
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI cleanChattingDetailOldUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI.this;
                cleanChattingDetailOldUI.f95729h.dismiss();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_username", cleanChattingDetailOldUI.f95730i);
                intent.putExtra("key_delete_image_size", cleanChattingDetailOldUI.f95732n);
                intent.putExtra("key_delete_video_size", cleanChattingDetailOldUI.f95733o);
                intent.putExtra("key_delete_file_size", cleanChattingDetailOldUI.f95734p);
                intent.putExtra("key_delete_misc_size", cleanChattingDetailOldUI.f95735q);
                intent.putExtra("key_delete_time", cleanChattingDetailOldUI.f95737s);
                cleanChattingDetailOldUI.setResult(1000, intent);
                db5.e1.s(cleanChattingDetailOldUI, cleanChattingDetailOldUI.getString(com.tencent.mm.R.string.b8q, fp.n0.a(j17)), "");
            }
        });
        mt1.b0 b0Var = mt1.b0.f331191a;
        mt1.b0.f331201k = true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f95731m = yv1.g1.f466040p.b(intent.getIntExtra("session", -1));
        this.f95730i = intent.getStringExtra("key_username");
        int[] intArrayExtra = intent.getIntArrayExtra("key_subtype");
        long longExtra = intent.getLongExtra("key_min_time", Long.MIN_VALUE);
        long longExtra2 = intent.getLongExtra("key_max_time", com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f95730i)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CleanChattingDetailUI", "username is null");
            finish();
            return;
        }
        this.f95726e = (android.widget.Button) $(com.tencent.mm.R.id.f486799mi1);
        this.f95727f = (android.widget.TextView) $(com.tencent.mm.R.id.ctb);
        android.widget.Button button = (android.widget.Button) $(com.tencent.mm.R.id.crz);
        this.f95728g = button;
        button.setEnabled(false);
        if (com.tencent.mm.storage.z3.R4(this.f95730i)) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = this.f95730i;
            ((sg3.a) v0Var).getClass();
            setMMTitle(c01.a2.f(str, str));
        } else {
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = this.f95730i;
            ((sg3.a) v0Var2).getClass();
            setMMTitle(c01.a2.e(str2));
        }
        com.tencent.mm.ui.gridviewheaders.GridHeadersGridView gridHeadersGridView = (com.tencent.mm.ui.gridviewheaders.GridHeadersGridView) findViewById(com.tencent.mm.R.id.f483745te);
        gridHeadersGridView.setNumColumns(3);
        cw1.j3 j3Var = new cw1.j3(this, this.f95730i, intArrayExtra, longExtra, longExtra2);
        this.f95725d = j3Var;
        gridHeadersGridView.setOnHeaderClickListener(j3Var.f223033p);
        gridHeadersGridView.setOnItemClickListener(this.f95725d.f223034q);
        gridHeadersGridView.setOnScrollListener(this.f95725d.f223036s);
        gridHeadersGridView.setAdapter((android.widget.ListAdapter) this.f95725d);
        setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: cw1.s4$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI.f95724t;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI.this.finish();
                return false;
            }
        });
        this.f95726e.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.s4$$b
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI.f95724t;
                com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI cleanChattingDetailOldUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI.this;
                cleanChattingDetailOldUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingDetailOldUI, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingDetailOldUI, array2);
                cw1.j3 j3Var2 = cleanChattingDetailOldUI.f95725d;
                java.util.HashSet hashSet = j3Var2.f223024d;
                int size = hashSet.size();
                java.util.ArrayList arrayList3 = j3Var2.f223026f;
                if (size == arrayList3.size()) {
                    hashSet.clear();
                } else {
                    for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                        hashSet.add(java.lang.Integer.valueOf(i18));
                    }
                }
                j3Var2.c();
                cleanChattingDetailOldUI.f95725d.notifyDataSetChanged();
                yj0.a.h(cleanChattingDetailOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(cleanChattingDetailOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f95728g.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.s4$$c
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI.f95724t;
                final com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI cleanChattingDetailOldUI = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI.this;
                cleanChattingDetailOldUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingDetailOldUI, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingDetailOldUI, array2);
                db5.e1.A(cleanChattingDetailOldUI, cleanChattingDetailOldUI.getString(com.tencent.mm.R.string.a_a), "", cleanChattingDetailOldUI.getString(com.tencent.mm.R.string.bod), cleanChattingDetailOldUI.getString(com.tencent.mm.R.string.aq7), new android.content.DialogInterface.OnClickListener() { // from class: cw1.s4$$f
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI cleanChattingDetailOldUI2 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI.this;
                        int i19 = com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI.f95724t;
                        cleanChattingDetailOldUI2.getClass();
                        mt1.b0 b0Var = mt1.b0.f331191a;
                        mt1.b0.f331201k = false;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.addAll(cleanChattingDetailOldUI2.f95725d.f223024d);
                        java.util.Collections.sort(arrayList3);
                        java.util.Collections.reverse(arrayList3);
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.util.Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            int intValue = ((java.lang.Integer) it.next()).intValue();
                            bw1.l item = cleanChattingDetailOldUI2.f95725d.getItem(intValue);
                            if (item != null) {
                                arrayList4.add(item);
                                cleanChattingDetailOldUI2.f95725d.f223026f.remove(intValue);
                                int i27 = item.f24810b;
                                if (i27 == 1) {
                                    cleanChattingDetailOldUI2.f95732n += item.f24809a;
                                } else if (i27 == 3) {
                                    cleanChattingDetailOldUI2.f95733o += item.f24809a;
                                } else if (i27 != 4) {
                                    cleanChattingDetailOldUI2.f95735q += item.f24809a;
                                } else {
                                    cleanChattingDetailOldUI2.f95734p += item.f24809a;
                                }
                            }
                        }
                        cw1.j3 j3Var2 = cleanChattingDetailOldUI2.f95725d;
                        j3Var2.f223024d.clear();
                        j3Var2.c();
                        cleanChattingDetailOldUI2.f95725d.notifyDataSetChanged();
                        cleanChattingDetailOldUI2.f95726e.setEnabled(!cleanChattingDetailOldUI2.f95725d.f223026f.isEmpty());
                        aw1.n0 b17 = aw1.n0.b(arrayList4, ot1.h.Q, Long.MIN_VALUE, com.tencent.wcdb.core.Database.DictDefaultMatchValue, true, cleanChattingDetailOldUI2, null);
                        cleanChattingDetailOldUI2.f95736r = java.lang.System.currentTimeMillis();
                        ((ku5.t0) ku5.t0.f312615d).a(b17);
                        cleanChattingDetailOldUI2.f95729h.show();
                        cleanChattingDetailOldUI2.f95729h.setMessage(cleanChattingDetailOldUI2.getString(com.tencent.mm.R.string.b8w, 0));
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(714L, 31L, 1L, false);
                    }
                }, new cw1.s4$$g());
                yj0.a.h(cleanChattingDetailOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(cleanChattingDetailOldUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.b8o), false, false, new cw1.s4$$d());
        this.f95729h = Q;
        Q.dismiss();
        cw1.j3 j3Var2 = this.f95725d;
        if (j3Var2 != null) {
            s75.d.b(new cw1.o3(j3Var2, null), "load_clean_detail");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.app.ProgressDialog progressDialog = this.f95729h;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f95729h.dismiss();
        }
        cw1.j3 j3Var = this.f95725d;
        if (j3Var != null) {
            j3Var.f223032o = true;
        }
        super.onDestroy();
    }
}
