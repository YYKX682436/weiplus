package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public final class e extends com.tencent.mm.plugin.appbrand.jsapi.picker.k {

    /* renamed from: m, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.jsapi.picker.d f82720m;

    /* renamed from: n, reason: collision with root package name */
    public volatile java.lang.Long f82721n = null;

    /* renamed from: o, reason: collision with root package name */
    public volatile java.lang.Long f82722o = null;

    /* renamed from: p, reason: collision with root package name */
    public volatile int f82723p = -1;

    /* renamed from: q, reason: collision with root package name */
    public volatile int f82724q = -1;

    /* renamed from: r, reason: collision with root package name */
    public volatile int f82725r = -1;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.k
    public void e(org.json.JSONObject jSONObject) {
        super.e(jSONObject);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.picker.k
    public void f(org.json.JSONObject jSONObject) {
        char c17;
        java.util.Date date;
        java.util.Date date2;
        java.lang.String optString = jSONObject.optString("fields");
        com.tencent.mm.plugin.appbrand.jsapi.picker.d dVar = com.tencent.mm.plugin.appbrand.jsapi.picker.d.f82714e;
        java.lang.String lowerCase = optString.substring(0, java.lang.Math.max(0, java.lang.Math.min(optString.length(), 5))).toLowerCase();
        lowerCase.getClass();
        int hashCode = lowerCase.hashCode();
        if (hashCode == 99228) {
            if (lowerCase.equals("day")) {
                c17 = 0;
            }
            c17 = 65535;
        } else if (hashCode != 3704893) {
            if (hashCode == 104080000 && lowerCase.equals("month")) {
                c17 = 2;
            }
            c17 = 65535;
        } else {
            if (lowerCase.equals("year")) {
                c17 = 1;
            }
            c17 = 65535;
        }
        com.tencent.mm.plugin.appbrand.jsapi.picker.d dVar2 = com.tencent.mm.plugin.appbrand.jsapi.picker.d.f82715f;
        if (c17 == 0) {
            dVar2 = com.tencent.mm.plugin.appbrand.jsapi.picker.d.f82716g;
        } else if (c17 == 1) {
            dVar2 = com.tencent.mm.plugin.appbrand.jsapi.picker.d.f82714e;
        }
        this.f82720m = dVar2;
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("range");
        java.util.Date date3 = null;
        if (optJSONObject != null) {
            java.lang.String optString2 = optJSONObject.optString("start", "");
            com.tencent.mm.plugin.appbrand.jsapi.picker.d dVar3 = this.f82720m;
            dVar3.getClass();
            try {
                date = dVar3.f82718d.parse(optString2);
            } catch (java.lang.Exception unused) {
                date = null;
            }
            java.lang.String optString3 = optJSONObject.optString("end", "");
            com.tencent.mm.plugin.appbrand.jsapi.picker.d dVar4 = this.f82720m;
            dVar4.getClass();
            try {
                date2 = dVar4.f82718d.parse(optString3);
            } catch (java.lang.Exception unused2) {
                date2 = null;
            }
            if (date != null) {
                this.f82721n = java.lang.Long.valueOf(date.getTime());
            }
            if (date2 != null) {
                this.f82722o = java.lang.Long.valueOf(date2.getTime());
            }
        }
        if (this.f82721n == null) {
            java.util.Calendar calendar = java.util.Calendar.getInstance(com.tencent.mm.sdk.platformtools.m2.f192848b);
            calendar.set(1900, 0, 1);
            this.f82721n = java.lang.Long.valueOf(calendar.getTimeInMillis());
        }
        if (this.f82722o == null) {
            java.util.Calendar calendar2 = java.util.Calendar.getInstance(com.tencent.mm.sdk.platformtools.m2.f192848b);
            calendar2.set(2100, 11, 31);
            this.f82722o = java.lang.Long.valueOf(calendar2.getTimeInMillis());
        }
        java.lang.String optString4 = jSONObject.optString("current", "");
        com.tencent.mm.plugin.appbrand.jsapi.picker.d dVar5 = this.f82720m;
        dVar5.getClass();
        try {
            date3 = dVar5.f82718d.parse(optString4);
        } catch (java.lang.Exception unused3) {
        }
        if (date3 == null) {
            date3 = new java.util.Date(java.lang.System.currentTimeMillis());
            java.util.Date date4 = new java.util.Date(this.f82722o.longValue());
            java.util.Date date5 = new java.util.Date(this.f82721n.longValue());
            if (date3.after(date4)) {
                date3 = date4;
            } else if (date3.before(date5)) {
                date3 = date5;
            }
        }
        this.f82723p = date3.getYear() + 1900;
        this.f82724q = date3.getMonth() + 1;
        this.f82725r = date3.getDate();
        h(new com.tencent.mm.plugin.appbrand.jsapi.picker.b(this));
    }
}
