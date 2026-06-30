package bw5;

/* loaded from: classes2.dex */
public class u00 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f115217d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115218e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115219f;

    /* renamed from: g, reason: collision with root package name */
    public int f115220g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.q00 f115221h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.e10 f115222i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f115223m = new boolean[8];

    static {
        new bw5.u00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.u00 mo11468x92b714fd(byte[] bArr) {
        return (bw5.u00) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u00)) {
            return false;
        }
        bw5.u00 u00Var = (bw5.u00) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f115217d), java.lang.Boolean.valueOf(u00Var.f115217d)) && n51.f.a(this.f115218e, u00Var.f115218e) && n51.f.a(this.f115219f, u00Var.f115219f) && n51.f.a(java.lang.Integer.valueOf(this.f115220g), java.lang.Integer.valueOf(u00Var.f115220g)) && n51.f.a(this.f115221h, u00Var.f115221h) && n51.f.a(this.f115222i, u00Var.f115222i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.u00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115223m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f115217d);
            }
            java.lang.String str = this.f115218e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f115219f;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f115220g);
            }
            bw5.q00 q00Var = this.f115221h;
            if (q00Var != null && zArr[6]) {
                fVar.i(6, q00Var.mo75928xcd1e8d8());
                this.f115221h.mo75956x3d5d1f78(fVar);
            }
            bw5.e10 e10Var = this.f115222i;
            if (e10Var != null && zArr[7]) {
                fVar.i(7, e10Var.mo75928xcd1e8d8());
                this.f115222i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f115217d) : 0;
            java.lang.String str3 = this.f115218e;
            if (str3 != null && zArr[3]) {
                a17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f115219f;
            if (str4 != null && zArr[4]) {
                a17 += b36.f.j(4, str4);
            }
            if (zArr[5]) {
                a17 += b36.f.e(5, this.f115220g);
            }
            bw5.q00 q00Var2 = this.f115221h;
            if (q00Var2 != null && zArr[6]) {
                a17 += b36.f.i(6, q00Var2.mo75928xcd1e8d8());
            }
            bw5.e10 e10Var2 = this.f115222i;
            return (e10Var2 == null || !zArr[7]) ? a17 : a17 + b36.f.i(7, e10Var2.mo75928xcd1e8d8());
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
            this.f115217d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f115218e = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f115219f = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue == 5) {
            this.f115220g = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        if (intValue == 6) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.q00 q00Var3 = new bw5.q00();
                if (bArr != null && bArr.length > 0) {
                    q00Var3.mo11468x92b714fd(bArr);
                }
                this.f115221h = q00Var3;
            }
            zArr[6] = true;
            return 0;
        }
        if (intValue != 7) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.e10 e10Var3 = new bw5.e10();
            if (bArr2 != null && bArr2.length > 0) {
                e10Var3.mo11468x92b714fd(bArr2);
            }
            this.f115222i = e10Var3;
        }
        zArr[7] = true;
        return 0;
    }
}
