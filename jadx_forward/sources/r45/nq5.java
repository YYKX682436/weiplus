package r45;

/* loaded from: classes14.dex */
public class nq5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f463135d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463136e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463137f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463138g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463139h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463140i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nq5)) {
            return false;
        }
        r45.nq5 nq5Var = (r45.nq5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f463135d), java.lang.Integer.valueOf(nq5Var.f463135d)) && n51.f.a(this.f463136e, nq5Var.f463136e) && n51.f.a(this.f463137f, nq5Var.f463137f) && n51.f.a(this.f463138g, nq5Var.f463138g) && n51.f.a(this.f463139h, nq5Var.f463139h) && n51.f.a(this.f463140i, nq5Var.f463140i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f463135d);
            java.lang.String str = this.f463136e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f463137f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f463138g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f463139h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f463140i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f463135d) + 0;
            java.lang.String str6 = this.f463136e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f463137f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f463138g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f463139h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f463140i;
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
        r45.nq5 nq5Var = (r45.nq5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nq5Var.f463135d = aVar2.g(intValue);
                return 0;
            case 2:
                nq5Var.f463136e = aVar2.k(intValue);
                return 0;
            case 3:
                nq5Var.f463137f = aVar2.k(intValue);
                return 0;
            case 4:
                nq5Var.f463138g = aVar2.k(intValue);
                return 0;
            case 5:
                nq5Var.f463139h = aVar2.k(intValue);
                return 0;
            case 6:
                nq5Var.f463140i = aVar2.k(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f463135d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "item_type", valueOf, false);
            eVar.d(jSONObject, ya.b.f77482xa8eebdc7, this.f463136e, false);
            eVar.d(jSONObject, "curr_page_json", this.f463137f, false);
            eVar.d(jSONObject, "source_page_json", this.f463138g, false);
            eVar.d(jSONObject, "ref_page_json", this.f463139h, false);
            eVar.d(jSONObject, "sdk_session_id", this.f463140i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
