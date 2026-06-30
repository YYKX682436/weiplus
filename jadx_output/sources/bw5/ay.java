package bw5;

/* loaded from: classes8.dex */
public class ay extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ix f25451d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.tx f25452e;

    /* renamed from: f, reason: collision with root package name */
    public float f25453f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.zx f25454g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.dy f25455h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.mx f25456i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.wx f25457m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25458n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f25459o = new boolean[9];

    static {
        new bw5.ay();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ay parseFrom(byte[] bArr) {
        return (bw5.ay) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ay)) {
            return false;
        }
        bw5.ay ayVar = (bw5.ay) fVar;
        return n51.f.a(this.f25451d, ayVar.f25451d) && n51.f.a(this.f25452e, ayVar.f25452e) && n51.f.a(java.lang.Float.valueOf(this.f25453f), java.lang.Float.valueOf(ayVar.f25453f)) && n51.f.a(this.f25454g, ayVar.f25454g) && n51.f.a(this.f25455h, ayVar.f25455h) && n51.f.a(this.f25456i, ayVar.f25456i) && n51.f.a(this.f25457m, ayVar.f25457m) && n51.f.a(java.lang.Boolean.valueOf(this.f25458n), java.lang.Boolean.valueOf(ayVar.f25458n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ay();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25459o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ix ixVar = this.f25451d;
            if (ixVar != null && zArr[1]) {
                fVar.e(1, ixVar.f28721d);
            }
            bw5.tx txVar = this.f25452e;
            if (txVar != null && zArr[2]) {
                fVar.i(2, txVar.computeSize());
                this.f25452e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.d(3, this.f25453f);
            }
            bw5.zx zxVar = this.f25454g;
            if (zxVar != null && zArr[4]) {
                fVar.i(4, zxVar.computeSize());
                this.f25454g.writeFields(fVar);
            }
            bw5.dy dyVar = this.f25455h;
            if (dyVar != null && zArr[5]) {
                fVar.i(5, dyVar.computeSize());
                this.f25455h.writeFields(fVar);
            }
            bw5.mx mxVar = this.f25456i;
            if (mxVar != null && zArr[6]) {
                fVar.e(6, mxVar.f30409d);
            }
            bw5.wx wxVar = this.f25457m;
            if (wxVar != null && zArr[7]) {
                fVar.i(7, wxVar.computeSize());
                this.f25457m.writeFields(fVar);
            }
            if (zArr[8]) {
                fVar.a(8, this.f25458n);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ix ixVar2 = this.f25451d;
            if (ixVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, ixVar2.f28721d);
            }
            bw5.tx txVar2 = this.f25452e;
            if (txVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, txVar2.computeSize());
            }
            if (zArr[3]) {
                i18 += b36.f.d(3, this.f25453f);
            }
            bw5.zx zxVar2 = this.f25454g;
            if (zxVar2 != null && zArr[4]) {
                i18 += b36.f.i(4, zxVar2.computeSize());
            }
            bw5.dy dyVar2 = this.f25455h;
            if (dyVar2 != null && zArr[5]) {
                i18 += b36.f.i(5, dyVar2.computeSize());
            }
            bw5.mx mxVar2 = this.f25456i;
            if (mxVar2 != null && zArr[6]) {
                i18 += b36.f.e(6, mxVar2.f30409d);
            }
            bw5.wx wxVar2 = this.f25457m;
            if (wxVar2 != null && zArr[7]) {
                i18 += b36.f.i(7, wxVar2.computeSize());
            }
            return zArr[8] ? i18 + b36.f.a(8, this.f25458n) : i18;
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
        bw5.ix ixVar3 = null;
        bw5.mx mxVar3 = null;
        switch (intValue) {
            case 1:
                int g17 = aVar2.g(intValue);
                if (g17 == 0) {
                    ixVar3 = bw5.ix.FinderTabTipsDSLRenderFontWeight_Default;
                } else if (g17 == 1) {
                    ixVar3 = bw5.ix.FinderTabTipsDSLRenderFontWeight_Bold;
                } else if (g17 == 2) {
                    ixVar3 = bw5.ix.FinderTabTipsDSLRenderFontWeight_Medium;
                }
                this.f25451d = ixVar3;
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.tx txVar3 = new bw5.tx();
                    if (bArr != null && bArr.length > 0) {
                        txVar3.parseFrom(bArr);
                    }
                    this.f25452e = txVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f25453f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.zx zxVar3 = new bw5.zx();
                    if (bArr2 != null && bArr2.length > 0) {
                        zxVar3.parseFrom(bArr2);
                    }
                    this.f25454g = zxVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.dy dyVar3 = new bw5.dy();
                    if (bArr3 != null && bArr3.length > 0) {
                        dyVar3.parseFrom(bArr3);
                    }
                    this.f25455h = dyVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                int g18 = aVar2.g(intValue);
                if (g18 == 0) {
                    mxVar3 = bw5.mx.FinderTabTipsDSLRenderTextAlign_Default;
                } else if (g18 == 1) {
                    mxVar3 = bw5.mx.FinderTabTipsDSLRenderTextAlign_Left;
                } else if (g18 == 2) {
                    mxVar3 = bw5.mx.FinderTabTipsDSLRenderTextAlign_Center;
                } else if (g18 == 3) {
                    mxVar3 = bw5.mx.FinderTabTipsDSLRenderTextAlign_Right;
                }
                this.f25456i = mxVar3;
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.wx wxVar3 = new bw5.wx();
                    if (bArr4 != null && bArr4.length > 0) {
                        wxVar3.parseFrom(bArr4);
                    }
                    this.f25457m = wxVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f25458n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
