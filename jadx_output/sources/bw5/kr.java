package bw5;

/* loaded from: classes2.dex */
public class kr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f29495d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29496e;

    /* renamed from: g, reason: collision with root package name */
    public bw5.fr f29498g;

    /* renamed from: h, reason: collision with root package name */
    public int f29499h;

    /* renamed from: i, reason: collision with root package name */
    public int f29500i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.mr f29501m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f29502n;

    /* renamed from: o, reason: collision with root package name */
    public int f29503o;

    /* renamed from: p, reason: collision with root package name */
    public int f29504p;

    /* renamed from: q, reason: collision with root package name */
    public int f29505q;

    /* renamed from: r, reason: collision with root package name */
    public int f29506r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f29507s;

    /* renamed from: t, reason: collision with root package name */
    public long f29508t;

    /* renamed from: u, reason: collision with root package name */
    public int f29509u;

    /* renamed from: v, reason: collision with root package name */
    public int f29510v;

    /* renamed from: w, reason: collision with root package name */
    public int f29511w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f29512x;

    /* renamed from: y, reason: collision with root package name */
    public bw5.rf0 f29513y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.pj f29514z;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f29497f = new java.util.LinkedList();
    public final boolean[] A = new boolean[21];

    static {
        new bw5.kr();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kr parseFrom(byte[] bArr) {
        return (bw5.kr) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kr)) {
            return false;
        }
        bw5.kr krVar = (bw5.kr) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f29495d), java.lang.Long.valueOf(krVar.f29495d)) && n51.f.a(this.f29496e, krVar.f29496e) && n51.f.a(this.f29497f, krVar.f29497f) && n51.f.a(this.f29498g, krVar.f29498g) && n51.f.a(java.lang.Integer.valueOf(this.f29499h), java.lang.Integer.valueOf(krVar.f29499h)) && n51.f.a(java.lang.Integer.valueOf(this.f29500i), java.lang.Integer.valueOf(krVar.f29500i)) && n51.f.a(this.f29501m, krVar.f29501m) && n51.f.a(this.f29502n, krVar.f29502n) && n51.f.a(java.lang.Integer.valueOf(this.f29503o), java.lang.Integer.valueOf(krVar.f29503o)) && n51.f.a(java.lang.Integer.valueOf(this.f29504p), java.lang.Integer.valueOf(krVar.f29504p)) && n51.f.a(java.lang.Integer.valueOf(this.f29505q), java.lang.Integer.valueOf(krVar.f29505q)) && n51.f.a(java.lang.Integer.valueOf(this.f29506r), java.lang.Integer.valueOf(krVar.f29506r)) && n51.f.a(this.f29507s, krVar.f29507s) && n51.f.a(java.lang.Long.valueOf(this.f29508t), java.lang.Long.valueOf(krVar.f29508t)) && n51.f.a(java.lang.Integer.valueOf(this.f29509u), java.lang.Integer.valueOf(krVar.f29509u)) && n51.f.a(java.lang.Integer.valueOf(this.f29510v), java.lang.Integer.valueOf(krVar.f29510v)) && n51.f.a(java.lang.Integer.valueOf(this.f29511w), java.lang.Integer.valueOf(krVar.f29511w)) && n51.f.a(this.f29512x, krVar.f29512x) && n51.f.a(this.f29513y, krVar.f29513y) && n51.f.a(this.f29514z, krVar.f29514z);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.kr();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f29495d);
            }
            java.lang.String str = this.f29496e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f29497f);
            bw5.fr frVar = this.f29498g;
            if (frVar != null && zArr[4]) {
                fVar.i(4, frVar.computeSize());
                this.f29498g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f29499h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f29500i);
            }
            bw5.mr mrVar = this.f29501m;
            if (mrVar != null && zArr[7]) {
                fVar.i(7, mrVar.computeSize());
                this.f29501m.writeFields(fVar);
            }
            java.lang.String str2 = this.f29502n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            if (zArr[9]) {
                fVar.e(9, this.f29503o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f29504p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f29505q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f29506r);
            }
            java.lang.String str3 = this.f29507s;
            if (str3 != null && zArr[13]) {
                fVar.j(13, str3);
            }
            if (zArr[14]) {
                fVar.h(14, this.f29508t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f29509u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f29510v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f29511w);
            }
            java.lang.String str4 = this.f29512x;
            if (str4 != null && zArr[18]) {
                fVar.j(18, str4);
            }
            bw5.rf0 rf0Var = this.f29513y;
            if (rf0Var != null && zArr[19]) {
                fVar.i(19, rf0Var.computeSize());
                this.f29513y.writeFields(fVar);
            }
            bw5.pj pjVar = this.f29514z;
            if (pjVar != null && zArr[20]) {
                fVar.i(20, pjVar.computeSize());
                this.f29514z.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f29495d) + 0 : 0;
            java.lang.String str5 = this.f29496e;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            int g17 = h17 + b36.f.g(3, 8, this.f29497f);
            bw5.fr frVar2 = this.f29498g;
            if (frVar2 != null && zArr[4]) {
                g17 += b36.f.i(4, frVar2.computeSize());
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f29499h);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f29500i);
            }
            bw5.mr mrVar2 = this.f29501m;
            if (mrVar2 != null && zArr[7]) {
                g17 += b36.f.i(7, mrVar2.computeSize());
            }
            java.lang.String str6 = this.f29502n;
            if (str6 != null && zArr[8]) {
                g17 += b36.f.j(8, str6);
            }
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f29503o);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f29504p);
            }
            if (zArr[11]) {
                g17 += b36.f.e(11, this.f29505q);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f29506r);
            }
            java.lang.String str7 = this.f29507s;
            if (str7 != null && zArr[13]) {
                g17 += b36.f.j(13, str7);
            }
            if (zArr[14]) {
                g17 += b36.f.h(14, this.f29508t);
            }
            if (zArr[15]) {
                g17 += b36.f.e(15, this.f29509u);
            }
            if (zArr[16]) {
                g17 += b36.f.e(16, this.f29510v);
            }
            if (zArr[17]) {
                g17 += b36.f.e(17, this.f29511w);
            }
            java.lang.String str8 = this.f29512x;
            if (str8 != null && zArr[18]) {
                g17 += b36.f.j(18, str8);
            }
            bw5.rf0 rf0Var2 = this.f29513y;
            if (rf0Var2 != null && zArr[19]) {
                g17 += b36.f.i(19, rf0Var2.computeSize());
            }
            bw5.pj pjVar2 = this.f29514z;
            return (pjVar2 == null || !zArr[20]) ? g17 : g17 + b36.f.i(20, pjVar2.computeSize());
        }
        if (i17 == 2) {
            this.f29497f.clear();
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
                this.f29495d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29496e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.dw dwVar = new bw5.dw();
                    if (bArr != null && bArr.length > 0) {
                        dwVar.parseFrom(bArr);
                    }
                    this.f29497f.add(dwVar);
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.fr frVar3 = new bw5.fr();
                    if (bArr2 != null && bArr2.length > 0) {
                        frVar3.parseFrom(bArr2);
                    }
                    this.f29498g = frVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f29499h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29500i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.mr mrVar3 = new bw5.mr();
                    if (bArr3 != null && bArr3.length > 0) {
                        mrVar3.parseFrom(bArr3);
                    }
                    this.f29501m = mrVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f29502n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f29503o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f29504p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f29505q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f29506r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f29507s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f29508t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f29509u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f29510v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f29511w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f29512x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.rf0 rf0Var3 = new bw5.rf0();
                    if (bArr4 != null && bArr4.length > 0) {
                        rf0Var3.parseFrom(bArr4);
                    }
                    this.f29513y = rf0Var3;
                }
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.pj pjVar3 = new bw5.pj();
                    if (bArr5 != null && bArr5.length > 0) {
                        pjVar3.parseFrom(bArr5);
                    }
                    this.f29514z = pjVar3;
                }
                zArr[20] = true;
                return 0;
            default:
                return -1;
        }
    }
}
