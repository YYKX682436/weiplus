package i53;

/* loaded from: classes8.dex */
public class a2 extends android.widget.FrameLayout implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f370029d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f370030e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f370031f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f370032g;

    /* renamed from: h, reason: collision with root package name */
    public i53.n0 f370033h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f370034i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f370035m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f370036n;

    /* renamed from: o, reason: collision with root package name */
    public i53.t f370037o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f370038p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f370039q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f370040r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f370041s;

    /* renamed from: t, reason: collision with root package name */
    public int f370042t;

    /* renamed from: u, reason: collision with root package name */
    public p33.l f370043u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f370044v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f370045w;

    /* renamed from: x, reason: collision with root package name */
    public final android.content.Context f370046x;

    /* renamed from: y, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f370047y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f370048z;

    public a2(android.content.Context context) {
        super(context);
        this.f370040r = false;
        this.f370041s = false;
        this.f370042t = 0;
        this.f370046x = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getDataFromNet */
    public void m134735x5e1fdd53() {
        java.lang.System.currentTimeMillis();
        this.f370037o.d(new i53.y1(this));
    }

    public final void b(android.view.View view, int i17, int i18) {
        ((android.view.ViewGroup) this.f370029d.findViewById(com.p314xaae8f345.mm.R.id.ghu)).addView(view, i17, i18);
    }

    public final void c() {
        android.view.View view = this.f370032g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void d() {
        if (this.f370045w) {
            return;
        }
        this.f370038p.show();
        m134735x5e1fdd53();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new i53.t1(this), false);
        this.f370044v = b4Var;
        b4Var.c(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
    }

    public final void e(p33.o oVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(oVar.f433160g)) {
            this.f370048z.setVisibility(8);
            this.f370047y.setVisibility(8);
            return;
        }
        this.f370047y.m8315x6cab2c8d(new i53.z1(this, ((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) this.f370046x).mo7595x9cdc264(), oVar.f433160g));
        this.f370047y.m8321x40341e13(3);
        this.f370047y.m8323x5dd4731f(ym5.x.a(getContext(), 8.0f));
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(getContext());
        ((android.widget.LinearLayout.LayoutParams) this.f370047y.getLayoutParams()).height = ((int) ((a17.f278668a - ym5.x.a(getContext(), 40.0f)) * 0.5625f)) + ym5.x.a(getContext(), 73.0f);
        this.f370048z.setVisibility(0);
        this.f370047y.setVisibility(0);
    }

    public final void f(int i17, int i18, java.util.Map map) {
        if (map == null) {
            map = new java.util.HashMap();
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8762, i17, i18, this.f370042t, lj0.a.a(7, map));
    }

    public final void g(java.util.LinkedList linkedList, boolean z17, boolean z18) {
        if (!z18) {
            this.f370038p.dismiss();
        }
        android.view.View view = this.f370031f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f370044v;
        if (b4Var != null) {
            b4Var.d();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            android.view.View view2 = this.f370030e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f(502, 1, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15909x288b5949 activityC15909x288b5949 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15909x288b5949) getContext();
            activityC15909x288b5949.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(i53.t.b("game_haowan_mmkv_key")).getInt("game_last_choose_gallery", 0) == 0 && activityC15909x288b5949.f221590f.m8300xfda78ef6() % 2 == 0) {
                activityC15909x288b5949.U6(1, false);
            }
        } else {
            android.view.View view3 = this.f370030e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f370034i) {
                java.lang.String str = ((p33.l) linkedList.get(0)).f433147s;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(i53.t.b("game_haowan_mmkv_key")).putBoolean("game_publish_gallery_first_enter", false);
            }
        }
        this.f370033h.g1(linkedList, z17, z18);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f370037o.a();
        gm0.j1.d().q(9911, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var != null && m1Var.mo808xfb85f7b0() == 9911 && i17 == 0 && i18 == 0) {
            java.lang.Object mo141623x754a37bb = ((r33.h) m1Var).f450516e.mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p944x882e457a.o) mo141623x754a37bb).f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.ugc.GetRecommendVideoListResponse");
            p33.o oVar = (p33.o) fVar;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5580x225208dc c5580x225208dc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5580x225208dc();
            am.we weVar = c5580x225208dc.f135902g;
            weVar.f89811a = 2;
            weVar.f89812b = "cache_video_recommend";
            try {
                weVar.f89813c = oVar.mo14344x5f01b1f6();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameHaoWanGalleryView", e17.getMessage());
            }
            c5580x225208dc.e();
            e(oVar);
        }
    }

    /* renamed from: setLocalAlbumInfos */
    public void m134736x2d938d5f(org.json.JSONArray jSONArray) {
        i53.t tVar = new i53.t();
        this.f370037o = tVar;
        i53.t.f370248p = tVar;
        tVar.h(jSONArray);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bg8, (android.view.ViewGroup) this, true);
        this.f370029d = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.gla);
        this.f370036n = findViewById;
        if (this.f370040r) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "initRootView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "initRootView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "initRootView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "initRootView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f370029d.findViewById(com.p314xaae8f345.mm.R.id.gn9).setOnClickListener(new i53.w1(this));
        this.f370045w = false;
        i53.n0 n0Var = new i53.n0(getContext(), 8762, this.f370042t);
        this.f370033h = n0Var;
        n0Var.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f370033h.i(new i53.r1(this));
        android.content.Context context = this.f370046x;
        this.f370038p = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), false, 3, null);
        this.f370033h.m134760xa1aeda28(new i53.s1(this));
        b(this.f370033h, -1, -1);
        android.view.View inflate2 = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdr, (android.view.ViewGroup) this, false);
        this.f370030e = inflate2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(inflate2, arrayList3.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(inflate2, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b(this.f370030e, -1, -1);
        android.view.View inflate3 = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdv, (android.view.ViewGroup) this, false);
        this.f370031f = inflate3;
        ((android.widget.Button) inflate3.findViewById(com.p314xaae8f345.mm.R.id.gpm)).setOnClickListener(new i53.u1(this));
        android.view.View view = this.f370031f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createWeakNetView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b(this.f370031f, -1, -1);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(i53.t.b("game_haowan_mmkv_key")).getBoolean("game_publish_gallery_first_enter", true);
        this.f370034i = z17;
        if (z17) {
            android.view.View inflate4 = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bds, (android.view.ViewGroup) this.f370033h, false);
            this.f370035m = inflate4;
            ((android.widget.ImageView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.glp)).setOnClickListener(new i53.v1(this));
            i53.n0 n0Var2 = this.f370033h;
            n0Var2.f370204e2.f370158g.add(this.f370035m);
            f(503, 1, null);
        }
        android.view.View inflate5 = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bhz, (android.view.ViewGroup) null);
        this.f370047y = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) inflate5.findViewById(com.p314xaae8f345.mm.R.id.f569103p16);
        this.f370048z = (android.widget.TextView) inflate5.findViewById(com.p314xaae8f345.mm.R.id.ond);
        this.f370033h.f370204e2.f370158g.add(inflate5);
        android.view.View inflate6 = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdt, (android.view.ViewGroup) this, false);
        this.f370032g = inflate6;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(inflate6, arrayList5.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(inflate6, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "createLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b(this.f370032g, -1, -1);
        java.util.LinkedList c17 = this.f370037o.c();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c17)) {
            android.view.View view2 = this.f370032g;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view2, arrayList6.toArray(), "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/media/GamePublishGalleryView", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            g(c17, false, true);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5580x225208dc c5580x225208dc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5580x225208dc();
        am.we weVar = c5580x225208dc.f135902g;
        weVar.f89811a = 1;
        weVar.f89812b = "cache_video_recommend";
        c5580x225208dc.e();
        byte[] bArr = weVar.f89813c;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            p33.o oVar = new p33.o();
            try {
                oVar.mo11468x92b714fd(bArr);
                e(oVar);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameHaoWanGalleryView", e17.getMessage());
            }
        }
        gm0.j1.d().a(9911, this);
        gm0.j1.d().g(new r33.h());
        m134735x5e1fdd53();
    }
}
