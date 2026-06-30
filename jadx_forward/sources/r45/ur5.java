package r45;

/* loaded from: classes9.dex */
public class ur5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f469129d;

    /* renamed from: e, reason: collision with root package name */
    public int f469130e;

    /* renamed from: f, reason: collision with root package name */
    public int f469131f;

    /* renamed from: g, reason: collision with root package name */
    public int f469132g;

    /* renamed from: h, reason: collision with root package name */
    public int f469133h;

    /* renamed from: i, reason: collision with root package name */
    public int f469134i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ur5)) {
            return false;
        }
        r45.ur5 ur5Var = (r45.ur5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f469129d), java.lang.Integer.valueOf(ur5Var.f469129d)) && n51.f.a(java.lang.Integer.valueOf(this.f469130e), java.lang.Integer.valueOf(ur5Var.f469130e)) && n51.f.a(java.lang.Integer.valueOf(this.f469131f), java.lang.Integer.valueOf(ur5Var.f469131f)) && n51.f.a(java.lang.Integer.valueOf(this.f469132g), java.lang.Integer.valueOf(ur5Var.f469132g)) && n51.f.a(java.lang.Integer.valueOf(this.f469133h), java.lang.Integer.valueOf(ur5Var.f469133h)) && n51.f.a(java.lang.Integer.valueOf(this.f469134i), java.lang.Integer.valueOf(ur5Var.f469134i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f469129d);
            fVar.e(2, this.f469130e);
            fVar.e(3, this.f469131f);
            fVar.e(4, this.f469132g);
            fVar.e(5, this.f469133h);
            fVar.e(6, this.f469134i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f469129d) + 0 + b36.f.e(2, this.f469130e) + b36.f.e(3, this.f469131f) + b36.f.e(4, this.f469132g) + b36.f.e(5, this.f469133h) + b36.f.e(6, this.f469134i);
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
        r45.ur5 ur5Var = (r45.ur5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ur5Var.f469129d = aVar2.g(intValue);
                return 0;
            case 2:
                ur5Var.f469130e = aVar2.g(intValue);
                return 0;
            case 3:
                ur5Var.f469131f = aVar2.g(intValue);
                return 0;
            case 4:
                ur5Var.f469132g = aVar2.g(intValue);
                return 0;
            case 5:
                ur5Var.f469133h = aVar2.g(intValue);
                return 0;
            case 6:
                ur5Var.f469134i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
