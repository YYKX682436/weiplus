package r45;

/* loaded from: classes10.dex */
public class ns4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ls4 f463174d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463175e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463176f;

    /* renamed from: g, reason: collision with root package name */
    public long f463177g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463178h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463179i;

    /* renamed from: m, reason: collision with root package name */
    public int f463180m;

    /* renamed from: n, reason: collision with root package name */
    public int f463181n;

    /* renamed from: o, reason: collision with root package name */
    public long f463182o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f463183p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f463184q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ns4)) {
            return false;
        }
        r45.ns4 ns4Var = (r45.ns4) fVar;
        return n51.f.a(this.f463174d, ns4Var.f463174d) && n51.f.a(this.f463175e, ns4Var.f463175e) && n51.f.a(this.f463176f, ns4Var.f463176f) && n51.f.a(java.lang.Long.valueOf(this.f463177g), java.lang.Long.valueOf(ns4Var.f463177g)) && n51.f.a(this.f463178h, ns4Var.f463178h) && n51.f.a(this.f463179i, ns4Var.f463179i) && n51.f.a(java.lang.Integer.valueOf(this.f463180m), java.lang.Integer.valueOf(ns4Var.f463180m)) && n51.f.a(java.lang.Integer.valueOf(this.f463181n), java.lang.Integer.valueOf(ns4Var.f463181n)) && n51.f.a(java.lang.Long.valueOf(this.f463182o), java.lang.Long.valueOf(ns4Var.f463182o)) && n51.f.a(this.f463183p, ns4Var.f463183p) && n51.f.a(this.f463184q, ns4Var.f463184q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ls4 ls4Var = this.f463174d;
            if (ls4Var != null) {
                fVar.i(2, ls4Var.mo75928xcd1e8d8());
                this.f463174d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f463175e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f463176f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f463177g);
            java.lang.String str3 = this.f463178h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f463179i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(9, this.f463180m);
            fVar.e(13, this.f463181n);
            fVar.h(14, this.f463182o);
            java.lang.String str5 = this.f463183p;
            if (str5 != null) {
                fVar.j(15, str5);
            }
            java.lang.String str6 = this.f463184q;
            if (str6 != null) {
                fVar.j(16, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ls4 ls4Var2 = this.f463174d;
            int i18 = ls4Var2 != null ? 0 + b36.f.i(2, ls4Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f463175e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f463176f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            int h17 = i18 + b36.f.h(5, this.f463177g);
            java.lang.String str9 = this.f463178h;
            if (str9 != null) {
                h17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f463179i;
            if (str10 != null) {
                h17 += b36.f.j(7, str10);
            }
            int e17 = h17 + b36.f.e(9, this.f463180m) + b36.f.e(13, this.f463181n) + b36.f.h(14, this.f463182o);
            java.lang.String str11 = this.f463183p;
            if (str11 != null) {
                e17 += b36.f.j(15, str11);
            }
            java.lang.String str12 = this.f463184q;
            return str12 != null ? e17 + b36.f.j(16, str12) : e17;
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
        r45.ns4 ns4Var = (r45.ns4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ls4 ls4Var3 = new r45.ls4();
                    if (bArr != null && bArr.length > 0) {
                        ls4Var3.mo11468x92b714fd(bArr);
                    }
                    ns4Var.f463174d = ls4Var3;
                }
                return 0;
            case 3:
                ns4Var.f463175e = aVar2.k(intValue);
                return 0;
            case 4:
                ns4Var.f463176f = aVar2.k(intValue);
                return 0;
            case 5:
                ns4Var.f463177g = aVar2.i(intValue);
                return 0;
            case 6:
                ns4Var.f463178h = aVar2.k(intValue);
                return 0;
            case 7:
                ns4Var.f463179i = aVar2.k(intValue);
                return 0;
            case 8:
            case 10:
            case 11:
            case 12:
            default:
                return -1;
            case 9:
                ns4Var.f463180m = aVar2.g(intValue);
                return 0;
            case 13:
                ns4Var.f463181n = aVar2.g(intValue);
                return 0;
            case 14:
                ns4Var.f463182o = aVar2.i(intValue);
                return 0;
            case 15:
                ns4Var.f463183p = aVar2.k(intValue);
                return 0;
            case 16:
                ns4Var.f463184q = aVar2.k(intValue);
                return 0;
        }
    }
}
