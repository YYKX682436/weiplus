package bw5;

/* loaded from: classes2.dex */
public class mj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30253d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30254e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30255f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30256g;

    /* renamed from: i, reason: collision with root package name */
    public int f30258i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30259m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f30260n;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f30257h = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f30261o = new boolean[9];

    static {
        new bw5.mj();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mj parseFrom(byte[] bArr) {
        return (bw5.mj) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mj)) {
            return false;
        }
        bw5.mj mjVar = (bw5.mj) fVar;
        return n51.f.a(this.f30253d, mjVar.f30253d) && n51.f.a(this.f30254e, mjVar.f30254e) && n51.f.a(this.f30255f, mjVar.f30255f) && n51.f.a(this.f30256g, mjVar.f30256g) && n51.f.a(this.f30257h, mjVar.f30257h) && n51.f.a(java.lang.Integer.valueOf(this.f30258i), java.lang.Integer.valueOf(mjVar.f30258i)) && n51.f.a(this.f30259m, mjVar.f30259m) && n51.f.a(this.f30260n, mjVar.f30260n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mj();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30257h;
        int i18 = 0;
        boolean[] zArr = this.f30261o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30253d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f30254e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f30255f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f30256g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            fVar.g(5, 1, linkedList);
            if (zArr[6]) {
                fVar.e(6, this.f30258i);
            }
            java.lang.String str5 = this.f30259m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f30260n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f30253d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f30254e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f30255f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f30256g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            int g17 = i18 + b36.f.g(5, 1, linkedList);
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f30258i);
            }
            java.lang.String str11 = this.f30259m;
            if (str11 != null && zArr[7]) {
                g17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f30260n;
            return (str12 == null || !zArr[8]) ? g17 : g17 + b36.f.j(8, str12);
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
                this.f30253d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30254e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30255f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30256g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                linkedList.add(aVar2.k(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f30258i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30259m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30260n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
