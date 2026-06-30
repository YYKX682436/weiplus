package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

/* loaded from: classes7.dex */
public final class d1 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f161490d;

    public d1(org.json.JSONObject jSONObject) {
        this.f161490d = jSONObject;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).getClass();
        org.json.JSONObject Ai = ((r01.l1) i95.n0.c(r01.l1.class)).Ai(0, "");
        Ai.put("extraInfoFromWebview", this.f161490d.optString("nativeExtraData", ""));
        return Ai.toString();
    }
}
