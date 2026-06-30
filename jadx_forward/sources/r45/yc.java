package r45;

/* loaded from: classes7.dex */
public class yc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472488d;

    /* renamed from: e, reason: collision with root package name */
    public int f472489e;

    /* renamed from: f, reason: collision with root package name */
    public r45.lb5 f472490f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472491g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472492h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yc)) {
            return false;
        }
        r45.yc ycVar = (r45.yc) fVar;
        return n51.f.a(this.f472488d, ycVar.f472488d) && n51.f.a(java.lang.Integer.valueOf(this.f472489e), java.lang.Integer.valueOf(ycVar.f472489e)) && n51.f.a(this.f472490f, ycVar.f472490f) && n51.f.a(this.f472491g, ycVar.f472491g) && n51.f.a(this.f472492h, ycVar.f472492h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472488d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f472489e);
            r45.lb5 lb5Var = this.f472490f;
            if (lb5Var != null) {
                fVar.i(3, lb5Var.mo75928xcd1e8d8());
                this.f472490f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f472491g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f472492h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f472488d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f472489e);
            r45.lb5 lb5Var2 = this.f472490f;
            if (lb5Var2 != null) {
                j17 += b36.f.i(3, lb5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f472491g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f472492h;
            return str6 != null ? j17 + b36.f.j(5, str6) : j17;
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
        r45.yc ycVar = (r45.yc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ycVar.f472488d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ycVar.f472489e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                ycVar.f472491g = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            ycVar.f472492h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.lb5 lb5Var3 = new r45.lb5();
            if (bArr != null && bArr.length > 0) {
                lb5Var3.mo11468x92b714fd(bArr);
            }
            ycVar.f472490f = lb5Var3;
        }
        return 0;
    }
}
