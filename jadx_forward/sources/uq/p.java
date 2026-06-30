package uq;

/* loaded from: classes4.dex */
public class p extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public uq.a f511713d;

    /* renamed from: e, reason: collision with root package name */
    public uq.t f511714e;

    /* renamed from: f, reason: collision with root package name */
    public uq.m f511715f;

    /* renamed from: g, reason: collision with root package name */
    public uq.d f511716g;

    /* renamed from: h, reason: collision with root package name */
    public uq.c f511717h;

    /* renamed from: i, reason: collision with root package name */
    public uq.b f511718i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof uq.p)) {
            return false;
        }
        uq.p pVar = (uq.p) fVar;
        return n51.f.a(this.f511713d, pVar.f511713d) && n51.f.a(this.f511714e, pVar.f511714e) && n51.f.a(this.f511715f, pVar.f511715f) && n51.f.a(this.f511716g, pVar.f511716g) && n51.f.a(this.f511717h, pVar.f511717h) && n51.f.a(this.f511718i, pVar.f511718i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            uq.a aVar = this.f511713d;
            if (aVar != null) {
                fVar.i(1, aVar.mo75928xcd1e8d8());
                this.f511713d.mo75956x3d5d1f78(fVar);
            }
            uq.t tVar = this.f511714e;
            if (tVar != null) {
                fVar.i(2, tVar.mo75928xcd1e8d8());
                this.f511714e.mo75956x3d5d1f78(fVar);
            }
            uq.m mVar = this.f511715f;
            if (mVar != null) {
                fVar.i(3, mVar.mo75928xcd1e8d8());
                this.f511715f.mo75956x3d5d1f78(fVar);
            }
            uq.d dVar = this.f511716g;
            if (dVar != null) {
                fVar.i(4, dVar.mo75928xcd1e8d8());
                this.f511716g.mo75956x3d5d1f78(fVar);
            }
            uq.c cVar = this.f511717h;
            if (cVar != null) {
                fVar.i(5, cVar.mo75928xcd1e8d8());
                this.f511717h.mo75956x3d5d1f78(fVar);
            }
            uq.b bVar = this.f511718i;
            if (bVar != null) {
                fVar.i(6, bVar.mo75928xcd1e8d8());
                this.f511718i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            uq.a aVar2 = this.f511713d;
            int i18 = aVar2 != null ? 0 + b36.f.i(1, aVar2.mo75928xcd1e8d8()) : 0;
            uq.t tVar2 = this.f511714e;
            if (tVar2 != null) {
                i18 += b36.f.i(2, tVar2.mo75928xcd1e8d8());
            }
            uq.m mVar2 = this.f511715f;
            if (mVar2 != null) {
                i18 += b36.f.i(3, mVar2.mo75928xcd1e8d8());
            }
            uq.d dVar2 = this.f511716g;
            if (dVar2 != null) {
                i18 += b36.f.i(4, dVar2.mo75928xcd1e8d8());
            }
            uq.c cVar2 = this.f511717h;
            if (cVar2 != null) {
                i18 += b36.f.i(5, cVar2.mo75928xcd1e8d8());
            }
            uq.b bVar2 = this.f511718i;
            return bVar2 != null ? i18 + b36.f.i(6, bVar2.mo75928xcd1e8d8()) : i18;
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
        uq.p pVar = (uq.p) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    uq.a aVar5 = new uq.a();
                    if (bArr != null && bArr.length > 0) {
                        aVar5.mo11468x92b714fd(bArr);
                    }
                    pVar.f511713d = aVar5;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    uq.t tVar3 = new uq.t();
                    if (bArr2 != null && bArr2.length > 0) {
                        tVar3.mo11468x92b714fd(bArr2);
                    }
                    pVar.f511714e = tVar3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    uq.m mVar3 = new uq.m();
                    if (bArr3 != null && bArr3.length > 0) {
                        mVar3.mo11468x92b714fd(bArr3);
                    }
                    pVar.f511715f = mVar3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar4.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    uq.d dVar3 = new uq.d();
                    if (bArr4 != null && bArr4.length > 0) {
                        dVar3.mo11468x92b714fd(bArr4);
                    }
                    pVar.f511716g = dVar3;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar4.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    uq.c cVar3 = new uq.c();
                    if (bArr5 != null && bArr5.length > 0) {
                        cVar3.mo11468x92b714fd(bArr5);
                    }
                    pVar.f511717h = cVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar4.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    uq.b bVar3 = new uq.b();
                    if (bArr6 != null && bArr6.length > 0) {
                        bVar3.mo11468x92b714fd(bArr6);
                    }
                    pVar.f511718i = bVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
