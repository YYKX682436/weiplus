package bw5;

/* loaded from: classes2.dex */
public class sk extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f33030d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33031e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f33032f = new boolean[3];

    static {
        new bw5.sk();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sk parseFrom(byte[] bArr) {
        return (bw5.sk) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sk)) {
            return false;
        }
        bw5.sk skVar = (bw5.sk) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f33030d), java.lang.Boolean.valueOf(skVar.f33030d)) && n51.f.a(this.f33031e, skVar.f33031e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sk();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33032f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f33030d);
            }
            java.lang.String str = this.f33031e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f33030d) : 0;
            java.lang.String str2 = this.f33031e;
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
            this.f33030d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f33031e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
