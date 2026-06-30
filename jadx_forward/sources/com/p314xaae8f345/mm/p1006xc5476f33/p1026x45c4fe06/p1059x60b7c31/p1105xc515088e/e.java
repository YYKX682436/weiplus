package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes15.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k {

    /* renamed from: m, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.d f164253m;

    /* renamed from: n, reason: collision with root package name */
    public volatile java.lang.Long f164254n = null;

    /* renamed from: o, reason: collision with root package name */
    public volatile java.lang.Long f164255o = null;

    /* renamed from: p, reason: collision with root package name */
    public volatile int f164256p = -1;

    /* renamed from: q, reason: collision with root package name */
    public volatile int f164257q = -1;

    /* renamed from: r, reason: collision with root package name */
    public volatile int f164258r = -1;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k
    public void e(org.json.JSONObject jSONObject) {
        super.e(jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k
    public void f(org.json.JSONObject jSONObject) {
        char c17;
        java.util.Date date;
        java.util.Date date2;
        java.lang.String optString = jSONObject.optString("fields");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.d.f164247e;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.d dVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.d.f164248f;
        if (c17 == 0) {
            dVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.d.f164249g;
        } else if (c17 == 1) {
            dVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.d.f164247e;
        }
        this.f164253m = dVar2;
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("range");
        java.util.Date date3 = null;
        if (optJSONObject != null) {
            java.lang.String optString2 = optJSONObject.optString("start", "");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.d dVar3 = this.f164253m;
            dVar3.getClass();
            try {
                date = dVar3.f164251d.parse(optString2);
            } catch (java.lang.Exception unused) {
                date = null;
            }
            java.lang.String optString3 = optJSONObject.optString("end", "");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.d dVar4 = this.f164253m;
            dVar4.getClass();
            try {
                date2 = dVar4.f164251d.parse(optString3);
            } catch (java.lang.Exception unused2) {
                date2 = null;
            }
            if (date != null) {
                this.f164254n = java.lang.Long.valueOf(date.getTime());
            }
            if (date2 != null) {
                this.f164255o = java.lang.Long.valueOf(date2.getTime());
            }
        }
        if (this.f164254n == null) {
            java.util.Calendar calendar = java.util.Calendar.getInstance(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f274381b);
            calendar.set(1900, 0, 1);
            this.f164254n = java.lang.Long.valueOf(calendar.getTimeInMillis());
        }
        if (this.f164255o == null) {
            java.util.Calendar calendar2 = java.util.Calendar.getInstance(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f274381b);
            calendar2.set(2100, 11, 31);
            this.f164255o = java.lang.Long.valueOf(calendar2.getTimeInMillis());
        }
        java.lang.String optString4 = jSONObject.optString("current", "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.d dVar5 = this.f164253m;
        dVar5.getClass();
        try {
            date3 = dVar5.f164251d.parse(optString4);
        } catch (java.lang.Exception unused3) {
        }
        if (date3 == null) {
            date3 = new java.util.Date(java.lang.System.currentTimeMillis());
            java.util.Date date4 = new java.util.Date(this.f164255o.longValue());
            java.util.Date date5 = new java.util.Date(this.f164254n.longValue());
            if (date3.after(date4)) {
                date3 = date4;
            } else if (date3.before(date5)) {
                date3 = date5;
            }
        }
        this.f164256p = date3.getYear() + 1900;
        this.f164257q = date3.getMonth() + 1;
        this.f164258r = date3.getDate();
        h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.b(this));
    }
}
