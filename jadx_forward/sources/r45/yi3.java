package r45;

/* loaded from: classes4.dex */
public class yi3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472651d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472652e;

    /* renamed from: f, reason: collision with root package name */
    public int f472653f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472654g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f472655h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f472656i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f472657m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472658n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yi3)) {
            return false;
        }
        r45.yi3 yi3Var = (r45.yi3) fVar;
        return n51.f.a(this.f76494x2de60e5e, yi3Var.f76494x2de60e5e) && n51.f.a(this.f472651d, yi3Var.f472651d) && n51.f.a(this.f472652e, yi3Var.f472652e) && n51.f.a(java.lang.Integer.valueOf(this.f472653f), java.lang.Integer.valueOf(yi3Var.f472653f)) && n51.f.a(this.f472654g, yi3Var.f472654g) && n51.f.a(this.f472655h, yi3Var.f472655h) && n51.f.a(this.f472656i, yi3Var.f472656i) && n51.f.a(this.f472657m, yi3Var.f472657m) && n51.f.a(this.f472658n, yi3Var.f472658n);
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
                        case -1966036000:
                            if (next.equals("channel_token_list")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -1613589672:
                            if (next.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68)) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -1313747785:
                            if (next.equals("mobile_type")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1146830912:
                            if (next.equals("business")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -1116517017:
                            if (next.equals("gateway_ticket")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 104192092:
                            if (next.equals("msgid")) {
                                c17 = 4;
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
                                c17 = 6;
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
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f76494x2de60e5e = (r45.he) new r45.he().mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                                break;
                            }
                        case 1:
                            this.f472651d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f472652e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt2, 0));
                                break;
                            }
                        case 3:
                            this.f472653f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 4:
                            this.f472654g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray = (org.json.JSONArray) opt3;
                                while (i17 < jSONArray.length()) {
                                    java.lang.Object obj = jSONArray.get(i17);
                                    if (obj instanceof org.json.JSONObject) {
                                        java.util.LinkedList linkedList = this.f472655h;
                                        r45.py pyVar = new r45.py();
                                        pyVar.mo75930xb5cb93b2(((org.json.JSONObject) obj).toString());
                                        linkedList.add(pyVar);
                                    }
                                    i17++;
                                }
                                break;
                            }
                        case 6:
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof org.json.JSONArray)) {
                                break;
                            } else {
                                org.json.JSONArray jSONArray2 = (org.json.JSONArray) opt4;
                                while (i17 < jSONArray2.length()) {
                                    this.f472656i.add((java.lang.String) jSONArray2.get(i17));
                                    i17++;
                                }
                                break;
                            }
                        case 7:
                            this.f472657m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\b':
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (!(opt5 instanceof java.lang.String)) {
                                break;
                            } else {
                                this.f472658n = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt5, 0));
                                break;
                            }
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
            java.lang.String str = this.f472651d;
            if (str != null) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f472652e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f472653f);
            java.lang.String str2 = this.f472654g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.g(6, 8, this.f472655h);
            fVar.g(7, 1, this.f472656i);
            java.lang.String str3 = this.f472657m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f472658n;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f472651d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f472652e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            int e17 = i18 + b36.f.e(4, this.f472653f);
            java.lang.String str5 = this.f472654g;
            if (str5 != null) {
                e17 += b36.f.j(5, str5);
            }
            int g17 = e17 + b36.f.g(6, 8, this.f472655h) + b36.f.g(7, 1, this.f472656i);
            java.lang.String str6 = this.f472657m;
            if (str6 != null) {
                g17 += b36.f.j(8, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f472658n;
            return gVar4 != null ? g17 + b36.f.b(9, gVar4) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f472655h.clear();
            this.f472656i.clear();
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
        r45.yi3 yi3Var = (r45.yi3) objArr[1];
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
                    yi3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                yi3Var.f472651d = aVar2.k(intValue);
                return 0;
            case 3:
                yi3Var.f472652e = aVar2.d(intValue);
                return 0;
            case 4:
                yi3Var.f472653f = aVar2.g(intValue);
                return 0;
            case 5:
                yi3Var.f472654g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.py pyVar = new r45.py();
                    if (bArr3 != null && bArr3.length > 0) {
                        pyVar.mo11468x92b714fd(bArr3);
                    }
                    yi3Var.f472655h.add(pyVar);
                }
                return 0;
            case 7:
                yi3Var.f472656i.add(aVar2.k(intValue));
                return 0;
            case 8:
                yi3Var.f472657m = aVar2.k(intValue);
                return 0;
            case 9:
                yi3Var.f472658n = aVar2.d(intValue);
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
            eVar.d(jSONObject, "business", this.f472651d, false);
            eVar.d(jSONObject, "req_spam_info", this.f472652e, false);
            eVar.d(jSONObject, "mobile_type", java.lang.Integer.valueOf(this.f472653f), false);
            eVar.d(jSONObject, "msgid", this.f472654g, false);
            eVar.d(jSONObject, "channel_token_list", this.f472655h, false);
            eVar.d(jSONObject, "client_ips", this.f472656i, false);
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, this.f472657m, false);
            eVar.d(jSONObject, "gateway_ticket", this.f472658n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
