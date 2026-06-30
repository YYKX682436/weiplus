package r45;

/* loaded from: classes4.dex */
public class fn4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455995d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455996e;

    /* renamed from: f, reason: collision with root package name */
    public int f455997f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455998g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455999h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fn4)) {
            return false;
        }
        r45.fn4 fn4Var = (r45.fn4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455995d), java.lang.Integer.valueOf(fn4Var.f455995d)) && n51.f.a(this.f455996e, fn4Var.f455996e) && n51.f.a(java.lang.Integer.valueOf(this.f455997f), java.lang.Integer.valueOf(fn4Var.f455997f)) && n51.f.a(this.f455998g, fn4Var.f455998g) && n51.f.a(this.f455999h, fn4Var.f455999h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String str) {
        char c17;
        if (str != null && !"".equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    switch (next.hashCode()) {
                        case -1068855134:
                            if (next.equals("mobile")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -239427946:
                            if (next.equals("protocal_url")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 738950403:
                            if (next.equals("channel")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1836797375:
                            if (next.equals("protocal_title")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1974666273:
                            if (next.equals("carrier_type")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f455995d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 1) {
                        this.f455996e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        this.f455997f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f455998g = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 4) {
                        this.f455999h = (java.lang.String) jSONObject.opt(next);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455995d);
            java.lang.String str = this.f455996e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f455997f);
            java.lang.String str2 = this.f455998g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f455999h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f455995d) + 0;
            java.lang.String str4 = this.f455996e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int e18 = e17 + b36.f.e(3, this.f455997f);
            java.lang.String str5 = this.f455998g;
            if (str5 != null) {
                e18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f455999h;
            return str6 != null ? e18 + b36.f.j(5, str6) : e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.fn4 fn4Var = (r45.fn4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fn4Var.f455995d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            fn4Var.f455996e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            fn4Var.f455997f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            fn4Var.f455998g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        fn4Var.f455999h = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f455995d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "channel", valueOf, false);
            eVar.d(jSONObject, "mobile", this.f455996e, false);
            eVar.d(jSONObject, "carrier_type", java.lang.Integer.valueOf(this.f455997f), false);
            eVar.d(jSONObject, "protocal_title", this.f455998g, false);
            eVar.d(jSONObject, "protocal_url", this.f455999h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
