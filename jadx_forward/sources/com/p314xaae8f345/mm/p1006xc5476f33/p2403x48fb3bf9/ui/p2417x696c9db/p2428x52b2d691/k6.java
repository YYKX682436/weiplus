package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes7.dex */
public final class k6 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f267846d;

    public k6(org.json.JSONObject jSONObject) {
        this.f267846d = jSONObject;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).getClass();
        org.json.JSONObject Ai = ((r01.l1) i95.n0.c(r01.l1.class)).Ai(0, "");
        Ai.put("extraInfoFromWebview", this.f267846d.optString("nativeExtraData", ""));
        return Ai.toString();
    }
}
