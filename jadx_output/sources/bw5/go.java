package bw5;

/* loaded from: classes2.dex */
public class go extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f27931d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27932e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f27933f = new boolean[3];

    static {
        new bw5.go();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.go parseFrom(byte[] bArr) {
        return (bw5.go) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.go)) {
            return false;
        }
        bw5.go goVar = (bw5.go) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f27931d), java.lang.Long.valueOf(goVar.f27931d)) && n51.f.a(java.lang.Boolean.valueOf(this.f27932e), java.lang.Boolean.valueOf(goVar.f27932e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.go();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27933f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f27931d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f27932e);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f27931d) : 0;
            return zArr[2] ? h17 + b36.f.a(2, this.f27932e) : h17;
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
            this.f27931d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f27932e = aVar2.c(intValue);
        zArr[2] = true;
        return 0;
    }
}
