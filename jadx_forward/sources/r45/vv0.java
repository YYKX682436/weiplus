package r45;

/* loaded from: classes7.dex */
public class vv0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ug4 f470132d;

    /* renamed from: e, reason: collision with root package name */
    public int f470133e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f470134f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f470135g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f470136h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vv0)) {
            return false;
        }
        r45.vv0 vv0Var = (r45.vv0) fVar;
        return n51.f.a(this.f470132d, vv0Var.f470132d) && n51.f.a(java.lang.Integer.valueOf(this.f470133e), java.lang.Integer.valueOf(vv0Var.f470133e)) && n51.f.a(this.f470134f, vv0Var.f470134f) && n51.f.a(java.lang.Boolean.valueOf(this.f470135g), java.lang.Boolean.valueOf(vv0Var.f470135g)) && n51.f.a(java.lang.Boolean.valueOf(this.f470136h), java.lang.Boolean.valueOf(vv0Var.f470136h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ug4 ug4Var = this.f470132d;
            if (ug4Var != null) {
                fVar.i(1, ug4Var.mo75928xcd1e8d8());
                this.f470132d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f470133e);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f470134f;
            if (c19792x256d2725 != null) {
                fVar.i(3, c19792x256d2725.mo75928xcd1e8d8());
                this.f470134f.mo75956x3d5d1f78(fVar);
            }
            fVar.a(4, this.f470135g);
            fVar.a(5, this.f470136h);
            return 0;
        }
        if (i17 == 1) {
            r45.ug4 ug4Var2 = this.f470132d;
            int i18 = (ug4Var2 != null ? 0 + b36.f.i(1, ug4Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f470133e);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = this.f470134f;
            if (c19792x256d27252 != null) {
                i18 += b36.f.i(3, c19792x256d27252.mo75928xcd1e8d8());
            }
            return i18 + b36.f.a(4, this.f470135g) + b36.f.a(5, this.f470136h);
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
        r45.vv0 vv0Var = (r45.vv0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ug4 ug4Var3 = new r45.ug4();
                if (bArr != null && bArr.length > 0) {
                    ug4Var3.mo11468x92b714fd(bArr);
                }
                vv0Var.f470132d = ug4Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            vv0Var.f470133e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                vv0Var.f470135g = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            vv0Var.f470136h = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
            if (bArr2 != null && bArr2.length > 0) {
                c19792x256d27253.mo11468x92b714fd(bArr2);
            }
            vv0Var.f470134f = c19792x256d27253;
        }
        return 0;
    }
}
