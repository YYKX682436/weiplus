package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class FavoriteVoiceDetailUI extends com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI implements l75.q0 {

    /* renamed from: m, reason: collision with root package name */
    public o72.r2 f100677m;

    /* renamed from: n, reason: collision with root package name */
    public long f100678n;

    /* renamed from: o, reason: collision with root package name */
    public o72.q3 f100679o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.FavChatVoiceView f100680p;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ace;
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(getString(com.tencent.mm.R.string.c_m));
        this.f100678n = getIntent().getLongExtra("key_detail_info_id", -1L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_detail_data_id");
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.f100678n);
        this.f100677m = F;
        if (F == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteDetailUI", "get fav item info error");
            k82.c.f304887a.e(this.f100678n, 3);
            finish();
        } else {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                java.util.Iterator it = this.f100677m.field_favProto.f370964f.iterator();
                while (it.hasNext()) {
                    if (!((r45.gp0) it.next()).T.equals(stringExtra)) {
                        it.remove();
                    }
                }
            }
            Y6(this.f100677m);
            this.f100679o = new o72.q3();
            com.tencent.mm.plugin.fav.ui.FavChatVoiceView favChatVoiceView = (com.tencent.mm.plugin.fav.ui.FavChatVoiceView) findViewById(com.tencent.mm.R.id.dto);
            this.f100680p = favChatVoiceView;
            favChatVoiceView.setVoiceHelper(this.f100679o);
            com.tencent.mm.plugin.fav.ui.detail.y1.a(this, this.f100677m);
            r45.gp0 J2 = o72.x1.J(this.f100677m);
            java.lang.String x17 = o72.x1.x(J2);
            int c07 = o72.x1.c0(J2.K);
            if (com.tencent.mm.vfs.w6.j(x17)) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.fav.ui.detail.l2(this));
            } else {
                o72.x1.C0(this.f100677m, true);
            }
            java.lang.String str = ((java.lang.String) com.tencent.mm.plugin.fav.ui.w6.b(this, (int) o72.x1.Y(J2.f375448y))).toString();
            com.tencent.mm.plugin.fav.ui.FavChatVoiceView favChatVoiceView2 = this.f100680p;
            favChatVoiceView2.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (x17 == null) {
                x17 = "";
            }
            favChatVoiceView2.f100303h = x17;
            favChatVoiceView2.f100304i = c07;
            favChatVoiceView2.setText(str);
            setBackBtn(new com.tencent.mm.plugin.fav.ui.detail.m2(this));
            addIconOptionMenu(0, com.tencent.mm.R.string.jzq, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.fav.ui.detail.r2(this));
        }
        ((l75.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).add(this);
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.fav.ui.FavChatVoiceView favChatVoiceView = this.f100680p;
        if (favChatVoiceView != null) {
            favChatVoiceView.d();
        }
        o72.q3 q3Var = this.f100679o;
        if (q3Var != null) {
            q3Var.c();
            com.tencent.mm.sdk.platformtools.SensorController sensorController = o72.q3.f343446p;
            if (sensorController != null) {
                sensorController.a();
            }
            com.tencent.mm.sdk.platformtools.s7 s7Var = q3Var.f343452i;
            if (s7Var != null) {
                s7Var.b();
            }
            o72.q3.f343446p = null;
            ((java.util.LinkedList) q3Var.f343455o).clear();
        }
        ((l75.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).remove(this);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.f100678n);
        this.f100677m = F;
        if (F == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteDetailUI", "on notify changed, get fav item info error");
            finish();
            return;
        }
        if (F.field_itemStatus != 10 || w0Var == null || w0Var.f316975c == null) {
            return;
        }
        if (F.field_favProto.f370964f.size() <= 0) {
            k82.c.f304887a.e(this.f100678n, 3);
            return;
        }
        r45.gp0 J2 = o72.x1.J(this.f100677m);
        java.lang.String x17 = o72.x1.x(J2);
        int c07 = o72.x1.c0(J2.K);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteDetailUI", "on notify changed, favVoiceView.updateInfo");
        java.lang.String str2 = ((java.lang.String) com.tencent.mm.plugin.fav.ui.w6.b(this, (int) o72.x1.Y(J2.f375448y))).toString();
        com.tencent.mm.plugin.fav.ui.FavChatVoiceView favChatVoiceView = this.f100680p;
        favChatVoiceView.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        favChatVoiceView.f100303h = x17 == null ? "" : x17;
        favChatVoiceView.f100304i = c07;
        favChatVoiceView.setText(str2);
        if (com.tencent.mm.vfs.w6.j(x17)) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.fav.ui.detail.s2(this));
        } else {
            k82.c.f304887a.e(this.f100678n, 1);
        }
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f100679o.c();
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
