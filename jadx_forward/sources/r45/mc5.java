package r45;

/* loaded from: classes10.dex */
public class mc5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461896d;

    /* renamed from: e, reason: collision with root package name */
    public int f461897e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f461898f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f461899g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mc5)) {
            return false;
        }
        r45.mc5 mc5Var = (r45.mc5) fVar;
        return n51.f.a(this.f461896d, mc5Var.f461896d) && n51.f.a(java.lang.Integer.valueOf(this.f461897e), java.lang.Integer.valueOf(mc5Var.f461897e)) && n51.f.a(this.f461898f, mc5Var.f461898f) && n51.f.a(this.f461899g, mc5Var.f461899g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461896d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f461897e);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f461898f;
            if (c19792x256d2725 != null) {
                fVar.i(3, c19792x256d2725.mo75928xcd1e8d8());
                this.f461898f.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f461899g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f461896d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f461897e);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = this.f461898f;
            if (c19792x256d27252 != null) {
                j17 += b36.f.i(3, c19792x256d27252.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f461899g;
            return gVar2 != null ? j17 + b36.f.b(4, gVar2) : j17;
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
        r45.mc5 mc5Var = (r45.mc5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mc5Var.f461896d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            mc5Var.f461897e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            mc5Var.f461899g = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
            if (bArr != null && bArr.length > 0) {
                c19792x256d27253.mo11468x92b714fd(bArr);
            }
            mc5Var.f461898f = c19792x256d27253;
        }
        return 0;
    }
}
