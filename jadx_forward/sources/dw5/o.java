package dw5;

/* loaded from: classes15.dex */
public class o extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f325928d;

    /* renamed from: f, reason: collision with root package name */
    public int f325930f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f325932h;

    /* renamed from: i, reason: collision with root package name */
    public dw5.e f325933i;

    /* renamed from: m, reason: collision with root package name */
    public dw5.n f325934m;

    /* renamed from: n, reason: collision with root package name */
    public int f325935n;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f325929e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f325931g = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f325936o = new boolean[9];

    static {
        new dw5.o();
    }

    public dw5.o b(java.util.Collection collection) {
        this.f325931g.addAll(collection);
        this.f325936o[4] = true;
        return this;
    }

    public dw5.o c(java.util.Collection collection) {
        this.f325929e.addAll(collection);
        this.f325936o[2] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.o)) {
            return false;
        }
        dw5.o oVar = (dw5.o) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f325928d), java.lang.Integer.valueOf(oVar.f325928d)) && n51.f.a(this.f325929e, oVar.f325929e) && n51.f.a(java.lang.Integer.valueOf(this.f325930f), java.lang.Integer.valueOf(oVar.f325930f)) && n51.f.a(this.f325931g, oVar.f325931g) && n51.f.a(this.f325932h, oVar.f325932h) && n51.f.a(this.f325933i, oVar.f325933i) && n51.f.a(this.f325934m, oVar.f325934m) && n51.f.a(java.lang.Integer.valueOf(this.f325935n), java.lang.Integer.valueOf(oVar.f325935n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public dw5.o mo11468x92b714fd(byte[] bArr) {
        return (dw5.o) super.mo11468x92b714fd(bArr);
    }

    public dw5.o e(int i17) {
        this.f325930f = i17;
        this.f325936o[3] = true;
        return this;
    }

    public dw5.o f(int i17) {
        this.f325928d = i17;
        this.f325936o[1] = true;
        return this;
    }

    public dw5.o g(int i17) {
        this.f325935n = i17;
        this.f325936o[8] = true;
        return this;
    }

    public dw5.o i(dw5.n nVar) {
        this.f325934m = nVar;
        this.f325936o[7] = true;
        return this;
    }

    public dw5.o j(java.lang.String str) {
        this.f325932h = str;
        this.f325936o[5] = true;
        return this;
    }

    public dw5.o k(dw5.e eVar) {
        this.f325933i = eVar;
        this.f325936o[6] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new dw5.o();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f325931g;
        java.util.LinkedList linkedList2 = this.f325929e;
        boolean[] zArr = this.f325936o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f325928d);
            }
            fVar.g(2, 8, linkedList2);
            if (zArr[3]) {
                fVar.e(3, this.f325930f);
            }
            fVar.g(4, 8, linkedList);
            java.lang.String str = this.f325932h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            dw5.e eVar = this.f325933i;
            if (eVar != null && zArr[6]) {
                fVar.i(6, eVar.mo75928xcd1e8d8());
                this.f325933i.mo75956x3d5d1f78(fVar);
            }
            dw5.n nVar = this.f325934m;
            if (nVar != null && zArr[7]) {
                fVar.i(7, nVar.mo75928xcd1e8d8());
                this.f325934m.mo75956x3d5d1f78(fVar);
            }
            if (zArr[8]) {
                fVar.e(8, this.f325935n);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f325928d) : 0) + b36.f.g(2, 8, linkedList2);
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f325930f);
            }
            int g17 = e17 + b36.f.g(4, 8, linkedList);
            java.lang.String str2 = this.f325932h;
            if (str2 != null && zArr[5]) {
                g17 += b36.f.j(5, str2);
            }
            dw5.e eVar2 = this.f325933i;
            if (eVar2 != null && zArr[6]) {
                g17 += b36.f.i(6, eVar2.mo75928xcd1e8d8());
            }
            dw5.n nVar2 = this.f325934m;
            if (nVar2 != null && zArr[7]) {
                g17 += b36.f.i(7, nVar2.mo75928xcd1e8d8());
            }
            return zArr[8] ? g17 + b36.f.e(8, this.f325935n) : g17;
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
                this.f325928d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    dw5.l lVar = new dw5.l();
                    if (bArr != null && bArr.length > 0) {
                        lVar.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(lVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f325930f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    dw5.d dVar = new dw5.d();
                    if (bArr2 != null && bArr2.length > 0) {
                        dVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(dVar);
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f325932h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    dw5.e eVar3 = new dw5.e();
                    if (bArr3 != null && bArr3.length > 0) {
                        eVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f325933i = eVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    dw5.n nVar3 = new dw5.n();
                    if (bArr4 != null && bArr4.length > 0) {
                        nVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f325934m = nVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f325935n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
