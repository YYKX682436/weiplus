package bw5;

/* loaded from: classes2.dex */
public class li0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29795d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.dr f29796e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f29797f = new boolean[3];

    static {
        new bw5.li0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.li0)) {
            return false;
        }
        bw5.li0 li0Var = (bw5.li0) fVar;
        return n51.f.a(this.f29795d, li0Var.f29795d) && n51.f.a(this.f29796e, li0Var.f29796e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.li0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29797f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29795d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.dr drVar = this.f29796e;
            if (drVar != null && zArr[2]) {
                fVar.e(2, drVar.f26593d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f29795d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.dr drVar2 = this.f29796e;
            return (drVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.e(2, drVar2.f26593d);
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
            this.f29795d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f29796e = g17 != 0 ? g17 != 1 ? null : bw5.dr.FinderMpFeedTypeNewPublished : bw5.dr.FinderMpFeedTypeEntry;
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.li0) super.parseFrom(bArr);
    }
}
