package bw5;

/* loaded from: classes8.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.m f27098d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.k f27099e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f27100f = new boolean[3];

    static {
        new bw5.f();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.f)) {
            return false;
        }
        bw5.f fVar2 = (bw5.f) fVar;
        return n51.f.a(this.f27098d, fVar2.f27098d) && n51.f.a(this.f27099e, fVar2.f27099e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.f();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27100f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.m mVar = this.f27098d;
            if (mVar != null && zArr[1]) {
                fVar.e(1, mVar.f30020d);
            }
            bw5.k kVar = this.f27099e;
            if (kVar != null && zArr[2]) {
                fVar.e(2, kVar.f29187d);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.m mVar2 = this.f27098d;
            if (mVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, mVar2.f30020d);
            }
            bw5.k kVar2 = this.f27099e;
            return (kVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.e(2, kVar2.f29187d);
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
            this.f27098d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? null : bw5.m.AIMusicGenerationStatusCreating : bw5.m.AIMusicGenerationStatusFail : bw5.m.AIMusicGenerationStatusFinish : bw5.m.AIMusicGenerationStatusGenerating : bw5.m.AIMusicGenerationStatusIdle;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f27099e = bw5.k.a(aVar2.g(intValue));
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.f) super.parseFrom(bArr);
    }
}
