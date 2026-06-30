package r45;

/* loaded from: classes8.dex */
public class nu5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f463219d;

    /* renamed from: e, reason: collision with root package name */
    public r45.uk4 f463220e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nu5)) {
            return false;
        }
        r45.nu5 nu5Var = (r45.nu5) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f463219d), java.lang.Boolean.valueOf(nu5Var.f463219d)) && n51.f.a(this.f463220e, nu5Var.f463220e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f463219d);
            r45.uk4 uk4Var = this.f463220e;
            if (uk4Var != null) {
                fVar.i(2, uk4Var.mo75928xcd1e8d8());
                this.f463220e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f463219d) + 0;
            r45.uk4 uk4Var2 = this.f463220e;
            return uk4Var2 != null ? a17 + b36.f.i(2, uk4Var2.mo75928xcd1e8d8()) : a17;
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
        r45.nu5 nu5Var = (r45.nu5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            nu5Var.f463219d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.uk4 uk4Var3 = new r45.uk4();
            if (bArr != null && bArr.length > 0) {
                uk4Var3.mo11468x92b714fd(bArr);
            }
            nu5Var.f463220e = uk4Var3;
        }
        return 0;
    }
}
