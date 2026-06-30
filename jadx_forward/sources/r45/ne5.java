package r45;

/* loaded from: classes9.dex */
public class ne5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f462845d;

    /* renamed from: e, reason: collision with root package name */
    public long f462846e;

    /* renamed from: f, reason: collision with root package name */
    public int f462847f;

    /* renamed from: h, reason: collision with root package name */
    public int f462849h;

    /* renamed from: i, reason: collision with root package name */
    public int f462850i;

    /* renamed from: m, reason: collision with root package name */
    public int f462851m;

    /* renamed from: n, reason: collision with root package name */
    public long f462852n;

    /* renamed from: o, reason: collision with root package name */
    public int f462853o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f462854p;

    /* renamed from: q, reason: collision with root package name */
    public int f462855q;

    /* renamed from: r, reason: collision with root package name */
    public int f462856r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f462857s;

    /* renamed from: t, reason: collision with root package name */
    public int f462858t;

    /* renamed from: v, reason: collision with root package name */
    public int f462860v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f462861w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f462862x;

    /* renamed from: y, reason: collision with root package name */
    public int f462863y;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f462848g = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f462859u = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ne5)) {
            return false;
        }
        r45.ne5 ne5Var = (r45.ne5) fVar;
        return n51.f.a(this.f76492x92037252, ne5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f462845d), java.lang.Integer.valueOf(ne5Var.f462845d)) && n51.f.a(java.lang.Long.valueOf(this.f462846e), java.lang.Long.valueOf(ne5Var.f462846e)) && n51.f.a(java.lang.Integer.valueOf(this.f462847f), java.lang.Integer.valueOf(ne5Var.f462847f)) && n51.f.a(this.f462848g, ne5Var.f462848g) && n51.f.a(java.lang.Integer.valueOf(this.f462849h), java.lang.Integer.valueOf(ne5Var.f462849h)) && n51.f.a(java.lang.Integer.valueOf(this.f462850i), java.lang.Integer.valueOf(ne5Var.f462850i)) && n51.f.a(java.lang.Integer.valueOf(this.f462851m), java.lang.Integer.valueOf(ne5Var.f462851m)) && n51.f.a(java.lang.Long.valueOf(this.f462852n), java.lang.Long.valueOf(ne5Var.f462852n)) && n51.f.a(java.lang.Integer.valueOf(this.f462853o), java.lang.Integer.valueOf(ne5Var.f462853o)) && n51.f.a(this.f462854p, ne5Var.f462854p) && n51.f.a(java.lang.Integer.valueOf(this.f462855q), java.lang.Integer.valueOf(ne5Var.f462855q)) && n51.f.a(java.lang.Integer.valueOf(this.f462856r), java.lang.Integer.valueOf(ne5Var.f462856r)) && n51.f.a(this.f462857s, ne5Var.f462857s) && n51.f.a(java.lang.Integer.valueOf(this.f462858t), java.lang.Integer.valueOf(ne5Var.f462858t)) && n51.f.a(this.f462859u, ne5Var.f462859u) && n51.f.a(java.lang.Integer.valueOf(this.f462860v), java.lang.Integer.valueOf(ne5Var.f462860v)) && n51.f.a(this.f462861w, ne5Var.f462861w) && n51.f.a(this.f462862x, ne5Var.f462862x) && n51.f.a(java.lang.Integer.valueOf(this.f462863y), java.lang.Integer.valueOf(ne5Var.f462863y));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f462859u;
        java.util.LinkedList linkedList2 = this.f462848g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f462845d);
            fVar.h(3, this.f462846e);
            fVar.e(4, this.f462847f);
            fVar.g(5, 8, linkedList2);
            fVar.e(6, this.f462849h);
            fVar.e(7, this.f462850i);
            fVar.e(8, this.f462851m);
            fVar.h(9, this.f462852n);
            fVar.e(10, this.f462853o);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f462854p;
            if (gVar != null) {
                fVar.b(11, gVar);
            }
            fVar.e(12, this.f462855q);
            fVar.e(13, this.f462856r);
            java.lang.String str = this.f462857s;
            if (str != null) {
                fVar.j(14, str);
            }
            fVar.e(15, this.f462858t);
            fVar.g(16, 8, linkedList);
            fVar.e(17, this.f462860v);
            java.lang.String str2 = this.f462861w;
            if (str2 != null) {
                fVar.j(18, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f462862x;
            if (gVar2 != null) {
                fVar.b(19, gVar2);
            }
            fVar.e(20, this.f462863y);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f462845d) + b36.f.h(3, this.f462846e) + b36.f.e(4, this.f462847f) + b36.f.g(5, 8, linkedList2) + b36.f.e(6, this.f462849h) + b36.f.e(7, this.f462850i) + b36.f.e(8, this.f462851m) + b36.f.h(9, this.f462852n) + b36.f.e(10, this.f462853o);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f462854p;
            if (gVar3 != null) {
                i18 += b36.f.b(11, gVar3);
            }
            int e17 = i18 + b36.f.e(12, this.f462855q) + b36.f.e(13, this.f462856r);
            java.lang.String str3 = this.f462857s;
            if (str3 != null) {
                e17 += b36.f.j(14, str3);
            }
            int e18 = e17 + b36.f.e(15, this.f462858t) + b36.f.g(16, 8, linkedList) + b36.f.e(17, this.f462860v);
            java.lang.String str4 = this.f462861w;
            if (str4 != null) {
                e18 += b36.f.j(18, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f462862x;
            if (gVar4 != null) {
                e18 += b36.f.b(19, gVar4);
            }
            return e18 + b36.f.e(20, this.f462863y);
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
        r45.ne5 ne5Var = (r45.ne5) objArr[1];
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
                    ne5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ne5Var.f462845d = aVar2.g(intValue);
                return 0;
            case 3:
                ne5Var.f462846e = aVar2.i(intValue);
                return 0;
            case 4:
                ne5Var.f462847f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.fe5 fe5Var = new r45.fe5();
                    if (bArr3 != null && bArr3.length > 0) {
                        fe5Var.mo11468x92b714fd(bArr3);
                    }
                    ne5Var.f462848g.add(fe5Var);
                }
                return 0;
            case 6:
                ne5Var.f462849h = aVar2.g(intValue);
                return 0;
            case 7:
                ne5Var.f462850i = aVar2.g(intValue);
                return 0;
            case 8:
                ne5Var.f462851m = aVar2.g(intValue);
                return 0;
            case 9:
                ne5Var.f462852n = aVar2.i(intValue);
                return 0;
            case 10:
                ne5Var.f462853o = aVar2.g(intValue);
                return 0;
            case 11:
                ne5Var.f462854p = aVar2.d(intValue);
                return 0;
            case 12:
                ne5Var.f462855q = aVar2.g(intValue);
                return 0;
            case 13:
                ne5Var.f462856r = aVar2.g(intValue);
                return 0;
            case 14:
                ne5Var.f462857s = aVar2.k(intValue);
                return 0;
            case 15:
                ne5Var.f462858t = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.fe5 fe5Var2 = new r45.fe5();
                    if (bArr4 != null && bArr4.length > 0) {
                        fe5Var2.mo11468x92b714fd(bArr4);
                    }
                    ne5Var.f462859u.add(fe5Var2);
                }
                return 0;
            case 17:
                ne5Var.f462860v = aVar2.g(intValue);
                return 0;
            case 18:
                ne5Var.f462861w = aVar2.k(intValue);
                return 0;
            case 19:
                ne5Var.f462862x = aVar2.d(intValue);
                return 0;
            case 20:
                ne5Var.f462863y = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
