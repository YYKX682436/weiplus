package cl0;

/* loaded from: classes7.dex */
public class d implements cl0.c {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f42846a;

    public d() {
        this.f42846a = new org.json.JSONObject();
    }

    @Override // cl0.c
    /* renamed from: a */
    public cl0.c getJSONObject(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = this.f42846a.getJSONObject(str);
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
        org.json.JSONObject optJSONObject = this.f42846a.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        return new cl0.d(optJSONObject);
    }

    @Override // cl0.c
    public cl0.c c(java.lang.String str, boolean z17) {
        try {
            this.f42846a.put(str, z17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    public cl0.c d(java.lang.String str, double d17) {
        try {
            this.f42846a.put(str, d17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    public cl0.c e(java.lang.String str, java.lang.Object obj) {
        try {
            boolean z17 = obj instanceof cl0.d;
            org.json.JSONObject jSONObject = this.f42846a;
            if (z17) {
                jSONObject.putOpt(str, ((cl0.d) obj).f42846a);
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
        org.json.JSONArray optJSONArray = this.f42846a.optJSONArray(str);
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
            java.lang.Object obj = this.f42846a.get(str);
            return obj instanceof org.json.JSONObject ? new cl0.d((org.json.JSONObject) obj) : obj instanceof org.json.JSONArray ? new cl0.b((org.json.JSONArray) obj) : obj;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    public boolean getBoolean(java.lang.String str) {
        try {
            return this.f42846a.getBoolean(str);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    public double getDouble(java.lang.String str) {
        try {
            return this.f42846a.getDouble(str);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    public int getInt(java.lang.String str) {
        try {
            return this.f42846a.getInt(str);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    public long getLong(java.lang.String str) {
        try {
            return this.f42846a.getLong(str);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    public java.lang.String getString(java.lang.String str) {
        try {
            return this.f42846a.getString(str);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    /* renamed from: h */
    public cl0.c put(java.lang.String str, java.lang.Object obj) {
        try {
            boolean z17 = obj instanceof cl0.d;
            org.json.JSONObject jSONObject = this.f42846a;
            if (z17) {
                jSONObject.put(str, ((cl0.d) obj).f42846a);
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
        return this.f42846a.has(str);
    }

    @Override // cl0.c
    public cl0.a i(java.lang.String str) {
        try {
            org.json.JSONArray jSONArray = this.f42846a.getJSONArray(str);
            if (jSONArray == null) {
                return null;
            }
            return new cl0.b(jSONArray);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    public boolean isNull(java.lang.String str) {
        return this.f42846a.isNull(str);
    }

    @Override // cl0.c
    public java.util.Iterator keys() {
        return this.f42846a.keys();
    }

    @Override // cl0.c
    public int length() {
        return this.f42846a.length();
    }

    @Override // cl0.c
    public java.lang.Object opt(java.lang.String str) {
        try {
            java.lang.Object obj = this.f42846a.get(str);
            return obj instanceof org.json.JSONObject ? new cl0.d((org.json.JSONObject) obj) : obj instanceof org.json.JSONArray ? new cl0.b((org.json.JSONArray) obj) : obj;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    @Override // cl0.c
    public boolean optBoolean(java.lang.String str, boolean z17) {
        return this.f42846a.optBoolean(str, z17);
    }

    @Override // cl0.c
    public double optDouble(java.lang.String str, double d17) {
        return this.f42846a.optDouble(str, d17);
    }

    @Override // cl0.c
    public int optInt(java.lang.String str, int i17) {
        return this.f42846a.optInt(str, i17);
    }

    @Override // cl0.c
    public long optLong(java.lang.String str, long j17) {
        return this.f42846a.optLong(str, j17);
    }

    @Override // cl0.c
    public java.lang.String optString(java.lang.String str) {
        return this.f42846a.optString(str);
    }

    @Override // cl0.c
    public cl0.c put(java.lang.String str, int i17) {
        try {
            this.f42846a.put(str, i17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.c
    public java.lang.Object remove(java.lang.String str) {
        return this.f42846a.remove(str);
    }

    public java.lang.String toString() {
        return this.f42846a.toString();
    }

    @Override // cl0.c
    public java.lang.String optString(java.lang.String str, java.lang.String str2) {
        return this.f42846a.optString(str, str2);
    }

    public d(java.util.Map map) {
        this.f42846a = new org.json.JSONObject(map);
    }

    @Override // cl0.c
    public cl0.c put(java.lang.String str, long j17) {
        try {
            this.f42846a.put(str, j17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    public d(java.lang.String str) {
        try {
            this.f42846a = new org.json.JSONObject(str);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    public d(org.json.JSONObject jSONObject) {
        iz5.a.d(null, jSONObject);
        this.f42846a = jSONObject;
    }
}
