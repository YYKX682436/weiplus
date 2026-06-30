package r45;

/* loaded from: classes2.dex */
public class eh6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455034d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455035e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455036f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455037g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455038h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455039i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.eh6)) {
            return false;
        }
        r45.eh6 eh6Var = (r45.eh6) fVar;
        return n51.f.a(this.f455034d, eh6Var.f455034d) && n51.f.a(this.f455035e, eh6Var.f455035e) && n51.f.a(this.f455036f, eh6Var.f455036f) && n51.f.a(this.f455037g, eh6Var.f455037g) && n51.f.a(this.f455038h, eh6Var.f455038h) && n51.f.a(this.f455039i, eh6Var.f455039i);
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
                        case -2090050568:
                            if (next.equals("subTitle")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1878095475:
                            if (next.equals("darkColor")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1715118778:
                            if (next.equals("iconLightColor")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case -234567699:
                            if (next.equals("lightColor")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1537828116:
                            if (next.equals("iconDarkColor")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case 1638765110:
                            if (next.equals("iconUrl")) {
                                c17 = 1;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f455034d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f455035e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        this.f455036f = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 3) {
                        this.f455037g = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 4) {
                        this.f455038h = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 5) {
                        this.f455039i = (java.lang.String) jSONObject.opt(next);
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
            java.lang.String str = this.f455034d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f455035e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f455036f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f455037g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f455038h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f455039i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f455034d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f455035e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f455036f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f455037g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f455038h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f455039i;
            return str12 != null ? j17 + b36.f.j(6, str12) : j17;
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
        r45.eh6 eh6Var = (r45.eh6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                eh6Var.f455034d = aVar2.k(intValue);
                return 0;
            case 2:
                eh6Var.f455035e = aVar2.k(intValue);
                return 0;
            case 3:
                eh6Var.f455036f = aVar2.k(intValue);
                return 0;
            case 4:
                eh6Var.f455037g = aVar2.k(intValue);
                return 0;
            case 5:
                eh6Var.f455038h = aVar2.k(intValue);
                return 0;
            case 6:
                eh6Var.f455039i = aVar2.k(intValue);
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
            java.lang.String str = this.f455034d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "subTitle", str, true);
            eVar.d(jSONObject, "iconUrl", this.f455035e, true);
            eVar.d(jSONObject, "lightColor", this.f455036f, true);
            eVar.d(jSONObject, "darkColor", this.f455037g, true);
            eVar.d(jSONObject, "iconLightColor", this.f455038h, true);
            eVar.d(jSONObject, "iconDarkColor", this.f455039i, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
