package r45;

/* loaded from: classes2.dex */
public class bz2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452700d;

    /* renamed from: e, reason: collision with root package name */
    public r45.f03 f452701e;

    /* renamed from: f, reason: collision with root package name */
    public int f452702f;

    /* renamed from: g, reason: collision with root package name */
    public long f452703g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452704h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bz2)) {
            return false;
        }
        r45.bz2 bz2Var = (r45.bz2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452700d), java.lang.Integer.valueOf(bz2Var.f452700d)) && n51.f.a(this.f452701e, bz2Var.f452701e) && n51.f.a(java.lang.Integer.valueOf(this.f452702f), java.lang.Integer.valueOf(bz2Var.f452702f)) && n51.f.a(java.lang.Long.valueOf(this.f452703g), java.lang.Long.valueOf(bz2Var.f452703g)) && n51.f.a(this.f452704h, bz2Var.f452704h);
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
                        case -1903650640:
                            if (next.equals("show_info")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -1310739582:
                            if (next.equals("tips_id")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -883261635:
                            if (next.equals("show_seconds")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 266611646:
                            if (next.equals("tab_tips_object_id")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 497087130:
                            if (next.equals("show_reddot")) {
                                c17 = 0;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f452700d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 1) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONObject) {
                            r45.f03 f03Var = new r45.f03();
                            f03Var.mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                            this.f452701e = f03Var;
                        }
                    } else if (c17 == 2) {
                        this.f452702f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f452703g = jSONObject.optLong(next);
                    } else if (c17 == 4) {
                        this.f452704h = (java.lang.String) jSONObject.opt(next);
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
            fVar.e(1, this.f452700d);
            r45.f03 f03Var = this.f452701e;
            if (f03Var != null) {
                fVar.i(2, f03Var.mo75928xcd1e8d8());
                this.f452701e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f452702f);
            fVar.h(4, this.f452703g);
            java.lang.String str = this.f452704h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452700d) + 0;
            r45.f03 f03Var2 = this.f452701e;
            if (f03Var2 != null) {
                e17 += b36.f.i(2, f03Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(3, this.f452702f) + b36.f.h(4, this.f452703g);
            java.lang.String str2 = this.f452704h;
            return str2 != null ? e18 + b36.f.j(5, str2) : e18;
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
        r45.bz2 bz2Var = (r45.bz2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bz2Var.f452700d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                bz2Var.f452702f = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                bz2Var.f452703g = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            bz2Var.f452704h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.f03 f03Var3 = new r45.f03();
            if (bArr != null && bArr.length > 0) {
                f03Var3.mo11468x92b714fd(bArr);
            }
            bz2Var.f452701e = f03Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f452700d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "show_reddot", valueOf, true);
            eVar.d(jSONObject, "show_info", this.f452701e, true);
            eVar.d(jSONObject, "show_seconds", java.lang.Integer.valueOf(this.f452702f), true);
            eVar.d(jSONObject, "tab_tips_object_id", java.lang.Long.valueOf(this.f452703g), true);
            eVar.d(jSONObject, "tips_id", this.f452704h, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
