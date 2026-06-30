package bw5;

/* loaded from: classes4.dex */
public class v80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34212d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34213e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34215g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f34216h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f34214f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f34217i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f34218m = new boolean[7];

    static {
        new bw5.v80();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.v80 parseFrom(byte[] bArr) {
        return (bw5.v80) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v80)) {
            return false;
        }
        bw5.v80 v80Var = (bw5.v80) fVar;
        return n51.f.a(this.f34212d, v80Var.f34212d) && n51.f.a(this.f34213e, v80Var.f34213e) && n51.f.a(this.f34214f, v80Var.f34214f) && n51.f.a(this.f34215g, v80Var.f34215g) && n51.f.a(this.f34216h, v80Var.f34216h) && n51.f.a(this.f34217i, v80Var.f34217i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.v80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34217i;
        java.util.LinkedList linkedList2 = this.f34214f;
        int i18 = 0;
        boolean[] zArr = this.f34218m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34212d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f34213e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList2);
            java.lang.String str3 = this.f34215g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f34216h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            fVar.g(6, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f34212d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f34213e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList2);
            java.lang.String str7 = this.f34215g;
            if (str7 != null && zArr[4]) {
                g17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f34216h;
            if (str8 != null && zArr[5]) {
                g17 += b36.f.j(5, str8);
            }
            return g17 + b36.f.g(6, 1, linkedList);
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
                this.f34212d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34213e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.u80 u80Var = new bw5.u80();
                    if (bArr != null && bArr.length > 0) {
                        u80Var.parseFrom(bArr);
                    }
                    linkedList2.add(u80Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f34215g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34216h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                linkedList.add(aVar2.k(intValue));
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
