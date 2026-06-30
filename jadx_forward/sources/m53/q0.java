package m53;

/* loaded from: classes8.dex */
public class q0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.l5 f405508d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f405509e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f405510f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f405511g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f405512h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.q0)) {
            return false;
        }
        m53.q0 q0Var = (m53.q0) fVar;
        return n51.f.a(this.f405508d, q0Var.f405508d) && n51.f.a(this.f405509e, q0Var.f405509e) && n51.f.a(java.lang.Boolean.valueOf(this.f405510f), java.lang.Boolean.valueOf(q0Var.f405510f)) && n51.f.a(java.lang.Boolean.valueOf(this.f405511g), java.lang.Boolean.valueOf(q0Var.f405511g)) && n51.f.a(java.lang.Boolean.valueOf(this.f405512h), java.lang.Boolean.valueOf(q0Var.f405512h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405509e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.l5 l5Var = this.f405508d;
            if (l5Var != null) {
                fVar.i(1, l5Var.mo75928xcd1e8d8());
                this.f405508d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.a(3, this.f405510f);
            fVar.a(4, this.f405511g);
            fVar.a(5, this.f405512h);
            return 0;
        }
        if (i17 == 1) {
            m53.l5 l5Var2 = this.f405508d;
            return (l5Var2 != null ? 0 + b36.f.i(1, l5Var2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.a(3, this.f405510f) + b36.f.a(4, this.f405511g) + b36.f.a(5, this.f405512h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        m53.q0 q0Var = (m53.q0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                m53.l5 l5Var3 = new m53.l5();
                if (bArr2 != null && bArr2.length > 0) {
                    l5Var3.mo11468x92b714fd(bArr2);
                }
                q0Var.f405508d = l5Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                q0Var.f405510f = aVar2.c(intValue);
                return 0;
            }
            if (intValue == 4) {
                q0Var.f405511g = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            q0Var.f405512h = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            m53.s5 s5Var = new m53.s5();
            if (bArr3 != null && bArr3.length > 0) {
                s5Var.mo11468x92b714fd(bArr3);
            }
            q0Var.f405509e.add(s5Var);
        }
        return 0;
    }
}
