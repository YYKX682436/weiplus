package bw5;

/* loaded from: classes2.dex */
public class md0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30190d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30191e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30192f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30193g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30194h;

    /* renamed from: i, reason: collision with root package name */
    public int f30195i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f30197n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f30198o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f30199p;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f30196m = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f30200q = new boolean[11];

    static {
        new bw5.md0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.md0 parseFrom(byte[] bArr) {
        return (bw5.md0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.md0)) {
            return false;
        }
        bw5.md0 md0Var = (bw5.md0) fVar;
        return n51.f.a(this.f30190d, md0Var.f30190d) && n51.f.a(this.f30191e, md0Var.f30191e) && n51.f.a(this.f30192f, md0Var.f30192f) && n51.f.a(this.f30193g, md0Var.f30193g) && n51.f.a(this.f30194h, md0Var.f30194h) && n51.f.a(java.lang.Integer.valueOf(this.f30195i), java.lang.Integer.valueOf(md0Var.f30195i)) && n51.f.a(this.f30196m, md0Var.f30196m) && n51.f.a(this.f30197n, md0Var.f30197n) && n51.f.a(this.f30198o, md0Var.f30198o) && n51.f.a(this.f30199p, md0Var.f30199p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.md0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30196m;
        int i18 = 0;
        boolean[] zArr = this.f30200q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30190d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f30191e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f30192f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f30193g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f30194h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f30195i);
            }
            fVar.g(7, 8, linkedList);
            java.lang.String str6 = this.f30197n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f30198o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f30199p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f30190d;
            if (str9 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str9);
            }
            java.lang.String str10 = this.f30191e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f30192f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f30193g;
            if (str12 != null && zArr[4]) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f30194h;
            if (str13 != null && zArr[5]) {
                i18 += b36.f.j(5, str13);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f30195i);
            }
            int g17 = i18 + b36.f.g(7, 8, linkedList);
            java.lang.String str14 = this.f30197n;
            if (str14 != null && zArr[8]) {
                g17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f30198o;
            if (str15 != null && zArr[9]) {
                g17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f30199p;
            return (str16 == null || !zArr[10]) ? g17 : g17 + b36.f.j(10, str16);
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
        switch (intValue) {
            case 1:
                this.f30190d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30191e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30192f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30193g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30194h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30195i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ld0 ld0Var = new bw5.ld0();
                    if (bArr != null && bArr.length > 0) {
                        ld0Var.parseFrom(bArr);
                    }
                    linkedList.add(ld0Var);
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f30197n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30198o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f30199p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
