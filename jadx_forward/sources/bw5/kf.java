package bw5;

/* loaded from: classes9.dex */
public class kf extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f110895d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.c7 f110896e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.x7 f110897f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.w9 f110898g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f110899h = new boolean[5];

    static {
        new bw5.kf();
    }

    public bw5.x7 b() {
        return this.f110899h[3] ? this.f110897f : new bw5.x7();
    }

    public bw5.c7 c() {
        return this.f110899h[2] ? this.f110896e : new bw5.c7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kf)) {
            return false;
        }
        bw5.kf kfVar = (bw5.kf) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f110895d), java.lang.Integer.valueOf(kfVar.f110895d)) && n51.f.a(this.f110896e, kfVar.f110896e) && n51.f.a(this.f110897f, kfVar.f110897f) && n51.f.a(this.f110898g, kfVar.f110898g);
    }

    public bw5.w9 d() {
        return this.f110899h[4] ? this.f110898g : new bw5.w9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public bw5.kf mo11468x92b714fd(byte[] bArr) {
        return (bw5.kf) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.kf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110899h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f110895d);
            }
            bw5.c7 c7Var = this.f110896e;
            if (c7Var != null && zArr[2]) {
                fVar.i(2, c7Var.mo75928xcd1e8d8());
                this.f110896e.mo75956x3d5d1f78(fVar);
            }
            bw5.x7 x7Var = this.f110897f;
            if (x7Var != null && zArr[3]) {
                fVar.i(3, x7Var.mo75928xcd1e8d8());
                this.f110897f.mo75956x3d5d1f78(fVar);
            }
            bw5.w9 w9Var = this.f110898g;
            if (w9Var != null && zArr[4]) {
                fVar.i(4, w9Var.mo75928xcd1e8d8());
                this.f110898g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f110895d) : 0;
            bw5.c7 c7Var2 = this.f110896e;
            if (c7Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, c7Var2.mo75928xcd1e8d8());
            }
            bw5.x7 x7Var2 = this.f110897f;
            if (x7Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, x7Var2.mo75928xcd1e8d8());
            }
            bw5.w9 w9Var2 = this.f110898g;
            return (w9Var2 == null || !zArr[4]) ? e17 : e17 + b36.f.i(4, w9Var2.mo75928xcd1e8d8());
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
            this.f110895d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.c7 c7Var3 = new bw5.c7();
                if (bArr != null && bArr.length > 0) {
                    c7Var3.mo11468x92b714fd(bArr);
                }
                this.f110896e = c7Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.x7 x7Var3 = new bw5.x7();
                if (bArr2 != null && bArr2.length > 0) {
                    x7Var3.mo11468x92b714fd(bArr2);
                }
                this.f110897f = x7Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            bw5.w9 w9Var3 = new bw5.w9();
            if (bArr3 != null && bArr3.length > 0) {
                w9Var3.mo11468x92b714fd(bArr3);
            }
            this.f110898g = w9Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
