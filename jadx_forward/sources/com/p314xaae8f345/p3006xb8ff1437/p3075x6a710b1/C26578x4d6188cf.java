package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPProperties */
/* loaded from: classes13.dex */
public class C26578x4d6188cf implements com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c {
    private static final java.lang.String TAG = "TPProperties";

    /* renamed from: properties */
    protected final java.util.Properties f55358xc8cd8d33;

    public C26578x4d6188cf() {
        this((java.util.Properties) null);
    }

    /* renamed from: getProperties */
    public java.util.Properties m104378xb70e4529() {
        return this.f55358xc8cd8d33;
    }

    public boolean has(java.lang.String str) {
        return (str == null || this.f55358xc8cd8d33.get(str) == null) ? false : true;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c
    /* renamed from: propertiesToMap */
    public void mo101572xa67d136e(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            throw new java.lang.IllegalArgumentException("map must not be null!");
        }
        for (java.util.Map.Entry entry : this.f55358xc8cd8d33.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value == null) {
                map.put(key.toString(), "");
            } else {
                map.put(key.toString(), value.toString());
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c
    public void put(java.lang.String str, java.lang.String str2) {
        if (str != null) {
            if (!android.text.TextUtils.isEmpty(str2)) {
                this.f55358xc8cd8d33.put(str, str2);
            } else {
                this.f55358xc8cd8d33.put(str, "");
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m104379x9616526c() {
        org.json.JSONObject jSONObject = new org.json.JSONObject(this.f55358xc8cd8d33);
        if (jSONObject.has(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306)) {
            try {
                java.lang.String string = jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                jSONObject.remove(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, new org.json.JSONObject(string));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
        return jSONObject.toString();
    }

    public C26578x4d6188cf(java.util.Properties properties) {
        this.f55358xc8cd8d33 = new java.util.Properties();
        if (properties != null) {
            for (java.util.Map.Entry entry : properties.entrySet()) {
                put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c
    public void put(java.lang.String str, int i17) {
        if (str != null) {
            this.f55358xc8cd8d33.put(str, java.lang.String.valueOf(i17));
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c
    public void put(java.lang.String str, long j17) {
        if (str != null) {
            this.f55358xc8cd8d33.put(str, java.lang.String.valueOf(j17));
        }
    }

    public C26578x4d6188cf(java.util.Map<java.lang.String, java.lang.String> map) {
        this.f55358xc8cd8d33 = new java.util.Properties();
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c
    public void put(java.lang.String str, float f17) {
        if (str != null) {
            this.f55358xc8cd8d33.put(str, java.lang.String.valueOf(f17));
        }
    }

    public void put(java.lang.String str, java.util.Properties properties) {
        if (str != null) {
            this.f55358xc8cd8d33.put(str, properties);
        }
    }

    public void put(java.lang.String str, org.json.JSONObject jSONObject) {
        if (str != null) {
            this.f55358xc8cd8d33.put(str, jSONObject);
        }
    }

    public C26578x4d6188cf(java.lang.String str, java.lang.String str2) {
        this(new java.util.Properties(str, str2) { // from class: com.tencent.thumbplayer.utils.TPProperties.1

            /* renamed from: val$key */
            final /* synthetic */ java.lang.String f55359xda94a5c;

            /* renamed from: val$value */
            final /* synthetic */ java.lang.String f55360x4919322e;

            {
                this.f55359xda94a5c = str;
                this.f55360x4919322e = str2;
                put(str, str2);
            }
        });
    }

    public C26578x4d6188cf(java.lang.Object... objArr) {
        this.f55358xc8cd8d33 = new java.util.Properties();
        int length = objArr.length;
        if (length % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Supplied arguments must be even");
        }
        for (int i17 = 0; i17 < length; i17 += 2) {
            put(java.lang.String.valueOf(objArr[i17]), java.lang.String.valueOf(objArr[i17 + 1]));
        }
    }
}
