package bw5;

/* loaded from: classes7.dex */
public class zd0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f117478d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f117479e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f117480f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f117481g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f117482h = new boolean[5];

    static {
        new bw5.zd0();
    }

    public com.p314xaae8f345.mm.p2495xc50a8b8b.g b() {
        return this.f117482h[2] ? this.f117479e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.zd0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.zd0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zd0)) {
            return false;
        }
        bw5.zd0 zd0Var = (bw5.zd0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f117478d), java.lang.Integer.valueOf(zd0Var.f117478d)) && n51.f.a(this.f117479e, zd0Var.f117479e) && n51.f.a(this.f117480f, zd0Var.f117480f) && n51.f.a(this.f117481g, zd0Var.f117481g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f117482h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f117478d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f117479e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f117480f;
            if (gVar2 != null && zArr[3]) {
                fVar.b(3, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f117481g;
            if (gVar3 != null && zArr[4]) {
                fVar.b(4, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f117478d) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f117479e;
            if (gVar4 != null && zArr[2]) {
                e17 += b36.f.b(2, gVar4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f117480f;
            if (gVar5 != null && zArr[3]) {
                e17 += b36.f.b(3, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f117481g;
            return (gVar6 == null || !zArr[4]) ? e17 : e17 + b36.f.b(4, gVar6);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f117478d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f117479e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f117480f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f117481g = aVar2.d(intValue);
        zArr[4] = true;
        return 0;
    }
}
