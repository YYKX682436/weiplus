package r45;

/* loaded from: classes4.dex */
public class ha extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457504d;

    /* renamed from: e, reason: collision with root package name */
    public int f457505e;

    /* renamed from: f, reason: collision with root package name */
    public int f457506f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ia f457507g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ha)) {
            return false;
        }
        r45.ha haVar = (r45.ha) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457504d), java.lang.Integer.valueOf(haVar.f457504d)) && n51.f.a(java.lang.Integer.valueOf(this.f457505e), java.lang.Integer.valueOf(haVar.f457505e)) && n51.f.a(java.lang.Integer.valueOf(this.f457506f), java.lang.Integer.valueOf(haVar.f457506f)) && n51.f.a(this.f457507g, haVar.f457507g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457504d);
            fVar.e(2, this.f457505e);
            fVar.e(3, this.f457506f);
            r45.ia iaVar = this.f457507g;
            if (iaVar != null) {
                fVar.i(4, iaVar.mo75928xcd1e8d8());
                this.f457507g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457504d) + 0 + b36.f.e(2, this.f457505e) + b36.f.e(3, this.f457506f);
            r45.ia iaVar2 = this.f457507g;
            return iaVar2 != null ? e17 + b36.f.i(4, iaVar2.mo75928xcd1e8d8()) : e17;
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
        r45.ha haVar = (r45.ha) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            haVar.f457504d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            haVar.f457505e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            haVar.f457506f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.ia iaVar3 = new r45.ia();
            if (bArr != null && bArr.length > 0) {
                iaVar3.mo11468x92b714fd(bArr);
            }
            haVar.f457507g = iaVar3;
        }
        return 0;
    }
}
