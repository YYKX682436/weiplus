package r45;

/* loaded from: classes4.dex */
public class zn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473748d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473749e;

    /* renamed from: f, reason: collision with root package name */
    public int f473750f;

    /* renamed from: g, reason: collision with root package name */
    public int f473751g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zn)) {
            return false;
        }
        r45.zn znVar = (r45.zn) fVar;
        return n51.f.a(this.f473748d, znVar.f473748d) && n51.f.a(this.f473749e, znVar.f473749e) && n51.f.a(java.lang.Integer.valueOf(this.f473750f), java.lang.Integer.valueOf(znVar.f473750f)) && n51.f.a(java.lang.Integer.valueOf(this.f473751g), java.lang.Integer.valueOf(znVar.f473751g));
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
                        case -666241892:
                            if (next.equals("badge_icon_width")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -551767632:
                            if (next.equals("badge_icon_url_dark")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case -94549563:
                            if (next.equals("badge_icon_url")) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 388343057:
                            if (next.equals("badge_icon_height")) {
                                c17 = 3;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f473748d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        this.f473749e = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 2) {
                        this.f473750f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                    } else if (c17 == 3) {
                        this.f473751g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
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
            java.lang.String str = this.f473748d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473749e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f473750f);
            fVar.e(4, this.f473751g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f473748d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f473749e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f473750f) + b36.f.e(4, this.f473751g);
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
        r45.zn znVar = (r45.zn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            znVar.f473748d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            znVar.f473749e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            znVar.f473750f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        znVar.f473751g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f473748d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "badge_icon_url", str, false);
            eVar.d(jSONObject, "badge_icon_url_dark", this.f473749e, false);
            eVar.d(jSONObject, "badge_icon_width", java.lang.Integer.valueOf(this.f473750f), false);
            eVar.d(jSONObject, "badge_icon_height", java.lang.Integer.valueOf(this.f473751g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
