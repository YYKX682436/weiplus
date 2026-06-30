package bw5;

/* loaded from: classes2.dex */
public class pt extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31829d;

    /* renamed from: e, reason: collision with root package name */
    public int f31830e;

    /* renamed from: f, reason: collision with root package name */
    public int f31831f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f31832g;

    /* renamed from: h, reason: collision with root package name */
    public int f31833h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f31834i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f31835m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.yr f31836n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f31837o;

    /* renamed from: p, reason: collision with root package name */
    public int f31838p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.wr f31839q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.pd f31840r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f31841s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.gc f31842t;

    /* renamed from: u, reason: collision with root package name */
    public int f31843u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f31844v = new boolean[16];

    static {
        new bw5.pt();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pt parseFrom(byte[] bArr) {
        return (bw5.pt) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pt)) {
            return false;
        }
        bw5.pt ptVar = (bw5.pt) fVar;
        return n51.f.a(this.f31829d, ptVar.f31829d) && n51.f.a(java.lang.Integer.valueOf(this.f31830e), java.lang.Integer.valueOf(ptVar.f31830e)) && n51.f.a(java.lang.Integer.valueOf(this.f31831f), java.lang.Integer.valueOf(ptVar.f31831f)) && n51.f.a(this.f31832g, ptVar.f31832g) && n51.f.a(java.lang.Integer.valueOf(this.f31833h), java.lang.Integer.valueOf(ptVar.f31833h)) && n51.f.a(this.f31834i, ptVar.f31834i) && n51.f.a(this.f31835m, ptVar.f31835m) && n51.f.a(this.f31836n, ptVar.f31836n) && n51.f.a(this.f31837o, ptVar.f31837o) && n51.f.a(java.lang.Integer.valueOf(this.f31838p), java.lang.Integer.valueOf(ptVar.f31838p)) && n51.f.a(this.f31839q, ptVar.f31839q) && n51.f.a(this.f31840r, ptVar.f31840r) && n51.f.a(this.f31841s, ptVar.f31841s) && n51.f.a(this.f31842t, ptVar.f31842t) && n51.f.a(java.lang.Integer.valueOf(this.f31843u), java.lang.Integer.valueOf(ptVar.f31843u));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pt();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f31844v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31829d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f31830e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f31831f);
            }
            java.lang.String str2 = this.f31832g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f31833h);
            }
            java.lang.String str3 = this.f31834i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f31835m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            bw5.yr yrVar = this.f31836n;
            if (yrVar != null && zArr[8]) {
                fVar.i(8, yrVar.computeSize());
                this.f31836n.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f31837o;
            if (gVar != null && zArr[9]) {
                fVar.b(9, gVar);
            }
            if (zArr[10]) {
                fVar.e(10, this.f31838p);
            }
            bw5.wr wrVar = this.f31839q;
            if (wrVar != null && zArr[11]) {
                fVar.i(11, wrVar.computeSize());
                this.f31839q.writeFields(fVar);
            }
            bw5.pd pdVar = this.f31840r;
            if (pdVar != null && zArr[12]) {
                fVar.i(12, pdVar.computeSize());
                this.f31840r.writeFields(fVar);
            }
            java.lang.String str5 = this.f31841s;
            if (str5 != null && zArr[13]) {
                fVar.j(13, str5);
            }
            bw5.gc gcVar = this.f31842t;
            if (gcVar != null && zArr[14]) {
                fVar.i(14, gcVar.computeSize());
                this.f31842t.writeFields(fVar);
            }
            if (zArr[15]) {
                fVar.e(15, this.f31843u);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f31829d;
            if (str6 != null && zArr[1]) {
                i18 = b36.f.j(1, str6) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f31830e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f31831f);
            }
            java.lang.String str7 = this.f31832g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f31833h);
            }
            java.lang.String str8 = this.f31834i;
            if (str8 != null && zArr[6]) {
                i18 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f31835m;
            if (str9 != null && zArr[7]) {
                i18 += b36.f.j(7, str9);
            }
            bw5.yr yrVar2 = this.f31836n;
            if (yrVar2 != null && zArr[8]) {
                i18 += b36.f.i(8, yrVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f31837o;
            if (gVar2 != null && zArr[9]) {
                i18 += b36.f.b(9, gVar2);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f31838p);
            }
            bw5.wr wrVar2 = this.f31839q;
            if (wrVar2 != null && zArr[11]) {
                i18 += b36.f.i(11, wrVar2.computeSize());
            }
            bw5.pd pdVar2 = this.f31840r;
            if (pdVar2 != null && zArr[12]) {
                i18 += b36.f.i(12, pdVar2.computeSize());
            }
            java.lang.String str10 = this.f31841s;
            if (str10 != null && zArr[13]) {
                i18 += b36.f.j(13, str10);
            }
            bw5.gc gcVar2 = this.f31842t;
            if (gcVar2 != null && zArr[14]) {
                i18 += b36.f.i(14, gcVar2.computeSize());
            }
            return zArr[15] ? i18 + b36.f.e(15, this.f31843u) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
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
                this.f31829d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31830e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31831f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31832g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f31833h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f31834i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f31835m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.yr yrVar3 = new bw5.yr();
                    if (bArr != null && bArr.length > 0) {
                        yrVar3.parseFrom(bArr);
                    }
                    this.f31836n = yrVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f31837o = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f31838p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.wr wrVar3 = new bw5.wr();
                    if (bArr2 != null && bArr2.length > 0) {
                        wrVar3.parseFrom(bArr2);
                    }
                    this.f31839q = wrVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.pd pdVar3 = new bw5.pd();
                    if (bArr3 != null && bArr3.length > 0) {
                        pdVar3.parseFrom(bArr3);
                    }
                    this.f31840r = pdVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f31841s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.gc gcVar3 = new bw5.gc();
                    if (bArr4 != null && bArr4.length > 0) {
                        gcVar3.parseFrom(bArr4);
                    }
                    this.f31842t = gcVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f31843u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
