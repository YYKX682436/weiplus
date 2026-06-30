package bw5;

/* loaded from: classes9.dex */
public class o7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112534d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f112535e;

    /* renamed from: f, reason: collision with root package name */
    public int f112536f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f112537g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.n7 f112538h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f112539i = new boolean[6];

    static {
        new bw5.o7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o7 mo11468x92b714fd(byte[] bArr) {
        return (bw5.o7) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o7)) {
            return false;
        }
        bw5.o7 o7Var = (bw5.o7) fVar;
        return n51.f.a(this.f112534d, o7Var.f112534d) && n51.f.a(java.lang.Boolean.valueOf(this.f112535e), java.lang.Boolean.valueOf(o7Var.f112535e)) && n51.f.a(java.lang.Integer.valueOf(this.f112536f), java.lang.Integer.valueOf(o7Var.f112536f)) && n51.f.a(java.lang.Boolean.valueOf(this.f112537g), java.lang.Boolean.valueOf(o7Var.f112537g)) && n51.f.a(this.f112538h, o7Var.f112538h);
    }

    /* renamed from: getUrl */
    public java.lang.String m12644xb5887639() {
        return this.f112539i[1] ? this.f112534d : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.o7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112539i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112534d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f112535e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f112536f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f112537g);
            }
            bw5.n7 n7Var = this.f112538h;
            if (n7Var != null && zArr[5]) {
                fVar.i(5, n7Var.mo75928xcd1e8d8());
                this.f112538h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f112534d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f112535e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f112536f);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f112537g);
            }
            bw5.n7 n7Var2 = this.f112538h;
            return (n7Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, n7Var2.mo75928xcd1e8d8());
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
            this.f112534d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f112535e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f112536f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f112537g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.n7 n7Var3 = new bw5.n7();
            if (bArr != null && bArr.length > 0) {
                n7Var3.mo11468x92b714fd(bArr);
            }
            this.f112538h = n7Var3;
        }
        zArr[5] = true;
        return 0;
    }
}
