package kc2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final kc2.k f387842a;

    /* renamed from: b, reason: collision with root package name */
    public final int f387843b;

    public a(kc2.k id6, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        this.f387842a = id6;
        this.f387843b = i17;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(dm.i4.f66865x76d1ec5a, this.f387842a.f387978d);
        jSONObject.put("time_stamp", this.f387843b);
        return jSONObject;
    }

    /* renamed from: equals */
    public boolean m142358xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc2.a)) {
            return false;
        }
        kc2.a aVar = (kc2.a) obj;
        return this.f387842a == aVar.f387842a && this.f387843b == aVar.f387843b;
    }

    /* renamed from: hashCode */
    public int m142359x8cdac1b() {
        return (this.f387842a.hashCode() * 31) + java.lang.Integer.hashCode(this.f387843b);
    }

    /* renamed from: toString */
    public java.lang.String m142360x9616526c() {
        return "ActionSeqInfo(id=" + this.f387842a + ", timeStamp=" + this.f387843b + ')';
    }
}
