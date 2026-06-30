package r45;

/* loaded from: classes9.dex */
public class xx5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f472113d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ig0 f472114e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f472115f;

    /* renamed from: g, reason: collision with root package name */
    public int f472116g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f472117h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f472118i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xx5)) {
            return false;
        }
        r45.xx5 xx5Var = (r45.xx5) fVar;
        return n51.f.a(this.f472113d, xx5Var.f472113d) && n51.f.a(this.f472114e, xx5Var.f472114e) && n51.f.a(this.f472115f, xx5Var.f472115f) && n51.f.a(java.lang.Integer.valueOf(this.f472116g), java.lang.Integer.valueOf(xx5Var.f472116g)) && n51.f.a(this.f472117h, xx5Var.f472117h) && n51.f.a(this.f472118i, xx5Var.f472118i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cu5 cu5Var = this.f472113d;
            if (cu5Var != null) {
                fVar.i(1, cu5Var.mo75928xcd1e8d8());
                this.f472113d.mo75956x3d5d1f78(fVar);
            }
            r45.ig0 ig0Var = this.f472114e;
            if (ig0Var != null) {
                fVar.i(2, ig0Var.mo75928xcd1e8d8());
                this.f472114e.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var2 = this.f472115f;
            if (cu5Var2 != null) {
                fVar.i(3, cu5Var2.mo75928xcd1e8d8());
                this.f472115f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f472116g);
            r45.cu5 cu5Var3 = this.f472117h;
            if (cu5Var3 != null) {
                fVar.i(5, cu5Var3.mo75928xcd1e8d8());
                this.f472117h.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var4 = this.f472118i;
            if (cu5Var4 != null) {
                fVar.i(6, cu5Var4.mo75928xcd1e8d8());
                this.f472118i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.cu5 cu5Var5 = this.f472113d;
            int i18 = cu5Var5 != null ? 0 + b36.f.i(1, cu5Var5.mo75928xcd1e8d8()) : 0;
            r45.ig0 ig0Var2 = this.f472114e;
            if (ig0Var2 != null) {
                i18 += b36.f.i(2, ig0Var2.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var6 = this.f472115f;
            if (cu5Var6 != null) {
                i18 += b36.f.i(3, cu5Var6.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f472116g);
            r45.cu5 cu5Var7 = this.f472117h;
            if (cu5Var7 != null) {
                e17 += b36.f.i(5, cu5Var7.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var8 = this.f472118i;
            return cu5Var8 != null ? e17 + b36.f.i(6, cu5Var8.mo75928xcd1e8d8()) : e17;
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
        r45.xx5 xx5Var = (r45.xx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var9.b(bArr);
                    }
                    xx5Var.f472113d = cu5Var9;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ig0 ig0Var3 = new r45.ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig0Var3.mo11468x92b714fd(bArr2);
                    }
                    xx5Var.f472114e = ig0Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var10 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var10.b(bArr3);
                    }
                    xx5Var.f472115f = cu5Var10;
                }
                return 0;
            case 4:
                xx5Var.f472116g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var11.b(bArr4);
                    }
                    xx5Var.f472117h = cu5Var11;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var12.b(bArr5);
                    }
                    xx5Var.f472118i = cu5Var12;
                }
                return 0;
            default:
                return -1;
        }
    }
}
