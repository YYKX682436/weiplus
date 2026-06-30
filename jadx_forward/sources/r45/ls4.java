package r45;

/* loaded from: classes8.dex */
public class ls4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461333d;

    /* renamed from: e, reason: collision with root package name */
    public r45.os4 f461334e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ms4 f461335f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ls4)) {
            return false;
        }
        r45.ls4 ls4Var = (r45.ls4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461333d), java.lang.Integer.valueOf(ls4Var.f461333d)) && n51.f.a(this.f461334e, ls4Var.f461334e) && n51.f.a(this.f461335f, ls4Var.f461335f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461333d);
            r45.os4 os4Var = this.f461334e;
            if (os4Var != null) {
                fVar.i(2, os4Var.mo75928xcd1e8d8());
                this.f461334e.mo75956x3d5d1f78(fVar);
            }
            r45.ms4 ms4Var = this.f461335f;
            if (ms4Var != null) {
                fVar.i(101, ms4Var.mo75928xcd1e8d8());
                this.f461335f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461333d) + 0;
            r45.os4 os4Var2 = this.f461334e;
            if (os4Var2 != null) {
                e17 += b36.f.i(2, os4Var2.mo75928xcd1e8d8());
            }
            r45.ms4 ms4Var2 = this.f461335f;
            return ms4Var2 != null ? e17 + b36.f.i(101, ms4Var2.mo75928xcd1e8d8()) : e17;
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
        r45.ls4 ls4Var = (r45.ls4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ls4Var.f461333d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.os4 os4Var3 = new r45.os4();
                if (bArr != null && bArr.length > 0) {
                    os4Var3.mo11468x92b714fd(bArr);
                }
                ls4Var.f461334e = os4Var3;
            }
            return 0;
        }
        if (intValue != 101) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.ms4 ms4Var3 = new r45.ms4();
            if (bArr2 != null && bArr2.length > 0) {
                ms4Var3.mo11468x92b714fd(bArr2);
            }
            ls4Var.f461335f = ms4Var3;
        }
        return 0;
    }
}
