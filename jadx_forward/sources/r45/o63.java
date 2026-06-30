package r45;

/* loaded from: classes4.dex */
public class o63 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f463513d;

    /* renamed from: e, reason: collision with root package name */
    public r45.j73 f463514e;

    /* renamed from: f, reason: collision with root package name */
    public r45.k73 f463515f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o63)) {
            return false;
        }
        r45.o63 o63Var = (r45.o63) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f463513d), java.lang.Integer.valueOf(o63Var.f463513d)) && n51.f.a(this.f463514e, o63Var.f463514e) && n51.f.a(this.f463515f, o63Var.f463515f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f463513d);
            r45.j73 j73Var = this.f463514e;
            if (j73Var != null) {
                fVar.i(2, j73Var.mo75928xcd1e8d8());
                this.f463514e.mo75956x3d5d1f78(fVar);
            }
            r45.k73 k73Var = this.f463515f;
            if (k73Var != null) {
                fVar.i(4, k73Var.mo75928xcd1e8d8());
                this.f463515f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f463513d) + 0;
            r45.j73 j73Var2 = this.f463514e;
            if (j73Var2 != null) {
                e17 += b36.f.i(2, j73Var2.mo75928xcd1e8d8());
            }
            r45.k73 k73Var2 = this.f463515f;
            return k73Var2 != null ? e17 + b36.f.i(4, k73Var2.mo75928xcd1e8d8()) : e17;
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
        r45.o63 o63Var = (r45.o63) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o63Var.f463513d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.j73 j73Var3 = new r45.j73();
                if (bArr != null && bArr.length > 0) {
                    j73Var3.mo11468x92b714fd(bArr);
                }
                o63Var.f463514e = j73Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.k73 k73Var3 = new r45.k73();
            if (bArr2 != null && bArr2.length > 0) {
                k73Var3.mo11468x92b714fd(bArr2);
            }
            o63Var.f463515f = k73Var3;
        }
        return 0;
    }
}
