package bw5;

/* loaded from: classes2.dex */
public class m4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.o4 f111599e;

    /* renamed from: g, reason: collision with root package name */
    public bw5.am f111601g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.am f111602h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.am f111603i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.am f111604m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f111605n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.am f111606o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f111607p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f111608q;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f111598d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f111600f = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f111609r = new boolean[12];

    static {
        new bw5.m4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m4 mo11468x92b714fd(byte[] bArr) {
        return (bw5.m4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.m4)) {
            return false;
        }
        bw5.m4 m4Var = (bw5.m4) fVar;
        return n51.f.a(this.f111598d, m4Var.f111598d) && n51.f.a(this.f111599e, m4Var.f111599e) && n51.f.a(this.f111600f, m4Var.f111600f) && n51.f.a(this.f111601g, m4Var.f111601g) && n51.f.a(this.f111602h, m4Var.f111602h) && n51.f.a(this.f111603i, m4Var.f111603i) && n51.f.a(this.f111604m, m4Var.f111604m) && n51.f.a(this.f111605n, m4Var.f111605n) && n51.f.a(this.f111606o, m4Var.f111606o) && n51.f.a(this.f111607p, m4Var.f111607p) && n51.f.a(java.lang.Boolean.valueOf(this.f111608q), java.lang.Boolean.valueOf(m4Var.f111608q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.m4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f111600f;
        java.util.LinkedList linkedList2 = this.f111598d;
        boolean[] zArr = this.f111609r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            bw5.o4 o4Var = this.f111599e;
            if (o4Var != null && zArr[2]) {
                fVar.i(2, o4Var.mo75928xcd1e8d8());
                this.f111599e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            bw5.am amVar = this.f111601g;
            if (amVar != null && zArr[4]) {
                fVar.i(4, amVar.mo75928xcd1e8d8());
                this.f111601g.mo75956x3d5d1f78(fVar);
            }
            bw5.am amVar2 = this.f111602h;
            if (amVar2 != null && zArr[5]) {
                fVar.i(5, amVar2.mo75928xcd1e8d8());
                this.f111602h.mo75956x3d5d1f78(fVar);
            }
            bw5.am amVar3 = this.f111603i;
            if (amVar3 != null && zArr[6]) {
                fVar.i(6, amVar3.mo75928xcd1e8d8());
                this.f111603i.mo75956x3d5d1f78(fVar);
            }
            bw5.am amVar4 = this.f111604m;
            if (amVar4 != null && zArr[7]) {
                fVar.i(7, amVar4.mo75928xcd1e8d8());
                this.f111604m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f111605n;
            if (str != null && zArr[8]) {
                fVar.j(8, str);
            }
            bw5.am amVar5 = this.f111606o;
            if (amVar5 != null && zArr[9]) {
                fVar.i(9, amVar5.mo75928xcd1e8d8());
                this.f111606o.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f111607p;
            if (str2 != null && zArr[10]) {
                fVar.j(10, str2);
            }
            if (zArr[11]) {
                fVar.a(11, this.f111608q);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            bw5.o4 o4Var2 = this.f111599e;
            if (o4Var2 != null && zArr[2]) {
                g17 += b36.f.i(2, o4Var2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(3, 8, linkedList);
            bw5.am amVar6 = this.f111601g;
            if (amVar6 != null && zArr[4]) {
                g18 += b36.f.i(4, amVar6.mo75928xcd1e8d8());
            }
            bw5.am amVar7 = this.f111602h;
            if (amVar7 != null && zArr[5]) {
                g18 += b36.f.i(5, amVar7.mo75928xcd1e8d8());
            }
            bw5.am amVar8 = this.f111603i;
            if (amVar8 != null && zArr[6]) {
                g18 += b36.f.i(6, amVar8.mo75928xcd1e8d8());
            }
            bw5.am amVar9 = this.f111604m;
            if (amVar9 != null && zArr[7]) {
                g18 += b36.f.i(7, amVar9.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f111605n;
            if (str3 != null && zArr[8]) {
                g18 += b36.f.j(8, str3);
            }
            bw5.am amVar10 = this.f111606o;
            if (amVar10 != null && zArr[9]) {
                g18 += b36.f.i(9, amVar10.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f111607p;
            if (str4 != null && zArr[10]) {
                g18 += b36.f.j(10, str4);
            }
            return zArr[11] ? g18 + b36.f.a(11, this.f111608q) : g18;
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.l4 l4Var = new bw5.l4();
                    if (bArr != null && bArr.length > 0) {
                        l4Var.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(l4Var);
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.o4 o4Var3 = new bw5.o4();
                    if (bArr2 != null && bArr2.length > 0) {
                        o4Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f111599e = o4Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.n4 n4Var = new bw5.n4();
                    if (bArr3 != null && bArr3.length > 0) {
                        n4Var.mo11468x92b714fd(bArr3);
                    }
                    linkedList.add(n4Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.am amVar11 = new bw5.am();
                    if (bArr4 != null && bArr4.length > 0) {
                        amVar11.mo11468x92b714fd(bArr4);
                    }
                    this.f111601g = amVar11;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.am amVar12 = new bw5.am();
                    if (bArr5 != null && bArr5.length > 0) {
                        amVar12.mo11468x92b714fd(bArr5);
                    }
                    this.f111602h = amVar12;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.am amVar13 = new bw5.am();
                    if (bArr6 != null && bArr6.length > 0) {
                        amVar13.mo11468x92b714fd(bArr6);
                    }
                    this.f111603i = amVar13;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.am amVar14 = new bw5.am();
                    if (bArr7 != null && bArr7.length > 0) {
                        amVar14.mo11468x92b714fd(bArr7);
                    }
                    this.f111604m = amVar14;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f111605n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.am amVar15 = new bw5.am();
                    if (bArr8 != null && bArr8.length > 0) {
                        amVar15.mo11468x92b714fd(bArr8);
                    }
                    this.f111606o = amVar15;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f111607p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f111608q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
