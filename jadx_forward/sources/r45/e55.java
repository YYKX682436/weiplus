package r45;

/* loaded from: classes2.dex */
public class e55 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454558d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454559e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454560f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454561g;

    /* renamed from: h, reason: collision with root package name */
    public int f454562h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454563i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f454564m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f454565n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f454566o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f454567p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e55)) {
            return false;
        }
        r45.e55 e55Var = (r45.e55) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454558d), java.lang.Integer.valueOf(e55Var.f454558d)) && n51.f.a(this.f454559e, e55Var.f454559e) && n51.f.a(this.f454560f, e55Var.f454560f) && n51.f.a(this.f454561g, e55Var.f454561g) && n51.f.a(java.lang.Integer.valueOf(this.f454562h), java.lang.Integer.valueOf(e55Var.f454562h)) && n51.f.a(this.f454563i, e55Var.f454563i) && n51.f.a(this.f454564m, e55Var.f454564m) && n51.f.a(this.f454565n, e55Var.f454565n) && n51.f.a(this.f454566o, e55Var.f454566o) && n51.f.a(this.f454567p, e55Var.f454567p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454558d);
            java.lang.String str = this.f454559e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f454560f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f454561g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f454562h);
            java.lang.String str4 = this.f454563i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f454564m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f454565n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f454566o;
            if (str7 != null) {
                fVar.j(100, str7);
            }
            java.lang.String str8 = this.f454567p;
            if (str8 != null) {
                fVar.j(101, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454558d) + 0;
            java.lang.String str9 = this.f454559e;
            if (str9 != null) {
                e17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f454560f;
            if (str10 != null) {
                e17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f454561g;
            if (str11 != null) {
                e17 += b36.f.j(4, str11);
            }
            int e18 = e17 + b36.f.e(5, this.f454562h);
            java.lang.String str12 = this.f454563i;
            if (str12 != null) {
                e18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f454564m;
            if (str13 != null) {
                e18 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f454565n;
            if (str14 != null) {
                e18 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f454566o;
            if (str15 != null) {
                e18 += b36.f.j(100, str15);
            }
            java.lang.String str16 = this.f454567p;
            return str16 != null ? e18 + b36.f.j(101, str16) : e18;
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
        r45.e55 e55Var = (r45.e55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            e55Var.f454566o = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 101) {
            e55Var.f454567p = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                e55Var.f454558d = aVar2.g(intValue);
                return 0;
            case 2:
                e55Var.f454559e = aVar2.k(intValue);
                return 0;
            case 3:
                e55Var.f454560f = aVar2.k(intValue);
                return 0;
            case 4:
                e55Var.f454561g = aVar2.k(intValue);
                return 0;
            case 5:
                e55Var.f454562h = aVar2.g(intValue);
                return 0;
            case 6:
                e55Var.f454563i = aVar2.k(intValue);
                return 0;
            case 7:
                e55Var.f454564m = aVar2.k(intValue);
                return 0;
            case 8:
                e55Var.f454565n = aVar2.k(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f454558d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "ActionType", valueOf, false);
            eVar.d(jSONObject, "JumpUrl", this.f454559e, false);
            eVar.d(jSONObject, "UserName", this.f454560f, false);
            eVar.d(jSONObject, "WeappPath", this.f454561g, false);
            eVar.d(jSONObject, "WeappVersion", java.lang.Integer.valueOf(this.f454562h), false);
            eVar.d(jSONObject, "SceneNote", this.f454563i, false);
            eVar.d(jSONObject, "CtrlInfo", this.f454564m, false);
            eVar.d(jSONObject, "MusicObjectXmlDesc", this.f454565n, false);
            eVar.d(jSONObject, "query", this.f454566o, false);
            eVar.d(jSONObject, "extParamStr", this.f454567p, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
