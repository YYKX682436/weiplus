package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class FavoriteSightDetailUI extends com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI implements o72.x3, l75.q0 {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f100636m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f100637n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMPinProgressBtn f100638o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f100639p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f100640q;

    /* renamed from: r, reason: collision with root package name */
    public o72.r2 f100641r;

    /* renamed from: s, reason: collision with root package name */
    public r45.gp0 f100642s;

    /* renamed from: t, reason: collision with root package name */
    public long f100643t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f100644u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f100645v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f100646w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f100647x = false;

    /* renamed from: y, reason: collision with root package name */
    public final o72.b3 f100648y = new o72.b3();

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Runnable f100649z = new com.tencent.mm.plugin.fav.ui.detail.m1(this);
    public boolean A = false;

    public static void Z6(com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI favoriteSightDetailUI, boolean z17, android.content.Context context) {
        r45.rp0 rp0Var;
        r45.gp0 J2 = o72.x1.J(favoriteSightDetailUI.f100641r);
        if (J2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteSightDetailUI", "goPlayView, but dataitem is null , exit");
            return;
        }
        r45.jp0 jp0Var = J2.O1;
        o72.u2 u2Var = favoriteSightDetailUI.f100600g;
        if (jp0Var != null && (!com.tencent.mm.sdk.platformtools.t8.K0(jp0Var.f377998d) || !com.tencent.mm.sdk.platformtools.t8.K0(J2.O1.f378001g))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteSightDetailUI", "it is ad sight.use sight play");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_detail_fav_scene", u2Var.f343476a);
            intent.putExtra("key_detail_fav_sub_scene", u2Var.f343493r);
            intent.putExtra("key_detail_info_id", favoriteSightDetailUI.f100641r.field_localId);
            intent.putExtra("key_detail_data_id", J2.T);
            intent.putExtra("key_detail_can_delete", false);
            o72.x1.L0(context, ".ui.detail.FavoriteFileDetailUI", intent, null);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_detail_info_id", favoriteSightDetailUI.f100641r.field_localId);
        intent2.putExtra("key_detail_fav_scene", u2Var.f343476a);
        intent2.putExtra("key_detail_fav_sub_scene", u2Var.f343493r);
        intent2.putExtra("key_detail_fav_path", o72.x1.x(J2));
        intent2.putExtra("key_detail_fav_thumb_path", o72.x1.X(J2));
        intent2.putExtra("key_detail_fav_video_duration", J2.f375448y);
        intent2.putExtra("key_detail_statExtStr", J2.R1);
        intent2.putExtra("key_detail_data_valid", z17);
        intent2.putExtra("key_detail_msg_uuid", J2.f375431q2);
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_media_gallery_ui_fav", "0").equals("1")) {
            o72.x1.L0(context, ".ui.detail.FavoriteVideoPlayUI", intent2, null);
            return;
        }
        r45.hp0 hp0Var = J2.J1;
        r45.qp0 qp0Var = hp0Var.f376369w;
        if (qp0Var == null) {
            qp0Var = hp0Var.f376370x;
        }
        if (qp0Var != null && (rp0Var = qp0Var.f384172q) != null) {
            intent2.putExtra("img_gallery_width", rp0Var.f385072f).putExtra("img_gallery_height", qp0Var.f384172q.f385073g).putExtra("img_gallery_left", qp0Var.f384172q.f385070d).putExtra("img_gallery_top", qp0Var.f384172q.f385071e);
        }
        try {
            pf5.j0.a(intent2, bi5.a.class);
            o72.x1.L0(context, "com.tencent.mm.ui.media.MediaGalleryContainerUI", intent2, null);
        } catch (java.lang.ClassNotFoundException unused) {
        }
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        java.lang.String str;
        if (e2Var == null || (str = e2Var.field_dataId) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, item is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, dataID is %s, field id is %s,offset is %d, total is %d,cdn status is %d, cdn type is %d (send or recieve)", this.f100642s.T, str, java.lang.Integer.valueOf(e2Var.field_offset), java.lang.Integer.valueOf(e2Var.field_totalLen), java.lang.Integer.valueOf(e2Var.field_status), java.lang.Integer.valueOf(e2Var.field_type));
        if (e2Var.field_offset > e2Var.field_totalLen) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, cdn offset length > cdn total length, do cdnLengthError()");
            if (1 == e2Var.field_type) {
                e2Var.field_status = 2;
            } else {
                e2Var.field_status = 4;
            }
            ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().A5(e2Var, new java.lang.String[0]);
            if (e2Var.field_type == 0) {
                o72.x1.S0(e2Var);
            }
            if (e2Var.field_type == 1) {
                o72.x1.P0(e2Var);
            }
        }
        if (e2Var.field_dataId.equals(this.f100642s.T)) {
            this.f100638o.post(new com.tencent.mm.plugin.fav.ui.detail.n1(this, (int) e2Var.v0()));
        }
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI
    public com.tencent.mm.ui.widget.MMLoadScrollView V6() {
        return (com.tencent.mm.ui.widget.MMLoadScrollView) findViewById(com.tencent.mm.R.id.mcm);
    }

    public final void a7() {
        java.lang.String x17 = o72.x1.x(this.f100642s);
        if (com.tencent.mm.vfs.w6.j(x17)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("is265: ");
            ((vf0.h1) ((wf0.f1) i95.n0.c(wf0.f1.class))).getClass();
            sb6.append(x17 == null ? false : com.tencent.mm.modelvideoh265toh264.j.h(x17));
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteSightDetailUI", sb6.toString());
            this.f100639p.stop();
            this.f100639p.setMute(true);
            this.f100639p.setVideoPath(x17);
        }
    }

    public final void b7(boolean z17) {
        if (!this.f100641r.I0()) {
            o72.r2 r2Var = this.f100641r;
            if (r2Var.field_itemStatus == 8) {
                k82.c.f304887a.e(this.f100643t, 1);
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f100642s.f375434s)) {
                    this.f100637n.setImageResource(com.tencent.mm.R.raw.shortvideo_play_btn);
                } else {
                    this.f100637n.setImageResource(com.tencent.mm.R.raw.shortvideo_play_btn);
                    if (z17) {
                        db5.e1.T(getContext(), getString(com.tencent.mm.R.string.brf));
                    }
                }
            } else if (r2Var.P0()) {
                k82.c.f304887a.e(this.f100643t, 4);
                this.f100637n.setImageResource(com.tencent.mm.R.raw.shortvideo_play_btn);
                if (z17) {
                    db5.e1.T(getContext(), getString(com.tencent.mm.R.string.c_9));
                }
            } else {
                if (this.f100641r.J0() || this.f100641r.Q0()) {
                    this.f100637n.setVisibility(8);
                    this.f100638o.setVisibility(0);
                    o72.e2 Xf = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(this.f100642s.T);
                    if (Xf != null) {
                        this.f100638o.setProgress((int) Xf.v0());
                    } else {
                        this.f100638o.setProgress(0);
                    }
                    this.f100640q.setVisibility(0);
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteSightDetailUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
                this.f100637n.setImageResource(com.tencent.mm.R.raw.shortvideo_play_btn);
            }
        } else {
            if (o72.x1.i0(this.f100642s)) {
                this.f100637n.setVisibility(8);
                this.f100638o.setVisibility(8);
                a7();
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.fav.ui.detail.l1(this));
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f100642s.f375434s)) {
                k82.c.f304887a.e(this.f100643t, 3);
                this.f100637n.setImageResource(com.tencent.mm.R.raw.shortvideo_play_btn);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteSightDetailUI", "? info is done, source file not exist, cdn data url is not null");
                this.f100637n.setImageResource(com.tencent.mm.R.raw.shortvideo_play_btn);
            }
        }
        this.f100637n.setVisibility(0);
        this.f100638o.setVisibility(8);
        this.f100640q.setVisibility(0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.acc;
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1 || -1 != i18) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
        java.lang.String stringExtra2 = intent == null ? null : intent.getStringExtra("custom_send_text");
        com.tencent.mm.plugin.fav.ui.detail.o1 o1Var = new com.tencent.mm.plugin.fav.ui.detail.o1(this, db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null));
        androidx.appcompat.app.AppCompatActivity context = getContext();
        o72.r2 r2Var = this.f100641r;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(r2Var);
        com.tencent.mm.plugin.fav.ui.f6 f6Var = new com.tencent.mm.plugin.fav.ui.f6();
        f6Var.f100848b = stringExtra;
        f6Var.f100849c = stringExtra2;
        f6Var.f100851e = linkedList;
        com.tencent.mm.plugin.fav.ui.x5.h(context, f6Var, o1Var);
        boolean R4 = com.tencent.mm.storage.z3.R4(stringExtra);
        o72.o3.c(R4 ? o72.m3.Chatroom : o72.m3.Chat, this.f100641r, o72.n3.Samll, R4 ? c01.v1.o(stringExtra) : 0);
        com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.c9u), null, this, null, null);
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        this.f100643t = getIntent().getLongExtra("key_detail_info_id", -1L);
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.f100643t);
        this.f100641r = F;
        if (F == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteSightDetailUI", "id[%d] info is null, return", java.lang.Long.valueOf(this.f100643t));
            k82.c.f304887a.e(this.f100643t, 3);
            finish();
            return;
        }
        Y6(F);
        o72.o3.a(this.f100641r);
        com.tencent.mm.plugin.fav.ui.detail.y1.a(this, this.f100641r);
        this.f100642s = o72.x1.J(this.f100641r);
        this.f100637n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.nhn);
        this.f100638o = (com.tencent.mm.ui.widget.MMPinProgressBtn) findViewById(com.tencent.mm.R.id.f487558p01);
        this.f100636m = findViewById(com.tencent.mm.R.id.f483752by4);
        if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigFav265Switch()) == 1) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.p0x);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((cf0.c0) ((df0.t) i95.n0.c(df0.t.class))).getClass();
            this.f100639p = new com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer(this, null, 0, 6, null);
            ((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.vmn)).addView((android.view.View) this.f100639p, new android.widget.FrameLayout.LayoutParams(-1, -1));
        } else {
            this.f100639p = (com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) findViewById(com.tencent.mm.R.id.p0x);
        }
        this.f100640q = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.p0l);
        this.f100636m.setOnClickListener(new com.tencent.mm.plugin.fav.ui.detail.b1(this));
        this.f100639p.setVideoCallback(new com.tencent.mm.plugin.fav.ui.detail.e1(this));
        setMMTitle(getString(com.tencent.mm.R.string.c_m));
        setBackBtn(new com.tencent.mm.plugin.fav.ui.detail.f1(this));
        addIconOptionMenu(0, com.tencent.mm.R.string.jzq, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.fav.ui.detail.k1(this));
        if (com.tencent.mm.vfs.w6.j(o72.x1.X(this.f100642s))) {
            android.graphics.Bitmap i17 = com.tencent.mm.plugin.fav.ui.ra.i(this.f100642s, this.f100641r);
            if (i17 != null) {
                int width = i17.getWidth();
                int height = i17.getHeight();
                if (!this.A) {
                    this.A = true;
                    int i18 = com.tencent.mm.ui.bk.h(getContext()).x;
                    float dimensionPixelOffset = (getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479770er) * 2) + 0.5f;
                    android.view.ViewGroup.LayoutParams layoutParams = this.f100636m.getLayoutParams();
                    if (layoutParams == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteSightDetailUI", "setViewResize, but params is null");
                    } else {
                        int i19 = i18 - ((int) dimensionPixelOffset);
                        layoutParams.width = i19;
                        layoutParams.height = (i19 * height) / width;
                        this.f100636m.setLayoutParams(layoutParams);
                    }
                }
                this.f100640q.setImageBitmap(i17);
                this.f100640q.setVisibility(0);
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f100642s.f375412h)) {
            o72.x1.A0(this.f100641r, this.f100642s, true);
        }
        b7(false);
        ((l75.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).add(this);
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ia(this);
        o25.n1.c(this);
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f100639p;
        if (f4Var != null) {
            f4Var.setVideoCallback(null);
            this.f100639p.stop();
            this.f100639p.onDetach();
        }
        ((l75.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).remove(this);
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Y(this);
        super.onDestroy();
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteSightDetailUI", "on favitem change, notifyId:%s, curId:%d", str, java.lang.Long.valueOf(this.f100641r.field_localId));
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.f100641r.field_localId);
        if (F == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteSightDetailUI", "error, on notify change, cannot find info");
            finish();
            return;
        }
        this.f100641r = F;
        this.f100642s = o72.x1.J(F);
        o72.e2 Xf = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(this.f100642s.T);
        boolean z17 = false;
        if (Xf != null && !this.f100647x) {
            if (Xf.field_status == 4 && ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(this.f100642s.T).field_extFlag != 0) {
                o72.x1.y0(this.f100641r, this.f100642s, true);
                this.f100647x = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteSightDetailUI", "FavoriteFileDetail download, check retry, return %B", java.lang.Boolean.valueOf(this.f100647x));
            z17 = this.f100647x;
        }
        if (z17) {
            return;
        }
        java.lang.Runnable runnable = this.f100649z;
        com.tencent.mm.sdk.platformtools.u3.l(runnable);
        com.tencent.mm.sdk.platformtools.u3.i(runnable, 500L);
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f100639p;
        if (f4Var != null) {
            f4Var.stop();
        }
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f100639p;
        if (f4Var != null) {
            if (!this.f100644u) {
                a7();
            } else if (!f4Var.isPlaying()) {
                this.f100639p.start();
            }
            this.f100644u = false;
        }
    }
}
