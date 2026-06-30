package pj4;

/* loaded from: classes9.dex */
public class n0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f436726d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436727e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f436728f;

    /* renamed from: g, reason: collision with root package name */
    public long f436729g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f436730h;

    /* renamed from: i, reason: collision with root package name */
    public int f436731i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.n0)) {
            return false;
        }
        pj4.n0 n0Var = (pj4.n0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f436726d), java.lang.Integer.valueOf(n0Var.f436726d)) && n51.f.a(this.f436727e, n0Var.f436727e) && n51.f.a(this.f436728f, n0Var.f436728f) && n51.f.a(java.lang.Long.valueOf(this.f436729g), java.lang.Long.valueOf(n0Var.f436729g)) && n51.f.a(this.f436730h, n0Var.f436730h) && n51.f.a(java.lang.Integer.valueOf(this.f436731i), java.lang.Integer.valueOf(n0Var.f436731i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f436726d);
            java.lang.String str = this.f436727e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f436728f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f436729g);
            java.lang.String str3 = this.f436730h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f436731i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f436726d) + 0;
            java.lang.String str4 = this.f436727e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f436728f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int h17 = e17 + b36.f.h(4, this.f436729g);
            java.lang.String str6 = this.f436730h;
            if (str6 != null) {
                h17 += b36.f.j(5, str6);
            }
            return h17 + b36.f.e(6, this.f436731i);
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
        pj4.n0 n0Var = (pj4.n0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n0Var.f436726d = aVar2.g(intValue);
                return 0;
            case 2:
                n0Var.f436727e = aVar2.k(intValue);
                return 0;
            case 3:
                n0Var.f436728f = aVar2.k(intValue);
                return 0;
            case 4:
                n0Var.f436729g = aVar2.i(intValue);
                return 0;
            case 5:
                n0Var.f436730h = aVar2.k(intValue);
                return 0;
            case 6:
                n0Var.f436731i = aVar2.g(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f436726d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "action", valueOf, false);
            eVar.d(jSONObject, "tag", this.f436727e, false);
            eVar.d(jSONObject, "source_id", this.f436728f, false);
            eVar.d(jSONObject, "card_key", java.lang.Long.valueOf(this.f436729g), false);
            eVar.d(jSONObject, "status_id", this.f436730h, false);
            eVar.d(jSONObject, "modify_count", java.lang.Integer.valueOf(this.f436731i), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
