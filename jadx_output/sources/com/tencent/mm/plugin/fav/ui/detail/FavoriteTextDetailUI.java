package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class FavoriteTextDetailUI extends com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI {

    /* renamed from: r, reason: collision with root package name */
    public static final int f100650r = ip.c.d();

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f100651m;

    /* renamed from: n, reason: collision with root package name */
    public o72.r2 f100652n;

    /* renamed from: o, reason: collision with root package name */
    public o72.r2 f100653o;

    /* renamed from: p, reason: collision with root package name */
    public long f100654p;

    /* renamed from: q, reason: collision with root package name */
    public final db5.t4 f100655q = new com.tencent.mm.plugin.fav.ui.detail.w1(this);

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI
    public com.tencent.mm.ui.widget.MMLoadScrollView V6() {
        return (com.tencent.mm.ui.widget.MMLoadScrollView) findViewById(com.tencent.mm.R.id.mcm);
    }

    public final void Z6() {
        r45.bq0 bq0Var;
        r45.jq0 jq0Var;
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.f100654p);
        this.f100652n = F;
        Y6(F);
        o72.r2 r2Var = this.f100652n;
        if (r2Var == null || r2Var.field_favProto == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteTextDetailUI", "id[%d] info is null, return", java.lang.Long.valueOf(this.f100654p));
            k82.c.f304887a.e(this.f100654p, 3);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.fav.ui.detail.v1(this));
        com.tencent.mm.plugin.fav.ui.detail.y1.a(this, this.f100652n);
        o72.r2 r2Var2 = this.f100653o;
        if (r2Var2 != null && r2Var2.field_edittime == this.f100652n.field_edittime) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteTextDetailUI", "not change, return");
            return;
        }
        o72.r2 r2Var3 = this.f100652n;
        this.f100653o = r2Var3;
        this.f100651m.setText(r2Var3.field_favProto.f370974s);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_wxa_short_link_launch_scene", "FAVORITE");
        o72.r2 r2Var4 = this.f100652n;
        if (r2Var4 != null && (bq0Var = r2Var4.field_favProto) != null && (jq0Var = bq0Var.f370962d) != null) {
            bundle.putInt("geta8key_scene", 14);
            bundle.putString("serverMsgID", jq0Var.f378046s);
            bundle.putString("msgUsername", jq0Var.f378036f);
            bundle.putString("geta8key_username", o72.c3.b(jq0Var));
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView = this.f100651m;
        le0.r rVar = le0.x.P0;
        ((ke0.e) xVar).getClass();
        com.tencent.mm.pluginsdk.ui.span.c0.o(textView, 1, 3, bundle, rVar, true, false);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.acd;
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (1 != i17 || -1 != i18) {
            super.onActivityResult(i17, i18, intent);
        } else {
            db5.e1.T(getContext(), getString(com.tencent.mm.R.string.f490548y7));
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.fav.ui.detail.x1(this), 250L);
        }
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f100651m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.bfo);
        this.f100654p = getIntent().getLongExtra("key_detail_info_id", -1L);
        h45.g0.f278945a = 5;
        new com.tencent.mm.ui.tools.s6(getContext()).c(this.f100651m, this, this.f100655q);
        setMMTitle(getString(com.tencent.mm.R.string.c_m));
        setBackBtn(new com.tencent.mm.plugin.fav.ui.detail.p1(this));
        addIconOptionMenu(0, com.tencent.mm.R.string.jzq, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.fav.ui.detail.u1(this));
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, getString(com.tencent.mm.R.string.f490359sr));
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Z6();
    }
}
