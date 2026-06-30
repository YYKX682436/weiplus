package r45;

/* loaded from: classes4.dex */
public class e44 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454540d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454541e;

    /* renamed from: f, reason: collision with root package name */
    public int f454542f;

    /* renamed from: g, reason: collision with root package name */
    public int f454543g;

    /* renamed from: h, reason: collision with root package name */
    public int f454544h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e44)) {
            return false;
        }
        r45.e44 e44Var = (r45.e44) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454540d), java.lang.Integer.valueOf(e44Var.f454540d)) && n51.f.a(this.f454541e, e44Var.f454541e) && n51.f.a(java.lang.Integer.valueOf(this.f454542f), java.lang.Integer.valueOf(e44Var.f454542f)) && n51.f.a(java.lang.Integer.valueOf(this.f454543g), java.lang.Integer.valueOf(e44Var.f454543g)) && n51.f.a(java.lang.Integer.valueOf(this.f454544h), java.lang.Integer.valueOf(e44Var.f454544h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454540d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f454541e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f454542f);
            fVar.e(4, this.f454543g);
            fVar.e(5, this.f454544h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454540d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f454541e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            return e17 + b36.f.e(3, this.f454542f) + b36.f.e(4, this.f454543g) + b36.f.e(5, this.f454544h);
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
        r45.e44 e44Var = (r45.e44) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e44Var.f454540d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            e44Var.f454541e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            e44Var.f454542f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            e44Var.f454543g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        e44Var.f454544h = aVar2.g(intValue);
        return 0;
    }
}
