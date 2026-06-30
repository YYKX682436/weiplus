package bw5;

/* loaded from: classes4.dex */
public class z2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f117323d;

    /* renamed from: e, reason: collision with root package name */
    public int f117324e;

    /* renamed from: f, reason: collision with root package name */
    public int f117325f;

    /* renamed from: g, reason: collision with root package name */
    public int f117326g;

    /* renamed from: h, reason: collision with root package name */
    public int f117327h;

    /* renamed from: i, reason: collision with root package name */
    public int f117328i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f117329m = new boolean[7];

    static {
        new bw5.z2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.z2 mo11468x92b714fd(byte[] bArr) {
        return (bw5.z2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z2)) {
            return false;
        }
        bw5.z2 z2Var = (bw5.z2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f117323d), java.lang.Integer.valueOf(z2Var.f117323d)) && n51.f.a(java.lang.Integer.valueOf(this.f117324e), java.lang.Integer.valueOf(z2Var.f117324e)) && n51.f.a(java.lang.Integer.valueOf(this.f117325f), java.lang.Integer.valueOf(z2Var.f117325f)) && n51.f.a(java.lang.Integer.valueOf(this.f117326g), java.lang.Integer.valueOf(z2Var.f117326g)) && n51.f.a(java.lang.Integer.valueOf(this.f117327h), java.lang.Integer.valueOf(z2Var.f117327h)) && n51.f.a(java.lang.Integer.valueOf(this.f117328i), java.lang.Integer.valueOf(z2Var.f117328i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.z2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f117329m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f117323d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f117324e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f117325f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f117326g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f117327h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f117328i);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f117323d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f117324e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f117325f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f117326g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f117327h);
            }
            return zArr[6] ? e17 + b36.f.e(6, this.f117328i) : e17;
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
        switch (intValue) {
            case 1:
                this.f117323d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f117324e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f117325f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f117326g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f117327h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117328i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
