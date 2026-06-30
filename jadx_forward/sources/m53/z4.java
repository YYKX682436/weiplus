package m53;

/* loaded from: classes8.dex */
public class z4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405766d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405767e;

    /* renamed from: f, reason: collision with root package name */
    public m53.g f405768f;

    /* renamed from: g, reason: collision with root package name */
    public int f405769g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.z4)) {
            return false;
        }
        m53.z4 z4Var = (m53.z4) fVar;
        return n51.f.a(this.f76494x2de60e5e, z4Var.f76494x2de60e5e) && n51.f.a(this.f405766d, z4Var.f405766d) && n51.f.a(this.f405767e, z4Var.f405767e) && n51.f.a(this.f405768f, z4Var.f405768f) && n51.f.a(java.lang.Integer.valueOf(this.f405769g), java.lang.Integer.valueOf(z4Var.f405769g));
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
            java.lang.String str = this.f405766d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f405767e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            m53.g gVar = this.f405768f;
            if (gVar != null) {
                fVar.i(4, gVar.mo75928xcd1e8d8());
                this.f405768f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f405769g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f405766d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f405767e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            m53.g gVar2 = this.f405768f;
            if (gVar2 != null) {
                i18 += b36.f.i(4, gVar2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(6, this.f405769g);
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
        m53.z4 z4Var = (m53.z4) objArr[1];
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
                z4Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            z4Var.f405766d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            z4Var.f405767e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 6) {
                return -1;
            }
            z4Var.f405769g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            m53.g gVar3 = new m53.g();
            if (bArr2 != null && bArr2.length > 0) {
                gVar3.mo11468x92b714fd(bArr2);
            }
            z4Var.f405768f = gVar3;
        }
        return 0;
    }
}
