package wn1;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f528929d;

    /* renamed from: e, reason: collision with root package name */
    public int f528930e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.b)) {
            return false;
        }
        wn1.b bVar = (wn1.b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f528929d), java.lang.Integer.valueOf(bVar.f528929d)) && n51.f.a(java.lang.Integer.valueOf(this.f528930e), java.lang.Integer.valueOf(bVar.f528930e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f528929d);
            fVar.e(2, this.f528930e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f528929d) + 0 + b36.f.e(2, this.f528930e);
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
        wn1.b bVar = (wn1.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bVar.f528929d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        bVar.f528930e = aVar2.g(intValue);
        return 0;
    }
}
