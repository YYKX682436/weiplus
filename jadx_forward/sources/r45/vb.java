package r45;

/* loaded from: classes7.dex */
public class vb extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469591d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469592e;

    /* renamed from: f, reason: collision with root package name */
    public int f469593f;

    /* renamed from: g, reason: collision with root package name */
    public r45.sv6 f469594g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469595h;

    /* renamed from: i, reason: collision with root package name */
    public r45.mv5 f469596i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469597m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f469598n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f469599o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f469600p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vb)) {
            return false;
        }
        r45.vb vbVar = (r45.vb) fVar;
        return n51.f.a(this.f469591d, vbVar.f469591d) && n51.f.a(this.f469592e, vbVar.f469592e) && n51.f.a(java.lang.Integer.valueOf(this.f469593f), java.lang.Integer.valueOf(vbVar.f469593f)) && n51.f.a(this.f469594g, vbVar.f469594g) && n51.f.a(this.f469595h, vbVar.f469595h) && n51.f.a(this.f469596i, vbVar.f469596i) && n51.f.a(this.f469597m, vbVar.f469597m) && n51.f.a(this.f469598n, vbVar.f469598n) && n51.f.a(this.f469599o, vbVar.f469599o) && n51.f.a(this.f469600p, vbVar.f469600p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469591d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469592e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f469593f);
            r45.sv6 sv6Var = this.f469594g;
            if (sv6Var != null) {
                fVar.i(4, sv6Var.mo75928xcd1e8d8());
                this.f469594g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f469595h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.mv5 mv5Var = this.f469596i;
            if (mv5Var != null) {
                fVar.i(6, mv5Var.mo75928xcd1e8d8());
                this.f469596i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f469597m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f469598n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f469599o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f469600p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f469591d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f469592e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int e17 = j17 + b36.f.e(3, this.f469593f);
            r45.sv6 sv6Var2 = this.f469594g;
            if (sv6Var2 != null) {
                e17 += b36.f.i(4, sv6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f469595h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            r45.mv5 mv5Var2 = this.f469596i;
            if (mv5Var2 != null) {
                e17 += b36.f.i(6, mv5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str11 = this.f469597m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f469598n;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f469599o;
            if (str13 != null) {
                e17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f469600p;
            return str14 != null ? e17 + b36.f.j(10, str14) : e17;
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
        r45.vb vbVar = (r45.vb) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vbVar.f469591d = aVar2.k(intValue);
                return 0;
            case 2:
                vbVar.f469592e = aVar2.k(intValue);
                return 0;
            case 3:
                vbVar.f469593f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.sv6 sv6Var3 = new r45.sv6();
                    if (bArr != null && bArr.length > 0) {
                        sv6Var3.mo11468x92b714fd(bArr);
                    }
                    vbVar.f469594g = sv6Var3;
                }
                return 0;
            case 5:
                vbVar.f469595h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.mv5 mv5Var3 = new r45.mv5();
                    if (bArr2 != null && bArr2.length > 0) {
                        mv5Var3.mo11468x92b714fd(bArr2);
                    }
                    vbVar.f469596i = mv5Var3;
                }
                return 0;
            case 7:
                vbVar.f469597m = aVar2.k(intValue);
                return 0;
            case 8:
                vbVar.f469598n = aVar2.k(intValue);
                return 0;
            case 9:
                vbVar.f469599o = aVar2.k(intValue);
                return 0;
            case 10:
                vbVar.f469600p = aVar2.k(intValue);
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
            java.lang.String str = this.f469591d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "scope", str, false);
            eVar.d(jSONObject, "scopeDesc", this.f469592e, false);
            eVar.d(jSONObject, "state", java.lang.Integer.valueOf(this.f469593f), false);
            eVar.d(jSONObject, "userAvatarInfo", this.f469594g, false);
            eVar.d(jSONObject, "scope_sub_desc", this.f469595h, false);
            eVar.d(jSONObject, "risk_popup_info", this.f469596i, false);
            eVar.d(jSONObject, "auth_wording", this.f469597m, false);
            eVar.d(jSONObject, "bottom_desc", this.f469598n, false);
            eVar.d(jSONObject, "scope_sec_desc", this.f469599o, false);
            eVar.d(jSONObject, "item_title", this.f469600p, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
