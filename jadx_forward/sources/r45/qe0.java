package r45;

/* loaded from: classes2.dex */
public class qe0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465412d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465413e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rl6 f465414f;

    /* renamed from: g, reason: collision with root package name */
    public r45.i74 f465415g;

    /* renamed from: h, reason: collision with root package name */
    public r45.t35 f465416h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qe0)) {
            return false;
        }
        r45.qe0 qe0Var = (r45.qe0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465412d), java.lang.Integer.valueOf(qe0Var.f465412d)) && n51.f.a(this.f465413e, qe0Var.f465413e) && n51.f.a(this.f465414f, qe0Var.f465414f) && n51.f.a(this.f465415g, qe0Var.f465415g) && n51.f.a(this.f465416h, qe0Var.f465416h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f465412d);
            java.lang.String str = this.f465413e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.rl6 rl6Var = this.f465414f;
            if (rl6Var != null) {
                fVar.i(3, rl6Var.mo75928xcd1e8d8());
                this.f465414f.mo75956x3d5d1f78(fVar);
            }
            r45.i74 i74Var = this.f465415g;
            if (i74Var != null) {
                fVar.i(4, i74Var.mo75928xcd1e8d8());
                this.f465415g.mo75956x3d5d1f78(fVar);
            }
            r45.t35 t35Var = this.f465416h;
            if (t35Var != null) {
                fVar.i(5, t35Var.mo75928xcd1e8d8());
                this.f465416h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f465412d) + 0;
            java.lang.String str2 = this.f465413e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            r45.rl6 rl6Var2 = this.f465414f;
            if (rl6Var2 != null) {
                e17 += b36.f.i(3, rl6Var2.mo75928xcd1e8d8());
            }
            r45.i74 i74Var2 = this.f465415g;
            if (i74Var2 != null) {
                e17 += b36.f.i(4, i74Var2.mo75928xcd1e8d8());
            }
            r45.t35 t35Var2 = this.f465416h;
            return t35Var2 != null ? e17 + b36.f.i(5, t35Var2.mo75928xcd1e8d8()) : e17;
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
        r45.qe0 qe0Var = (r45.qe0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            qe0Var.f465412d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            qe0Var.f465413e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.rl6 rl6Var3 = new r45.rl6();
                if (bArr != null && bArr.length > 0) {
                    rl6Var3.mo11468x92b714fd(bArr);
                }
                qe0Var.f465414f = rl6Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                r45.i74 i74Var3 = new r45.i74();
                if (bArr2 != null && bArr2.length > 0) {
                    i74Var3.mo11468x92b714fd(bArr2);
                }
                qe0Var.f465415g = i74Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            r45.t35 t35Var3 = new r45.t35();
            if (bArr3 != null && bArr3.length > 0) {
                t35Var3.mo11468x92b714fd(bArr3);
            }
            qe0Var.f465416h = t35Var3;
        }
        return 0;
    }
}
