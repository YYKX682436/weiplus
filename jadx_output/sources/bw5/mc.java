package bw5;

/* loaded from: classes2.dex */
public class mc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f30160d;

    /* renamed from: e, reason: collision with root package name */
    public int f30161e;

    /* renamed from: g, reason: collision with root package name */
    public long f30163g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f30162f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f30164h = new boolean[21];

    static {
        new bw5.mc();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mc parseFrom(byte[] bArr) {
        return (bw5.mc) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mc)) {
            return false;
        }
        bw5.mc mcVar = (bw5.mc) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f30160d), java.lang.Integer.valueOf(mcVar.f30160d)) && n51.f.a(java.lang.Integer.valueOf(this.f30161e), java.lang.Integer.valueOf(mcVar.f30161e)) && n51.f.a(this.f30162f, mcVar.f30162f) && n51.f.a(java.lang.Long.valueOf(this.f30163g), java.lang.Long.valueOf(mcVar.f30163g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mc();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30162f;
        boolean[] zArr = this.f30164h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f30160d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f30161e);
            }
            fVar.g(3, 8, linkedList);
            if (zArr[20]) {
                fVar.h(20, this.f30163g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f30160d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f30161e);
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList);
            return zArr[20] ? g17 + b36.f.h(20, this.f30163g) : g17;
        }
        if (i17 == 2) {
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
        if (intValue == 1) {
            this.f30160d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30161e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 20) {
                return -1;
            }
            this.f30163g = aVar2.i(intValue);
            zArr[20] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.fh fhVar = new bw5.fh();
            if (bArr != null && bArr.length > 0) {
                fhVar.parseFrom(bArr);
            }
            linkedList.add(fhVar);
        }
        zArr[3] = true;
        return 0;
    }
}
