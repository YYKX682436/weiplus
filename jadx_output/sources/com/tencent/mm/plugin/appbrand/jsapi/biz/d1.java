package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes7.dex */
public final class d1 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f79957d;

    public d1(org.json.JSONObject jSONObject) {
        this.f79957d = jSONObject;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).getClass();
        org.json.JSONObject Ai = ((r01.l1) i95.n0.c(r01.l1.class)).Ai(0, "");
        Ai.put("extraInfoFromWebview", this.f79957d.optString("nativeExtraData", ""));
        return Ai.toString();
    }
}
