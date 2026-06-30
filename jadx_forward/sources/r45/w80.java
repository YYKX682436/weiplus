package r45;

/* loaded from: classes8.dex */
public class w80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f470491d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470492e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f470493f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f470494g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w80)) {
            return false;
        }
        r45.w80 w80Var = (r45.w80) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f470491d), java.lang.Boolean.valueOf(w80Var.f470491d)) && n51.f.a(this.f470492e, w80Var.f470492e) && n51.f.a(java.lang.Boolean.valueOf(this.f470493f), java.lang.Boolean.valueOf(w80Var.f470493f)) && n51.f.a(java.lang.Boolean.valueOf(this.f470494g), java.lang.Boolean.valueOf(w80Var.f470494g));
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
                        case -1512045256:
                            if (next.equals("use_remark")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case -265713450:
                            if (next.equals(dm.i4.f66875xa013b0d5)) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 1670500532:
                            if (next.equals("enable_client_thumbnail")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case 2055135125:
                            if (next.equals("use_client_avatar")) {
                                c17 = 3;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f470491d = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                    } else if (c17 == 1) {
                        this.f470492e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        this.f470493f = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
                    } else if (c17 == 3) {
                        this.f470494g = ((java.lang.Boolean) jSONObject.opt(next)).booleanValue();
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
            fVar.a(1, this.f470491d);
            java.lang.String str = this.f470492e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f470493f);
            fVar.a(4, this.f470494g);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f470491d) + 0;
            java.lang.String str2 = this.f470492e;
            if (str2 != null) {
                a17 += b36.f.j(2, str2);
            }
            return a17 + b36.f.a(3, this.f470493f) + b36.f.a(4, this.f470494g);
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
        r45.w80 w80Var = (r45.w80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            w80Var.f470491d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            w80Var.f470492e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            w80Var.f470493f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        w80Var.f470494g = aVar2.c(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f470491d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "use_remark", valueOf, true);
            eVar.d(jSONObject, dm.i4.f66875xa013b0d5, this.f470492e, true);
            eVar.d(jSONObject, "enable_client_thumbnail", java.lang.Boolean.valueOf(this.f470493f), true);
            eVar.d(jSONObject, "use_client_avatar", java.lang.Boolean.valueOf(this.f470494g), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
