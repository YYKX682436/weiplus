package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/k0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class k0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225161g = "";

    /* renamed from: h, reason: collision with root package name */
    public final r45.v75 f225162h = new r45.v75();

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        jz5.f0 f0Var;
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("oldRedirectUrl");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            this.f225161g = optString;
            byte[] decode = android.util.Base64.decode(jSONObject.optString("personalDesigner"), 2);
            if (decode != null) {
                try {
                    this.f225162h.mo11468x92b714fd(decode);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
            if (o6Var != null) {
                android.content.Context c17 = c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getContext(...)");
                r45.v75 personalDesigner = this.f225162h;
                java.lang.String str2 = personalDesigner.f469501h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getDesignerDescription(...)");
                java.lang.String oldRedirectUrl = this.f225161g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(personalDesigner, "personalDesigner");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldRedirectUrl, "oldRedirectUrl");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var).f147740d, "showEmojiDesignerProfilePageShareBottomSheet");
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.s3(c17, 1001, 1000, personalDesigner, str2, oldRedirectUrl));
            }
            this.f224976f.d(false);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("emoticonDesignerProfileShare", "missing arguments. no json object provided");
            this.f224976f.a("missing arguments.");
        }
    }
}
