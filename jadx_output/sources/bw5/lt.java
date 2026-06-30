package bw5;

/* loaded from: classes2.dex */
public class lt extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.nr f29957d;

    /* renamed from: e, reason: collision with root package name */
    public int f29958e;

    /* renamed from: f, reason: collision with root package name */
    public int f29959f;

    /* renamed from: g, reason: collision with root package name */
    public int f29960g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.or f29961h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f29962i = new boolean[6];

    static {
        new bw5.lt();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lt parseFrom(byte[] bArr) {
        return (bw5.lt) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lt)) {
            return false;
        }
        bw5.lt ltVar = (bw5.lt) fVar;
        return n51.f.a(this.f29957d, ltVar.f29957d) && n51.f.a(java.lang.Integer.valueOf(this.f29958e), java.lang.Integer.valueOf(ltVar.f29958e)) && n51.f.a(java.lang.Integer.valueOf(this.f29959f), java.lang.Integer.valueOf(ltVar.f29959f)) && n51.f.a(java.lang.Integer.valueOf(this.f29960g), java.lang.Integer.valueOf(ltVar.f29960g)) && n51.f.a(this.f29961h, ltVar.f29961h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lt();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29962i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.nr nrVar = this.f29957d;
            if (nrVar != null && zArr[1]) {
                fVar.i(1, nrVar.computeSize());
                this.f29957d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29958e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f29959f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f29960g);
            }
            bw5.or orVar = this.f29961h;
            if (orVar != null && zArr[5]) {
                fVar.i(5, orVar.computeSize());
                this.f29961h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.nr nrVar2 = this.f29957d;
            if (nrVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, nrVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f29958e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f29959f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f29960g);
            }
            bw5.or orVar2 = this.f29961h;
            return (orVar2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, orVar2.computeSize());
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.nr nrVar3 = new bw5.nr();
                if (bArr != null && bArr.length > 0) {
                    nrVar3.parseFrom(bArr);
                }
                this.f29957d = nrVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29958e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f29959f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f29960g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.or orVar3 = new bw5.or();
            if (bArr2 != null && bArr2.length > 0) {
                orVar3.parseFrom(bArr2);
            }
            this.f29961h = orVar3;
        }
        zArr[5] = true;
        return 0;
    }
}
