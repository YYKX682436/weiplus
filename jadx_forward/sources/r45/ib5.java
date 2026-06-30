package r45;

/* loaded from: classes4.dex */
public class ib5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kj6 f458435d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f458436e;

    /* renamed from: f, reason: collision with root package name */
    public int f458437f;

    /* renamed from: g, reason: collision with root package name */
    public int f458438g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458439h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f458440i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f458441m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ib5)) {
            return false;
        }
        r45.ib5 ib5Var = (r45.ib5) fVar;
        return n51.f.a(this.f76494x2de60e5e, ib5Var.f76494x2de60e5e) && n51.f.a(this.f458435d, ib5Var.f458435d) && n51.f.a(java.lang.Boolean.valueOf(this.f458436e), java.lang.Boolean.valueOf(ib5Var.f458436e)) && n51.f.a(java.lang.Integer.valueOf(this.f458437f), java.lang.Integer.valueOf(ib5Var.f458437f)) && n51.f.a(java.lang.Integer.valueOf(this.f458438g), java.lang.Integer.valueOf(ib5Var.f458438g)) && n51.f.a(this.f458439h, ib5Var.f458439h) && n51.f.a(this.f458440i, ib5Var.f458440i) && n51.f.a(this.f458441m, ib5Var.f458441m);
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
            r45.kj6 kj6Var = this.f458435d;
            if (kj6Var != null) {
                fVar.i(2, kj6Var.mo75928xcd1e8d8());
                this.f458435d.mo75956x3d5d1f78(fVar);
            }
            fVar.a(3, this.f458436e);
            fVar.e(4, this.f458437f);
            fVar.e(5, this.f458438g);
            java.lang.String str = this.f458439h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f458440i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f458441m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kj6 kj6Var2 = this.f458435d;
            if (kj6Var2 != null) {
                i18 += b36.f.i(2, kj6Var2.mo75928xcd1e8d8());
            }
            int a17 = i18 + b36.f.a(3, this.f458436e) + b36.f.e(4, this.f458437f) + b36.f.e(5, this.f458438g);
            java.lang.String str4 = this.f458439h;
            if (str4 != null) {
                a17 += b36.f.j(6, str4);
            }
            java.lang.String str5 = this.f458440i;
            if (str5 != null) {
                a17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f458441m;
            return str6 != null ? a17 + b36.f.j(8, str6) : a17;
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
        r45.ib5 ib5Var = (r45.ib5) objArr[1];
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
                    ib5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kj6 kj6Var3 = new r45.kj6();
                    if (bArr2 != null && bArr2.length > 0) {
                        kj6Var3.mo11468x92b714fd(bArr2);
                    }
                    ib5Var.f458435d = kj6Var3;
                }
                return 0;
            case 3:
                ib5Var.f458436e = aVar2.c(intValue);
                return 0;
            case 4:
                ib5Var.f458437f = aVar2.g(intValue);
                return 0;
            case 5:
                ib5Var.f458438g = aVar2.g(intValue);
                return 0;
            case 6:
                ib5Var.f458439h = aVar2.k(intValue);
                return 0;
            case 7:
                ib5Var.f458440i = aVar2.k(intValue);
                return 0;
            case 8:
                ib5Var.f458441m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
