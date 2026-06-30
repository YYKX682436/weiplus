package bw5;

/* loaded from: classes2.dex */
public class vk0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ro f34387d;

    /* renamed from: e, reason: collision with root package name */
    public int f34388e;

    /* renamed from: f, reason: collision with root package name */
    public int f34389f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f34390g = new boolean[4];

    static {
        new bw5.vk0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vk0 parseFrom(byte[] bArr) {
        return (bw5.vk0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vk0)) {
            return false;
        }
        bw5.vk0 vk0Var = (bw5.vk0) fVar;
        return n51.f.a(this.f34387d, vk0Var.f34387d) && n51.f.a(java.lang.Integer.valueOf(this.f34388e), java.lang.Integer.valueOf(vk0Var.f34388e)) && n51.f.a(java.lang.Integer.valueOf(this.f34389f), java.lang.Integer.valueOf(vk0Var.f34389f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vk0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34390g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ro roVar = this.f34387d;
            if (roVar != null && zArr[1]) {
                fVar.i(1, roVar.computeSize());
                this.f34387d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34388e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34389f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ro roVar2 = this.f34387d;
            if (roVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, roVar2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f34388e);
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f34389f) : i18;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f34388e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f34389f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ro roVar3 = new bw5.ro();
            if (bArr != null && bArr.length > 0) {
                roVar3.parseFrom(bArr);
            }
            this.f34387d = roVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
