package r45;

/* loaded from: classes12.dex */
public class g55 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456422d;

    /* renamed from: e, reason: collision with root package name */
    public r45.e64 f456423e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456424f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456425g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456426h;

    /* renamed from: i, reason: collision with root package name */
    public int f456427i;

    /* renamed from: m, reason: collision with root package name */
    public int f456428m;

    /* renamed from: n, reason: collision with root package name */
    public int f456429n;

    /* renamed from: o, reason: collision with root package name */
    public int f456430o;

    /* renamed from: p, reason: collision with root package name */
    public int f456431p;

    /* renamed from: q, reason: collision with root package name */
    public r45.j30 f456432q;

    /* renamed from: r, reason: collision with root package name */
    public int f456433r;

    /* renamed from: s, reason: collision with root package name */
    public int f456434s;

    /* renamed from: t, reason: collision with root package name */
    public r45.b40 f456435t;

    /* renamed from: w, reason: collision with root package name */
    public r45.cw5 f456438w;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f456436u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f456437v = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f456439x = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g55)) {
            return false;
        }
        r45.g55 g55Var = (r45.g55) fVar;
        return n51.f.a(this.f456422d, g55Var.f456422d) && n51.f.a(this.f456423e, g55Var.f456423e) && n51.f.a(this.f456424f, g55Var.f456424f) && n51.f.a(this.f456425g, g55Var.f456425g) && n51.f.a(this.f456426h, g55Var.f456426h) && n51.f.a(java.lang.Integer.valueOf(this.f456427i), java.lang.Integer.valueOf(g55Var.f456427i)) && n51.f.a(java.lang.Integer.valueOf(this.f456428m), java.lang.Integer.valueOf(g55Var.f456428m)) && n51.f.a(java.lang.Integer.valueOf(this.f456429n), java.lang.Integer.valueOf(g55Var.f456429n)) && n51.f.a(java.lang.Integer.valueOf(this.f456430o), java.lang.Integer.valueOf(g55Var.f456430o)) && n51.f.a(java.lang.Integer.valueOf(this.f456431p), java.lang.Integer.valueOf(g55Var.f456431p)) && n51.f.a(this.f456432q, g55Var.f456432q) && n51.f.a(java.lang.Integer.valueOf(this.f456433r), java.lang.Integer.valueOf(g55Var.f456433r)) && n51.f.a(java.lang.Integer.valueOf(this.f456434s), java.lang.Integer.valueOf(g55Var.f456434s)) && n51.f.a(this.f456435t, g55Var.f456435t) && n51.f.a(this.f456436u, g55Var.f456436u) && n51.f.a(this.f456437v, g55Var.f456437v) && n51.f.a(this.f456438w, g55Var.f456438w) && n51.f.a(this.f456439x, g55Var.f456439x);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f456436u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456422d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.e64 e64Var = this.f456423e;
            if (e64Var != null) {
                fVar.i(2, e64Var.mo75928xcd1e8d8());
                this.f456423e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f456424f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f456425g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f456426h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f456427i);
            fVar.e(7, this.f456428m);
            fVar.e(8, this.f456429n);
            fVar.e(9, this.f456430o);
            fVar.e(10, this.f456431p);
            r45.j30 j30Var = this.f456432q;
            if (j30Var != null) {
                fVar.i(11, j30Var.mo75928xcd1e8d8());
                this.f456432q.mo75956x3d5d1f78(fVar);
            }
            fVar.e(12, this.f456433r);
            fVar.e(13, this.f456434s);
            r45.b40 b40Var = this.f456435t;
            if (b40Var != null) {
                fVar.i(14, b40Var.mo75928xcd1e8d8());
                this.f456435t.mo75956x3d5d1f78(fVar);
            }
            fVar.g(15, 8, linkedList);
            fVar.g(16, 8, this.f456437v);
            r45.cw5 cw5Var = this.f456438w;
            if (cw5Var != null) {
                fVar.i(17, cw5Var.mo75928xcd1e8d8());
                this.f456438w.mo75956x3d5d1f78(fVar);
            }
            fVar.g(18, 8, this.f456439x);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f456422d;
            int j17 = str5 != null ? b36.f.j(1, str5) + 0 : 0;
            r45.e64 e64Var2 = this.f456423e;
            if (e64Var2 != null) {
                j17 += b36.f.i(2, e64Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f456424f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f456425g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f456426h;
            if (str8 != null) {
                j17 += b36.f.j(5, str8);
            }
            int e17 = j17 + b36.f.e(6, this.f456427i) + b36.f.e(7, this.f456428m) + b36.f.e(8, this.f456429n) + b36.f.e(9, this.f456430o) + b36.f.e(10, this.f456431p);
            r45.j30 j30Var2 = this.f456432q;
            if (j30Var2 != null) {
                e17 += b36.f.i(11, j30Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(12, this.f456433r) + b36.f.e(13, this.f456434s);
            r45.b40 b40Var2 = this.f456435t;
            if (b40Var2 != null) {
                e18 += b36.f.i(14, b40Var2.mo75928xcd1e8d8());
            }
            int g17 = e18 + b36.f.g(15, 8, linkedList) + b36.f.g(16, 8, this.f456437v);
            r45.cw5 cw5Var2 = this.f456438w;
            if (cw5Var2 != null) {
                g17 += b36.f.i(17, cw5Var2.mo75928xcd1e8d8());
            }
            return g17 + b36.f.g(18, 8, this.f456439x);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f456437v.clear();
            this.f456439x.clear();
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
        r45.g55 g55Var = (r45.g55) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g55Var.f456422d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.e64 e64Var3 = new r45.e64();
                    if (bArr2 != null && bArr2.length > 0) {
                        e64Var3.mo11468x92b714fd(bArr2);
                    }
                    g55Var.f456423e = e64Var3;
                }
                return 0;
            case 3:
                g55Var.f456424f = aVar2.k(intValue);
                return 0;
            case 4:
                g55Var.f456425g = aVar2.k(intValue);
                return 0;
            case 5:
                g55Var.f456426h = aVar2.k(intValue);
                return 0;
            case 6:
                g55Var.f456427i = aVar2.g(intValue);
                return 0;
            case 7:
                g55Var.f456428m = aVar2.g(intValue);
                return 0;
            case 8:
                g55Var.f456429n = aVar2.g(intValue);
                return 0;
            case 9:
                g55Var.f456430o = aVar2.g(intValue);
                return 0;
            case 10:
                g55Var.f456431p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.j30 j30Var3 = new r45.j30();
                    if (bArr3 != null && bArr3.length > 0) {
                        j30Var3.mo11468x92b714fd(bArr3);
                    }
                    g55Var.f456432q = j30Var3;
                }
                return 0;
            case 12:
                g55Var.f456433r = aVar2.g(intValue);
                return 0;
            case 13:
                g55Var.f456434s = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.b40 b40Var3 = new r45.b40();
                    if (bArr4 != null && bArr4.length > 0) {
                        b40Var3.mo11468x92b714fd(bArr4);
                    }
                    g55Var.f456435t = b40Var3;
                }
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr5 != null && bArr5.length > 0) {
                        x50Var.mo11468x92b714fd(bArr5);
                    }
                    g55Var.f456436u.add(x50Var);
                }
                return 0;
            case 16:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j29.get(i29);
                    r45.cw5 cw5Var3 = new r45.cw5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cw5Var3.mo11468x92b714fd(bArr6);
                    }
                    g55Var.f456437v.add(cw5Var3);
                }
                return 0;
            case 17:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j37.get(i37);
                    r45.cw5 cw5Var4 = new r45.cw5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cw5Var4.mo11468x92b714fd(bArr7);
                    }
                    g55Var.f456438w = cw5Var4;
                }
                return 0;
            case 18:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size7 = j38.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j38.get(i38);
                    r45.ei6 ei6Var = new r45.ei6();
                    if (bArr8 != null && bArr8.length > 0) {
                        ei6Var.mo11468x92b714fd(bArr8);
                    }
                    g55Var.f456439x.add(ei6Var);
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
            java.lang.String str = this.f456422d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Query", str, false);
            eVar.d(jSONObject, "Location", this.f456423e, false);
            eVar.d(jSONObject, "SessionId", this.f456424f, false);
            eVar.d(jSONObject, "RequestId", this.f456425g, false);
            eVar.d(jSONObject, "Source", this.f456426h, false);
            eVar.d(jSONObject, "PardusSwitch", java.lang.Integer.valueOf(this.f456427i), false);
            eVar.d(jSONObject, "H5Version", java.lang.Integer.valueOf(this.f456428m), false);
            eVar.d(jSONObject, "DarkMode", java.lang.Integer.valueOf(this.f456429n), false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f456430o), false);
            eVar.d(jSONObject, "BusinessType", java.lang.Integer.valueOf(this.f456431p), false);
            eVar.d(jSONObject, "ChildMode", this.f456432q, false);
            eVar.d(jSONObject, "WebSearchH5Version", java.lang.Integer.valueOf(this.f456433r), false);
            eVar.d(jSONObject, "ActionType", java.lang.Integer.valueOf(this.f456434s), false);
            eVar.d(jSONObject, "ClickContext", this.f456435t, false);
            eVar.d(jSONObject, "ExtReqParams", this.f456436u, false);
            eVar.d(jSONObject, "SearchClickHistory", this.f456437v, false);
            eVar.d(jSONObject, "PrefixLocalClickInfo", this.f456438w, false);
            eVar.d(jSONObject, "SugPrefixSequence", this.f456439x, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
