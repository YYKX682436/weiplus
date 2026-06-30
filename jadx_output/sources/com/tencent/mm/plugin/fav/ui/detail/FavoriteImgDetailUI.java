package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class FavoriteImgDetailUI extends com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI implements o72.x3 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f100624w = 0;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f100625m;

    /* renamed from: o, reason: collision with root package name */
    public o72.r2 f100627o;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Bitmap f100629q;

    /* renamed from: s, reason: collision with root package name */
    public kd0.p2 f100631s;

    /* renamed from: n, reason: collision with root package name */
    public int f100626n = 0;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f100628p = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public boolean f100630r = true;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnClickListener f100632t = new com.tencent.mm.plugin.fav.ui.detail.v0(this);

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f100633u = new com.tencent.mm.plugin.fav.ui.detail.w0(this);

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f100634v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.15
        {
            this.__eventId = 812146647;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
            java.lang.String str = recogQBarOfImageFileResultEvent2.f54661g.f6368a;
            com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI = com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.this;
            com.tencent.mm.plugin.fav.ui.detail.a1 a1Var = null;
            for (com.tencent.mm.plugin.fav.ui.detail.a1 a1Var2 : favoriteImgDetailUI.f100628p.values()) {
                if (str.equals(o72.x1.x(a1Var2.f100683a))) {
                    a1Var = a1Var2;
                }
            }
            if (a1Var == null) {
                return true;
            }
            com.tencent.mm.pluginsdk.ui.tools.s6 s6Var = com.tencent.mm.pluginsdk.ui.tools.s6.f191898a;
            java.lang.String e17 = s6Var.e(recogQBarOfImageFileResultEvent2);
            int c17 = s6Var.c(recogQBarOfImageFileResultEvent2);
            int d17 = s6Var.d(recogQBarOfImageFileResultEvent2);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            a1Var.f100687e = e17;
            a1Var.f100688f = c17;
            a1Var.f100689g = d17;
            a1Var.f100690h = str;
            a1Var.f100691i = com.tencent.mm.pluginsdk.ui.tools.s6.b(recogQBarOfImageFileResultEvent2);
            if (!a1Var.f100685c.i()) {
                return true;
            }
            com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.Z6(favoriteImgDetailUI, a1Var);
            return true;
        }
    };

    public static void Z6(com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI, com.tencent.mm.plugin.fav.ui.detail.a1 a1Var) {
        favoriteImgDetailUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = a1Var.f100685c;
        k0Var.f211872n = new com.tencent.mm.plugin.fav.ui.detail.x0(favoriteImgDetailUI, k0Var, a1Var);
        k0Var.f211881s = new com.tencent.mm.plugin.fav.ui.detail.y0(favoriteImgDetailUI, a1Var);
        k0Var.f211854d = new com.tencent.mm.plugin.fav.ui.detail.z0(favoriteImgDetailUI, a1Var);
        if (favoriteImgDetailUI.getContext().isFinishing()) {
            return;
        }
        k0Var.v();
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        if (e2Var != null && e2Var.w0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImgDetailUI", "on cdn status change, dataid[%s]", e2Var.field_dataId);
            com.tencent.mm.plugin.fav.ui.detail.a1 a1Var = (com.tencent.mm.plugin.fav.ui.detail.a1) this.f100628p.get(e2Var.field_dataId);
            if (a1Var != null) {
                b7(a1Var, "onCdnStatusChanged");
                return;
            }
            return;
        }
        if (e2Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImgDetailUI", "onCdnStatusChanged: dataid[%s], cdn status=%d", e2Var.field_dataId, java.lang.Integer.valueOf(e2Var.field_status));
            if (e2Var.field_status == 4) {
                k82.c.f304887a.e(this.f100627o.field_localId, 1);
            }
        }
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI
    public com.tencent.mm.ui.widget.MMLoadScrollView V6() {
        return (com.tencent.mm.ui.widget.MMLoadScrollView) findViewById(com.tencent.mm.R.id.mcm);
    }

    public final android.graphics.Bitmap a7(r45.gp0 gp0Var) {
        android.graphics.Bitmap i17 = com.tencent.mm.plugin.fav.ui.ra.i(gp0Var, this.f100627o);
        if (i17 != null) {
            return i17;
        }
        if (this.f100629q == null) {
            this.f100629q = bp.b.decodeResource(getResources(), com.tencent.mm.R.raw.fav_list_img_default, null);
        }
        return this.f100629q;
    }

    public final void b7(com.tencent.mm.plugin.fav.ui.detail.a1 a1Var, java.lang.String str) {
        gm0.j1.e().j(new com.tencent.mm.plugin.fav.ui.detail.u0(this, a1Var, str));
    }

    public final void c7() {
        int dimensionPixelOffset = com.tencent.mm.ui.bk.h(getContext()).x - (getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479770er) * 2);
        this.f100626n = dimensionPixelOffset;
        this.f100626n = java.lang.Math.max(dimensionPixelOffset, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.acb;
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (1 == i17) {
            if (-1 != i18) {
                return;
            }
            if (new o72.b3().a(this.f100627o, false, false)) {
                db5.e1.T(getContext(), getString(com.tencent.mm.R.string.f489705e));
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            o72.r2 r2Var = this.f100627o;
            com.tencent.mm.plugin.fav.ui.detail.l0 l0Var = new com.tencent.mm.plugin.fav.ui.detail.l0(this, Q);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(r2Var);
            com.tencent.mm.plugin.fav.ui.f6 f6Var = new com.tencent.mm.plugin.fav.ui.f6();
            f6Var.f100848b = stringExtra;
            f6Var.f100849c = stringExtra2;
            f6Var.f100851e = linkedList;
            com.tencent.mm.plugin.fav.ui.x5.h(context, f6Var, l0Var);
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c7();
        java.util.Iterator it = this.f100628p.entrySet().iterator();
        while (it.hasNext()) {
            b7((com.tencent.mm.plugin.fav.ui.detail.a1) ((java.util.Map.Entry) it.next()).getValue(), "onConfigurationChanged");
        }
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        c7();
        this.f100625m = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.duv);
        long longExtra = getIntent().getLongExtra("key_detail_info_id", -1L);
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(longExtra);
        this.f100627o = F;
        if (F == null) {
            k82.c.f304887a.e(longExtra, 3);
            finish();
            return;
        }
        Y6(F);
        java.util.Iterator it = this.f100627o.field_favProto.f370964f.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            java.lang.String str = gp0Var.T;
            com.tencent.mm.plugin.fav.ui.detail.a1 a1Var = new com.tencent.mm.plugin.fav.ui.detail.a1(this, null);
            a1Var.f100683a = gp0Var;
            int i18 = i17 + 1;
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479924j3);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            if (i17 > 0) {
                layoutParams.topMargin = dimensionPixelSize;
            }
            this.f100625m.addView(imageView, layoutParams);
            imageView.setTag(gp0Var);
            int i19 = dimensionPixelSize / 2;
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            imageView.setPadding(i19, i19, i19, i19);
            imageView.setMinimumWidth(i65.a.b(getContext(), 50));
            imageView.setMinimumHeight(i65.a.b(getContext(), 50));
            imageView.setImageResource(com.tencent.mm.R.raw.fav_list_img_default);
            imageView.setOnClickListener(this.f100632t);
            imageView.setOnLongClickListener(this.f100633u);
            imageView.setOnTouchListener(new com.tencent.mm.plugin.fav.ui.detail.j0(this, gp0Var, imageView, i19));
            a1Var.f100684b = imageView;
            this.f100628p.put(gp0Var.T, a1Var);
            b7(a1Var, "initDetail");
            if (gp0Var.X1 != 0) {
                this.f100630r = false;
            }
            i17 = i18;
        }
        setMMTitle(getString(com.tencent.mm.R.string.c_m));
        com.tencent.mm.plugin.fav.ui.detail.y1.a(this, this.f100627o);
        setBackBtn(new com.tencent.mm.plugin.fav.ui.detail.m0(this));
        addIconOptionMenu(0, com.tencent.mm.R.string.jzq, com.tencent.mm.R.raw.actionbar_icon_dark_more, new com.tencent.mm.plugin.fav.ui.detail.r0(this, longExtra));
        o25.n1.c(this);
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ia(this);
        this.f100634v.alive();
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        com.tencent.mm.plugin.fav.ui.detail.s0 s0Var = new com.tencent.mm.plugin.fav.ui.detail.s0(this);
        ((jd0.q2) x2Var).getClass();
        this.f100631s = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(this, s0Var);
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Y(this);
        this.f100634v.dead();
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        java.util.Iterator it = this.f100628p.entrySet().iterator();
        while (it.hasNext()) {
            b7((com.tencent.mm.plugin.fav.ui.detail.a1) ((java.util.Map.Entry) it.next()).getValue(), "onResume");
        }
    }
}
