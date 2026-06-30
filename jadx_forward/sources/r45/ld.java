package r45;

/* loaded from: classes4.dex */
public class ld extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460849d;

    /* renamed from: e, reason: collision with root package name */
    public r45.zx4 f460850e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zx4 f460851f;

    /* renamed from: g, reason: collision with root package name */
    public r45.zx4 f460852g;

    /* renamed from: h, reason: collision with root package name */
    public r45.zx4 f460853h;

    /* renamed from: i, reason: collision with root package name */
    public int f460854i;

    /* renamed from: m, reason: collision with root package name */
    public int f460855m;

    /* renamed from: n, reason: collision with root package name */
    public int f460856n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ld)) {
            return false;
        }
        r45.ld ldVar = (r45.ld) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460849d), java.lang.Integer.valueOf(ldVar.f460849d)) && n51.f.a(this.f460850e, ldVar.f460850e) && n51.f.a(this.f460851f, ldVar.f460851f) && n51.f.a(this.f460852g, ldVar.f460852g) && n51.f.a(this.f460853h, ldVar.f460853h) && n51.f.a(java.lang.Integer.valueOf(this.f460854i), java.lang.Integer.valueOf(ldVar.f460854i)) && n51.f.a(java.lang.Integer.valueOf(this.f460855m), java.lang.Integer.valueOf(ldVar.f460855m)) && n51.f.a(java.lang.Integer.valueOf(this.f460856n), java.lang.Integer.valueOf(ldVar.f460856n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460849d);
            r45.zx4 zx4Var = this.f460850e;
            if (zx4Var != null) {
                fVar.i(2, zx4Var.mo75928xcd1e8d8());
                this.f460850e.mo75956x3d5d1f78(fVar);
            }
            r45.zx4 zx4Var2 = this.f460851f;
            if (zx4Var2 != null) {
                fVar.i(3, zx4Var2.mo75928xcd1e8d8());
                this.f460851f.mo75956x3d5d1f78(fVar);
            }
            r45.zx4 zx4Var3 = this.f460852g;
            if (zx4Var3 != null) {
                fVar.i(4, zx4Var3.mo75928xcd1e8d8());
                this.f460852g.mo75956x3d5d1f78(fVar);
            }
            r45.zx4 zx4Var4 = this.f460853h;
            if (zx4Var4 != null) {
                fVar.i(11, zx4Var4.mo75928xcd1e8d8());
                this.f460853h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(100, this.f460854i);
            fVar.e(101, this.f460855m);
            fVar.e(102, this.f460856n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f460849d) + 0;
            r45.zx4 zx4Var5 = this.f460850e;
            if (zx4Var5 != null) {
                e17 += b36.f.i(2, zx4Var5.mo75928xcd1e8d8());
            }
            r45.zx4 zx4Var6 = this.f460851f;
            if (zx4Var6 != null) {
                e17 += b36.f.i(3, zx4Var6.mo75928xcd1e8d8());
            }
            r45.zx4 zx4Var7 = this.f460852g;
            if (zx4Var7 != null) {
                e17 += b36.f.i(4, zx4Var7.mo75928xcd1e8d8());
            }
            r45.zx4 zx4Var8 = this.f460853h;
            if (zx4Var8 != null) {
                e17 += b36.f.i(11, zx4Var8.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(100, this.f460854i) + b36.f.e(101, this.f460855m) + b36.f.e(102, this.f460856n);
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
        r45.ld ldVar = (r45.ld) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ldVar.f460849d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.zx4 zx4Var9 = new r45.zx4();
                if (bArr != null && bArr.length > 0) {
                    zx4Var9.mo11468x92b714fd(bArr);
                }
                ldVar.f460850e = zx4Var9;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                r45.zx4 zx4Var10 = new r45.zx4();
                if (bArr2 != null && bArr2.length > 0) {
                    zx4Var10.mo11468x92b714fd(bArr2);
                }
                ldVar.f460851f = zx4Var10;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                r45.zx4 zx4Var11 = new r45.zx4();
                if (bArr3 != null && bArr3.length > 0) {
                    zx4Var11.mo11468x92b714fd(bArr3);
                }
                ldVar.f460852g = zx4Var11;
            }
            return 0;
        }
        if (intValue != 11) {
            switch (intValue) {
                case 100:
                    ldVar.f460854i = aVar2.g(intValue);
                    return 0;
                case 101:
                    ldVar.f460855m = aVar2.g(intValue);
                    return 0;
                case 102:
                    ldVar.f460856n = aVar2.g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr4 = (byte[]) j27.get(i28);
            r45.zx4 zx4Var12 = new r45.zx4();
            if (bArr4 != null && bArr4.length > 0) {
                zx4Var12.mo11468x92b714fd(bArr4);
            }
            ldVar.f460853h = zx4Var12;
        }
        return 0;
    }
}
