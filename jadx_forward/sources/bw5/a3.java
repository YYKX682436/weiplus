package bw5;

/* loaded from: classes4.dex */
public class a3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f106515d;

    /* renamed from: e, reason: collision with root package name */
    public int f106516e;

    /* renamed from: f, reason: collision with root package name */
    public int f106517f;

    /* renamed from: g, reason: collision with root package name */
    public int f106518g;

    /* renamed from: h, reason: collision with root package name */
    public int f106519h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f106521m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cu5 f106522n;

    /* renamed from: o, reason: collision with root package name */
    public int f106523o;

    /* renamed from: p, reason: collision with root package name */
    public int f106524p;

    /* renamed from: t, reason: collision with root package name */
    public int f106528t;

    /* renamed from: u, reason: collision with root package name */
    public int f106529u;

    /* renamed from: v, reason: collision with root package name */
    public int f106530v;

    /* renamed from: w, reason: collision with root package name */
    public r45.cu5 f106531w;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f106520i = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f106525q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f106526r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f106527s = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f106532x = new boolean[18];

    static {
        new bw5.a3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a3 mo11468x92b714fd(byte[] bArr) {
        return (bw5.a3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a3)) {
            return false;
        }
        bw5.a3 a3Var = (bw5.a3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f106515d), java.lang.Integer.valueOf(a3Var.f106515d)) && n51.f.a(java.lang.Integer.valueOf(this.f106516e), java.lang.Integer.valueOf(a3Var.f106516e)) && n51.f.a(java.lang.Integer.valueOf(this.f106517f), java.lang.Integer.valueOf(a3Var.f106517f)) && n51.f.a(java.lang.Integer.valueOf(this.f106518g), java.lang.Integer.valueOf(a3Var.f106518g)) && n51.f.a(java.lang.Integer.valueOf(this.f106519h), java.lang.Integer.valueOf(a3Var.f106519h)) && n51.f.a(this.f106520i, a3Var.f106520i) && n51.f.a(this.f106521m, a3Var.f106521m) && n51.f.a(this.f106522n, a3Var.f106522n) && n51.f.a(java.lang.Integer.valueOf(this.f106523o), java.lang.Integer.valueOf(a3Var.f106523o)) && n51.f.a(java.lang.Integer.valueOf(this.f106524p), java.lang.Integer.valueOf(a3Var.f106524p)) && n51.f.a(this.f106525q, a3Var.f106525q) && n51.f.a(this.f106526r, a3Var.f106526r) && n51.f.a(this.f106527s, a3Var.f106527s) && n51.f.a(java.lang.Integer.valueOf(this.f106528t), java.lang.Integer.valueOf(a3Var.f106528t)) && n51.f.a(java.lang.Integer.valueOf(this.f106529u), java.lang.Integer.valueOf(a3Var.f106529u)) && n51.f.a(java.lang.Integer.valueOf(this.f106530v), java.lang.Integer.valueOf(a3Var.f106530v)) && n51.f.a(this.f106531w, a3Var.f106531w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.a3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f106527s;
        java.util.LinkedList linkedList2 = this.f106526r;
        java.util.LinkedList linkedList3 = this.f106525q;
        java.util.LinkedList linkedList4 = this.f106520i;
        boolean[] zArr = this.f106532x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f106515d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f106516e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f106517f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f106518g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f106519h);
            }
            fVar.g(6, 8, linkedList4);
            java.lang.String str = this.f106521m;
            if (str != null && zArr[7]) {
                fVar.j(7, str);
            }
            r45.cu5 cu5Var = this.f106522n;
            if (cu5Var != null && zArr[8]) {
                fVar.i(8, cu5Var.mo75928xcd1e8d8());
                this.f106522n.mo75956x3d5d1f78(fVar);
            }
            if (zArr[9]) {
                fVar.e(9, this.f106523o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f106524p);
            }
            fVar.g(11, 8, linkedList3);
            fVar.g(12, 8, linkedList2);
            fVar.g(13, 8, linkedList);
            if (zArr[14]) {
                fVar.e(14, this.f106528t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f106529u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f106530v);
            }
            r45.cu5 cu5Var2 = this.f106531w;
            if (cu5Var2 != null && zArr[17]) {
                fVar.i(17, cu5Var2.mo75928xcd1e8d8());
                this.f106531w.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f106515d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f106516e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f106517f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f106518g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f106519h);
            }
            int g17 = e17 + b36.f.g(6, 8, linkedList4);
            java.lang.String str2 = this.f106521m;
            if (str2 != null && zArr[7]) {
                g17 += b36.f.j(7, str2);
            }
            r45.cu5 cu5Var3 = this.f106522n;
            if (cu5Var3 != null && zArr[8]) {
                g17 += b36.f.i(8, cu5Var3.mo75928xcd1e8d8());
            }
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f106523o);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f106524p);
            }
            int g18 = g17 + b36.f.g(11, 8, linkedList3) + b36.f.g(12, 8, linkedList2) + b36.f.g(13, 8, linkedList);
            if (zArr[14]) {
                g18 += b36.f.e(14, this.f106528t);
            }
            if (zArr[15]) {
                g18 += b36.f.e(15, this.f106529u);
            }
            if (zArr[16]) {
                g18 += b36.f.e(16, this.f106530v);
            }
            r45.cu5 cu5Var4 = this.f106531w;
            return (cu5Var4 == null || !zArr[17]) ? g18 : g18 + b36.f.i(17, cu5Var4.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            linkedList4.clear();
            linkedList3.clear();
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
                this.f106515d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f106516e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f106517f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f106518g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f106519h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var.b(bArr);
                    }
                    linkedList4.add(du5Var);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f106521m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    this.f106522n = cu5Var5;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f106523o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f106524p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var2.b(bArr3);
                    }
                    linkedList3.add(du5Var2);
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.b3 b3Var = new bw5.b3();
                    if (bArr4 != null && bArr4.length > 0) {
                        b3Var.mo11468x92b714fd(bArr4);
                    }
                    linkedList2.add(b3Var);
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.b3 b3Var2 = new bw5.b3();
                    if (bArr5 != null && bArr5.length > 0) {
                        b3Var2.mo11468x92b714fd(bArr5);
                    }
                    linkedList.add(b3Var2);
                }
                zArr[13] = true;
                return 0;
            case 14:
                this.f106528t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f106529u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f106530v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var6.b(bArr6);
                    }
                    this.f106531w = cu5Var6;
                }
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }
}
