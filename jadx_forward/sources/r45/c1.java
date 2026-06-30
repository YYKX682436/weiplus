package r45;

/* loaded from: classes9.dex */
public class c1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452730d;

    /* renamed from: e, reason: collision with root package name */
    public int f452731e;

    /* renamed from: f, reason: collision with root package name */
    public int f452732f;

    /* renamed from: g, reason: collision with root package name */
    public int f452733g;

    /* renamed from: h, reason: collision with root package name */
    public int f452734h;

    /* renamed from: i, reason: collision with root package name */
    public int f452735i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c1)) {
            return false;
        }
        r45.c1 c1Var = (r45.c1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452730d), java.lang.Integer.valueOf(c1Var.f452730d)) && n51.f.a(java.lang.Integer.valueOf(this.f452731e), java.lang.Integer.valueOf(c1Var.f452731e)) && n51.f.a(java.lang.Integer.valueOf(this.f452732f), java.lang.Integer.valueOf(c1Var.f452732f)) && n51.f.a(java.lang.Integer.valueOf(this.f452733g), java.lang.Integer.valueOf(c1Var.f452733g)) && n51.f.a(java.lang.Integer.valueOf(this.f452734h), java.lang.Integer.valueOf(c1Var.f452734h)) && n51.f.a(java.lang.Integer.valueOf(this.f452735i), java.lang.Integer.valueOf(c1Var.f452735i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452730d);
            fVar.e(2, this.f452731e);
            fVar.e(3, this.f452732f);
            fVar.e(4, this.f452733g);
            fVar.e(5, this.f452734h);
            fVar.e(6, this.f452735i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f452730d) + 0 + b36.f.e(2, this.f452731e) + b36.f.e(3, this.f452732f) + b36.f.e(4, this.f452733g) + b36.f.e(5, this.f452734h) + b36.f.e(6, this.f452735i);
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
        r45.c1 c1Var = (r45.c1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c1Var.f452730d = aVar2.g(intValue);
                return 0;
            case 2:
                c1Var.f452731e = aVar2.g(intValue);
                return 0;
            case 3:
                c1Var.f452732f = aVar2.g(intValue);
                return 0;
            case 4:
                c1Var.f452733g = aVar2.g(intValue);
                return 0;
            case 5:
                c1Var.f452734h = aVar2.g(intValue);
                return 0;
            case 6:
                c1Var.f452735i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
