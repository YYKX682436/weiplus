package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1374x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tBC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreExchangeTask;", "Landroidx/lifecycle/v;", "Lcom/tencent/mm/modelbase/u0;", "", "productId", "seriesId", "productName", "iconUrl", "panelUrl", "Li22/e;", "callback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Li22/e;)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreExchangeTask */
/* loaded from: classes15.dex */
public final class C13375x3780b243 implements p012xc85e97e9.p093xedfae76a.v, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f180037d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f180038e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f180039f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f180040g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f180041h;

    /* renamed from: i, reason: collision with root package name */
    public final i22.e f180042i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f180043m;

    /* renamed from: n, reason: collision with root package name */
    public z12.l f180044n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1374x633fb29.C13376x6e6fe993 f180045o;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreExchangeTask$mEmotionStateChangeListener$1] */
    public C13375x3780b243(java.lang.String productId, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, i22.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        this.f180037d = productId;
        this.f180038e = str;
        this.f180039f = str2;
        this.f180040g = str3;
        this.f180041h = str4;
        this.f180042i = eVar;
        this.f180043m = "MicroMsg.EmojiStoreExchangeTask";
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f180045o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4>(a0Var) { // from class: com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreExchangeTask$mEmotionStateChangeListener$1
            {
                this.f39173x3fe91575 = 449099204;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 c5327x7bab71d4) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 event = c5327x7bab71d4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.t4 t4Var = event.f135640g;
                java.lang.String str5 = t4Var.f89512a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1374x633fb29.C13375x3780b243 c13375x3780b243 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1374x633fb29.C13375x3780b243.this;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, c13375x3780b243.f180037d)) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13375x3780b243.f180043m, "callback: productId:" + t4Var.f89512a + " status:" + t4Var.f89513b + " progress:" + t4Var.f89514c);
                int i17 = t4Var.f89513b;
                i22.e eVar2 = c13375x3780b243.f180042i;
                if (i17 != 6) {
                    if (eVar2 == null) {
                        return false;
                    }
                    g22.t0 t0Var = (g22.t0) eVar2;
                    pm0.v.X(new g22.s0(t0Var.f349401a, i17, t0Var.f349402b));
                    return false;
                }
                if (eVar2 == null) {
                    return false;
                }
                g22.t0 t0Var2 = (g22.t0) eVar2;
                pm0.v.X(new g22.r0(t0Var2.f349401a, t0Var2.f349402b, t4Var.f89514c));
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof z12.l) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, this.f180044n);
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
            mo48814x2efc64();
            gm0.j1.n().f354821b.q(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60877x93282336, this);
        }
    }

    public /* synthetic */ C13375x3780b243(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, i22.e eVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, str3, str4, str5, (i17 & 32) != 0 ? null : eVar);
    }
}
