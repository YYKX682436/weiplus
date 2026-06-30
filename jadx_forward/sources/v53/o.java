package v53;

/* loaded from: classes4.dex */
public class o extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f514884d;

    /* renamed from: e, reason: collision with root package name */
    public v53.n f514885e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f514886f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f514887g;

    /* renamed from: h, reason: collision with root package name */
    public v53.a f514888h;

    /* renamed from: i, reason: collision with root package name */
    public v53.c f514889i;

    /* renamed from: m, reason: collision with root package name */
    public int f514890m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof v53.o)) {
            return false;
        }
        v53.o oVar = (v53.o) fVar;
        return n51.f.a(this.f514884d, oVar.f514884d) && n51.f.a(this.f514885e, oVar.f514885e) && n51.f.a(this.f514886f, oVar.f514886f) && n51.f.a(this.f514887g, oVar.f514887g) && n51.f.a(this.f514888h, oVar.f514888h) && n51.f.a(this.f514889i, oVar.f514889i) && n51.f.a(java.lang.Integer.valueOf(this.f514890m), java.lang.Integer.valueOf(oVar.f514890m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f514884d;
            if (str != null) {
                fVar.j(1, str);
            }
            v53.n nVar = this.f514885e;
            if (nVar != null) {
                fVar.i(2, nVar.mo75928xcd1e8d8());
                this.f514885e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f514886f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f514887g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            v53.a aVar = this.f514888h;
            if (aVar != null) {
                fVar.i(5, aVar.mo75928xcd1e8d8());
                this.f514888h.mo75956x3d5d1f78(fVar);
            }
            v53.c cVar = this.f514889i;
            if (cVar != null) {
                fVar.i(6, cVar.mo75928xcd1e8d8());
                this.f514889i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f514890m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f514884d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            v53.n nVar2 = this.f514885e;
            if (nVar2 != null) {
                j17 += b36.f.i(2, nVar2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f514886f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f514887g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            v53.a aVar2 = this.f514888h;
            if (aVar2 != null) {
                j17 += b36.f.i(5, aVar2.mo75928xcd1e8d8());
            }
            v53.c cVar2 = this.f514889i;
            if (cVar2 != null) {
                j17 += b36.f.i(6, cVar2.mo75928xcd1e8d8());
            }
            return j17 + b36.f.e(7, this.f514890m);
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3)) {
                if (!super.mo75949x4476b383(aVar3, this, m75958x5767edba)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        v53.o oVar = (v53.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oVar.f514884d = aVar4.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    v53.n nVar3 = new v53.n();
                    if (bArr != null && bArr.length > 0) {
                        nVar3.mo11468x92b714fd(bArr);
                    }
                    oVar.f514885e = nVar3;
                }
                return 0;
            case 3:
                oVar.f514886f = aVar4.k(intValue);
                return 0;
            case 4:
                oVar.f514887g = aVar4.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    v53.a aVar5 = new v53.a();
                    if (bArr2 != null && bArr2.length > 0) {
                        aVar5.mo11468x92b714fd(bArr2);
                    }
                    oVar.f514888h = aVar5;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar4.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    v53.c cVar3 = new v53.c();
                    if (bArr3 != null && bArr3.length > 0) {
                        cVar3.mo11468x92b714fd(bArr3);
                    }
                    oVar.f514889i = cVar3;
                }
                return 0;
            case 7:
                oVar.f514890m = aVar4.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
