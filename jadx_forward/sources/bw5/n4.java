package bw5;

/* loaded from: classes2.dex */
public class n4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112010d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.am f112011e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.am f112012f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.am f112013g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.am f112014h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.am f112015i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.am f112016m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f112017n = new boolean[8];

    static {
        new bw5.n4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n4 mo11468x92b714fd(byte[] bArr) {
        return (bw5.n4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n4)) {
            return false;
        }
        bw5.n4 n4Var = (bw5.n4) fVar;
        return n51.f.a(this.f112010d, n4Var.f112010d) && n51.f.a(this.f112011e, n4Var.f112011e) && n51.f.a(this.f112012f, n4Var.f112012f) && n51.f.a(this.f112013g, n4Var.f112013g) && n51.f.a(this.f112014h, n4Var.f112014h) && n51.f.a(this.f112015i, n4Var.f112015i) && n51.f.a(this.f112016m, n4Var.f112016m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.n4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112017n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112010d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.am amVar = this.f112011e;
            if (amVar != null && zArr[2]) {
                fVar.i(2, amVar.mo75928xcd1e8d8());
                this.f112011e.mo75956x3d5d1f78(fVar);
            }
            bw5.am amVar2 = this.f112012f;
            if (amVar2 != null && zArr[3]) {
                fVar.i(3, amVar2.mo75928xcd1e8d8());
                this.f112012f.mo75956x3d5d1f78(fVar);
            }
            bw5.am amVar3 = this.f112013g;
            if (amVar3 != null && zArr[4]) {
                fVar.i(4, amVar3.mo75928xcd1e8d8());
                this.f112013g.mo75956x3d5d1f78(fVar);
            }
            bw5.am amVar4 = this.f112014h;
            if (amVar4 != null && zArr[5]) {
                fVar.i(5, amVar4.mo75928xcd1e8d8());
                this.f112014h.mo75956x3d5d1f78(fVar);
            }
            bw5.am amVar5 = this.f112015i;
            if (amVar5 != null && zArr[6]) {
                fVar.i(6, amVar5.mo75928xcd1e8d8());
                this.f112015i.mo75956x3d5d1f78(fVar);
            }
            bw5.am amVar6 = this.f112016m;
            if (amVar6 != null && zArr[7]) {
                fVar.i(7, amVar6.mo75928xcd1e8d8());
                this.f112016m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f112010d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.am amVar7 = this.f112011e;
            if (amVar7 != null && zArr[2]) {
                i18 += b36.f.i(2, amVar7.mo75928xcd1e8d8());
            }
            bw5.am amVar8 = this.f112012f;
            if (amVar8 != null && zArr[3]) {
                i18 += b36.f.i(3, amVar8.mo75928xcd1e8d8());
            }
            bw5.am amVar9 = this.f112013g;
            if (amVar9 != null && zArr[4]) {
                i18 += b36.f.i(4, amVar9.mo75928xcd1e8d8());
            }
            bw5.am amVar10 = this.f112014h;
            if (amVar10 != null && zArr[5]) {
                i18 += b36.f.i(5, amVar10.mo75928xcd1e8d8());
            }
            bw5.am amVar11 = this.f112015i;
            if (amVar11 != null && zArr[6]) {
                i18 += b36.f.i(6, amVar11.mo75928xcd1e8d8());
            }
            bw5.am amVar12 = this.f112016m;
            return (amVar12 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, amVar12.mo75928xcd1e8d8());
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
                this.f112010d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.am amVar13 = new bw5.am();
                    if (bArr != null && bArr.length > 0) {
                        amVar13.mo11468x92b714fd(bArr);
                    }
                    this.f112011e = amVar13;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.am amVar14 = new bw5.am();
                    if (bArr2 != null && bArr2.length > 0) {
                        amVar14.mo11468x92b714fd(bArr2);
                    }
                    this.f112012f = amVar14;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.am amVar15 = new bw5.am();
                    if (bArr3 != null && bArr3.length > 0) {
                        amVar15.mo11468x92b714fd(bArr3);
                    }
                    this.f112013g = amVar15;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.am amVar16 = new bw5.am();
                    if (bArr4 != null && bArr4.length > 0) {
                        amVar16.mo11468x92b714fd(bArr4);
                    }
                    this.f112014h = amVar16;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.am amVar17 = new bw5.am();
                    if (bArr5 != null && bArr5.length > 0) {
                        amVar17.mo11468x92b714fd(bArr5);
                    }
                    this.f112015i = amVar17;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.am amVar18 = new bw5.am();
                    if (bArr6 != null && bArr6.length > 0) {
                        amVar18.mo11468x92b714fd(bArr6);
                    }
                    this.f112016m = amVar18;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
