package o32;

/* loaded from: classes8.dex */
public class m extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public o32.c f424251d;

    /* renamed from: e, reason: collision with root package name */
    public int f424252e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof o32.m)) {
            return false;
        }
        o32.m mVar = (o32.m) fVar;
        return n51.f.a(this.f424251d, mVar.f424251d) && n51.f.a(java.lang.Integer.valueOf(this.f424252e), java.lang.Integer.valueOf(mVar.f424252e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            o32.c cVar = this.f424251d;
            if (cVar != null) {
                fVar.i(1, cVar.mo75928xcd1e8d8());
                this.f424251d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f424252e);
            return 0;
        }
        if (i17 == 1) {
            o32.c cVar2 = this.f424251d;
            return (cVar2 != null ? 0 + b36.f.i(1, cVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f424252e);
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
        o32.m mVar = (o32.m) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            mVar.f424252e = aVar2.g(intValue);
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
            mVar.f424251d = cVar3;
        }
        return 0;
    }
}
