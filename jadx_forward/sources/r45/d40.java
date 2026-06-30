package r45;

/* loaded from: classes9.dex */
public class d40 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f453598d;

    /* renamed from: e, reason: collision with root package name */
    public int f453599e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f453600f;

    /* renamed from: g, reason: collision with root package name */
    public long f453601g;

    /* renamed from: h, reason: collision with root package name */
    public int f453602h;

    /* renamed from: i, reason: collision with root package name */
    public int f453603i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d40)) {
            return false;
        }
        r45.d40 d40Var = (r45.d40) fVar;
        return n51.f.a(this.f453598d, d40Var.f453598d) && n51.f.a(java.lang.Integer.valueOf(this.f453599e), java.lang.Integer.valueOf(d40Var.f453599e)) && n51.f.a(this.f453600f, d40Var.f453600f) && n51.f.a(java.lang.Long.valueOf(this.f453601g), java.lang.Long.valueOf(d40Var.f453601g)) && n51.f.a(java.lang.Integer.valueOf(this.f453602h), java.lang.Integer.valueOf(d40Var.f453602h)) && n51.f.a(java.lang.Integer.valueOf(this.f453603i), java.lang.Integer.valueOf(d40Var.f453603i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f453598d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.e(2, this.f453599e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f453600f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            fVar.h(4, this.f453601g);
            fVar.e(5, this.f453602h);
            fVar.e(6, this.f453603i);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f453598d;
            int b17 = (gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0) + b36.f.e(2, this.f453599e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f453600f;
            if (gVar4 != null) {
                b17 += b36.f.b(3, gVar4);
            }
            return b17 + b36.f.h(4, this.f453601g) + b36.f.e(5, this.f453602h) + b36.f.e(6, this.f453603i);
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
        r45.d40 d40Var = (r45.d40) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                d40Var.f453598d = aVar2.d(intValue);
                return 0;
            case 2:
                d40Var.f453599e = aVar2.g(intValue);
                return 0;
            case 3:
                d40Var.f453600f = aVar2.d(intValue);
                return 0;
            case 4:
                d40Var.f453601g = aVar2.i(intValue);
                return 0;
            case 5:
                d40Var.f453602h = aVar2.g(intValue);
                return 0;
            case 6:
                d40Var.f453603i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
