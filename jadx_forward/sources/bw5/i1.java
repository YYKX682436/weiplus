package bw5;

/* loaded from: classes2.dex */
public class i1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109956d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109957e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109958f;

    /* renamed from: g, reason: collision with root package name */
    public long f109959g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109960h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f109961i = new boolean[6];

    static {
        new bw5.i1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.i1 mo11468x92b714fd(byte[] bArr) {
        return (bw5.i1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.i1)) {
            return false;
        }
        bw5.i1 i1Var = (bw5.i1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109956d), java.lang.Integer.valueOf(i1Var.f109956d)) && n51.f.a(this.f109957e, i1Var.f109957e) && n51.f.a(this.f109958f, i1Var.f109958f) && n51.f.a(java.lang.Long.valueOf(this.f109959g), java.lang.Long.valueOf(i1Var.f109959g)) && n51.f.a(this.f109960h, i1Var.f109960h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.i1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109961i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109956d);
            }
            java.lang.String str = this.f109957e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f109958f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.h(4, this.f109959g);
            }
            java.lang.String str3 = this.f109960h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f109956d) : 0;
            java.lang.String str4 = this.f109957e;
            if (str4 != null && zArr[2]) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f109958f;
            if (str5 != null && zArr[3]) {
                e17 += b36.f.j(3, str5);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f109959g);
            }
            java.lang.String str6 = this.f109960h;
            return (str6 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str6);
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
            this.f109956d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f109957e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f109958f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f109959g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f109960h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
