package r45;

/* loaded from: classes2.dex */
public class lp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461218d;

    /* renamed from: e, reason: collision with root package name */
    public r45.zo5 f461219e;

    /* renamed from: f, reason: collision with root package name */
    public float f461220f;

    /* renamed from: g, reason: collision with root package name */
    public r45.kn f461221g;

    /* renamed from: h, reason: collision with root package name */
    public r45.xm5 f461222h;

    /* renamed from: i, reason: collision with root package name */
    public int f461223i;

    /* renamed from: m, reason: collision with root package name */
    public r45.uy3 f461224m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f461225n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lp)) {
            return false;
        }
        r45.lp lpVar = (r45.lp) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461218d), java.lang.Integer.valueOf(lpVar.f461218d)) && n51.f.a(this.f461219e, lpVar.f461219e) && n51.f.a(java.lang.Float.valueOf(this.f461220f), java.lang.Float.valueOf(lpVar.f461220f)) && n51.f.a(this.f461221g, lpVar.f461221g) && n51.f.a(this.f461222h, lpVar.f461222h) && n51.f.a(java.lang.Integer.valueOf(this.f461223i), java.lang.Integer.valueOf(lpVar.f461223i)) && n51.f.a(this.f461224m, lpVar.f461224m) && n51.f.a(java.lang.Boolean.valueOf(this.f461225n), java.lang.Boolean.valueOf(lpVar.f461225n));
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
                        case -2117277325:
                            if (next.equals("text_align")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -1842502844:
                            if (next.equals("disable_bracket_render")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case -1390460921:
                            if (next.equals("icon_size")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case -1383304148:
                            if (next.equals("border")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1332194002:
                            if (next.equals("background")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -938578798:
                            if (next.equals("radius")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1474965877:
                            if (next.equals("reddot_pendant")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 2024311912:
                            if (next.equals("font_weight")) {
                                c17 = 0;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f461218d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 1:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.zo5 zo5Var = new r45.zo5();
                                zo5Var.mo75930xb5cb93b2(((org.json.JSONObject) opt).toString());
                                this.f461219e = zo5Var;
                                break;
                            }
                        case 2:
                            this.f461220f = (float) jSONObject.optDouble(next);
                            break;
                        case 3:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.kn knVar = new r45.kn();
                                knVar.mo75930xb5cb93b2(((org.json.JSONObject) opt2).toString());
                                this.f461221g = knVar;
                                break;
                            }
                        case 4:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.xm5 xm5Var = new r45.xm5();
                                xm5Var.mo75930xb5cb93b2(((org.json.JSONObject) opt3).toString());
                                this.f461222h = xm5Var;
                                break;
                            }
                        case 5:
                            this.f461223i = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 6:
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.uy3 uy3Var = new r45.uy3();
                                uy3Var.mo75930xb5cb93b2(((org.json.JSONObject) opt4).toString());
                                this.f461224m = uy3Var;
                                break;
                            }
                        case 7:
                            this.f461225n = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
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
            fVar.e(1, this.f461218d);
            r45.zo5 zo5Var = this.f461219e;
            if (zo5Var != null) {
                fVar.i(2, zo5Var.mo75928xcd1e8d8());
                this.f461219e.mo75956x3d5d1f78(fVar);
            }
            fVar.d(3, this.f461220f);
            r45.kn knVar = this.f461221g;
            if (knVar != null) {
                fVar.i(4, knVar.mo75928xcd1e8d8());
                this.f461221g.mo75956x3d5d1f78(fVar);
            }
            r45.xm5 xm5Var = this.f461222h;
            if (xm5Var != null) {
                fVar.i(5, xm5Var.mo75928xcd1e8d8());
                this.f461222h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f461223i);
            r45.uy3 uy3Var = this.f461224m;
            if (uy3Var != null) {
                fVar.i(7, uy3Var.mo75928xcd1e8d8());
                this.f461224m.mo75956x3d5d1f78(fVar);
            }
            fVar.a(8, this.f461225n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461218d) + 0;
            r45.zo5 zo5Var2 = this.f461219e;
            if (zo5Var2 != null) {
                e17 += b36.f.i(2, zo5Var2.mo75928xcd1e8d8());
            }
            int d17 = e17 + b36.f.d(3, this.f461220f);
            r45.kn knVar2 = this.f461221g;
            if (knVar2 != null) {
                d17 += b36.f.i(4, knVar2.mo75928xcd1e8d8());
            }
            r45.xm5 xm5Var2 = this.f461222h;
            if (xm5Var2 != null) {
                d17 += b36.f.i(5, xm5Var2.mo75928xcd1e8d8());
            }
            int e18 = d17 + b36.f.e(6, this.f461223i);
            r45.uy3 uy3Var2 = this.f461224m;
            if (uy3Var2 != null) {
                e18 += b36.f.i(7, uy3Var2.mo75928xcd1e8d8());
            }
            return e18 + b36.f.a(8, this.f461225n);
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
        r45.lp lpVar = (r45.lp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lpVar.f461218d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.zo5 zo5Var3 = new r45.zo5();
                    if (bArr != null && bArr.length > 0) {
                        zo5Var3.mo11468x92b714fd(bArr);
                    }
                    lpVar.f461219e = zo5Var3;
                }
                return 0;
            case 3:
                lpVar.f461220f = aVar2.f(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.kn knVar3 = new r45.kn();
                    if (bArr2 != null && bArr2.length > 0) {
                        knVar3.mo11468x92b714fd(bArr2);
                    }
                    lpVar.f461221g = knVar3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.xm5 xm5Var3 = new r45.xm5();
                    if (bArr3 != null && bArr3.length > 0) {
                        xm5Var3.mo11468x92b714fd(bArr3);
                    }
                    lpVar.f461222h = xm5Var3;
                }
                return 0;
            case 6:
                lpVar.f461223i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.uy3 uy3Var3 = new r45.uy3();
                    if (bArr4 != null && bArr4.length > 0) {
                        uy3Var3.mo11468x92b714fd(bArr4);
                    }
                    lpVar.f461224m = uy3Var3;
                }
                return 0;
            case 8:
                lpVar.f461225n = aVar2.c(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f461218d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "font_weight", valueOf, true);
            eVar.d(jSONObject, "background", this.f461219e, true);
            eVar.d(jSONObject, "radius", java.lang.Float.valueOf(this.f461220f), true);
            eVar.d(jSONObject, "border", this.f461221g, true);
            eVar.d(jSONObject, "reddot_pendant", this.f461222h, true);
            eVar.d(jSONObject, "text_align", java.lang.Integer.valueOf(this.f461223i), true);
            eVar.d(jSONObject, "icon_size", this.f461224m, true);
            eVar.d(jSONObject, "disable_bracket_render", java.lang.Boolean.valueOf(this.f461225n), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
