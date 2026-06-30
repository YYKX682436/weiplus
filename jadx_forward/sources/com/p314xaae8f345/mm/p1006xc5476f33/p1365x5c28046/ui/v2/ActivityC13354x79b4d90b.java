package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI */
/* loaded from: classes11.dex */
public class ActivityC13354x79b4d90b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f179863r = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13353xcecbd7a3 f179865e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13356x886711a7 f179866f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.m0 f179867g;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.n0 f179874q;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f179864d = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public int f179868h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f179869i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f179870m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f179871n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f179872o = -1;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f179873p = "";

    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618 T6(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618 abstractC13342x6ac9a618 = null;
        if (i17 < 0) {
            return null;
        }
        java.util.HashMap hashMap = this.f179864d;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618) hashMap.get(java.lang.Integer.valueOf(i17));
        }
        if (i17 == 0) {
            abstractC13342x6ac9a618 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618) p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.m7421x83a782ea(this, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13345x6af53d00.class.getName(), null);
            abstractC13342x6ac9a618.H = this.f179873p;
        } else if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreV2UI", "create fragment failed.");
        } else {
            abstractC13342x6ac9a618 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618) p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.m7421x83a782ea(this, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13346x1b6d5cdc.class.getName(), null);
        }
        if (abstractC13342x6ac9a618 != null) {
            abstractC13342x6ac9a618.m78698x1cf75fac(this);
        }
        hashMap.put(java.lang.Integer.valueOf(i17), abstractC13342x6ac9a618);
        return abstractC13342x6ac9a618;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a89;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.u().booleanValue()) {
            m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8, com.p314xaae8f345.mm.R.raw.f78356x618865ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.i0(this));
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_emoticon_new_personal_center_andr, false);
            m78478x84f07bce(1, com.p314xaae8f345.mm.R.C30867xcad56011.f572004w0, fj6 ? com.p314xaae8f345.mm.R.raw.f80836xa9233cb2 : com.p314xaae8f345.mm.R.raw.f78368xa86f0fea, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.j0(this, fj6));
        }
        this.f179874q = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.n0(this, 1, "stickernavright");
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.f179874q);
        this.f179865e = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13353xcecbd7a3) findViewById(com.p314xaae8f345.mm.R.id.dek);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13356x886711a7 c13356x886711a7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13356x886711a7) findViewById(com.p314xaae8f345.mm.R.id.dej);
        this.f179866f = c13356x886711a7;
        c13356x886711a7.m80853x40341e13(0);
        this.f179867g = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.m0(this, this, this.f179866f, this.f179869i);
        if (!this.f179869i) {
            this.f179865e.setVisibility(8);
        } else {
            this.f179865e.setVisibility(0);
            this.f179865e.f179861q.mo48813x58998cd();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.m0 m0Var = this.f179867g;
        if (m0Var != null) {
            if (m0Var.f179908f.T6(this.f179868h) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.m0 m0Var2 = this.f179867g;
                m0Var2.f179908f.T6(this.f179868h).mo7496x9d4787cb(i17, i18, intent);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.ui.C21407xddef161a c21407xddef161a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        super.onCreate(bundle);
        this.f179873p = java.lang.String.valueOf(currentTimeMillis);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.t().booleanValue() || com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.u().booleanValue()) ? false : true);
        java.lang.Boolean u17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.u();
        if (valueOf.booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2UI", "exit in teen mode");
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(this);
            finish();
            return;
        }
        this.f179871n = getIntent().getIntExtra("download_entrance_scene", -1);
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ShowPersonalEmotion");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreV2UI", "get dynamic config value:%s", d17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(d17, 0) != 1 || u17.booleanValue()) {
            this.f179869i = false;
        } else {
            this.f179869i = true;
        }
        if (this.f179869i) {
            this.f179868h = getIntent().getIntExtra("emoji_tab", 0);
        }
        this.f179872o = getIntent().getIntExtra("report_entrance_scence", 24);
        j22.a.f378782a = java.lang.System.currentTimeMillis();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.a()) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13364x933d260b.class);
            intent.putExtra("emoji_tab", this.f179868h);
            intent.putExtra("download_entrance_scene", this.f179871n);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2UI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2UI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13354x79b4d90b.this.finish();
                }
            });
        }
        mo43517x10010bd5();
        gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.o0(null));
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_NEW_ORIGINAL_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13353xcecbd7a3 c13353xcecbd7a3 = this.f179865e;
        if (c13353xcecbd7a3 != null && (c21407xddef161a = c13353xcecbd7a3.f179858n) != null) {
            c21407xddef161a.f278447e.setVisibility(booleanValue ? 0 : 4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(406L, 0L, 1L, false);
        g0Var.mo68477x336bdfd8(406L, 2L, java.lang.System.currentTimeMillis() - currentTimeMillis, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.EmojiStoreV2UI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Emoji);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "MMEmotionStoreViewController");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(this, 12, 10, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "requestid", this.f179873p);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.util.HashMap hashMap = this.f179864d;
        if (hashMap != null) {
            hashMap.clear();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13353xcecbd7a3 c13353xcecbd7a3 = this.f179865e;
        if (c13353xcecbd7a3 != null) {
            c13353xcecbd7a3.f179861q.mo48814x2efc64();
        }
        if (this.f179874q != null) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().r(this.f179874q);
            this.f179874q = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        android.os.Looper.myQueue().addIdleHandler(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.l0(this));
    }
}
