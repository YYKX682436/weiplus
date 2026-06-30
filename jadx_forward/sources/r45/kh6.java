package r45;

/* loaded from: classes9.dex */
public class kh6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.gc f460234d;

    /* renamed from: e, reason: collision with root package name */
    public int f460235e;

    /* renamed from: f, reason: collision with root package name */
    public r45.kc f460236f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460237g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kh6)) {
            return false;
        }
        r45.kh6 kh6Var = (r45.kh6) fVar;
        return n51.f.a(this.f76492x92037252, kh6Var.f76492x92037252) && n51.f.a(this.f460234d, kh6Var.f460234d) && n51.f.a(java.lang.Integer.valueOf(this.f460235e), java.lang.Integer.valueOf(kh6Var.f460235e)) && n51.f.a(this.f460236f, kh6Var.f460236f) && n51.f.a(this.f460237g, kh6Var.f460237g);
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
            r45.gc gcVar = this.f460234d;
            if (gcVar != null) {
                fVar.i(2, gcVar.mo75928xcd1e8d8());
                this.f460234d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f460235e);
            r45.kc kcVar = this.f460236f;
            if (kcVar != null) {
                fVar.i(4, kcVar.mo75928xcd1e8d8());
                this.f460236f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f460237g;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.gc gcVar2 = this.f460234d;
            if (gcVar2 != null) {
                i18 += b36.f.i(2, gcVar2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f460235e);
            r45.kc kcVar2 = this.f460236f;
            if (kcVar2 != null) {
                e17 += b36.f.i(4, kcVar2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f460237g;
            return str2 != null ? e17 + b36.f.j(5, str2) : e17;
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
        r45.kh6 kh6Var = (r45.kh6) objArr[1];
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
                kh6Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.gc gcVar3 = new r45.gc();
                if (bArr2 != null && bArr2.length > 0) {
                    gcVar3.mo11468x92b714fd(bArr2);
                }
                kh6Var.f460234d = gcVar3;
            }
            return 0;
        }
        if (intValue == 3) {
            kh6Var.f460235e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            kh6Var.f460237g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.kc kcVar3 = new r45.kc();
            if (bArr3 != null && bArr3.length > 0) {
                kcVar3.mo11468x92b714fd(bArr3);
            }
            kh6Var.f460236f = kcVar3;
        }
        return 0;
    }
}
