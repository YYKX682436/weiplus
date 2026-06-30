package bw5;

/* loaded from: classes2.dex */
public class ii0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f28598d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28599e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28600f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f28601g = new boolean[4];

    static {
        new bw5.ii0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ii0 parseFrom(byte[] bArr) {
        return (bw5.ii0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ii0)) {
            return false;
        }
        bw5.ii0 ii0Var = (bw5.ii0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f28598d), java.lang.Boolean.valueOf(ii0Var.f28598d)) && n51.f.a(java.lang.Boolean.valueOf(this.f28599e), java.lang.Boolean.valueOf(ii0Var.f28599e)) && n51.f.a(this.f28600f, ii0Var.f28600f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ii0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28601g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f28598d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f28599e);
            }
            java.lang.String str = this.f28600f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f28598d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f28599e);
            }
            java.lang.String str2 = this.f28600f;
            return (str2 == null || !zArr[3]) ? a17 : a17 + b36.f.j(3, str2);
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
            this.f28598d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28599e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f28600f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
