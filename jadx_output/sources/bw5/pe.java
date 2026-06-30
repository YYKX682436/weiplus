package bw5;

/* loaded from: classes2.dex */
public class pe extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f31588d;

    /* renamed from: e, reason: collision with root package name */
    public float f31589e;

    /* renamed from: f, reason: collision with root package name */
    public float f31590f;

    /* renamed from: g, reason: collision with root package name */
    public float f31591g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f31592h = new boolean[5];

    static {
        new bw5.pe();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pe parseFrom(byte[] bArr) {
        return (bw5.pe) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pe)) {
            return false;
        }
        bw5.pe peVar = (bw5.pe) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f31588d), java.lang.Float.valueOf(peVar.f31588d)) && n51.f.a(java.lang.Float.valueOf(this.f31589e), java.lang.Float.valueOf(peVar.f31589e)) && n51.f.a(java.lang.Float.valueOf(this.f31590f), java.lang.Float.valueOf(peVar.f31590f)) && n51.f.a(java.lang.Float.valueOf(this.f31591g), java.lang.Float.valueOf(peVar.f31591g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pe();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31592h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f31588d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f31589e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f31590f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f31591g);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f31588d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f31589e);
            }
            if (zArr[3]) {
                d17 += b36.f.d(3, this.f31590f);
            }
            return zArr[4] ? d17 + b36.f.d(4, this.f31591g) : d17;
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
            this.f31588d = aVar2.f(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31589e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f31590f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f31591g = aVar2.f(intValue);
        zArr[4] = true;
        return 0;
    }
}
