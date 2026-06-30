package bw5;

/* loaded from: classes8.dex */
public class kc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f29345d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29346e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f29347f = new boolean[3];

    static {
        new bw5.kc0();
    }

    public java.lang.String b() {
        return this.f29347f[2] ? this.f29346e : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.kc0 parseFrom(byte[] bArr) {
        return (bw5.kc0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kc0)) {
            return false;
        }
        bw5.kc0 kc0Var = (bw5.kc0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29345d), java.lang.Integer.valueOf(kc0Var.f29345d)) && n51.f.a(this.f29346e, kc0Var.f29346e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.kc0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29347f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29345d);
            }
            java.lang.String str = this.f29346e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f29345d) : 0;
            java.lang.String str2 = this.f29346e;
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
            this.f29345d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f29346e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
