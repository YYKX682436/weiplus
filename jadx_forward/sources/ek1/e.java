package ek1;

/* loaded from: classes.dex */
public final class e implements l81.p0 {
    public e(int i17, int[] iArr) {
    }

    @Override // l81.p0
    public java.lang.String a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("showOrderEntrance", 1);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject2);
            return jSONObject2;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.WeAppNativeExtraDataWeUse", th6, "toJsonString", new java.lang.Object[0]);
            return "{}";
        }
    }

    /* renamed from: equals */
    public boolean m127786xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek1.e)) {
            return false;
        }
        ((ek1.e) obj).getClass();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, null);
    }

    /* renamed from: hashCode */
    public int m127787x8cdac1b() {
        return (java.lang.Integer.hashCode(1) * 31) + 0;
    }

    /* renamed from: toString */
    public java.lang.String m127788x9616526c() {
        return a();
    }
}
