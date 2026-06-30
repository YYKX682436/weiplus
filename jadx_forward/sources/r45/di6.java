package r45;

/* loaded from: classes12.dex */
public class di6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454045d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454046e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454047f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454048g;

    /* renamed from: h, reason: collision with root package name */
    public int f454049h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454050i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f454051m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f454052n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f454053o;

    /* renamed from: p, reason: collision with root package name */
    public r45.ak6 f454054p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.di6)) {
            return false;
        }
        r45.di6 di6Var = (r45.di6) fVar;
        return n51.f.a(this.f454045d, di6Var.f454045d) && n51.f.a(this.f454046e, di6Var.f454046e) && n51.f.a(this.f454047f, di6Var.f454047f) && n51.f.a(this.f454048g, di6Var.f454048g) && n51.f.a(java.lang.Integer.valueOf(this.f454049h), java.lang.Integer.valueOf(di6Var.f454049h)) && n51.f.a(this.f454050i, di6Var.f454050i) && n51.f.a(this.f454051m, di6Var.f454051m) && n51.f.a(this.f454052n, di6Var.f454052n) && n51.f.a(this.f454053o, di6Var.f454053o) && n51.f.a(this.f454054p, di6Var.f454054p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454045d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454046e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f454047f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str3 = this.f454048g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f454049h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f454050i;
            if (gVar2 != null) {
                fVar.b(6, gVar2);
            }
            java.lang.String str4 = this.f454051m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f454052n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f454053o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            r45.ak6 ak6Var = this.f454054p;
            if (ak6Var != null) {
                fVar.i(10, ak6Var.mo75928xcd1e8d8());
                this.f454054p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f454045d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f454046e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f454047f;
            if (gVar3 != null) {
                j17 += b36.f.b(3, gVar3);
            }
            java.lang.String str9 = this.f454048g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f454049h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f454050i;
            if (gVar4 != null) {
                e17 += b36.f.b(6, gVar4);
            }
            java.lang.String str10 = this.f454051m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f454052n;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f454053o;
            if (str12 != null) {
                e17 += b36.f.j(9, str12);
            }
            r45.ak6 ak6Var2 = this.f454054p;
            return ak6Var2 != null ? e17 + b36.f.i(10, ak6Var2.mo75928xcd1e8d8()) : e17;
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
        r45.di6 di6Var = (r45.di6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                di6Var.f454045d = aVar2.k(intValue);
                return 0;
            case 2:
                di6Var.f454046e = aVar2.k(intValue);
                return 0;
            case 3:
                di6Var.f454047f = aVar2.d(intValue);
                return 0;
            case 4:
                di6Var.f454048g = aVar2.k(intValue);
                return 0;
            case 5:
                di6Var.f454049h = aVar2.g(intValue);
                return 0;
            case 6:
                di6Var.f454050i = aVar2.d(intValue);
                return 0;
            case 7:
                di6Var.f454051m = aVar2.k(intValue);
                return 0;
            case 8:
                di6Var.f454052n = aVar2.k(intValue);
                return 0;
            case 9:
                di6Var.f454053o = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.ak6 ak6Var3 = new r45.ak6();
                    if (bArr != null && bArr.length > 0) {
                        ak6Var3.mo11468x92b714fd(bArr);
                    }
                    di6Var.f454054p = ak6Var3;
                }
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
            java.lang.String str = this.f454045d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Word", str, false);
            eVar.d(jSONObject, "DocId", this.f454046e, false);
            eVar.d(jSONObject, "DebugInfo", this.f454047f, false);
            eVar.d(jSONObject, "CacheJsonResult", this.f454048g, false);
            eVar.d(jSONObject, "JumpType", java.lang.Integer.valueOf(this.f454049h), false);
            eVar.d(jSONObject, "JumpUrl", this.f454050i, false);
            eVar.d(jSONObject, "Label", this.f454051m, false);
            eVar.d(jSONObject, "ExtInfo", this.f454052n, false);
            eVar.d(jSONObject, "wordHighlight", this.f454053o, false);
            eVar.d(jSONObject, "tagInfo", this.f454054p, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
