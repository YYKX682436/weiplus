package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes.dex */
public final class a4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f147562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f147563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(yz5.a aVar, java.lang.Long l17, java.lang.String str) {
        super(0);
        this.f147562d = aVar;
        this.f147563e = l17;
        this.f147564f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.a aVar = this.f147562d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        java.lang.Long l17 = this.f147563e;
        if (l17 != null) {
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.v2 v2Var = com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.C10572xfeac2836.f147537h;
            long longValue = l17.longValue();
            java.lang.String md52 = this.f147564f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("canAdd", 0);
            jSONObject.put(md52, jSONObject2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonJsApiDownloadModel", "callback: publish " + longValue + ", " + md52 + ' ' + jSONObject);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(longValue, "onSignleEmojiDownloadUpdate", jSONObject);
        }
        return jz5.f0.f384359a;
    }
}
