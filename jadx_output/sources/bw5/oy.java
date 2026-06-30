package bw5;

/* loaded from: classes2.dex */
public class oy extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31402d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31403e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f31405g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f31407i;

    /* renamed from: p, reason: collision with root package name */
    public int f31411p;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f31404f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f31406h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f31408m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f31409n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f31410o = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f31412q = new boolean[11];

    static {
        new bw5.oy();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.oy parseFrom(byte[] bArr) {
        return (bw5.oy) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oy)) {
            return false;
        }
        bw5.oy oyVar = (bw5.oy) fVar;
        return n51.f.a(this.f31402d, oyVar.f31402d) && n51.f.a(this.f31403e, oyVar.f31403e) && n51.f.a(this.f31404f, oyVar.f31404f) && n51.f.a(this.f31405g, oyVar.f31405g) && n51.f.a(this.f31406h, oyVar.f31406h) && n51.f.a(this.f31407i, oyVar.f31407i) && n51.f.a(this.f31408m, oyVar.f31408m) && n51.f.a(this.f31409n, oyVar.f31409n) && n51.f.a(this.f31410o, oyVar.f31410o) && n51.f.a(java.lang.Integer.valueOf(this.f31411p), java.lang.Integer.valueOf(oyVar.f31411p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.oy();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f31410o;
        java.util.LinkedList linkedList2 = this.f31409n;
        java.util.LinkedList linkedList3 = this.f31408m;
        java.util.LinkedList linkedList4 = this.f31406h;
        java.util.LinkedList linkedList5 = this.f31404f;
        int i18 = 0;
        boolean[] zArr = this.f31412q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31402d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f31403e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList5);
            java.lang.String str3 = this.f31405g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            fVar.g(5, 1, linkedList4);
            java.lang.String str4 = this.f31407i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            fVar.g(7, 1, linkedList3);
            fVar.g(8, 1, linkedList2);
            fVar.g(9, 1, linkedList);
            if (zArr[10]) {
                fVar.e(10, this.f31411p);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f31402d;
            if (str5 != null && zArr[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            java.lang.String str6 = this.f31403e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            int g17 = i18 + b36.f.g(3, 1, linkedList5);
            java.lang.String str7 = this.f31405g;
            if (str7 != null && zArr[4]) {
                g17 += b36.f.j(4, str7);
            }
            int g18 = g17 + b36.f.g(5, 1, linkedList4);
            java.lang.String str8 = this.f31407i;
            if (str8 != null && zArr[6]) {
                g18 += b36.f.j(6, str8);
            }
            int g19 = g18 + b36.f.g(7, 1, linkedList3) + b36.f.g(8, 1, linkedList2) + b36.f.g(9, 1, linkedList);
            return zArr[10] ? g19 + b36.f.e(10, this.f31411p) : g19;
        }
        if (i17 == 2) {
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
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
                this.f31402d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31403e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                linkedList5.add(aVar2.k(intValue));
                zArr[3] = true;
                return 0;
            case 4:
                this.f31405g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                linkedList4.add(aVar2.k(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f31407i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                linkedList3.add(aVar2.k(intValue));
                zArr[7] = true;
                return 0;
            case 8:
                linkedList2.add(aVar2.k(intValue));
                zArr[8] = true;
                return 0;
            case 9:
                linkedList.add(aVar2.k(intValue));
                zArr[9] = true;
                return 0;
            case 10:
                this.f31411p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
