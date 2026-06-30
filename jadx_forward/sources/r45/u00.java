package r45;

/* loaded from: classes4.dex */
public class u00 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f468438d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f468439e;

    /* renamed from: f, reason: collision with root package name */
    public r45.eq0 f468440f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u00)) {
            return false;
        }
        r45.u00 u00Var = (r45.u00) fVar;
        return n51.f.a(this.f468438d, u00Var.f468438d) && n51.f.a(java.lang.Integer.valueOf(this.f468439e), java.lang.Integer.valueOf(u00Var.f468439e)) && n51.f.a(this.f468440f, u00Var.f468440f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f468438d);
            fVar.e(2, this.f468439e);
            r45.eq0 eq0Var = this.f468440f;
            if (eq0Var != null) {
                fVar.i(3, eq0Var.mo75928xcd1e8d8());
                this.f468440f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f468438d) + 0 + b36.f.e(2, this.f468439e);
            r45.eq0 eq0Var2 = this.f468440f;
            return eq0Var2 != null ? g17 + b36.f.i(3, eq0Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f468438d.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.u00 u00Var = (r45.u00) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.mp0 mp0Var = new r45.mp0();
                if (bArr2 != null && bArr2.length > 0) {
                    mp0Var.mo11468x92b714fd(bArr2);
                }
                u00Var.f468438d.add(mp0Var);
            }
            return 0;
        }
        if (intValue == 2) {
            u00Var.f468439e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.eq0 eq0Var3 = new r45.eq0();
            if (bArr3 != null && bArr3.length > 0) {
                eq0Var3.mo11468x92b714fd(bArr3);
            }
            u00Var.f468440f = eq0Var3;
        }
        return 0;
    }
}
