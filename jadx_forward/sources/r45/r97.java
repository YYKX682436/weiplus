package r45;

/* loaded from: classes8.dex */
public class r97 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public int A;
    public boolean B;
    public int C;
    public int D;
    public java.lang.String E;

    /* renamed from: d, reason: collision with root package name */
    public int f466196d;

    /* renamed from: e, reason: collision with root package name */
    public int f466197e;

    /* renamed from: f, reason: collision with root package name */
    public int f466198f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466199g;

    /* renamed from: h, reason: collision with root package name */
    public r45.e64 f466200h;

    /* renamed from: i, reason: collision with root package name */
    public int f466201i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f466202m;

    /* renamed from: n, reason: collision with root package name */
    public int f466203n;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f466206q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f466207r;

    /* renamed from: s, reason: collision with root package name */
    public int f466208s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f466209t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f466210u;

    /* renamed from: w, reason: collision with root package name */
    public int f466212w;

    /* renamed from: x, reason: collision with root package name */
    public int f466213x;

    /* renamed from: y, reason: collision with root package name */
    public int f466214y;

    /* renamed from: z, reason: collision with root package name */
    public r45.o33 f466215z;

    /* renamed from: o, reason: collision with root package name */
    public int f466204o = 2;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f466205p = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f466211v = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r97)) {
            return false;
        }
        r45.r97 r97Var = (r45.r97) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f466196d), java.lang.Integer.valueOf(r97Var.f466196d)) && n51.f.a(java.lang.Integer.valueOf(this.f466197e), java.lang.Integer.valueOf(r97Var.f466197e)) && n51.f.a(java.lang.Integer.valueOf(this.f466198f), java.lang.Integer.valueOf(r97Var.f466198f)) && n51.f.a(this.f466199g, r97Var.f466199g) && n51.f.a(this.f466200h, r97Var.f466200h) && n51.f.a(java.lang.Integer.valueOf(this.f466201i), java.lang.Integer.valueOf(r97Var.f466201i)) && n51.f.a(this.f466202m, r97Var.f466202m) && n51.f.a(java.lang.Integer.valueOf(this.f466203n), java.lang.Integer.valueOf(r97Var.f466203n)) && n51.f.a(java.lang.Integer.valueOf(this.f466204o), java.lang.Integer.valueOf(r97Var.f466204o)) && n51.f.a(this.f466205p, r97Var.f466205p) && n51.f.a(this.f466206q, r97Var.f466206q) && n51.f.a(this.f466207r, r97Var.f466207r) && n51.f.a(java.lang.Integer.valueOf(this.f466208s), java.lang.Integer.valueOf(r97Var.f466208s)) && n51.f.a(this.f466209t, r97Var.f466209t) && n51.f.a(this.f466210u, r97Var.f466210u) && n51.f.a(this.f466211v, r97Var.f466211v) && n51.f.a(java.lang.Integer.valueOf(this.f466212w), java.lang.Integer.valueOf(r97Var.f466212w)) && n51.f.a(java.lang.Integer.valueOf(this.f466213x), java.lang.Integer.valueOf(r97Var.f466213x)) && n51.f.a(java.lang.Integer.valueOf(this.f466214y), java.lang.Integer.valueOf(r97Var.f466214y)) && n51.f.a(this.f466215z, r97Var.f466215z) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(r97Var.A)) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(r97Var.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(r97Var.C)) && n51.f.a(java.lang.Integer.valueOf(this.D), java.lang.Integer.valueOf(r97Var.D)) && n51.f.a(this.E, r97Var.E);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466205p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f466196d);
            fVar.e(2, this.f466197e);
            fVar.e(3, this.f466198f);
            java.lang.String str = this.f466199g;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.e64 e64Var = this.f466200h;
            if (e64Var != null) {
                fVar.i(5, e64Var.mo75928xcd1e8d8());
                this.f466200h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f466201i);
            java.lang.String str2 = this.f466202m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f466203n);
            fVar.e(9, this.f466204o);
            fVar.g(10, 8, linkedList);
            java.lang.String str3 = this.f466206q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f466207r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.e(13, this.f466208s);
            java.lang.String str5 = this.f466209t;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            java.lang.String str6 = this.f466210u;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            fVar.g(16, 1, this.f466211v);
            fVar.e(17, this.f466212w);
            fVar.e(18, this.f466213x);
            fVar.e(19, this.f466214y);
            r45.o33 o33Var = this.f466215z;
            if (o33Var != null) {
                fVar.i(20, o33Var.mo75928xcd1e8d8());
                this.f466215z.mo75956x3d5d1f78(fVar);
            }
            fVar.e(21, this.A);
            fVar.a(22, this.B);
            fVar.e(23, this.C);
            fVar.e(24, this.D);
            java.lang.String str7 = this.E;
            if (str7 != null) {
                fVar.j(25, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f466196d) + 0 + b36.f.e(2, this.f466197e) + b36.f.e(3, this.f466198f);
            java.lang.String str8 = this.f466199g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            r45.e64 e64Var2 = this.f466200h;
            if (e64Var2 != null) {
                e17 += b36.f.i(5, e64Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(6, this.f466201i);
            java.lang.String str9 = this.f466202m;
            if (str9 != null) {
                e18 += b36.f.j(7, str9);
            }
            int e19 = e18 + b36.f.e(8, this.f466203n) + b36.f.e(9, this.f466204o) + b36.f.g(10, 8, linkedList);
            java.lang.String str10 = this.f466206q;
            if (str10 != null) {
                e19 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f466207r;
            if (str11 != null) {
                e19 += b36.f.j(12, str11);
            }
            int e27 = e19 + b36.f.e(13, this.f466208s);
            java.lang.String str12 = this.f466209t;
            if (str12 != null) {
                e27 += b36.f.j(14, str12);
            }
            java.lang.String str13 = this.f466210u;
            if (str13 != null) {
                e27 += b36.f.j(15, str13);
            }
            int g17 = e27 + b36.f.g(16, 1, this.f466211v) + b36.f.e(17, this.f466212w) + b36.f.e(18, this.f466213x) + b36.f.e(19, this.f466214y);
            r45.o33 o33Var2 = this.f466215z;
            if (o33Var2 != null) {
                g17 += b36.f.i(20, o33Var2.mo75928xcd1e8d8());
            }
            int e28 = g17 + b36.f.e(21, this.A) + b36.f.a(22, this.B) + b36.f.e(23, this.C) + b36.f.e(24, this.D);
            java.lang.String str14 = this.E;
            return str14 != null ? e28 + b36.f.j(25, str14) : e28;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f466211v.clear();
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
        r45.r97 r97Var = (r45.r97) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                r97Var.f466196d = aVar2.g(intValue);
                return 0;
            case 2:
                r97Var.f466197e = aVar2.g(intValue);
                return 0;
            case 3:
                r97Var.f466198f = aVar2.g(intValue);
                return 0;
            case 4:
                r97Var.f466199g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.e64 e64Var3 = new r45.e64();
                    if (bArr2 != null && bArr2.length > 0) {
                        e64Var3.mo11468x92b714fd(bArr2);
                    }
                    r97Var.f466200h = e64Var3;
                }
                return 0;
            case 6:
                r97Var.f466201i = aVar2.g(intValue);
                return 0;
            case 7:
                r97Var.f466202m = aVar2.k(intValue);
                return 0;
            case 8:
                r97Var.f466203n = aVar2.g(intValue);
                return 0;
            case 9:
                r97Var.f466204o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr3 != null && bArr3.length > 0) {
                        x50Var.mo11468x92b714fd(bArr3);
                    }
                    r97Var.f466205p.add(x50Var);
                }
                return 0;
            case 11:
                r97Var.f466206q = aVar2.k(intValue);
                return 0;
            case 12:
                r97Var.f466207r = aVar2.k(intValue);
                return 0;
            case 13:
                r97Var.f466208s = aVar2.g(intValue);
                return 0;
            case 14:
                r97Var.f466209t = aVar2.k(intValue);
                return 0;
            case 15:
                r97Var.f466210u = aVar2.k(intValue);
                return 0;
            case 16:
                r97Var.f466211v.add(aVar2.k(intValue));
                return 0;
            case 17:
                r97Var.f466212w = aVar2.g(intValue);
                return 0;
            case 18:
                r97Var.f466213x = aVar2.g(intValue);
                return 0;
            case 19:
                r97Var.f466214y = aVar2.g(intValue);
                return 0;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.o33 o33Var3 = new r45.o33();
                    if (bArr4 != null && bArr4.length > 0) {
                        o33Var3.mo11468x92b714fd(bArr4);
                    }
                    r97Var.f466215z = o33Var3;
                }
                return 0;
            case 21:
                r97Var.A = aVar2.g(intValue);
                return 0;
            case 22:
                r97Var.B = aVar2.c(intValue);
                return 0;
            case 23:
                r97Var.C = aVar2.g(intValue);
                return 0;
            case 24:
                r97Var.D = aVar2.g(intValue);
                return 0;
            case 25:
                r97Var.E = aVar2.k(intValue);
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
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f466196d);
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "Offset", valueOf, false);
            eVar.d(jSONObject, "H5Version", java.lang.Integer.valueOf(this.f466197e), false);
            eVar.d(jSONObject, "IsHomePage", java.lang.Integer.valueOf(this.f466198f), false);
            eVar.d(jSONObject, "Keyword", this.f466199g, false);
            eVar.d(jSONObject, "Location", this.f466200h, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f466201i), false);
            eVar.d(jSONObject, "SearchID", this.f466202m, false);
            eVar.d(jSONObject, "SceneActionType", java.lang.Integer.valueOf(this.f466203n), false);
            eVar.d(jSONObject, "DisplayPattern", java.lang.Integer.valueOf(this.f466204o), false);
            eVar.d(jSONObject, "ExtReqParams", this.f466205p, false);
            eVar.d(jSONObject, "SessionID", this.f466206q, false);
            eVar.d(jSONObject, "Source", this.f466207r, false);
            eVar.d(jSONObject, "ChannelId", java.lang.Integer.valueOf(this.f466208s), false);
            eVar.d(jSONObject, "NavigationId", this.f466209t, false);
            eVar.d(jSONObject, "RedPointMsgId", this.f466210u, false);
            eVar.d(jSONObject, "CheckDocidList", this.f466211v, false);
            eVar.d(jSONObject, "Pos", java.lang.Integer.valueOf(this.f466212w), false);
            eVar.d(jSONObject, "Type", java.lang.Integer.valueOf(this.f466213x), false);
            eVar.d(jSONObject, "FromPreTabChannelId", java.lang.Integer.valueOf(this.f466214y), false);
            eVar.d(jSONObject, "FloatingWindow", this.f466215z, false);
            eVar.d(jSONObject, "Count", java.lang.Integer.valueOf(this.A), false);
            eVar.d(jSONObject, "IsFromClient", java.lang.Boolean.valueOf(this.B), false);
            eVar.d(jSONObject, "CareMode", java.lang.Integer.valueOf(this.C), false);
            eVar.d(jSONObject, "YoungMode", java.lang.Integer.valueOf(this.D), false);
            eVar.d(jSONObject, "AdIdInfo", this.E, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
