package r45;

/* loaded from: classes9.dex */
public class ci4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453107d;

    /* renamed from: e, reason: collision with root package name */
    public long f453108e;

    /* renamed from: f, reason: collision with root package name */
    public long f453109f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ci4)) {
            return false;
        }
        r45.ci4 ci4Var = (r45.ci4) fVar;
        return n51.f.a(this.f453107d, ci4Var.f453107d) && n51.f.a(java.lang.Long.valueOf(this.f453108e), java.lang.Long.valueOf(ci4Var.f453108e)) && n51.f.a(java.lang.Long.valueOf(this.f453109f), java.lang.Long.valueOf(ci4Var.f453109f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453107d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f453108e);
            fVar.h(3, this.f453109f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f453107d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f453108e) + b36.f.h(3, this.f453109f);
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
        r45.ci4 ci4Var = (r45.ci4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ci4Var.f453107d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            ci4Var.f453108e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        ci4Var.f453109f = aVar2.i(intValue);
        return 0;
    }
}
