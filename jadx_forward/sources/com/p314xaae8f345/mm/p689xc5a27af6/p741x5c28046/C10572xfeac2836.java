package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* renamed from: com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel */
/* loaded from: classes.dex */
public final class C10572xfeac2836 extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.v2 f147537h = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.v2(null);

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f147538i = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public long f147539d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f147540e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f147541f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f147542g;

    public C10572xfeac2836() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4>(a0Var) { // from class: com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel$emoticonStateListener$1
            {
                this.f39173x3fe91575 = 449099204;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 c5327x7bab71d4) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5327x7bab71d4 event = c5327x7bab71d4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.t4 t4Var = event.f135640g;
                java.lang.String str = t4Var.f89512a;
                int i17 = t4Var.f89514c;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                int i18 = t4Var.f89513b;
                if (i18 != 7 && i18 != 6) {
                    jSONObject2.put("status", 1);
                } else if (i17 == 100) {
                    jSONObject2.put("status", 3);
                } else {
                    jSONObject2.put("status", 2);
                    jSONObject2.put("progress", java.lang.Float.valueOf(i17 / 100.0f));
                }
                jSONObject.put(str, jSONObject2);
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10572xfeac2836 c10572xfeac2836 = com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10572xfeac2836.this;
                if (!c10572xfeac2836.f147540e.contains(str)) {
                    return false;
                }
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.v2 v2Var = com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10572xfeac2836.f147537h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonJsApiDownloadModel", "callback: publish " + c10572xfeac2836.f147539d + ", " + str + ' ' + jSONObject);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(c10572xfeac2836.f147539d, "onStoreEmoticonDownloadUpdate", jSONObject);
                return false;
            }
        };
        this.f147541f = abstractC20980x9b9ad01d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3> abstractC20980x9b9ad01d2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3>(a0Var) { // from class: com.tencent.mm.feature.emoji.EmoticonJsApiDownloadModel$liteAppDestroyListener$1
            {
                this.f39173x3fe91575 = 1907495603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 event = c5675xda3892c3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ri riVar = event.f136001g;
                if (riVar.f89350a != 3) {
                    return false;
                }
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10572xfeac2836 c10572xfeac2836 = com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10572xfeac2836.this;
                long j17 = c10572xfeac2836.f147539d;
                java.lang.Long l17 = riVar.f89353d;
                if (l17 == null || j17 != l17.longValue()) {
                    return false;
                }
                c10572xfeac2836.mo528x82b764cd();
                return false;
            }
        };
        this.f147542g = abstractC20980x9b9ad01d2;
        abstractC20980x9b9ad01d.mo48813x58998cd();
        abstractC20980x9b9ad01d2.mo48813x58998cd();
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        this.f147541f.mo48814x2efc64();
        this.f147542g.mo48814x2efc64();
        long j17 = this.f147539d;
        java.util.HashMap hashMap = f147538i;
        synchronized (hashMap) {
        }
    }
}
