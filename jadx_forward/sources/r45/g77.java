package r45;

/* loaded from: classes2.dex */
public class g77 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456504d;

    /* renamed from: e, reason: collision with root package name */
    public int f456505e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f456506f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456507g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g77)) {
            return false;
        }
        r45.g77 g77Var = (r45.g77) fVar;
        return n51.f.a(this.f456504d, g77Var.f456504d) && n51.f.a(java.lang.Integer.valueOf(this.f456505e), java.lang.Integer.valueOf(g77Var.f456505e)) && n51.f.a(this.f456506f, g77Var.f456506f) && n51.f.a(this.f456507g, g77Var.f456507g);
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
                        case -1815507339:
                            if (next.equals("data_buffer")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -102469055:
                            if (next.equals("version_type")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 3433509:
                            if (next.equals(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 93029116:
                            if (next.equals("appid")) {
                                c17 = 0;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f456504d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f456505e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 2) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof java.lang.String) {
                            this.f456506f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(android.util.Base64.decode((java.lang.String) opt, 0));
                        }
                    } else if (c17 == 3) {
                        this.f456507g = (java.lang.String) jSONObject.opt(next);
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
            java.lang.String str = this.f456504d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f456505e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f456506f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str2 = this.f456507g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f456504d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f456505e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f456506f;
            if (gVar2 != null) {
                j17 += b36.f.b(3, gVar2);
            }
            java.lang.String str4 = this.f456507g;
            return str4 != null ? j17 + b36.f.j(4, str4) : j17;
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
        r45.g77 g77Var = (r45.g77) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            g77Var.f456504d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            g77Var.f456505e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            g77Var.f456506f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        g77Var.f456507g = aVar2.k(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f456504d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "appid", str, true);
            eVar.d(jSONObject, "version_type", java.lang.Integer.valueOf(this.f456505e), true);
            eVar.d(jSONObject, "data_buffer", this.f456506f, true);
            eVar.d(jSONObject, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, this.f456507g, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
