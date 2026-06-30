package r45;

/* loaded from: classes9.dex */
public class st extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467500d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467501e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467502f;

    /* renamed from: g, reason: collision with root package name */
    public int f467503g;

    /* renamed from: h, reason: collision with root package name */
    public r45.iu f467504h;

    /* renamed from: i, reason: collision with root package name */
    public int f467505i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.st)) {
            return false;
        }
        r45.st stVar = (r45.st) fVar;
        return n51.f.a(this.f467500d, stVar.f467500d) && n51.f.a(this.f467501e, stVar.f467501e) && n51.f.a(this.f467502f, stVar.f467502f) && n51.f.a(java.lang.Integer.valueOf(this.f467503g), java.lang.Integer.valueOf(stVar.f467503g)) && n51.f.a(this.f467504h, stVar.f467504h) && n51.f.a(java.lang.Integer.valueOf(this.f467505i), java.lang.Integer.valueOf(stVar.f467505i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467500d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467501e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f467502f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f467503g);
            r45.iu iuVar = this.f467504h;
            if (iuVar != null) {
                fVar.i(5, iuVar.mo75928xcd1e8d8());
                this.f467504h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f467505i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f467500d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f467501e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f467502f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            int e17 = j17 + b36.f.e(4, this.f467503g);
            r45.iu iuVar2 = this.f467504h;
            if (iuVar2 != null) {
                e17 += b36.f.i(5, iuVar2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(6, this.f467505i);
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
        r45.st stVar = (r45.st) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                stVar.f467500d = aVar2.k(intValue);
                return 0;
            case 2:
                stVar.f467501e = aVar2.k(intValue);
                return 0;
            case 3:
                stVar.f467502f = aVar2.k(intValue);
                return 0;
            case 4:
                stVar.f467503g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr != null && bArr.length > 0) {
                        iuVar3.mo11468x92b714fd(bArr);
                    }
                    stVar.f467504h = iuVar3;
                }
                return 0;
            case 6:
                stVar.f467505i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
