package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes15.dex */
public final class k0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k {

    /* renamed from: m, reason: collision with root package name */
    public int f164278m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f164279n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f164280o = Integer.MAX_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public int f164281p = Integer.MAX_VALUE;

    /* renamed from: q, reason: collision with root package name */
    public int f164282q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f164283r = -1;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k
    public void e(org.json.JSONObject jSONObject) {
        super.e(jSONObject);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k
    public void f(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("range");
        if (optJSONObject != null) {
            java.lang.String optString = optJSONObject.optString("start");
            java.lang.String optString2 = optJSONObject.optString("end");
            int[] a17 = tl1.c0.a(optString);
            if (a17 != null) {
                this.f164278m = a17[0];
                this.f164279n = a17[1];
            }
            int[] a18 = tl1.c0.a(optString2);
            if (a18 != null) {
                this.f164280o = a18[0];
                this.f164281p = a18[1];
            }
        }
        this.f164278m = java.lang.Math.max(this.f164278m, 0);
        this.f164279n = java.lang.Math.max(this.f164279n, 0);
        this.f164280o = java.lang.Math.min(this.f164280o, 23);
        this.f164281p = java.lang.Math.min(this.f164281p, 59);
        int[] a19 = tl1.c0.a(jSONObject.optString("current"));
        if (a19 != null) {
            this.f164282q = a19[0];
            this.f164283r = a19[1];
        }
        h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.i0(this));
    }
}
