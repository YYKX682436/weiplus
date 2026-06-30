package bw5;

/* loaded from: classes2.dex */
public class l40 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f111166d;

    /* renamed from: e, reason: collision with root package name */
    public int f111167e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.u40 f111168f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.y60 f111169g;

    /* renamed from: h, reason: collision with root package name */
    public int f111170h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f111171i = new boolean[6];

    static {
        new bw5.l40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.l40 mo11468x92b714fd(byte[] bArr) {
        return (bw5.l40) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l40)) {
            return false;
        }
        bw5.l40 l40Var = (bw5.l40) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f111166d), java.lang.Integer.valueOf(l40Var.f111166d)) && n51.f.a(java.lang.Integer.valueOf(this.f111167e), java.lang.Integer.valueOf(l40Var.f111167e)) && n51.f.a(this.f111168f, l40Var.f111168f) && n51.f.a(this.f111169g, l40Var.f111169g) && n51.f.a(java.lang.Integer.valueOf(this.f111170h), java.lang.Integer.valueOf(l40Var.f111170h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.l40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111171i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f111166d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111167e);
            }
            bw5.u40 u40Var = this.f111168f;
            if (u40Var != null && zArr[3]) {
                fVar.i(3, u40Var.mo75928xcd1e8d8());
                this.f111168f.mo75956x3d5d1f78(fVar);
            }
            bw5.y60 y60Var = this.f111169g;
            if (y60Var != null && zArr[4]) {
                fVar.i(4, y60Var.mo75928xcd1e8d8());
                this.f111169g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f111170h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f111166d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f111167e);
            }
            bw5.u40 u40Var2 = this.f111168f;
            if (u40Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, u40Var2.mo75928xcd1e8d8());
            }
            bw5.y60 y60Var2 = this.f111169g;
            if (y60Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, y60Var2.mo75928xcd1e8d8());
            }
            return zArr[5] ? e17 + b36.f.e(5, this.f111170h) : e17;
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
            this.f111166d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f111167e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.u40 u40Var3 = new bw5.u40();
                if (bArr != null && bArr.length > 0) {
                    u40Var3.mo11468x92b714fd(bArr);
                }
                this.f111168f = u40Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f111170h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.y60 y60Var3 = new bw5.y60();
            if (bArr2 != null && bArr2.length > 0) {
                y60Var3.mo11468x92b714fd(bArr2);
            }
            this.f111169g = y60Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
