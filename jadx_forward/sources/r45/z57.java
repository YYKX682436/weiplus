package r45;

/* loaded from: classes9.dex */
public class z57 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473272d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473273e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473274f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f473275g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z57)) {
            return false;
        }
        r45.z57 z57Var = (r45.z57) fVar;
        return n51.f.a(this.f473272d, z57Var.f473272d) && n51.f.a(this.f473273e, z57Var.f473273e) && n51.f.a(this.f473274f, z57Var.f473274f) && n51.f.a(this.f473275g, z57Var.f473275g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f473272d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f473273e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f473274f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            r45.cu5 cu5Var = this.f473275g;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.mo75928xcd1e8d8());
                this.f473275g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f473272d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f473273e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f473274f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            r45.cu5 cu5Var2 = this.f473275g;
            return cu5Var2 != null ? j17 + b36.f.i(4, cu5Var2.mo75928xcd1e8d8()) : j17;
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
        r45.z57 z57Var = (r45.z57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            z57Var.f473272d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            z57Var.f473273e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            z57Var.f473274f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            z57Var.f473275g = cu5Var3;
        }
        return 0;
    }
}
