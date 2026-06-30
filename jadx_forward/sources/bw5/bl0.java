package bw5;

/* loaded from: classes8.dex */
public class bl0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107263d;

    /* renamed from: e, reason: collision with root package name */
    public int f107264e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107265f;

    /* renamed from: g, reason: collision with root package name */
    public long f107266g;

    /* renamed from: h, reason: collision with root package name */
    public long f107267h;

    /* renamed from: i, reason: collision with root package name */
    public long f107268i;

    /* renamed from: m, reason: collision with root package name */
    public int f107269m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f107270n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.zk0 f107271o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.al0 f107272p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f107273q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f107274r = new boolean[12];

    static {
        new bw5.bl0();
    }

    public bw5.zk0 b() {
        return this.f107274r[9] ? this.f107271o : new bw5.zk0();
    }

    public java.lang.String c() {
        return this.f107274r[3] ? this.f107265f : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bl0)) {
            return false;
        }
        bw5.bl0 bl0Var = (bw5.bl0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107263d), java.lang.Integer.valueOf(bl0Var.f107263d)) && n51.f.a(java.lang.Integer.valueOf(this.f107264e), java.lang.Integer.valueOf(bl0Var.f107264e)) && n51.f.a(this.f107265f, bl0Var.f107265f) && n51.f.a(java.lang.Long.valueOf(this.f107266g), java.lang.Long.valueOf(bl0Var.f107266g)) && n51.f.a(java.lang.Long.valueOf(this.f107267h), java.lang.Long.valueOf(bl0Var.f107267h)) && n51.f.a(java.lang.Long.valueOf(this.f107268i), java.lang.Long.valueOf(bl0Var.f107268i)) && n51.f.a(java.lang.Integer.valueOf(this.f107269m), java.lang.Integer.valueOf(bl0Var.f107269m)) && n51.f.a(this.f107270n, bl0Var.f107270n) && n51.f.a(this.f107271o, bl0Var.f107271o) && n51.f.a(this.f107272p, bl0Var.f107272p) && n51.f.a(this.f107273q, bl0Var.f107273q);
    }

    public bw5.al0 d() {
        return this.f107274r[10] ? this.f107272p : new bw5.al0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public bw5.bl0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.bl0) super.mo11468x92b714fd(bArr);
    }

    /* renamed from: getTitle */
    public java.lang.String m11606x7531c8a2() {
        return this.f107274r[8] ? this.f107270n : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bl0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107274r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107263d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f107264e);
            }
            java.lang.String str = this.f107265f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f107266g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f107267h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f107268i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f107269m);
            }
            java.lang.String str2 = this.f107270n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            bw5.zk0 zk0Var = this.f107271o;
            if (zk0Var != null && zArr[9]) {
                fVar.i(9, zk0Var.mo75928xcd1e8d8());
                this.f107271o.mo75956x3d5d1f78(fVar);
            }
            bw5.al0 al0Var = this.f107272p;
            if (al0Var != null && zArr[10]) {
                fVar.i(10, al0Var.mo75928xcd1e8d8());
                this.f107272p.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f107273q;
            if (gVar != null && zArr[11]) {
                fVar.b(11, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107263d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f107264e);
            }
            java.lang.String str3 = this.f107265f;
            if (str3 != null && zArr[3]) {
                e17 += b36.f.j(3, str3);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f107266g);
            }
            if (zArr[5]) {
                e17 += b36.f.h(5, this.f107267h);
            }
            if (zArr[6]) {
                e17 += b36.f.h(6, this.f107268i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f107269m);
            }
            java.lang.String str4 = this.f107270n;
            if (str4 != null && zArr[8]) {
                e17 += b36.f.j(8, str4);
            }
            bw5.zk0 zk0Var2 = this.f107271o;
            if (zk0Var2 != null && zArr[9]) {
                e17 += b36.f.i(9, zk0Var2.mo75928xcd1e8d8());
            }
            bw5.al0 al0Var2 = this.f107272p;
            if (al0Var2 != null && zArr[10]) {
                e17 += b36.f.i(10, al0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f107273q;
            return (gVar2 == null || !zArr[11]) ? e17 : e17 + b36.f.b(11, gVar2);
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
                this.f107263d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107264e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107265f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107266g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107267h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107268i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f107269m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107270n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.zk0 zk0Var3 = new bw5.zk0();
                    if (bArr != null && bArr.length > 0) {
                        zk0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f107271o = zk0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.al0 al0Var3 = new bw5.al0();
                    if (bArr2 != null && bArr2.length > 0) {
                        al0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f107272p = al0Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f107273q = aVar2.d(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
