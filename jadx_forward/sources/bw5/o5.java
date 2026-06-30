package bw5;

/* loaded from: classes9.dex */
public class o5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f112482d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f112483e;

    /* renamed from: f, reason: collision with root package name */
    public int f112484f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112485g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112486h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f112487i = new boolean[6];

    static {
        new bw5.o5();
    }

    public com.p314xaae8f345.mm.p2495xc50a8b8b.g b() {
        return this.f112487i[2] ? this.f112483e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.o5 mo11468x92b714fd(byte[] bArr) {
        return (bw5.o5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o5)) {
            return false;
        }
        bw5.o5 o5Var = (bw5.o5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f112482d), java.lang.Integer.valueOf(o5Var.f112482d)) && n51.f.a(this.f112483e, o5Var.f112483e) && n51.f.a(java.lang.Integer.valueOf(this.f112484f), java.lang.Integer.valueOf(o5Var.f112484f)) && n51.f.a(this.f112485g, o5Var.f112485g) && n51.f.a(this.f112486h, o5Var.f112486h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.o5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112487i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f112482d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f112483e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f112484f);
            }
            java.lang.String str = this.f112485g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f112486h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f112482d) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f112483e;
            if (gVar2 != null && zArr[2]) {
                e17 += b36.f.b(2, gVar2);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f112484f);
            }
            java.lang.String str3 = this.f112485g;
            if (str3 != null && zArr[4]) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f112486h;
            return (str4 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str4);
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
            this.f112482d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f112483e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f112484f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f112485g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f112486h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
