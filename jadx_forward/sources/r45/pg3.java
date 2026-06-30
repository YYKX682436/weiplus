package r45;

/* loaded from: classes4.dex */
public class pg3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464545d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f464546e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f464547f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464548g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464549h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464550i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pg3)) {
            return false;
        }
        r45.pg3 pg3Var = (r45.pg3) fVar;
        return n51.f.a(this.f76494x2de60e5e, pg3Var.f76494x2de60e5e) && n51.f.a(this.f464545d, pg3Var.f464545d) && n51.f.a(this.f464546e, pg3Var.f464546e) && n51.f.a(this.f464547f, pg3Var.f464547f) && n51.f.a(this.f464548g, pg3Var.f464548g) && n51.f.a(this.f464549h, pg3Var.f464549h) && n51.f.a(this.f464550i, pg3Var.f464550i);
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
                        case -1613589672:
                            if (next.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68)) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -1146830912:
                            if (next.equals("business")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 36848094:
                            if (next.equals("time_zone")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 229628405:
                            if (next.equals("real_country")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 770051678:
                            if (next.equals("BaseRequest")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1102765496:
                            if (next.equals("client_ips")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 2005750147:
                            if (next.equals("req_spam_info")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (opt instanceof org.json.JSONObject) {
                                this.f76494x2de60e5e = (r45.he) new r45.he().mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            this.f464545d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (opt2 instanceof java.lang.String) {
                                this.f464546e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt2, 0));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (opt3 instanceof org.json.JSONArray) {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt3;
                                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                                    this.f464547f.add((java.lang.String) jSONArray.get(i17));
                                }
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            this.f464548g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f464549h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f464550i = (java.lang.String) jSONObject.opt(next);
                            break;
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
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f464545d;
            if (str != null) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f464546e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.g(4, 1, this.f464547f);
            java.lang.String str2 = this.f464548g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f464549h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f464550i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f464545d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f464546e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            int g17 = i18 + b36.f.g(4, 1, this.f464547f);
            java.lang.String str6 = this.f464548g;
            if (str6 != null) {
                g17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f464549h;
            if (str7 != null) {
                g17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f464550i;
            return str8 != null ? g17 + b36.f.j(7, str8) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f464547f.clear();
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
        r45.pg3 pg3Var = (r45.pg3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    pg3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                pg3Var.f464545d = aVar2.k(intValue);
                return 0;
            case 3:
                pg3Var.f464546e = aVar2.d(intValue);
                return 0;
            case 4:
                pg3Var.f464547f.add(aVar2.k(intValue));
                return 0;
            case 5:
                pg3Var.f464548g = aVar2.k(intValue);
                return 0;
            case 6:
                pg3Var.f464549h = aVar2.k(intValue);
                return 0;
            case 7:
                pg3Var.f464550i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.f76494x2de60e5e;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "business", this.f464545d, false);
            eVar.d(jSONObject, "req_spam_info", this.f464546e, false);
            eVar.d(jSONObject, "client_ips", this.f464547f, false);
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, this.f464548g, false);
            eVar.d(jSONObject, "time_zone", this.f464549h, false);
            eVar.d(jSONObject, "real_country", this.f464550i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
