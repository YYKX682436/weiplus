package bw5;

/* loaded from: classes2.dex */
public class wr0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f116371d;

    /* renamed from: e, reason: collision with root package name */
    public int f116372e;

    /* renamed from: f, reason: collision with root package name */
    public int f116373f;

    /* renamed from: g, reason: collision with root package name */
    public int f116374g;

    /* renamed from: h, reason: collision with root package name */
    public int f116375h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f116376i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f116377m = new boolean[7];

    static {
        new bw5.wr0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wr0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.wr0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wr0)) {
            return false;
        }
        bw5.wr0 wr0Var = (bw5.wr0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f116371d), java.lang.Integer.valueOf(wr0Var.f116371d)) && n51.f.a(java.lang.Integer.valueOf(this.f116372e), java.lang.Integer.valueOf(wr0Var.f116372e)) && n51.f.a(java.lang.Integer.valueOf(this.f116373f), java.lang.Integer.valueOf(wr0Var.f116373f)) && n51.f.a(java.lang.Integer.valueOf(this.f116374g), java.lang.Integer.valueOf(wr0Var.f116374g)) && n51.f.a(java.lang.Integer.valueOf(this.f116375h), java.lang.Integer.valueOf(wr0Var.f116375h)) && n51.f.a(this.f116376i, wr0Var.f116376i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wr0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116377m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f116371d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f116372e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f116373f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116374g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f116375h);
            }
            java.lang.String str = this.f116376i;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f116371d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f116372e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f116373f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f116374g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f116375h);
            }
            java.lang.String str2 = this.f116376i;
            return (str2 == null || !zArr[6]) ? e17 : e17 + b36.f.j(6, str2);
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
                this.f116371d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f116372e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116373f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116374g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116375h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116376i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
