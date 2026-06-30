package bw5;

/* loaded from: classes2.dex */
public class ho extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28292d;

    /* renamed from: e, reason: collision with root package name */
    public double f28293e;

    /* renamed from: f, reason: collision with root package name */
    public int f28294f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f28295g = new boolean[4];

    static {
        new bw5.ho();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ho parseFrom(byte[] bArr) {
        return (bw5.ho) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ho)) {
            return false;
        }
        bw5.ho hoVar = (bw5.ho) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28292d), java.lang.Integer.valueOf(hoVar.f28292d)) && n51.f.a(java.lang.Double.valueOf(this.f28293e), java.lang.Double.valueOf(hoVar.f28293e)) && n51.f.a(java.lang.Integer.valueOf(this.f28294f), java.lang.Integer.valueOf(hoVar.f28294f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ho();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28295g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28292d);
            }
            if (zArr[2]) {
                fVar.c(2, this.f28293e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f28294f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28292d) : 0;
            if (zArr[2]) {
                e17 += b36.f.c(2, this.f28293e);
            }
            return zArr[3] ? e17 + b36.f.e(3, this.f28294f) : e17;
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
            this.f28292d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28293e = aVar2.e(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f28294f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
