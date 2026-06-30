package r45;

/* loaded from: classes4.dex */
public class zi3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.d66 f473624d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f473625e;

    /* renamed from: f, reason: collision with root package name */
    public r45.fn4 f473626f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zi3)) {
            return false;
        }
        r45.zi3 zi3Var = (r45.zi3) fVar;
        return n51.f.a(this.f76492x92037252, zi3Var.f76492x92037252) && n51.f.a(this.f473624d, zi3Var.f473624d) && n51.f.a(this.f473625e, zi3Var.f473625e) && n51.f.a(this.f473626f, zi3Var.f473626f);
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
                        case -1728549842:
                            if (next.equals("logicresp")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -1314086357:
                            if (next.equals("mobile_info")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -964944331:
                            if (next.equals("resp_spam_info")) {
                                c17 = 2;
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
                        java.lang.Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof org.json.JSONObject) {
                            r45.d66 d66Var = new r45.d66();
                            d66Var.mo75930xb5cb93b2(((org.json.JSONObject) opt2).toString());
                            this.f473624d = d66Var;
                        }
                    } else if (c17 == 2) {
                        java.lang.Object opt3 = jSONObject.opt(next);
                        if (opt3 instanceof java.lang.String) {
                            this.f473625e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt3, 0));
                        }
                    } else if (c17 == 3) {
                        java.lang.Object opt4 = jSONObject.opt(next);
                        if (opt4 instanceof org.json.JSONObject) {
                            r45.fn4 fn4Var = new r45.fn4();
                            fn4Var.mo75930xb5cb93b2(((org.json.JSONObject) opt4).toString());
                            this.f473626f = fn4Var;
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
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.d66 d66Var = this.f473624d;
            if (d66Var != null) {
                fVar.i(2, d66Var.mo75928xcd1e8d8());
                this.f473624d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f473625e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            r45.fn4 fn4Var = this.f473626f;
            if (fn4Var != null) {
                fVar.i(4, fn4Var.mo75928xcd1e8d8());
                this.f473626f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.d66 d66Var2 = this.f473624d;
            if (d66Var2 != null) {
                i18 += b36.f.i(2, d66Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f473625e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            r45.fn4 fn4Var2 = this.f473626f;
            return fn4Var2 != null ? i18 + b36.f.i(4, fn4Var2.mo75928xcd1e8d8()) : i18;
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
        r45.zi3 zi3Var = (r45.zi3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                zi3Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.d66 d66Var3 = new r45.d66();
                if (bArr2 != null && bArr2.length > 0) {
                    d66Var3.mo11468x92b714fd(bArr2);
                }
                zi3Var.f473624d = d66Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            zi3Var.f473625e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.fn4 fn4Var3 = new r45.fn4();
            if (bArr3 != null && bArr3.length > 0) {
                fn4Var3.mo11468x92b714fd(bArr3);
            }
            zi3Var.f473626f = fn4Var3;
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
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "logicresp", this.f473624d, false);
            eVar.d(jSONObject, "resp_spam_info", this.f473625e, false);
            eVar.d(jSONObject, "mobile_info", this.f473626f, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
