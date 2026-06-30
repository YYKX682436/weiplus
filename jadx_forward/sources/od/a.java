package od;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public od.b f426029a;

    /* renamed from: b, reason: collision with root package name */
    public org.json.JSONObject f426030b;

    /* renamed from: toString */
    public java.lang.String m151054x9616526c() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", this.f426029a.name());
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f426030b);
        return new org.json.JSONObject(hashMap).toString();
    }
}
