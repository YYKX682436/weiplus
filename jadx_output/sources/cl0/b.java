package cl0;

/* loaded from: classes13.dex */
public class b implements cl0.a {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONArray f42845a;

    public b() {
        this.f42845a = new org.json.JSONArray();
    }

    @Override // cl0.a
    /* renamed from: a */
    public cl0.a getJSONArray(int i17) {
        try {
            org.json.JSONArray jSONArray = this.f42845a.getJSONArray(i17);
            if (jSONArray == null) {
                return null;
            }
            return new cl0.b(jSONArray);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public cl0.a b(int i17, double d17) {
        try {
            this.f42845a.put(i17, d17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public cl0.a c(int i17, int i18) {
        try {
            this.f42845a.put(i17, i18);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public cl0.a d(int i17, long j17) {
        try {
            this.f42845a.put(i17, j17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public cl0.a e(double d17) {
        try {
            this.f42845a.put(d17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public cl0.a f(int i17) {
        this.f42845a.put(i17);
        return this;
    }

    @Override // cl0.a
    public cl0.a g(long j17) {
        this.f42845a.put(j17);
        return this;
    }

    @Override // cl0.a
    public java.lang.Object get(int i17) {
        try {
            java.lang.Object obj = this.f42845a.get(i17);
            return obj instanceof org.json.JSONObject ? new cl0.d((org.json.JSONObject) obj) : obj instanceof org.json.JSONArray ? new cl0.b((org.json.JSONArray) obj) : obj;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public boolean getBoolean(int i17) {
        try {
            return this.f42845a.getBoolean(i17);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public double getDouble(int i17) {
        try {
            return this.f42845a.getDouble(i17);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public int getInt(int i17) {
        try {
            return this.f42845a.getInt(i17);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public long getLong(int i17) {
        try {
            return this.f42845a.getLong(i17);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public java.lang.String getString(int i17) {
        try {
            return this.f42845a.getString(i17);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public cl0.a h(boolean z17) {
        this.f42845a.put(z17);
        return this;
    }

    @Override // cl0.a
    public cl0.a i(int i17, boolean z17) {
        try {
            this.f42845a.put(i17, z17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public boolean isNull(int i17) {
        return this.f42845a.isNull(i17);
    }

    @Override // cl0.a
    public cl0.a j(int i17) {
        org.json.JSONArray optJSONArray = this.f42845a.optJSONArray(i17);
        if (optJSONArray == null) {
            return null;
        }
        return new cl0.b(optJSONArray);
    }

    @Override // cl0.a
    /* renamed from: k */
    public cl0.c optJSONObject(int i17) {
        org.json.JSONObject optJSONObject = this.f42845a.optJSONObject(i17);
        if (optJSONObject == null) {
            return null;
        }
        return new cl0.d(optJSONObject);
    }

    @Override // cl0.a
    public cl0.c l(int i17) {
        try {
            org.json.JSONObject jSONObject = this.f42845a.getJSONObject(i17);
            if (jSONObject == null) {
                return null;
            }
            return new cl0.d(jSONObject);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public int length() {
        return this.f42845a.length();
    }

    @Override // cl0.a
    public cl0.a m(int i17, java.lang.Object obj) {
        try {
            this.f42845a.put(i17, obj);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public java.lang.Object opt(int i17) {
        java.lang.Object opt = this.f42845a.opt(i17);
        return opt instanceof org.json.JSONObject ? new cl0.d((org.json.JSONObject) opt) : opt instanceof org.json.JSONArray ? new cl0.b((org.json.JSONArray) opt) : opt;
    }

    @Override // cl0.a
    public boolean optBoolean(int i17) {
        return this.f42845a.optBoolean(i17);
    }

    @Override // cl0.a
    public double optDouble(int i17) {
        return this.f42845a.optDouble(i17);
    }

    @Override // cl0.a
    public int optInt(int i17) {
        return this.f42845a.optInt(i17);
    }

    @Override // cl0.a
    public long optLong(int i17) {
        return this.f42845a.optLong(i17);
    }

    @Override // cl0.a
    public java.lang.String optString(int i17) {
        return this.f42845a.optString(i17);
    }

    @Override // cl0.a
    public cl0.a put(java.lang.Object obj) {
        this.f42845a.put(obj);
        return this;
    }

    @Override // cl0.a
    public java.lang.Object remove(int i17) {
        java.lang.Object remove = this.f42845a.remove(i17);
        return remove instanceof org.json.JSONObject ? new cl0.d((org.json.JSONObject) remove) : remove instanceof org.json.JSONArray ? new cl0.b((org.json.JSONArray) remove) : remove;
    }

    @Override // cl0.a
    public java.lang.String toString() {
        return this.f42845a.toString();
    }

    @Override // cl0.a
    public boolean optBoolean(int i17, boolean z17) {
        return this.f42845a.optBoolean(i17, z17);
    }

    @Override // cl0.a
    public double optDouble(int i17, double d17) {
        return this.f42845a.optDouble(i17, d17);
    }

    @Override // cl0.a
    public int optInt(int i17, int i18) {
        return this.f42845a.optInt(i17, i18);
    }

    @Override // cl0.a
    public long optLong(int i17, long j17) {
        return this.f42845a.optLong(i17, j17);
    }

    @Override // cl0.a
    public java.lang.String optString(int i17, java.lang.String str) {
        return this.f42845a.optString(i17, str);
    }

    @Override // cl0.a
    public java.lang.String toString(int i17) {
        try {
            return this.f42845a.toString(i17);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    public b(java.util.Collection collection) {
        this.f42845a = new org.json.JSONArray(collection);
    }

    public b(java.lang.String str) {
        try {
            this.f42845a = new org.json.JSONArray(str);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    public b(org.json.JSONArray jSONArray) {
        iz5.a.d(null, jSONArray);
        this.f42845a = jSONArray;
    }
}
