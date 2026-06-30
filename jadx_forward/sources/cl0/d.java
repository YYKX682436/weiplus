package cl0;

/* loaded from: classes7.dex */
public class d implements cl0.c {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f124379a;

    public d() {
        this.f124379a = new org.json.JSONObject();
    }

    @Override // cl0.c
    /* renamed from: a */
    public cl0.c getJSONObject(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = this.f124379a.getJSONObject(str);
            if (jSONObject == null) {
                return null;
            }
            return new cl0.d(jSONObject);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    /* renamed from: b */
    public cl0.c optJSONObject(java.lang.String str) {
        org.json.JSONObject optJSONObject = this.f124379a.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        return new cl0.d(optJSONObject);
    }

    @Override // cl0.c
    public cl0.c c(java.lang.String str, boolean z17) {
        try {
            this.f124379a.put(str, z17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    public cl0.c d(java.lang.String str, double d17) {
        try {
            this.f124379a.put(str, d17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    public cl0.c e(java.lang.String str, java.lang.Object obj) {
        try {
            boolean z17 = obj instanceof cl0.d;
            org.json.JSONObject jSONObject = this.f124379a;
            if (z17) {
                jSONObject.putOpt(str, ((cl0.d) obj).f124379a);
            } else {
                jSONObject.putOpt(str, obj);
            }
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    /* renamed from: f */
    public cl0.a optJSONArray(java.lang.String str) {
        org.json.JSONArray optJSONArray = this.f124379a.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        return new cl0.b(optJSONArray);
    }

    @Override // cl0.c
    public java.lang.String g(java.lang.String str) {
        if (str != null) {
            return str;
        }
        throw new cl0.f("Names must be non-null");
    }

    @Override // cl0.c
    public java.lang.Object get(java.lang.String str) {
        try {
            java.lang.Object obj = this.f124379a.get(str);
            return obj instanceof org.json.JSONObject ? new cl0.d((org.json.JSONObject) obj) : obj instanceof org.json.JSONArray ? new cl0.b((org.json.JSONArray) obj) : obj;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    /* renamed from: getBoolean */
    public boolean mo15070x41a8a7f2(java.lang.String str) {
        try {
            return this.f124379a.getBoolean(str);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    /* renamed from: getDouble */
    public double mo15071x160e9ec7(java.lang.String str) {
        try {
            return this.f124379a.getDouble(str);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    /* renamed from: getInt */
    public int mo15072xb58848b9(java.lang.String str) {
        try {
            return this.f124379a.getInt(str);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    /* renamed from: getLong */
    public long mo15073xfb822ef2(java.lang.String str) {
        try {
            return this.f124379a.getLong(str);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    /* renamed from: getString */
    public java.lang.String mo15074x2fec8307(java.lang.String str) {
        try {
            return this.f124379a.getString(str);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    /* renamed from: h */
    public cl0.c put(java.lang.String str, java.lang.Object obj) {
        try {
            boolean z17 = obj instanceof cl0.d;
            org.json.JSONObject jSONObject = this.f124379a;
            if (z17) {
                jSONObject.put(str, ((cl0.d) obj).f124379a);
            } else {
                jSONObject.put(str, obj);
            }
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    public boolean has(java.lang.String str) {
        return this.f124379a.has(str);
    }

    @Override // cl0.c
    public cl0.a i(java.lang.String str) {
        try {
            org.json.JSONArray jSONArray = this.f124379a.getJSONArray(str);
            if (jSONArray == null) {
                return null;
            }
            return new cl0.b(jSONArray);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    /* renamed from: isNull */
    public boolean mo15075xb9a6a1d1(java.lang.String str) {
        return this.f124379a.isNull(str);
    }

    @Override // cl0.c
    /* renamed from: keys */
    public java.util.Iterator mo15076x322df4() {
        return this.f124379a.keys();
    }

    @Override // cl0.c
    /* renamed from: length */
    public int mo15077xbe0e3ae6() {
        return this.f124379a.length();
    }

    @Override // cl0.c
    public java.lang.Object opt(java.lang.String str) {
        try {
            java.lang.Object obj = this.f124379a.get(str);
            return obj instanceof org.json.JSONObject ? new cl0.d((org.json.JSONObject) obj) : obj instanceof org.json.JSONArray ? new cl0.b((org.json.JSONArray) obj) : obj;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    @Override // cl0.c
    /* renamed from: optBoolean */
    public boolean mo15078x42e4f5f5(java.lang.String str, boolean z17) {
        return this.f124379a.optBoolean(str, z17);
    }

    @Override // cl0.c
    /* renamed from: optDouble */
    public double mo15079x2edf0464(java.lang.String str, double d17) {
        return this.f124379a.optDouble(str, d17);
    }

    @Override // cl0.c
    /* renamed from: optInt */
    public int mo15080xc3ca103c(java.lang.String str, int i17) {
        return this.f124379a.optInt(str, i17);
    }

    @Override // cl0.c
    /* renamed from: optLong */
    public long mo15081xb57957cf(java.lang.String str, long j17) {
        return this.f124379a.optLong(str, j17);
    }

    @Override // cl0.c
    /* renamed from: optString */
    public java.lang.String mo15082x48bce8a4(java.lang.String str) {
        return this.f124379a.optString(str);
    }

    @Override // cl0.c
    public cl0.c put(java.lang.String str, int i17) {
        try {
            this.f124379a.put(str, i17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    /* renamed from: remove */
    public java.lang.Object mo15084xc84af884(java.lang.String str) {
        return this.f124379a.remove(str);
    }

    /* renamed from: toString */
    public java.lang.String m15085x9616526c() {
        return this.f124379a.toString();
    }

    @Override // cl0.c
    /* renamed from: optString */
    public java.lang.String mo15083x48bce8a4(java.lang.String str, java.lang.String str2) {
        return this.f124379a.optString(str, str2);
    }

    public d(java.util.Map map) {
        this.f124379a = new org.json.JSONObject(map);
    }

    @Override // cl0.c
    public cl0.c put(java.lang.String str, long j17) {
        try {
            this.f124379a.put(str, j17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    public d(java.lang.String str) {
        try {
            this.f124379a = new org.json.JSONObject(str);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    public d(org.json.JSONObject jSONObject) {
        iz5.a.d(null, jSONObject);
        this.f124379a = jSONObject;
    }
}
