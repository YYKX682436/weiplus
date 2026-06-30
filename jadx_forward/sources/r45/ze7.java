package r45;

/* loaded from: classes4.dex */
public class ze7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473495d;

    /* renamed from: e, reason: collision with root package name */
    public int f473496e;

    /* renamed from: f, reason: collision with root package name */
    public int f473497f;

    /* renamed from: g, reason: collision with root package name */
    public int f473498g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ze7)) {
            return false;
        }
        r45.ze7 ze7Var = (r45.ze7) fVar;
        return n51.f.a(this.f76494x2de60e5e, ze7Var.f76494x2de60e5e) && n51.f.a(this.f473495d, ze7Var.f473495d) && n51.f.a(java.lang.Integer.valueOf(this.f473496e), java.lang.Integer.valueOf(ze7Var.f473496e)) && n51.f.a(java.lang.Integer.valueOf(this.f473497f), java.lang.Integer.valueOf(ze7Var.f473497f)) && n51.f.a(java.lang.Integer.valueOf(this.f473498g), java.lang.Integer.valueOf(ze7Var.f473498g));
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
            java.lang.String str = this.f473495d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f473496e);
            fVar.e(4, this.f473497f);
            fVar.e(5, this.f473498g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f473495d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f473496e) + b36.f.e(4, this.f473497f) + b36.f.e(5, this.f473498g);
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
        r45.ze7 ze7Var = (r45.ze7) objArr[1];
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
                ze7Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ze7Var.f473495d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ze7Var.f473496e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ze7Var.f473497f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ze7Var.f473498g = aVar2.g(intValue);
        return 0;
    }
}
