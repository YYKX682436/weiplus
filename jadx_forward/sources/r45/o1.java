package r45;

/* loaded from: classes8.dex */
public class o1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f463341d;

    /* renamed from: e, reason: collision with root package name */
    public r45.p1 f463342e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o1)) {
            return false;
        }
        r45.o1 o1Var = (r45.o1) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f463341d), java.lang.Boolean.valueOf(o1Var.f463341d)) && n51.f.a(this.f463342e, o1Var.f463342e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f463341d);
            r45.p1 p1Var = this.f463342e;
            if (p1Var != null) {
                fVar.i(2, p1Var.mo75928xcd1e8d8());
                this.f463342e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f463341d) + 0;
            r45.p1 p1Var2 = this.f463342e;
            return p1Var2 != null ? a17 + b36.f.i(2, p1Var2.mo75928xcd1e8d8()) : a17;
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
        r45.o1 o1Var = (r45.o1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o1Var.f463341d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.p1 p1Var3 = new r45.p1();
            if (bArr != null && bArr.length > 0) {
                p1Var3.mo11468x92b714fd(bArr);
            }
            o1Var.f463342e = p1Var3;
        }
        return 0;
    }
}
