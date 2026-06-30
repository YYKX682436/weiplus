package bw5;

/* loaded from: classes2.dex */
public class nh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30681d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30682e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30683f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30684g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30685h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30686i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30687m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f30688n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f30689o = new boolean[13];

    static {
        new bw5.nh0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nh0 parseFrom(byte[] bArr) {
        return (bw5.nh0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nh0)) {
            return false;
        }
        bw5.nh0 nh0Var = (bw5.nh0) fVar;
        return n51.f.a(this.f30681d, nh0Var.f30681d) && n51.f.a(this.f30682e, nh0Var.f30682e) && n51.f.a(this.f30683f, nh0Var.f30683f) && n51.f.a(this.f30684g, nh0Var.f30684g) && n51.f.a(this.f30685h, nh0Var.f30685h) && n51.f.a(this.f30686i, nh0Var.f30686i) && n51.f.a(this.f30687m, nh0Var.f30687m) && n51.f.a(this.f30688n, nh0Var.f30688n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.nh0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30688n;
        int i18 = 0;
        boolean[] zArr = this.f30689o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30681d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f30682e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f30683f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f30684g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f30685h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f30686i;
            if (str6 != null && zArr[6]) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f30687m;
            if (str7 != null && zArr[7]) {
                fVar.j(7, str7);
            }
            fVar.g(12, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f30681d;
            if (str8 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str8);
            }
            java.lang.String str9 = this.f30682e;
            if (str9 != null && zArr[2]) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f30683f;
            if (str10 != null && zArr[3]) {
                i18 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f30684g;
            if (str11 != null && zArr[4]) {
                i18 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f30685h;
            if (str12 != null && zArr[5]) {
                i18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f30686i;
            if (str13 != null && zArr[6]) {
                i18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f30687m;
            if (str14 != null && zArr[7]) {
                i18 += b36.f.j(7, str14);
            }
            return i18 + b36.f.g(12, 8, linkedList);
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
        if (intValue == 12) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.wh0 wh0Var = new bw5.wh0();
                if (bArr != null && bArr.length > 0) {
                    wh0Var.parseFrom(bArr);
                }
                linkedList.add(wh0Var);
            }
            zArr[12] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f30681d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30682e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30683f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30684g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30685h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30686i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30687m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
