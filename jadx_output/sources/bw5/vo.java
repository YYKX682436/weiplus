package bw5;

/* loaded from: classes2.dex */
public class vo extends com.tencent.mm.protobuf.f {
    public bw5.ko A;

    /* renamed from: d, reason: collision with root package name */
    public long f34417d;

    /* renamed from: e, reason: collision with root package name */
    public int f34418e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.yr f34419f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34420g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.xo f34421h;

    /* renamed from: m, reason: collision with root package name */
    public bw5.wo f34423m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.oc f34424n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f34425o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.io f34426p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.fc f34427q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.jl f34428r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.ak f34429s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.jp f34430t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.kl f34431u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.bp f34432v;

    /* renamed from: w, reason: collision with root package name */
    public int f34433w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.go f34434x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.wr f34435y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.nm f34436z;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f34422i = new java.util.LinkedList();
    public final boolean[] B = new boolean[22];

    static {
        new bw5.vo();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vo parseFrom(byte[] bArr) {
        return (bw5.vo) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vo)) {
            return false;
        }
        bw5.vo voVar = (bw5.vo) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f34417d), java.lang.Long.valueOf(voVar.f34417d)) && n51.f.a(java.lang.Integer.valueOf(this.f34418e), java.lang.Integer.valueOf(voVar.f34418e)) && n51.f.a(this.f34419f, voVar.f34419f) && n51.f.a(this.f34420g, voVar.f34420g) && n51.f.a(this.f34421h, voVar.f34421h) && n51.f.a(this.f34422i, voVar.f34422i) && n51.f.a(this.f34423m, voVar.f34423m) && n51.f.a(this.f34424n, voVar.f34424n) && n51.f.a(this.f34425o, voVar.f34425o) && n51.f.a(this.f34426p, voVar.f34426p) && n51.f.a(this.f34427q, voVar.f34427q) && n51.f.a(this.f34428r, voVar.f34428r) && n51.f.a(this.f34429s, voVar.f34429s) && n51.f.a(this.f34430t, voVar.f34430t) && n51.f.a(this.f34431u, voVar.f34431u) && n51.f.a(this.f34432v, voVar.f34432v) && n51.f.a(java.lang.Integer.valueOf(this.f34433w), java.lang.Integer.valueOf(voVar.f34433w)) && n51.f.a(this.f34434x, voVar.f34434x) && n51.f.a(this.f34435y, voVar.f34435y) && n51.f.a(this.f34436z, voVar.f34436z) && n51.f.a(this.A, voVar.A);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.B;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f34417d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34418e);
            }
            bw5.yr yrVar = this.f34419f;
            if (yrVar != null && zArr[3]) {
                fVar.i(3, yrVar.computeSize());
                this.f34419f.writeFields(fVar);
            }
            java.lang.String str = this.f34420g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            bw5.xo xoVar = this.f34421h;
            if (xoVar != null && zArr[5]) {
                fVar.i(5, xoVar.computeSize());
                this.f34421h.writeFields(fVar);
            }
            fVar.g(6, 8, this.f34422i);
            bw5.wo woVar = this.f34423m;
            if (woVar != null && zArr[7]) {
                fVar.i(7, woVar.computeSize());
                this.f34423m.writeFields(fVar);
            }
            bw5.oc ocVar = this.f34424n;
            if (ocVar != null && zArr[8]) {
                fVar.i(8, ocVar.computeSize());
                this.f34424n.writeFields(fVar);
            }
            java.lang.String str2 = this.f34425o;
            if (str2 != null && zArr[9]) {
                fVar.j(9, str2);
            }
            bw5.io ioVar = this.f34426p;
            if (ioVar != null && zArr[10]) {
                fVar.i(10, ioVar.computeSize());
                this.f34426p.writeFields(fVar);
            }
            bw5.fc fcVar = this.f34427q;
            if (fcVar != null && zArr[11]) {
                fVar.i(11, fcVar.computeSize());
                this.f34427q.writeFields(fVar);
            }
            bw5.jl jlVar = this.f34428r;
            if (jlVar != null && zArr[12]) {
                fVar.i(12, jlVar.computeSize());
                this.f34428r.writeFields(fVar);
            }
            bw5.ak akVar = this.f34429s;
            if (akVar != null && zArr[13]) {
                fVar.i(13, akVar.computeSize());
                this.f34429s.writeFields(fVar);
            }
            bw5.jp jpVar = this.f34430t;
            if (jpVar != null && zArr[14]) {
                fVar.i(14, jpVar.computeSize());
                this.f34430t.writeFields(fVar);
            }
            bw5.kl klVar = this.f34431u;
            if (klVar != null && zArr[15]) {
                fVar.i(15, klVar.computeSize());
                this.f34431u.writeFields(fVar);
            }
            bw5.bp bpVar = this.f34432v;
            if (bpVar != null && zArr[16]) {
                fVar.i(16, bpVar.computeSize());
                this.f34432v.writeFields(fVar);
            }
            if (zArr[17]) {
                fVar.e(17, this.f34433w);
            }
            bw5.go goVar = this.f34434x;
            if (goVar != null && zArr[18]) {
                fVar.i(18, goVar.computeSize());
                this.f34434x.writeFields(fVar);
            }
            bw5.wr wrVar = this.f34435y;
            if (wrVar != null && zArr[19]) {
                fVar.i(19, wrVar.computeSize());
                this.f34435y.writeFields(fVar);
            }
            bw5.nm nmVar = this.f34436z;
            if (nmVar != null && zArr[20]) {
                fVar.i(20, nmVar.computeSize());
                this.f34436z.writeFields(fVar);
            }
            bw5.ko koVar = this.A;
            if (koVar != null && zArr[21]) {
                fVar.i(21, koVar.computeSize());
                this.A.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f34417d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f34418e);
            }
            bw5.yr yrVar2 = this.f34419f;
            if (yrVar2 != null && zArr[3]) {
                h17 += b36.f.i(3, yrVar2.computeSize());
            }
            java.lang.String str3 = this.f34420g;
            if (str3 != null && zArr[4]) {
                h17 += b36.f.j(4, str3);
            }
            bw5.xo xoVar2 = this.f34421h;
            if (xoVar2 != null && zArr[5]) {
                h17 += b36.f.i(5, xoVar2.computeSize());
            }
            int g17 = h17 + b36.f.g(6, 8, this.f34422i);
            bw5.wo woVar2 = this.f34423m;
            if (woVar2 != null && zArr[7]) {
                g17 += b36.f.i(7, woVar2.computeSize());
            }
            bw5.oc ocVar2 = this.f34424n;
            if (ocVar2 != null && zArr[8]) {
                g17 += b36.f.i(8, ocVar2.computeSize());
            }
            java.lang.String str4 = this.f34425o;
            if (str4 != null && zArr[9]) {
                g17 += b36.f.j(9, str4);
            }
            bw5.io ioVar2 = this.f34426p;
            if (ioVar2 != null && zArr[10]) {
                g17 += b36.f.i(10, ioVar2.computeSize());
            }
            bw5.fc fcVar2 = this.f34427q;
            if (fcVar2 != null && zArr[11]) {
                g17 += b36.f.i(11, fcVar2.computeSize());
            }
            bw5.jl jlVar2 = this.f34428r;
            if (jlVar2 != null && zArr[12]) {
                g17 += b36.f.i(12, jlVar2.computeSize());
            }
            bw5.ak akVar2 = this.f34429s;
            if (akVar2 != null && zArr[13]) {
                g17 += b36.f.i(13, akVar2.computeSize());
            }
            bw5.jp jpVar2 = this.f34430t;
            if (jpVar2 != null && zArr[14]) {
                g17 += b36.f.i(14, jpVar2.computeSize());
            }
            bw5.kl klVar2 = this.f34431u;
            if (klVar2 != null && zArr[15]) {
                g17 += b36.f.i(15, klVar2.computeSize());
            }
            bw5.bp bpVar2 = this.f34432v;
            if (bpVar2 != null && zArr[16]) {
                g17 += b36.f.i(16, bpVar2.computeSize());
            }
            if (zArr[17]) {
                g17 += b36.f.e(17, this.f34433w);
            }
            bw5.go goVar2 = this.f34434x;
            if (goVar2 != null && zArr[18]) {
                g17 += b36.f.i(18, goVar2.computeSize());
            }
            bw5.wr wrVar2 = this.f34435y;
            if (wrVar2 != null && zArr[19]) {
                g17 += b36.f.i(19, wrVar2.computeSize());
            }
            bw5.nm nmVar2 = this.f34436z;
            if (nmVar2 != null && zArr[20]) {
                g17 += b36.f.i(20, nmVar2.computeSize());
            }
            bw5.ko koVar2 = this.A;
            return (koVar2 == null || !zArr[21]) ? g17 : g17 + b36.f.i(21, koVar2.computeSize());
        }
        if (i17 == 2) {
            this.f34422i.clear();
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
                this.f34417d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34418e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.yr yrVar3 = new bw5.yr();
                    if (bArr != null && bArr.length > 0) {
                        yrVar3.parseFrom(bArr);
                    }
                    this.f34419f = yrVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f34420g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.xo xoVar3 = new bw5.xo();
                    if (bArr2 != null && bArr2.length > 0) {
                        xoVar3.parseFrom(bArr2);
                    }
                    this.f34421h = xoVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.yr yrVar4 = new bw5.yr();
                    if (bArr3 != null && bArr3.length > 0) {
                        yrVar4.parseFrom(bArr3);
                    }
                    this.f34422i.add(yrVar4);
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.wo woVar3 = new bw5.wo();
                    if (bArr4 != null && bArr4.length > 0) {
                        woVar3.parseFrom(bArr4);
                    }
                    this.f34423m = woVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.oc ocVar3 = new bw5.oc();
                    if (bArr5 != null && bArr5.length > 0) {
                        ocVar3.parseFrom(bArr5);
                    }
                    this.f34424n = ocVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f34425o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.io ioVar3 = new bw5.io();
                    if (bArr6 != null && bArr6.length > 0) {
                        ioVar3.parseFrom(bArr6);
                    }
                    this.f34426p = ioVar3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.fc fcVar3 = new bw5.fc();
                    if (bArr7 != null && bArr7.length > 0) {
                        fcVar3.parseFrom(bArr7);
                    }
                    this.f34427q = fcVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.jl jlVar3 = new bw5.jl();
                    if (bArr8 != null && bArr8.length > 0) {
                        jlVar3.parseFrom(bArr8);
                    }
                    this.f34428r = jlVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.ak akVar3 = new bw5.ak();
                    if (bArr9 != null && bArr9.length > 0) {
                        akVar3.parseFrom(bArr9);
                    }
                    this.f34429s = akVar3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.jp jpVar3 = new bw5.jp();
                    if (bArr10 != null && bArr10.length > 0) {
                        jpVar3.parseFrom(bArr10);
                    }
                    this.f34430t = jpVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    bw5.kl klVar3 = new bw5.kl();
                    if (bArr11 != null && bArr11.length > 0) {
                        klVar3.parseFrom(bArr11);
                    }
                    this.f34431u = klVar3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i57 = 0; i57 < size12; i57++) {
                    byte[] bArr12 = (byte[]) j49.get(i57);
                    bw5.bp bpVar3 = new bw5.bp();
                    if (bArr12 != null && bArr12.length > 0) {
                        bpVar3.parseFrom(bArr12);
                    }
                    this.f34432v = bpVar3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                this.f34433w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i58 = 0; i58 < size13; i58++) {
                    byte[] bArr13 = (byte[]) j57.get(i58);
                    bw5.go goVar3 = new bw5.go();
                    if (bArr13 != null && bArr13.length > 0) {
                        goVar3.parseFrom(bArr13);
                    }
                    this.f34434x = goVar3;
                }
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j58 = aVar2.j(intValue);
                int size14 = j58.size();
                for (int i59 = 0; i59 < size14; i59++) {
                    byte[] bArr14 = (byte[]) j58.get(i59);
                    bw5.wr wrVar3 = new bw5.wr();
                    if (bArr14 != null && bArr14.length > 0) {
                        wrVar3.parseFrom(bArr14);
                    }
                    this.f34435y = wrVar3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j59 = aVar2.j(intValue);
                int size15 = j59.size();
                for (int i66 = 0; i66 < size15; i66++) {
                    byte[] bArr15 = (byte[]) j59.get(i66);
                    bw5.nm nmVar3 = new bw5.nm();
                    if (bArr15 != null && bArr15.length > 0) {
                        nmVar3.parseFrom(bArr15);
                    }
                    this.f34436z = nmVar3;
                }
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j66 = aVar2.j(intValue);
                int size16 = j66.size();
                for (int i67 = 0; i67 < size16; i67++) {
                    byte[] bArr16 = (byte[]) j66.get(i67);
                    bw5.ko koVar3 = new bw5.ko();
                    if (bArr16 != null && bArr16.length > 0) {
                        koVar3.parseFrom(bArr16);
                    }
                    this.A = koVar3;
                }
                zArr[21] = true;
                return 0;
            default:
                return -1;
        }
    }
}
