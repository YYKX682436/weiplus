package r45;

/* loaded from: classes2.dex */
public class ug3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f468877d;

    /* renamed from: e, reason: collision with root package name */
    public int f468878e;

    /* renamed from: f, reason: collision with root package name */
    public r45.nv3 f468879f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ug3)) {
            return false;
        }
        r45.ug3 ug3Var = (r45.ug3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f468877d), java.lang.Integer.valueOf(ug3Var.f468877d)) && n51.f.a(java.lang.Integer.valueOf(this.f468878e), java.lang.Integer.valueOf(ug3Var.f468878e)) && n51.f.a(this.f468879f, ug3Var.f468879f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f468877d);
            fVar.e(2, this.f468878e);
            r45.nv3 nv3Var = this.f468879f;
            if (nv3Var != null) {
                fVar.i(3, nv3Var.mo75928xcd1e8d8());
                this.f468879f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f468877d) + 0 + b36.f.e(2, this.f468878e);
            r45.nv3 nv3Var2 = this.f468879f;
            return nv3Var2 != null ? e17 + b36.f.i(3, nv3Var2.mo75928xcd1e8d8()) : e17;
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
        r45.ug3 ug3Var = (r45.ug3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ug3Var.f468877d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ug3Var.f468878e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.nv3 nv3Var3 = new r45.nv3();
            if (bArr != null && bArr.length > 0) {
                nv3Var3.mo11468x92b714fd(bArr);
            }
            ug3Var.f468879f = nv3Var3;
        }
        return 0;
    }
}
