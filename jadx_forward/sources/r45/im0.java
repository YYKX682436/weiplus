package r45;

/* loaded from: classes9.dex */
public class im0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f458677d;

    /* renamed from: e, reason: collision with root package name */
    public int f458678e;

    /* renamed from: f, reason: collision with root package name */
    public int f458679f;

    /* renamed from: g, reason: collision with root package name */
    public int f458680g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.im0)) {
            return false;
        }
        r45.im0 im0Var = (r45.im0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f458677d), java.lang.Integer.valueOf(im0Var.f458677d)) && n51.f.a(java.lang.Integer.valueOf(this.f458678e), java.lang.Integer.valueOf(im0Var.f458678e)) && n51.f.a(java.lang.Integer.valueOf(this.f458679f), java.lang.Integer.valueOf(im0Var.f458679f)) && n51.f.a(java.lang.Integer.valueOf(this.f458680g), java.lang.Integer.valueOf(im0Var.f458680g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f458677d);
            fVar.e(2, this.f458678e);
            fVar.e(3, this.f458679f);
            fVar.e(4, this.f458680g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f458677d) + 0 + b36.f.e(2, this.f458678e) + b36.f.e(3, this.f458679f) + b36.f.e(4, this.f458680g);
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
        r45.im0 im0Var = (r45.im0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            im0Var.f458677d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            im0Var.f458678e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            im0Var.f458679f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        im0Var.f458680g = aVar2.g(intValue);
        return 0;
    }
}
