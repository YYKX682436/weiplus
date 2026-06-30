package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/m0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class m0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public qk.l7 f225207g;

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiEmoticonDoMoreAction", "doMoreAction: " + jSONObject);
        jz5.f0 f0Var = null;
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("md5");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (!(optString.length() > 0)) {
                optString = null;
            }
            if (optString == null) {
                this.f224976f.a("Missing or empty md5 parameter");
                return;
            }
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            java.lang.Object wj6 = g0Var != null ? ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).wj(this.f224975e.f380557a, "EmotionMsgBrowseLogicData") : null;
            qk.l7 l7Var = wj6 instanceof qk.l7 ? (qk.l7) wj6 : null;
            if (l7Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject.optString("emojiInfoBuf"));
                if (!(!r26.n0.N(r9))) {
                    this.f224976f.a("emojiInfoBuf is isBlank");
                    return;
                }
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
                android.content.Context c17 = c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getContext(...)");
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var).Ni(c17, null, jSONObject);
                return;
            }
            this.f225207g = l7Var;
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = l7Var.f445757b;
            if (interfaceC4987x84e327cb == null) {
                this.f224976f.a("invalid emojiInfo");
                return;
            }
            if (!optString.equals(interfaceC4987x84e327cb.H0())) {
                this.f224976f.a("no emojiMsgWrap for md5: ".concat(optString));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppJsApiEmoticonDoMoreAction", "no emojiMsgWrap for md5: %s", optString);
                return;
            }
            if (this.f225207g != null) {
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var2 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
                android.content.Context c18 = c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getContext(...)");
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var2).Ni(c18, this.f225207g, null);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            this.f224976f.a("data is null");
        }
    }
}
