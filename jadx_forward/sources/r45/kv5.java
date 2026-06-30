package r45;

/* loaded from: classes4.dex */
public class kv5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460512d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460513e;

    /* renamed from: f, reason: collision with root package name */
    public int f460514f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460515g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460516h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460517i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kv5)) {
            return false;
        }
        r45.kv5 kv5Var = (r45.kv5) fVar;
        return n51.f.a(this.f460512d, kv5Var.f460512d) && n51.f.a(this.f460513e, kv5Var.f460513e) && n51.f.a(java.lang.Integer.valueOf(this.f460514f), java.lang.Integer.valueOf(kv5Var.f460514f)) && n51.f.a(this.f460515g, kv5Var.f460515g) && n51.f.a(this.f460516h, kv5Var.f460516h) && n51.f.a(this.f460517i, kv5Var.f460517i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460512d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460513e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f460514f);
            java.lang.String str3 = this.f460515g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f460516h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f460517i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f460512d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f460513e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f460514f);
            java.lang.String str8 = this.f460515g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f460516h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f460517i;
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
        r45.kv5 kv5Var = (r45.kv5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kv5Var.f460512d = aVar2.k(intValue);
                return 0;
            case 2:
                kv5Var.f460513e = aVar2.k(intValue);
                return 0;
            case 3:
                kv5Var.f460514f = aVar2.g(intValue);
                return 0;
            case 4:
                kv5Var.f460515g = aVar2.k(intValue);
                return 0;
            case 5:
                kv5Var.f460516h = aVar2.k(intValue);
                return 0;
            case 6:
                kv5Var.f460517i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f460512d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "scope", str, false);
            eVar.d(jSONObject, "desc", this.f460513e, false);
            eVar.d(jSONObject, "state", java.lang.Integer.valueOf(this.f460514f), false);
            eVar.d(jSONObject, "icon_url", this.f460515g, false);
            eVar.d(jSONObject, "dark_mode_icon_url", this.f460516h, false);
            eVar.d(jSONObject, "sub_desc", this.f460517i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
