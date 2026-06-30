package com.tencent.mm.plugin.fav.ui;

@ul5.d(0)
/* loaded from: classes12.dex */
public class FavCleanUI extends com.tencent.mm.ui.MMActivity implements s82.h, com.tencent.mm.plugin.fav.ui.a4 {
    public static final /* synthetic */ int E = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.ra f100306d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.adapter.c f100307e;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f100309g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f100310h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f100311i;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f100313n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f100314o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel f100315p;

    /* renamed from: f, reason: collision with root package name */
    public boolean f100308f = false;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f100312m = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: q, reason: collision with root package name */
    public int f100316q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f100317r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f100318s = 0;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f100319t = 0;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Integer f100320u = 0;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Integer f100321v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Map f100322w = new java.util.HashMap();

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f100323x = "";

    /* renamed from: y, reason: collision with root package name */
    public final float f100324y = 1024.0f;

    /* renamed from: z, reason: collision with root package name */
    public final o72.h2 f100325z = new com.tencent.mm.plugin.fav.ui.e1(this);
    public final com.tencent.mm.modelbase.u0 A = new com.tencent.mm.plugin.fav.ui.g1(this);
    public final java.lang.Runnable B = new com.tencent.mm.plugin.fav.ui.h1(this);
    public long C = 0;
    public final java.lang.Runnable D = new com.tencent.mm.plugin.fav.ui.s0(this);

    public static void T6(com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI) {
        favCleanUI.f100307e.notifyDataSetChanged();
        if (favCleanUI.f100307e.isEmpty()) {
            favCleanUI.V6(true);
            if (8 != favCleanUI.f100309g.getVisibility()) {
                favCleanUI.f100309g.setVisibility(8);
            }
        } else {
            favCleanUI.V6(false);
            if (favCleanUI.f100309g.getVisibility() != 0) {
                favCleanUI.f100309g.setVisibility(0);
            }
        }
        favCleanUI.f100309g.removeFooterView(favCleanUI.f100314o);
    }

    @Override // s82.h
    public void F4(long j17, boolean z17) {
        W6();
    }

    public final void U6(java.lang.Integer num) {
        getController().E(0).f208383i = num.intValue();
        supportInvalidateOptionsMenu();
    }

    public final void V6(boolean z17) {
        if (z17) {
            android.view.View view = this.f100311i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f100310h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f100309g.removeFooterView(this.f100314o);
            return;
        }
        android.view.View view3 = this.f100311i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f100310h;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/FavCleanUI", "showEmptyView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f100309g.removeFooterView(this.f100314o);
    }

    public final void W6() {
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f100307e;
        if (cVar.B) {
            long m17 = cVar.m();
            if (m17 <= 0) {
                updateOptionMenuText(0, getContext().getString(com.tencent.mm.R.string.f491184ng1));
                U6(this.f100320u);
            } else {
                updateOptionMenuText(0, getContext().getString(com.tencent.mm.R.string.ntw, o72.x1.V(m17)));
                U6(this.f100319t);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488751e50;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f100319t = java.lang.Integer.valueOf(getResources().getColor(com.tencent.mm.R.color.f479482a31));
        this.f100320u = java.lang.Integer.valueOf(getResources().getColor(com.tencent.mm.R.color.f478757gd));
        this.f100321v = java.lang.Integer.valueOf(getResources().getColor(com.tencent.mm.R.color.FG_0));
        int i17 = 0;
        this.f100316q = getIntent().getIntExtra("key_enter_fav_cleanui_from", 0);
        getIntent().getIntExtra("key_enter_fav_cleanui_status", 0);
        this.f100313n = new com.tencent.mm.sdk.platformtools.n3(getClass().getName() + "_handlerThread_" + java.lang.System.currentTimeMillis());
        this.f100309g = (android.widget.ListView) findViewById(com.tencent.mm.R.id.dtu);
        gm0.j1.d().g(new o72.k5());
        gm0.j1.d().a(438, this.A);
        setMMTitle(com.tencent.mm.R.string.c9m);
        addTextOptionMenu(0, getContext().getString(com.tencent.mm.R.string.cbi), new com.tencent.mm.plugin.fav.ui.c1(this));
        getController().x0(getContext().getString(com.tencent.mm.R.string.c_c), new com.tencent.mm.plugin.fav.ui.d1(this));
        setBackBtnVisible(false);
        com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel favFilterPanel = (com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel) findViewById(com.tencent.mm.R.id.q4y);
        this.f100315p = favFilterPanel;
        favFilterPanel.setOnTypeSelectedListener(new com.tencent.mm.plugin.fav.ui.a1(this));
        this.f100315p.setOnSortSelectedListener(new com.tencent.mm.plugin.fav.ui.b1(this));
        android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.dfm);
        if (viewStub != null) {
            this.f100311i = viewStub.inflate();
        } else {
            this.f100311i = findViewById(com.tencent.mm.R.id.dxv);
        }
        this.f100310h = findViewById(com.tencent.mm.R.id.t88);
        android.view.View view = this.f100311i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavCleanUI", "initEmptyLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavCleanUI", "initEmptyLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f100310h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavCleanUI", "initEmptyLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavCleanUI", "initEmptyLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f100309g.removeFooterView(this.f100314o);
        this.f100314o = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.abn, (android.view.ViewGroup) null);
        this.f100309g.setOnScrollListener(new com.tencent.mm.plugin.fav.ui.z0(this));
        o72.i2.b().a(this.f100325z);
        this.f100317r = java.lang.System.currentTimeMillis();
        this.f100323x = getIntent().getStringExtra("key_enter_fav_cleanui_sessionid");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_name", "favCleanPage");
        java.util.List o47 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().o4();
        long j17 = 0;
        if (o47 != null) {
            java.util.Iterator it = o47.iterator();
            while (it.hasNext()) {
                j17 += o72.x1.b((o72.r2) it.next());
            }
        }
        if (j17 > o72.x1.K()) {
            i17 = 2;
        } else if (o72.x1.m0()) {
            i17 = 1;
        }
        hashMap.put("fav_cap_status", java.lang.Integer.valueOf(i17));
        float a07 = (float) o72.x1.a0();
        float f17 = this.f100324y;
        hashMap.put("fav_cap_limit", java.lang.Float.valueOf(a07 / f17));
        hashMap.put("fav_cell_in_cnt", java.lang.Integer.valueOf(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().getCount()));
        hashMap.put("fav_cap_in_usage", java.lang.Float.valueOf(((float) o72.x1.b0()) / f17));
        hashMap.put("fav_clean_sessionid", this.f100323x);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50116, "page_in", hashMap, 32903);
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        o72.i2 b17 = o72.i2.b();
        o72.h2 h2Var = this.f100325z;
        java.util.ArrayList arrayList = b17.f343354b;
        if (arrayList.contains(h2Var)) {
            arrayList.remove(h2Var);
        }
        com.tencent.mm.plugin.fav.ui.ra raVar = this.f100306d;
        if (raVar != null) {
            raVar.f();
            this.f100306d = null;
        }
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f100307e;
        if (cVar != null) {
            cVar.getClass();
        }
        this.f100313n.quit();
        gm0.j1.d().q(438, this.A);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_name", "favCleanPage");
        java.util.List o47 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().o4();
        long j17 = 0;
        if (o47 != null) {
            java.util.Iterator it = o47.iterator();
            while (it.hasNext()) {
                j17 += o72.x1.b((o72.r2) it.next());
            }
        }
        hashMap.put("fav_cap_status", java.lang.Integer.valueOf(j17 > o72.x1.K() ? 2 : o72.x1.m0() ? 1 : 0));
        float a07 = (float) o72.x1.a0();
        float f17 = this.f100324y;
        hashMap.put("fav_cap_limit", java.lang.Float.valueOf(a07 / f17));
        hashMap.put("fav_cell_out_cnt", java.lang.Integer.valueOf(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().getCount()));
        hashMap.put("fav_cap_out_usage", java.lang.Float.valueOf(((float) o72.x1.b0()) / f17));
        hashMap.put("stay_time_ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f100317r));
        hashMap.put("fav_clean_multselect_cnt", java.lang.Integer.valueOf(this.f100318s));
        hashMap.put("fav_clean_content_list", ((java.util.HashMap) this.f100322w).keySet().stream().map(new java.util.function.Function() { // from class: com.tencent.mm.plugin.fav.ui.FavCleanUI$$a
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                o72.r2 r2Var = (o72.r2) obj;
                int i17 = com.tencent.mm.plugin.fav.ui.FavCleanUI.E;
                com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI = com.tencent.mm.plugin.fav.ui.FavCleanUI.this;
                favCleanUI.getClass();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) favCleanUI.f100322w).get(r2Var);
                    jSONObject.put("fav_type", r2Var.field_type);
                    jSONObject.put("cls_type", num == null ? 0 : num.intValue());
                    jSONObject.put("ts", c01.id.a());
                    jSONObject.put("size", r2Var.field_datatotalsize / 1024);
                    return jSONObject.toString();
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FavCleanUI", "toReportJson error", e17);
                    return "";
                }
            }
        }).collect(java.util.stream.Collectors.joining("#")));
        hashMap.put("fav_clean_sessionid", this.f100323x);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(50116, "page_out", hashMap, 32903);
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("page_id", 50116);
        hashMap.put("page_name", "favCleanPage");
        hashMap.put("fav_content_type", java.lang.Integer.valueOf(this.f100315p.getSelectedTypeIndex()));
        hashMap.put("fav_clean_sessionid", this.f100323x);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_clean_filter", "view_unexp", hashMap, 32903);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("page_id", 50116);
        hashMap2.put("page_name", "favCleanPage");
        hashMap2.put("fav_content_sort", java.lang.Integer.valueOf(this.f100315p.getSelectedSortIndex() + 1));
        hashMap2.put("fav_clean_sessionid", this.f100323x);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_clean_sort", "view_unexp", hashMap2, 32903);
    }
}
