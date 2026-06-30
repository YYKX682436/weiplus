package r45;

/* loaded from: classes2.dex */
public class yr2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.sd1 f472851d;

    /* renamed from: e, reason: collision with root package name */
    public r45.sd1 f472852e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qb1 f472853f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yr2)) {
            return false;
        }
        r45.yr2 yr2Var = (r45.yr2) fVar;
        return n51.f.a(this.f472851d, yr2Var.f472851d) && n51.f.a(this.f472852e, yr2Var.f472852e) && n51.f.a(this.f472853f, yr2Var.f472853f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.sd1 sd1Var = this.f472851d;
            if (sd1Var != null) {
                fVar.i(1, sd1Var.mo75928xcd1e8d8());
                this.f472851d.mo75956x3d5d1f78(fVar);
            }
            r45.sd1 sd1Var2 = this.f472852e;
            if (sd1Var2 != null) {
                fVar.i(2, sd1Var2.mo75928xcd1e8d8());
                this.f472852e.mo75956x3d5d1f78(fVar);
            }
            r45.qb1 qb1Var = this.f472853f;
            if (qb1Var != null) {
                fVar.i(3, qb1Var.mo75928xcd1e8d8());
                this.f472853f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.sd1 sd1Var3 = this.f472851d;
            int i18 = sd1Var3 != null ? 0 + b36.f.i(1, sd1Var3.mo75928xcd1e8d8()) : 0;
            r45.sd1 sd1Var4 = this.f472852e;
            if (sd1Var4 != null) {
                i18 += b36.f.i(2, sd1Var4.mo75928xcd1e8d8());
            }
            r45.qb1 qb1Var2 = this.f472853f;
            return qb1Var2 != null ? i18 + b36.f.i(3, qb1Var2.mo75928xcd1e8d8()) : i18;
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
        r45.yr2 yr2Var = (r45.yr2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.sd1 sd1Var5 = new r45.sd1();
                if (bArr != null && bArr.length > 0) {
                    sd1Var5.mo11468x92b714fd(bArr);
                }
                yr2Var.f472851d = sd1Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.sd1 sd1Var6 = new r45.sd1();
                if (bArr2 != null && bArr2.length > 0) {
                    sd1Var6.mo11468x92b714fd(bArr2);
                }
                yr2Var.f472852e = sd1Var6;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.qb1 qb1Var3 = new r45.qb1();
            if (bArr3 != null && bArr3.length > 0) {
                qb1Var3.mo11468x92b714fd(bArr3);
            }
            yr2Var.f472853f = qb1Var3;
        }
        return 0;
    }
}
