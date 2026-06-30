package r45;

/* loaded from: classes9.dex */
public class xt extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471917d;

    /* renamed from: e, reason: collision with root package name */
    public int f471918e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f471919f;

    /* renamed from: g, reason: collision with root package name */
    public r45.iu f471920g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471921h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xt)) {
            return false;
        }
        r45.xt xtVar = (r45.xt) fVar;
        return n51.f.a(this.f471917d, xtVar.f471917d) && n51.f.a(java.lang.Integer.valueOf(this.f471918e), java.lang.Integer.valueOf(xtVar.f471918e)) && n51.f.a(this.f471919f, xtVar.f471919f) && n51.f.a(this.f471920g, xtVar.f471920g) && n51.f.a(this.f471921h, xtVar.f471921h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471917d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f471918e);
            java.lang.String str2 = this.f471919f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.iu iuVar = this.f471920g;
            if (iuVar != null) {
                fVar.i(4, iuVar.mo75928xcd1e8d8());
                this.f471920g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f471921h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f471917d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f471918e);
            java.lang.String str5 = this.f471919f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            r45.iu iuVar2 = this.f471920g;
            if (iuVar2 != null) {
                j17 += b36.f.i(4, iuVar2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f471921h;
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
        r45.xt xtVar = (r45.xt) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xtVar.f471917d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            xtVar.f471918e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            xtVar.f471919f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            xtVar.f471921h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.iu iuVar3 = new r45.iu();
            if (bArr != null && bArr.length > 0) {
                iuVar3.mo11468x92b714fd(bArr);
            }
            xtVar.f471920g = iuVar3;
        }
        return 0;
    }
}
