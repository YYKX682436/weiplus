package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278;

/* renamed from: com.google.android.gms.common.images.WebImage */
/* loaded from: classes13.dex */
public final class C1895xd7ce4687 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1895xd7ce4687> f5921x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zah();
    final int zaa;
    private final android.net.Uri zab;
    private final int zac;
    private final int zad;

    public C1895xd7ce4687(int i17, android.net.Uri uri, int i18, int i19) {
        this.zaa = i17;
        this.zab = uri;
        this.zac = i18;
        this.zad = i19;
    }

    /* renamed from: equals */
    public boolean m18062xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1895xd7ce4687)) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1895xd7ce4687 c1895xd7ce4687 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1895xd7ce4687) obj;
            if (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.zab, c1895xd7ce4687.zab) && this.zac == c1895xd7ce4687.zac && this.zad == c1895xd7ce4687.zad) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getHeight */
    public int m18063x1c4fb41d() {
        return this.zad;
    }

    /* renamed from: getUrl */
    public android.net.Uri m18064xb5887639() {
        return this.zab;
    }

    /* renamed from: getWidth */
    public int m18065x755bd410() {
        return this.zac;
    }

    /* renamed from: hashCode */
    public int m18066x8cdac1b() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(this.zab, java.lang.Integer.valueOf(this.zac), java.lang.Integer.valueOf(this.zad));
    }

    /* renamed from: toJson */
    public org.json.JSONObject m18067xcc31ba03() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("url", this.zab.toString());
            jSONObject.put("width", this.zac);
            jSONObject.put("height", this.zad);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: toString */
    public java.lang.String m18068x9616526c() {
        return java.lang.String.format(java.util.Locale.US, "Image %dx%d %s", java.lang.Integer.valueOf(this.zac), java.lang.Integer.valueOf(this.zad), this.zab.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18 = this.zaa;
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, i18);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 2, m18064xb5887639(), i17, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 3, m18065x755bd410());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 4, m18063x1c4fb41d());
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    public C1895xd7ce4687(android.net.Uri uri) {
        this(uri, 0, 0);
    }

    public C1895xd7ce4687(android.net.Uri uri, int i17, int i18) {
        this(1, uri, i17, i18);
        if (uri == null) {
            throw new java.lang.IllegalArgumentException("url cannot be null");
        }
        if (i17 < 0 || i18 < 0) {
            throw new java.lang.IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1895xd7ce4687(org.json.JSONObject r5) {
        /*
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L12
            java.lang.String r1 = r5.getString(r1)     // Catch: org.json.JSONException -> L12
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: org.json.JSONException -> L12
        L12:
            java.lang.String r1 = "width"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "height"
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1895xd7ce4687.<init>(org.json.JSONObject):void");
    }
}
