package o32;

/* loaded from: classes14.dex */
public class f extends o32.i {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f424229e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f424230f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof o32.f)) {
            return false;
        }
        o32.f fVar2 = (o32.f) fVar;
        return n51.f.a(this.f424246d, fVar2.f424246d) && n51.f.a(this.f424229e, fVar2.f424229e) && n51.f.a(this.f424230f, fVar2.f424230f);
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
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f424229e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f424230f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            o32.d dVar2 = this.f424246d;
            int i18 = dVar2 != null ? 0 + b36.f.i(1, dVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f424229e;
            if (gVar3 != null) {
                i18 += b36.f.b(2, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f424230f;
            return gVar4 != null ? i18 + b36.f.b(3, gVar4) : i18;
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
        o32.f fVar2 = (o32.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                fVar2.f424229e = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            fVar2.f424230f = aVar2.d(intValue);
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
            fVar2.f424246d = dVar3;
        }
        return 0;
    }
}
