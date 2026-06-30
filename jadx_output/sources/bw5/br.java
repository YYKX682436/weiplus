package bw5;

/* loaded from: classes8.dex */
public class br extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25797d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f25798e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f25799f = new boolean[3];

    static {
        new bw5.br();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.br)) {
            return false;
        }
        bw5.br brVar = (bw5.br) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25797d), java.lang.Integer.valueOf(brVar.f25797d)) && n51.f.a(this.f25798e, brVar.f25798e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.br();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25799f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25797d);
            }
            fVar.g(2, 3, this.f25798e);
            return 0;
        }
        if (i17 == 1) {
            return (zArr[1] ? 0 + b36.f.e(1, this.f25797d) : 0) + b36.f.g(2, 3, this.f25798e);
        }
        if (i17 == 2) {
            this.f25798e.clear();
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
            this.f25797d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f25798e.add(java.lang.Long.valueOf(aVar2.i(intValue)));
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.br) super.parseFrom(bArr);
    }
}
