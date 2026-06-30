package bw5;

/* loaded from: classes2.dex */
public class cx extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.bx f26237d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26238e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f26239f = new boolean[3];

    static {
        new bw5.cx();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cx parseFrom(byte[] bArr) {
        return (bw5.cx) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cx)) {
            return false;
        }
        bw5.cx cxVar = (bw5.cx) fVar;
        return n51.f.a(this.f26237d, cxVar.f26237d) && n51.f.a(this.f26238e, cxVar.f26238e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.cx();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26239f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.bx bxVar = this.f26237d;
            if (bxVar != null && zArr[1]) {
                fVar.e(1, bxVar.f25860d);
            }
            java.lang.String str = this.f26238e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.bx bxVar2 = this.f26237d;
            if (bxVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, bxVar2.f25860d);
            }
            java.lang.String str2 = this.f26238e;
            return (str2 == null || !zArr[2]) ? i18 : i18 + b36.f.j(2, str2);
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
            int g17 = aVar2.g(intValue);
            this.f26237d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 30000 ? null : bw5.bx.Invalid : bw5.bx.Origin : bw5.bx.English : bw5.bx.Chinese;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f26238e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
