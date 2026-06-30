package r45;

/* loaded from: classes2.dex */
public class ox0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f464124d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464125e;

    /* renamed from: f, reason: collision with root package name */
    public long f464126f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ox0)) {
            return false;
        }
        r45.ox0 ox0Var = (r45.ox0) fVar;
        return n51.f.a(this.f76494x2de60e5e, ox0Var.f76494x2de60e5e) && n51.f.a(this.f464124d, ox0Var.f464124d) && n51.f.a(this.f464125e, ox0Var.f464125e) && n51.f.a(java.lang.Long.valueOf(this.f464126f), java.lang.Long.valueOf(ox0Var.f464126f));
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
                        case -1489595877:
                            if (next.equals("object_id")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 116079:
                            if (next.equals("url")) {
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
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONObject) {
                            this.f76494x2de60e5e = (r45.he) new r45.he().mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                        }
                    } else if (c17 == 1) {
                        java.lang.Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof org.json.JSONObject) {
                            this.f464124d = (r45.kv0) new r45.kv0().mo75930xb5cb93b2(((org.json.JSONObject) opt2).toString());
                        }
                    } else if (c17 == 2) {
                        this.f464125e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 3) {
                        this.f464126f = jSONObject.optLong(next);
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
            r45.kv0 kv0Var = this.f464124d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f464124d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f464125e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f464126f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f464124d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f464125e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.h(4, this.f464126f);
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
        r45.ox0 ox0Var = (r45.ox0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                ox0Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                ox0Var.f464125e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            ox0Var.f464126f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.kv0 kv0Var3 = new r45.kv0();
            if (bArr2 != null && bArr2.length > 0) {
                kv0Var3.mo11468x92b714fd(bArr2);
            }
            ox0Var.f464124d = kv0Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.f76494x2de60e5e;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseRequest", heVar, true);
            eVar.d(jSONObject, "finder_basereq", this.f464124d, true);
            eVar.d(jSONObject, "url", this.f464125e, true);
            eVar.d(jSONObject, "object_id", java.lang.Long.valueOf(this.f464126f), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
