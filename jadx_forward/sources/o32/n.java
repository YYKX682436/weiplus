package o32;

/* loaded from: classes8.dex */
public class n extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public o32.c f424253d;

    /* renamed from: e, reason: collision with root package name */
    public int f424254e;

    /* renamed from: f, reason: collision with root package name */
    public int f424255f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof o32.n)) {
            return false;
        }
        o32.n nVar = (o32.n) fVar;
        return n51.f.a(this.f424253d, nVar.f424253d) && n51.f.a(java.lang.Integer.valueOf(this.f424254e), java.lang.Integer.valueOf(nVar.f424254e)) && n51.f.a(java.lang.Integer.valueOf(this.f424255f), java.lang.Integer.valueOf(nVar.f424255f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            o32.c cVar = this.f424253d;
            if (cVar != null) {
                fVar.i(1, cVar.mo75928xcd1e8d8());
                this.f424253d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f424254e);
            fVar.e(3, this.f424255f);
            return 0;
        }
        if (i17 == 1) {
            o32.c cVar2 = this.f424253d;
            return (cVar2 != null ? 0 + b36.f.i(1, cVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f424254e) + b36.f.e(3, this.f424255f);
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
        o32.n nVar = (o32.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                nVar.f424254e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            nVar.f424255f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            o32.c cVar3 = new o32.c();
            if (bArr != null && bArr.length > 0) {
                cVar3.mo11468x92b714fd(bArr);
            }
            nVar.f424253d = cVar3;
        }
        return 0;
    }
}
