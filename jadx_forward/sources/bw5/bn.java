package bw5;

/* loaded from: classes2.dex */
public class bn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107287d;

    /* renamed from: e, reason: collision with root package name */
    public long f107288e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107289f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ql f107290g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.an f107291h;

    /* renamed from: m, reason: collision with root package name */
    public int f107293m;

    /* renamed from: n, reason: collision with root package name */
    public long f107294n;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f107292i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f107295o = new boolean[9];

    static {
        new bw5.bn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bn mo11468x92b714fd(byte[] bArr) {
        return (bw5.bn) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bn)) {
            return false;
        }
        bw5.bn bnVar = (bw5.bn) fVar;
        return n51.f.a(this.f107287d, bnVar.f107287d) && n51.f.a(java.lang.Long.valueOf(this.f107288e), java.lang.Long.valueOf(bnVar.f107288e)) && n51.f.a(this.f107289f, bnVar.f107289f) && n51.f.a(this.f107290g, bnVar.f107290g) && n51.f.a(this.f107291h, bnVar.f107291h) && n51.f.a(this.f107292i, bnVar.f107292i) && n51.f.a(java.lang.Integer.valueOf(this.f107293m), java.lang.Integer.valueOf(bnVar.f107293m)) && n51.f.a(java.lang.Long.valueOf(this.f107294n), java.lang.Long.valueOf(bnVar.f107294n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f107292i;
        int i18 = 0;
        boolean[] zArr = this.f107295o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f107287d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f107288e);
            }
            java.lang.String str2 = this.f107289f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.ql qlVar = this.f107290g;
            if (qlVar != null && zArr[4]) {
                fVar.i(4, qlVar.mo75928xcd1e8d8());
                this.f107290g.mo75956x3d5d1f78(fVar);
            }
            bw5.an anVar = this.f107291h;
            if (anVar != null && zArr[5]) {
                fVar.e(5, anVar.f106809d);
            }
            fVar.g(6, 8, linkedList);
            if (zArr[7]) {
                fVar.e(7, this.f107293m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f107294n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f107287d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f107288e);
            }
            java.lang.String str4 = this.f107289f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            bw5.ql qlVar2 = this.f107290g;
            if (qlVar2 != null && zArr[4]) {
                i18 += b36.f.i(4, qlVar2.mo75928xcd1e8d8());
            }
            bw5.an anVar2 = this.f107291h;
            if (anVar2 != null && zArr[5]) {
                i18 += b36.f.e(5, anVar2.f106809d);
            }
            int g17 = i18 + b36.f.g(6, 8, linkedList);
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f107293m);
            }
            return zArr[8] ? g17 + b36.f.h(8, this.f107294n) : g17;
        }
        if (i17 == 2) {
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
                this.f107287d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107288e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107289f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ql qlVar3 = new bw5.ql();
                    if (bArr != null && bArr.length > 0) {
                        qlVar3.mo11468x92b714fd(bArr);
                    }
                    this.f107290g = qlVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                int g18 = aVar2.g(intValue);
                this.f107291h = g18 != 0 ? g18 != 1 ? g18 != 2 ? null : bw5.an.Accept : bw5.an.Apply : bw5.an.Unknown;
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.um umVar = new bw5.um();
                    if (bArr2 != null && bArr2.length > 0) {
                        umVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(umVar);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f107293m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107294n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
