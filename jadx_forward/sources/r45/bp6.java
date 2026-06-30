package r45;

/* loaded from: classes9.dex */
public class bp6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f452484d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452485e;

    /* renamed from: f, reason: collision with root package name */
    public r45.lj5 f452486f;

    /* renamed from: g, reason: collision with root package name */
    public r45.po5 f452487g;

    /* renamed from: h, reason: collision with root package name */
    public int f452488h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452489i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bp6)) {
            return false;
        }
        r45.bp6 bp6Var = (r45.bp6) fVar;
        return n51.f.a(this.f76492x92037252, bp6Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f452484d), java.lang.Integer.valueOf(bp6Var.f452484d)) && n51.f.a(this.f452485e, bp6Var.f452485e) && n51.f.a(this.f452486f, bp6Var.f452486f) && n51.f.a(this.f452487g, bp6Var.f452487g) && n51.f.a(java.lang.Integer.valueOf(this.f452488h), java.lang.Integer.valueOf(bp6Var.f452488h)) && n51.f.a(this.f452489i, bp6Var.f452489i);
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
            fVar.e(2, this.f452484d);
            java.lang.String str = this.f452485e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.lj5 lj5Var = this.f452486f;
            if (lj5Var != null) {
                fVar.i(4, lj5Var.mo75928xcd1e8d8());
                this.f452486f.mo75956x3d5d1f78(fVar);
            }
            r45.po5 po5Var = this.f452487g;
            if (po5Var != null) {
                fVar.i(5, po5Var.mo75928xcd1e8d8());
                this.f452487g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f452488h);
            java.lang.String str2 = this.f452489i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f452484d);
            java.lang.String str3 = this.f452485e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.lj5 lj5Var2 = this.f452486f;
            if (lj5Var2 != null) {
                i18 += b36.f.i(4, lj5Var2.mo75928xcd1e8d8());
            }
            r45.po5 po5Var2 = this.f452487g;
            if (po5Var2 != null) {
                i18 += b36.f.i(5, po5Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(6, this.f452488h);
            java.lang.String str4 = this.f452489i;
            return str4 != null ? e17 + b36.f.j(7, str4) : e17;
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
        r45.bp6 bp6Var = (r45.bp6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    bp6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                bp6Var.f452484d = aVar2.g(intValue);
                return 0;
            case 3:
                bp6Var.f452485e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.lj5 lj5Var3 = new r45.lj5();
                    if (bArr2 != null && bArr2.length > 0) {
                        lj5Var3.mo11468x92b714fd(bArr2);
                    }
                    bp6Var.f452486f = lj5Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.po5 po5Var3 = new r45.po5();
                    if (bArr3 != null && bArr3.length > 0) {
                        po5Var3.mo11468x92b714fd(bArr3);
                    }
                    bp6Var.f452487g = po5Var3;
                }
                return 0;
            case 6:
                bp6Var.f452488h = aVar2.g(intValue);
                return 0;
            case 7:
                bp6Var.f452489i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
