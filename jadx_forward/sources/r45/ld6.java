package r45;

/* loaded from: classes9.dex */
public class ld6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.f83 f460862d;

    /* renamed from: e, reason: collision with root package name */
    public r45.f83 f460863e;

    /* renamed from: f, reason: collision with root package name */
    public long f460864f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ld6)) {
            return false;
        }
        r45.ld6 ld6Var = (r45.ld6) fVar;
        return n51.f.a(this.f460862d, ld6Var.f460862d) && n51.f.a(this.f460863e, ld6Var.f460863e) && n51.f.a(java.lang.Long.valueOf(this.f460864f), java.lang.Long.valueOf(ld6Var.f460864f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.f83 f83Var = this.f460862d;
            if (f83Var != null) {
                fVar.i(1, f83Var.mo75928xcd1e8d8());
                this.f460862d.mo75956x3d5d1f78(fVar);
            }
            r45.f83 f83Var2 = this.f460863e;
            if (f83Var2 != null) {
                fVar.i(2, f83Var2.mo75928xcd1e8d8());
                this.f460863e.mo75956x3d5d1f78(fVar);
            }
            fVar.h(3, this.f460864f);
            return 0;
        }
        if (i17 == 1) {
            r45.f83 f83Var3 = this.f460862d;
            int i18 = f83Var3 != null ? 0 + b36.f.i(1, f83Var3.mo75928xcd1e8d8()) : 0;
            r45.f83 f83Var4 = this.f460863e;
            if (f83Var4 != null) {
                i18 += b36.f.i(2, f83Var4.mo75928xcd1e8d8());
            }
            return i18 + b36.f.h(3, this.f460864f);
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
        r45.ld6 ld6Var = (r45.ld6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.f83 f83Var5 = new r45.f83();
                if (bArr != null && bArr.length > 0) {
                    f83Var5.mo11468x92b714fd(bArr);
                }
                ld6Var.f460862d = f83Var5;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            ld6Var.f460864f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.f83 f83Var6 = new r45.f83();
            if (bArr2 != null && bArr2.length > 0) {
                f83Var6.mo11468x92b714fd(bArr2);
            }
            ld6Var.f460863e = f83Var6;
        }
        return 0;
    }
}
