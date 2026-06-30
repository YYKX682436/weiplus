package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes12.dex */
public class EmojiStoreV2SingleRecommendView extends com.tencent.mm.pluginsdk.ui.ChatFooterPanel.RecommendView implements com.tencent.mm.plugin.emoji.model.i0, android.view.View.OnClickListener {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f98303t = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f98304d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f98305e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f98306f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f98307g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f98308h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f98309i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f98310m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f98311n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.storage.emotion.EmojiGroupInfo f98312o;

    /* renamed from: p, reason: collision with root package name */
    public z12.l f98313p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f98314q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f98315r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f98316s;

    public EmojiStoreV2SingleRecommendView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f98314q = true;
        this.f98315r = new com.tencent.mm.plugin.emoji.ui.v2.e0(this);
        this.f98316s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EmotionStateChangeEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView.2
            {
                this.__eventId = 449099204;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.EmotionStateChangeEvent emotionStateChangeEvent) {
                com.tencent.mm.autogen.events.EmotionStateChangeEvent emotionStateChangeEvent2 = emotionStateChangeEvent;
                if (!(emotionStateChangeEvent2 instanceof com.tencent.mm.autogen.events.EmotionStateChangeEvent)) {
                    return false;
                }
                java.lang.String str = emotionStateChangeEvent2.f54107g.f7982d;
                int i17 = com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView.f98303t;
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView emojiStoreV2SingleRecommendView = com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView.this;
                emojiStoreV2SingleRecommendView.getClass();
                am.t4 t4Var = emotionStateChangeEvent2.f54107g;
                if (com.tencent.mm.sdk.platformtools.t8.K0(t4Var.f7979a) || !t4Var.f7979a.equalsIgnoreCase(emojiStoreV2SingleRecommendView.f98311n)) {
                    return false;
                }
                java.lang.String str2 = t4Var.f7979a;
                int i18 = t4Var.f7980b;
                int i19 = t4Var.f7981c;
                com.tencent.mm.sdk.platformtools.n3 n3Var = emojiStoreV2SingleRecommendView.f98315r;
                if (i18 == 6) {
                    android.os.Message obtain = android.os.Message.obtain();
                    obtain.getData().putString("product_id", str2);
                    obtain.getData().putInt("progress", i19);
                    obtain.what = 131075;
                    if (n3Var == null) {
                        return false;
                    }
                    n3Var.sendMessage(obtain);
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product status:%d", java.lang.Integer.valueOf(i18));
                android.os.Message obtain2 = android.os.Message.obtain();
                obtain2.getData().putString("product_id", str2);
                obtain2.getData().putInt("status", i18);
                obtain2.what = 131076;
                if (n3Var == null) {
                    return false;
                }
                n3Var.sendMessage(obtain2);
                return false;
            }
        };
        a();
    }

    private void setTitleName(com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo) {
        android.widget.Button button = this.f98309i;
        if (button != null) {
            int i17 = emojiGroupInfo.field_buttonType;
            if (i17 == 1) {
                button.setVisibility(0);
                this.f98309i.setText(com.tencent.mm.R.string.byn);
            } else if (i17 != 2) {
                button.setVisibility(8);
            } else {
                button.setVisibility(0);
                this.f98309i.setText(com.tencent.mm.R.string.f492534gv4);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(emojiGroupInfo.field_packName)) {
            this.f98307g.setText(emojiGroupInfo.field_packName);
        }
        if (this.f98308h != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(emojiGroupInfo.field_recommandWord)) {
                this.f98308h.setVisibility(8);
            } else {
                this.f98308h.setVisibility(0);
                this.f98308h.setText(emojiGroupInfo.field_recommandWord);
            }
        }
    }

    @Override // com.tencent.mm.plugin.emoji.model.i0
    public void I0(boolean z17) {
    }

    public final void a() {
        if (this.f98314q) {
            this.f98304d = (android.view.ViewGroup) com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.a87, this);
        } else {
            this.f98304d = (android.view.ViewGroup) com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.a88, this);
        }
        this.f98305e = (android.widget.ImageView) this.f98304d.findViewById(com.tencent.mm.R.id.dai);
        this.f98306f = (android.widget.ImageView) this.f98304d.findViewById(com.tencent.mm.R.id.dbh);
        this.f98307g = (android.widget.TextView) this.f98304d.findViewById(com.tencent.mm.R.id.deq);
        this.f98308h = (android.widget.TextView) this.f98304d.findViewById(com.tencent.mm.R.id.deu);
        this.f98309i = (android.widget.Button) this.f98304d.findViewById(com.tencent.mm.R.id.db6);
        this.f98310m = (android.widget.ProgressBar) this.f98304d.findViewById(com.tencent.mm.R.id.db7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f98316s.alive();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleRecommendView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == this.f98305e) {
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().b().L0(this.f98311n);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12068, 2, this.f98311n, java.lang.Integer.valueOf(this.f98312o.field_recommandType));
        } else {
            android.view.ViewGroup viewGroup = this.f98304d;
            d22.u uVar = d22.u.f225876a;
            if (view == viewGroup) {
                r45.qj0 a17 = new j12.i(this.f98312o.t0()).a(true);
                java.lang.String str = a17.f384032d;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                d22.d0 d0Var = new d22.d0(str != null ? str : "", a17, null);
                d0Var.f364198g = 108;
                d0Var.f364155a = 8;
                uVar.a(getContext(), d0Var);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12068, 4, this.f98311n, java.lang.Integer.valueOf(this.f98312o.field_recommandType));
            } else if (view == this.f98309i) {
                com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = this.f98312o;
                int i17 = emojiGroupInfo.field_buttonType;
                if (i17 == 1) {
                    this.f98313p = new z12.l(this.f98311n);
                    gm0.j1.n().f273288b.g(this.f98313p);
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var.d(12068, 3, this.f98311n, java.lang.Integer.valueOf(this.f98312o.field_recommandType));
                    g0Var.d(12066, 0, 8, "", this.f98311n);
                } else if (i17 == 2) {
                    r45.qj0 a18 = new j12.i(emojiGroupInfo.t0()).a(true);
                    java.lang.String str2 = a18.f384032d;
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    d22.d0 d0Var2 = new d22.d0(str2 != null ? str2 : "", a18, null);
                    d0Var2.f364198g = 108;
                    d0Var2.f364155a = 8;
                    uVar.a(getContext(), d0Var2);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12068, 4, this.f98311n, java.lang.Integer.valueOf(this.f98312o.field_recommandType));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "unknown buttonType do nothing.");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2SingleRecommendView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f98316s.dead();
    }

    @Override // com.tencent.mm.plugin.emoji.model.i0
    public void s(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        gm0.j1.n().f273288b.g(new z12.l(str, str2, str3, null, str5));
    }

    @Override // com.tencent.mm.pluginsdk.ui.ChatFooterPanel.RecommendView
    public void setProductID(java.lang.String str) {
        this.f98311n = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f98304d.setVisibility(8);
            return;
        }
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        this.f98312o = com.tencent.mm.storage.n5.f().b().f1(this.f98311n, false);
        this.f98305e.setOnClickListener(this);
        this.f98309i.setOnClickListener(this);
        this.f98304d.setOnClickListener(this);
        setTitleName(this.f98312o);
        this.f98310m.setVisibility(8);
        n11.a b17 = n11.a.b();
        java.lang.String str2 = this.f98312o.field_BigIconUrl;
        b17.h(str2, this.f98306f, y12.f.c(this.f98311n, str2, true, new java.lang.Object[0]));
    }

    public EmojiStoreV2SingleRecommendView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f98314q = true;
        this.f98315r = new com.tencent.mm.plugin.emoji.ui.v2.e0(this);
        this.f98316s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EmotionStateChangeEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView.2
            {
                this.__eventId = 449099204;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.EmotionStateChangeEvent emotionStateChangeEvent) {
                com.tencent.mm.autogen.events.EmotionStateChangeEvent emotionStateChangeEvent2 = emotionStateChangeEvent;
                if (!(emotionStateChangeEvent2 instanceof com.tencent.mm.autogen.events.EmotionStateChangeEvent)) {
                    return false;
                }
                java.lang.String str = emotionStateChangeEvent2.f54107g.f7982d;
                int i172 = com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView.f98303t;
                com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView emojiStoreV2SingleRecommendView = com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleRecommendView.this;
                emojiStoreV2SingleRecommendView.getClass();
                am.t4 t4Var = emotionStateChangeEvent2.f54107g;
                if (com.tencent.mm.sdk.platformtools.t8.K0(t4Var.f7979a) || !t4Var.f7979a.equalsIgnoreCase(emojiStoreV2SingleRecommendView.f98311n)) {
                    return false;
                }
                java.lang.String str2 = t4Var.f7979a;
                int i18 = t4Var.f7980b;
                int i19 = t4Var.f7981c;
                com.tencent.mm.sdk.platformtools.n3 n3Var = emojiStoreV2SingleRecommendView.f98315r;
                if (i18 == 6) {
                    android.os.Message obtain = android.os.Message.obtain();
                    obtain.getData().putString("product_id", str2);
                    obtain.getData().putInt("progress", i19);
                    obtain.what = 131075;
                    if (n3Var == null) {
                        return false;
                    }
                    n3Var.sendMessage(obtain);
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product status:%d", java.lang.Integer.valueOf(i18));
                android.os.Message obtain2 = android.os.Message.obtain();
                obtain2.getData().putString("product_id", str2);
                obtain2.getData().putInt("status", i18);
                obtain2.what = 131076;
                if (n3Var == null) {
                    return false;
                }
                n3Var.sendMessage(obtain2);
                return false;
            }
        };
        a();
    }
}
