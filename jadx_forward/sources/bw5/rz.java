package bw5;

/* loaded from: classes2.dex */
public class rz extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114237d;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f114239f;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f114242i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.iz f114243m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.iz f114244n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f114245o;

    /* renamed from: p, reason: collision with root package name */
    public int f114246p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f114249s;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f114238e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f114240g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f114241h = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f114247q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f114248r = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f114250t = new boolean[15];

    static {
        new bw5.rz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rz mo11468x92b714fd(byte[] bArr) {
        return (bw5.rz) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rz)) {
            return false;
        }
        bw5.rz rzVar = (bw5.rz) fVar;
        return n51.f.a(this.f114237d, rzVar.f114237d) && n51.f.a(this.f114238e, rzVar.f114238e) && n51.f.a(this.f114239f, rzVar.f114239f) && n51.f.a(this.f114240g, rzVar.f114240g) && n51.f.a(this.f114241h, rzVar.f114241h) && n51.f.a(this.f114242i, rzVar.f114242i) && n51.f.a(this.f114243m, rzVar.f114243m) && n51.f.a(this.f114244n, rzVar.f114244n) && n51.f.a(this.f114245o, rzVar.f114245o) && n51.f.a(java.lang.Integer.valueOf(this.f114246p), java.lang.Integer.valueOf(rzVar.f114246p)) && n51.f.a(this.f114247q, rzVar.f114247q) && n51.f.a(this.f114248r, rzVar.f114248r) && n51.f.a(java.lang.Boolean.valueOf(this.f114249s), java.lang.Boolean.valueOf(rzVar.f114249s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.rz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f114248r;
        java.util.LinkedList linkedList2 = this.f114247q;
        java.util.LinkedList linkedList3 = this.f114241h;
        java.util.LinkedList linkedList4 = this.f114240g;
        java.util.LinkedList linkedList5 = this.f114238e;
        int i18 = 0;
        boolean[] zArr = this.f114250t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114237d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList5);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f114239f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            fVar.g(4, 8, linkedList4);
            fVar.g(5, 8, linkedList3);
            java.lang.String str2 = this.f114242i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            bw5.iz izVar = this.f114243m;
            if (izVar != null && zArr[7]) {
                fVar.i(7, izVar.mo75928xcd1e8d8());
                this.f114243m.mo75956x3d5d1f78(fVar);
            }
            bw5.iz izVar2 = this.f114244n;
            if (izVar2 != null && zArr[8]) {
                fVar.i(8, izVar2.mo75928xcd1e8d8());
                this.f114244n.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f114245o;
            if (gVar2 != null && zArr[9]) {
                fVar.b(9, gVar2);
            }
            if (zArr[10]) {
                fVar.e(10, this.f114246p);
            }
            fVar.g(11, 8, linkedList2);
            fVar.g(12, 8, linkedList);
            if (zArr[14]) {
                fVar.a(14, this.f114249s);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f114237d;
            if (str3 != null && zArr[1]) {
                i18 = b36.f.j(1, str3) + 0;
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList5);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f114239f;
            if (gVar3 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar3);
            }
            int g18 = g17 + b36.f.g(4, 8, linkedList4) + b36.f.g(5, 8, linkedList3);
            java.lang.String str4 = this.f114242i;
            if (str4 != null && zArr[6]) {
                g18 += b36.f.j(6, str4);
            }
            bw5.iz izVar3 = this.f114243m;
            if (izVar3 != null && zArr[7]) {
                g18 += b36.f.i(7, izVar3.mo75928xcd1e8d8());
            }
            bw5.iz izVar4 = this.f114244n;
            if (izVar4 != null && zArr[8]) {
                g18 += b36.f.i(8, izVar4.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f114245o;
            if (gVar4 != null && zArr[9]) {
                g18 += b36.f.b(9, gVar4);
            }
            if (zArr[10]) {
                g18 += b36.f.e(10, this.f114246p);
            }
            int g19 = g18 + b36.f.g(11, 8, linkedList2) + b36.f.g(12, 8, linkedList);
            return zArr[14] ? g19 + b36.f.a(14, this.f114249s) : g19;
        }
        if (i17 == 2) {
            linkedList5.clear();
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
                this.f114237d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mz mzVar = new bw5.mz();
                    if (bArr != null && bArr.length > 0) {
                        mzVar.mo11468x92b714fd(bArr);
                    }
                    linkedList5.add(mzVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f114239f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.pz pzVar = new bw5.pz();
                    if (bArr2 != null && bArr2.length > 0) {
                        pzVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList4.add(pzVar);
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.nz nzVar = new bw5.nz();
                    if (bArr3 != null && bArr3.length > 0) {
                        nzVar.mo11468x92b714fd(bArr3);
                    }
                    linkedList3.add(nzVar);
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f114242i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.iz izVar5 = new bw5.iz();
                    if (bArr4 != null && bArr4.length > 0) {
                        izVar5.mo11468x92b714fd(bArr4);
                    }
                    this.f114243m = izVar5;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.iz izVar6 = new bw5.iz();
                    if (bArr5 != null && bArr5.length > 0) {
                        izVar6.mo11468x92b714fd(bArr5);
                    }
                    this.f114244n = izVar6;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f114245o = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f114246p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.lz lzVar = new bw5.lz();
                    if (bArr6 != null && bArr6.length > 0) {
                        lzVar.mo11468x92b714fd(bArr6);
                    }
                    linkedList2.add(lzVar);
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.jz jzVar = new bw5.jz();
                    if (bArr7 != null && bArr7.length > 0) {
                        jzVar.mo11468x92b714fd(bArr7);
                    }
                    linkedList.add(jzVar);
                }
                zArr[12] = true;
                return 0;
            case 13:
            default:
                return -1;
            case 14:
                this.f114249s = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
        }
    }
}
