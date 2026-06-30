package bw5;

/* loaded from: classes2.dex */
public class yg extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f35474d;

    /* renamed from: e, reason: collision with root package name */
    public float f35475e;

    /* renamed from: f, reason: collision with root package name */
    public float f35476f;

    /* renamed from: g, reason: collision with root package name */
    public float f35477g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f35478h = new boolean[5];

    static {
        new bw5.yg();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yg parseFrom(byte[] bArr) {
        return (bw5.yg) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yg)) {
            return false;
        }
        bw5.yg ygVar = (bw5.yg) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f35474d), java.lang.Float.valueOf(ygVar.f35474d)) && n51.f.a(java.lang.Float.valueOf(this.f35475e), java.lang.Float.valueOf(ygVar.f35475e)) && n51.f.a(java.lang.Float.valueOf(this.f35476f), java.lang.Float.valueOf(ygVar.f35476f)) && n51.f.a(java.lang.Float.valueOf(this.f35477g), java.lang.Float.valueOf(ygVar.f35477g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yg();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35478h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f35474d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f35475e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f35476f);
            }
            if (zArr[4]) {
                fVar.d(4, this.f35477g);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f35474d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f35475e);
            }
            if (zArr[3]) {
                d17 += b36.f.d(3, this.f35476f);
            }
            return zArr[4] ? d17 + b36.f.d(4, this.f35477g) : d17;
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
            this.f35474d = aVar2.f(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35475e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f35476f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f35477g = aVar2.f(intValue);
        zArr[4] = true;
        return 0;
    }
}
