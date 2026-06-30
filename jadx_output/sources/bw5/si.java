package bw5;

/* loaded from: classes2.dex */
public class si extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32992d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32993e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32994f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32995g;

    /* renamed from: h, reason: collision with root package name */
    public double f32996h;

    /* renamed from: n, reason: collision with root package name */
    public bw5.ri f32999n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f33000o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f33002q;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f32997i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f32998m = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f33001p = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f33003r = new boolean[12];

    static {
        new bw5.si();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.si parseFrom(byte[] bArr) {
        return (bw5.si) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.si)) {
            return false;
        }
        bw5.si siVar = (bw5.si) fVar;
        return n51.f.a(this.f32992d, siVar.f32992d) && n51.f.a(this.f32993e, siVar.f32993e) && n51.f.a(this.f32994f, siVar.f32994f) && n51.f.a(this.f32995g, siVar.f32995g) && n51.f.a(java.lang.Double.valueOf(this.f32996h), java.lang.Double.valueOf(siVar.f32996h)) && n51.f.a(this.f32997i, siVar.f32997i) && n51.f.a(this.f32998m, siVar.f32998m) && n51.f.a(this.f32999n, siVar.f32999n) && n51.f.a(this.f33000o, siVar.f33000o) && n51.f.a(this.f33001p, siVar.f33001p) && n51.f.a(this.f33002q, siVar.f33002q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.si();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f33001p;
        java.util.LinkedList linkedList2 = this.f32998m;
        java.util.LinkedList linkedList3 = this.f32997i;
        boolean[] zArr = this.f33003r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32992d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f32993e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f32994f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f32995g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.c(5, this.f32996h);
            }
            fVar.g(6, 1, linkedList3);
            fVar.g(7, 1, linkedList2);
            bw5.ri riVar = this.f32999n;
            if (riVar != null && zArr[8]) {
                fVar.i(8, riVar.computeSize());
                this.f32999n.writeFields(fVar);
            }
            java.lang.String str5 = this.f33000o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            fVar.g(10, 1, linkedList);
            java.lang.String str6 = this.f33002q;
            if (str6 == null || !zArr[11]) {
                return 0;
            }
            fVar.j(11, str6);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f32992d;
            int j17 = (str7 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str7);
            java.lang.String str8 = this.f32993e;
            if (str8 != null && zArr[2]) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f32994f;
            if (str9 != null && zArr[3]) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f32995g;
            if (str10 != null && zArr[4]) {
                j17 += b36.f.j(4, str10);
            }
            if (zArr[5]) {
                j17 += b36.f.c(5, this.f32996h);
            }
            int g17 = j17 + b36.f.g(6, 1, linkedList3) + b36.f.g(7, 1, linkedList2);
            bw5.ri riVar2 = this.f32999n;
            if (riVar2 != null && zArr[8]) {
                g17 += b36.f.i(8, riVar2.computeSize());
            }
            java.lang.String str11 = this.f33000o;
            if (str11 != null && zArr[9]) {
                g17 += b36.f.j(9, str11);
            }
            int g18 = g17 + b36.f.g(10, 1, linkedList);
            java.lang.String str12 = this.f33002q;
            return (str12 == null || !zArr[11]) ? g18 : g18 + b36.f.j(11, str12);
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
                this.f32992d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32993e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32994f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32995g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32996h = aVar2.e(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                linkedList3.add(aVar2.k(intValue));
                zArr[6] = true;
                return 0;
            case 7:
                linkedList2.add(aVar2.k(intValue));
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.ri riVar3 = new bw5.ri();
                    if (bArr != null && bArr.length > 0) {
                        riVar3.parseFrom(bArr);
                    }
                    this.f32999n = riVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f33000o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                linkedList.add(aVar2.k(intValue));
                zArr[10] = true;
                return 0;
            case 11:
                this.f33002q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
