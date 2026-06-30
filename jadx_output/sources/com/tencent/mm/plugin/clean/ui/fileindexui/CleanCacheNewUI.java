package com.tencent.mm.plugin.clean.ui.fileindexui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "cw1/t0", "cw1/u0", "cw1/v0", "cw1/b1", "cw1/c1", "app_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
@ul5.d(0)
/* loaded from: classes12.dex */
public final class CleanCacheNewUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.Integer[][] f95654x = {new java.lang.Integer[]{0, 2, 3, 16}, new java.lang.Integer[]{4}, new java.lang.Integer[]{5}, new java.lang.Integer[]{6}, new java.lang.Integer[]{7}, new java.lang.Integer[]{8}, new java.lang.Integer[]{9}, new java.lang.Integer[]{15}, new java.lang.Integer[]{18}, new java.lang.Integer[]{17}, new java.lang.Integer[]{10, 11}, new java.lang.Integer[]{19}};

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.Integer[] f95655y = {13, 10, 14, 3, 9, 6, 7, 15, 12, 8, 4, 11};

    /* renamed from: d, reason: collision with root package name */
    public cw1.t0 f95656d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f95657e;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wcdb.support.CancellationSignal f95659g;

    /* renamed from: m, reason: collision with root package name */
    public int f95662m;

    /* renamed from: n, reason: collision with root package name */
    public yv1.g1 f95663n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f95664o;

    /* renamed from: p, reason: collision with root package name */
    public long f95665p;

    /* renamed from: q, reason: collision with root package name */
    public long f95666q;

    /* renamed from: r, reason: collision with root package name */
    public long f95667r;

    /* renamed from: t, reason: collision with root package name */
    public long f95669t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.clean.CleanService$SelectedItems[] f95670u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.clean.CleanService$SelectedItems[] f95671v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.clean.CleanService$SelectedItems f95672w;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f95658f = jz5.h.b(cw1.d1.f222868d);

    /* renamed from: h, reason: collision with root package name */
    public long[] f95660h = new long[21];

    /* renamed from: i, reason: collision with root package name */
    public int f95661i = -1;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String[] f95668s = new java.lang.String[0];

    public CleanCacheNewUI() {
        com.tencent.mm.plugin.clean.CleanService$SelectedItems[] cleanService$SelectedItemsArr = new com.tencent.mm.plugin.clean.CleanService$SelectedItems[2];
        for (int i17 = 0; i17 < 2; i17++) {
            cleanService$SelectedItemsArr[i17] = new com.tencent.mm.plugin.clean.CleanService$SelectedItems();
        }
        this.f95670u = cleanService$SelectedItemsArr;
        this.f95672w = new com.tencent.mm.plugin.clean.CleanService$SelectedItems();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void U6(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI r21) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI.U6(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI):void");
    }

    public static final int W6(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheNewUI cleanCacheNewUI, int i17) {
        int i18;
        cw1.t0 t0Var = cleanCacheNewUI.f95656d;
        java.lang.Object obj = null;
        if (t0Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        java.util.Iterator it = t0Var.f223324d.iterator();
        while (true) {
            i18 = 1;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((cw1.v0) next).f223359a == i17) {
                obj = next;
                break;
            }
        }
        cw1.v0 v0Var = (cw1.v0) obj;
        if (v0Var == null) {
            return 0;
        }
        if (v0Var.f223361c) {
            i18 = 2;
        } else if (v0Var.f223362d <= 0) {
            i18 = 0;
        }
        return i18;
    }

    public final boolean V6() {
        return ((java.lang.Boolean) ((jz5.n) this.f95658f).getValue()).booleanValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e2k;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean z17;
        if (i18 == -1) {
            if (i17 == 0 || i17 == 1) {
                if (intent == null) {
                    return;
                }
                com.tencent.mm.plugin.clean.CleanService$SelectedItems cleanService$SelectedItems = (com.tencent.mm.plugin.clean.CleanService$SelectedItems) intent.getParcelableExtra("select");
                if (cleanService$SelectedItems == null) {
                    cleanService$SelectedItems = new com.tencent.mm.plugin.clean.CleanService$SelectedItems();
                }
                long b17 = cleanService$SelectedItems.b();
                com.tencent.mm.plugin.clean.CleanService$SelectedItems[] cleanService$SelectedItemsArr = this.f95670u;
                if (i17 == 0) {
                    cleanService$SelectedItemsArr[0] = cleanService$SelectedItems;
                    com.tencent.mm.plugin.clean.CleanService$SelectedItems[] cleanService$SelectedItemsArr2 = this.f95671v;
                    if (cleanService$SelectedItemsArr2 == null) {
                        kotlin.jvm.internal.o.o("allOriginItems");
                        throw null;
                    }
                    z17 = cleanService$SelectedItemsArr2[0].a() == cleanService$SelectedItems.a();
                    cw1.t0 t0Var = this.f95656d;
                    if (t0Var == null) {
                        kotlin.jvm.internal.o.o("adapter");
                        throw null;
                    }
                    t0Var.x(-2, b17, z17);
                } else {
                    cleanService$SelectedItemsArr[1] = cleanService$SelectedItems;
                    com.tencent.mm.plugin.clean.CleanService$SelectedItems[] cleanService$SelectedItemsArr3 = this.f95671v;
                    if (cleanService$SelectedItemsArr3 == null) {
                        kotlin.jvm.internal.o.o("allOriginItems");
                        throw null;
                    }
                    z17 = cleanService$SelectedItemsArr3[1].a() == cleanService$SelectedItems.a();
                    cw1.t0 t0Var2 = this.f95656d;
                    if (t0Var2 == null) {
                        kotlin.jvm.internal.o.o("adapter");
                        throw null;
                    }
                    t0Var2.x(-1, b17, z17);
                }
            } else if (i17 == 4) {
                if (intent == null) {
                    return;
                }
                boolean booleanExtra = intent.getBooleanExtra("checked", false);
                long longExtra = intent.getLongExtra("checkedSize", 0L);
                java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("appIds");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new java.lang.String[0];
                }
                long longExtra2 = intent.getLongExtra("appSize", 0L);
                this.f95668s = stringArrayExtra;
                this.f95669t = longExtra2;
                cw1.t0 t0Var3 = this.f95656d;
                if (t0Var3 == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                t0Var3.x(3, longExtra, booleanExtra);
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.b8_);
        setBackBtn(new cw1.l1(this));
        android.content.Intent intent = getIntent();
        this.f95665p = intent.getLongExtra("lastCleaned", 0L);
        int intExtra = intent.getIntExtra("session", -1);
        this.f95661i = intExtra;
        this.f95663n = yv1.g1.f466040p.b(intExtra);
        java.lang.String stringExtra = intent.getStringExtra("cleanSessionID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f95664o = stringExtra;
        this.f95662m = intent.getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        yv1.g1 g1Var = this.f95663n;
        if (g1Var == null) {
            kotlin.jvm.internal.o.o("session");
            throw null;
        }
        synchronized (g1Var) {
            yv1.g1 g1Var2 = this.f95663n;
            if (g1Var2 == null) {
                kotlin.jvm.internal.o.o("session");
                throw null;
            }
            this.f95666q = g1Var2.f466051j;
            if (g1Var2 == null) {
                kotlin.jvm.internal.o.o("session");
                throw null;
            }
            this.f95667r = g1Var2.f466052k;
            if (g1Var2 == null) {
                kotlin.jvm.internal.o.o("session");
                throw null;
            }
            com.tencent.mm.plugin.clean.CleanService$SelectedItems[] cleanService$SelectedItemsArr = g1Var2.f466056o;
            z17 = cleanService$SelectedItemsArr == null;
            if (g1Var2 == null) {
                kotlin.jvm.internal.o.o("session");
                throw null;
            }
            if (cleanService$SelectedItemsArr == null) {
                cleanService$SelectedItemsArr = new com.tencent.mm.plugin.clean.CleanService$SelectedItems[2];
                for (int i17 = 0; i17 < 2; i17++) {
                    cleanService$SelectedItemsArr[i17] = new com.tencent.mm.plugin.clean.CleanService$SelectedItems();
                }
            }
            this.f95671v = cleanService$SelectedItemsArr;
        }
        long[] longArrayExtra = intent.getLongArrayExtra("tagsResult");
        if (longArrayExtra == null) {
            longArrayExtra = yv1.g1.f466040p.b(this.f95661i).f466053l;
        }
        this.f95660h = longArrayExtra;
        int length = longArrayExtra.length;
        dy1.a.f(this, iy1.c.CacheRemovePage);
        yv1.g1 g1Var3 = this.f95663n;
        if (g1Var3 == null) {
            kotlin.jvm.internal.o.o("session");
            throw null;
        }
        dy1.a.g(this, "storage_manage_sessionid", g1Var3.f466043b);
        java.lang.String str = this.f95664o;
        if (str == null) {
            kotlin.jvm.internal.o.o("cleanSessionID");
            throw null;
        }
        dy1.a.g(this, "cache_remove_sessionid", str);
        dy1.a.h(this, 4, 32903);
        hideActionbarLine();
        setNavigationbarColor(getColor(com.tencent.mm.R.color.agv));
        android.view.LayoutInflater.from(this).inflate(i65.a.D(this) ? com.tencent.mm.R.layout.e2n : com.tencent.mm.R.layout.f488615yq, (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.skk), true);
        this.f95656d = new cw1.t0(this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.bxa);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        this.f95657e = recyclerView;
        cw1.t0 t0Var = this.f95656d;
        if (t0Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        recyclerView.setAdapter(t0Var);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f486799mi1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.vkg);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.Button button2 = (android.widget.Button) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ctb);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.crz);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.Button button3 = (android.widget.Button) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f484228dg2);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        cw1.t0 t0Var2 = this.f95656d;
        if (t0Var2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        t0Var2.f223326f = new cw1.e1(this, textView, button, button2, button3, findViewById6);
        button.setOnClickListener(new cw1.f1(this));
        button2.setOnClickListener(new cw1.g1(this));
        button3.setVisibility(0);
        button3.setOnClickListener(new cw1.i1(this));
        java.lang.Long[] lArr = new java.lang.Long[1];
        cw1.t0 t0Var3 = this.f95656d;
        if (t0Var3 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        lArr[0] = java.lang.Long.valueOf(t0Var3.y());
        mt1.b0.s(30, 0L, lArr);
        if (!z17) {
            cw1.t0 t0Var4 = this.f95656d;
            if (t0Var4 != null) {
                t0Var4.B();
                return;
            } else {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
        }
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.iml);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById7, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI", "loadOriginalMediaData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById7, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI", "loadOriginalMediaData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f95657e;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        recyclerView2.setVisibility(8);
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = new com.tencent.wcdb.support.CancellationSignal();
        ((ku5.t0) ku5.t0.f312615d).a(new cw1.k1(cancellationSignal, this, findViewById7));
        this.f95659g = cancellationSignal;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f95659g;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        this.f95659g = null;
        super.onDestroy();
    }
}
