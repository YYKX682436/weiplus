package bo1;

/* loaded from: classes2.dex */
public class h extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f104528d;

    /* renamed from: e, reason: collision with root package name */
    public int f104529e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f104530f;

    /* renamed from: g, reason: collision with root package name */
    public bo1.q f104531g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f104532h;

    /* renamed from: i, reason: collision with root package name */
    public bo1.n f104533i;

    /* renamed from: m, reason: collision with root package name */
    public int f104534m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f104535n;

    /* renamed from: o, reason: collision with root package name */
    public bo1.i f104536o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bo1.h)) {
            return false;
        }
        bo1.h hVar = (bo1.h) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f104528d), java.lang.Long.valueOf(hVar.f104528d)) && n51.f.a(java.lang.Integer.valueOf(this.f104529e), java.lang.Integer.valueOf(hVar.f104529e)) && n51.f.a(this.f104530f, hVar.f104530f) && n51.f.a(this.f104531g, hVar.f104531g) && n51.f.a(this.f104532h, hVar.f104532h) && n51.f.a(this.f104533i, hVar.f104533i) && n51.f.a(java.lang.Integer.valueOf(this.f104534m), java.lang.Integer.valueOf(hVar.f104534m)) && n51.f.a(this.f104535n, hVar.f104535n) && n51.f.a(this.f104536o, hVar.f104536o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f104528d);
            fVar.e(2, this.f104529e);
            java.lang.String str = this.f104530f;
            if (str != null) {
                fVar.j(3, str);
            }
            bo1.q qVar = this.f104531g;
            if (qVar != null) {
                fVar.i(4, qVar.mo75928xcd1e8d8());
                this.f104531g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f104532h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            bo1.n nVar = this.f104533i;
            if (nVar != null) {
                fVar.i(6, nVar.mo75928xcd1e8d8());
                this.f104533i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f104534m);
            java.lang.String str3 = this.f104535n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            bo1.i iVar = this.f104536o;
            if (iVar != null) {
                fVar.i(10, iVar.mo75928xcd1e8d8());
                this.f104536o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f104528d) + 0 + b36.f.e(2, this.f104529e);
            java.lang.String str4 = this.f104530f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            bo1.q qVar2 = this.f104531g;
            if (qVar2 != null) {
                h17 += b36.f.i(4, qVar2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f104532h;
            if (str5 != null) {
                h17 += b36.f.j(5, str5);
            }
            bo1.n nVar2 = this.f104533i;
            if (nVar2 != null) {
                h17 += b36.f.i(6, nVar2.mo75928xcd1e8d8());
            }
            int e17 = h17 + b36.f.e(7, this.f104534m);
            java.lang.String str6 = this.f104535n;
            if (str6 != null) {
                e17 += b36.f.j(8, str6);
            }
            bo1.i iVar2 = this.f104536o;
            return iVar2 != null ? e17 + b36.f.i(10, iVar2.mo75928xcd1e8d8()) : e17;
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
        bo1.h hVar = (bo1.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hVar.f104528d = aVar2.i(intValue);
                return 0;
            case 2:
                hVar.f104529e = aVar2.g(intValue);
                return 0;
            case 3:
                hVar.f104530f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bo1.q qVar3 = new bo1.q();
                    if (bArr != null && bArr.length > 0) {
                        qVar3.mo11468x92b714fd(bArr);
                    }
                    hVar.f104531g = qVar3;
                }
                return 0;
            case 5:
                hVar.f104532h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bo1.n nVar3 = new bo1.n();
                    if (bArr2 != null && bArr2.length > 0) {
                        nVar3.mo11468x92b714fd(bArr2);
                    }
                    hVar.f104533i = nVar3;
                }
                return 0;
            case 7:
                hVar.f104534m = aVar2.g(intValue);
                return 0;
            case 8:
                hVar.f104535n = aVar2.k(intValue);
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bo1.i iVar3 = new bo1.i();
                    if (bArr3 != null && bArr3.length > 0) {
                        iVar3.mo11468x92b714fd(bArr3);
                    }
                    hVar.f104536o = iVar3;
                }
                return 0;
        }
    }
}
