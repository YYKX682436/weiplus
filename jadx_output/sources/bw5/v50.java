package bw5;

/* loaded from: classes2.dex */
public class v50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34156d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34157e;

    /* renamed from: g, reason: collision with root package name */
    public int f34159g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f34158f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f34160h = new boolean[5];

    static {
        new bw5.v50();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.v50 parseFrom(byte[] bArr) {
        return (bw5.v50) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v50)) {
            return false;
        }
        bw5.v50 v50Var = (bw5.v50) fVar;
        return n51.f.a(this.f34156d, v50Var.f34156d) && n51.f.a(this.f34157e, v50Var.f34157e) && n51.f.a(this.f34158f, v50Var.f34158f) && n51.f.a(java.lang.Integer.valueOf(this.f34159g), java.lang.Integer.valueOf(v50Var.f34159g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.v50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34158f;
        boolean[] zArr = this.f34160h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34156d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f34157e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList);
            if (zArr[4]) {
                fVar.e(4, this.f34159g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f34156d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f34157e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 1, linkedList);
            return zArr[4] ? g17 + b36.f.e(4, this.f34159g) : g17;
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
            this.f34156d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34157e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            linkedList.add(aVar2.k(intValue));
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f34159g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
