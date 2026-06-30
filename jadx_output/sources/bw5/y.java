package bw5;

/* loaded from: classes8.dex */
public class y extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f35290d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35291e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35292f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f35293g = new boolean[4];

    static {
        new bw5.y();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.y parseFrom(byte[] bArr) {
        return (bw5.y) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y)) {
            return false;
        }
        bw5.y yVar = (bw5.y) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f35290d), java.lang.Boolean.valueOf(yVar.f35290d)) && n51.f.a(this.f35291e, yVar.f35291e) && n51.f.a(this.f35292f, yVar.f35292f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.y();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35293g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f35290d);
            }
            java.lang.String str = this.f35291e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f35292f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f35290d) : 0;
            java.lang.String str3 = this.f35291e;
            if (str3 != null && zArr[2]) {
                a17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f35292f;
            return (str4 == null || !zArr[3]) ? a17 : a17 + b36.f.j(3, str4);
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
            this.f35290d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35291e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f35292f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
