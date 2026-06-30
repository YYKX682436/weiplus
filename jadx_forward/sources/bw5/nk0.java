package bw5;

/* loaded from: classes4.dex */
public class nk0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.qk0 f112244d;

    /* renamed from: f, reason: collision with root package name */
    public int f112246f;

    /* renamed from: h, reason: collision with root package name */
    public int f112248h;

    /* renamed from: m, reason: collision with root package name */
    public int f112250m;

    /* renamed from: o, reason: collision with root package name */
    public int f112252o;

    /* renamed from: q, reason: collision with root package name */
    public int f112254q;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f112245e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f112247g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f112249i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f112251n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f112253p = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f112255r = new boolean[12];

    static {
        new bw5.nk0();
    }

    public bw5.nk0 a(int i17) {
        this.f112254q = i17;
        this.f112255r[11] = true;
        return this;
    }

    public bw5.qk0 b() {
        return this.f112255r[1] ? this.f112244d : bw5.qk0.SNS_VISIBILITY_UNKNOWN;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.nk0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.nk0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nk0)) {
            return false;
        }
        bw5.nk0 nk0Var = (bw5.nk0) fVar;
        return n51.f.a(this.f112244d, nk0Var.f112244d) && n51.f.a(this.f112245e, nk0Var.f112245e) && n51.f.a(java.lang.Integer.valueOf(this.f112246f), java.lang.Integer.valueOf(nk0Var.f112246f)) && n51.f.a(this.f112247g, nk0Var.f112247g) && n51.f.a(java.lang.Integer.valueOf(this.f112248h), java.lang.Integer.valueOf(nk0Var.f112248h)) && n51.f.a(this.f112249i, nk0Var.f112249i) && n51.f.a(java.lang.Integer.valueOf(this.f112250m), java.lang.Integer.valueOf(nk0Var.f112250m)) && n51.f.a(this.f112251n, nk0Var.f112251n) && n51.f.a(java.lang.Integer.valueOf(this.f112252o), java.lang.Integer.valueOf(nk0Var.f112252o)) && n51.f.a(this.f112253p, nk0Var.f112253p) && n51.f.a(java.lang.Integer.valueOf(this.f112254q), java.lang.Integer.valueOf(nk0Var.f112254q));
    }

    public bw5.nk0 h(int i17) {
        this.f112248h = i17;
        this.f112255r[5] = true;
        return this;
    }

    public bw5.nk0 i(bw5.qk0 qk0Var) {
        this.f112244d = qk0Var;
        this.f112255r[1] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.nk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112255r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.qk0 qk0Var = this.f112244d;
            if (qk0Var != null && zArr[1]) {
                fVar.e(1, qk0Var.f113684d);
            }
            fVar.g(2, 8, this.f112245e);
            if (zArr[3]) {
                fVar.e(3, this.f112246f);
            }
            fVar.g(4, 8, this.f112247g);
            if (zArr[5]) {
                fVar.e(5, this.f112248h);
            }
            fVar.g(6, 8, this.f112249i);
            if (zArr[7]) {
                fVar.e(7, this.f112250m);
            }
            fVar.g(8, 8, this.f112251n);
            if (zArr[9]) {
                fVar.e(9, this.f112252o);
            }
            fVar.g(10, 8, this.f112253p);
            if (zArr[11]) {
                fVar.e(11, this.f112254q);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.qk0 qk0Var2 = this.f112244d;
            if (qk0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, qk0Var2.f113684d);
            }
            int g17 = i18 + b36.f.g(2, 8, this.f112245e);
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f112246f);
            }
            int g18 = g17 + b36.f.g(4, 8, this.f112247g);
            if (zArr[5]) {
                g18 += b36.f.e(5, this.f112248h);
            }
            int g19 = g18 + b36.f.g(6, 8, this.f112249i);
            if (zArr[7]) {
                g19 += b36.f.e(7, this.f112250m);
            }
            int g27 = g19 + b36.f.g(8, 8, this.f112251n);
            if (zArr[9]) {
                g27 += b36.f.e(9, this.f112252o);
            }
            int g28 = g27 + b36.f.g(10, 8, this.f112253p);
            return zArr[11] ? g28 + b36.f.e(11, this.f112254q) : g28;
        }
        if (i17 == 2) {
            this.f112245e.clear();
            this.f112247g.clear();
            this.f112249i.clear();
            this.f112251n.clear();
            this.f112253p.clear();
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
                this.f112244d = bw5.qk0.a(aVar2.g(intValue));
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.pk0 pk0Var = new bw5.pk0();
                    if (bArr != null && bArr.length > 0) {
                        pk0Var.mo11468x92b714fd(bArr);
                    }
                    this.f112245e.add(pk0Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f112246f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.ok0 ok0Var = new bw5.ok0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ok0Var.mo11468x92b714fd(bArr2);
                    }
                    this.f112247g.add(ok0Var);
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f112248h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.ok0 ok0Var2 = new bw5.ok0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ok0Var2.mo11468x92b714fd(bArr3);
                    }
                    this.f112249i.add(ok0Var2);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f112250m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.pk0 pk0Var2 = new bw5.pk0();
                    if (bArr4 != null && bArr4.length > 0) {
                        pk0Var2.mo11468x92b714fd(bArr4);
                    }
                    this.f112251n.add(pk0Var2);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f112252o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.ok0 ok0Var3 = new bw5.ok0();
                    if (bArr5 != null && bArr5.length > 0) {
                        ok0Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f112253p.add(ok0Var3);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f112254q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
