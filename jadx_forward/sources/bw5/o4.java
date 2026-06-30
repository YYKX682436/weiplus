package bw5;

/* loaded from: classes2.dex */
public class o4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f112468d;

    /* renamed from: e, reason: collision with root package name */
    public int f112469e;

    /* renamed from: f, reason: collision with root package name */
    public float f112470f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112471g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f112472h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f112473i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f112474m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f112475n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f112476o = new boolean[9];

    static {
        new bw5.o4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o4 mo11468x92b714fd(byte[] bArr) {
        return (bw5.o4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o4)) {
            return false;
        }
        bw5.o4 o4Var = (bw5.o4) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f112468d), java.lang.Boolean.valueOf(o4Var.f112468d)) && n51.f.a(java.lang.Integer.valueOf(this.f112469e), java.lang.Integer.valueOf(o4Var.f112469e)) && n51.f.a(java.lang.Float.valueOf(this.f112470f), java.lang.Float.valueOf(o4Var.f112470f)) && n51.f.a(this.f112471g, o4Var.f112471g) && n51.f.a(java.lang.Boolean.valueOf(this.f112472h), java.lang.Boolean.valueOf(o4Var.f112472h)) && n51.f.a(this.f112473i, o4Var.f112473i) && n51.f.a(this.f112474m, o4Var.f112474m) && n51.f.a(this.f112475n, o4Var.f112475n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.o4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112476o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f112468d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f112469e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f112470f);
            }
            java.lang.String str = this.f112471g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.a(5, this.f112472h);
            }
            java.lang.String str2 = this.f112473i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f112474m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f112475n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f112468d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f112469e);
            }
            if (zArr[3]) {
                a17 += b36.f.d(3, this.f112470f);
            }
            java.lang.String str5 = this.f112471g;
            if (str5 != null && zArr[4]) {
                a17 += b36.f.j(4, str5);
            }
            if (zArr[5]) {
                a17 += b36.f.a(5, this.f112472h);
            }
            java.lang.String str6 = this.f112473i;
            if (str6 != null && zArr[6]) {
                a17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f112474m;
            if (str7 != null && zArr[7]) {
                a17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f112475n;
            return (str8 == null || !zArr[8]) ? a17 : a17 + b36.f.j(8, str8);
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
                this.f112468d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112469e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112470f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112471g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112472h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112473i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112474m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f112475n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
