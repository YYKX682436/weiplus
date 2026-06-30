package r45;

/* loaded from: classes15.dex */
public class un6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public boolean A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469034d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469035e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469036f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469037g;

    /* renamed from: h, reason: collision with root package name */
    public long f469038h;

    /* renamed from: i, reason: collision with root package name */
    public int f469039i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469040m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f469041n;

    /* renamed from: o, reason: collision with root package name */
    public r45.xn6 f469042o;

    /* renamed from: p, reason: collision with root package name */
    public r45.x56 f469043p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f469045r;

    /* renamed from: s, reason: collision with root package name */
    public int f469046s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f469047t;

    /* renamed from: v, reason: collision with root package name */
    public int f469049v;

    /* renamed from: w, reason: collision with root package name */
    public int f469050w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f469051x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f469052y;

    /* renamed from: z, reason: collision with root package name */
    public int f469053z;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f469044q = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f469048u = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.un6)) {
            return false;
        }
        r45.un6 un6Var = (r45.un6) fVar;
        return n51.f.a(this.f469034d, un6Var.f469034d) && n51.f.a(this.f469035e, un6Var.f469035e) && n51.f.a(this.f469036f, un6Var.f469036f) && n51.f.a(this.f469037g, un6Var.f469037g) && n51.f.a(java.lang.Long.valueOf(this.f469038h), java.lang.Long.valueOf(un6Var.f469038h)) && n51.f.a(java.lang.Integer.valueOf(this.f469039i), java.lang.Integer.valueOf(un6Var.f469039i)) && n51.f.a(this.f469040m, un6Var.f469040m) && n51.f.a(this.f469041n, un6Var.f469041n) && n51.f.a(this.f469042o, un6Var.f469042o) && n51.f.a(this.f469043p, un6Var.f469043p) && n51.f.a(this.f469044q, un6Var.f469044q) && n51.f.a(this.f469045r, un6Var.f469045r) && n51.f.a(java.lang.Integer.valueOf(this.f469046s), java.lang.Integer.valueOf(un6Var.f469046s)) && n51.f.a(java.lang.Boolean.valueOf(this.f469047t), java.lang.Boolean.valueOf(un6Var.f469047t)) && n51.f.a(this.f469048u, un6Var.f469048u) && n51.f.a(java.lang.Integer.valueOf(this.f469049v), java.lang.Integer.valueOf(un6Var.f469049v)) && n51.f.a(java.lang.Integer.valueOf(this.f469050w), java.lang.Integer.valueOf(un6Var.f469050w)) && n51.f.a(java.lang.Boolean.valueOf(this.f469051x), java.lang.Boolean.valueOf(un6Var.f469051x)) && n51.f.a(this.f469052y, un6Var.f469052y) && n51.f.a(java.lang.Integer.valueOf(this.f469053z), java.lang.Integer.valueOf(un6Var.f469053z)) && n51.f.a(java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(un6Var.A));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469048u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469034d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469035e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f469036f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f469037g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.h(5, this.f469038h);
            fVar.e(6, this.f469039i);
            java.lang.String str5 = this.f469040m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f469041n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            r45.xn6 xn6Var = this.f469042o;
            if (xn6Var != null) {
                fVar.i(9, xn6Var.mo75928xcd1e8d8());
                this.f469042o.mo75956x3d5d1f78(fVar);
            }
            r45.x56 x56Var = this.f469043p;
            if (x56Var != null) {
                fVar.i(10, x56Var.mo75928xcd1e8d8());
                this.f469043p.mo75956x3d5d1f78(fVar);
            }
            fVar.g(11, 8, this.f469044q);
            java.lang.String str7 = this.f469045r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            fVar.e(13, this.f469046s);
            fVar.a(14, this.f469047t);
            fVar.g(15, 8, linkedList);
            fVar.e(16, this.f469049v);
            fVar.e(17, this.f469050w);
            fVar.a(18, this.f469051x);
            java.lang.String str8 = this.f469052y;
            if (str8 != null) {
                fVar.j(19, str8);
            }
            fVar.e(20, this.f469053z);
            fVar.a(21, this.A);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f469034d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f469035e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f469036f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f469037g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            int h17 = j17 + b36.f.h(5, this.f469038h) + b36.f.e(6, this.f469039i);
            java.lang.String str13 = this.f469040m;
            if (str13 != null) {
                h17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f469041n;
            if (str14 != null) {
                h17 += b36.f.j(8, str14);
            }
            r45.xn6 xn6Var2 = this.f469042o;
            if (xn6Var2 != null) {
                h17 += b36.f.i(9, xn6Var2.mo75928xcd1e8d8());
            }
            r45.x56 x56Var2 = this.f469043p;
            if (x56Var2 != null) {
                h17 += b36.f.i(10, x56Var2.mo75928xcd1e8d8());
            }
            int g17 = h17 + b36.f.g(11, 8, this.f469044q);
            java.lang.String str15 = this.f469045r;
            if (str15 != null) {
                g17 += b36.f.j(12, str15);
            }
            int e17 = g17 + b36.f.e(13, this.f469046s) + b36.f.a(14, this.f469047t) + b36.f.g(15, 8, linkedList) + b36.f.e(16, this.f469049v) + b36.f.e(17, this.f469050w) + b36.f.a(18, this.f469051x);
            java.lang.String str16 = this.f469052y;
            if (str16 != null) {
                e17 += b36.f.j(19, str16);
            }
            return e17 + b36.f.e(20, this.f469053z) + b36.f.a(21, this.A);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f469044q.clear();
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
        r45.un6 un6Var = (r45.un6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                un6Var.f469034d = aVar2.k(intValue);
                return 0;
            case 2:
                un6Var.f469035e = aVar2.k(intValue);
                return 0;
            case 3:
                un6Var.f469036f = aVar2.k(intValue);
                return 0;
            case 4:
                un6Var.f469037g = aVar2.k(intValue);
                return 0;
            case 5:
                un6Var.f469038h = aVar2.i(intValue);
                return 0;
            case 6:
                un6Var.f469039i = aVar2.g(intValue);
                return 0;
            case 7:
                un6Var.f469040m = aVar2.k(intValue);
                return 0;
            case 8:
                un6Var.f469041n = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.xn6 xn6Var3 = new r45.xn6();
                    if (bArr2 != null && bArr2.length > 0) {
                        xn6Var3.mo11468x92b714fd(bArr2);
                    }
                    un6Var.f469042o = xn6Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.x56 x56Var3 = new r45.x56();
                    if (bArr3 != null && bArr3.length > 0) {
                        x56Var3.mo11468x92b714fd(bArr3);
                    }
                    un6Var.f469043p = x56Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr4 != null && bArr4.length > 0) {
                        x50Var.mo11468x92b714fd(bArr4);
                    }
                    un6Var.f469044q.add(x50Var);
                }
                return 0;
            case 12:
                un6Var.f469045r = aVar2.k(intValue);
                return 0;
            case 13:
                un6Var.f469046s = aVar2.g(intValue);
                return 0;
            case 14:
                un6Var.f469047t = aVar2.c(intValue);
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.xn6 xn6Var4 = new r45.xn6();
                    if (bArr5 != null && bArr5.length > 0) {
                        xn6Var4.mo11468x92b714fd(bArr5);
                    }
                    un6Var.f469048u.add(xn6Var4);
                }
                return 0;
            case 16:
                un6Var.f469049v = aVar2.g(intValue);
                return 0;
            case 17:
                un6Var.f469050w = aVar2.g(intValue);
                return 0;
            case 18:
                un6Var.f469051x = aVar2.c(intValue);
                return 0;
            case 19:
                un6Var.f469052y = aVar2.k(intValue);
                return 0;
            case 20:
                un6Var.f469053z = aVar2.g(intValue);
                return 0;
            case 21:
                un6Var.A = aVar2.c(intValue);
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
            java.lang.String str = this.f469034d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "relevantVid", str, false);
            eVar.d(jSONObject, "relevantExpand", this.f469035e, false);
            eVar.d(jSONObject, "relevantPreSearchId", this.f469036f, false);
            eVar.d(jSONObject, "relevantSharedOpenID", this.f469037g, false);
            eVar.d(jSONObject, "recCategory", java.lang.Long.valueOf(this.f469038h), false);
            eVar.d(jSONObject, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(this.f469039i), false);
            eVar.d(jSONObject, "searchId", this.f469040m, false);
            eVar.d(jSONObject, "keyword", this.f469041n, false);
            eVar.d(jSONObject, "firstVideoInfo", this.f469042o, false);
            eVar.d(jSONObject, "clickTag", this.f469043p, false);
            eVar.d(jSONObject, "extReqParams", this.f469044q, false);
            eVar.d(jSONObject, "contextId", this.f469045r, false);
            eVar.d(jSONObject, "offset", java.lang.Integer.valueOf(this.f469046s), false);
            eVar.d(jSONObject, "enbaleMobileNet", java.lang.Boolean.valueOf(this.f469047t), false);
            eVar.d(jSONObject, "videoList", this.f469048u, false);
            eVar.d(jSONObject, "currentPlayPosition", java.lang.Integer.valueOf(this.f469049v), false);
            eVar.d(jSONObject, "currentPlaySecond", java.lang.Integer.valueOf(this.f469050w), false);
            eVar.d(jSONObject, "isMute", java.lang.Boolean.valueOf(this.f469051x), false);
            eVar.d(jSONObject, "preNetType", this.f469052y, false);
            eVar.d(jSONObject, "hasCheckMobile", java.lang.Integer.valueOf(this.f469053z), false);
            eVar.d(jSONObject, "isSinglePage", java.lang.Boolean.valueOf(this.A), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
