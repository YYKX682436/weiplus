package bw5;

/* loaded from: classes2.dex */
public class ig0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28577d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.rr f28578e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.qr f28579f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.sp f28580g;

    /* renamed from: h, reason: collision with root package name */
    public int f28581h;

    /* renamed from: i, reason: collision with root package name */
    public int f28582i;

    /* renamed from: m, reason: collision with root package name */
    public int f28583m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f28584n = new boolean[8];

    static {
        new bw5.ig0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ig0 parseFrom(byte[] bArr) {
        return (bw5.ig0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ig0)) {
            return false;
        }
        bw5.ig0 ig0Var = (bw5.ig0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28577d), java.lang.Integer.valueOf(ig0Var.f28577d)) && n51.f.a(this.f28578e, ig0Var.f28578e) && n51.f.a(this.f28579f, ig0Var.f28579f) && n51.f.a(this.f28580g, ig0Var.f28580g) && n51.f.a(java.lang.Integer.valueOf(this.f28581h), java.lang.Integer.valueOf(ig0Var.f28581h)) && n51.f.a(java.lang.Integer.valueOf(this.f28582i), java.lang.Integer.valueOf(ig0Var.f28582i)) && n51.f.a(java.lang.Integer.valueOf(this.f28583m), java.lang.Integer.valueOf(ig0Var.f28583m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ig0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28584n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28577d);
            }
            bw5.rr rrVar = this.f28578e;
            if (rrVar != null && zArr[2]) {
                fVar.i(2, rrVar.computeSize());
                this.f28578e.writeFields(fVar);
            }
            bw5.qr qrVar = this.f28579f;
            if (qrVar != null && zArr[3]) {
                fVar.i(3, qrVar.computeSize());
                this.f28579f.writeFields(fVar);
            }
            bw5.sp spVar = this.f28580g;
            if (spVar != null && zArr[4]) {
                fVar.i(4, spVar.computeSize());
                this.f28580g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f28581h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f28582i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f28583m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28577d) : 0;
            bw5.rr rrVar2 = this.f28578e;
            if (rrVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, rrVar2.computeSize());
            }
            bw5.qr qrVar2 = this.f28579f;
            if (qrVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, qrVar2.computeSize());
            }
            bw5.sp spVar2 = this.f28580g;
            if (spVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, spVar2.computeSize());
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f28581h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f28582i);
            }
            return zArr[7] ? e17 + b36.f.e(7, this.f28583m) : e17;
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
                this.f28577d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.rr rrVar3 = new bw5.rr();
                    if (bArr != null && bArr.length > 0) {
                        rrVar3.parseFrom(bArr);
                    }
                    this.f28578e = rrVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.qr qrVar3 = new bw5.qr();
                    if (bArr2 != null && bArr2.length > 0) {
                        qrVar3.parseFrom(bArr2);
                    }
                    this.f28579f = qrVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.sp spVar3 = new bw5.sp();
                    if (bArr3 != null && bArr3.length > 0) {
                        spVar3.parseFrom(bArr3);
                    }
                    this.f28580g = spVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f28581h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28582i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f28583m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
