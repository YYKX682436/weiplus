package r45;

/* loaded from: classes8.dex */
public class el5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ak5 f455126d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455127e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455128f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.el5)) {
            return false;
        }
        r45.el5 el5Var = (r45.el5) fVar;
        return n51.f.a(this.f455126d, el5Var.f455126d) && n51.f.a(this.f455127e, el5Var.f455127e) && n51.f.a(this.f455128f, el5Var.f455128f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ak5 ak5Var = this.f455126d;
            if (ak5Var != null) {
                fVar.i(1, ak5Var.mo75928xcd1e8d8());
                this.f455126d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f455127e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f455128f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ak5 ak5Var2 = this.f455126d;
            int i18 = ak5Var2 != null ? 0 + b36.f.i(1, ak5Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f455127e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f455128f;
            return str4 != null ? i18 + b36.f.j(3, str4) : i18;
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
        r45.el5 el5Var = (r45.el5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                el5Var.f455127e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            el5Var.f455128f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ak5 ak5Var3 = new r45.ak5();
            if (bArr != null && bArr.length > 0) {
                ak5Var3.mo11468x92b714fd(bArr);
            }
            el5Var.f455126d = ak5Var3;
        }
        return 0;
    }
}
