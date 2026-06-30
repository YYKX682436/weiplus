package r45;

/* loaded from: classes12.dex */
public class vt4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.kx3 f470050d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rt4 f470051e;

    /* renamed from: f, reason: collision with root package name */
    public r45.jo f470052f;

    /* renamed from: g, reason: collision with root package name */
    public int f470053g;

    /* renamed from: h, reason: collision with root package name */
    public r45.mx3 f470054h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f470055i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vt4)) {
            return false;
        }
        r45.vt4 vt4Var = (r45.vt4) fVar;
        return n51.f.a(this.f470050d, vt4Var.f470050d) && n51.f.a(this.f470051e, vt4Var.f470051e) && n51.f.a(this.f470052f, vt4Var.f470052f) && n51.f.a(java.lang.Integer.valueOf(this.f470053g), java.lang.Integer.valueOf(vt4Var.f470053g)) && n51.f.a(this.f470054h, vt4Var.f470054h) && n51.f.a(this.f470055i, vt4Var.f470055i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.kx3 kx3Var = this.f470050d;
            if (kx3Var != null) {
                fVar.i(1, kx3Var.mo75928xcd1e8d8());
                this.f470050d.mo75956x3d5d1f78(fVar);
            }
            r45.rt4 rt4Var = this.f470051e;
            if (rt4Var != null) {
                fVar.i(2, rt4Var.mo75928xcd1e8d8());
                this.f470051e.mo75956x3d5d1f78(fVar);
            }
            r45.jo joVar = this.f470052f;
            if (joVar != null) {
                fVar.i(3, joVar.mo75928xcd1e8d8());
                this.f470052f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f470053g);
            r45.mx3 mx3Var = this.f470054h;
            if (mx3Var != null) {
                fVar.i(5, mx3Var.mo75928xcd1e8d8());
                this.f470054h.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var = this.f470055i;
            if (cu5Var != null) {
                fVar.i(6, cu5Var.mo75928xcd1e8d8());
                this.f470055i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.kx3 kx3Var2 = this.f470050d;
            int i18 = kx3Var2 != null ? 0 + b36.f.i(1, kx3Var2.mo75928xcd1e8d8()) : 0;
            r45.rt4 rt4Var2 = this.f470051e;
            if (rt4Var2 != null) {
                i18 += b36.f.i(2, rt4Var2.mo75928xcd1e8d8());
            }
            r45.jo joVar2 = this.f470052f;
            if (joVar2 != null) {
                i18 += b36.f.i(3, joVar2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f470053g);
            r45.mx3 mx3Var2 = this.f470054h;
            if (mx3Var2 != null) {
                e17 += b36.f.i(5, mx3Var2.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var2 = this.f470055i;
            return cu5Var2 != null ? e17 + b36.f.i(6, cu5Var2.mo75928xcd1e8d8()) : e17;
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
        r45.vt4 vt4Var = (r45.vt4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.kx3 kx3Var3 = new r45.kx3();
                    if (bArr != null && bArr.length > 0) {
                        kx3Var3.mo11468x92b714fd(bArr);
                    }
                    vt4Var.f470050d = kx3Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.rt4 rt4Var3 = new r45.rt4();
                    if (bArr2 != null && bArr2.length > 0) {
                        rt4Var3.mo11468x92b714fd(bArr2);
                    }
                    vt4Var.f470051e = rt4Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.jo joVar3 = new r45.jo();
                    if (bArr3 != null && bArr3.length > 0) {
                        joVar3.mo11468x92b714fd(bArr3);
                    }
                    vt4Var.f470052f = joVar3;
                }
                return 0;
            case 4:
                vt4Var.f470053g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.mx3 mx3Var3 = new r45.mx3();
                    if (bArr4 != null && bArr4.length > 0) {
                        mx3Var3.mo11468x92b714fd(bArr4);
                    }
                    vt4Var.f470054h = mx3Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var3.b(bArr5);
                    }
                    vt4Var.f470055i = cu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
