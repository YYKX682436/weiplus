package com.tencent.mm.plugin.emoji.ui.v3.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tBC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreExchangeTask;", "Landroidx/lifecycle/v;", "Lcom/tencent/mm/modelbase/u0;", "", "productId", "seriesId", "productName", "iconUrl", "panelUrl", "Li22/e;", "callback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li22/e;)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class EmojiStoreExchangeTask implements androidx.lifecycle.v, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f98504d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f98505e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f98506f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f98507g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f98508h;

    /* renamed from: i, reason: collision with root package name */
    public final i22.e f98509i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f98510m;

    /* renamed from: n, reason: collision with root package name */
    public z12.l f98511n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreExchangeTask$mEmotionStateChangeListener$1 f98512o;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreExchangeTask$mEmotionStateChangeListener$1] */
    public EmojiStoreExchangeTask(java.lang.String productId, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, i22.e eVar) {
        kotlin.jvm.internal.o.g(productId, "productId");
        this.f98504d = productId;
        this.f98505e = str;
        this.f98506f = str2;
        this.f98507g = str3;
        this.f98508h = str4;
        this.f98509i = eVar;
        this.f98510m = "MicroMsg.EmojiStoreExchangeTask";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f98512o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EmotionStateChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreExchangeTask$mEmotionStateChangeListener$1
            {
                this.__eventId = 449099204;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.EmotionStateChangeEvent emotionStateChangeEvent) {
                com.tencent.mm.autogen.events.EmotionStateChangeEvent event = emotionStateChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.t4 t4Var = event.f54107g;
                java.lang.String str5 = t4Var.f7979a;
                com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreExchangeTask emojiStoreExchangeTask = com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreExchangeTask.this;
                if (!kotlin.jvm.internal.o.b(str5, emojiStoreExchangeTask.f98504d)) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i(emojiStoreExchangeTask.f98510m, "callback: productId:" + t4Var.f7979a + " status:" + t4Var.f7980b + " progress:" + t4Var.f7981c);
                int i17 = t4Var.f7980b;
                i22.e eVar2 = emojiStoreExchangeTask.f98509i;
                if (i17 != 6) {
                    if (eVar2 == null) {
                        return false;
                    }
                    g22.t0 t0Var = (g22.t0) eVar2;
                    pm0.v.X(new g22.s0(t0Var.f267868a, i17, t0Var.f267869b));
                    return false;
                }
                if (eVar2 == null) {
                    return false;
                }
                g22.t0 t0Var2 = (g22.t0) eVar2;
                pm0.v.X(new g22.r0(t0Var2.f267868a, t0Var2.f267869b, t4Var.f7981c));
                return false;
            }
        };
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof z12.l) {
            kotlin.jvm.internal.o.b(m1Var, this.f98511n);
        }
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        if (event == androidx.lifecycle.m.ON_DESTROY) {
            dead();
            gm0.j1.n().f273288b.q(com.tencent.wxmm.v2helper.EMethodSetNgStrength, this);
        }
    }

    public /* synthetic */ EmojiStoreExchangeTask(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, i22.e eVar, int i17, kotlin.jvm.internal.i iVar) {
        this(str, str2, str3, str4, str5, (i17 & 32) != 0 ? null : eVar);
    }
}
