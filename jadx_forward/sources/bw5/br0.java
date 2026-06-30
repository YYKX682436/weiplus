package bw5;

/* loaded from: classes2.dex */
public class br0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f107333d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f107334e;

    /* renamed from: f, reason: collision with root package name */
    public int f107335f;

    /* renamed from: g, reason: collision with root package name */
    public int f107336g;

    /* renamed from: h, reason: collision with root package name */
    public long f107337h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f107338i;

    /* renamed from: m, reason: collision with root package name */
    public int f107339m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.wo0 f107340n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f107341o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f107342p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f107343q;

    /* renamed from: r, reason: collision with root package name */
    public int f107344r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f107345s = new boolean[13];

    static {
        new bw5.br0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.br0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.br0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.br0)) {
            return false;
        }
        bw5.br0 br0Var = (bw5.br0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f107333d), java.lang.Boolean.valueOf(br0Var.f107333d)) && n51.f.a(java.lang.Boolean.valueOf(this.f107334e), java.lang.Boolean.valueOf(br0Var.f107334e)) && n51.f.a(java.lang.Integer.valueOf(this.f107335f), java.lang.Integer.valueOf(br0Var.f107335f)) && n51.f.a(java.lang.Integer.valueOf(this.f107336g), java.lang.Integer.valueOf(br0Var.f107336g)) && n51.f.a(java.lang.Long.valueOf(this.f107337h), java.lang.Long.valueOf(br0Var.f107337h)) && n51.f.a(java.lang.Boolean.valueOf(this.f107338i), java.lang.Boolean.valueOf(br0Var.f107338i)) && n51.f.a(java.lang.Integer.valueOf(this.f107339m), java.lang.Integer.valueOf(br0Var.f107339m)) && n51.f.a(this.f107340n, br0Var.f107340n) && n51.f.a(java.lang.Boolean.valueOf(this.f107341o), java.lang.Boolean.valueOf(br0Var.f107341o)) && n51.f.a(java.lang.Boolean.valueOf(this.f107342p), java.lang.Boolean.valueOf(br0Var.f107342p)) && n51.f.a(java.lang.Boolean.valueOf(this.f107343q), java.lang.Boolean.valueOf(br0Var.f107343q)) && n51.f.a(java.lang.Integer.valueOf(this.f107344r), java.lang.Integer.valueOf(br0Var.f107344r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.br0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107345s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f107333d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f107334e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f107335f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f107336g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f107337h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f107338i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f107339m);
            }
            bw5.wo0 wo0Var = this.f107340n;
            if (wo0Var != null && zArr[8]) {
                fVar.i(8, wo0Var.mo75928xcd1e8d8());
                this.f107340n.mo75956x3d5d1f78(fVar);
            }
            if (zArr[9]) {
                fVar.a(9, this.f107341o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f107342p);
            }
            if (zArr[11]) {
                fVar.a(11, this.f107343q);
            }
            if (!zArr[12]) {
                return 0;
            }
            fVar.e(12, this.f107344r);
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f107333d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f107334e);
            }
            if (zArr[3]) {
                a17 += b36.f.e(3, this.f107335f);
            }
            if (zArr[4]) {
                a17 += b36.f.e(4, this.f107336g);
            }
            if (zArr[5]) {
                a17 += b36.f.h(5, this.f107337h);
            }
            if (zArr[6]) {
                a17 += b36.f.a(6, this.f107338i);
            }
            if (zArr[7]) {
                a17 += b36.f.e(7, this.f107339m);
            }
            bw5.wo0 wo0Var2 = this.f107340n;
            if (wo0Var2 != null && zArr[8]) {
                a17 += b36.f.i(8, wo0Var2.mo75928xcd1e8d8());
            }
            if (zArr[9]) {
                a17 += b36.f.a(9, this.f107341o);
            }
            if (zArr[10]) {
                a17 += b36.f.a(10, this.f107342p);
            }
            if (zArr[11]) {
                a17 += b36.f.a(11, this.f107343q);
            }
            return zArr[12] ? a17 + b36.f.e(12, this.f107344r) : a17;
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
                this.f107333d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107334e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107335f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107336g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107337h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107338i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107339m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.wo0 wo0Var3 = new bw5.wo0();
                    if (bArr != null && bArr.length > 0) {
                        wo0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f107340n = wo0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f107341o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f107342p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f107343q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f107344r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
