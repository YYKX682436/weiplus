package bw5;

/* loaded from: classes2.dex */
public class p40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31462d;

    /* renamed from: e, reason: collision with root package name */
    public int f31463e;

    /* renamed from: f, reason: collision with root package name */
    public int f31464f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31465g = new boolean[4];

    static {
        new bw5.p40();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.p40 parseFrom(byte[] bArr) {
        return (bw5.p40) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p40)) {
            return false;
        }
        bw5.p40 p40Var = (bw5.p40) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31462d), java.lang.Integer.valueOf(p40Var.f31462d)) && n51.f.a(java.lang.Integer.valueOf(this.f31463e), java.lang.Integer.valueOf(p40Var.f31463e)) && n51.f.a(java.lang.Integer.valueOf(this.f31464f), java.lang.Integer.valueOf(p40Var.f31464f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.p40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31465g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31462d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f31463e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f31464f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f31462d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f31463e);
            }
            return zArr[3] ? e17 + b36.f.e(3, this.f31464f) : e17;
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
            this.f31462d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31463e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f31464f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
