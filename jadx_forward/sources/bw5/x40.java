package bw5;

/* loaded from: classes2.dex */
public class x40 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116487d;

    /* renamed from: e, reason: collision with root package name */
    public int f116488e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.v70 f116489f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.n40 f116490g;

    /* renamed from: h, reason: collision with root package name */
    public long f116491h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f116492i = new boolean[6];

    static {
        new bw5.x40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.x40 mo11468x92b714fd(byte[] bArr) {
        return (bw5.x40) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.x40)) {
            return false;
        }
        bw5.x40 x40Var = (bw5.x40) fVar;
        return n51.f.a(this.f116487d, x40Var.f116487d) && n51.f.a(java.lang.Integer.valueOf(this.f116488e), java.lang.Integer.valueOf(x40Var.f116488e)) && n51.f.a(this.f116489f, x40Var.f116489f) && n51.f.a(this.f116490g, x40Var.f116490g) && n51.f.a(java.lang.Long.valueOf(this.f116491h), java.lang.Long.valueOf(x40Var.f116491h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.x40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f116492i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116487d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f116488e);
            }
            bw5.v70 v70Var = this.f116489f;
            if (v70Var != null && zArr[3]) {
                fVar.i(3, v70Var.mo75928xcd1e8d8());
                this.f116489f.mo75956x3d5d1f78(fVar);
            }
            bw5.n40 n40Var = this.f116490g;
            if (n40Var != null && zArr[4]) {
                fVar.i(4, n40Var.mo75928xcd1e8d8());
                this.f116490g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.h(5, this.f116491h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f116487d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f116488e);
            }
            bw5.v70 v70Var2 = this.f116489f;
            if (v70Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, v70Var2.mo75928xcd1e8d8());
            }
            bw5.n40 n40Var2 = this.f116490g;
            if (n40Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, n40Var2.mo75928xcd1e8d8());
            }
            return zArr[5] ? i18 + b36.f.h(5, this.f116491h) : i18;
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
            this.f116487d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116488e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.v70 v70Var3 = new bw5.v70();
                if (bArr != null && bArr.length > 0) {
                    v70Var3.mo11468x92b714fd(bArr);
                }
                this.f116489f = v70Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f116491h = aVar2.i(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.n40 n40Var3 = new bw5.n40();
            if (bArr2 != null && bArr2.length > 0) {
                n40Var3.mo11468x92b714fd(bArr2);
            }
            this.f116490g = n40Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
