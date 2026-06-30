package r45;

/* loaded from: classes8.dex */
public class sk5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f467348d;

    /* renamed from: e, reason: collision with root package name */
    public r45.y35 f467349e;

    /* renamed from: f, reason: collision with root package name */
    public r45.r8 f467350f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sk5)) {
            return false;
        }
        r45.sk5 sk5Var = (r45.sk5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f467348d), java.lang.Integer.valueOf(sk5Var.f467348d)) && n51.f.a(this.f467349e, sk5Var.f467349e) && n51.f.a(this.f467350f, sk5Var.f467350f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f467348d);
            r45.y35 y35Var = this.f467349e;
            if (y35Var != null) {
                fVar.i(2, y35Var.mo75928xcd1e8d8());
                this.f467349e.mo75956x3d5d1f78(fVar);
            }
            r45.r8 r8Var = this.f467350f;
            if (r8Var != null) {
                fVar.i(3, r8Var.mo75928xcd1e8d8());
                this.f467350f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f467348d) + 0;
            r45.y35 y35Var2 = this.f467349e;
            if (y35Var2 != null) {
                e17 += b36.f.i(2, y35Var2.mo75928xcd1e8d8());
            }
            r45.r8 r8Var2 = this.f467350f;
            return r8Var2 != null ? e17 + b36.f.i(3, r8Var2.mo75928xcd1e8d8()) : e17;
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
        r45.sk5 sk5Var = (r45.sk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sk5Var.f467348d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.y35 y35Var3 = new r45.y35();
                if (bArr != null && bArr.length > 0) {
                    y35Var3.mo11468x92b714fd(bArr);
                }
                sk5Var.f467349e = y35Var3;
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
            r45.r8 r8Var3 = new r45.r8();
            if (bArr2 != null && bArr2.length > 0) {
                r8Var3.mo11468x92b714fd(bArr2);
            }
            sk5Var.f467350f = r8Var3;
        }
        return 0;
    }
}
