package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "zo1/c3", "zo1/d3", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SelectContactUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f92846x = {131072, 131075, 131081};

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f92847d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f92848e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f92849f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f92850g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f92851h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f92852i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f92853m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f92854n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f92855o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f92856p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f92857q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.recyclerview.widget.GridLayoutManager f92858r;

    /* renamed from: t, reason: collision with root package name */
    public zo1.d3 f92860t;

    /* renamed from: u, reason: collision with root package name */
    public wo1.v f92861u;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f92859s = jz5.h.b(new zo1.k3(this));

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f92862v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public long f92863w = 999;

    public static final void T6(final com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI) {
        ((com.tencent.mm.ui.tools.c9) ((jz5.n) selectContactUI.f92859s).getValue()).b();
        android.widget.ListView listView = selectContactUI.f92848e;
        if (listView == null) {
            kotlin.jvm.internal.o.o("searchResultLv");
            throw null;
        }
        listView.setVisibility(8);
        android.widget.RelativeLayout relativeLayout = selectContactUI.f92847d;
        if (relativeLayout == null) {
            kotlin.jvm.internal.o.o("mainContentRl");
            throw null;
        }
        relativeLayout.setVisibility(0);
        selectContactUI.removeAllOptionMenu();
        selectContactUI.getController().x0(selectContactUI.getString(com.tencent.mm.R.string.mvh), new java.lang.Runnable() { // from class: zo1.e3
            @Override // java.lang.Runnable
            public final void run() {
                int[] iArr = com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI.f92846x;
                com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI.this.U6();
            }
        });
        selectContactUI.setMMTitle(com.tencent.mm.R.string.mzg);
    }

    public final void U6() {
        finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477729q, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dxn;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        U6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtnVisible(false);
        getController().x0(getString(com.tencent.mm.R.string.mvh), new java.lang.Runnable() { // from class: zo1.h3
            @Override // java.lang.Runnable
            public final void run() {
                int[] iArr = com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI.f92846x;
                com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI.this.U6();
            }
        });
        setNavigationbarColor(getColor(com.tencent.mm.R.color.af_));
        setMMTitle(com.tencent.mm.R.string.mzg);
        java.lang.String stringExtra = getIntent().getStringExtra("contactAdapterClass");
        if (stringExtra == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectContactUI", "Adapter class must not be null");
            U6();
            return;
        }
        long longExtra = getIntent().getLongExtra("reportPageId", 999L);
        this.f92863w = longExtra;
        if (longExtra == 999) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectContactUI", "Fail to get report page id from intent");
        }
        com.tencent.mm.plugin.backup.roambackup.a2.b(com.tencent.mm.plugin.backup.roambackup.a2.f92567a, this.f92863w, 1L, null, 4, null);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.s4g);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f92847d = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.s4k);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f92848e = (android.widget.ListView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.s4p);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f92849f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.s4n);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f92850g = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.s4h);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f92851h = (androidx.recyclerview.widget.RecyclerView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.s4c);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f92852i = (androidx.recyclerview.widget.RecyclerView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.s4b);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f92853m = (android.widget.LinearLayout) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.s4f);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f92854n = (android.widget.Button) findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.s4e);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f92855o = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.s4l);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f92856p = (android.widget.TextView) findViewById10;
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.s4j)).setOnClickListener(new zo1.i3(this));
        ((android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.s4m)).setOnClickListener(new android.view.View.OnClickListener() { // from class: zo1.j3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View p07) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(p07);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                kotlin.jvm.internal.o.g(p07, "p0");
                int[] iArr = com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI.f92846x;
                com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI = com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI.this;
                android.view.View inflate = android.view.LayoutInflater.from(selectContactUI.getContext()).inflate(com.tencent.mm.R.layout.dvv, (android.view.ViewGroup) null);
                android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(inflate, -1, -2);
                android.widget.ListView listView = (android.widget.ListView) inflate.findViewById(com.tencent.mm.R.id.f487068s73);
                wo1.v vVar = selectContactUI.f92861u;
                kotlin.jvm.internal.o.d(vVar);
                listView.setAdapter((android.widget.ListAdapter) vVar.getSortTypeAdapter());
                listView.setOnItemClickListener(new zo1.u3(selectContactUI, popupWindow));
                android.view.View findViewById11 = selectContactUI.findViewById(com.tencent.mm.R.id.s4i);
                popupWindow.setOutsideTouchable(true);
                popupWindow.setFocusable(true);
                popupWindow.setOnDismissListener(new zo1.w3(findViewById11, selectContactUI));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById11, arrayList2.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI", "showSortPopWindow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById11.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById11, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI", "showSortPopWindow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sa5.d.c(findViewById11, 0.0f, 0L, null, 7, null);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = selectContactUI.f92850g;
                if (weImageView == null) {
                    kotlin.jvm.internal.o.o("sortTypeIv");
                    throw null;
                }
                weImageView.setImageResource(com.tencent.mm.R.raw.arrow_up);
                popupWindow.setAnimationStyle(com.tencent.mm.R.style.f494507yd);
                popupWindow.showAsDropDown(p07);
                yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/SelectContactUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f92851h;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("contactRv");
            throw null;
        }
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        this.f92857q = new androidx.recyclerview.widget.LinearLayoutManager(this, 0, false);
        ((android.view.WindowManager) getSystemService("window")).getDefaultDisplay().getRealSize(new android.graphics.Point());
        this.f92858r = new androidx.recyclerview.widget.GridLayoutManager(this, java.lang.Math.max((int) (r3.x / ((2 * getResources().getDimension(com.tencent.mm.R.dimen.akx)) + getResources().getDimension(com.tencent.mm.R.dimen.akw))), 1));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f92852i;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("avatarRv");
            throw null;
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f92857q;
        if (linearLayoutManager == null) {
            kotlin.jvm.internal.o.o("avatarLayoutManagerLinear");
            throw null;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(this, getString(com.tencent.mm.R.string.mwe), false, 3, null);
        java.lang.String[] stringArrayExtra = getIntent().getStringArrayExtra("already_select_contact");
        if (stringArrayExtra != null) {
            kz5.h0.w(this.f92862v, stringArrayExtra);
        }
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.o.f(intent, "getIntent(...)");
        ((ku5.t0) ku5.t0.f312615d).q(new zo1.g3(this, stringExtra, intent, f17));
    }
}
