package r45;

/* loaded from: classes4.dex */
public class qi4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465553d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f465554e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f465555f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465556g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465557h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qi4)) {
            return false;
        }
        r45.qi4 qi4Var = (r45.qi4) fVar;
        return n51.f.a(this.f465553d, qi4Var.f465553d) && n51.f.a(this.f465554e, qi4Var.f465554e) && n51.f.a(this.f465555f, qi4Var.f465555f) && n51.f.a(this.f465556g, qi4Var.f465556g) && n51.f.a(this.f465557h, qi4Var.f465557h);
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
                    int i17 = 0;
                    switch (next.hashCode()) {
                        case -2060540888:
                            if (next.equals("app_package")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -587422972:
                            if (next.equals("market_schema")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 93997959:
                            if (next.equals("brand")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 285271214:
                            if (next.equals("market_name")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 540504899:
                            if (next.equals("market_package")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f465553d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                            while (i17 < jSONArray.length()) {
                                this.f465554e.add((java.lang.String) jSONArray.get(i17));
                                i17++;
                            }
                        }
                    } else if (c17 == 2) {
                        java.lang.Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof org.json.JSONArray) {
                            org.json.JSONArray jSONArray2 = (org.json.JSONArray) opt2;
                            while (i17 < jSONArray2.length()) {
                                this.f465555f.add((java.lang.String) jSONArray2.get(i17));
                                i17++;
                            }
                        }
                    } else if (c17 == 3) {
                        this.f465556g = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 4) {
                        this.f465557h = (java.lang.String) jSONObject.opt(next);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465555f;
        java.util.LinkedList linkedList2 = this.f465554e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465553d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList2);
            fVar.g(3, 1, linkedList);
            java.lang.String str2 = this.f465556g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f465557h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f465553d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.g(2, 1, linkedList2) + b36.f.g(3, 1, linkedList);
            java.lang.String str5 = this.f465556g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f465557h;
            return str6 != null ? j17 + b36.f.j(5, str6) : j17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.qi4 qi4Var = (r45.qi4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qi4Var.f465553d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            qi4Var.f465554e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            qi4Var.f465555f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 4) {
            qi4Var.f465556g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        qi4Var.f465557h = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f465553d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "brand", str, false);
            eVar.d(jSONObject, "market_schema", this.f465554e, false);
            eVar.d(jSONObject, "market_package", this.f465555f, false);
            eVar.d(jSONObject, "app_package", this.f465556g, false);
            eVar.d(jSONObject, "market_name", this.f465557h, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
