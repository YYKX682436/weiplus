package r45;

/* loaded from: classes4.dex */
public class ul6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469002d;

    /* renamed from: e, reason: collision with root package name */
    public int f469003e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469004f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f469005g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ul6)) {
            return false;
        }
        r45.ul6 ul6Var = (r45.ul6) fVar;
        return n51.f.a(this.f76494x2de60e5e, ul6Var.f76494x2de60e5e) && n51.f.a(this.f469002d, ul6Var.f469002d) && n51.f.a(java.lang.Integer.valueOf(this.f469003e), java.lang.Integer.valueOf(ul6Var.f469003e)) && n51.f.a(this.f469004f, ul6Var.f469004f) && n51.f.a(this.f469005g, ul6Var.f469005g);
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
            java.lang.String str = this.f469002d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f469003e);
            java.lang.String str2 = this.f469004f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.cu5 cu5Var = this.f469005g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.mo75928xcd1e8d8());
                this.f469005g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f469002d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f469003e);
            java.lang.String str4 = this.f469004f;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            r45.cu5 cu5Var2 = this.f469005g;
            return cu5Var2 != null ? e17 + b36.f.i(5, cu5Var2.mo75928xcd1e8d8()) : e17;
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
        r45.ul6 ul6Var = (r45.ul6) objArr[1];
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
                ul6Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ul6Var.f469002d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ul6Var.f469003e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ul6Var.f469004f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var3.b(bArr2);
            }
            ul6Var.f469005g = cu5Var3;
        }
        return 0;
    }
}
