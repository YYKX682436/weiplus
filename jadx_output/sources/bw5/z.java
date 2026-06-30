package bw5;

/* loaded from: classes11.dex */
public class z extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f35743d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f35744e;

    /* renamed from: f, reason: collision with root package name */
    public int f35745f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.x f35746g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.x f35747h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.y f35748i;

    /* renamed from: m, reason: collision with root package name */
    public int f35749m;

    /* renamed from: n, reason: collision with root package name */
    public long f35750n;

    /* renamed from: o, reason: collision with root package name */
    public int f35751o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f35752p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f35753q = new boolean[16];

    static {
        new bw5.z();
    }

    public bw5.x b() {
        return this.f35753q[9] ? this.f35746g : new bw5.x();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z)) {
            return false;
        }
        bw5.z zVar = (bw5.z) fVar;
        return n51.f.a(this.f35743d, zVar.f35743d) && n51.f.a(java.lang.Boolean.valueOf(this.f35744e), java.lang.Boolean.valueOf(zVar.f35744e)) && n51.f.a(java.lang.Integer.valueOf(this.f35745f), java.lang.Integer.valueOf(zVar.f35745f)) && n51.f.a(this.f35746g, zVar.f35746g) && n51.f.a(this.f35747h, zVar.f35747h) && n51.f.a(this.f35748i, zVar.f35748i) && n51.f.a(java.lang.Integer.valueOf(this.f35749m), java.lang.Integer.valueOf(zVar.f35749m)) && n51.f.a(java.lang.Long.valueOf(this.f35750n), java.lang.Long.valueOf(zVar.f35750n)) && n51.f.a(java.lang.Integer.valueOf(this.f35751o), java.lang.Integer.valueOf(zVar.f35751o)) && n51.f.a(java.lang.Boolean.valueOf(this.f35752p), java.lang.Boolean.valueOf(zVar.f35752p));
    }

    public com.tencent.mm.protobuf.g getData_() {
        return this.f35753q[4] ? this.f35743d : com.tencent.mm.protobuf.g.f192155b;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.z();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35753q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f35743d;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            if (zArr[7]) {
                fVar.a(7, this.f35744e);
            }
            if (zArr[8]) {
                fVar.e(8, this.f35745f);
            }
            bw5.x xVar = this.f35746g;
            if (xVar != null && zArr[9]) {
                fVar.i(9, xVar.computeSize());
                this.f35746g.writeFields(fVar);
            }
            bw5.x xVar2 = this.f35747h;
            if (xVar2 != null && zArr[10]) {
                fVar.i(10, xVar2.computeSize());
                this.f35747h.writeFields(fVar);
            }
            bw5.y yVar = this.f35748i;
            if (yVar != null && zArr[11]) {
                fVar.i(11, yVar.computeSize());
                this.f35748i.writeFields(fVar);
            }
            if (zArr[12]) {
                fVar.e(12, this.f35749m);
            }
            if (zArr[13]) {
                fVar.h(13, this.f35750n);
            }
            if (zArr[14]) {
                fVar.e(14, this.f35751o);
            }
            if (zArr[15]) {
                fVar.a(15, this.f35752p);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.f35743d;
            if (gVar2 != null && zArr[4]) {
                i18 = 0 + b36.f.b(4, gVar2);
            }
            if (zArr[7]) {
                i18 += b36.f.a(7, this.f35744e);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f35745f);
            }
            bw5.x xVar3 = this.f35746g;
            if (xVar3 != null && zArr[9]) {
                i18 += b36.f.i(9, xVar3.computeSize());
            }
            bw5.x xVar4 = this.f35747h;
            if (xVar4 != null && zArr[10]) {
                i18 += b36.f.i(10, xVar4.computeSize());
            }
            bw5.y yVar2 = this.f35748i;
            if (yVar2 != null && zArr[11]) {
                i18 += b36.f.i(11, yVar2.computeSize());
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f35749m);
            }
            if (zArr[13]) {
                i18 += b36.f.h(13, this.f35750n);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f35751o);
            }
            return zArr[15] ? i18 + b36.f.a(15, this.f35752p) : i18;
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
        if (intValue == 4) {
            this.f35743d = aVar2.d(intValue);
            zArr[4] = true;
            return 0;
        }
        switch (intValue) {
            case 7:
                this.f35744e = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f35745f = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.x xVar5 = new bw5.x();
                    if (bArr != null && bArr.length > 0) {
                        xVar5.parseFrom(bArr);
                    }
                    this.f35746g = xVar5;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.x xVar6 = new bw5.x();
                    if (bArr2 != null && bArr2.length > 0) {
                        xVar6.parseFrom(bArr2);
                    }
                    this.f35747h = xVar6;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.y yVar3 = new bw5.y();
                    if (bArr3 != null && bArr3.length > 0) {
                        yVar3.parseFrom(bArr3);
                    }
                    this.f35748i = yVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f35749m = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f35750n = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f35751o = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f35752p = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.z) super.parseFrom(bArr);
    }
}
