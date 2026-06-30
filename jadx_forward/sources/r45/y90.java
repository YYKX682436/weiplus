package r45;

/* loaded from: classes4.dex */
public class y90 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472410d;

    /* renamed from: e, reason: collision with root package name */
    public long f472411e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472412f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472413g;

    /* renamed from: h, reason: collision with root package name */
    public int f472414h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472415i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f472416m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y90)) {
            return false;
        }
        r45.y90 y90Var = (r45.y90) fVar;
        return n51.f.a(this.f76494x2de60e5e, y90Var.f76494x2de60e5e) && n51.f.a(this.f472410d, y90Var.f472410d) && n51.f.a(java.lang.Long.valueOf(this.f472411e), java.lang.Long.valueOf(y90Var.f472411e)) && n51.f.a(this.f472412f, y90Var.f472412f) && n51.f.a(this.f472413g, y90Var.f472413g) && n51.f.a(java.lang.Integer.valueOf(this.f472414h), java.lang.Integer.valueOf(y90Var.f472414h)) && n51.f.a(this.f472415i, y90Var.f472415i) && n51.f.a(java.lang.Boolean.valueOf(this.f472416m), java.lang.Boolean.valueOf(y90Var.f472416m));
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
            java.lang.String str = this.f472410d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f472411e);
            java.lang.String str2 = this.f472412f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f472413g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f472414h);
            java.lang.String str4 = this.f472415i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.a(8, this.f472416m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f472410d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int h17 = i18 + b36.f.h(3, this.f472411e);
            java.lang.String str6 = this.f472412f;
            if (str6 != null) {
                h17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f472413g;
            if (str7 != null) {
                h17 += b36.f.j(5, str7);
            }
            int e17 = h17 + b36.f.e(6, this.f472414h);
            java.lang.String str8 = this.f472415i;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            return e17 + b36.f.a(8, this.f472416m);
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
        r45.y90 y90Var = (r45.y90) objArr[1];
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
                    y90Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                y90Var.f472410d = aVar2.k(intValue);
                return 0;
            case 3:
                y90Var.f472411e = aVar2.i(intValue);
                return 0;
            case 4:
                y90Var.f472412f = aVar2.k(intValue);
                return 0;
            case 5:
                y90Var.f472413g = aVar2.k(intValue);
                return 0;
            case 6:
                y90Var.f472414h = aVar2.g(intValue);
                return 0;
            case 7:
                y90Var.f472415i = aVar2.k(intValue);
                return 0;
            case 8:
                y90Var.f472416m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
