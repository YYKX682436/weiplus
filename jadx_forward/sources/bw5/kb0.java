package bw5;

/* loaded from: classes2.dex */
public class kb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f110862d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110863e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f110864f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f110865g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f110866h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.mc0 f110867i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.mc0 f110868m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f110869n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.v70 f110870o;

    /* renamed from: p, reason: collision with root package name */
    public int f110871p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f110872q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f110873r = new boolean[12];

    static {
        new bw5.kb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kb0)) {
            return false;
        }
        bw5.kb0 kb0Var = (bw5.kb0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f110862d), java.lang.Integer.valueOf(kb0Var.f110862d)) && n51.f.a(this.f110863e, kb0Var.f110863e) && n51.f.a(this.f110864f, kb0Var.f110864f) && n51.f.a(this.f110865g, kb0Var.f110865g) && n51.f.a(this.f110866h, kb0Var.f110866h) && n51.f.a(this.f110867i, kb0Var.f110867i) && n51.f.a(this.f110868m, kb0Var.f110868m) && n51.f.a(this.f110869n, kb0Var.f110869n) && n51.f.a(this.f110870o, kb0Var.f110870o) && n51.f.a(java.lang.Integer.valueOf(this.f110871p), java.lang.Integer.valueOf(kb0Var.f110871p)) && n51.f.a(java.lang.Boolean.valueOf(this.f110872q), java.lang.Boolean.valueOf(kb0Var.f110872q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.kb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110873r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f110862d);
            }
            java.lang.String str = this.f110863e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f110864f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f110865g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f110866h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            bw5.mc0 mc0Var = this.f110867i;
            if (mc0Var != null && zArr[6]) {
                fVar.i(6, mc0Var.mo75928xcd1e8d8());
                this.f110867i.mo75956x3d5d1f78(fVar);
            }
            bw5.mc0 mc0Var2 = this.f110868m;
            if (mc0Var2 != null && zArr[7]) {
                fVar.i(7, mc0Var2.mo75928xcd1e8d8());
                this.f110868m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f110869n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            bw5.v70 v70Var = this.f110870o;
            if (v70Var != null && zArr[9]) {
                fVar.i(9, v70Var.mo75928xcd1e8d8());
                this.f110870o.mo75956x3d5d1f78(fVar);
            }
            if (zArr[10]) {
                fVar.e(10, this.f110871p);
            }
            if (zArr[11]) {
                fVar.a(11, this.f110872q);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f110862d) : 0;
            java.lang.String str6 = this.f110863e;
            if (str6 != null && zArr[2]) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f110864f;
            if (str7 != null && zArr[3]) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f110865g;
            if (str8 != null && zArr[4]) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f110866h;
            if (str9 != null && zArr[5]) {
                e17 += b36.f.j(5, str9);
            }
            bw5.mc0 mc0Var3 = this.f110867i;
            if (mc0Var3 != null && zArr[6]) {
                e17 += b36.f.i(6, mc0Var3.mo75928xcd1e8d8());
            }
            bw5.mc0 mc0Var4 = this.f110868m;
            if (mc0Var4 != null && zArr[7]) {
                e17 += b36.f.i(7, mc0Var4.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f110869n;
            if (str10 != null && zArr[8]) {
                e17 += b36.f.j(8, str10);
            }
            bw5.v70 v70Var2 = this.f110870o;
            if (v70Var2 != null && zArr[9]) {
                e17 += b36.f.i(9, v70Var2.mo75928xcd1e8d8());
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f110871p);
            }
            return zArr[11] ? e17 + b36.f.a(11, this.f110872q) : e17;
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
                this.f110862d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f110863e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110864f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110865g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110866h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.mc0 mc0Var5 = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var5.mo11468x92b714fd(bArr);
                    }
                    this.f110867i = mc0Var5;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.mc0 mc0Var6 = new bw5.mc0();
                    if (bArr2 != null && bArr2.length > 0) {
                        mc0Var6.mo11468x92b714fd(bArr2);
                    }
                    this.f110868m = mc0Var6;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f110869n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.v70 v70Var3 = new bw5.v70();
                    if (bArr3 != null && bArr3.length > 0) {
                        v70Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f110870o = v70Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f110871p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f110872q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.kb0) super.mo11468x92b714fd(bArr);
    }
}
