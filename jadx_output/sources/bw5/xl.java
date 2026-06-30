package bw5;

/* loaded from: classes2.dex */
public class xl extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f35180d;

    /* renamed from: e, reason: collision with root package name */
    public int f35181e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35182f = new boolean[3];

    static {
        new bw5.xl();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xl parseFrom(byte[] bArr) {
        return (bw5.xl) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xl)) {
            return false;
        }
        bw5.xl xlVar = (bw5.xl) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f35180d), java.lang.Boolean.valueOf(xlVar.f35180d)) && n51.f.a(java.lang.Integer.valueOf(this.f35181e), java.lang.Integer.valueOf(xlVar.f35181e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xl();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35182f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f35180d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f35181e);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f35180d) : 0;
            return zArr[2] ? a17 + b36.f.e(2, this.f35181e) : a17;
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
            this.f35180d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f35181e = aVar2.g(intValue);
        zArr[2] = true;
        return 0;
    }
}
