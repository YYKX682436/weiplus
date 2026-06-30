package r45;

/* loaded from: classes4.dex */
public class oi4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463812d;

    /* renamed from: e, reason: collision with root package name */
    public int f463813e;

    /* renamed from: f, reason: collision with root package name */
    public int f463814f;

    /* renamed from: g, reason: collision with root package name */
    public int f463815g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oi4)) {
            return false;
        }
        r45.oi4 oi4Var = (r45.oi4) fVar;
        return n51.f.a(this.f76494x2de60e5e, oi4Var.f76494x2de60e5e) && n51.f.a(this.f463812d, oi4Var.f463812d) && n51.f.a(java.lang.Integer.valueOf(this.f463813e), java.lang.Integer.valueOf(oi4Var.f463813e)) && n51.f.a(java.lang.Integer.valueOf(this.f463814f), java.lang.Integer.valueOf(oi4Var.f463814f)) && n51.f.a(java.lang.Integer.valueOf(this.f463815g), java.lang.Integer.valueOf(oi4Var.f463815g));
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
            java.lang.String str = this.f463812d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f463813e);
            fVar.e(4, this.f463814f);
            fVar.e(5, this.f463815g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f463812d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f463813e) + b36.f.e(4, this.f463814f) + b36.f.e(5, this.f463815g);
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
        r45.oi4 oi4Var = (r45.oi4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                oi4Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            oi4Var.f463812d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            oi4Var.f463813e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            oi4Var.f463814f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        oi4Var.f463815g = aVar2.g(intValue);
        return 0;
    }
}
