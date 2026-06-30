package bw5;

/* loaded from: classes7.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.i f28028d;

    /* renamed from: e, reason: collision with root package name */
    public int f28029e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f28030f = new boolean[3];

    static {
        new bw5.h();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.h parseFrom(byte[] bArr) {
        return (bw5.h) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h)) {
            return false;
        }
        bw5.h hVar = (bw5.h) fVar;
        return n51.f.a(this.f28028d, hVar.f28028d) && n51.f.a(java.lang.Integer.valueOf(this.f28029e), java.lang.Integer.valueOf(hVar.f28029e));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.h();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28030f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.i iVar = this.f28028d;
            if (iVar != null && zArr[1]) {
                fVar.e(1, iVar.f28398d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f28029e);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.i iVar2 = this.f28028d;
            if (iVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, iVar2.f28398d);
            }
            return zArr[2] ? i18 + b36.f.e(2, this.f28029e) : i18;
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
            this.f28028d = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.i.AIGenerationBillResultTypeFail : bw5.i.AIGenerationBillResultTypeSuccess : bw5.i.AIGenerationBillResultTypeIdle;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f28029e = aVar2.g(intValue);
        zArr[2] = true;
        return 0;
    }
}
