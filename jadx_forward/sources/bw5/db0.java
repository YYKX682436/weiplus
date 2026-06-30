package bw5;

/* loaded from: classes2.dex */
public class db0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107951d;

    /* renamed from: e, reason: collision with root package name */
    public float f107952e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f107953f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f107954g = new boolean[4];

    static {
        new bw5.db0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.db0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.db0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.db0)) {
            return false;
        }
        bw5.db0 db0Var = (bw5.db0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107951d), java.lang.Integer.valueOf(db0Var.f107951d)) && n51.f.a(java.lang.Float.valueOf(this.f107952e), java.lang.Float.valueOf(db0Var.f107952e)) && n51.f.a(this.f107953f, db0Var.f107953f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.db0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107954g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107951d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f107952e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f107953f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107951d) : 0;
            if (zArr[2]) {
                e17 += b36.f.d(2, this.f107952e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f107953f;
            return (gVar2 == null || !zArr[3]) ? e17 : e17 + b36.f.b(3, gVar2);
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
            this.f107951d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107952e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f107953f = aVar2.d(intValue);
        zArr[3] = true;
        return 0;
    }
}
