package wi3;

/* loaded from: classes4.dex */
public class p extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f527788d;

    /* renamed from: e, reason: collision with root package name */
    public long f527789e;

    /* renamed from: f, reason: collision with root package name */
    public int f527790f;

    /* renamed from: g, reason: collision with root package name */
    public wi3.o f527791g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f527792h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wi3.p)) {
            return false;
        }
        wi3.p pVar = (wi3.p) fVar;
        return n51.f.a(this.f76494x2de60e5e, pVar.f76494x2de60e5e) && n51.f.a(java.lang.Long.valueOf(this.f527788d), java.lang.Long.valueOf(pVar.f527788d)) && n51.f.a(java.lang.Long.valueOf(this.f527789e), java.lang.Long.valueOf(pVar.f527789e)) && n51.f.a(java.lang.Integer.valueOf(this.f527790f), java.lang.Integer.valueOf(pVar.f527790f)) && n51.f.a(this.f527791g, pVar.f527791g) && n51.f.a(this.f527792h, pVar.f527792h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.h(2, this.f527788d);
            fVar.h(3, this.f527789e);
            fVar.e(4, this.f527790f);
            wi3.o oVar = this.f527791g;
            if (oVar != null) {
                fVar.i(5, oVar.mo75928xcd1e8d8());
                this.f527791g.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, this.f527792h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f527788d) + b36.f.h(3, this.f527789e) + b36.f.e(4, this.f527790f);
            wi3.o oVar2 = this.f527791g;
            if (oVar2 != null) {
                i18 += b36.f.i(5, oVar2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(6, 8, this.f527792h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f527792h.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        wi3.p pVar = (wi3.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    pVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                pVar.f527788d = aVar2.i(intValue);
                return 0;
            case 3:
                pVar.f527789e = aVar2.i(intValue);
                return 0;
            case 4:
                pVar.f527790f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    wi3.o oVar3 = new wi3.o();
                    if (bArr3 != null && bArr3.length > 0) {
                        oVar3.mo11468x92b714fd(bArr3);
                    }
                    pVar.f527791g = oVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    wi3.a aVar3 = new wi3.a();
                    if (bArr4 != null && bArr4.length > 0) {
                        aVar3.mo11468x92b714fd(bArr4);
                    }
                    pVar.f527792h.add(aVar3);
                }
                return 0;
            default:
                return -1;
        }
    }
}
