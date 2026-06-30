package r45;

/* loaded from: classes10.dex */
public class c05 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f452725d;

    /* renamed from: e, reason: collision with root package name */
    public r45.c15 f452726e;

    /* renamed from: f, reason: collision with root package name */
    public r45.d15 f452727f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c05)) {
            return false;
        }
        r45.c05 c05Var = (r45.c05) fVar;
        return n51.f.a(this.f76494x2de60e5e, c05Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f452725d), java.lang.Integer.valueOf(c05Var.f452725d)) && n51.f.a(this.f452726e, c05Var.f452726e) && n51.f.a(this.f452727f, c05Var.f452727f);
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
                        case -923884651:
                            if (next.equals("report_scan_multi_room_qrcode")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -246541467:
                            if (next.equals("report_type")) {
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
                        case 1561883196:
                            if (next.equals("report_join_room_by_qrcode")) {
                                c17 = 2;
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
                        this.f452725d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 2) {
                        java.lang.Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof org.json.JSONObject) {
                            r45.c15 c15Var = new r45.c15();
                            c15Var.mo75930xb5cb93b2(((org.json.JSONObject) opt2).toString());
                            this.f452726e = c15Var;
                        }
                    } else if (c17 == 3) {
                        java.lang.Object opt3 = jSONObject.opt(next);
                        if (opt3 instanceof org.json.JSONObject) {
                            r45.d15 d15Var = new r45.d15();
                            d15Var.mo75930xb5cb93b2(((org.json.JSONObject) opt3).toString());
                            this.f452727f = d15Var;
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
            fVar.e(2, this.f452725d);
            r45.c15 c15Var = this.f452726e;
            if (c15Var != null) {
                fVar.i(3, c15Var.mo75928xcd1e8d8());
                this.f452726e.mo75956x3d5d1f78(fVar);
            }
            r45.d15 d15Var = this.f452727f;
            if (d15Var != null) {
                fVar.i(4, d15Var.mo75928xcd1e8d8());
                this.f452727f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f452725d);
            r45.c15 c15Var2 = this.f452726e;
            if (c15Var2 != null) {
                i18 += b36.f.i(3, c15Var2.mo75928xcd1e8d8());
            }
            r45.d15 d15Var2 = this.f452727f;
            return d15Var2 != null ? i18 + b36.f.i(4, d15Var2.mo75928xcd1e8d8()) : i18;
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
        r45.c05 c05Var = (r45.c05) objArr[1];
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
                c05Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            c05Var.f452725d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.c15 c15Var3 = new r45.c15();
                if (bArr2 != null && bArr2.length > 0) {
                    c15Var3.mo11468x92b714fd(bArr2);
                }
                c05Var.f452726e = c15Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.d15 d15Var3 = new r45.d15();
            if (bArr3 != null && bArr3.length > 0) {
                d15Var3.mo11468x92b714fd(bArr3);
            }
            c05Var.f452727f = d15Var3;
        }
        return 0;
    }
}
