package o32;

/* loaded from: classes14.dex */
public class k extends o32.i {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f424248e;

    /* renamed from: f, reason: collision with root package name */
    public int f424249f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof o32.k)) {
            return false;
        }
        o32.k kVar = (o32.k) fVar;
        return n51.f.a(this.f424246d, kVar.f424246d) && n51.f.a(this.f424248e, kVar.f424248e) && n51.f.a(java.lang.Integer.valueOf(this.f424249f), java.lang.Integer.valueOf(kVar.f424249f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            o32.d dVar = this.f424246d;
            if (dVar != null) {
                fVar.i(1, dVar.mo75928xcd1e8d8());
                this.f424246d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f424248e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f424249f);
            return 0;
        }
        if (i17 == 1) {
            o32.d dVar2 = this.f424246d;
            int i18 = dVar2 != null ? 0 + b36.f.i(1, dVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f424248e;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            return i18 + b36.f.e(3, this.f424249f);
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
        o32.k kVar = (o32.k) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                kVar.f424248e = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            kVar.f424249f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            o32.d dVar3 = new o32.d();
            if (bArr != null && bArr.length > 0) {
                dVar3.mo11468x92b714fd(bArr);
            }
            kVar.f424246d = dVar3;
        }
        return 0;
    }
}
