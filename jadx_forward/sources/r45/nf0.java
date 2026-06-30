package r45;

/* loaded from: classes9.dex */
public class nf0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462869d;

    /* renamed from: e, reason: collision with root package name */
    public int f462870e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462871f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462872g;

    /* renamed from: h, reason: collision with root package name */
    public int f462873h;

    /* renamed from: i, reason: collision with root package name */
    public int f462874i;

    /* renamed from: m, reason: collision with root package name */
    public int f462875m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f462876n;

    /* renamed from: o, reason: collision with root package name */
    public int f462877o;

    /* renamed from: p, reason: collision with root package name */
    public int f462878p;

    /* renamed from: q, reason: collision with root package name */
    public int f462879q;

    /* renamed from: r, reason: collision with root package name */
    public long f462880r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nf0)) {
            return false;
        }
        r45.nf0 nf0Var = (r45.nf0) fVar;
        return n51.f.a(this.f76494x2de60e5e, nf0Var.f76494x2de60e5e) && n51.f.a(this.f462869d, nf0Var.f462869d) && n51.f.a(java.lang.Integer.valueOf(this.f462870e), java.lang.Integer.valueOf(nf0Var.f462870e)) && n51.f.a(this.f462871f, nf0Var.f462871f) && n51.f.a(this.f462872g, nf0Var.f462872g) && n51.f.a(java.lang.Integer.valueOf(this.f462873h), java.lang.Integer.valueOf(nf0Var.f462873h)) && n51.f.a(java.lang.Integer.valueOf(this.f462874i), java.lang.Integer.valueOf(nf0Var.f462874i)) && n51.f.a(java.lang.Integer.valueOf(this.f462875m), java.lang.Integer.valueOf(nf0Var.f462875m)) && n51.f.a(this.f462876n, nf0Var.f462876n) && n51.f.a(java.lang.Integer.valueOf(this.f462877o), java.lang.Integer.valueOf(nf0Var.f462877o)) && n51.f.a(java.lang.Integer.valueOf(this.f462878p), java.lang.Integer.valueOf(nf0Var.f462878p)) && n51.f.a(java.lang.Integer.valueOf(this.f462879q), java.lang.Integer.valueOf(nf0Var.f462879q)) && n51.f.a(java.lang.Long.valueOf(this.f462880r), java.lang.Long.valueOf(nf0Var.f462880r));
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
            java.lang.String str = this.f462869d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f462870e);
            java.lang.String str2 = this.f462871f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f462872g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f462873h);
            fVar.e(7, this.f462874i);
            fVar.e(8, this.f462875m);
            java.lang.String str4 = this.f462876n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f462877o);
            fVar.e(11, this.f462878p);
            fVar.e(12, this.f462879q);
            fVar.h(13, this.f462880r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f462869d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f462870e);
            java.lang.String str6 = this.f462871f;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f462872g;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            int e18 = e17 + b36.f.e(6, this.f462873h) + b36.f.e(7, this.f462874i) + b36.f.e(8, this.f462875m);
            java.lang.String str8 = this.f462876n;
            if (str8 != null) {
                e18 += b36.f.j(9, str8);
            }
            return e18 + b36.f.e(10, this.f462877o) + b36.f.e(11, this.f462878p) + b36.f.e(12, this.f462879q) + b36.f.h(13, this.f462880r);
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
        r45.nf0 nf0Var = (r45.nf0) objArr[1];
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
                    nf0Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                nf0Var.f462869d = aVar2.k(intValue);
                return 0;
            case 3:
                nf0Var.f462870e = aVar2.g(intValue);
                return 0;
            case 4:
                nf0Var.f462871f = aVar2.k(intValue);
                return 0;
            case 5:
                nf0Var.f462872g = aVar2.k(intValue);
                return 0;
            case 6:
                nf0Var.f462873h = aVar2.g(intValue);
                return 0;
            case 7:
                nf0Var.f462874i = aVar2.g(intValue);
                return 0;
            case 8:
                nf0Var.f462875m = aVar2.g(intValue);
                return 0;
            case 9:
                nf0Var.f462876n = aVar2.k(intValue);
                return 0;
            case 10:
                nf0Var.f462877o = aVar2.g(intValue);
                return 0;
            case 11:
                nf0Var.f462878p = aVar2.g(intValue);
                return 0;
            case 12:
                nf0Var.f462879q = aVar2.g(intValue);
                return 0;
            case 13:
                nf0Var.f462880r = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
