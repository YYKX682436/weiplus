package o32;

/* loaded from: classes8.dex */
public class h extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public o32.c f424243d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f424244e;

    /* renamed from: f, reason: collision with root package name */
    public int f424245f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof o32.h)) {
            return false;
        }
        o32.h hVar = (o32.h) fVar;
        return n51.f.a(this.f424243d, hVar.f424243d) && n51.f.a(this.f424244e, hVar.f424244e) && n51.f.a(java.lang.Integer.valueOf(this.f424245f), java.lang.Integer.valueOf(hVar.f424245f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            o32.c cVar = this.f424243d;
            if (cVar != null) {
                fVar.i(1, cVar.mo75928xcd1e8d8());
                this.f424243d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f424244e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f424245f);
            return 0;
        }
        if (i17 == 1) {
            o32.c cVar2 = this.f424243d;
            int i18 = cVar2 != null ? 0 + b36.f.i(1, cVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f424244e;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            return i18 + b36.f.e(3, this.f424245f);
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
        o32.h hVar = (o32.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                hVar.f424244e = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            hVar.f424245f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            o32.c cVar3 = new o32.c();
            if (bArr != null && bArr.length > 0) {
                cVar3.mo11468x92b714fd(bArr);
            }
            hVar.f424243d = cVar3;
        }
        return 0;
    }
}
