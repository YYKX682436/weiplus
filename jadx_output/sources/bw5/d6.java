package bw5;

/* loaded from: classes9.dex */
public class d6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f26337d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26338e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f26339f = new boolean[3];

    static {
        new bw5.d6();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.d6)) {
            return false;
        }
        bw5.d6 d6Var = (bw5.d6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f26337d), java.lang.Integer.valueOf(d6Var.f26337d)) && n51.f.a(this.f26338e, d6Var.f26338e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.d6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26339f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f26337d);
            }
            com.tencent.mm.protobuf.g gVar = this.f26338e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f26337d) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f26338e;
            return (gVar2 == null || !zArr[2]) ? e17 : e17 + b36.f.b(2, gVar2);
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
            this.f26337d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f26338e = aVar2.d(intValue);
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.d6) super.parseFrom(bArr);
    }
}
