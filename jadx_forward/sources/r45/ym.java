package r45;

/* loaded from: classes4.dex */
public class ym extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.nm f472741d;

    /* renamed from: e, reason: collision with root package name */
    public int f472742e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ym)) {
            return false;
        }
        r45.ym ymVar = (r45.ym) fVar;
        return n51.f.a(this.f472741d, ymVar.f472741d) && n51.f.a(java.lang.Integer.valueOf(this.f472742e), java.lang.Integer.valueOf(ymVar.f472742e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.nm nmVar = this.f472741d;
            if (nmVar != null) {
                fVar.i(1, nmVar.mo75928xcd1e8d8());
                this.f472741d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f472742e);
            return 0;
        }
        if (i17 == 1) {
            r45.nm nmVar2 = this.f472741d;
            return (nmVar2 != null ? 0 + b36.f.i(1, nmVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f472742e);
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
        r45.ym ymVar = (r45.ym) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            ymVar.f472742e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.nm nmVar3 = new r45.nm();
            if (bArr != null && bArr.length > 0) {
                nmVar3.mo11468x92b714fd(bArr);
            }
            ymVar.f472741d = nmVar3;
        }
        return 0;
    }
}
