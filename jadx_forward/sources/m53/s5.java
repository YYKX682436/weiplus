package m53;

/* loaded from: classes8.dex */
public class s5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f405593d;

    /* renamed from: e, reason: collision with root package name */
    public long f405594e;

    /* renamed from: f, reason: collision with root package name */
    public m53.l5 f405595f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.s5)) {
            return false;
        }
        m53.s5 s5Var = (m53.s5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f405593d), java.lang.Long.valueOf(s5Var.f405593d)) && n51.f.a(java.lang.Long.valueOf(this.f405594e), java.lang.Long.valueOf(s5Var.f405594e)) && n51.f.a(this.f405595f, s5Var.f405595f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f405593d);
            fVar.h(2, this.f405594e);
            m53.l5 l5Var = this.f405595f;
            if (l5Var != null) {
                fVar.i(3, l5Var.mo75928xcd1e8d8());
                this.f405595f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f405593d) + 0 + b36.f.h(2, this.f405594e);
            m53.l5 l5Var2 = this.f405595f;
            return l5Var2 != null ? h17 + b36.f.i(3, l5Var2.mo75928xcd1e8d8()) : h17;
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
        m53.s5 s5Var = (m53.s5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            s5Var.f405593d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            s5Var.f405594e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.l5 l5Var3 = new m53.l5();
            if (bArr != null && bArr.length > 0) {
                l5Var3.mo11468x92b714fd(bArr);
            }
            s5Var.f405595f = l5Var3;
        }
        return 0;
    }
}
