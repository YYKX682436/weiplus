package bw5;

/* loaded from: classes9.dex */
public class dm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26555d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26556e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26557f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26558g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f26559h;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f26562n;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f26560i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f26561m = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f26563o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f26564p = new boolean[10];

    static {
        new bw5.dm0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dm0 parseFrom(byte[] bArr) {
        return (bw5.dm0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dm0)) {
            return false;
        }
        bw5.dm0 dm0Var = (bw5.dm0) fVar;
        return n51.f.a(this.f26555d, dm0Var.f26555d) && n51.f.a(this.f26556e, dm0Var.f26556e) && n51.f.a(this.f26557f, dm0Var.f26557f) && n51.f.a(this.f26558g, dm0Var.f26558g) && n51.f.a(this.f26559h, dm0Var.f26559h) && n51.f.a(this.f26560i, dm0Var.f26560i) && n51.f.a(this.f26561m, dm0Var.f26561m) && n51.f.a(this.f26562n, dm0Var.f26562n) && n51.f.a(this.f26563o, dm0Var.f26563o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.dm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f26563o;
        java.util.LinkedList linkedList2 = this.f26561m;
        java.util.LinkedList linkedList3 = this.f26560i;
        boolean[] zArr = this.f26564p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26555d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26556e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f26557f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f26558g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f26559h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            fVar.g(6, 8, linkedList3);
            fVar.g(7, 8, linkedList2);
            java.lang.String str6 = this.f26562n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            fVar.g(9, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f26555d;
            int j17 = (str7 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str7);
            java.lang.String str8 = this.f26556e;
            if (str8 != null && zArr[2]) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f26557f;
            if (str9 != null && zArr[3]) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f26558g;
            if (str10 != null && zArr[4]) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f26559h;
            if (str11 != null && zArr[5]) {
                j17 += b36.f.j(5, str11);
            }
            int g17 = j17 + b36.f.g(6, 8, linkedList3) + b36.f.g(7, 8, linkedList2);
            java.lang.String str12 = this.f26562n;
            if (str12 != null && zArr[8]) {
                g17 += b36.f.j(8, str12);
            }
            return g17 + b36.f.g(9, 8, linkedList);
        }
        if (i17 == 2) {
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
                this.f26555d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26556e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26557f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26558g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26559h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.bn0 bn0Var = new bw5.bn0();
                    if (bArr != null && bArr.length > 0) {
                        bn0Var.parseFrom(bArr);
                    }
                    linkedList3.add(bn0Var);
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.bn0 bn0Var2 = new bw5.bn0();
                    if (bArr2 != null && bArr2.length > 0) {
                        bn0Var2.parseFrom(bArr2);
                    }
                    linkedList2.add(bn0Var2);
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f26562n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    bw5.an0 an0Var = new bw5.an0();
                    if (bArr3 != null && bArr3.length > 0) {
                        an0Var.parseFrom(bArr3);
                    }
                    linkedList.add(an0Var);
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
