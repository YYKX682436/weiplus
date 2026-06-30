package cl0;

/* loaded from: classes13.dex */
public class b implements cl0.a {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONArray f124378a;

    public b() {
        this.f124378a = new org.json.JSONArray();
    }

    @Override // cl0.a
    /* renamed from: a */
    public cl0.a getJSONArray(int i17) {
        try {
            org.json.JSONArray jSONArray = this.f124378a.getJSONArray(i17);
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
            this.f124378a.put(i17, d17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public cl0.a c(int i17, int i18) {
        try {
            this.f124378a.put(i17, i18);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public cl0.a d(int i17, long j17) {
        try {
            this.f124378a.put(i17, j17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public cl0.a e(double d17) {
        try {
            this.f124378a.put(d17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public cl0.a f(int i17) {
        this.f124378a.put(i17);
        return this;
    }

    @Override // cl0.a
    public cl0.a g(long j17) {
        this.f124378a.put(j17);
        return this;
    }

    @Override // cl0.a
    public java.lang.Object get(int i17) {
        try {
            java.lang.Object obj = this.f124378a.get(i17);
            return obj instanceof org.json.JSONObject ? new cl0.d((org.json.JSONObject) obj) : obj instanceof org.json.JSONArray ? new cl0.b((org.json.JSONArray) obj) : obj;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    /* renamed from: getBoolean */
    public boolean mo15050x41a8a7f2(int i17) {
        try {
            return this.f124378a.getBoolean(i17);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    /* renamed from: getDouble */
    public double mo15051x160e9ec7(int i17) {
        try {
            return this.f124378a.getDouble(i17);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    /* renamed from: getInt */
    public int mo15052xb58848b9(int i17) {
        try {
            return this.f124378a.getInt(i17);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    /* renamed from: getLong */
    public long mo15053xfb822ef2(int i17) {
        try {
            return this.f124378a.getLong(i17);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    /* renamed from: getString */
    public java.lang.String mo15054x2fec8307(int i17) {
        try {
            return this.f124378a.getString(i17);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public cl0.a h(boolean z17) {
        this.f124378a.put(z17);
        return this;
    }

    @Override // cl0.a
    public cl0.a i(int i17, boolean z17) {
        try {
            this.f124378a.put(i17, z17);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    /* renamed from: isNull */
    public boolean mo15055xb9a6a1d1(int i17) {
        return this.f124378a.isNull(i17);
    }

    @Override // cl0.a
    public cl0.a j(int i17) {
        org.json.JSONArray optJSONArray = this.f124378a.optJSONArray(i17);
        if (optJSONArray == null) {
            return null;
        }
        return new cl0.b(optJSONArray);
    }

    @Override // cl0.a
    /* renamed from: k */
    public cl0.c optJSONObject(int i17) {
        org.json.JSONObject optJSONObject = this.f124378a.optJSONObject(i17);
        if (optJSONObject == null) {
            return null;
        }
        return new cl0.d(optJSONObject);
    }

    @Override // cl0.a
    public cl0.c l(int i17) {
        try {
            org.json.JSONObject jSONObject = this.f124378a.getJSONObject(i17);
            if (jSONObject == null) {
                return null;
            }
            return new cl0.d(jSONObject);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    /* renamed from: length */
    public int mo15056xbe0e3ae6() {
        return this.f124378a.length();
    }

    @Override // cl0.a
    public cl0.a m(int i17, java.lang.Object obj) {
        try {
            this.f124378a.put(i17, obj);
            return this;
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    @Override // cl0.a
    public java.lang.Object opt(int i17) {
        java.lang.Object opt = this.f124378a.opt(i17);
        return opt instanceof org.json.JSONObject ? new cl0.d((org.json.JSONObject) opt) : opt instanceof org.json.JSONArray ? new cl0.b((org.json.JSONArray) opt) : opt;
    }

    @Override // cl0.a
    /* renamed from: optBoolean */
    public boolean mo15057x42e4f5f5(int i17) {
        return this.f124378a.optBoolean(i17);
    }

    @Override // cl0.a
    /* renamed from: optDouble */
    public double mo15059x2edf0464(int i17) {
        return this.f124378a.optDouble(i17);
    }

    @Override // cl0.a
    /* renamed from: optInt */
    public int mo15061xc3ca103c(int i17) {
        return this.f124378a.optInt(i17);
    }

    @Override // cl0.a
    /* renamed from: optLong */
    public long mo15063xb57957cf(int i17) {
        return this.f124378a.optLong(i17);
    }

    @Override // cl0.a
    /* renamed from: optString */
    public java.lang.String mo15065x48bce8a4(int i17) {
        return this.f124378a.optString(i17);
    }

    @Override // cl0.a
    public cl0.a put(java.lang.Object obj) {
        this.f124378a.put(obj);
        return this;
    }

    @Override // cl0.a
    /* renamed from: remove */
    public java.lang.Object mo15067xc84af884(int i17) {
        java.lang.Object remove = this.f124378a.remove(i17);
        return remove instanceof org.json.JSONObject ? new cl0.d((org.json.JSONObject) remove) : remove instanceof org.json.JSONArray ? new cl0.b((org.json.JSONArray) remove) : remove;
    }

    @Override // cl0.a
    /* renamed from: toString */
    public java.lang.String mo15068x9616526c() {
        return this.f124378a.toString();
    }

    @Override // cl0.a
    /* renamed from: optBoolean */
    public boolean mo15058x42e4f5f5(int i17, boolean z17) {
        return this.f124378a.optBoolean(i17, z17);
    }

    @Override // cl0.a
    /* renamed from: optDouble */
    public double mo15060x2edf0464(int i17, double d17) {
        return this.f124378a.optDouble(i17, d17);
    }

    @Override // cl0.a
    /* renamed from: optInt */
    public int mo15062xc3ca103c(int i17, int i18) {
        return this.f124378a.optInt(i17, i18);
    }

    @Override // cl0.a
    /* renamed from: optLong */
    public long mo15064xb57957cf(int i17, long j17) {
        return this.f124378a.optLong(i17, j17);
    }

    @Override // cl0.a
    /* renamed from: optString */
    public java.lang.String mo15066x48bce8a4(int i17, java.lang.String str) {
        return this.f124378a.optString(i17, str);
    }

    @Override // cl0.a
    /* renamed from: toString */
    public java.lang.String mo15069x9616526c(int i17) {
        try {
            return this.f124378a.toString(i17);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    public b(java.util.Collection collection) {
        this.f124378a = new org.json.JSONArray(collection);
    }

    public b(java.lang.String str) {
        try {
            this.f124378a = new org.json.JSONArray(str);
        } catch (org.json.JSONException e17) {
            throw new cl0.f(e17);
        }
    }

    public b(org.json.JSONArray jSONArray) {
        iz5.a.d(null, jSONArray);
        this.f124378a = jSONArray;
    }
}
