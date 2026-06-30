package r45;

/* loaded from: classes7.dex */
public class ud7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f468806d;

    /* renamed from: e, reason: collision with root package name */
    public int f468807e;

    /* renamed from: f, reason: collision with root package name */
    public int f468808f;

    /* renamed from: g, reason: collision with root package name */
    public int f468809g;

    /* renamed from: h, reason: collision with root package name */
    public int f468810h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ud7)) {
            return false;
        }
        r45.ud7 ud7Var = (r45.ud7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f468806d), java.lang.Integer.valueOf(ud7Var.f468806d)) && n51.f.a(java.lang.Integer.valueOf(this.f468807e), java.lang.Integer.valueOf(ud7Var.f468807e)) && n51.f.a(java.lang.Integer.valueOf(this.f468808f), java.lang.Integer.valueOf(ud7Var.f468808f)) && n51.f.a(java.lang.Integer.valueOf(this.f468809g), java.lang.Integer.valueOf(ud7Var.f468809g)) && n51.f.a(java.lang.Integer.valueOf(this.f468810h), java.lang.Integer.valueOf(ud7Var.f468810h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f468806d);
            fVar.e(2, this.f468807e);
            fVar.e(3, this.f468808f);
            fVar.e(4, this.f468809g);
            fVar.e(5, this.f468810h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f468806d) + 0 + b36.f.e(2, this.f468807e) + b36.f.e(3, this.f468808f) + b36.f.e(4, this.f468809g) + b36.f.e(5, this.f468810h);
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
        r45.ud7 ud7Var = (r45.ud7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ud7Var.f468806d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ud7Var.f468807e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ud7Var.f468808f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            ud7Var.f468809g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ud7Var.f468810h = aVar2.g(intValue);
        return 0;
    }
}
