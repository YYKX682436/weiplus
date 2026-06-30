package r45;

/* loaded from: classes9.dex */
public class sp4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f467429d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467430e;

    /* renamed from: f, reason: collision with root package name */
    public r45.n75 f467431f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sp4)) {
            return false;
        }
        r45.sp4 sp4Var = (r45.sp4) fVar;
        return n51.f.a(this.f76492x92037252, sp4Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f467429d), java.lang.Integer.valueOf(sp4Var.f467429d)) && n51.f.a(this.f467430e, sp4Var.f467430e) && n51.f.a(this.f467431f, sp4Var.f467431f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f467429d);
            java.lang.String str = this.f467430e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.n75 n75Var = this.f467431f;
            if (n75Var != null) {
                fVar.i(4, n75Var.mo75928xcd1e8d8());
                this.f467431f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f467429d);
            java.lang.String str2 = this.f467430e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.n75 n75Var2 = this.f467431f;
            return n75Var2 != null ? i18 + b36.f.i(4, n75Var2.mo75928xcd1e8d8()) : i18;
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
        r45.sp4 sp4Var = (r45.sp4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                sp4Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            sp4Var.f467429d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            sp4Var.f467430e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.n75 n75Var3 = new r45.n75();
            if (bArr2 != null && bArr2.length > 0) {
                n75Var3.mo11468x92b714fd(bArr2);
            }
            sp4Var.f467431f = n75Var3;
        }
        return 0;
    }
}
