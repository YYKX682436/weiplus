package r45;

/* loaded from: classes4.dex */
public class kk6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f460326d;

    /* renamed from: e, reason: collision with root package name */
    public long f460327e;

    /* renamed from: f, reason: collision with root package name */
    public int f460328f;

    /* renamed from: g, reason: collision with root package name */
    public int f460329g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kk6)) {
            return false;
        }
        r45.kk6 kk6Var = (r45.kk6) fVar;
        return n51.f.a(this.f76494x2de60e5e, kk6Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f460326d), java.lang.Integer.valueOf(kk6Var.f460326d)) && n51.f.a(java.lang.Long.valueOf(this.f460327e), java.lang.Long.valueOf(kk6Var.f460327e)) && n51.f.a(java.lang.Integer.valueOf(this.f460328f), java.lang.Integer.valueOf(kk6Var.f460328f)) && n51.f.a(java.lang.Integer.valueOf(this.f460329g), java.lang.Integer.valueOf(kk6Var.f460329g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f460326d);
            fVar.h(3, this.f460327e);
            fVar.e(4, this.f460328f);
            fVar.e(5, this.f460329g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f460326d) + b36.f.h(3, this.f460327e) + b36.f.e(4, this.f460328f) + b36.f.e(5, this.f460329g);
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
        r45.kk6 kk6Var = (r45.kk6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                kk6Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            kk6Var.f460326d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            kk6Var.f460327e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            kk6Var.f460328f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        kk6Var.f460329g = aVar2.g(intValue);
        return 0;
    }
}
