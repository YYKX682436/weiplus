package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/x0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class x0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public final r45.vd0 f225355g = new r45.vd0();

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        jz5.f0 f0Var;
        if (jSONObject != null) {
            this.f225355g.f469669f = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            this.f225355g.f469667d = jSONObject.optString("setKey");
            this.f225355g.f469668e = jSONObject.optString("iconUrl");
            this.f225355g.f469670g = jSONObject.optString("desc");
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
            if (o6Var != null) {
                android.content.Context c17 = c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getContext(...)");
                r45.vd0 ipSet = this.f225355g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ipSet, "ipSet");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var).f147740d, "showEmojiIPPageShareBottomSheet");
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.w3(c17, 1001, 1000, ipSet));
            }
            this.f224976f.d(false);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("emoticonIPPageShare", "missing arguments. no json object provided");
            this.f224976f.a("missing arguments.");
        }
    }
}
