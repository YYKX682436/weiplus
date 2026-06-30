package r45;

/* loaded from: classes9.dex */
public class fa4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f455676d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f455677e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f455678f;

    /* renamed from: g, reason: collision with root package name */
    public int f455679g;

    /* renamed from: h, reason: collision with root package name */
    public r45.x84 f455680h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fa4)) {
            return false;
        }
        r45.fa4 fa4Var = (r45.fa4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f455676d), java.lang.Long.valueOf(fa4Var.f455676d)) && n51.f.a(this.f455677e, fa4Var.f455677e) && n51.f.a(java.lang.Boolean.valueOf(this.f455678f), java.lang.Boolean.valueOf(fa4Var.f455678f)) && n51.f.a(java.lang.Integer.valueOf(this.f455679g), java.lang.Integer.valueOf(fa4Var.f455679g)) && n51.f.a(this.f455680h, fa4Var.f455680h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f455676d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f455677e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.a(3, this.f455678f);
            fVar.e(4, this.f455679g);
            r45.x84 x84Var = this.f455680h;
            if (x84Var != null) {
                fVar.i(5, x84Var.mo75928xcd1e8d8());
                this.f455680h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f455676d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f455677e;
            if (gVar2 != null) {
                h17 += b36.f.b(2, gVar2);
            }
            int a17 = h17 + b36.f.a(3, this.f455678f) + b36.f.e(4, this.f455679g);
            r45.x84 x84Var2 = this.f455680h;
            return x84Var2 != null ? a17 + b36.f.i(5, x84Var2.mo75928xcd1e8d8()) : a17;
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
        r45.fa4 fa4Var = (r45.fa4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fa4Var.f455676d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            fa4Var.f455677e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            fa4Var.f455678f = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            fa4Var.f455679g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.x84 x84Var3 = new r45.x84();
            if (bArr != null && bArr.length > 0) {
                x84Var3.mo11468x92b714fd(bArr);
            }
            fa4Var.f455680h = x84Var3;
        }
        return 0;
    }
}
