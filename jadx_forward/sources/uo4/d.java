package uo4;

/* loaded from: classes10.dex */
public final class d extends t85.a {

    /* renamed from: a, reason: collision with root package name */
    public int f511214a;

    /* renamed from: b, reason: collision with root package name */
    public int f511215b;

    /* renamed from: c, reason: collision with root package name */
    public int f511216c;

    @Override // t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f511214a);
        sb6.append('K');
        jSONObject.put("pss", sb6.toString());
        jSONObject.put("thumbCount", this.f511215b);
        jSONObject.put("thumbMem", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0(this.f511216c));
        return jSONObject;
    }
}
