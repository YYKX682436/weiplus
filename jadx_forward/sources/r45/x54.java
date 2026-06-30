package r45;

/* loaded from: classes4.dex */
public class x54 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471324d;

    /* renamed from: e, reason: collision with root package name */
    public long f471325e;

    /* renamed from: f, reason: collision with root package name */
    public long f471326f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f471327g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x54)) {
            return false;
        }
        r45.x54 x54Var = (r45.x54) fVar;
        return n51.f.a(this.f471324d, x54Var.f471324d) && n51.f.a(java.lang.Long.valueOf(this.f471325e), java.lang.Long.valueOf(x54Var.f471325e)) && n51.f.a(java.lang.Long.valueOf(this.f471326f), java.lang.Long.valueOf(x54Var.f471326f)) && n51.f.a(java.lang.Boolean.valueOf(this.f471327g), java.lang.Boolean.valueOf(x54Var.f471327g));
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
                        case -1300607287:
                            if (next.equals("layer_id")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -1023149599:
                            if (next.equals("controlled_by_lua")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -41370263:
                            if (next.equals("first_render_timestamp_ms")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 1493405263:
                            if (next.equals("last_render_timestamp_ms")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f471324d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f471325e = jSONObject.optLong(next);
                    } else if (c17 == 2) {
                        this.f471326f = jSONObject.optLong(next);
                    } else if (c17 == 3) {
                        this.f471327g = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
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
            java.lang.String str = this.f471324d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f471325e);
            fVar.h(3, this.f471326f);
            fVar.a(4, this.f471327g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f471324d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f471325e) + b36.f.h(3, this.f471326f) + b36.f.a(4, this.f471327g);
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
        r45.x54 x54Var = (r45.x54) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x54Var.f471324d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            x54Var.f471325e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            x54Var.f471326f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        x54Var.f471327g = aVar2.c(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f471324d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "layer_id", str, false);
            eVar.d(jSONObject, "first_render_timestamp_ms", java.lang.Long.valueOf(this.f471325e), false);
            eVar.d(jSONObject, "last_render_timestamp_ms", java.lang.Long.valueOf(this.f471326f), false);
            eVar.d(jSONObject, "controlled_by_lua", java.lang.Boolean.valueOf(this.f471327g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
