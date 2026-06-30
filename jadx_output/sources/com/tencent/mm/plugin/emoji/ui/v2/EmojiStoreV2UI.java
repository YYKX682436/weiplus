package com.tencent.mm.plugin.emoji.ui.v2;

@gm0.a2
/* loaded from: classes11.dex */
public class EmojiStoreV2UI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f98330r = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView f98332e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2ViewPager f98333f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.v2.m0 f98334g;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.ui.v2.n0 f98341q;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f98331d = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public int f98335h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f98336i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f98337m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f98338n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f98339o = -1;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f98340p = "";

    public com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment T6(int i17) {
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment emojiStoreV2BaseFragment = null;
        if (i17 < 0) {
            return null;
        }
        java.util.HashMap hashMap = this.f98331d;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return (com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment) hashMap.get(java.lang.Integer.valueOf(i17));
        }
        if (i17 == 0) {
            emojiStoreV2BaseFragment = (com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment) androidx.fragment.app.Fragment.instantiate(this, com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2MainFragment.class.getName(), null);
            emojiStoreV2BaseFragment.H = this.f98340p;
        } else if (i17 != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreV2UI", "create fragment failed.");
        } else {
            emojiStoreV2BaseFragment = (com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment) androidx.fragment.app.Fragment.instantiate(this, com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2PersonFragment.class.getName(), null);
        }
        if (emojiStoreV2BaseFragment != null) {
            emojiStoreV2BaseFragment.setParent(this);
        }
        hashMap.put(java.lang.Integer.valueOf(i17), emojiStoreV2BaseFragment);
        return emojiStoreV2BaseFragment;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a89;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (!com.tencent.mm.plugin.emoji.model.EmojiLogic.u().booleanValue()) {
            addIconOptionMenu(0, com.tencent.mm.R.string.f490549y8, com.tencent.mm.R.raw.actionbar_icon_dark_search, new com.tencent.mm.plugin.emoji.ui.v2.i0(this));
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_emoticon_new_personal_center_andr, false);
            addIconOptionMenu(1, com.tencent.mm.R.string.f490471w0, fj6 ? com.tencent.mm.R.raw.person_regular : com.tencent.mm.R.raw.actionbar_setting_icon, new com.tencent.mm.plugin.emoji.ui.v2.j0(this, fj6));
        }
        this.f98341q = new com.tencent.mm.plugin.emoji.ui.v2.n0(this, 1, "stickernavright");
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().k(this.f98341q);
        this.f98332e = (com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView) findViewById(com.tencent.mm.R.id.dek);
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2ViewPager emojiStoreV2ViewPager = (com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2ViewPager) findViewById(com.tencent.mm.R.id.dej);
        this.f98333f = emojiStoreV2ViewPager;
        emojiStoreV2ViewPager.setOffscreenPageLimit(0);
        this.f98334g = new com.tencent.mm.plugin.emoji.ui.v2.m0(this, this, this.f98333f, this.f98336i);
        if (!this.f98336i) {
            this.f98332e.setVisibility(8);
        } else {
            this.f98332e.setVisibility(0);
            this.f98332e.f98328q.alive();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.emoji.ui.v2.m0 m0Var = this.f98334g;
        if (m0Var != null) {
            if (m0Var.f98375f.T6(this.f98335h) != null) {
                com.tencent.mm.plugin.emoji.ui.v2.m0 m0Var2 = this.f98334g;
                m0Var2.f98375f.T6(this.f98335h).onActivityResult(i17, i18, intent);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.ui.MMTabView mMTabView;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        super.onCreate(bundle);
        this.f98340p = java.lang.String.valueOf(currentTimeMillis);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf((com.tencent.mm.plugin.emoji.model.EmojiLogic.t().booleanValue() || com.tencent.mm.plugin.emoji.model.EmojiLogic.u().booleanValue()) ? false : true);
        java.lang.Boolean u17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.u();
        if (valueOf.booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2UI", "exit in teen mode");
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(this);
            finish();
            return;
        }
        this.f98338n = getIntent().getIntExtra("download_entrance_scene", -1);
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ShowPersonalEmotion");
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2UI", "get dynamic config value:%s", d17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17) || com.tencent.mm.sdk.platformtools.t8.D1(d17, 0) != 1 || u17.booleanValue()) {
            this.f98336i = false;
        } else {
            this.f98336i = true;
        }
        if (this.f98336i) {
            this.f98335h = getIntent().getIntExtra("emoji_tab", 0);
        }
        this.f98339o = getIntent().getIntExtra("report_entrance_scence", 24);
        j22.a.f297249a = java.lang.System.currentTimeMillis();
        if (com.tencent.mm.plugin.emoji.model.EmojiLogic.a()) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI.class);
            intent.putExtra("emoji_tab", this.f98335h);
            intent.putExtra("download_entrance_scene", this.f98338n);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2UI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2UI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI.this.finish();
                }
            });
        }
        initView();
        gm0.j1.e().j(new com.tencent.mm.plugin.emoji.ui.v2.o0(null));
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_NEW_ORIGINAL_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue();
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView emojiStoreV2TabView = this.f98332e;
        if (emojiStoreV2TabView != null && (mMTabView = emojiStoreV2TabView.f98325n) != null) {
            mMTabView.f196914e.setVisibility(booleanValue ? 0 : 4);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(406L, 0L, 1L, false);
        g0Var.idkeyStat(406L, 2L, java.lang.System.currentTimeMillis() - currentTimeMillis, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.EmojiStoreV2UI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Emoji);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "MMEmotionStoreViewController");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(this, 12, 10, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "requestid", this.f98340p);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.util.HashMap hashMap = this.f98331d;
        if (hashMap != null) {
            hashMap.clear();
        }
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView emojiStoreV2TabView = this.f98332e;
        if (emojiStoreV2TabView != null) {
            emojiStoreV2TabView.f98328q.dead();
        }
        if (this.f98341q != null) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().r(this.f98341q);
            this.f98341q = null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        android.os.Looper.myQueue().addIdleHandler(new com.tencent.mm.plugin.emoji.ui.v2.l0(this));
    }
}
