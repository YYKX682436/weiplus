package bw5;

/* loaded from: classes10.dex */
public class gb extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.kb f27776d;

    /* renamed from: e, reason: collision with root package name */
    public long f27777e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f27778f = new boolean[3];

    static {
        new bw5.gb();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gb)) {
            return false;
        }
        bw5.gb gbVar = (bw5.gb) fVar;
        return n51.f.a(this.f27776d, gbVar.f27776d) && n51.f.a(java.lang.Long.valueOf(this.f27777e), java.lang.Long.valueOf(gbVar.f27777e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gb();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27778f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.kb kbVar = this.f27776d;
            if (kbVar != null && zArr[1]) {
                fVar.e(1, kbVar.f29328d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f27777e);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.kb kbVar2 = this.f27776d;
            if (kbVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, kbVar2.f29328d);
            }
            return zArr[2] ? i18 + b36.f.h(2, this.f27777e) : i18;
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
            this.f27776d = g17 != 1 ? g17 != 2 ? g17 != 3 ? null : bw5.kb.Media_All : bw5.kb.Media_Video_Only : bw5.kb.Media_Image_Only;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f27777e = aVar2.i(intValue);
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.gb) super.parseFrom(bArr);
    }
}
