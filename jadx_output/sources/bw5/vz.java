package bw5;

/* loaded from: classes2.dex */
public class vz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f34529d;

    /* renamed from: e, reason: collision with root package name */
    public int f34530e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.xz f34531f;

    /* renamed from: g, reason: collision with root package name */
    public int f34532g;

    /* renamed from: h, reason: collision with root package name */
    public int f34533h;

    /* renamed from: i, reason: collision with root package name */
    public int f34534i;

    /* renamed from: m, reason: collision with root package name */
    public int f34535m;

    /* renamed from: n, reason: collision with root package name */
    public int f34536n;

    /* renamed from: o, reason: collision with root package name */
    public int f34537o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f34538p;

    /* renamed from: q, reason: collision with root package name */
    public long f34539q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f34540r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f34541s = new boolean[13];

    static {
        new bw5.vz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vz parseFrom(byte[] bArr) {
        return (bw5.vz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vz)) {
            return false;
        }
        bw5.vz vzVar = (bw5.vz) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f34529d), java.lang.Long.valueOf(vzVar.f34529d)) && n51.f.a(java.lang.Integer.valueOf(this.f34530e), java.lang.Integer.valueOf(vzVar.f34530e)) && n51.f.a(this.f34531f, vzVar.f34531f) && n51.f.a(java.lang.Integer.valueOf(this.f34532g), java.lang.Integer.valueOf(vzVar.f34532g)) && n51.f.a(java.lang.Integer.valueOf(this.f34533h), java.lang.Integer.valueOf(vzVar.f34533h)) && n51.f.a(java.lang.Integer.valueOf(this.f34534i), java.lang.Integer.valueOf(vzVar.f34534i)) && n51.f.a(java.lang.Integer.valueOf(this.f34535m), java.lang.Integer.valueOf(vzVar.f34535m)) && n51.f.a(java.lang.Integer.valueOf(this.f34536n), java.lang.Integer.valueOf(vzVar.f34536n)) && n51.f.a(java.lang.Integer.valueOf(this.f34537o), java.lang.Integer.valueOf(vzVar.f34537o)) && n51.f.a(this.f34538p, vzVar.f34538p) && n51.f.a(java.lang.Long.valueOf(this.f34539q), java.lang.Long.valueOf(vzVar.f34539q)) && n51.f.a(java.lang.Boolean.valueOf(this.f34540r), java.lang.Boolean.valueOf(vzVar.f34540r));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34541s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f34529d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34530e);
            }
            bw5.xz xzVar = this.f34531f;
            if (xzVar != null && zArr[3]) {
                fVar.i(3, xzVar.computeSize());
                this.f34531f.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34532g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f34533h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f34534i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f34535m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f34536n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f34537o);
            }
            java.lang.String str = this.f34538p;
            if (str != null && zArr[10]) {
                fVar.j(10, str);
            }
            if (zArr[11]) {
                fVar.h(11, this.f34539q);
            }
            if (zArr[12]) {
                fVar.a(12, this.f34540r);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f34529d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f34530e);
            }
            bw5.xz xzVar2 = this.f34531f;
            if (xzVar2 != null && zArr[3]) {
                h17 += b36.f.i(3, xzVar2.computeSize());
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f34532g);
            }
            if (zArr[5]) {
                h17 += b36.f.e(5, this.f34533h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f34534i);
            }
            if (zArr[7]) {
                h17 += b36.f.e(7, this.f34535m);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f34536n);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f34537o);
            }
            java.lang.String str2 = this.f34538p;
            if (str2 != null && zArr[10]) {
                h17 += b36.f.j(10, str2);
            }
            if (zArr[11]) {
                h17 += b36.f.h(11, this.f34539q);
            }
            return zArr[12] ? h17 + b36.f.a(12, this.f34540r) : h17;
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
                this.f34529d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34530e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.xz xzVar3 = new bw5.xz();
                    if (bArr != null && bArr.length > 0) {
                        xzVar3.parseFrom(bArr);
                    }
                    this.f34531f = xzVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f34532g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34533h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34534i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34535m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f34536n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34537o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f34538p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f34539q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f34540r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
