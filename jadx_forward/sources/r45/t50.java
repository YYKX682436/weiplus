package r45;

/* loaded from: classes2.dex */
public class t50 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f467682d;

    /* renamed from: e, reason: collision with root package name */
    public r45.dr0 f467683e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f467684f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t50)) {
            return false;
        }
        r45.t50 t50Var = (r45.t50) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f467682d), java.lang.Integer.valueOf(t50Var.f467682d)) && n51.f.a(this.f467683e, t50Var.f467683e) && n51.f.a(this.f467684f, t50Var.f467684f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f467682d);
            r45.dr0 dr0Var = this.f467683e;
            if (dr0Var != null) {
                fVar.i(2, dr0Var.mo75928xcd1e8d8());
                this.f467683e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f467684f;
            if (c19792x256d2725 != null) {
                fVar.i(3, c19792x256d2725.mo75928xcd1e8d8());
                this.f467684f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f467682d) + 0;
            r45.dr0 dr0Var2 = this.f467683e;
            if (dr0Var2 != null) {
                e17 += b36.f.i(2, dr0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = this.f467684f;
            return c19792x256d27252 != null ? e17 + b36.f.i(3, c19792x256d27252.mo75928xcd1e8d8()) : e17;
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
        r45.t50 t50Var = (r45.t50) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t50Var.f467682d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.dr0 dr0Var3 = new r45.dr0();
                if (bArr != null && bArr.length > 0) {
                    dr0Var3.mo11468x92b714fd(bArr);
                }
                t50Var.f467683e = dr0Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
            if (bArr2 != null && bArr2.length > 0) {
                c19792x256d27253.mo11468x92b714fd(bArr2);
            }
            t50Var.f467684f = c19792x256d27253;
        }
        return 0;
    }
}
