package bw5;

/* loaded from: classes2.dex */
public class og0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31091d;

    /* renamed from: e, reason: collision with root package name */
    public long f31092e;

    /* renamed from: f, reason: collision with root package name */
    public long f31093f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31094g = new boolean[4];

    static {
        new bw5.og0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.og0 parseFrom(byte[] bArr) {
        return (bw5.og0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.og0)) {
            return false;
        }
        bw5.og0 og0Var = (bw5.og0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31091d), java.lang.Integer.valueOf(og0Var.f31091d)) && n51.f.a(java.lang.Long.valueOf(this.f31092e), java.lang.Long.valueOf(og0Var.f31092e)) && n51.f.a(java.lang.Long.valueOf(this.f31093f), java.lang.Long.valueOf(og0Var.f31093f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.og0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31094g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31091d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f31092e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f31093f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f31091d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f31092e);
            }
            return zArr[3] ? e17 + b36.f.h(3, this.f31093f) : e17;
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
            this.f31091d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31092e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f31093f = aVar2.i(intValue);
        zArr[3] = true;
        return 0;
    }
}
