package bw5;

/* loaded from: classes2.dex */
public class p80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113026d;

    /* renamed from: e, reason: collision with root package name */
    public long f113027e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f113028f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113029g;

    /* renamed from: h, reason: collision with root package name */
    public long f113030h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f113031i;

    /* renamed from: m, reason: collision with root package name */
    public long f113032m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.o80 f113033n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f113034o = new boolean[9];

    static {
        new bw5.p80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p80)) {
            return false;
        }
        bw5.p80 p80Var = (bw5.p80) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113026d), java.lang.Integer.valueOf(p80Var.f113026d)) && n51.f.a(java.lang.Long.valueOf(this.f113027e), java.lang.Long.valueOf(p80Var.f113027e)) && n51.f.a(java.lang.Boolean.valueOf(this.f113028f), java.lang.Boolean.valueOf(p80Var.f113028f)) && n51.f.a(this.f113029g, p80Var.f113029g) && n51.f.a(java.lang.Long.valueOf(this.f113030h), java.lang.Long.valueOf(p80Var.f113030h)) && n51.f.a(java.lang.Boolean.valueOf(this.f113031i), java.lang.Boolean.valueOf(p80Var.f113031i)) && n51.f.a(java.lang.Long.valueOf(this.f113032m), java.lang.Long.valueOf(p80Var.f113032m)) && n51.f.a(this.f113033n, p80Var.f113033n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.p80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113034o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113026d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f113027e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f113028f);
            }
            java.lang.String str = this.f113029g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.h(5, this.f113030h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f113031i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f113032m);
            }
            bw5.o80 o80Var = this.f113033n;
            if (o80Var != null && zArr[8]) {
                fVar.i(8, o80Var.mo75928xcd1e8d8());
                this.f113033n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f113026d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f113027e);
            }
            if (zArr[3]) {
                e17 += b36.f.a(3, this.f113028f);
            }
            java.lang.String str2 = this.f113029g;
            if (str2 != null && zArr[4]) {
                e17 += b36.f.j(4, str2);
            }
            if (zArr[5]) {
                e17 += b36.f.h(5, this.f113030h);
            }
            if (zArr[6]) {
                e17 += b36.f.a(6, this.f113031i);
            }
            if (zArr[7]) {
                e17 += b36.f.h(7, this.f113032m);
            }
            bw5.o80 o80Var2 = this.f113033n;
            return (o80Var2 == null || !zArr[8]) ? e17 : e17 + b36.f.i(8, o80Var2.mo75928xcd1e8d8());
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
                this.f113026d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113027e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113028f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113029g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113030h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113031i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113032m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.o80 o80Var3 = new bw5.o80();
                    if (bArr != null && bArr.length > 0) {
                        o80Var3.mo11468x92b714fd(bArr);
                    }
                    this.f113033n = o80Var3;
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.p80) super.mo11468x92b714fd(bArr);
    }
}
