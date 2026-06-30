package r45;

/* loaded from: classes2.dex */
public class tm4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468104d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468105e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468106f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468107g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468108h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f468109i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f468110m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tm4)) {
            return false;
        }
        r45.tm4 tm4Var = (r45.tm4) fVar;
        return n51.f.a(this.f468104d, tm4Var.f468104d) && n51.f.a(this.f468105e, tm4Var.f468105e) && n51.f.a(this.f468106f, tm4Var.f468106f) && n51.f.a(this.f468107g, tm4Var.f468107g) && n51.f.a(this.f468108h, tm4Var.f468108h) && n51.f.a(this.f468109i, tm4Var.f468109i) && n51.f.a(this.f468110m, tm4Var.f468110m);
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
                        case -265713450:
                            if (next.equals(dm.i4.f66875xa013b0d5)) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -206642229:
                            if (next.equals("ecs_jump_info_base64_str")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 3433509:
                            if (next.equals(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 37109963:
                            if (next.equals("request_id")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 1599514594:
                            if (next.equals("preload_flag")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 1753008747:
                            if (next.equals("product_id")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 2067081988:
                            if (next.equals("shop_id")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f468104d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f468105e = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 2:
                            this.f468106f = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 3:
                            this.f468107g = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 4:
                            this.f468108h = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 5:
                            this.f468109i = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 6:
                            this.f468110m = (java.lang.String) jSONObject.opt(next);
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
            java.lang.String str = this.f468104d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f468105e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f468106f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f468107g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f468108h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f468109i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f468110m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f468104d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f468105e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f468106f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f468107g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f468108h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f468109i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f468110m;
            return str14 != null ? j17 + b36.f.j(7, str14) : j17;
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
        r45.tm4 tm4Var = (r45.tm4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tm4Var.f468104d = aVar2.k(intValue);
                return 0;
            case 2:
                tm4Var.f468105e = aVar2.k(intValue);
                return 0;
            case 3:
                tm4Var.f468106f = aVar2.k(intValue);
                return 0;
            case 4:
                tm4Var.f468107g = aVar2.k(intValue);
                return 0;
            case 5:
                tm4Var.f468108h = aVar2.k(intValue);
                return 0;
            case 6:
                tm4Var.f468109i = aVar2.k(intValue);
                return 0;
            case 7:
                tm4Var.f468110m = aVar2.k(intValue);
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
            java.lang.String str = this.f468104d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "product_id", str, false);
            eVar.d(jSONObject, "shop_id", this.f468105e, false);
            eVar.d(jSONObject, dm.i4.f66875xa013b0d5, this.f468106f, false);
            eVar.d(jSONObject, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f468107g, false);
            eVar.d(jSONObject, "request_id", this.f468108h, false);
            eVar.d(jSONObject, "preload_flag", this.f468109i, false);
            eVar.d(jSONObject, "ecs_jump_info_base64_str", this.f468110m, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
