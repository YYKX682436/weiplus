package r45;

/* loaded from: classes8.dex */
public class k85 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460023d;

    /* renamed from: e, reason: collision with root package name */
    public r45.va7 f460024e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ya7 f460025f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ra7 f460026g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k85)) {
            return false;
        }
        r45.k85 k85Var = (r45.k85) fVar;
        return n51.f.a(this.f460023d, k85Var.f460023d) && n51.f.a(this.f460024e, k85Var.f460024e) && n51.f.a(this.f460025f, k85Var.f460025f) && n51.f.a(this.f460026g, k85Var.f460026g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460023d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.va7 va7Var = this.f460024e;
            if (va7Var != null) {
                fVar.i(2, va7Var.mo75928xcd1e8d8());
                this.f460024e.mo75956x3d5d1f78(fVar);
            }
            r45.ya7 ya7Var = this.f460025f;
            if (ya7Var != null) {
                fVar.i(3, ya7Var.mo75928xcd1e8d8());
                this.f460025f.mo75956x3d5d1f78(fVar);
            }
            r45.ra7 ra7Var = this.f460026g;
            if (ra7Var != null) {
                fVar.i(4, ra7Var.mo75928xcd1e8d8());
                this.f460026g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f460023d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.va7 va7Var2 = this.f460024e;
            if (va7Var2 != null) {
                j17 += b36.f.i(2, va7Var2.mo75928xcd1e8d8());
            }
            r45.ya7 ya7Var2 = this.f460025f;
            if (ya7Var2 != null) {
                j17 += b36.f.i(3, ya7Var2.mo75928xcd1e8d8());
            }
            r45.ra7 ra7Var2 = this.f460026g;
            return ra7Var2 != null ? j17 + b36.f.i(4, ra7Var2.mo75928xcd1e8d8()) : j17;
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
        r45.k85 k85Var = (r45.k85) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k85Var.f460023d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.va7 va7Var3 = new r45.va7();
                if (bArr != null && bArr.length > 0) {
                    va7Var3.mo11468x92b714fd(bArr);
                }
                k85Var.f460024e = va7Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j19.get(i19);
                r45.ya7 ya7Var3 = new r45.ya7();
                if (bArr2 != null && bArr2.length > 0) {
                    ya7Var3.mo11468x92b714fd(bArr2);
                }
                k85Var.f460025f = ya7Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j27.get(i27);
            r45.ra7 ra7Var3 = new r45.ra7();
            if (bArr3 != null && bArr3.length > 0) {
                ra7Var3.mo11468x92b714fd(bArr3);
            }
            k85Var.f460026g = ra7Var3;
        }
        return 0;
    }
}
