package r45;

/* loaded from: classes8.dex */
public class ck6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453155d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453156e;

    /* renamed from: f, reason: collision with root package name */
    public int f453157f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453158g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453159h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f453160i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f453161m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f453162n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f453163o;

    /* renamed from: p, reason: collision with root package name */
    public int f453164p;

    /* renamed from: q, reason: collision with root package name */
    public int f453165q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ck6)) {
            return false;
        }
        r45.ck6 ck6Var = (r45.ck6) fVar;
        return n51.f.a(this.f453155d, ck6Var.f453155d) && n51.f.a(this.f453156e, ck6Var.f453156e) && n51.f.a(java.lang.Integer.valueOf(this.f453157f), java.lang.Integer.valueOf(ck6Var.f453157f)) && n51.f.a(this.f453158g, ck6Var.f453158g) && n51.f.a(this.f453159h, ck6Var.f453159h) && n51.f.a(this.f453160i, ck6Var.f453160i) && n51.f.a(this.f453161m, ck6Var.f453161m) && n51.f.a(this.f453162n, ck6Var.f453162n) && n51.f.a(this.f453163o, ck6Var.f453163o) && n51.f.a(java.lang.Integer.valueOf(this.f453164p), java.lang.Integer.valueOf(ck6Var.f453164p)) && n51.f.a(java.lang.Integer.valueOf(this.f453165q), java.lang.Integer.valueOf(ck6Var.f453165q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f453161m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453155d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f453156e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f453157f);
            java.lang.String str3 = this.f453158g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f453159h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f453160i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.g(7, 8, linkedList);
            java.lang.String str6 = this.f453162n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f453163o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.e(10, this.f453164p);
            fVar.e(11, this.f453165q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f453155d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f453156e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int e17 = j17 + b36.f.e(3, this.f453157f);
            java.lang.String str10 = this.f453158g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f453159h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f453160i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            int g17 = e17 + b36.f.g(7, 8, linkedList);
            java.lang.String str13 = this.f453162n;
            if (str13 != null) {
                g17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f453163o;
            if (str14 != null) {
                g17 += b36.f.j(9, str14);
            }
            return g17 + b36.f.e(10, this.f453164p) + b36.f.e(11, this.f453165q);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.ck6 ck6Var = (r45.ck6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ck6Var.f453155d = aVar2.k(intValue);
                return 0;
            case 2:
                ck6Var.f453156e = aVar2.k(intValue);
                return 0;
            case 3:
                ck6Var.f453157f = aVar2.g(intValue);
                return 0;
            case 4:
                ck6Var.f453158g = aVar2.k(intValue);
                return 0;
            case 5:
                ck6Var.f453159h = aVar2.k(intValue);
                return 0;
            case 6:
                ck6Var.f453160i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr2 != null && bArr2.length > 0) {
                        x50Var.mo11468x92b714fd(bArr2);
                    }
                    ck6Var.f453161m.add(x50Var);
                }
                return 0;
            case 8:
                ck6Var.f453162n = aVar2.k(intValue);
                return 0;
            case 9:
                ck6Var.f453163o = aVar2.k(intValue);
                return 0;
            case 10:
                ck6Var.f453164p = aVar2.g(intValue);
                return 0;
            case 11:
                ck6Var.f453165q = aVar2.g(intValue);
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
            java.lang.String str = this.f453155d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "searchId", str, false);
            eVar.d(jSONObject, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f453156e, false);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f453157f), false);
            eVar.d(jSONObject, "url", this.f453158g, false);
            eVar.d(jSONObject, "requestId", this.f453159h, false);
            eVar.d(jSONObject, "keyword", this.f453160i, false);
            eVar.d(jSONObject, "extReqParams", this.f453161m, false);
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f453162n, false);
            eVar.d(jSONObject, "talker", this.f453163o, false);
            eVar.d(jSONObject, "enterType", java.lang.Integer.valueOf(this.f453164p), false);
            eVar.d(jSONObject, "dismissType", java.lang.Integer.valueOf(this.f453165q), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
