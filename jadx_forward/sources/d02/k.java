package d02;

/* loaded from: classes2.dex */
public class k extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public d02.d f306861d;

    /* renamed from: e, reason: collision with root package name */
    public d02.e f306862e;

    /* renamed from: f, reason: collision with root package name */
    public d02.g f306863f;

    /* renamed from: g, reason: collision with root package name */
    public d02.l f306864g;

    /* renamed from: h, reason: collision with root package name */
    public d02.b f306865h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof d02.k)) {
            return false;
        }
        d02.k kVar = (d02.k) fVar;
        return n51.f.a(this.f306861d, kVar.f306861d) && n51.f.a(this.f306862e, kVar.f306862e) && n51.f.a(this.f306863f, kVar.f306863f) && n51.f.a(this.f306864g, kVar.f306864g) && n51.f.a(this.f306865h, kVar.f306865h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            d02.d dVar = this.f306861d;
            if (dVar != null) {
                fVar.i(1, dVar.mo75928xcd1e8d8());
                this.f306861d.mo75956x3d5d1f78(fVar);
            }
            d02.e eVar = this.f306862e;
            if (eVar != null) {
                fVar.i(2, eVar.mo75928xcd1e8d8());
                this.f306862e.mo75956x3d5d1f78(fVar);
            }
            d02.g gVar = this.f306863f;
            if (gVar != null) {
                fVar.i(3, gVar.mo75928xcd1e8d8());
                this.f306863f.mo75956x3d5d1f78(fVar);
            }
            d02.l lVar = this.f306864g;
            if (lVar != null) {
                fVar.i(4, lVar.mo75928xcd1e8d8());
                this.f306864g.mo75956x3d5d1f78(fVar);
            }
            d02.b bVar = this.f306865h;
            if (bVar != null) {
                fVar.i(5, bVar.mo75928xcd1e8d8());
                this.f306865h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            d02.d dVar2 = this.f306861d;
            int i18 = dVar2 != null ? 0 + b36.f.i(1, dVar2.mo75928xcd1e8d8()) : 0;
            d02.e eVar2 = this.f306862e;
            if (eVar2 != null) {
                i18 += b36.f.i(2, eVar2.mo75928xcd1e8d8());
            }
            d02.g gVar2 = this.f306863f;
            if (gVar2 != null) {
                i18 += b36.f.i(3, gVar2.mo75928xcd1e8d8());
            }
            d02.l lVar2 = this.f306864g;
            if (lVar2 != null) {
                i18 += b36.f.i(4, lVar2.mo75928xcd1e8d8());
            }
            d02.b bVar2 = this.f306865h;
            return bVar2 != null ? i18 + b36.f.i(5, bVar2.mo75928xcd1e8d8()) : i18;
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
        d02.k kVar = (d02.k) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                d02.d dVar3 = new d02.d();
                if (bArr != null && bArr.length > 0) {
                    dVar3.mo11468x92b714fd(bArr);
                }
                kVar.f306861d = dVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                d02.e eVar3 = new d02.e();
                if (bArr2 != null && bArr2.length > 0) {
                    eVar3.mo11468x92b714fd(bArr2);
                }
                kVar.f306862e = eVar3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                d02.g gVar3 = new d02.g();
                if (bArr3 != null && bArr3.length > 0) {
                    gVar3.mo11468x92b714fd(bArr3);
                }
                kVar.f306863f = gVar3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                d02.l lVar3 = new d02.l();
                if (bArr4 != null && bArr4.length > 0) {
                    lVar3.mo11468x92b714fd(bArr4);
                }
                kVar.f306864g = lVar3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            d02.b bVar3 = new d02.b();
            if (bArr5 != null && bArr5.length > 0) {
                bVar3.mo11468x92b714fd(bArr5);
            }
            kVar.f306865h = bVar3;
        }
        return 0;
    }
}
