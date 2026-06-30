package bw5;

/* loaded from: classes9.dex */
public class p9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113035d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.d9 f113036e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.c7 f113037f;

    /* renamed from: g, reason: collision with root package name */
    public int f113038g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f113039h = new boolean[5];

    static {
        new bw5.p9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.p9 mo11468x92b714fd(byte[] bArr) {
        return (bw5.p9) super.mo11468x92b714fd(bArr);
    }

    public bw5.p9 c(bw5.d9 d9Var) {
        this.f113036e = d9Var;
        this.f113039h[2] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p9)) {
            return false;
        }
        bw5.p9 p9Var = (bw5.p9) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113035d), java.lang.Integer.valueOf(p9Var.f113035d)) && n51.f.a(this.f113036e, p9Var.f113036e) && n51.f.a(this.f113037f, p9Var.f113037f) && n51.f.a(java.lang.Integer.valueOf(this.f113038g), java.lang.Integer.valueOf(p9Var.f113038g));
    }

    public bw5.p9 d(int i17) {
        this.f113035d = i17;
        this.f113039h[1] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.p9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113039h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113035d);
            }
            bw5.d9 d9Var = this.f113036e;
            if (d9Var != null && zArr[2]) {
                fVar.i(2, d9Var.mo75928xcd1e8d8());
                this.f113036e.mo75956x3d5d1f78(fVar);
            }
            bw5.c7 c7Var = this.f113037f;
            if (c7Var != null && zArr[3]) {
                fVar.i(3, c7Var.mo75928xcd1e8d8());
                this.f113037f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f113038g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f113035d) : 0;
            bw5.d9 d9Var2 = this.f113036e;
            if (d9Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, d9Var2.mo75928xcd1e8d8());
            }
            bw5.c7 c7Var2 = this.f113037f;
            if (c7Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, c7Var2.mo75928xcd1e8d8());
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f113038g) : e17;
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
            this.f113035d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.d9 d9Var3 = new bw5.d9();
                if (bArr != null && bArr.length > 0) {
                    d9Var3.mo11468x92b714fd(bArr);
                }
                this.f113036e = d9Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f113038g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.c7 c7Var3 = new bw5.c7();
            if (bArr2 != null && bArr2.length > 0) {
                c7Var3.mo11468x92b714fd(bArr2);
            }
            this.f113037f = c7Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
