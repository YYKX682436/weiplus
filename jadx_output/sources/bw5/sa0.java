package bw5;

/* loaded from: classes2.dex */
public class sa0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f32871d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32872e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f32873f = new boolean[3];

    static {
        new bw5.sa0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sa0 parseFrom(byte[] bArr) {
        return (bw5.sa0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sa0)) {
            return false;
        }
        bw5.sa0 sa0Var = (bw5.sa0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f32871d), java.lang.Boolean.valueOf(sa0Var.f32871d)) && n51.f.a(this.f32872e, sa0Var.f32872e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sa0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32873f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f32871d);
            }
            java.lang.String str = this.f32872e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f32871d) : 0;
            java.lang.String str2 = this.f32872e;
            return (str2 == null || !zArr[2]) ? a17 : a17 + b36.f.j(2, str2);
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
            this.f32871d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f32872e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
