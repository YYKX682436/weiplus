package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI */
/* loaded from: classes8.dex */
public class ActivityC15919x390706d3 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f221646x = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f221647d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f221648e;

    /* renamed from: f, reason: collision with root package name */
    public k53.c0 f221649f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f221650g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f221651h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15914x3a348830 f221652i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f221653m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f221654n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f221655o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f221656p;

    /* renamed from: s, reason: collision with root package name */
    public k53.u0 f221659s;

    /* renamed from: q, reason: collision with root package name */
    public int f221657q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f221658r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f221660t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f221661u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f221662v = 0;

    /* renamed from: w, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f221663w = new k53.h(this);

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 activityC15919x390706d3, p33.l lVar) {
        if (lVar == null) {
            activityC15919x390706d3.getClass();
            return;
        }
        activityC15919x390706d3.f221650g.setText(lVar.f433141m);
        activityC15919x390706d3.f221651h.setText(lVar.f433148t);
        if (lVar.f433135d) {
            activityC15919x390706d3.f221652i.setVisibility(8);
            android.view.View view = activityC15919x390706d3.f221653m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "resetBottomView", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "resetBottomView", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            activityC15919x390706d3.f221652i.m64617x76491f2c(lVar.f433143o);
            android.view.View view2 = activityC15919x390706d3.f221653m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "resetBottomView", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "resetBottomView", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i17 = activityC15919x390706d3.f221657q + 1;
        if (i17 > 100) {
            i17 = 100;
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(activityC15919x390706d3, 87, 8768, i17, 1, lVar.f433147s, activityC15919x390706d3.f221662v, lj0.a.a(activityC15919x390706d3.f221658r, activityC15919x390706d3.X6(lVar)));
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 activityC15919x390706d3, int i17) {
        if (i17 < activityC15919x390706d3.f221649f.mo1894x7e414b06() - 2 || !activityC15919x390706d3.f221660t) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoPreviewUI", "pull next page");
        k53.i iVar = new k53.i(activityC15919x390706d3);
        i53.t tVar = i53.t.f370248p;
        if (tVar == null) {
            iVar.a(null, false);
        } else {
            tVar.d(new i53.m(iVar));
        }
    }

    public static android.os.Bundle V6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 activityC15919x390706d3, int i17) {
        activityC15919x390706d3.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce W6 = activityC15919x390706d3.W6(i17);
        if (W6 != null) {
            bundle.putString("key_video_cache_path", W6.m64622x5000ed37());
            bundle.putString("key_video_media_id", W6.m64624x75e04be9());
        }
        return bundle;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce W6(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = this.f221648e.p0(i17);
        if (p07 instanceof k53.b0) {
            return ((k53.b0) p07).f385871e;
        }
        return null;
    }

    public final java.util.Map X6(p33.l lVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (lVar == null) {
            return hashMap;
        }
        hashMap.put("videoid", lVar.f433152x);
        hashMap.put("origtime", java.lang.Long.valueOf(lVar.f433145q));
        hashMap.put("origsize", java.lang.Long.valueOf(lVar.f433146r));
        return hashMap;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570691bi1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 19722) {
            if (intent != null && i18 == -1) {
                p33.l x17 = this.f221649f.x(this.f221657q);
                if (x17 != null) {
                    intent.putExtra("key_game_video_appid", x17.f433147s);
                    intent.putExtra("key_game_video_appname", x17.f433148t);
                }
                setResult(i18, intent);
                finish();
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce W6 = W6(this.f221657q);
            if (W6 != null) {
                k53.g gVar = W6.f221678u;
                if (gVar != null) {
                    gVar.f385893f = true;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = this.f221648e.p0(this.f221657q);
                android.widget.ImageView imageView = p07 instanceof k53.b0 ? ((k53.b0) p07).f385872f : null;
                if (imageView != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    imageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(imageView, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (this.f221656p.getVisibility() != 0) {
            super.onBackPressed();
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(this, 87, 8768, 0, 4, this.f221662v, lj0.a.a(this.f221658r, null));
            finish();
            return;
        }
        android.view.View view = this.f221656p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onBackPressed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onBackPressed", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f221659s.b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        m78583x85ccfe01(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
        ai3.d.f86640a = true;
        getWindow().setFormat(-3);
        this.f221647d = this;
        this.f221650g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.odf);
        this.f221651h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.k3s);
        this.f221652i = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15914x3a348830) findViewById(com.p314xaae8f345.mm.R.id.p0j);
        this.f221653m = findViewById(com.p314xaae8f345.mm.R.id.bzw);
        this.f221654n = findViewById(com.p314xaae8f345.mm.R.id.f568429mt0);
        this.f221655o = findViewById(com.p314xaae8f345.mm.R.id.c9z);
        this.f221656p = findViewById(com.p314xaae8f345.mm.R.id.imn);
        this.f221659s = new k53.u0(this.f221647d, this.f221656p);
        this.f221648e = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.gpj);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this);
        c1162x665295de.Q(0);
        this.f221648e.mo7967x900dcbe1(c1162x665295de);
        new p012xc85e97e9.p103xe821e364.p104xd1075a44.y1().b(this.f221648e);
        this.f221648e.i(this.f221663w);
        this.f221661u = getIntent().getBooleanExtra("game_straight_to_publish", false);
        this.f221662v = getIntent().getIntExtra("game_haowan_source_scene_id", 0);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("game_video_list");
        this.f221657q = getIntent().getIntExtra("game_video_list_current_index", 0);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(byteArrayExtra)) {
            p33.m mVar = new p33.m();
            try {
                mVar.mo11468x92b714fd(byteArrayExtra);
            } catch (java.io.IOException unused) {
            }
            linkedList.addAll(mVar.f433155d);
        }
        this.f221648e.getViewTreeObserver().addOnGlobalLayoutListener(new k53.j(this, linkedList));
        findViewById(com.p314xaae8f345.mm.R.id.c9z).setOnClickListener(new k53.k(this));
        this.f221653m.setOnClickListener(new k53.m(this));
        this.f221654n.setOnClickListener(new k53.n(this));
        findViewById(com.p314xaae8f345.mm.R.id.gph).setOnClickListener(new k53.o(this));
        if (((i53.g4) getIntent().getSerializableExtra("game_video_preview_source")) == i53.g4.FROM_PUBLISH_GALLERY) {
            this.f221658r = 7;
            android.view.View view = this.f221654n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f221655o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.f221658r = 6;
            android.view.View view3 = this.f221654n;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f221655o;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(this, 87, 8768, 0, 1, this.f221662v, lj0.a.a(this.f221658r, null));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f221648e.V0(this.f221663w);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce W6 = W6(this.f221657q);
        if (W6 != null) {
            W6.d();
        }
        this.f221659s.b();
        r53.f.l().m77784x795fa299(new k53.s(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce W6 = W6(this.f221657q);
        if (W6 != null) {
            W6.e();
        }
        qp1.h0.b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce W6 = W6(this.f221657q);
        if (W6 != null) {
            W6.g();
        }
        qp1.h0.a(true, true, true);
    }
}
