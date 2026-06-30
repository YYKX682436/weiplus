package r45;

/* loaded from: classes2.dex */
public class im6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458685d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458686e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458687f;

    /* renamed from: g, reason: collision with root package name */
    public long f458688g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.im6)) {
            return false;
        }
        r45.im6 im6Var = (r45.im6) fVar;
        return n51.f.a(this.f458685d, im6Var.f458685d) && n51.f.a(this.f458686e, im6Var.f458686e) && n51.f.a(this.f458687f, im6Var.f458687f) && n51.f.a(java.lang.Long.valueOf(this.f458688g), java.lang.Long.valueOf(im6Var.f458688g));
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
                                c17 = 0;
                                break;
                            }
                            break;
                        case 70690926:
                            if (next.equals("nickname")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 617736385:
                            if (next.equals("finder_uin")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 2027875547:
                            if (next.equals("logo_url")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f458685d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f458686e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        this.f458687f = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 3) {
                        this.f458688g = jSONObject.optLong(next);
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
            java.lang.String str = this.f458685d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f458686e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f458687f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f458688g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f458685d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f458686e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f458687f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f458688g);
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
        r45.im6 im6Var = (r45.im6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            im6Var.f458685d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            im6Var.f458686e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            im6Var.f458687f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        im6Var.f458688g = aVar2.i(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f458685d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, dm.i4.f66875xa013b0d5, str, true);
            eVar.d(jSONObject, "nickname", this.f458686e, true);
            eVar.d(jSONObject, "logo_url", this.f458687f, true);
            eVar.d(jSONObject, "finder_uin", java.lang.Long.valueOf(this.f458688g), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
