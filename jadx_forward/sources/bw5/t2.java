package bw5;

/* loaded from: classes8.dex */
public class t2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f114750d;

    /* renamed from: e, reason: collision with root package name */
    public int f114751e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.g f114752f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.v70 f114753g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.k f114754h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f114755i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f114756m = new boolean[7];

    static {
        new bw5.t2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t2)) {
            return false;
        }
        bw5.t2 t2Var = (bw5.t2) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f114750d), java.lang.Boolean.valueOf(t2Var.f114750d)) && n51.f.a(java.lang.Integer.valueOf(this.f114751e), java.lang.Integer.valueOf(t2Var.f114751e)) && n51.f.a(this.f114752f, t2Var.f114752f) && n51.f.a(this.f114753g, t2Var.f114753g) && n51.f.a(this.f114754h, t2Var.f114754h) && n51.f.a(this.f114755i, t2Var.f114755i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.t2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114756m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f114750d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f114751e);
            }
            bw5.g gVar = this.f114752f;
            if (gVar != null && zArr[3]) {
                fVar.i(3, gVar.mo75928xcd1e8d8());
                this.f114752f.mo75956x3d5d1f78(fVar);
            }
            bw5.v70 v70Var = this.f114753g;
            if (v70Var != null && zArr[4]) {
                fVar.i(4, v70Var.mo75928xcd1e8d8());
                this.f114753g.mo75956x3d5d1f78(fVar);
            }
            bw5.k kVar = this.f114754h;
            if (kVar != null && zArr[5]) {
                fVar.e(5, kVar.f110720d);
            }
            java.lang.String str = this.f114755i;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f114750d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f114751e);
            }
            bw5.g gVar2 = this.f114752f;
            if (gVar2 != null && zArr[3]) {
                a17 += b36.f.i(3, gVar2.mo75928xcd1e8d8());
            }
            bw5.v70 v70Var2 = this.f114753g;
            if (v70Var2 != null && zArr[4]) {
                a17 += b36.f.i(4, v70Var2.mo75928xcd1e8d8());
            }
            bw5.k kVar2 = this.f114754h;
            if (kVar2 != null && zArr[5]) {
                a17 += b36.f.e(5, kVar2.f110720d);
            }
            java.lang.String str2 = this.f114755i;
            return (str2 == null || !zArr[6]) ? a17 : a17 + b36.f.j(6, str2);
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
                this.f114750d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114751e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.g gVar3 = new bw5.g();
                    if (bArr != null && bArr.length > 0) {
                        gVar3.mo11468x92b714fd(bArr);
                    }
                    this.f114752f = gVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.v70 v70Var3 = new bw5.v70();
                    if (bArr2 != null && bArr2.length > 0) {
                        v70Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f114753g = v70Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f114754h = bw5.k.a(aVar2.g(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f114755i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.t2) super.mo11468x92b714fd(bArr);
    }
}
