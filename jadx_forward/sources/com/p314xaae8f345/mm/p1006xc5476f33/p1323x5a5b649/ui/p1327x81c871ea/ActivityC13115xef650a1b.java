package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI */
/* loaded from: classes12.dex */
public class ActivityC13115xef650a1b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements bw1.k {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f177257t = 0;

    /* renamed from: d, reason: collision with root package name */
    public cw1.j3 f177258d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f177259e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f177260f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f177261g;

    /* renamed from: h, reason: collision with root package name */
    public android.app.ProgressDialog f177262h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f177263i;

    /* renamed from: m, reason: collision with root package name */
    public yv1.g1 f177264m;

    /* renamed from: n, reason: collision with root package name */
    public long f177265n;

    /* renamed from: o, reason: collision with root package name */
    public long f177266o;

    /* renamed from: p, reason: collision with root package name */
    public long f177267p;

    /* renamed from: q, reason: collision with root package name */
    public long f177268q;

    /* renamed from: r, reason: collision with root package name */
    public long f177269r;

    /* renamed from: s, reason: collision with root package name */
    public long f177270s;

    @Override // bw1.k
    public void K2(final int i17, final int i18) {
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: cw1.s4$$h
            @Override // java.lang.Runnable
            public final void run() {
                int i19;
                int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b.f177257t;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b activityC13115xef650a1b = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b.this;
                activityC13115xef650a1b.getClass();
                int i28 = i18;
                if (i28 <= 0 || (i19 = i17) > i28) {
                    return;
                }
                activityC13115xef650a1b.f177262h.setMessage(activityC13115xef650a1b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8w, java.lang.Integer.valueOf((i19 * 100) / i28)));
            }
        });
    }

    @Override // bw1.k
    public void Y4() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.any;
    }

    @Override // bw1.k
    public void j6(boolean z17, final long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanChattingDetailUI", "onDeleteEnd [%d] ", java.lang.Long.valueOf(j17));
        yv1.g1 g1Var = this.f177264m;
        synchronized (g1Var) {
            g1Var.f547577c -= j17;
            g1Var.f547579e -= j17;
        }
        this.f177270s += java.lang.System.currentTimeMillis() - this.f177269r;
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: cw1.s4$$e
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b activityC13115xef650a1b = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b.this;
                activityC13115xef650a1b.f177262h.dismiss();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_username", activityC13115xef650a1b.f177263i);
                intent.putExtra("key_delete_image_size", activityC13115xef650a1b.f177265n);
                intent.putExtra("key_delete_video_size", activityC13115xef650a1b.f177266o);
                intent.putExtra("key_delete_file_size", activityC13115xef650a1b.f177267p);
                intent.putExtra("key_delete_misc_size", activityC13115xef650a1b.f177268q);
                intent.putExtra("key_delete_time", activityC13115xef650a1b.f177270s);
                activityC13115xef650a1b.setResult(1000, intent);
                db5.e1.s(activityC13115xef650a1b, activityC13115xef650a1b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8q, fp.n0.a(j17)), "");
            }
        });
        mt1.b0 b0Var = mt1.b0.f412724a;
        mt1.b0.f412734k = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f177264m = yv1.g1.f547573p.b(intent.getIntExtra("session", -1));
        this.f177263i = intent.getStringExtra("key_username");
        int[] intArrayExtra = intent.getIntArrayExtra("key_subtype");
        long longExtra = intent.getLongExtra("key_min_time", Long.MIN_VALUE);
        long longExtra2 = intent.getLongExtra("key_max_time", com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f177263i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CleanChattingDetailUI", "username is null");
            finish();
            return;
        }
        this.f177259e = (android.widget.Button) $(com.p314xaae8f345.mm.R.id.f568332mi1);
        this.f177260f = (android.widget.TextView) $(com.p314xaae8f345.mm.R.id.ctb);
        android.widget.Button button = (android.widget.Button) $(com.p314xaae8f345.mm.R.id.crz);
        this.f177261g = button;
        button.setEnabled(false);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f177263i)) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = this.f177263i;
            ((sg3.a) v0Var).getClass();
            mo54450xbf7c1df6(c01.a2.f(str, str));
        } else {
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = this.f177263i;
            ((sg3.a) v0Var2).getClass();
            mo54450xbf7c1df6(c01.a2.e(str2));
        }
        com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b c22410xc19c546b = (com.p314xaae8f345.mm.ui.p2708x5ccaae3b.C22410xc19c546b) findViewById(com.p314xaae8f345.mm.R.id.f565278te);
        c22410xc19c546b.setNumColumns(3);
        cw1.j3 j3Var = new cw1.j3(this, this.f177263i, intArrayExtra, longExtra, longExtra2);
        this.f177258d = j3Var;
        c22410xc19c546b.m80670x76e35d2e(j3Var.f304566p);
        c22410xc19c546b.setOnItemClickListener(this.f177258d.f304567q);
        c22410xc19c546b.setOnScrollListener(this.f177258d.f304569s);
        c22410xc19c546b.setAdapter((android.widget.ListAdapter) this.f177258d);
        mo54448x9c8c0d33(new android.view.MenuItem.OnMenuItemClickListener() { // from class: cw1.s4$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b.f177257t;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b.this.finish();
                return false;
            }
        });
        this.f177259e.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.s4$$b
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b.f177257t;
                com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b activityC13115xef650a1b = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b.this;
                activityC13115xef650a1b.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13115xef650a1b, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13115xef650a1b, array2);
                cw1.j3 j3Var2 = activityC13115xef650a1b.f177258d;
                java.util.HashSet hashSet = j3Var2.f304557d;
                int size = hashSet.size();
                java.util.ArrayList arrayList3 = j3Var2.f304559f;
                if (size == arrayList3.size()) {
                    hashSet.clear();
                } else {
                    for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                        hashSet.add(java.lang.Integer.valueOf(i18));
                    }
                }
                j3Var2.c();
                activityC13115xef650a1b.f177258d.notifyDataSetChanged();
                yj0.a.h(activityC13115xef650a1b, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(activityC13115xef650a1b, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f177261g.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.s4$$c
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b.f177257t;
                final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b activityC13115xef650a1b = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b.this;
                activityC13115xef650a1b.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13115xef650a1b, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC13115xef650a1b, array2);
                db5.e1.A(activityC13115xef650a1b, activityC13115xef650a1b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a_a), "", activityC13115xef650a1b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bod), activityC13115xef650a1b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), new android.content.DialogInterface.OnClickListener() { // from class: cw1.s4$$f
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b activityC13115xef650a1b2 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b.this;
                        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13115xef650a1b.f177257t;
                        activityC13115xef650a1b2.getClass();
                        mt1.b0 b0Var = mt1.b0.f412724a;
                        mt1.b0.f412734k = false;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.addAll(activityC13115xef650a1b2.f177258d.f304557d);
                        java.util.Collections.sort(arrayList3);
                        java.util.Collections.reverse(arrayList3);
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.util.Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            int intValue = ((java.lang.Integer) it.next()).intValue();
                            bw1.l item = activityC13115xef650a1b2.f177258d.getItem(intValue);
                            if (item != null) {
                                arrayList4.add(item);
                                activityC13115xef650a1b2.f177258d.f304559f.remove(intValue);
                                int i27 = item.f106343b;
                                if (i27 == 1) {
                                    activityC13115xef650a1b2.f177265n += item.f106342a;
                                } else if (i27 == 3) {
                                    activityC13115xef650a1b2.f177266o += item.f106342a;
                                } else if (i27 != 4) {
                                    activityC13115xef650a1b2.f177268q += item.f106342a;
                                } else {
                                    activityC13115xef650a1b2.f177267p += item.f106342a;
                                }
                            }
                        }
                        cw1.j3 j3Var2 = activityC13115xef650a1b2.f177258d;
                        j3Var2.f304557d.clear();
                        j3Var2.c();
                        activityC13115xef650a1b2.f177258d.notifyDataSetChanged();
                        activityC13115xef650a1b2.f177259e.setEnabled(!activityC13115xef650a1b2.f177258d.f304559f.isEmpty());
                        aw1.n0 b17 = aw1.n0.b(arrayList4, ot1.h.Q, Long.MIN_VALUE, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, true, activityC13115xef650a1b2, null);
                        activityC13115xef650a1b2.f177269r = java.lang.System.currentTimeMillis();
                        ((ku5.t0) ku5.t0.f394148d).a(b17);
                        activityC13115xef650a1b2.f177262h.show();
                        activityC13115xef650a1b2.f177262h.setMessage(activityC13115xef650a1b2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8w, 0));
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(714L, 31L, 1L, false);
                    }
                }, new cw1.DialogInterfaceOnClickListenerC28139x66cbe26());
                yj0.a.h(activityC13115xef650a1b, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(activityC13115xef650a1b, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailOldUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8o), false, false, new cw1.DialogInterfaceOnCancelListenerC28136x66cbe23());
        this.f177262h = Q;
        Q.dismiss();
        cw1.j3 j3Var2 = this.f177258d;
        if (j3Var2 != null) {
            s75.d.b(new cw1.o3(j3Var2, null), "load_clean_detail");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        android.app.ProgressDialog progressDialog = this.f177262h;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f177262h.dismiss();
        }
        cw1.j3 j3Var = this.f177258d;
        if (j3Var != null) {
            j3Var.f304565o = true;
        }
        super.onDestroy();
    }
}
