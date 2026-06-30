package r45;

/* loaded from: classes15.dex */
public class wn6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470846d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470847e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470848f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470849g;

    /* renamed from: h, reason: collision with root package name */
    public r45.x56 f470850h;

    /* renamed from: i, reason: collision with root package name */
    public long f470851i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470852m;

    /* renamed from: n, reason: collision with root package name */
    public int f470853n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f470854o;

    /* renamed from: p, reason: collision with root package name */
    public int f470855p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f470856q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f470857r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f470858s = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wn6)) {
            return false;
        }
        r45.wn6 wn6Var = (r45.wn6) fVar;
        return n51.f.a(this.f470846d, wn6Var.f470846d) && n51.f.a(this.f470847e, wn6Var.f470847e) && n51.f.a(this.f470848f, wn6Var.f470848f) && n51.f.a(this.f470849g, wn6Var.f470849g) && n51.f.a(this.f470850h, wn6Var.f470850h) && n51.f.a(java.lang.Long.valueOf(this.f470851i), java.lang.Long.valueOf(wn6Var.f470851i)) && n51.f.a(this.f470852m, wn6Var.f470852m) && n51.f.a(java.lang.Integer.valueOf(this.f470853n), java.lang.Integer.valueOf(wn6Var.f470853n)) && n51.f.a(java.lang.Boolean.valueOf(this.f470854o), java.lang.Boolean.valueOf(wn6Var.f470854o)) && n51.f.a(java.lang.Integer.valueOf(this.f470855p), java.lang.Integer.valueOf(wn6Var.f470855p)) && n51.f.a(this.f470856q, wn6Var.f470856q) && n51.f.a(this.f470857r, wn6Var.f470857r) && n51.f.a(this.f470858s, wn6Var.f470858s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470857r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470846d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f470847e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f470848f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f470849g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            r45.x56 x56Var = this.f470850h;
            if (x56Var != null) {
                fVar.i(5, x56Var.mo75928xcd1e8d8());
                this.f470850h.mo75956x3d5d1f78(fVar);
            }
            fVar.h(6, this.f470851i);
            java.lang.String str5 = this.f470852m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f470853n);
            fVar.a(9, this.f470854o);
            fVar.e(10, this.f470855p);
            java.lang.String str6 = this.f470856q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.g(12, 8, linkedList);
            fVar.g(13, 8, this.f470858s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f470846d;
            int j17 = str7 != null ? b36.f.j(1, str7) + 0 : 0;
            java.lang.String str8 = this.f470847e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f470848f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f470849g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            r45.x56 x56Var2 = this.f470850h;
            if (x56Var2 != null) {
                j17 += b36.f.i(5, x56Var2.mo75928xcd1e8d8());
            }
            int h17 = j17 + b36.f.h(6, this.f470851i);
            java.lang.String str11 = this.f470852m;
            if (str11 != null) {
                h17 += b36.f.j(7, str11);
            }
            int e17 = h17 + b36.f.e(8, this.f470853n) + b36.f.a(9, this.f470854o) + b36.f.e(10, this.f470855p);
            java.lang.String str12 = this.f470856q;
            if (str12 != null) {
                e17 += b36.f.j(11, str12);
            }
            return e17 + b36.f.g(12, 8, linkedList) + b36.f.g(13, 8, this.f470858s);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f470858s.clear();
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
        r45.wn6 wn6Var = (r45.wn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wn6Var.f470846d = aVar2.k(intValue);
                return 0;
            case 2:
                wn6Var.f470847e = aVar2.k(intValue);
                return 0;
            case 3:
                wn6Var.f470848f = aVar2.k(intValue);
                return 0;
            case 4:
                wn6Var.f470849g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.x56 x56Var3 = new r45.x56();
                    if (bArr2 != null && bArr2.length > 0) {
                        x56Var3.mo11468x92b714fd(bArr2);
                    }
                    wn6Var.f470850h = x56Var3;
                }
                return 0;
            case 6:
                wn6Var.f470851i = aVar2.i(intValue);
                return 0;
            case 7:
                wn6Var.f470852m = aVar2.k(intValue);
                return 0;
            case 8:
                wn6Var.f470853n = aVar2.g(intValue);
                return 0;
            case 9:
                wn6Var.f470854o = aVar2.c(intValue);
                return 0;
            case 10:
                wn6Var.f470855p = aVar2.g(intValue);
                return 0;
            case 11:
                wn6Var.f470856q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.xn6 xn6Var = new r45.xn6();
                    if (bArr3 != null && bArr3.length > 0) {
                        xn6Var.mo11468x92b714fd(bArr3);
                    }
                    wn6Var.f470857r.add(xn6Var);
                }
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr4 != null && bArr4.length > 0) {
                        x50Var.mo11468x92b714fd(bArr4);
                    }
                    wn6Var.f470858s.add(x50Var);
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
            java.lang.String str = this.f470846d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "relevantVid", str, false);
            eVar.d(jSONObject, "relevantExpand", this.f470847e, false);
            eVar.d(jSONObject, "relevantPreSearchId", this.f470848f, false);
            eVar.d(jSONObject, "relevantSharedOpenID", this.f470849g, false);
            eVar.d(jSONObject, "clickTag", this.f470850h, false);
            eVar.d(jSONObject, "recCategory", java.lang.Long.valueOf(this.f470851i), false);
            eVar.d(jSONObject, "contextId", this.f470852m, false);
            eVar.d(jSONObject, "offset", java.lang.Integer.valueOf(this.f470853n), false);
            eVar.d(jSONObject, "isSinglePage", java.lang.Boolean.valueOf(this.f470854o), false);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f470855p), false);
            eVar.d(jSONObject, "keyword", this.f470856q, false);
            eVar.d(jSONObject, "cacheVideoList", this.f470857r, false);
            eVar.d(jSONObject, "extReqParams", this.f470858s, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
