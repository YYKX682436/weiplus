package bw5;

/* loaded from: classes2.dex */
public class wj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34742d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34743e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34744f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34745g;

    /* renamed from: i, reason: collision with root package name */
    public int f34747i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.sj f34748m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f34749n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f34750o;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f34746h = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f34751p = new boolean[10];

    static {
        new bw5.wj();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wj parseFrom(byte[] bArr) {
        return (bw5.wj) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wj)) {
            return false;
        }
        bw5.wj wjVar = (bw5.wj) fVar;
        return n51.f.a(this.f34742d, wjVar.f34742d) && n51.f.a(this.f34743e, wjVar.f34743e) && n51.f.a(this.f34744f, wjVar.f34744f) && n51.f.a(this.f34745g, wjVar.f34745g) && n51.f.a(this.f34746h, wjVar.f34746h) && n51.f.a(java.lang.Integer.valueOf(this.f34747i), java.lang.Integer.valueOf(wjVar.f34747i)) && n51.f.a(this.f34748m, wjVar.f34748m) && n51.f.a(this.f34749n, wjVar.f34749n) && n51.f.a(this.f34750o, wjVar.f34750o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wj();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f34746h;
        int i18 = 0;
        boolean[] zArr = this.f34751p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34742d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f34743e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f34744f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f34745g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            fVar.g(5, 8, linkedList);
            if (zArr[6]) {
                fVar.e(6, this.f34747i);
            }
            bw5.sj sjVar = this.f34748m;
            if (sjVar != null && zArr[7]) {
                fVar.i(7, sjVar.computeSize());
                this.f34748m.writeFields(fVar);
            }
            java.lang.String str5 = this.f34749n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f34750o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f34742d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f34743e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f34744f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f34745g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            int g17 = i18 + b36.f.g(5, 8, linkedList);
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f34747i);
            }
            bw5.sj sjVar2 = this.f34748m;
            if (sjVar2 != null && zArr[7]) {
                g17 += b36.f.i(7, sjVar2.computeSize());
            }
            java.lang.String str11 = this.f34749n;
            if (str11 != null && zArr[8]) {
                g17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f34750o;
            return (str12 == null || !zArr[9]) ? g17 : g17 + b36.f.j(9, str12);
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
                this.f34742d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34743e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34744f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34745g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.vj vjVar = new bw5.vj();
                    if (bArr != null && bArr.length > 0) {
                        vjVar.parseFrom(bArr);
                    }
                    linkedList.add(vjVar);
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f34747i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.sj sjVar3 = new bw5.sj();
                    if (bArr2 != null && bArr2.length > 0) {
                        sjVar3.parseFrom(bArr2);
                    }
                    this.f34748m = sjVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f34749n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34750o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
