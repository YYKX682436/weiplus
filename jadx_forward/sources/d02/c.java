package d02;

/* loaded from: classes8.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public java.lang.String A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f306809d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f306810e;

    /* renamed from: f, reason: collision with root package name */
    public long f306811f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f306812g;

    /* renamed from: h, reason: collision with root package name */
    public int f306813h;

    /* renamed from: i, reason: collision with root package name */
    public int f306814i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f306815m;

    /* renamed from: n, reason: collision with root package name */
    public d02.o f306816n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f306817o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f306818p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f306819q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f306820r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f306821s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f306822t;

    /* renamed from: u, reason: collision with root package name */
    public long f306823u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f306824v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f306825w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f306826x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f306827y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f306828z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof d02.c)) {
            return false;
        }
        d02.c cVar = (d02.c) fVar;
        return n51.f.a(this.f306809d, cVar.f306809d) && n51.f.a(this.f306810e, cVar.f306810e) && n51.f.a(java.lang.Long.valueOf(this.f306811f), java.lang.Long.valueOf(cVar.f306811f)) && n51.f.a(this.f306812g, cVar.f306812g) && n51.f.a(java.lang.Integer.valueOf(this.f306813h), java.lang.Integer.valueOf(cVar.f306813h)) && n51.f.a(java.lang.Integer.valueOf(this.f306814i), java.lang.Integer.valueOf(cVar.f306814i)) && n51.f.a(this.f306815m, cVar.f306815m) && n51.f.a(this.f306816n, cVar.f306816n) && n51.f.a(this.f306817o, cVar.f306817o) && n51.f.a(this.f306818p, cVar.f306818p) && n51.f.a(java.lang.Boolean.valueOf(this.f306819q), java.lang.Boolean.valueOf(cVar.f306819q)) && n51.f.a(this.f306820r, cVar.f306820r) && n51.f.a(this.f306821s, cVar.f306821s) && n51.f.a(this.f306822t, cVar.f306822t) && n51.f.a(java.lang.Long.valueOf(this.f306823u), java.lang.Long.valueOf(cVar.f306823u)) && n51.f.a(this.f306824v, cVar.f306824v) && n51.f.a(this.f306825w, cVar.f306825w) && n51.f.a(this.f306826x, cVar.f306826x) && n51.f.a(this.f306827y, cVar.f306827y) && n51.f.a(this.f306828z, cVar.f306828z) && n51.f.a(this.A, cVar.A);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f306820r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f306809d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f306810e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f306811f);
            java.lang.String str3 = this.f306812g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(6, this.f306813h);
            fVar.e(7, this.f306814i);
            java.lang.String str4 = this.f306815m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            d02.o oVar = this.f306816n;
            if (oVar != null) {
                fVar.i(9, oVar.mo75928xcd1e8d8());
                this.f306816n.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f306817o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f306818p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.a(12, this.f306819q);
            fVar.g(13, 8, linkedList);
            java.lang.String str7 = this.f306821s;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            java.lang.String str8 = this.f306822t;
            if (str8 != null) {
                fVar.j(15, str8);
            }
            fVar.h(16, this.f306823u);
            java.lang.String str9 = this.f306824v;
            if (str9 != null) {
                fVar.j(17, str9);
            }
            java.lang.String str10 = this.f306825w;
            if (str10 != null) {
                fVar.j(19, str10);
            }
            java.lang.String str11 = this.f306826x;
            if (str11 != null) {
                fVar.j(20, str11);
            }
            java.lang.String str12 = this.f306827y;
            if (str12 != null) {
                fVar.j(21, str12);
            }
            java.lang.String str13 = this.f306828z;
            if (str13 != null) {
                fVar.j(22, str13);
            }
            java.lang.String str14 = this.A;
            if (str14 != null) {
                fVar.j(23, str14);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str15 = this.f306809d;
            int j17 = str15 != null ? b36.f.j(1, str15) + 0 : 0;
            java.lang.String str16 = this.f306810e;
            if (str16 != null) {
                j17 += b36.f.j(2, str16);
            }
            int h17 = j17 + b36.f.h(3, this.f306811f);
            java.lang.String str17 = this.f306812g;
            if (str17 != null) {
                h17 += b36.f.j(4, str17);
            }
            int e17 = h17 + b36.f.e(6, this.f306813h) + b36.f.e(7, this.f306814i);
            java.lang.String str18 = this.f306815m;
            if (str18 != null) {
                e17 += b36.f.j(8, str18);
            }
            d02.o oVar2 = this.f306816n;
            if (oVar2 != null) {
                e17 += b36.f.i(9, oVar2.mo75928xcd1e8d8());
            }
            java.lang.String str19 = this.f306817o;
            if (str19 != null) {
                e17 += b36.f.j(10, str19);
            }
            java.lang.String str20 = this.f306818p;
            if (str20 != null) {
                e17 += b36.f.j(11, str20);
            }
            int a17 = e17 + b36.f.a(12, this.f306819q) + b36.f.g(13, 8, linkedList);
            java.lang.String str21 = this.f306821s;
            if (str21 != null) {
                a17 += b36.f.j(14, str21);
            }
            java.lang.String str22 = this.f306822t;
            if (str22 != null) {
                a17 += b36.f.j(15, str22);
            }
            int h18 = a17 + b36.f.h(16, this.f306823u);
            java.lang.String str23 = this.f306824v;
            if (str23 != null) {
                h18 += b36.f.j(17, str23);
            }
            java.lang.String str24 = this.f306825w;
            if (str24 != null) {
                h18 += b36.f.j(19, str24);
            }
            java.lang.String str25 = this.f306826x;
            if (str25 != null) {
                h18 += b36.f.j(20, str25);
            }
            java.lang.String str26 = this.f306827y;
            if (str26 != null) {
                h18 += b36.f.j(21, str26);
            }
            java.lang.String str27 = this.f306828z;
            if (str27 != null) {
                h18 += b36.f.j(22, str27);
            }
            java.lang.String str28 = this.A;
            return str28 != null ? h18 + b36.f.j(23, str28) : h18;
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
        d02.c cVar = (d02.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cVar.f306809d = aVar2.k(intValue);
                return 0;
            case 2:
                cVar.f306810e = aVar2.k(intValue);
                return 0;
            case 3:
                cVar.f306811f = aVar2.i(intValue);
                return 0;
            case 4:
                cVar.f306812g = aVar2.k(intValue);
                return 0;
            case 5:
            case 18:
            default:
                return -1;
            case 6:
                cVar.f306813h = aVar2.g(intValue);
                return 0;
            case 7:
                cVar.f306814i = aVar2.g(intValue);
                return 0;
            case 8:
                cVar.f306815m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    d02.o oVar3 = new d02.o();
                    if (bArr2 != null && bArr2.length > 0) {
                        oVar3.mo11468x92b714fd(bArr2);
                    }
                    cVar.f306816n = oVar3;
                }
                return 0;
            case 10:
                cVar.f306817o = aVar2.k(intValue);
                return 0;
            case 11:
                cVar.f306818p = aVar2.k(intValue);
                return 0;
            case 12:
                cVar.f306819q = aVar2.c(intValue);
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    d02.a aVar3 = new d02.a();
                    if (bArr3 != null && bArr3.length > 0) {
                        aVar3.mo11468x92b714fd(bArr3);
                    }
                    cVar.f306820r.add(aVar3);
                }
                return 0;
            case 14:
                cVar.f306821s = aVar2.k(intValue);
                return 0;
            case 15:
                cVar.f306822t = aVar2.k(intValue);
                return 0;
            case 16:
                cVar.f306823u = aVar2.i(intValue);
                return 0;
            case 17:
                cVar.f306824v = aVar2.k(intValue);
                return 0;
            case 19:
                cVar.f306825w = aVar2.k(intValue);
                return 0;
            case 20:
                cVar.f306826x = aVar2.k(intValue);
                return 0;
            case 21:
                cVar.f306827y = aVar2.k(intValue);
                return 0;
            case 22:
                cVar.f306828z = aVar2.k(intValue);
                return 0;
            case 23:
                cVar.A = aVar2.k(intValue);
                return 0;
        }
    }
}
