package r45;

/* loaded from: classes4.dex */
public class x0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f471146d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471147e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f471148f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f471149g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x0)) {
            return false;
        }
        r45.x0 x0Var = (r45.x0) fVar;
        return n51.f.a(this.f76494x2de60e5e, x0Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f471146d), java.lang.Integer.valueOf(x0Var.f471146d)) && n51.f.a(this.f471147e, x0Var.f471147e) && n51.f.a(this.f471148f, x0Var.f471148f) && n51.f.a(java.lang.Boolean.valueOf(this.f471149g), java.lang.Boolean.valueOf(x0Var.f471149g));
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
            fVar.e(2, this.f471146d);
            java.lang.String str = this.f471147e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f471148f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f471149g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f471146d);
            java.lang.String str3 = this.f471147e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f471148f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.a(5, this.f471149g);
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
        r45.x0 x0Var = (r45.x0) objArr[1];
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
                x0Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            x0Var.f471146d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            x0Var.f471147e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            x0Var.f471148f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        x0Var.f471149g = aVar2.c(intValue);
        return 0;
    }
}
