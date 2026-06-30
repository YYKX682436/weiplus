package bw5;

/* loaded from: classes2.dex */
public class vo0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f115970d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.lp0 f115971e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.kq0 f115972f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115973g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f115974h = new boolean[5];

    static {
        new bw5.vo0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vo0)) {
            return false;
        }
        bw5.vo0 vo0Var = (bw5.vo0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f115970d), java.lang.Integer.valueOf(vo0Var.f115970d)) && n51.f.a(this.f115971e, vo0Var.f115971e) && n51.f.a(this.f115972f, vo0Var.f115972f) && n51.f.a(this.f115973g, vo0Var.f115973g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.vo0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115974h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f115970d);
            }
            bw5.lp0 lp0Var = this.f115971e;
            if (lp0Var != null && zArr[2]) {
                fVar.i(2, lp0Var.mo75928xcd1e8d8());
                this.f115971e.mo75956x3d5d1f78(fVar);
            }
            bw5.kq0 kq0Var = this.f115972f;
            if (kq0Var != null && zArr[3]) {
                fVar.i(3, kq0Var.mo75928xcd1e8d8());
                this.f115972f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f115973g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f115970d) : 0;
            bw5.lp0 lp0Var2 = this.f115971e;
            if (lp0Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, lp0Var2.mo75928xcd1e8d8());
            }
            bw5.kq0 kq0Var2 = this.f115972f;
            if (kq0Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, kq0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f115973g;
            return (str2 == null || !zArr[4]) ? e17 : e17 + b36.f.j(4, str2);
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
            this.f115970d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.lp0 lp0Var3 = new bw5.lp0();
                if (bArr != null && bArr.length > 0) {
                    lp0Var3.mo11468x92b714fd(bArr);
                }
                this.f115971e = lp0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f115973g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.kq0 kq0Var3 = new bw5.kq0();
            if (bArr2 != null && bArr2.length > 0) {
                kq0Var3.mo11468x92b714fd(bArr2);
            }
            this.f115972f = kq0Var3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.vo0) super.mo11468x92b714fd(bArr);
    }
}
