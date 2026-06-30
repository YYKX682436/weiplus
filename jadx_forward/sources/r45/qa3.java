package r45;

/* loaded from: classes8.dex */
public class qa3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f465324d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.r1 f465325e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465326f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qa3)) {
            return false;
        }
        r45.qa3 qa3Var = (r45.qa3) fVar;
        return n51.f.a(this.f465324d, qa3Var.f465324d) && n51.f.a(this.f465325e, qa3Var.f465325e) && n51.f.a(this.f465326f, qa3Var.f465326f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, this.f465324d);
            r45.r1 r1Var = this.f465325e;
            if (r1Var != null) {
                fVar.i(2, r1Var.mo75928xcd1e8d8());
                this.f465325e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f465326f;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, this.f465324d) + 0;
            r45.r1 r1Var2 = this.f465325e;
            if (r1Var2 != null) {
                g17 += b36.f.i(2, r1Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f465326f;
            return str2 != null ? g17 + b36.f.j(3, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f465324d.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.qa3 qa3Var = (r45.qa3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qa3Var.f465324d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            qa3Var.f465326f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.r1 r1Var3 = new r45.r1();
            if (bArr2 != null && bArr2.length > 0) {
                r1Var3.mo11468x92b714fd(bArr2);
            }
            qa3Var.f465325e = r1Var3;
        }
        return 0;
    }
}
