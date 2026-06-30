package com.tencent.mm.plugin.emoji.ui.fts;

/* loaded from: classes15.dex */
public class FTSEmojiDetailPageUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int P = 0;
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public int H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f97988J;
    public final com.tencent.mm.sdk.event.IListener K = new com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI.AnonymousClass6(com.tencent.mm.app.a0.f53288d);
    public final com.tencent.mm.feature.emoji.api.q5 L = new com.tencent.mm.plugin.emoji.ui.fts.k(this);
    public final p11.k M = new com.tencent.mm.plugin.emoji.ui.fts.m(this);
    public final db5.t4 N = new com.tencent.mm.plugin.emoji.ui.fts.b(this);

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ProgressBar f97989d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.gif.MMAnimateView f97990e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f97991f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f97992g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f97993h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f97994i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f97995m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s6 f97996n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f97997o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f97998p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.storage.emotion.EmojiInfo f97999q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.storage.emotion.EmojiInfo f98000r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f98001s;

    /* renamed from: t, reason: collision with root package name */
    public int f98002t;

    /* renamed from: u, reason: collision with root package name */
    public int f98003u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f98004v;

    /* renamed from: w, reason: collision with root package name */
    public int f98005w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f98006x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f98007y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f98008z;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI$6, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass6 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EmojiSyncTaskEvent> {
        public AnonymousClass6(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 1273581380;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.EmojiSyncTaskEvent emojiSyncTaskEvent) {
            com.tencent.mm.autogen.events.EmojiSyncTaskEvent emojiSyncTaskEvent2 = emojiSyncTaskEvent;
            com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI = com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI.this;
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = fTSEmojiDetailPageUI.f97999q;
            if (emojiInfo == null || !emojiSyncTaskEvent2.f54103g.f7603b.equals(emojiInfo.getMd5())) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "emojiDownloadListener callback %s", fTSEmojiDetailPageUI.f97999q.getMd5());
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.emoji.ui.fts.i(this));
            return false;
        }
    }

    public final void T6(boolean z17) {
        if (z17) {
            setMMTitle(this.f97999q.getName());
        }
        int i17 = this.f98002t;
        if (i17 == 2) {
            n11.a.b().g(this.f98008z, this.f97994i);
            this.f97993h.setText(this.A);
            if (this.H == 1) {
                this.f98001s = this.f98000r.N0();
            } else {
                this.f98001s = this.f97999q.N0();
            }
        } else if (i17 == 3) {
            n11.a.b().g(this.F, this.f97994i);
            this.f97993h.setText(this.E);
            if (this.H == 1) {
                this.f98001s = this.f98000r.N0();
            } else {
                this.f98001s = this.f97999q.N0();
            }
        } else if (i17 == 4) {
            this.f97994i.setVisibility(8);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.C)) {
                this.f97993h.setText(com.tencent.mm.R.string.ida);
            } else {
                this.f97993h.setText(this.C);
            }
        }
        if (com.tencent.mm.vfs.w6.j(this.f98001s)) {
            this.f97989d.setVisibility(8);
            this.f97990e.setVisibility(0);
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(this.f97999q.getMd5());
            if (u17 == null || (u17.field_reserved4 & 1) != 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "file exist: no decrypt");
                if (u17 == null || this.H != 1) {
                    this.f97990e.setImageFilePath(this.f98001s);
                } else {
                    this.f97990e.u(((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).z(u17), "");
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "file exist: decrypt");
                this.f97990e.u(((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).z(u17), "");
            }
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.emotion.EmojiInfo u18 = com.tencent.mm.storage.n5.f().c().u1(this.f97999q.getMd5());
            if (u18 == null) {
                u18 = this.f97999q;
            }
            if (u18.field_catalog == 81) {
                this.f97991f.setEnabled(false);
                this.f97991f.setText(com.tencent.mm.R.string.f490006i8);
            } else {
                this.f97991f.setText(com.tencent.mm.R.string.byd);
                if (com.tencent.mm.vfs.w6.j(this.f98001s)) {
                    this.f97991f.setEnabled(true);
                } else {
                    this.f97991f.setEnabled(false);
                }
            }
            this.f97992g.setEnabled(true);
        } else if (z17) {
            if (this.f98002t == 4) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(getCacheDir(), kk.k.g(this.f97999q.field_encrypturl.getBytes()));
                if (r6Var.m()) {
                    this.f97999q.field_md5 = com.tencent.mm.vfs.w6.p(r6Var.u());
                    java.lang.String p17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(n22.m.g(), "", this.f97999q.field_md5);
                    if (!com.tencent.mm.vfs.w6.j(p17)) {
                        com.tencent.mm.vfs.w6.c(r6Var.o(), p17);
                    }
                    this.f98001s = p17;
                    T6(false);
                } else {
                    o11.f fVar = new o11.f();
                    fVar.f342078b = true;
                    fVar.f342082f = r6Var.o();
                    fVar.f342102z = new java.lang.Object[]{r6Var.o()};
                    ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Di().j(this.f97999q.field_encrypturl, null, fVar.a(), this.M);
                }
            } else {
                this.f97990e.setVisibility(8);
                this.f97989d.setVisibility(0);
                this.f97991f.setText(com.tencent.mm.R.string.byd);
                this.f97992g.setText(com.tencent.mm.R.string.i29);
                this.f97991f.setEnabled(false);
                this.f97992g.setEnabled(false);
                if (this.H == 1) {
                    ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Zi(this.f98000r);
                } else {
                    ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Zi(this.f97999q);
                }
            }
        }
        if (this.f97997o) {
            this.f97991f.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bc6;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f97991f = (android.widget.Button) findViewById(com.tencent.mm.R.id.d_n);
        this.f97992g = (android.widget.Button) findViewById(com.tencent.mm.R.id.ddu);
        this.f97990e = (com.tencent.mm.plugin.gif.MMAnimateView) findViewById(com.tencent.mm.R.id.dbj);
        this.f97989d = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.imb);
        this.f97993h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ddy);
        this.f97994i = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ddx);
        this.f97995m = findViewById(com.tencent.mm.R.id.atj);
        setBackBtn(new com.tencent.mm.plugin.emoji.ui.fts.d(this));
        this.f97991f.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.fts.e(this));
        this.f97992g.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.fts.f(this));
        this.f97995m.setOnClickListener(new com.tencent.mm.plugin.emoji.ui.fts.g(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.emoji.ui.fts.h(this));
        this.f98002t = getIntent().getIntExtra("extra_type", 0);
        this.f98003u = getIntent().getIntExtra("extra_scence", 0);
        this.H = getIntent().getIntExtra("extra_gen_sticker", 0);
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
        this.f97999q = emojiInfo;
        emojiInfo.field_designerID = getIntent().getStringExtra(dm.i4.COL_ID);
        this.f97999q.field_name = getIntent().getStringExtra("extra_emoji_name");
        this.f97999q.field_aeskey = getIntent().getStringExtra("extra_aeskey");
        this.f97999q.field_encrypturl = getIntent().getStringExtra("extra_encrypt_url");
        this.f97999q.field_thumbUrl = getIntent().getStringExtra("extra_thumb_url");
        this.f97999q.field_md5 = getIntent().getStringExtra("extra_md5");
        this.f97999q.field_groupId = getIntent().getStringExtra("extra_product_id");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f97999q.field_aeskey)) {
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = this.f97999q;
            emojiInfo2.field_cdnUrl = emojiInfo2.field_encrypturl;
        }
        this.f98007y = this.f97999q.field_groupId;
        this.A = getIntent().getStringExtra("extra_product_name");
        this.f98008z = getIntent().getStringExtra("productUrl");
        this.B = getIntent().getStringExtra("extra_article_url");
        this.C = getIntent().getStringExtra("extra_article_name");
        this.D = this.f97999q.field_designerID;
        this.E = getIntent().getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        this.F = getIntent().getStringExtra("headurl");
        this.G = getIntent().getStringExtra("biz_user_name");
        this.I = getIntent().getStringExtra("weapp_user_name");
        getIntent().getIntExtra("weapp_version", 0);
        this.f97988J = getIntent().getIntExtra("source_type", 0);
        this.f98004v = getIntent().getStringExtra("searchID");
        this.f98006x = getIntent().getStringExtra("docID");
        this.f98005w = getIntent().getIntExtra("search_type", 0);
        this.f97997o = getIntent().getBooleanExtra("disableAddSticker", false);
        this.f97998p = getIntent().getBooleanExtra("needSavePhotosAlbum", false);
        java.lang.String stringExtra = getIntent().getStringExtra("activityId");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f97999q.field_activityid = stringExtra;
        }
        this.K.alive();
        if (this.H == 1) {
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo3 = new com.tencent.mm.storage.emotion.EmojiInfo();
            this.f98000r = emojiInfo3;
            emojiInfo3.convertFrom(this.f97999q.convertTo(), false);
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo4 = this.f98000r;
            emojiInfo4.field_designerID = "";
            emojiInfo4.field_groupId = "";
        }
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).cj(this.L);
        tg0.v1 v1Var = (tg0.v1) i95.n0.c(tg0.v1.class);
        int i17 = this.f98003u;
        java.lang.String str = this.f98004v;
        java.lang.String str2 = this.f98006x;
        int i18 = this.f98005w;
        ((sg0.q3) v1Var).getClass();
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.d(13809, java.lang.Integer.valueOf(i17), str, str2, 0, java.lang.Integer.valueOf(i18));
        T6(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "localPath=%s", this.f98001s);
        tg0.v1 v1Var2 = (tg0.v1) i95.n0.c(tg0.v1.class);
        int i19 = this.f98003u;
        java.lang.String str3 = this.f98004v;
        java.lang.String str4 = this.f98006x;
        int i27 = this.f98005w;
        ((sg0.q3) v1Var2).getClass();
        fVar.d(13809, java.lang.Integer.valueOf(i19), str3, str4, 0, java.lang.Integer.valueOf(i27));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.K.dead();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).cj(null);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        T6(false);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
