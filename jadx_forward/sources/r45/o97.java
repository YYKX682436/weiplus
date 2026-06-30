package r45;

/* loaded from: classes7.dex */
public class o97 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463587d;

    /* renamed from: e, reason: collision with root package name */
    public long f463588e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f463589f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f463590g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463591h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463592i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463593m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f463594n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f463595o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public int f463596p;

    /* renamed from: q, reason: collision with root package name */
    public int f463597q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f463598r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f463599s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f463600t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f463601u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f463602v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f463603w;

    /* renamed from: x, reason: collision with root package name */
    public int f463604x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f463605y;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o97)) {
            return false;
        }
        r45.o97 o97Var = (r45.o97) fVar;
        return n51.f.a(this.f463587d, o97Var.f463587d) && n51.f.a(java.lang.Long.valueOf(this.f463588e), java.lang.Long.valueOf(o97Var.f463588e)) && n51.f.a(java.lang.Boolean.valueOf(this.f463589f), java.lang.Boolean.valueOf(o97Var.f463589f)) && n51.f.a(java.lang.Boolean.valueOf(this.f463590g), java.lang.Boolean.valueOf(o97Var.f463590g)) && n51.f.a(this.f463591h, o97Var.f463591h) && n51.f.a(this.f463592i, o97Var.f463592i) && n51.f.a(this.f463593m, o97Var.f463593m) && n51.f.a(java.lang.Boolean.valueOf(this.f463594n), java.lang.Boolean.valueOf(o97Var.f463594n)) && n51.f.a(this.f463595o, o97Var.f463595o) && n51.f.a(java.lang.Integer.valueOf(this.f463596p), java.lang.Integer.valueOf(o97Var.f463596p)) && n51.f.a(java.lang.Integer.valueOf(this.f463597q), java.lang.Integer.valueOf(o97Var.f463597q)) && n51.f.a(this.f463598r, o97Var.f463598r) && n51.f.a(java.lang.Boolean.valueOf(this.f463599s), java.lang.Boolean.valueOf(o97Var.f463599s)) && n51.f.a(this.f463600t, o97Var.f463600t) && n51.f.a(this.f463601u, o97Var.f463601u) && n51.f.a(this.f463602v, o97Var.f463602v) && n51.f.a(this.f463603w, o97Var.f463603w) && n51.f.a(java.lang.Integer.valueOf(this.f463604x), java.lang.Integer.valueOf(o97Var.f463604x)) && n51.f.a(this.f463605y, o97Var.f463605y);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463595o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f463587d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f463588e);
            fVar.a(3, this.f463589f);
            fVar.a(4, this.f463590g);
            java.lang.String str2 = this.f463591h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f463592i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f463593m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.a(8, this.f463594n);
            fVar.g(9, 8, linkedList);
            fVar.e(10, this.f463596p);
            fVar.e(11, this.f463597q);
            java.lang.String str5 = this.f463598r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            fVar.a(13, this.f463599s);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f463600t;
            if (gVar != null) {
                fVar.b(14, gVar);
            }
            java.lang.String str6 = this.f463601u;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f463602v;
            if (gVar2 != null) {
                fVar.b(16, gVar2);
            }
            java.lang.String str7 = this.f463603w;
            if (str7 != null) {
                fVar.j(17, str7);
            }
            fVar.e(18, this.f463604x);
            java.lang.String str8 = this.f463605y;
            if (str8 != null) {
                fVar.j(19, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f463587d;
            int j17 = (str9 != null ? b36.f.j(1, str9) + 0 : 0) + b36.f.h(2, this.f463588e) + b36.f.a(3, this.f463589f) + b36.f.a(4, this.f463590g);
            java.lang.String str10 = this.f463591h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f463592i;
            if (str11 != null) {
                j17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f463593m;
            if (str12 != null) {
                j17 += b36.f.j(7, str12);
            }
            int a17 = j17 + b36.f.a(8, this.f463594n) + b36.f.g(9, 8, linkedList) + b36.f.e(10, this.f463596p) + b36.f.e(11, this.f463597q);
            java.lang.String str13 = this.f463598r;
            if (str13 != null) {
                a17 += b36.f.j(12, str13);
            }
            int a18 = a17 + b36.f.a(13, this.f463599s);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f463600t;
            if (gVar3 != null) {
                a18 += b36.f.b(14, gVar3);
            }
            java.lang.String str14 = this.f463601u;
            if (str14 != null) {
                a18 += b36.f.j(15, str14);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f463602v;
            if (gVar4 != null) {
                a18 += b36.f.b(16, gVar4);
            }
            java.lang.String str15 = this.f463603w;
            if (str15 != null) {
                a18 += b36.f.j(17, str15);
            }
            int e17 = a18 + b36.f.e(18, this.f463604x);
            java.lang.String str16 = this.f463605y;
            return str16 != null ? e17 + b36.f.j(19, str16) : e17;
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
        r45.o97 o97Var = (r45.o97) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o97Var.f463587d = aVar2.k(intValue);
                return 0;
            case 2:
                o97Var.f463588e = aVar2.i(intValue);
                return 0;
            case 3:
                o97Var.f463589f = aVar2.c(intValue);
                return 0;
            case 4:
                o97Var.f463590g = aVar2.c(intValue);
                return 0;
            case 5:
                o97Var.f463591h = aVar2.k(intValue);
                return 0;
            case 6:
                o97Var.f463592i = aVar2.k(intValue);
                return 0;
            case 7:
                o97Var.f463593m = aVar2.k(intValue);
                return 0;
            case 8:
                o97Var.f463594n = aVar2.c(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.m97 m97Var = new r45.m97();
                    if (bArr2 != null && bArr2.length > 0) {
                        m97Var.mo11468x92b714fd(bArr2);
                    }
                    o97Var.f463595o.add(m97Var);
                }
                return 0;
            case 10:
                o97Var.f463596p = aVar2.g(intValue);
                return 0;
            case 11:
                o97Var.f463597q = aVar2.g(intValue);
                return 0;
            case 12:
                o97Var.f463598r = aVar2.k(intValue);
                return 0;
            case 13:
                o97Var.f463599s = aVar2.c(intValue);
                return 0;
            case 14:
                o97Var.f463600t = aVar2.d(intValue);
                return 0;
            case 15:
                o97Var.f463601u = aVar2.k(intValue);
                return 0;
            case 16:
                o97Var.f463602v = aVar2.d(intValue);
                return 0;
            case 17:
                o97Var.f463603w = aVar2.k(intValue);
                return 0;
            case 18:
                o97Var.f463604x = aVar2.g(intValue);
                return 0;
            case 19:
                o97Var.f463605y = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
