package r45;

/* loaded from: classes8.dex */
public class v66 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469471d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469472e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469473f;

    /* renamed from: g, reason: collision with root package name */
    public int f469474g;

    /* renamed from: h, reason: collision with root package name */
    public int f469475h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469476i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469477m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f469478n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f469479o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f469480p;

    /* renamed from: q, reason: collision with root package name */
    public int f469481q;

    /* renamed from: r, reason: collision with root package name */
    public int f469482r;

    /* renamed from: s, reason: collision with root package name */
    public int f469483s;

    /* renamed from: t, reason: collision with root package name */
    public int f469484t;

    /* renamed from: u, reason: collision with root package name */
    public int f469485u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v66)) {
            return false;
        }
        r45.v66 v66Var = (r45.v66) fVar;
        return n51.f.a(this.f469471d, v66Var.f469471d) && n51.f.a(this.f469472e, v66Var.f469472e) && n51.f.a(this.f469473f, v66Var.f469473f) && n51.f.a(java.lang.Integer.valueOf(this.f469474g), java.lang.Integer.valueOf(v66Var.f469474g)) && n51.f.a(java.lang.Integer.valueOf(this.f469475h), java.lang.Integer.valueOf(v66Var.f469475h)) && n51.f.a(this.f469476i, v66Var.f469476i) && n51.f.a(this.f469477m, v66Var.f469477m) && n51.f.a(this.f469478n, v66Var.f469478n) && n51.f.a(this.f469479o, v66Var.f469479o) && n51.f.a(this.f469480p, v66Var.f469480p) && n51.f.a(java.lang.Integer.valueOf(this.f469481q), java.lang.Integer.valueOf(v66Var.f469481q)) && n51.f.a(java.lang.Integer.valueOf(this.f469482r), java.lang.Integer.valueOf(v66Var.f469482r)) && n51.f.a(java.lang.Integer.valueOf(this.f469483s), java.lang.Integer.valueOf(v66Var.f469483s)) && n51.f.a(java.lang.Integer.valueOf(this.f469484t), java.lang.Integer.valueOf(v66Var.f469484t)) && n51.f.a(java.lang.Integer.valueOf(this.f469485u), java.lang.Integer.valueOf(v66Var.f469485u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469471d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469472e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f469473f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f469474g);
            fVar.e(5, this.f469475h);
            java.lang.String str4 = this.f469476i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f469477m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f469478n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f469479o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f469480p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            fVar.e(11, this.f469481q);
            fVar.e(12, this.f469482r);
            fVar.e(13, this.f469483s);
            fVar.e(14, this.f469484t);
            fVar.e(15, this.f469485u);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f469471d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f469472e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f469473f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            int e17 = j17 + b36.f.e(4, this.f469474g) + b36.f.e(5, this.f469475h);
            java.lang.String str12 = this.f469476i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f469477m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f469478n;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f469479o;
            if (str15 != null) {
                e17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f469480p;
            if (str16 != null) {
                e17 += b36.f.j(10, str16);
            }
            return e17 + b36.f.e(11, this.f469481q) + b36.f.e(12, this.f469482r) + b36.f.e(13, this.f469483s) + b36.f.e(14, this.f469484t) + b36.f.e(15, this.f469485u);
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
        r45.v66 v66Var = (r45.v66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v66Var.f469471d = aVar2.k(intValue);
                return 0;
            case 2:
                v66Var.f469472e = aVar2.k(intValue);
                return 0;
            case 3:
                v66Var.f469473f = aVar2.k(intValue);
                return 0;
            case 4:
                v66Var.f469474g = aVar2.g(intValue);
                return 0;
            case 5:
                v66Var.f469475h = aVar2.g(intValue);
                return 0;
            case 6:
                v66Var.f469476i = aVar2.k(intValue);
                return 0;
            case 7:
                v66Var.f469477m = aVar2.k(intValue);
                return 0;
            case 8:
                v66Var.f469478n = aVar2.k(intValue);
                return 0;
            case 9:
                v66Var.f469479o = aVar2.k(intValue);
                return 0;
            case 10:
                v66Var.f469480p = aVar2.k(intValue);
                return 0;
            case 11:
                v66Var.f469481q = aVar2.g(intValue);
                return 0;
            case 12:
                v66Var.f469482r = aVar2.g(intValue);
                return 0;
            case 13:
                v66Var.f469483s = aVar2.g(intValue);
                return 0;
            case 14:
                v66Var.f469484t = aVar2.g(intValue);
                return 0;
            case 15:
                v66Var.f469485u = aVar2.g(intValue);
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
            java.lang.String str = this.f469471d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "PickedWord", str, false);
            eVar.d(jSONObject, "PrefixText", this.f469472e, false);
            eVar.d(jSONObject, "SuffixText", this.f469473f, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f469474g), false);
            eVar.d(jSONObject, "MainIndex", java.lang.Integer.valueOf(this.f469475h), false);
            eVar.d(jSONObject, "Url", this.f469476i, false);
            eVar.d(jSONObject, "Title", this.f469477m, false);
            eVar.d(jSONObject, "SubPickedWord", this.f469478n, false);
            eVar.d(jSONObject, "SubPrefixText", this.f469479o, false);
            eVar.d(jSONObject, "SubSuffixText", this.f469480p, false);
            eVar.d(jSONObject, "SubIndex", java.lang.Integer.valueOf(this.f469481q), false);
            eVar.d(jSONObject, "TagNewLineBefore", java.lang.Integer.valueOf(this.f469482r), false);
            eVar.d(jSONObject, "TagNewLineAfter", java.lang.Integer.valueOf(this.f469483s), false);
            eVar.d(jSONObject, "TagNewLineBeforeSub", java.lang.Integer.valueOf(this.f469484t), false);
            eVar.d(jSONObject, "TagNewLineAfterSub", java.lang.Integer.valueOf(this.f469485u), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
