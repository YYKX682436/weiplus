package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI */
/* loaded from: classes12.dex */
public class ActivityC12832x56c88de extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a {
    public static final /* synthetic */ int K = 0;
    public long A;
    public long B;
    public android.widget.TextView C;
    public android.widget.TextView D;
    public android.view.View E;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2 H;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f174042f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f174043g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f174044h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ProgressBar f174045i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f174046m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0 f174047n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f174048o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f174049p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f174050q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f174051r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f174052s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f174053t;

    /* renamed from: w, reason: collision with root package name */
    public long f174056w;

    /* renamed from: x, reason: collision with root package name */
    public long f174057x;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f174059z;

    /* renamed from: e, reason: collision with root package name */
    public final nn1.a f174041e = new nn1.a(this);

    /* renamed from: u, reason: collision with root package name */
    public int f174054u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f174055v = 0;

    /* renamed from: y, reason: collision with root package name */
    public final java.text.SimpleDateFormat f174058y = new java.text.SimpleDateFormat("yyyy.MM.dd");
    public boolean F = false;
    public boolean G = false;
    public final ln1.m I = new nn1.i(this);

    /* renamed from: J, reason: collision with root package name */
    public final ln1.n f174040J = new nn1.k(this);

    public void Z6() {
    }

    public long a7(java.util.HashSet hashSet) {
        java.util.LinkedList b17 = b7().b();
        long j17 = 0;
        if (b17.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveChooseUI", "onClickCheckBox convInfo is null.");
            return 0L;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (intValue < b17.size()) {
                j17 += this.f174055v == 1 ? ((kn1.i) b17.get(intValue)).f391160f[1] : ((kn1.i) b17.get(intValue)).f391161g;
            }
        }
        return j17;
    }

    public xn1.d b7() {
        return mn1.d.i().l();
    }

    public kn1.l c7() {
        return mn1.d.i().k();
    }

    public void d7(java.util.HashSet hashSet) {
        java.util.LinkedList b17 = b7().b();
        if (b17.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveChooseUI", "onClickCheckBox convInfo is null.");
            return;
        }
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.Iterator it = hashSet.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (intValue < b17.size()) {
                j17 = this.f174055v == 1 ? j17 + ((kn1.i) b17.get(intValue)).f391160f[1] : j17 + ((kn1.i) b17.get(intValue)).f391161g;
            } else {
                hashSet2.add(java.lang.Integer.valueOf(intValue));
            }
        }
        java.util.Iterator it6 = hashSet2.iterator();
        while (it6.hasNext()) {
            hashSet.remove((java.lang.Integer) it6.next());
        }
        if (hashSet.size() != 0 || j17 > 0) {
            this.f174053t.setEnabled(true);
            if (hashSet.size() == this.f174041e.getCount()) {
                this.f174043g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a76);
            } else {
                this.f174043g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572214a75);
            }
            android.view.View view = this.f174046m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "onClickCheckBox", "(Ljava/util/HashSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "onClickCheckBox", "(Ljava/util/HashSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f174048o.setVisibility(0);
            if (!this.F || j17 <= 0) {
                this.f174051r.setVisibility(8);
                this.f174049p.setVisibility(0);
                this.f174050q.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.a7d, java.lang.Integer.valueOf(hashSet.size())));
            } else {
                this.f174051r.setVisibility(0);
                g7(j17);
            }
        } else {
            this.f174051r.setVisibility(8);
            this.f174053t.setEnabled(false);
            this.f174043g.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572214a75);
            this.f174050q.setText("");
        }
        i7();
    }

    public final void e7(final boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o(this);
        oVar.f293840n = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n() { // from class: nn1.d$$g
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n
            /* renamed from: onResult */
            public final void mo26477x57429edc(boolean z18, int i17, int i18, int i19) {
                android.view.View view;
                int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de.K;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de.this;
                activityC12832x56c88de.getClass();
                if (z18) {
                    java.util.Calendar calendar = java.util.Calendar.getInstance();
                    calendar.set(i17, i18 - 1, i19);
                    if (z17) {
                        calendar.set(11, 0);
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        long timeInMillis = calendar.getTimeInMillis();
                        activityC12832x56c88de.A = timeInMillis;
                        activityC12832x56c88de.h7(activityC12832x56c88de.C, timeInMillis);
                    } else {
                        calendar.set(11, 23);
                        calendar.set(12, 59);
                        calendar.set(13, 59);
                        calendar.set(14, 999);
                        long timeInMillis2 = calendar.getTimeInMillis();
                        activityC12832x56c88de.B = timeInMillis2;
                        activityC12832x56c88de.h7(activityC12832x56c88de.D, timeInMillis2);
                    }
                    if (activityC12832x56c88de.B == 0 || activityC12832x56c88de.A == 0 || (view = activityC12832x56c88de.E) == null) {
                        return;
                    }
                    view.setEnabled(true);
                }
            }
        };
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = calendar.get(1);
        int i18 = calendar.get(2) + 1;
        int i19 = calendar.get(5);
        oVar.d(i17, i18, i19);
        oVar.e(i17, i18, i19);
        oVar.f(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26, 1, 21);
        oVar.h();
    }

    public void f7(int i17, long j17, long j18, int i18) {
        c7().a(i17, j17, j18, i18);
        this.f174055v = i18;
        if (this.f174054u == i17 && this.f174056w == j17 && this.f174057x == j18) {
            return;
        }
        this.f174054u = i17;
        this.f174056w = j17;
        this.f174057x = j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveChooseUI", "selectTimeAndType timeMode:%d, startTime:%d, endTime:%d, contentType:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i18));
        if (this.f174054u == 1) {
            android.view.View view = this.f174046m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "setSelectExtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "setSelectExtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f174048o.setVisibility(0);
        }
        if (this.f174055v == 1) {
            android.view.View view2 = this.f174046m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "setSelectExtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "setSelectExtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f174048o.setVisibility(0);
        }
        i7();
        this.f174045i.setVisibility(0);
        this.f174044h.setVisibility(4);
        this.f174042f.setVisibility(4);
        b7().a(i18, i17, j17, j18);
    }

    public void g7(long j17) {
        this.f174051r.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a77, kn1.k.v((float) j17)));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569702j4;
    }

    public final void h7(android.widget.TextView textView, long j17) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(j17);
        calendar.get(5);
        if (textView != null) {
            textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.a7h, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5))));
            textView.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        }
    }

    public final void i7() {
        if (this.f174049p.getVisibility() == 8) {
            android.view.View view = this.f174046m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "updateChooseExtInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "updateChooseExtInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f174048o.setVisibility(8);
            return;
        }
        android.view.View view2 = this.f174046m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "updateChooseExtInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "updateChooseExtInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f174048o.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (this.G) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ac9);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.aca);
        }
        this.f174047n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0) findViewById(com.p314xaae8f345.mm.R.id.e4f);
        this.f174042f = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.aav);
        xn1.d b76 = b7();
        nn1.a aVar = this.f174041e;
        aVar.f420171f = b76;
        this.f174042f.setAdapter((android.widget.ListAdapter) aVar);
        this.f174042f.setEmptyView(findViewById(com.p314xaae8f345.mm.R.id.aax));
        this.f174043g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564854ab3);
        this.f174044h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.aaw);
        this.f174045i = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.f564853ab2);
        this.f174046m = findViewById(com.p314xaae8f345.mm.R.id.f564852ab1);
        this.f174048o = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.aaz);
        this.f174049p = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f564855ab4);
        this.f174050q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ab6);
        this.f174051r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.abj);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564856ab5)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.a7t);
        mo54448x9c8c0d33(new android.view.MenuItem.OnMenuItemClickListener() { // from class: nn1.d$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de.K;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de.this.finish();
                return false;
            }
        });
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f564851ab0);
        this.f174053t = button;
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: nn1.d$$b
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de.K;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de activityC12832x56c88de = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1252x2ca13667.ActivityC12832x56c88de.this;
                activityC12832x56c88de.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC12832x56c88de, array);
                activityC12832x56c88de.Z6();
                yj0.a.h(activityC12832x56c88de, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f174053t.setEnabled(false);
        this.f174043g.setOnClickListener(new nn1.g(this));
        if (b7().f536990f) {
            if (b7().b().size() == 0) {
                int i17 = this.f174054u;
                if (i17 == 0) {
                    this.f174044h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a7s);
                } else if (i17 == 1) {
                    this.f174044h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.abz);
                }
                this.f174044h.setVisibility(0);
            }
            this.f174045i.setVisibility(4);
        } else if (b7().f536990f) {
            this.f174045i.setVisibility(4);
        } else {
            this.f174043g.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560237el));
            this.f174043g.setClickable(false);
            this.f174045i.setVisibility(0);
        }
        android.content.res.Resources resources = getResources();
        nn1.e eVar = new nn1.e(this, resources.getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559506b), 0);
        this.H = eVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0 c22684x1bd928a0 = this.f174047n;
        c22684x1bd928a0.getClass();
        eVar.f293478a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22688xbbff1f44(c22684x1bd928a0);
        ((java.util.ArrayList) c22684x1bd928a0.f293234q).add(eVar);
        c22684x1bd928a0.f293230m.m8149x8b456734(r5.size() - 1);
        java.lang.String[] stringArray = resources.getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559507c);
        java.lang.String[] split = (this.G ? stringArray[2] : stringArray[1]).split("\n");
        java.lang.String[] strArr = {stringArray[0], split[0]};
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0 c22684x1bd928a02 = this.f174047n;
        nn1.f fVar = new nn1.f(this, strArr, 0, split);
        c22684x1bd928a02.getClass();
        fVar.f293478a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22688xbbff1f44(c22684x1bd928a02);
        ((java.util.ArrayList) c22684x1bd928a02.f293234q).add(fVar);
        c22684x1bd928a02.f293230m.m8149x8b456734(r0.size() - 1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupMoveChooseUI", "onActivityResult result error! resultCode:%d", java.lang.Integer.valueOf(i18));
        } else {
            f7(intent.getIntExtra("BACKUP_SELECT_TIME_MODE", this.f174054u), intent.getLongExtra("BACKUP_SELECT_TIME_START_TIME", 0L), intent.getLongExtra("BACKUP_SELECT_TIME_END_TIME", 0L), intent.getIntExtra("BACKUP_SELECT_CONTENT_TYPE", this.f174055v));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        this.F = getIntent().getBooleanExtra("isMigrate", false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        b7().f536988d = this.I;
        b7().f536989e = this.f174040J;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        b7().f536988d = null;
        b7().f536989e = null;
    }
}
