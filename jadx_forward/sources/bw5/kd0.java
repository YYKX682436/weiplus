package bw5;

/* loaded from: classes2.dex */
public class kd0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f110885d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f110886e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.qg f110887f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.zc0 f110888g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f110889h = new boolean[5];

    static {
        new bw5.kd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kd0)) {
            return false;
        }
        bw5.kd0 kd0Var = (bw5.kd0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f110885d), java.lang.Integer.valueOf(kd0Var.f110885d)) && n51.f.a(this.f110886e, kd0Var.f110886e) && n51.f.a(this.f110887f, kd0Var.f110887f) && n51.f.a(this.f110888g, kd0Var.f110888g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.kd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110889h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f110885d);
            }
            java.lang.String str = this.f110886e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.qg qgVar = this.f110887f;
            if (qgVar != null && zArr[3]) {
                fVar.i(3, qgVar.mo75928xcd1e8d8());
                this.f110887f.mo75956x3d5d1f78(fVar);
            }
            bw5.zc0 zc0Var = this.f110888g;
            if (zc0Var != null && zArr[4]) {
                fVar.i(4, zc0Var.mo75928xcd1e8d8());
                this.f110888g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f110885d) : 0;
            java.lang.String str2 = this.f110886e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            bw5.qg qgVar2 = this.f110887f;
            if (qgVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, qgVar2.mo75928xcd1e8d8());
            }
            bw5.zc0 zc0Var2 = this.f110888g;
            return (zc0Var2 == null || !zArr[4]) ? e17 : e17 + b36.f.i(4, zc0Var2.mo75928xcd1e8d8());
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
            this.f110885d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f110886e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.qg qgVar3 = new bw5.qg();
                if (bArr != null && bArr.length > 0) {
                    qgVar3.mo11468x92b714fd(bArr);
                }
                this.f110887f = qgVar3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.zc0 zc0Var3 = new bw5.zc0();
            if (bArr2 != null && bArr2.length > 0) {
                zc0Var3.mo11468x92b714fd(bArr2);
            }
            this.f110888g = zc0Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.kd0) super.mo11468x92b714fd(bArr);
    }
}
