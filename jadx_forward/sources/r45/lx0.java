package r45;

/* loaded from: classes2.dex */
public class lx0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f461451d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461452e;

    /* renamed from: f, reason: collision with root package name */
    public long f461453f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lx0)) {
            return false;
        }
        r45.lx0 lx0Var = (r45.lx0) fVar;
        return n51.f.a(this.f76492x92037252, lx0Var.f76492x92037252) && n51.f.a(java.lang.Long.valueOf(this.f461451d), java.lang.Long.valueOf(lx0Var.f461451d)) && n51.f.a(this.f461452e, lx0Var.f461452e) && n51.f.a(java.lang.Long.valueOf(this.f461453f), java.lang.Long.valueOf(lx0Var.f461453f));
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
                        case -1845267886:
                            if (next.equals("BaseResponse")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1490206402:
                            if (next.equals("qrcode_url")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -1438342585:
                            if (next.equals("invitation_expire_time")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 851453825:
                            if (next.equals("invitation_id")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONObject) {
                            this.f76492x92037252 = (r45.ie) new r45.ie().mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                        }
                    } else if (c17 == 1) {
                        this.f461451d = jSONObject.optLong(next);
                    } else if (c17 == 2) {
                        this.f461452e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 3) {
                        this.f461453f = jSONObject.optLong(next);
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
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.h(2, this.f461451d);
            java.lang.String str = this.f461452e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f461453f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f461451d);
            java.lang.String str2 = this.f461452e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.h(4, this.f461453f);
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
        r45.lx0 lx0Var = (r45.lx0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                lx0Var.f461451d = aVar2.i(intValue);
                return 0;
            }
            if (intValue == 3) {
                lx0Var.f461452e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            lx0Var.f461453f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.mo11468x92b714fd(bArr);
            }
            lx0Var.f76492x92037252 = ieVar3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.f76492x92037252;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseResponse", ieVar, true);
            eVar.d(jSONObject, "invitation_id", java.lang.Long.valueOf(this.f461451d), true);
            eVar.d(jSONObject, "qrcode_url", this.f461452e, true);
            eVar.d(jSONObject, "invitation_expire_time", java.lang.Long.valueOf(this.f461453f), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
