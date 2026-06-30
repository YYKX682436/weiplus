package bw5;

/* loaded from: classes2.dex */
public class w40 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f116114d;

    /* renamed from: e, reason: collision with root package name */
    public int f116115e;

    /* renamed from: f, reason: collision with root package name */
    public long f116116f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f116117g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f116118h;

    /* renamed from: i, reason: collision with root package name */
    public long f116119i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f116120m = new boolean[7];

    static {
        new bw5.w40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.w40 mo11468x92b714fd(byte[] bArr) {
        return (bw5.w40) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w40)) {
            return false;
        }
        bw5.w40 w40Var = (bw5.w40) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f116114d), java.lang.Long.valueOf(w40Var.f116114d)) && n51.f.a(java.lang.Integer.valueOf(this.f116115e), java.lang.Integer.valueOf(w40Var.f116115e)) && n51.f.a(java.lang.Long.valueOf(this.f116116f), java.lang.Long.valueOf(w40Var.f116116f)) && n51.f.a(this.f116117g, w40Var.f116117g) && n51.f.a(this.f116118h, w40Var.f116118h) && n51.f.a(java.lang.Long.valueOf(this.f116119i), java.lang.Long.valueOf(w40Var.f116119i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.w40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116120m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f116114d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f116115e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f116116f);
            }
            java.lang.String str = this.f116117g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f116118h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.h(6, this.f116119i);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f116114d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f116115e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f116116f);
            }
            java.lang.String str3 = this.f116117g;
            if (str3 != null && zArr[4]) {
                h17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f116118h;
            if (str4 != null && zArr[5]) {
                h17 += b36.f.j(5, str4);
            }
            return zArr[6] ? h17 + b36.f.h(6, this.f116119i) : h17;
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
                this.f116114d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f116115e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116116f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116117g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116118h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116119i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
