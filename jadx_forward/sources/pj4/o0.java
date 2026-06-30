package pj4;

/* loaded from: classes11.dex */
public class o0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f436746d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f436747e;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f436750h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f436751i;

    /* renamed from: o, reason: collision with root package name */
    public pj4.c0 f436754o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f436755p;

    /* renamed from: q, reason: collision with root package name */
    public pj4.x f436756q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f436757r;

    /* renamed from: s, reason: collision with root package name */
    public int f436758s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f436760u;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f436748f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f436749g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f436752m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f436753n = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f436759t = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.o0)) {
            return false;
        }
        pj4.o0 o0Var = (pj4.o0) fVar;
        return n51.f.a(this.f436746d, o0Var.f436746d) && n51.f.a(this.f436747e, o0Var.f436747e) && n51.f.a(this.f436748f, o0Var.f436748f) && n51.f.a(this.f436749g, o0Var.f436749g) && n51.f.a(this.f436750h, o0Var.f436750h) && n51.f.a(this.f436751i, o0Var.f436751i) && n51.f.a(this.f436752m, o0Var.f436752m) && n51.f.a(this.f436753n, o0Var.f436753n) && n51.f.a(this.f436754o, o0Var.f436754o) && n51.f.a(this.f436755p, o0Var.f436755p) && n51.f.a(this.f436756q, o0Var.f436756q) && n51.f.a(this.f436757r, o0Var.f436757r) && n51.f.a(java.lang.Integer.valueOf(this.f436758s), java.lang.Integer.valueOf(o0Var.f436758s)) && n51.f.a(this.f436759t, o0Var.f436759t) && n51.f.a(this.f436760u, o0Var.f436760u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f436759t;
        java.util.LinkedList linkedList2 = this.f436753n;
        java.util.LinkedList linkedList3 = this.f436748f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f436746d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f436747e;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            fVar.g(13, 1, linkedList3);
            fVar.g(15, 8, this.f436749g);
            java.lang.String str3 = this.f436750h;
            if (str3 != null) {
                fVar.j(16, str3);
            }
            java.lang.String str4 = this.f436751i;
            if (str4 != null) {
                fVar.j(17, str4);
            }
            fVar.g(19, 8, this.f436752m);
            fVar.g(20, 8, linkedList2);
            pj4.c0 c0Var = this.f436754o;
            if (c0Var != null) {
                fVar.i(22, c0Var.mo75928xcd1e8d8());
                this.f436754o.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f436755p;
            if (str5 != null) {
                fVar.j(23, str5);
            }
            pj4.x xVar = this.f436756q;
            if (xVar != null) {
                fVar.i(24, xVar.mo75928xcd1e8d8());
                this.f436756q.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f436757r;
            if (gVar != null) {
                fVar.b(25, gVar);
            }
            fVar.e(26, this.f436758s);
            fVar.g(27, 8, linkedList);
            java.lang.String str6 = this.f436760u;
            if (str6 != null) {
                fVar.j(28, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f436746d;
            int j17 = str7 != null ? b36.f.j(1, str7) + 0 : 0;
            java.lang.String str8 = this.f436747e;
            if (str8 != null) {
                j17 += b36.f.j(10, str8);
            }
            int g17 = j17 + b36.f.g(13, 1, linkedList3) + b36.f.g(15, 8, this.f436749g);
            java.lang.String str9 = this.f436750h;
            if (str9 != null) {
                g17 += b36.f.j(16, str9);
            }
            java.lang.String str10 = this.f436751i;
            if (str10 != null) {
                g17 += b36.f.j(17, str10);
            }
            int g18 = g17 + b36.f.g(19, 8, this.f436752m) + b36.f.g(20, 8, linkedList2);
            pj4.c0 c0Var2 = this.f436754o;
            if (c0Var2 != null) {
                g18 += b36.f.i(22, c0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str11 = this.f436755p;
            if (str11 != null) {
                g18 += b36.f.j(23, str11);
            }
            pj4.x xVar2 = this.f436756q;
            if (xVar2 != null) {
                g18 += b36.f.i(24, xVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f436757r;
            if (gVar2 != null) {
                g18 += b36.f.b(25, gVar2);
            }
            int e17 = g18 + b36.f.e(26, this.f436758s) + b36.f.g(27, 8, linkedList);
            java.lang.String str12 = this.f436760u;
            return str12 != null ? e17 + b36.f.j(28, str12) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            this.f436749g.clear();
            this.f436752m.clear();
            linkedList2.clear();
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
        pj4.o0 o0Var = (pj4.o0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o0Var.f436746d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 10) {
            o0Var.f436747e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 13) {
            o0Var.f436748f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 19) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                pj4.g0 g0Var = new pj4.g0();
                if (bArr2 != null && bArr2.length > 0) {
                    g0Var.mo11468x92b714fd(bArr2);
                }
                o0Var.f436752m.add(g0Var);
            }
            return 0;
        }
        if (intValue == 20) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j19.get(i19);
                pj4.i0 i0Var = new pj4.i0();
                if (bArr3 != null && bArr3.length > 0) {
                    i0Var.mo11468x92b714fd(bArr3);
                }
                o0Var.f436753n.add(i0Var);
            }
            return 0;
        }
        switch (intValue) {
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    pj4.j0 j0Var = new pj4.j0();
                    if (bArr4 != null && bArr4.length > 0) {
                        j0Var.mo11468x92b714fd(bArr4);
                    }
                    o0Var.f436749g.add(j0Var);
                }
                return 0;
            case 16:
                o0Var.f436750h = aVar2.k(intValue);
                return 0;
            case 17:
                o0Var.f436751i = aVar2.k(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 22:
                        java.util.LinkedList j28 = aVar2.j(intValue);
                        int size4 = j28.size();
                        for (int i28 = 0; i28 < size4; i28++) {
                            byte[] bArr5 = (byte[]) j28.get(i28);
                            pj4.c0 c0Var3 = new pj4.c0();
                            if (bArr5 != null && bArr5.length > 0) {
                                c0Var3.mo11468x92b714fd(bArr5);
                            }
                            o0Var.f436754o = c0Var3;
                        }
                        return 0;
                    case 23:
                        o0Var.f436755p = aVar2.k(intValue);
                        return 0;
                    case 24:
                        java.util.LinkedList j29 = aVar2.j(intValue);
                        int size5 = j29.size();
                        for (int i29 = 0; i29 < size5; i29++) {
                            byte[] bArr6 = (byte[]) j29.get(i29);
                            pj4.x xVar3 = new pj4.x();
                            if (bArr6 != null && bArr6.length > 0) {
                                xVar3.mo11468x92b714fd(bArr6);
                            }
                            o0Var.f436756q = xVar3;
                        }
                        return 0;
                    case 25:
                        o0Var.f436757r = aVar2.d(intValue);
                        return 0;
                    case 26:
                        o0Var.f436758s = aVar2.g(intValue);
                        return 0;
                    case 27:
                        java.util.LinkedList j37 = aVar2.j(intValue);
                        int size6 = j37.size();
                        for (int i37 = 0; i37 < size6; i37++) {
                            byte[] bArr7 = (byte[]) j37.get(i37);
                            pj4.x xVar4 = new pj4.x();
                            if (bArr7 != null && bArr7.length > 0) {
                                xVar4.mo11468x92b714fd(bArr7);
                            }
                            o0Var.f436759t.add(xVar4);
                        }
                        return 0;
                    case 28:
                        o0Var.f436760u = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f436746d;
            n51.e eVar = n51.f.f416647a;
            eVar.d(jSONObject, "topicId", str, false);
            eVar.d(jSONObject, "iconId", this.f436747e, false);
            eVar.d(jSONObject, "topics", this.f436748f, false);
            eVar.d(jSONObject, "jumpInfos", this.f436749g, false);
            eVar.d(jSONObject, "verifyInfo", this.f436750h, false);
            eVar.d(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f436751i, false);
            eVar.d(jSONObject, "iconActions", this.f436752m, false);
            eVar.d(jSONObject, "jumpElements", this.f436753n, false);
            eVar.d(jSONObject, "footer", this.f436754o, false);
            eVar.d(jSONObject, "clusterIdDeprecated", this.f436755p, false);
            eVar.d(jSONObject, "clusterPresentDeprecated", this.f436756q, false);
            eVar.d(jSONObject, "deprecatedBuffer", this.f436757r, false);
            eVar.d(jSONObject, "characterSetType", java.lang.Integer.valueOf(this.f436758s), false);
            eVar.d(jSONObject, "clusterPresents", this.f436759t, false);
            eVar.d(jSONObject, "locale", this.f436760u, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
