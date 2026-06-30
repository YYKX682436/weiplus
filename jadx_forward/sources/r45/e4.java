package r45;

/* loaded from: classes8.dex */
public class e4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454526d;

    /* renamed from: e, reason: collision with root package name */
    public int f454527e;

    /* renamed from: f, reason: collision with root package name */
    public int f454528f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454529g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454530h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454531i;

    /* renamed from: m, reason: collision with root package name */
    public int f454532m;

    /* renamed from: n, reason: collision with root package name */
    public long f454533n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e4)) {
            return false;
        }
        r45.e4 e4Var = (r45.e4) fVar;
        return n51.f.a(this.f76494x2de60e5e, e4Var.f76494x2de60e5e) && n51.f.a(this.f454526d, e4Var.f454526d) && n51.f.a(java.lang.Integer.valueOf(this.f454527e), java.lang.Integer.valueOf(e4Var.f454527e)) && n51.f.a(java.lang.Integer.valueOf(this.f454528f), java.lang.Integer.valueOf(e4Var.f454528f)) && n51.f.a(this.f454529g, e4Var.f454529g) && n51.f.a(this.f454530h, e4Var.f454530h) && n51.f.a(this.f454531i, e4Var.f454531i) && n51.f.a(java.lang.Integer.valueOf(this.f454532m), java.lang.Integer.valueOf(e4Var.f454532m)) && n51.f.a(java.lang.Long.valueOf(this.f454533n), java.lang.Long.valueOf(e4Var.f454533n));
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
            java.lang.String str = this.f454526d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f454527e);
            fVar.e(4, this.f454528f);
            java.lang.String str2 = this.f454529g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f454530h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f454531i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f454532m);
            fVar.h(9, this.f454533n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f454526d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f454527e) + b36.f.e(4, this.f454528f);
            java.lang.String str6 = this.f454529g;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f454530h;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f454531i;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            return e17 + b36.f.e(8, this.f454532m) + b36.f.h(9, this.f454533n);
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
        r45.e4 e4Var = (r45.e4) objArr[1];
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
                    e4Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                e4Var.f454526d = aVar2.k(intValue);
                return 0;
            case 3:
                e4Var.f454527e = aVar2.g(intValue);
                return 0;
            case 4:
                e4Var.f454528f = aVar2.g(intValue);
                return 0;
            case 5:
                e4Var.f454529g = aVar2.k(intValue);
                return 0;
            case 6:
                e4Var.f454530h = aVar2.k(intValue);
                return 0;
            case 7:
                e4Var.f454531i = aVar2.k(intValue);
                return 0;
            case 8:
                e4Var.f454532m = aVar2.g(intValue);
                return 0;
            case 9:
                e4Var.f454533n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
