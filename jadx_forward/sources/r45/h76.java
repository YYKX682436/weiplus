package r45;

/* loaded from: classes4.dex */
public class h76 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.f76 f457453d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f457454e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ca6 f457455f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f457456g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g5 f457457h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h76)) {
            return false;
        }
        r45.h76 h76Var = (r45.h76) fVar;
        return n51.f.a(this.f76492x92037252, h76Var.f76492x92037252) && n51.f.a(this.f457453d, h76Var.f457453d) && n51.f.a(this.f457454e, h76Var.f457454e) && n51.f.a(this.f457455f, h76Var.f457455f) && n51.f.a(this.f457456g, h76Var.f457456g) && n51.f.a(this.f457457h, h76Var.f457457h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.f76 f76Var = this.f457453d;
            if (f76Var != null) {
                fVar.i(2, f76Var.mo75928xcd1e8d8());
                this.f457453d.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var = this.f457454e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f457454e.mo75956x3d5d1f78(fVar);
            }
            r45.ca6 ca6Var = this.f457455f;
            if (ca6Var != null) {
                fVar.i(4, ca6Var.mo75928xcd1e8d8());
                this.f457455f.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var2 = this.f457456g;
            if (cu5Var2 != null) {
                fVar.i(5, cu5Var2.mo75928xcd1e8d8());
                this.f457456g.mo75956x3d5d1f78(fVar);
            }
            r45.g5 g5Var = this.f457457h;
            if (g5Var != null) {
                fVar.i(6, g5Var.mo75928xcd1e8d8());
                this.f457457h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.f76 f76Var2 = this.f457453d;
            if (f76Var2 != null) {
                i18 += b36.f.i(2, f76Var2.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var3 = this.f457454e;
            if (cu5Var3 != null) {
                i18 += b36.f.i(3, cu5Var3.mo75928xcd1e8d8());
            }
            r45.ca6 ca6Var2 = this.f457455f;
            if (ca6Var2 != null) {
                i18 += b36.f.i(4, ca6Var2.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var4 = this.f457456g;
            if (cu5Var4 != null) {
                i18 += b36.f.i(5, cu5Var4.mo75928xcd1e8d8());
            }
            r45.g5 g5Var2 = this.f457457h;
            return g5Var2 != null ? i18 + b36.f.i(6, g5Var2.mo75928xcd1e8d8()) : i18;
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
        r45.h76 h76Var = (r45.h76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    h76Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.f76 f76Var3 = new r45.f76();
                    if (bArr2 != null && bArr2.length > 0) {
                        f76Var3.mo11468x92b714fd(bArr2);
                    }
                    h76Var.f457453d = f76Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var5.b(bArr3);
                    }
                    h76Var.f457454e = cu5Var5;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.ca6 ca6Var3 = new r45.ca6();
                    if (bArr4 != null && bArr4.length > 0) {
                        ca6Var3.mo11468x92b714fd(bArr4);
                    }
                    h76Var.f457455f = ca6Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var6.b(bArr5);
                    }
                    h76Var.f457456g = cu5Var6;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.g5 g5Var3 = new r45.g5();
                    if (bArr6 != null && bArr6.length > 0) {
                        g5Var3.mo11468x92b714fd(bArr6);
                    }
                    h76Var.f457457h = g5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
