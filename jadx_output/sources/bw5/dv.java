package bw5;

/* loaded from: classes8.dex */
public class dv extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final bw5.dv f26624i = new bw5.dv();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26625d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26626e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f26627f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f26628g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f26629h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dv)) {
            return false;
        }
        bw5.dv dvVar = (bw5.dv) fVar;
        return n51.f.a(this.f26625d, dvVar.f26625d) && n51.f.a(this.f26626e, dvVar.f26626e) && n51.f.a(this.f26627f, dvVar.f26627f) && n51.f.a(this.f26628g, dvVar.f26628g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.dv();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f26628g;
        java.util.LinkedList linkedList2 = this.f26627f;
        boolean[] zArr = this.f26629h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26625d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26626e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList2);
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f26625d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f26626e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            return i18 + b36.f.g(3, 1, linkedList2) + b36.f.g(4, 1, linkedList);
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
        if (intValue == 1) {
            this.f26625d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f26626e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            linkedList2.add(aVar2.k(intValue));
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        linkedList.add(aVar2.k(intValue));
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.dv) super.parseFrom(bArr);
    }
}
