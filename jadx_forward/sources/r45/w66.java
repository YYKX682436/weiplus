package r45;

/* loaded from: classes8.dex */
public class w66 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470441d;

    /* renamed from: e, reason: collision with root package name */
    public int f470442e;

    /* renamed from: f, reason: collision with root package name */
    public int f470443f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470444g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470445h;

    /* renamed from: i, reason: collision with root package name */
    public int f470446i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470447m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470448n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w66)) {
            return false;
        }
        r45.w66 w66Var = (r45.w66) fVar;
        return n51.f.a(this.f76492x92037252, w66Var.f76492x92037252) && n51.f.a(this.f470441d, w66Var.f470441d) && n51.f.a(java.lang.Integer.valueOf(this.f470442e), java.lang.Integer.valueOf(w66Var.f470442e)) && n51.f.a(java.lang.Integer.valueOf(this.f470443f), java.lang.Integer.valueOf(w66Var.f470443f)) && n51.f.a(this.f470444g, w66Var.f470444g) && n51.f.a(this.f470445h, w66Var.f470445h) && n51.f.a(java.lang.Integer.valueOf(this.f470446i), java.lang.Integer.valueOf(w66Var.f470446i)) && n51.f.a(this.f470447m, w66Var.f470447m) && n51.f.a(this.f470448n, w66Var.f470448n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f470441d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f470442e);
            fVar.e(4, this.f470443f);
            java.lang.String str2 = this.f470444g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f470445h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f470446i);
            java.lang.String str4 = this.f470447m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470448n;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f470441d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f470442e) + b36.f.e(4, this.f470443f);
            java.lang.String str6 = this.f470444g;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f470445h;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            int e18 = e17 + b36.f.e(7, this.f470446i);
            java.lang.String str8 = this.f470447m;
            if (str8 != null) {
                e18 += b36.f.j(8, str8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470448n;
            return gVar2 != null ? e18 + b36.f.b(9, gVar2) : e18;
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
        r45.w66 w66Var = (r45.w66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    w66Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                w66Var.f470441d = aVar2.k(intValue);
                return 0;
            case 3:
                w66Var.f470442e = aVar2.g(intValue);
                return 0;
            case 4:
                w66Var.f470443f = aVar2.g(intValue);
                return 0;
            case 5:
                w66Var.f470444g = aVar2.k(intValue);
                return 0;
            case 6:
                w66Var.f470445h = aVar2.k(intValue);
                return 0;
            case 7:
                w66Var.f470446i = aVar2.g(intValue);
                return 0;
            case 8:
                w66Var.f470447m = aVar2.k(intValue);
                return 0;
            case 9:
                w66Var.f470448n = aVar2.d(intValue);
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
            r45.ie ieVar = this.f76492x92037252;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "PickedWord", this.f470441d, false);
            eVar.d(jSONObject, "PrefixOffset", java.lang.Integer.valueOf(this.f470442e), false);
            eVar.d(jSONObject, "SuffixOffset", java.lang.Integer.valueOf(this.f470443f), false);
            eVar.d(jSONObject, "PrefixText", this.f470444g, false);
            eVar.d(jSONObject, "SuffixText", this.f470445h, false);
            eVar.d(jSONObject, "PickedType", java.lang.Integer.valueOf(this.f470446i), false);
            eVar.d(jSONObject, "SearchId", this.f470447m, false);
            eVar.d(jSONObject, "ExtQueryInfo", this.f470448n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
