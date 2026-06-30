package r45;

/* loaded from: classes8.dex */
public class ut extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469159d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469160e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469161f;

    /* renamed from: g, reason: collision with root package name */
    public int f469162g;

    /* renamed from: h, reason: collision with root package name */
    public r45.iu f469163h;

    /* renamed from: i, reason: collision with root package name */
    public int f469164i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ut)) {
            return false;
        }
        r45.ut utVar = (r45.ut) fVar;
        return n51.f.a(this.f469159d, utVar.f469159d) && n51.f.a(this.f469160e, utVar.f469160e) && n51.f.a(this.f469161f, utVar.f469161f) && n51.f.a(java.lang.Integer.valueOf(this.f469162g), java.lang.Integer.valueOf(utVar.f469162g)) && n51.f.a(this.f469163h, utVar.f469163h) && n51.f.a(java.lang.Integer.valueOf(this.f469164i), java.lang.Integer.valueOf(utVar.f469164i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469159d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469160e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f469161f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f469162g);
            r45.iu iuVar = this.f469163h;
            if (iuVar != null) {
                fVar.i(5, iuVar.mo75928xcd1e8d8());
                this.f469163h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f469164i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f469159d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f469160e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f469161f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            int e17 = j17 + b36.f.e(4, this.f469162g);
            r45.iu iuVar2 = this.f469163h;
            if (iuVar2 != null) {
                e17 += b36.f.i(5, iuVar2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(6, this.f469164i);
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
        r45.ut utVar = (r45.ut) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                utVar.f469159d = aVar2.k(intValue);
                return 0;
            case 2:
                utVar.f469160e = aVar2.k(intValue);
                return 0;
            case 3:
                utVar.f469161f = aVar2.k(intValue);
                return 0;
            case 4:
                utVar.f469162g = aVar2.g(intValue);
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
                    utVar.f469163h = iuVar3;
                }
                return 0;
            case 6:
                utVar.f469164i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
