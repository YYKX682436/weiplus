package bw5;

/* loaded from: classes2.dex */
public class m00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f30030d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30031e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f30032f = new boolean[3];

    static {
        new bw5.m00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m00 parseFrom(byte[] bArr) {
        return (bw5.m00) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.m00)) {
            return false;
        }
        bw5.m00 m00Var = (bw5.m00) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f30030d), java.lang.Integer.valueOf(m00Var.f30030d)) && n51.f.a(this.f30031e, m00Var.f30031e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.m00();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30032f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f30030d);
            }
            java.lang.String str = this.f30031e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f30030d) : 0;
            java.lang.String str2 = this.f30031e;
            return (str2 == null || !zArr[2]) ? e17 : e17 + b36.f.j(2, str2);
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
            this.f30030d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f30031e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
