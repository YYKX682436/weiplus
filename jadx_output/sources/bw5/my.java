package bw5;

/* loaded from: classes2.dex */
public class my extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30410d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30411e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30412f;

    /* renamed from: g, reason: collision with root package name */
    public int f30413g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30414h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30415i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30416m;

    /* renamed from: n, reason: collision with root package name */
    public int f30417n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f30418o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f30419p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.ly f30420q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f30421r = new boolean[12];

    static {
        new bw5.my();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.my parseFrom(byte[] bArr) {
        return (bw5.my) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.my)) {
            return false;
        }
        bw5.my myVar = (bw5.my) fVar;
        return n51.f.a(this.f30410d, myVar.f30410d) && n51.f.a(this.f30411e, myVar.f30411e) && n51.f.a(this.f30412f, myVar.f30412f) && n51.f.a(java.lang.Integer.valueOf(this.f30413g), java.lang.Integer.valueOf(myVar.f30413g)) && n51.f.a(this.f30414h, myVar.f30414h) && n51.f.a(this.f30415i, myVar.f30415i) && n51.f.a(this.f30416m, myVar.f30416m) && n51.f.a(java.lang.Integer.valueOf(this.f30417n), java.lang.Integer.valueOf(myVar.f30417n)) && n51.f.a(this.f30418o, myVar.f30418o) && n51.f.a(this.f30419p, myVar.f30419p) && n51.f.a(this.f30420q, myVar.f30420q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.my();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f30421r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30410d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f30411e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f30412f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f30413g);
            }
            java.lang.String str4 = this.f30414h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f30415i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f30416m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            if (zArr[8]) {
                fVar.e(8, this.f30417n);
            }
            java.lang.String str7 = this.f30418o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f30419p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            bw5.ly lyVar = this.f30420q;
            if (lyVar != null && zArr[11]) {
                fVar.i(11, lyVar.computeSize());
                this.f30420q.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f30410d;
            if (str9 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str9);
            }
            java.lang.String str10 = this.f30411e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f30412f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f30413g);
            }
            java.lang.String str12 = this.f30414h;
            if (str12 != null && zArr[5]) {
                i18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f30415i;
            if (str13 != null && zArr[6]) {
                i18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f30416m;
            if (str14 != null && zArr[7]) {
                i18 += b36.f.j(7, str14);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f30417n);
            }
            java.lang.String str15 = this.f30418o;
            if (str15 != null && zArr[9]) {
                i18 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f30419p;
            if (str16 != null && zArr[10]) {
                i18 += b36.f.j(10, str16);
            }
            bw5.ly lyVar2 = this.f30420q;
            return (lyVar2 == null || !zArr[11]) ? i18 : i18 + b36.f.i(11, lyVar2.computeSize());
        }
        if (i17 == 2) {
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
                this.f30410d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30411e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30412f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30413g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30414h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30415i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30416m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30417n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30418o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f30419p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ly lyVar3 = new bw5.ly();
                    if (bArr != null && bArr.length > 0) {
                        lyVar3.parseFrom(bArr);
                    }
                    this.f30420q = lyVar3;
                }
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
