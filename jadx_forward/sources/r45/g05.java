package r45;

/* loaded from: classes2.dex */
public class g05 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f456317d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456318e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456319f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456320g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456321h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g05)) {
            return false;
        }
        r45.g05 g05Var = (r45.g05) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f456317d), java.lang.Integer.valueOf(g05Var.f456317d)) && n51.f.a(this.f456318e, g05Var.f456318e) && n51.f.a(this.f456319f, g05Var.f456319f) && n51.f.a(this.f456320g, g05Var.f456320g) && n51.f.a(this.f456321h, g05Var.f456321h);
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
                        case -141651711:
                            if (next.equals("export_username")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 109254796:
                            if (next.equals(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811)) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1353942442:
                            if (next.equals("finder_joinlive_trace_buffer")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 1804799183:
                            if (next.equals("finder_username")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 1988152982:
                            if (next.equals("finder_context")) {
                                c17 = 3;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f456317d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 1) {
                        this.f456318e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        this.f456319f = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 3) {
                        this.f456320g = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 4) {
                        this.f456321h = (java.lang.String) jSONObject.opt(next);
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
            fVar.e(1, this.f456317d);
            java.lang.String str = this.f456318e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f456319f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f456320g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f456321h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f456317d) + 0;
            java.lang.String str5 = this.f456318e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f456319f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f456320g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f456321h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        r45.g05 g05Var = (r45.g05) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            g05Var.f456317d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            g05Var.f456318e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            g05Var.f456319f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            g05Var.f456320g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        g05Var.f456321h = aVar2.k(intValue);
        return 0;
    }
}
