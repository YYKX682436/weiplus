package r45;

/* loaded from: classes4.dex */
public class xd0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.v75 f471526d;

    /* renamed from: e, reason: collision with root package name */
    public long f471527e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xd0)) {
            return false;
        }
        r45.xd0 xd0Var = (r45.xd0) fVar;
        return n51.f.a(this.f471526d, xd0Var.f471526d) && n51.f.a(java.lang.Long.valueOf(this.f471527e), java.lang.Long.valueOf(xd0Var.f471527e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.v75 v75Var = this.f471526d;
            if (v75Var != null) {
                fVar.i(1, v75Var.mo75928xcd1e8d8());
                this.f471526d.mo75956x3d5d1f78(fVar);
            }
            fVar.h(2, this.f471527e);
            return 0;
        }
        if (i17 == 1) {
            r45.v75 v75Var2 = this.f471526d;
            return (v75Var2 != null ? 0 + b36.f.i(1, v75Var2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f471527e);
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
        r45.xd0 xd0Var = (r45.xd0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            xd0Var.f471527e = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.v75 v75Var3 = new r45.v75();
            if (bArr != null && bArr.length > 0) {
                v75Var3.mo11468x92b714fd(bArr);
            }
            xd0Var.f471526d = v75Var3;
        }
        return 0;
    }
}
