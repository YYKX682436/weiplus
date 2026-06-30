package r45;

/* loaded from: classes2.dex */
public class u56 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468609d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f468610e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f468611f;

    /* renamed from: g, reason: collision with root package name */
    public int f468612g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468613h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f468614i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u56)) {
            return false;
        }
        r45.u56 u56Var = (r45.u56) fVar;
        return n51.f.a(this.f468609d, u56Var.f468609d) && n51.f.a(this.f468610e, u56Var.f468610e) && n51.f.a(this.f468611f, u56Var.f468611f) && n51.f.a(java.lang.Integer.valueOf(this.f468612g), java.lang.Integer.valueOf(u56Var.f468612g)) && n51.f.a(this.f468613h, u56Var.f468613h) && n51.f.a(this.f468614i, u56Var.f468614i);
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
                        case -2115337775:
                            if (next.equals("text_color")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -1265068311:
                            if (next.equals("bg_color")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -737588055:
                            if (next.equals("icon_url")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -42298471:
                            if (next.equals("sub_title")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 525697014:
                            if (next.equals("show_second")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 808229970:
                            if (next.equals("main_title")) {
                                c17 = 0;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f468609d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f468610e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        this.f468611f = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 3) {
                        this.f468612g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 4) {
                        this.f468613h = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 5) {
                        this.f468614i = (java.lang.String) jSONObject.opt(next);
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
            java.lang.String str = this.f468609d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f468610e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f468611f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f468612g);
            java.lang.String str4 = this.f468613h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f468614i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f468609d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f468610e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f468611f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f468612g);
            java.lang.String str9 = this.f468613h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f468614i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        r45.u56 u56Var = (r45.u56) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                u56Var.f468609d = aVar2.k(intValue);
                return 0;
            case 2:
                u56Var.f468610e = aVar2.k(intValue);
                return 0;
            case 3:
                u56Var.f468611f = aVar2.k(intValue);
                return 0;
            case 4:
                u56Var.f468612g = aVar2.g(intValue);
                return 0;
            case 5:
                u56Var.f468613h = aVar2.k(intValue);
                return 0;
            case 6:
                u56Var.f468614i = aVar2.k(intValue);
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
            java.lang.String str = this.f468609d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "main_title", str, true);
            eVar.d(jSONObject, "sub_title", this.f468610e, true);
            eVar.d(jSONObject, "icon_url", this.f468611f, true);
            eVar.d(jSONObject, "show_second", java.lang.Integer.valueOf(this.f468612g), true);
            eVar.d(jSONObject, "text_color", this.f468613h, true);
            eVar.d(jSONObject, "bg_color", this.f468614i, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
