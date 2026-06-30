package r45;

/* loaded from: classes9.dex */
public class hb5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f457540d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457541e;

    /* renamed from: f, reason: collision with root package name */
    public r45.jz3 f457542f;

    /* renamed from: g, reason: collision with root package name */
    public r45.be5 f457543g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457544h;

    /* renamed from: n, reason: collision with root package name */
    public int f457547n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f457548o;

    /* renamed from: p, reason: collision with root package name */
    public int f457549p;

    /* renamed from: q, reason: collision with root package name */
    public long f457550q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f457551r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f457552s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f457553t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f457554u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f457555v;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f457545i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f457546m = true;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f457556w = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hb5)) {
            return false;
        }
        r45.hb5 hb5Var = (r45.hb5) fVar;
        return n51.f.a(this.f76492x92037252, hb5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f457540d), java.lang.Integer.valueOf(hb5Var.f457540d)) && n51.f.a(this.f457541e, hb5Var.f457541e) && n51.f.a(this.f457542f, hb5Var.f457542f) && n51.f.a(this.f457543g, hb5Var.f457543g) && n51.f.a(this.f457544h, hb5Var.f457544h) && n51.f.a(this.f457545i, hb5Var.f457545i) && n51.f.a(java.lang.Boolean.valueOf(this.f457546m), java.lang.Boolean.valueOf(hb5Var.f457546m)) && n51.f.a(java.lang.Integer.valueOf(this.f457547n), java.lang.Integer.valueOf(hb5Var.f457547n)) && n51.f.a(this.f457548o, hb5Var.f457548o) && n51.f.a(java.lang.Integer.valueOf(this.f457549p), java.lang.Integer.valueOf(hb5Var.f457549p)) && n51.f.a(java.lang.Long.valueOf(this.f457550q), java.lang.Long.valueOf(hb5Var.f457550q)) && n51.f.a(this.f457551r, hb5Var.f457551r) && n51.f.a(this.f457552s, hb5Var.f457552s) && n51.f.a(this.f457553t, hb5Var.f457553t) && n51.f.a(this.f457554u, hb5Var.f457554u) && n51.f.a(this.f457555v, hb5Var.f457555v) && n51.f.a(this.f457556w, hb5Var.f457556w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457556w;
        java.util.LinkedList linkedList2 = this.f457545i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f457540d);
            java.lang.String str = this.f457541e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.jz3 jz3Var = this.f457542f;
            if (jz3Var != null) {
                fVar.i(4, jz3Var.mo75928xcd1e8d8());
                this.f457542f.mo75956x3d5d1f78(fVar);
            }
            r45.be5 be5Var = this.f457543g;
            if (be5Var != null) {
                fVar.i(5, be5Var.mo75928xcd1e8d8());
                this.f457543g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f457544h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList2);
            fVar.a(8, this.f457546m);
            fVar.e(9, this.f457547n);
            java.lang.String str3 = this.f457548o;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.e(11, this.f457549p);
            fVar.h(12, this.f457550q);
            java.lang.String str4 = this.f457551r;
            if (str4 != null) {
                fVar.j(13, str4);
            }
            java.lang.String str5 = this.f457552s;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            java.lang.String str6 = this.f457553t;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f457554u;
            if (str7 != null) {
                fVar.j(16, str7);
            }
            java.lang.String str8 = this.f457555v;
            if (str8 != null) {
                fVar.j(17, str8);
            }
            fVar.g(18, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f457540d);
            java.lang.String str9 = this.f457541e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            r45.jz3 jz3Var2 = this.f457542f;
            if (jz3Var2 != null) {
                i18 += b36.f.i(4, jz3Var2.mo75928xcd1e8d8());
            }
            r45.be5 be5Var2 = this.f457543g;
            if (be5Var2 != null) {
                i18 += b36.f.i(5, be5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f457544h;
            if (str10 != null) {
                i18 += b36.f.j(6, str10);
            }
            int g17 = i18 + b36.f.g(7, 8, linkedList2) + b36.f.a(8, this.f457546m) + b36.f.e(9, this.f457547n);
            java.lang.String str11 = this.f457548o;
            if (str11 != null) {
                g17 += b36.f.j(10, str11);
            }
            int e17 = g17 + b36.f.e(11, this.f457549p) + b36.f.h(12, this.f457550q);
            java.lang.String str12 = this.f457551r;
            if (str12 != null) {
                e17 += b36.f.j(13, str12);
            }
            java.lang.String str13 = this.f457552s;
            if (str13 != null) {
                e17 += b36.f.j(14, str13);
            }
            java.lang.String str14 = this.f457553t;
            if (str14 != null) {
                e17 += b36.f.j(15, str14);
            }
            java.lang.String str15 = this.f457554u;
            if (str15 != null) {
                e17 += b36.f.j(16, str15);
            }
            java.lang.String str16 = this.f457555v;
            if (str16 != null) {
                e17 += b36.f.j(17, str16);
            }
            return e17 + b36.f.g(18, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.hb5 hb5Var = (r45.hb5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    hb5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                hb5Var.f457540d = aVar2.g(intValue);
                return 0;
            case 3:
                hb5Var.f457541e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.jz3 jz3Var3 = new r45.jz3();
                    if (bArr3 != null && bArr3.length > 0) {
                        jz3Var3.mo11468x92b714fd(bArr3);
                    }
                    hb5Var.f457542f = jz3Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.be5 be5Var3 = new r45.be5();
                    if (bArr4 != null && bArr4.length > 0) {
                        be5Var3.mo11468x92b714fd(bArr4);
                    }
                    hb5Var.f457543g = be5Var3;
                }
                return 0;
            case 6:
                hb5Var.f457544h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.qv qvVar = new r45.qv();
                    if (bArr5 != null && bArr5.length > 0) {
                        qvVar.mo11468x92b714fd(bArr5);
                    }
                    hb5Var.f457545i.add(qvVar);
                }
                return 0;
            case 8:
                hb5Var.f457546m = aVar2.c(intValue);
                return 0;
            case 9:
                hb5Var.f457547n = aVar2.g(intValue);
                return 0;
            case 10:
                hb5Var.f457548o = aVar2.k(intValue);
                return 0;
            case 11:
                hb5Var.f457549p = aVar2.g(intValue);
                return 0;
            case 12:
                hb5Var.f457550q = aVar2.i(intValue);
                return 0;
            case 13:
                hb5Var.f457551r = aVar2.k(intValue);
                return 0;
            case 14:
                hb5Var.f457552s = aVar2.k(intValue);
                return 0;
            case 15:
                hb5Var.f457553t = aVar2.k(intValue);
                return 0;
            case 16:
                hb5Var.f457554u = aVar2.k(intValue);
                return 0;
            case 17:
                hb5Var.f457555v = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.ql5 ql5Var = new r45.ql5();
                    if (bArr6 != null && bArr6.length > 0) {
                        ql5Var.mo11468x92b714fd(bArr6);
                    }
                    hb5Var.f457556w.add(ql5Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
