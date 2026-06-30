package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f208210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f208212f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Throwable th6) {
        super(0);
        this.f208210d = jSONObject;
        this.f208211e = str;
        this.f208212f = th6;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONObject jSONObject = this.f208210d;
        jSONObject.put("result", -2);
        jSONObject.put("cacheDbPath", this.f208211e);
        jSONObject.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, this.f208212f.getMessage());
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }
}
