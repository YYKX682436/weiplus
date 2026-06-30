package bw5;

/* loaded from: classes2.dex */
public class ow extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ae f31394d;

    /* renamed from: e, reason: collision with root package name */
    public long f31395e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.yr f31396f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31397g = new boolean[4];

    static {
        new bw5.ow();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ow parseFrom(byte[] bArr) {
        return (bw5.ow) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ow)) {
            return false;
        }
        bw5.ow owVar = (bw5.ow) fVar;
        return n51.f.a(this.f31394d, owVar.f31394d) && n51.f.a(java.lang.Long.valueOf(this.f31395e), java.lang.Long.valueOf(owVar.f31395e)) && n51.f.a(this.f31396f, owVar.f31396f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ow();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31397g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ae aeVar = this.f31394d;
            if (aeVar != null && zArr[1]) {
                fVar.i(1, aeVar.computeSize());
                this.f31394d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f31395e);
            }
            bw5.yr yrVar = this.f31396f;
            if (yrVar != null && zArr[3]) {
                fVar.i(3, yrVar.computeSize());
                this.f31396f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ae aeVar2 = this.f31394d;
            if (aeVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, aeVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f31395e);
            }
            bw5.yr yrVar2 = this.f31396f;
            return (yrVar2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, yrVar2.computeSize());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.ae aeVar3 = new bw5.ae();
                if (bArr != null && bArr.length > 0) {
                    aeVar3.parseFrom(bArr);
                }
                this.f31394d = aeVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31395e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.yr yrVar3 = new bw5.yr();
            if (bArr2 != null && bArr2.length > 0) {
                yrVar3.parseFrom(bArr2);
            }
            this.f31396f = yrVar3;
        }
        zArr[3] = true;
        return 0;
    }
}
