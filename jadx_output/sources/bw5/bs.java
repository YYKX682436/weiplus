package bw5;

/* loaded from: classes2.dex */
public class bs extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.pj f25813d;

    /* renamed from: e, reason: collision with root package name */
    public long f25814e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25815f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25816g;

    /* renamed from: h, reason: collision with root package name */
    public long f25817h;

    /* renamed from: i, reason: collision with root package name */
    public long f25818i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.pj f25819m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f25821o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25822p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25823q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f25824r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f25825s;

    /* renamed from: t, reason: collision with root package name */
    public int f25826t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25827u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.hh0 f25828v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.as f25829w;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f25820n = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f25830x = new boolean[19];

    static {
        new bw5.bs();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bs parseFrom(byte[] bArr) {
        return (bw5.bs) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bs)) {
            return false;
        }
        bw5.bs bsVar = (bw5.bs) fVar;
        return n51.f.a(this.f25813d, bsVar.f25813d) && n51.f.a(java.lang.Long.valueOf(this.f25814e), java.lang.Long.valueOf(bsVar.f25814e)) && n51.f.a(this.f25815f, bsVar.f25815f) && n51.f.a(this.f25816g, bsVar.f25816g) && n51.f.a(java.lang.Long.valueOf(this.f25817h), java.lang.Long.valueOf(bsVar.f25817h)) && n51.f.a(java.lang.Long.valueOf(this.f25818i), java.lang.Long.valueOf(bsVar.f25818i)) && n51.f.a(this.f25819m, bsVar.f25819m) && n51.f.a(this.f25820n, bsVar.f25820n) && n51.f.a(this.f25821o, bsVar.f25821o) && n51.f.a(java.lang.Boolean.valueOf(this.f25822p), java.lang.Boolean.valueOf(bsVar.f25822p)) && n51.f.a(java.lang.Boolean.valueOf(this.f25823q), java.lang.Boolean.valueOf(bsVar.f25823q)) && n51.f.a(java.lang.Boolean.valueOf(this.f25824r), java.lang.Boolean.valueOf(bsVar.f25824r)) && n51.f.a(java.lang.Boolean.valueOf(this.f25825s), java.lang.Boolean.valueOf(bsVar.f25825s)) && n51.f.a(java.lang.Integer.valueOf(this.f25826t), java.lang.Integer.valueOf(bsVar.f25826t)) && n51.f.a(java.lang.Boolean.valueOf(this.f25827u), java.lang.Boolean.valueOf(bsVar.f25827u)) && n51.f.a(this.f25828v, bsVar.f25828v) && n51.f.a(this.f25829w, bsVar.f25829w);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bs();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25820n;
        int i18 = 0;
        boolean[] zArr = this.f25830x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.pj pjVar = this.f25813d;
            if (pjVar != null && zArr[1]) {
                fVar.i(1, pjVar.computeSize());
                this.f25813d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f25814e);
            }
            java.lang.String str = this.f25815f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f25816g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.h(5, this.f25817h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f25818i);
            }
            bw5.pj pjVar2 = this.f25819m;
            if (pjVar2 != null && zArr[7]) {
                fVar.i(7, pjVar2.computeSize());
                this.f25819m.writeFields(fVar);
            }
            fVar.g(8, 8, linkedList);
            java.lang.String str3 = this.f25821o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.a(10, this.f25822p);
            }
            if (zArr[11]) {
                fVar.a(11, this.f25823q);
            }
            if (zArr[12]) {
                fVar.a(12, this.f25824r);
            }
            if (zArr[13]) {
                fVar.a(13, this.f25825s);
            }
            if (zArr[15]) {
                fVar.e(15, this.f25826t);
            }
            if (zArr[16]) {
                fVar.a(16, this.f25827u);
            }
            bw5.hh0 hh0Var = this.f25828v;
            if (hh0Var != null && zArr[17]) {
                fVar.i(17, hh0Var.computeSize());
                this.f25828v.writeFields(fVar);
            }
            bw5.as asVar = this.f25829w;
            if (asVar != null && zArr[18]) {
                fVar.i(18, asVar.computeSize());
                this.f25829w.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.pj pjVar3 = this.f25813d;
            if (pjVar3 != null && zArr[1]) {
                i18 = b36.f.i(1, pjVar3.computeSize()) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f25814e);
            }
            java.lang.String str4 = this.f25815f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f25816g;
            if (str5 != null && zArr[4]) {
                i18 += b36.f.j(4, str5);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f25817h);
            }
            if (zArr[6]) {
                i18 += b36.f.h(6, this.f25818i);
            }
            bw5.pj pjVar4 = this.f25819m;
            if (pjVar4 != null && zArr[7]) {
                i18 += b36.f.i(7, pjVar4.computeSize());
            }
            int g17 = i18 + b36.f.g(8, 8, linkedList);
            java.lang.String str6 = this.f25821o;
            if (str6 != null && zArr[9]) {
                g17 += b36.f.j(9, str6);
            }
            if (zArr[10]) {
                g17 += b36.f.a(10, this.f25822p);
            }
            if (zArr[11]) {
                g17 += b36.f.a(11, this.f25823q);
            }
            if (zArr[12]) {
                g17 += b36.f.a(12, this.f25824r);
            }
            if (zArr[13]) {
                g17 += b36.f.a(13, this.f25825s);
            }
            if (zArr[15]) {
                g17 += b36.f.e(15, this.f25826t);
            }
            if (zArr[16]) {
                g17 += b36.f.a(16, this.f25827u);
            }
            bw5.hh0 hh0Var2 = this.f25828v;
            if (hh0Var2 != null && zArr[17]) {
                g17 += b36.f.i(17, hh0Var2.computeSize());
            }
            bw5.as asVar2 = this.f25829w;
            return (asVar2 == null || !zArr[18]) ? g17 : g17 + b36.f.i(18, asVar2.computeSize());
        }
        if (i17 == 2) {
            linkedList.clear();
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.pj pjVar5 = new bw5.pj();
                    if (bArr != null && bArr.length > 0) {
                        pjVar5.parseFrom(bArr);
                    }
                    this.f25813d = pjVar5;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f25814e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25815f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25816g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25817h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25818i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.pj pjVar6 = new bw5.pj();
                    if (bArr2 != null && bArr2.length > 0) {
                        pjVar6.parseFrom(bArr2);
                    }
                    this.f25819m = pjVar6;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.pj pjVar7 = new bw5.pj();
                    if (bArr3 != null && bArr3.length > 0) {
                        pjVar7.parseFrom(bArr3);
                    }
                    linkedList.add(pjVar7);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f25821o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f25822p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f25823q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f25824r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f25825s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
            default:
                return -1;
            case 15:
                this.f25826t = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f25827u = aVar2.c(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.hh0 hh0Var3 = new bw5.hh0();
                    if (bArr4 != null && bArr4.length > 0) {
                        hh0Var3.parseFrom(bArr4);
                    }
                    this.f25828v = hh0Var3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.as asVar3 = new bw5.as();
                    if (bArr5 != null && bArr5.length > 0) {
                        asVar3.parseFrom(bArr5);
                    }
                    this.f25829w = asVar3;
                }
                zArr[18] = true;
                return 0;
        }
    }
}
