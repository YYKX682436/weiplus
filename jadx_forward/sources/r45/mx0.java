package r45;

/* loaded from: classes2.dex */
public class mx0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f462408d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462409e;

    /* renamed from: f, reason: collision with root package name */
    public long f462410f;

    /* renamed from: g, reason: collision with root package name */
    public int f462411g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462412h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462413i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mx0)) {
            return false;
        }
        r45.mx0 mx0Var = (r45.mx0) fVar;
        return n51.f.a(this.f76494x2de60e5e, mx0Var.f76494x2de60e5e) && n51.f.a(this.f462408d, mx0Var.f462408d) && n51.f.a(this.f462409e, mx0Var.f462409e) && n51.f.a(java.lang.Long.valueOf(this.f462410f), java.lang.Long.valueOf(mx0Var.f462410f)) && n51.f.a(java.lang.Integer.valueOf(this.f462411g), java.lang.Integer.valueOf(mx0Var.f462411g)) && n51.f.a(this.f462412h, mx0Var.f462412h) && n51.f.a(this.f462413i, mx0Var.f462413i);
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
                        case -613969375:
                            if (next.equals("target_finder_username")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -216295364:
                            if (next.equals("my_finder_username")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 704023828:
                            if (next.equals("finder_basereq")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 770051678:
                            if (next.equals("BaseRequest")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 851453825:
                            if (next.equals("invitation_id")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1263068863:
                            if (next.equals("initiator_finder_username")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 1583758243:
                            if (next.equals("action_type")) {
                                c17 = 4;
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
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f462408d = (r45.kv0) new r45.kv0().mo75930xb5cb93b2(((org.json.JSONObject) opt2).toString());
                                break;
                            }
                        case 2:
                            this.f462409e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f462410f = jSONObject.optLong(next);
                            break;
                        case 4:
                            this.f462411g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 5:
                            this.f462412h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f462413i = (java.lang.String) jSONObject.opt(next);
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
            r45.kv0 kv0Var = this.f462408d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f462408d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f462409e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f462410f);
            fVar.e(5, this.f462411g);
            java.lang.String str2 = this.f462412h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f462413i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f462408d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f462409e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int h17 = i18 + b36.f.h(4, this.f462410f) + b36.f.e(5, this.f462411g);
            java.lang.String str5 = this.f462412h;
            if (str5 != null) {
                h17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f462413i;
            return str6 != null ? h17 + b36.f.j(7, str6) : h17;
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
        r45.mx0 mx0Var = (r45.mx0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    mx0Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr2);
                    }
                    mx0Var.f462408d = kv0Var3;
                }
                return 0;
            case 3:
                mx0Var.f462409e = aVar2.k(intValue);
                return 0;
            case 4:
                mx0Var.f462410f = aVar2.i(intValue);
                return 0;
            case 5:
                mx0Var.f462411g = aVar2.g(intValue);
                return 0;
            case 6:
                mx0Var.f462412h = aVar2.k(intValue);
                return 0;
            case 7:
                mx0Var.f462413i = aVar2.k(intValue);
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
            eVar.d(jSONObject, "BaseRequest", heVar, true);
            eVar.d(jSONObject, "finder_basereq", this.f462408d, true);
            eVar.d(jSONObject, "my_finder_username", this.f462409e, true);
            eVar.d(jSONObject, "invitation_id", java.lang.Long.valueOf(this.f462410f), true);
            eVar.d(jSONObject, "action_type", java.lang.Integer.valueOf(this.f462411g), true);
            eVar.d(jSONObject, "target_finder_username", this.f462412h, true);
            eVar.d(jSONObject, "initiator_finder_username", this.f462413i, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
