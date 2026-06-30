package bw5;

/* loaded from: classes2.dex */
public class ba0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107113d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107114e;

    /* renamed from: f, reason: collision with root package name */
    public long f107115f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107116g;

    /* renamed from: h, reason: collision with root package name */
    public int f107117h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f107118i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f107119m = new boolean[7];

    static {
        new bw5.ba0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ba0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ba0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ba0)) {
            return false;
        }
        bw5.ba0 ba0Var = (bw5.ba0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107113d), java.lang.Integer.valueOf(ba0Var.f107113d)) && n51.f.a(this.f107114e, ba0Var.f107114e) && n51.f.a(java.lang.Long.valueOf(this.f107115f), java.lang.Long.valueOf(ba0Var.f107115f)) && n51.f.a(this.f107116g, ba0Var.f107116g) && n51.f.a(java.lang.Integer.valueOf(this.f107117h), java.lang.Integer.valueOf(ba0Var.f107117h)) && n51.f.a(this.f107118i, ba0Var.f107118i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ba0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107119m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107113d);
            }
            java.lang.String str = this.f107114e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f107115f);
            }
            java.lang.String str2 = this.f107116g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f107117h);
            }
            java.lang.String str3 = this.f107118i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107113d) : 0;
            java.lang.String str4 = this.f107114e;
            if (str4 != null && zArr[2]) {
                e17 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f107115f);
            }
            java.lang.String str5 = this.f107116g;
            if (str5 != null && zArr[4]) {
                e17 += b36.f.j(4, str5);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f107117h);
            }
            java.lang.String str6 = this.f107118i;
            return (str6 == null || !zArr[6]) ? e17 : e17 + b36.f.j(6, str6);
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
                this.f107113d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107114e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107115f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107116g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107117h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107118i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
