package r45;

/* loaded from: classes4.dex */
public class qq6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465745d;

    /* renamed from: e, reason: collision with root package name */
    public int f465746e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rq6 f465747f;

    /* renamed from: g, reason: collision with root package name */
    public int f465748g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qq6)) {
            return false;
        }
        r45.qq6 qq6Var = (r45.qq6) fVar;
        return n51.f.a(this.f465745d, qq6Var.f465745d) && n51.f.a(java.lang.Integer.valueOf(this.f465746e), java.lang.Integer.valueOf(qq6Var.f465746e)) && n51.f.a(this.f465747f, qq6Var.f465747f) && n51.f.a(java.lang.Integer.valueOf(this.f465748g), java.lang.Integer.valueOf(qq6Var.f465748g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465745d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f465746e);
            r45.rq6 rq6Var = this.f465747f;
            if (rq6Var != null) {
                fVar.i(3, rq6Var.mo75928xcd1e8d8());
                this.f465747f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f465748g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f465745d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f465746e);
            r45.rq6 rq6Var2 = this.f465747f;
            if (rq6Var2 != null) {
                j17 += b36.f.i(3, rq6Var2.mo75928xcd1e8d8());
            }
            return j17 + b36.f.e(4, this.f465748g);
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
        r45.qq6 qq6Var = (r45.qq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qq6Var.f465745d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            qq6Var.f465746e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            qq6Var.f465748g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.rq6 rq6Var3 = new r45.rq6();
            if (bArr != null && bArr.length > 0) {
                rq6Var3.mo11468x92b714fd(bArr);
            }
            qq6Var.f465747f = rq6Var3;
        }
        return 0;
    }
}
