package bw5;

/* loaded from: classes2.dex */
public class nu extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f30816d;

    /* renamed from: e, reason: collision with root package name */
    public float f30817e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.qu f30818f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ou f30819g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.pu f30820h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30821i;

    /* renamed from: m, reason: collision with root package name */
    public int f30822m;

    /* renamed from: n, reason: collision with root package name */
    public int f30823n;

    /* renamed from: o, reason: collision with root package name */
    public int f30824o;

    /* renamed from: p, reason: collision with root package name */
    public int f30825p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f30826q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f30827r = new boolean[16];

    static {
        new bw5.nu();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nu parseFrom(byte[] bArr) {
        return (bw5.nu) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nu)) {
            return false;
        }
        bw5.nu nuVar = (bw5.nu) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f30816d), java.lang.Long.valueOf(nuVar.f30816d)) && n51.f.a(java.lang.Float.valueOf(this.f30817e), java.lang.Float.valueOf(nuVar.f30817e)) && n51.f.a(this.f30818f, nuVar.f30818f) && n51.f.a(this.f30819g, nuVar.f30819g) && n51.f.a(this.f30820h, nuVar.f30820h) && n51.f.a(java.lang.Boolean.valueOf(this.f30821i), java.lang.Boolean.valueOf(nuVar.f30821i)) && n51.f.a(java.lang.Integer.valueOf(this.f30822m), java.lang.Integer.valueOf(nuVar.f30822m)) && n51.f.a(java.lang.Integer.valueOf(this.f30823n), java.lang.Integer.valueOf(nuVar.f30823n)) && n51.f.a(java.lang.Integer.valueOf(this.f30824o), java.lang.Integer.valueOf(nuVar.f30824o)) && n51.f.a(java.lang.Integer.valueOf(this.f30825p), java.lang.Integer.valueOf(nuVar.f30825p)) && n51.f.a(this.f30826q, nuVar.f30826q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.nu();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30826q;
        boolean[] zArr = this.f30827r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f30816d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f30817e);
            }
            bw5.qu quVar = this.f30818f;
            if (quVar != null && zArr[3]) {
                fVar.i(3, quVar.computeSize());
                this.f30818f.writeFields(fVar);
            }
            bw5.ou ouVar = this.f30819g;
            if (ouVar != null && zArr[4]) {
                fVar.i(4, ouVar.computeSize());
                this.f30819g.writeFields(fVar);
            }
            bw5.pu puVar = this.f30820h;
            if (puVar != null && zArr[5]) {
                fVar.i(5, puVar.computeSize());
                this.f30820h.writeFields(fVar);
            }
            if (zArr[10]) {
                fVar.a(10, this.f30821i);
            }
            if (zArr[11]) {
                fVar.e(11, this.f30822m);
            }
            if (zArr[12]) {
                fVar.e(12, this.f30823n);
            }
            if (zArr[13]) {
                fVar.e(13, this.f30824o);
            }
            if (zArr[14]) {
                fVar.e(14, this.f30825p);
            }
            fVar.g(15, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f30816d) : 0;
            if (zArr[2]) {
                h17 += b36.f.d(2, this.f30817e);
            }
            bw5.qu quVar2 = this.f30818f;
            if (quVar2 != null && zArr[3]) {
                h17 += b36.f.i(3, quVar2.computeSize());
            }
            bw5.ou ouVar2 = this.f30819g;
            if (ouVar2 != null && zArr[4]) {
                h17 += b36.f.i(4, ouVar2.computeSize());
            }
            bw5.pu puVar2 = this.f30820h;
            if (puVar2 != null && zArr[5]) {
                h17 += b36.f.i(5, puVar2.computeSize());
            }
            if (zArr[10]) {
                h17 += b36.f.a(10, this.f30821i);
            }
            if (zArr[11]) {
                h17 += b36.f.e(11, this.f30822m);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f30823n);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f30824o);
            }
            if (zArr[14]) {
                h17 += b36.f.e(14, this.f30825p);
            }
            return h17 + b36.f.g(15, 8, linkedList);
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
        if (intValue == 1) {
            this.f30816d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30817e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.qu quVar3 = new bw5.qu();
                if (bArr != null && bArr.length > 0) {
                    quVar3.parseFrom(bArr);
                }
                this.f30818f = quVar3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.ou ouVar3 = new bw5.ou();
                if (bArr2 != null && bArr2.length > 0) {
                    ouVar3.parseFrom(bArr2);
                }
                this.f30819g = ouVar3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                bw5.pu puVar3 = new bw5.pu();
                if (bArr3 != null && bArr3.length > 0) {
                    puVar3.parseFrom(bArr3);
                }
                this.f30820h = puVar3;
            }
            zArr[5] = true;
            return 0;
        }
        switch (intValue) {
            case 10:
                this.f30821i = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f30822m = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f30823n = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f30824o = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f30825p = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.rp rpVar = new bw5.rp();
                    if (bArr4 != null && bArr4.length > 0) {
                        rpVar.parseFrom(bArr4);
                    }
                    linkedList.add(rpVar);
                }
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
