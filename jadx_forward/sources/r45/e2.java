package r45;

/* loaded from: classes4.dex */
public class e2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454453d;

    /* renamed from: e, reason: collision with root package name */
    public int f454454e;

    /* renamed from: f, reason: collision with root package name */
    public int f454455f;

    /* renamed from: g, reason: collision with root package name */
    public int f454456g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e2)) {
            return false;
        }
        r45.e2 e2Var = (r45.e2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454453d), java.lang.Integer.valueOf(e2Var.f454453d)) && n51.f.a(java.lang.Integer.valueOf(this.f454454e), java.lang.Integer.valueOf(e2Var.f454454e)) && n51.f.a(java.lang.Integer.valueOf(this.f454455f), java.lang.Integer.valueOf(e2Var.f454455f)) && n51.f.a(java.lang.Integer.valueOf(this.f454456g), java.lang.Integer.valueOf(e2Var.f454456g));
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
                        case -1302045062:
                            if (next.equals("closeIncoColor")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case -1063571914:
                            if (next.equals("textColor")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -183470359:
                            if (next.equals("dynamicBgLayoutId")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 1098450716:
                            if (next.equals("downArrowColor")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f454453d = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 1) {
                        this.f454454e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 2) {
                        this.f454455f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f454456g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            fVar.e(1, this.f454453d);
            fVar.e(2, this.f454454e);
            fVar.e(3, this.f454455f);
            fVar.e(4, this.f454456g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f454453d) + 0 + b36.f.e(2, this.f454454e) + b36.f.e(3, this.f454455f) + b36.f.e(4, this.f454456g);
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
        r45.e2 e2Var = (r45.e2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e2Var.f454453d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            e2Var.f454454e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            e2Var.f454455f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        e2Var.f454456g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f454453d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "dynamicBgLayoutId", valueOf, false);
            eVar.d(jSONObject, "textColor", java.lang.Integer.valueOf(this.f454454e), false);
            eVar.d(jSONObject, "downArrowColor", java.lang.Integer.valueOf(this.f454455f), false);
            eVar.d(jSONObject, "closeIncoColor", java.lang.Integer.valueOf(this.f454456g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
