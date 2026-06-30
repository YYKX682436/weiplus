package bw5;

/* loaded from: classes4.dex */
public class j2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28768d;

    /* renamed from: e, reason: collision with root package name */
    public int f28769e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f28770f = new boolean[3];

    static {
        new bw5.j2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.j2 parseFrom(byte[] bArr) {
        return (bw5.j2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j2)) {
            return false;
        }
        bw5.j2 j2Var = (bw5.j2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28768d), java.lang.Integer.valueOf(j2Var.f28768d)) && n51.f.a(java.lang.Integer.valueOf(this.f28769e), java.lang.Integer.valueOf(j2Var.f28769e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.j2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28770f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28768d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f28769e);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28768d) : 0;
            return zArr[2] ? e17 + b36.f.e(2, this.f28769e) : e17;
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
            this.f28768d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f28769e = aVar2.g(intValue);
        zArr[2] = true;
        return 0;
    }
}
