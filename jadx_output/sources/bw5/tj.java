package bw5;

/* loaded from: classes8.dex */
public class tj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f33467d;

    /* renamed from: e, reason: collision with root package name */
    public float f33468e;

    /* renamed from: f, reason: collision with root package name */
    public int f33469f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f33470g = new boolean[4];

    static {
        new bw5.tj();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tj)) {
            return false;
        }
        bw5.tj tjVar = (bw5.tj) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f33467d), java.lang.Float.valueOf(tjVar.f33467d)) && n51.f.a(java.lang.Float.valueOf(this.f33468e), java.lang.Float.valueOf(tjVar.f33468e)) && n51.f.a(java.lang.Integer.valueOf(this.f33469f), java.lang.Integer.valueOf(tjVar.f33469f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tj();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33470g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f33467d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f33468e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33469f);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f33467d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f33468e);
            }
            return zArr[3] ? d17 + b36.f.e(3, this.f33469f) : d17;
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
            this.f33467d = aVar2.f(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33468e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f33469f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.tj) super.parseFrom(bArr);
    }
}
