package r45;

/* loaded from: classes4.dex */
public class db6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453818d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453819e;

    /* renamed from: f, reason: collision with root package name */
    public long f453820f;

    /* renamed from: g, reason: collision with root package name */
    public int f453821g;

    /* renamed from: h, reason: collision with root package name */
    public long f453822h;

    /* renamed from: i, reason: collision with root package name */
    public int f453823i;

    /* renamed from: m, reason: collision with root package name */
    public int f453824m;

    /* renamed from: n, reason: collision with root package name */
    public int f453825n;

    /* renamed from: o, reason: collision with root package name */
    public int f453826o;

    /* renamed from: p, reason: collision with root package name */
    public int f453827p;

    /* renamed from: q, reason: collision with root package name */
    public int f453828q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.db6)) {
            return false;
        }
        r45.db6 db6Var = (r45.db6) fVar;
        return n51.f.a(this.f76494x2de60e5e, db6Var.f76494x2de60e5e) && n51.f.a(this.f453818d, db6Var.f453818d) && n51.f.a(this.f453819e, db6Var.f453819e) && n51.f.a(java.lang.Long.valueOf(this.f453820f), java.lang.Long.valueOf(db6Var.f453820f)) && n51.f.a(java.lang.Integer.valueOf(this.f453821g), java.lang.Integer.valueOf(db6Var.f453821g)) && n51.f.a(java.lang.Long.valueOf(this.f453822h), java.lang.Long.valueOf(db6Var.f453822h)) && n51.f.a(java.lang.Integer.valueOf(this.f453823i), java.lang.Integer.valueOf(db6Var.f453823i)) && n51.f.a(java.lang.Integer.valueOf(this.f453824m), java.lang.Integer.valueOf(db6Var.f453824m)) && n51.f.a(java.lang.Integer.valueOf(this.f453825n), java.lang.Integer.valueOf(db6Var.f453825n)) && n51.f.a(java.lang.Integer.valueOf(this.f453826o), java.lang.Integer.valueOf(db6Var.f453826o)) && n51.f.a(java.lang.Integer.valueOf(this.f453827p), java.lang.Integer.valueOf(db6Var.f453827p)) && n51.f.a(java.lang.Integer.valueOf(this.f453828q), java.lang.Integer.valueOf(db6Var.f453828q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f453818d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f453819e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f453820f);
            fVar.e(5, this.f453821g);
            fVar.h(6, this.f453822h);
            fVar.e(7, this.f453823i);
            fVar.e(8, this.f453824m);
            fVar.e(9, this.f453825n);
            fVar.e(10, this.f453826o);
            fVar.e(11, this.f453827p);
            fVar.e(12, this.f453828q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f453818d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f453819e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.h(4, this.f453820f) + b36.f.e(5, this.f453821g) + b36.f.h(6, this.f453822h) + b36.f.e(7, this.f453823i) + b36.f.e(8, this.f453824m) + b36.f.e(9, this.f453825n) + b36.f.e(10, this.f453826o) + b36.f.e(11, this.f453827p) + b36.f.e(12, this.f453828q);
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
        r45.db6 db6Var = (r45.db6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    db6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                db6Var.f453818d = aVar2.k(intValue);
                return 0;
            case 3:
                db6Var.f453819e = aVar2.k(intValue);
                return 0;
            case 4:
                db6Var.f453820f = aVar2.i(intValue);
                return 0;
            case 5:
                db6Var.f453821g = aVar2.g(intValue);
                return 0;
            case 6:
                db6Var.f453822h = aVar2.i(intValue);
                return 0;
            case 7:
                db6Var.f453823i = aVar2.g(intValue);
                return 0;
            case 8:
                db6Var.f453824m = aVar2.g(intValue);
                return 0;
            case 9:
                db6Var.f453825n = aVar2.g(intValue);
                return 0;
            case 10:
                db6Var.f453826o = aVar2.g(intValue);
                return 0;
            case 11:
                db6Var.f453827p = aVar2.g(intValue);
                return 0;
            case 12:
                db6Var.f453828q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
