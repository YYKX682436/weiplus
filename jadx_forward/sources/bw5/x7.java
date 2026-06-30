package bw5;

/* loaded from: classes9.dex */
public class x7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f116506d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.u7 f116507e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.q7 f116508f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.o7 f116509g;

    /* renamed from: i, reason: collision with root package name */
    public bw5.v7 f116511i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f116513n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f116514o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.s7 f116515p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.m7 f116516q;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f116510h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f116512m = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f116517r = new boolean[12];

    static {
        new bw5.x7();
    }

    public bw5.m7 b() {
        return this.f116517r[11] ? this.f116516q : new bw5.m7();
    }

    public bw5.o7 c() {
        return this.f116517r[4] ? this.f116509g : new bw5.o7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.x7)) {
            return false;
        }
        bw5.x7 x7Var = (bw5.x7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f116506d), java.lang.Integer.valueOf(x7Var.f116506d)) && n51.f.a(this.f116507e, x7Var.f116507e) && n51.f.a(this.f116508f, x7Var.f116508f) && n51.f.a(this.f116509g, x7Var.f116509g) && n51.f.a(this.f116510h, x7Var.f116510h) && n51.f.a(this.f116511i, x7Var.f116511i) && n51.f.a(this.f116512m, x7Var.f116512m) && n51.f.a(this.f116513n, x7Var.f116513n) && n51.f.a(java.lang.Boolean.valueOf(this.f116514o), java.lang.Boolean.valueOf(x7Var.f116514o)) && n51.f.a(this.f116515p, x7Var.f116515p) && n51.f.a(this.f116516q, x7Var.f116516q);
    }

    public bw5.q7 d() {
        return this.f116517r[3] ? this.f116508f : new bw5.q7();
    }

    public bw5.s7 e() {
        return this.f116517r[10] ? this.f116515p : new bw5.s7();
    }

    public bw5.u7 f() {
        return this.f116517r[2] ? this.f116507e : new bw5.u7();
    }

    public bw5.v7 g() {
        return this.f116517r[6] ? this.f116511i : new bw5.v7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public bw5.x7 mo11468x92b714fd(byte[] bArr) {
        return (bw5.x7) super.mo11468x92b714fd(bArr);
    }

    public bw5.x7 j(java.util.LinkedList linkedList) {
        this.f116510h = linkedList;
        this.f116517r[5] = true;
        return this;
    }

    public bw5.x7 k(bw5.u7 u7Var) {
        this.f116507e = u7Var;
        this.f116517r[2] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.x7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116517r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f116506d);
            }
            bw5.u7 u7Var = this.f116507e;
            if (u7Var != null && zArr[2]) {
                fVar.i(2, u7Var.mo75928xcd1e8d8());
                this.f116507e.mo75956x3d5d1f78(fVar);
            }
            bw5.q7 q7Var = this.f116508f;
            if (q7Var != null && zArr[3]) {
                fVar.i(3, q7Var.mo75928xcd1e8d8());
                this.f116508f.mo75956x3d5d1f78(fVar);
            }
            bw5.o7 o7Var = this.f116509g;
            if (o7Var != null && zArr[4]) {
                fVar.i(4, o7Var.mo75928xcd1e8d8());
                this.f116509g.mo75956x3d5d1f78(fVar);
            }
            fVar.g(5, 1, this.f116510h);
            bw5.v7 v7Var = this.f116511i;
            if (v7Var != null && zArr[6]) {
                fVar.i(6, v7Var.mo75928xcd1e8d8());
                this.f116511i.mo75956x3d5d1f78(fVar);
            }
            fVar.g(7, 8, this.f116512m);
            java.lang.String str = this.f116513n;
            if (str != null && zArr[8]) {
                fVar.j(8, str);
            }
            if (zArr[9]) {
                fVar.a(9, this.f116514o);
            }
            bw5.s7 s7Var = this.f116515p;
            if (s7Var != null && zArr[10]) {
                fVar.i(10, s7Var.mo75928xcd1e8d8());
                this.f116515p.mo75956x3d5d1f78(fVar);
            }
            bw5.m7 m7Var = this.f116516q;
            if (m7Var != null && zArr[11]) {
                fVar.i(11, m7Var.mo75928xcd1e8d8());
                this.f116516q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f116506d) : 0;
            bw5.u7 u7Var2 = this.f116507e;
            if (u7Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, u7Var2.mo75928xcd1e8d8());
            }
            bw5.q7 q7Var2 = this.f116508f;
            if (q7Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, q7Var2.mo75928xcd1e8d8());
            }
            bw5.o7 o7Var2 = this.f116509g;
            if (o7Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, o7Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(5, 1, this.f116510h);
            bw5.v7 v7Var2 = this.f116511i;
            if (v7Var2 != null && zArr[6]) {
                g17 += b36.f.i(6, v7Var2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(7, 8, this.f116512m);
            java.lang.String str2 = this.f116513n;
            if (str2 != null && zArr[8]) {
                g18 += b36.f.j(8, str2);
            }
            if (zArr[9]) {
                g18 += b36.f.a(9, this.f116514o);
            }
            bw5.s7 s7Var2 = this.f116515p;
            if (s7Var2 != null && zArr[10]) {
                g18 += b36.f.i(10, s7Var2.mo75928xcd1e8d8());
            }
            bw5.m7 m7Var2 = this.f116516q;
            return (m7Var2 == null || !zArr[11]) ? g18 : g18 + b36.f.i(11, m7Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f116510h.clear();
            this.f116512m.clear();
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
                this.f116506d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.u7 u7Var3 = new bw5.u7();
                    if (bArr != null && bArr.length > 0) {
                        u7Var3.mo11468x92b714fd(bArr);
                    }
                    this.f116507e = u7Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.q7 q7Var3 = new bw5.q7();
                    if (bArr2 != null && bArr2.length > 0) {
                        q7Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f116508f = q7Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.o7 o7Var3 = new bw5.o7();
                    if (bArr3 != null && bArr3.length > 0) {
                        o7Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f116509g = o7Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f116510h.add(aVar2.k(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.v7 v7Var3 = new bw5.v7();
                    if (bArr4 != null && bArr4.length > 0) {
                        v7Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f116511i = v7Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.w7 w7Var = new bw5.w7();
                    if (bArr5 != null && bArr5.length > 0) {
                        w7Var.mo11468x92b714fd(bArr5);
                    }
                    this.f116512m.add(w7Var);
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f116513n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f116514o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.s7 s7Var3 = new bw5.s7();
                    if (bArr6 != null && bArr6.length > 0) {
                        s7Var3.mo11468x92b714fd(bArr6);
                    }
                    this.f116515p = s7Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.m7 m7Var3 = new bw5.m7();
                    if (bArr7 != null && bArr7.length > 0) {
                        m7Var3.mo11468x92b714fd(bArr7);
                    }
                    this.f116516q = m7Var3;
                }
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
