package bw5;

/* loaded from: classes2.dex */
public class pv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31848d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31849e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31850f;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f31853i;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f31851g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f31852h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f31854m = new boolean[7];

    static {
        new bw5.pv();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pv parseFrom(byte[] bArr) {
        return (bw5.pv) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pv)) {
            return false;
        }
        bw5.pv pvVar = (bw5.pv) fVar;
        return n51.f.a(this.f31848d, pvVar.f31848d) && n51.f.a(this.f31849e, pvVar.f31849e) && n51.f.a(this.f31850f, pvVar.f31850f) && n51.f.a(this.f31851g, pvVar.f31851g) && n51.f.a(this.f31852h, pvVar.f31852h) && n51.f.a(this.f31853i, pvVar.f31853i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pv();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f31852h;
        java.util.LinkedList linkedList2 = this.f31851g;
        int i18 = 0;
        boolean[] zArr = this.f31854m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31848d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f31849e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f31850f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, linkedList2);
            fVar.g(5, 1, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f31853i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f31848d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f31849e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f31850f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            int g17 = i18 + b36.f.g(4, 1, linkedList2) + b36.f.g(5, 1, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f31853i;
            return (gVar2 == null || !zArr[6]) ? g17 : g17 + b36.f.b(6, gVar2);
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
        switch (intValue) {
            case 1:
                this.f31848d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31849e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31850f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                linkedList2.add(aVar2.k(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                linkedList.add(aVar2.k(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f31853i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
