package bw5;

/* loaded from: classes2.dex */
public class xz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35286d;

    /* renamed from: f, reason: collision with root package name */
    public int f35288f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f35287e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f35289g = new boolean[4];

    static {
        new bw5.xz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xz parseFrom(byte[] bArr) {
        return (bw5.xz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xz)) {
            return false;
        }
        bw5.xz xzVar = (bw5.xz) fVar;
        return n51.f.a(this.f35286d, xzVar.f35286d) && n51.f.a(this.f35287e, xzVar.f35287e) && n51.f.a(java.lang.Integer.valueOf(this.f35288f), java.lang.Integer.valueOf(xzVar.f35288f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f35287e;
        boolean[] zArr = this.f35289g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35286d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f35288f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f35286d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            return zArr[3] ? g17 + b36.f.e(3, this.f35288f) : g17;
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
            this.f35286d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f35288f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.yz yzVar = new bw5.yz();
            if (bArr != null && bArr.length > 0) {
                yzVar.parseFrom(bArr);
            }
            linkedList.add(yzVar);
        }
        zArr[2] = true;
        return 0;
    }
}
