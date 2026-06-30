package bw5;

/* loaded from: classes2.dex */
public class z20 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f35797d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f35798e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35799f = new boolean[3];

    static {
        new bw5.z20();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.z20 parseFrom(byte[] bArr) {
        return (bw5.z20) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z20)) {
            return false;
        }
        bw5.z20 z20Var = (bw5.z20) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f35797d), java.lang.Boolean.valueOf(z20Var.f35797d)) && n51.f.a(this.f35798e, z20Var.f35798e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.z20();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35799f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f35797d);
            }
            com.tencent.mm.protobuf.g gVar = this.f35798e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f35797d) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f35798e;
            return (gVar2 == null || !zArr[2]) ? a17 : a17 + b36.f.b(2, gVar2);
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
            this.f35797d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f35798e = aVar2.d(intValue);
        zArr[2] = true;
        return 0;
    }
}
