package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f208143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208144e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(org.json.JSONObject jSONObject, java.lang.String str) {
        super(0);
        this.f208143d = jSONObject;
        this.f208144e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONObject jSONObject = this.f208143d;
        jSONObject.put("result", -1);
        jSONObject.put("cacheDbPath", this.f208144e);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }
}
