package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public abstract class BaseFavDetailReportUI extends com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI {

    /* renamed from: h, reason: collision with root package name */
    public boolean f100601h;

    /* renamed from: g, reason: collision with root package name */
    public final o72.u2 f100600g = new o72.u2();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f100602i = null;

    public com.tencent.mm.ui.widget.MMLoadScrollView V6() {
        return null;
    }

    public void W6(dm.n3 n3Var, java.lang.Runnable runnable, int i17) {
        o72.t2 t2Var = new o72.t2(n3Var);
        t2Var.f343469g = getIntent().getIntExtra("key_detail_fav_is_search", 0);
        t2Var.f343470h = getIntent().getIntExtra("key_detail_fav_search_index", -1);
        t2Var.f343471i = getIntent().getIntExtra("key_detail_fav_ori_index", -1);
        t2Var.f343467e = getIntent().getIntExtra("key_detail_fav_general_msg_type", -1);
        o72.x1.l(n3Var, true, runnable, i17, t2Var);
    }

    public void X6(long j17, int i17, int i18) {
        int intExtra = getIntent().getIntExtra("key_detail_fav_index", 0);
        this.f100600g.f343477b = intExtra;
        o72.v2.e(j17, i17, i18, intExtra, getIntent().getIntExtra("key_detail_fav_is_search", 0), getIntent().getIntExtra("key_detail_fav_search_index", -1), getIntent().getIntExtra("key_detail_fav_ori_index", -1), getIntent().getIntExtra("key_detail_fav_general_msg_type", -1));
    }

    public void Y6(o72.r2 r2Var) {
        if (r2Var != null) {
            o72.u2 u2Var = this.f100600g;
            if (u2Var.f343476a > 0) {
                u2Var.f343478c = r2Var.field_id;
                u2Var.f343479d = r2Var.field_type;
                u2Var.f343481f = r2Var.field_sourceType;
                long j17 = r2Var.field_sourceCreateTime / 1000;
                u2Var.f343482g = j17;
                if (j17 == 0) {
                    u2Var.f343482g = r2Var.field_updateTime / 1000;
                }
                if (u2Var.f343482g == 0) {
                    u2Var.f343482g = r2Var.field_edittime;
                }
                u2Var.f343480e = o72.x1.M(r2Var);
                this.f100601h = true;
            }
        }
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && intent != null) {
            this.f100600g.f343484i += intent.getLongExtra("key_activity_browse_time", 0L);
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("key_detail_fav_scene", 0);
        o72.u2 u2Var = this.f100600g;
        u2Var.f343476a = intExtra;
        u2Var.f343493r = getIntent().getIntExtra("key_detail_fav_sub_scene", 0);
        u2Var.f343477b = getIntent().getIntExtra("key_detail_fav_index", 0);
        u2Var.f343496u = getIntent().getStringExtra("key_detail_fav_query");
        u2Var.f343494s = getIntent().getStringExtra("key_detail_fav_sessionid");
        u2Var.f343497v = getIntent().getStringExtra("key_detail_fav_tags");
        u2Var.f343498w = getIntent().getIntExtra("key_detail_fav_is_search", 0);
        u2Var.f343499x = getIntent().getIntExtra("key_detail_fav_search_index", -1);
        u2Var.f343500y = getIntent().getIntExtra("key_detail_fav_ori_index", -1);
        u2Var.f343501z = getIntent().getIntExtra("key_detail_fav_general_msg_type", -1);
        java.lang.String str = u2Var.f343496u;
        if (str == null) {
            str = "";
        }
        u2Var.f343496u = str;
        java.lang.String str2 = u2Var.f343494s;
        if (str2 == null) {
            str2 = "";
        }
        u2Var.f343494s = str2;
        java.lang.String str3 = u2Var.f343497v;
        u2Var.f343497v = str3 != null ? str3 : "";
        com.tencent.mm.ui.widget.MMLoadScrollView V6 = V6();
        if (V6 != null) {
            V6.setOnTopOrBottomListerner(new com.tencent.mm.plugin.fav.ui.detail.a(this));
            if (V6 instanceof com.tencent.mm.plugin.fav.ui.widget.FavDetailScrollView) {
                ((com.tencent.mm.plugin.fav.ui.widget.FavDetailScrollView) V6).setOnScrollChangeListener(new com.tencent.mm.plugin.fav.ui.detail.b(this));
            }
        }
        if (u2Var.f343476a == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.BaseFavDetailReportUI", "report object scene is 0");
        }
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (this.f100601h) {
            s75.d.b(new com.tencent.mm.plugin.fav.ui.detail.c(this), "BaseFavReport");
        }
        setResult(-1, getIntent().putExtra("key_activity_browse_time", getActivityBrowseTimeMs()));
        kk.j jVar = com.tencent.mm.plugin.fav.ui.u1.f101464a;
        com.tencent.mm.plugin.fav.ui.u1.f101464a = new jt0.i(20, com.tencent.mm.plugin.fav.ui.u1.class);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        long activityBrowseTimeMs = getActivityBrowseTimeMs();
        o72.u2 u2Var = this.f100600g;
        u2Var.f343483h = activityBrowseTimeMs;
        java.lang.String str = com.tencent.mm.modelstat.n.a().f71535b;
        if (!com.tencent.mm.sdk.platformtools.t8.D0(getClass().getName(), str) && !com.tencent.mm.sdk.platformtools.t8.D0(str, this.f100602i)) {
            long j17 = u2Var.f343484i;
            com.tencent.mm.modelstat.n a17 = com.tencent.mm.modelstat.n.a();
            java.lang.String str2 = com.tencent.mm.modelstat.n.a().f71535b;
            kk.j jVar = a17.f71534a;
            u2Var.f343484i = j17 + (jVar != null ? ((java.lang.Long) ((lt0.f) jVar).get(str2)).longValue() : 0L);
        }
        long j18 = u2Var.f343483h;
        long j19 = u2Var.f343484i;
        super.onPause();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f100602i)) {
            this.f100602i = com.tencent.mm.modelstat.n.a().f71535b;
        }
    }
}
