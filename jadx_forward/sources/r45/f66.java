package r45;

/* loaded from: classes2.dex */
public class f66 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455589d;

    /* renamed from: e, reason: collision with root package name */
    public int f455590e;

    /* renamed from: f, reason: collision with root package name */
    public int f455591f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455592g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455593h;

    /* renamed from: i, reason: collision with root package name */
    public int f455594i;

    /* renamed from: m, reason: collision with root package name */
    public r45.e64 f455595m;

    /* renamed from: n, reason: collision with root package name */
    public int f455596n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f455597o;

    /* renamed from: p, reason: collision with root package name */
    public int f455598p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f455599q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f455600r;

    /* renamed from: s, reason: collision with root package name */
    public r45.j30 f455601s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f66)) {
            return false;
        }
        r45.f66 f66Var = (r45.f66) fVar;
        return n51.f.a(this.f455589d, f66Var.f455589d) && n51.f.a(java.lang.Integer.valueOf(this.f455590e), java.lang.Integer.valueOf(f66Var.f455590e)) && n51.f.a(java.lang.Integer.valueOf(this.f455591f), java.lang.Integer.valueOf(f66Var.f455591f)) && n51.f.a(this.f455592g, f66Var.f455592g) && n51.f.a(this.f455593h, f66Var.f455593h) && n51.f.a(java.lang.Integer.valueOf(this.f455594i), java.lang.Integer.valueOf(f66Var.f455594i)) && n51.f.a(this.f455595m, f66Var.f455595m) && n51.f.a(java.lang.Integer.valueOf(this.f455596n), java.lang.Integer.valueOf(f66Var.f455596n)) && n51.f.a(this.f455597o, f66Var.f455597o) && n51.f.a(java.lang.Integer.valueOf(this.f455598p), java.lang.Integer.valueOf(f66Var.f455598p)) && n51.f.a(this.f455599q, f66Var.f455599q) && n51.f.a(this.f455600r, f66Var.f455600r) && n51.f.a(this.f455601s, f66Var.f455601s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f455589d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f455590e);
            fVar.e(3, this.f455591f);
            java.lang.String str2 = this.f455592g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f455593h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f455594i);
            r45.e64 e64Var = this.f455595m;
            if (e64Var != null) {
                fVar.i(7, e64Var.mo75928xcd1e8d8());
                this.f455595m.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f455596n);
            java.lang.String str4 = this.f455597o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f455598p);
            java.lang.String str5 = this.f455599q;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f455600r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            r45.j30 j30Var = this.f455601s;
            if (j30Var == null) {
                return 0;
            }
            fVar.i(13, j30Var.mo75928xcd1e8d8());
            this.f455601s.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f455589d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f455590e) + b36.f.e(3, this.f455591f);
            java.lang.String str8 = this.f455592g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f455593h;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            int e17 = j17 + b36.f.e(6, this.f455594i);
            r45.e64 e64Var2 = this.f455595m;
            if (e64Var2 != null) {
                e17 += b36.f.i(7, e64Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(8, this.f455596n);
            java.lang.String str10 = this.f455597o;
            if (str10 != null) {
                e18 += b36.f.j(9, str10);
            }
            int e19 = e18 + b36.f.e(10, this.f455598p);
            java.lang.String str11 = this.f455599q;
            if (str11 != null) {
                e19 += b36.f.j(11, str11);
            }
            java.lang.String str12 = this.f455600r;
            if (str12 != null) {
                e19 += b36.f.j(12, str12);
            }
            r45.j30 j30Var2 = this.f455601s;
            return j30Var2 != null ? e19 + b36.f.i(13, j30Var2.mo75928xcd1e8d8()) : e19;
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
        r45.f66 f66Var = (r45.f66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                f66Var.f455589d = aVar2.k(intValue);
                return 0;
            case 2:
                f66Var.f455590e = aVar2.g(intValue);
                return 0;
            case 3:
                f66Var.f455591f = aVar2.g(intValue);
                return 0;
            case 4:
                f66Var.f455592g = aVar2.k(intValue);
                return 0;
            case 5:
                f66Var.f455593h = aVar2.k(intValue);
                return 0;
            case 6:
                f66Var.f455594i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.e64 e64Var3 = new r45.e64();
                    if (bArr != null && bArr.length > 0) {
                        e64Var3.mo11468x92b714fd(bArr);
                    }
                    f66Var.f455595m = e64Var3;
                }
                return 0;
            case 8:
                f66Var.f455596n = aVar2.g(intValue);
                return 0;
            case 9:
                f66Var.f455597o = aVar2.k(intValue);
                return 0;
            case 10:
                f66Var.f455598p = aVar2.g(intValue);
                return 0;
            case 11:
                f66Var.f455599q = aVar2.k(intValue);
                return 0;
            case 12:
                f66Var.f455600r = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.j30 j30Var3 = new r45.j30();
                    if (bArr2 != null && bArr2.length > 0) {
                        j30Var3.mo11468x92b714fd(bArr2);
                    }
                    f66Var.f455601s = j30Var3;
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
            java.lang.String str = this.f455589d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Md5", str, false);
            eVar.d(jSONObject, "Offset", java.lang.Integer.valueOf(this.f455590e), false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f455591f), false);
            eVar.d(jSONObject, "SearchId", this.f455592g, false);
            eVar.d(jSONObject, "SessionId", this.f455593h, false);
            eVar.d(jSONObject, "H5Version", java.lang.Integer.valueOf(this.f455594i), false);
            eVar.d(jSONObject, "Location", this.f455595m, false);
            eVar.d(jSONObject, "Tab", java.lang.Integer.valueOf(this.f455596n), false);
            eVar.d(jSONObject, "RequestId", this.f455597o, false);
            eVar.d(jSONObject, "RequestType", java.lang.Integer.valueOf(this.f455598p), false);
            eVar.d(jSONObject, "EmojiUrl", this.f455599q, false);
            eVar.d(jSONObject, "AesKey", this.f455600r, false);
            eVar.d(jSONObject, "ChildMode", this.f455601s, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
