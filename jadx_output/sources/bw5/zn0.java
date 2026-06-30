package bw5;

/* loaded from: classes2.dex */
public class zn0 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f36068e;

    /* renamed from: f, reason: collision with root package name */
    public int f36069f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f36067d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f36070g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f36071h = new boolean[5];

    static {
        new bw5.zn0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zn0 parseFrom(byte[] bArr) {
        return (bw5.zn0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zn0)) {
            return false;
        }
        bw5.zn0 zn0Var = (bw5.zn0) fVar;
        return n51.f.a(this.f36067d, zn0Var.f36067d) && n51.f.a(java.lang.Integer.valueOf(this.f36068e), java.lang.Integer.valueOf(zn0Var.f36068e)) && n51.f.a(java.lang.Integer.valueOf(this.f36069f), java.lang.Integer.valueOf(zn0Var.f36069f)) && n51.f.a(this.f36070g, zn0Var.f36070g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f36070g;
        java.util.LinkedList linkedList2 = this.f36067d;
        boolean[] zArr = this.f36071h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            if (zArr[2]) {
                fVar.e(2, this.f36068e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f36069f);
            }
            fVar.g(4, 3, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            if (zArr[2]) {
                g17 += b36.f.e(2, this.f36068e);
            }
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f36069f);
            }
            return g17 + b36.f.g(4, 3, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
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
                this.f36068e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f36069f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            linkedList.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.yr yrVar = new bw5.yr();
            if (bArr != null && bArr.length > 0) {
                yrVar.parseFrom(bArr);
            }
            linkedList2.add(yrVar);
        }
        zArr[1] = true;
        return 0;
    }
}
