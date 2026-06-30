package r45;

/* loaded from: classes2.dex */
public class t60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f467699d;

    /* renamed from: e, reason: collision with root package name */
    public r45.zo5 f467700e;

    /* renamed from: f, reason: collision with root package name */
    public int f467701f;

    /* renamed from: g, reason: collision with root package name */
    public int f467702g;

    /* renamed from: h, reason: collision with root package name */
    public int f467703h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t60)) {
            return false;
        }
        r45.t60 t60Var = (r45.t60) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f467699d), java.lang.Integer.valueOf(t60Var.f467699d)) && n51.f.a(this.f467700e, t60Var.f467700e) && n51.f.a(java.lang.Integer.valueOf(this.f467701f), java.lang.Integer.valueOf(t60Var.f467701f)) && n51.f.a(java.lang.Integer.valueOf(this.f467702g), java.lang.Integer.valueOf(t60Var.f467702g)) && n51.f.a(java.lang.Integer.valueOf(this.f467703h), java.lang.Integer.valueOf(t60Var.f467703h));
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
                        case -128421636:
                            if (next.equals("vertical_align")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 3321844:
                            if (next.equals("line")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 3530753:
                            if (next.equals("size")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 94842723:
                            if (next.equals("color")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 828740891:
                            if (next.equals("expected_line")) {
                                c17 = 4;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f467699d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 1) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONObject) {
                            r45.zo5 zo5Var = new r45.zo5();
                            zo5Var.mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                            this.f467700e = zo5Var;
                        }
                    } else if (c17 == 2) {
                        this.f467701f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f467702g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 4) {
                        this.f467703h = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            fVar.e(1, this.f467699d);
            r45.zo5 zo5Var = this.f467700e;
            if (zo5Var != null) {
                fVar.i(2, zo5Var.mo75928xcd1e8d8());
                this.f467700e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f467701f);
            fVar.e(4, this.f467702g);
            fVar.e(5, this.f467703h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f467699d) + 0;
            r45.zo5 zo5Var2 = this.f467700e;
            if (zo5Var2 != null) {
                e17 += b36.f.i(2, zo5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(3, this.f467701f) + b36.f.e(4, this.f467702g) + b36.f.e(5, this.f467703h);
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
        r45.t60 t60Var = (r45.t60) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t60Var.f467699d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                t60Var.f467701f = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                t60Var.f467702g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            t60Var.f467703h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.zo5 zo5Var3 = new r45.zo5();
            if (bArr != null && bArr.length > 0) {
                zo5Var3.mo11468x92b714fd(bArr);
            }
            t60Var.f467700e = zo5Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f467699d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "size", valueOf, true);
            eVar.d(jSONObject, "color", this.f467700e, true);
            eVar.d(jSONObject, "line", java.lang.Integer.valueOf(this.f467701f), true);
            eVar.d(jSONObject, "vertical_align", java.lang.Integer.valueOf(this.f467702g), true);
            eVar.d(jSONObject, "expected_line", java.lang.Integer.valueOf(this.f467703h), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
