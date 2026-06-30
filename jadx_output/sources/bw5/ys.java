package bw5;

/* loaded from: classes2.dex */
public class ys extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.js f35685d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.bt f35686e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.et f35687f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ft f35688g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.jt f35689h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.kt f35690i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.zs f35691m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.at f35692n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.ht f35693o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.dt f35694p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.gt f35695q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.ct f35696r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f35697s = new boolean[16];

    static {
        new bw5.ys();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ys parseFrom(byte[] bArr) {
        return (bw5.ys) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ys)) {
            return false;
        }
        bw5.ys ysVar = (bw5.ys) fVar;
        return n51.f.a(this.f35685d, ysVar.f35685d) && n51.f.a(this.f35686e, ysVar.f35686e) && n51.f.a(this.f35687f, ysVar.f35687f) && n51.f.a(this.f35688g, ysVar.f35688g) && n51.f.a(this.f35689h, ysVar.f35689h) && n51.f.a(this.f35690i, ysVar.f35690i) && n51.f.a(this.f35691m, ysVar.f35691m) && n51.f.a(this.f35692n, ysVar.f35692n) && n51.f.a(this.f35693o, ysVar.f35693o) && n51.f.a(this.f35694p, ysVar.f35694p) && n51.f.a(this.f35695q, ysVar.f35695q) && n51.f.a(this.f35696r, ysVar.f35696r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ys();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35697s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.js jsVar = this.f35685d;
            if (jsVar != null && zArr[1]) {
                fVar.i(1, jsVar.computeSize());
                this.f35685d.writeFields(fVar);
            }
            bw5.bt btVar = this.f35686e;
            if (btVar != null && zArr[2]) {
                fVar.i(2, btVar.computeSize());
                this.f35686e.writeFields(fVar);
            }
            bw5.et etVar = this.f35687f;
            if (etVar != null && zArr[3]) {
                fVar.i(3, etVar.computeSize());
                this.f35687f.writeFields(fVar);
            }
            bw5.ft ftVar = this.f35688g;
            if (ftVar != null && zArr[4]) {
                fVar.i(4, ftVar.computeSize());
                this.f35688g.writeFields(fVar);
            }
            bw5.jt jtVar = this.f35689h;
            if (jtVar != null && zArr[5]) {
                fVar.i(5, jtVar.computeSize());
                this.f35689h.writeFields(fVar);
            }
            bw5.kt ktVar = this.f35690i;
            if (ktVar != null && zArr[6]) {
                fVar.i(6, ktVar.computeSize());
                this.f35690i.writeFields(fVar);
            }
            bw5.zs zsVar = this.f35691m;
            if (zsVar != null && zArr[7]) {
                fVar.i(7, zsVar.computeSize());
                this.f35691m.writeFields(fVar);
            }
            bw5.at atVar = this.f35692n;
            if (atVar != null && zArr[8]) {
                fVar.i(8, atVar.computeSize());
                this.f35692n.writeFields(fVar);
            }
            bw5.ht htVar = this.f35693o;
            if (htVar != null && zArr[9]) {
                fVar.i(9, htVar.computeSize());
                this.f35693o.writeFields(fVar);
            }
            bw5.dt dtVar = this.f35694p;
            if (dtVar != null && zArr[10]) {
                fVar.i(10, dtVar.computeSize());
                this.f35694p.writeFields(fVar);
            }
            bw5.gt gtVar = this.f35695q;
            if (gtVar != null && zArr[14]) {
                fVar.i(14, gtVar.computeSize());
                this.f35695q.writeFields(fVar);
            }
            bw5.ct ctVar = this.f35696r;
            if (ctVar == null || !zArr[15]) {
                return 0;
            }
            fVar.i(15, ctVar.computeSize());
            this.f35696r.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            bw5.js jsVar2 = this.f35685d;
            int i18 = (jsVar2 == null || !zArr[1]) ? 0 : 0 + b36.f.i(1, jsVar2.computeSize());
            bw5.bt btVar2 = this.f35686e;
            if (btVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, btVar2.computeSize());
            }
            bw5.et etVar2 = this.f35687f;
            if (etVar2 != null && zArr[3]) {
                i18 += b36.f.i(3, etVar2.computeSize());
            }
            bw5.ft ftVar2 = this.f35688g;
            if (ftVar2 != null && zArr[4]) {
                i18 += b36.f.i(4, ftVar2.computeSize());
            }
            bw5.jt jtVar2 = this.f35689h;
            if (jtVar2 != null && zArr[5]) {
                i18 += b36.f.i(5, jtVar2.computeSize());
            }
            bw5.kt ktVar2 = this.f35690i;
            if (ktVar2 != null && zArr[6]) {
                i18 += b36.f.i(6, ktVar2.computeSize());
            }
            bw5.zs zsVar2 = this.f35691m;
            if (zsVar2 != null && zArr[7]) {
                i18 += b36.f.i(7, zsVar2.computeSize());
            }
            bw5.at atVar2 = this.f35692n;
            if (atVar2 != null && zArr[8]) {
                i18 += b36.f.i(8, atVar2.computeSize());
            }
            bw5.ht htVar2 = this.f35693o;
            if (htVar2 != null && zArr[9]) {
                i18 += b36.f.i(9, htVar2.computeSize());
            }
            bw5.dt dtVar2 = this.f35694p;
            if (dtVar2 != null && zArr[10]) {
                i18 += b36.f.i(10, dtVar2.computeSize());
            }
            bw5.gt gtVar2 = this.f35695q;
            if (gtVar2 != null && zArr[14]) {
                i18 += b36.f.i(14, gtVar2.computeSize());
            }
            bw5.ct ctVar2 = this.f35696r;
            return (ctVar2 == null || !zArr[15]) ? i18 : i18 + b36.f.i(15, ctVar2.computeSize());
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
        if (intValue == 14) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.gt gtVar3 = new bw5.gt();
                if (bArr != null && bArr.length > 0) {
                    gtVar3.parseFrom(bArr);
                }
                this.f35695q = gtVar3;
            }
            zArr[14] = true;
            return 0;
        }
        if (intValue == 15) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.ct ctVar3 = new bw5.ct();
                if (bArr2 != null && bArr2.length > 0) {
                    ctVar3.parseFrom(bArr2);
                }
                this.f35696r = ctVar3;
            }
            zArr[15] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.js jsVar3 = new bw5.js();
                    if (bArr3 != null && bArr3.length > 0) {
                        jsVar3.parseFrom(bArr3);
                    }
                    this.f35685d = jsVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.bt btVar3 = new bw5.bt();
                    if (bArr4 != null && bArr4.length > 0) {
                        btVar3.parseFrom(bArr4);
                    }
                    this.f35686e = btVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.et etVar3 = new bw5.et();
                    if (bArr5 != null && bArr5.length > 0) {
                        etVar3.parseFrom(bArr5);
                    }
                    this.f35687f = etVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.ft ftVar3 = new bw5.ft();
                    if (bArr6 != null && bArr6.length > 0) {
                        ftVar3.parseFrom(bArr6);
                    }
                    this.f35688g = ftVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.jt jtVar3 = new bw5.jt();
                    if (bArr7 != null && bArr7.length > 0) {
                        jtVar3.parseFrom(bArr7);
                    }
                    this.f35689h = jtVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.kt ktVar3 = new bw5.kt();
                    if (bArr8 != null && bArr8.length > 0) {
                        ktVar3.parseFrom(bArr8);
                    }
                    this.f35690i = ktVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    bw5.zs zsVar3 = new bw5.zs();
                    if (bArr9 != null && bArr9.length > 0) {
                        zsVar3.parseFrom(bArr9);
                    }
                    this.f35691m = zsVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    bw5.at atVar3 = new bw5.at();
                    if (bArr10 != null && bArr10.length > 0) {
                        atVar3.parseFrom(bArr10);
                    }
                    this.f35692n = atVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    bw5.ht htVar3 = new bw5.ht();
                    if (bArr11 != null && bArr11.length > 0) {
                        htVar3.parseFrom(bArr11);
                    }
                    this.f35693o = htVar3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    bw5.dt dtVar3 = new bw5.dt();
                    if (bArr12 != null && bArr12.length > 0) {
                        dtVar3.parseFrom(bArr12);
                    }
                    this.f35694p = dtVar3;
                }
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
