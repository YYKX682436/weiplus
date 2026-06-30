package bw5;

/* loaded from: classes2.dex */
public class uc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f33842d;

    /* renamed from: e, reason: collision with root package name */
    public float f33843e;

    /* renamed from: f, reason: collision with root package name */
    public float f33844f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f33845g = new boolean[4];

    static {
        new bw5.uc0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.uc0 parseFrom(byte[] bArr) {
        return (bw5.uc0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uc0)) {
            return false;
        }
        bw5.uc0 uc0Var = (bw5.uc0) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f33842d), java.lang.Float.valueOf(uc0Var.f33842d)) && n51.f.a(java.lang.Float.valueOf(this.f33843e), java.lang.Float.valueOf(uc0Var.f33843e)) && n51.f.a(java.lang.Float.valueOf(this.f33844f), java.lang.Float.valueOf(uc0Var.f33844f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.uc0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33845g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f33842d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f33843e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f33844f);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f33842d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f33843e);
            }
            return zArr[3] ? d17 + b36.f.d(3, this.f33844f) : d17;
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
            this.f33842d = aVar2.f(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33843e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f33844f = aVar2.f(intValue);
        zArr[3] = true;
        return 0;
    }
}
