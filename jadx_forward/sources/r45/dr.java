package r45;

/* loaded from: classes12.dex */
public class dr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454207d;

    /* renamed from: e, reason: collision with root package name */
    public int f454208e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454209f;

    /* renamed from: g, reason: collision with root package name */
    public int f454210g;

    /* renamed from: h, reason: collision with root package name */
    public int f454211h;

    /* renamed from: i, reason: collision with root package name */
    public int f454212i;

    /* renamed from: m, reason: collision with root package name */
    public int f454213m;

    /* renamed from: n, reason: collision with root package name */
    public int f454214n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f454215o;

    /* renamed from: p, reason: collision with root package name */
    public int f454216p;

    /* renamed from: q, reason: collision with root package name */
    public int f454217q;

    /* renamed from: r, reason: collision with root package name */
    public int f454218r;

    /* renamed from: s, reason: collision with root package name */
    public int f454219s;

    /* renamed from: t, reason: collision with root package name */
    public int f454220t;

    /* renamed from: u, reason: collision with root package name */
    public int f454221u;

    /* renamed from: v, reason: collision with root package name */
    public int f454222v;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dr)) {
            return false;
        }
        r45.dr drVar = (r45.dr) fVar;
        return n51.f.a(this.f454207d, drVar.f454207d) && n51.f.a(java.lang.Integer.valueOf(this.f454208e), java.lang.Integer.valueOf(drVar.f454208e)) && n51.f.a(this.f454209f, drVar.f454209f) && n51.f.a(java.lang.Integer.valueOf(this.f454210g), java.lang.Integer.valueOf(drVar.f454210g)) && n51.f.a(java.lang.Integer.valueOf(this.f454211h), java.lang.Integer.valueOf(drVar.f454211h)) && n51.f.a(java.lang.Integer.valueOf(this.f454212i), java.lang.Integer.valueOf(drVar.f454212i)) && n51.f.a(java.lang.Integer.valueOf(this.f454213m), java.lang.Integer.valueOf(drVar.f454213m)) && n51.f.a(java.lang.Integer.valueOf(this.f454214n), java.lang.Integer.valueOf(drVar.f454214n)) && n51.f.a(this.f454215o, drVar.f454215o) && n51.f.a(java.lang.Integer.valueOf(this.f454216p), java.lang.Integer.valueOf(drVar.f454216p)) && n51.f.a(java.lang.Integer.valueOf(this.f454217q), java.lang.Integer.valueOf(drVar.f454217q)) && n51.f.a(java.lang.Integer.valueOf(this.f454218r), java.lang.Integer.valueOf(drVar.f454218r)) && n51.f.a(java.lang.Integer.valueOf(this.f454219s), java.lang.Integer.valueOf(drVar.f454219s)) && n51.f.a(java.lang.Integer.valueOf(this.f454220t), java.lang.Integer.valueOf(drVar.f454220t)) && n51.f.a(java.lang.Integer.valueOf(this.f454221u), java.lang.Integer.valueOf(drVar.f454221u)) && n51.f.a(java.lang.Integer.valueOf(this.f454222v), java.lang.Integer.valueOf(drVar.f454222v));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454207d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f454208e);
            java.lang.String str2 = this.f454209f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f454210g);
            fVar.e(5, this.f454211h);
            fVar.e(6, this.f454212i);
            fVar.e(7, this.f454213m);
            fVar.e(8, this.f454214n);
            java.lang.String str3 = this.f454215o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f454216p);
            fVar.e(11, this.f454217q);
            fVar.e(12, this.f454218r);
            fVar.e(13, this.f454219s);
            fVar.e(14, this.f454220t);
            fVar.e(15, this.f454221u);
            fVar.e(16, this.f454222v);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f454207d;
            int j17 = (str4 != null ? b36.f.j(1, str4) + 0 : 0) + b36.f.e(2, this.f454208e);
            java.lang.String str5 = this.f454209f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            int e17 = j17 + b36.f.e(4, this.f454210g) + b36.f.e(5, this.f454211h) + b36.f.e(6, this.f454212i) + b36.f.e(7, this.f454213m) + b36.f.e(8, this.f454214n);
            java.lang.String str6 = this.f454215o;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            return e17 + b36.f.e(10, this.f454216p) + b36.f.e(11, this.f454217q) + b36.f.e(12, this.f454218r) + b36.f.e(13, this.f454219s) + b36.f.e(14, this.f454220t) + b36.f.e(15, this.f454221u) + b36.f.e(16, this.f454222v);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.dr drVar = (r45.dr) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                drVar.f454207d = aVar2.k(intValue);
                return 0;
            case 2:
                drVar.f454208e = aVar2.g(intValue);
                return 0;
            case 3:
                drVar.f454209f = aVar2.k(intValue);
                return 0;
            case 4:
                drVar.f454210g = aVar2.g(intValue);
                return 0;
            case 5:
                drVar.f454211h = aVar2.g(intValue);
                return 0;
            case 6:
                drVar.f454212i = aVar2.g(intValue);
                return 0;
            case 7:
                drVar.f454213m = aVar2.g(intValue);
                return 0;
            case 8:
                drVar.f454214n = aVar2.g(intValue);
                return 0;
            case 9:
                drVar.f454215o = aVar2.k(intValue);
                return 0;
            case 10:
                drVar.f454216p = aVar2.g(intValue);
                return 0;
            case 11:
                drVar.f454217q = aVar2.g(intValue);
                return 0;
            case 12:
                drVar.f454218r = aVar2.g(intValue);
                return 0;
            case 13:
                drVar.f454219s = aVar2.g(intValue);
                return 0;
            case 14:
                drVar.f454220t = aVar2.g(intValue);
                return 0;
            case 15:
                drVar.f454221u = aVar2.g(intValue);
                return 0;
            case 16:
                drVar.f454222v = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
