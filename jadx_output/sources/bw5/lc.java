package bw5;

/* loaded from: classes2.dex */
public class lc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29725d;

    /* renamed from: e, reason: collision with root package name */
    public int f29726e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29727f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ae f29728g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f29729h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f29730i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f29731m;

    /* renamed from: n, reason: collision with root package name */
    public int f29732n;

    /* renamed from: o, reason: collision with root package name */
    public int f29733o;

    /* renamed from: p, reason: collision with root package name */
    public int f29734p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f29735q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f29736r = new boolean[12];

    static {
        new bw5.lc();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lc parseFrom(byte[] bArr) {
        return (bw5.lc) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lc)) {
            return false;
        }
        bw5.lc lcVar = (bw5.lc) fVar;
        return n51.f.a(this.f29725d, lcVar.f29725d) && n51.f.a(java.lang.Integer.valueOf(this.f29726e), java.lang.Integer.valueOf(lcVar.f29726e)) && n51.f.a(this.f29727f, lcVar.f29727f) && n51.f.a(this.f29728g, lcVar.f29728g) && n51.f.a(this.f29729h, lcVar.f29729h) && n51.f.a(this.f29730i, lcVar.f29730i) && n51.f.a(this.f29731m, lcVar.f29731m) && n51.f.a(java.lang.Integer.valueOf(this.f29732n), java.lang.Integer.valueOf(lcVar.f29732n)) && n51.f.a(java.lang.Integer.valueOf(this.f29733o), java.lang.Integer.valueOf(lcVar.f29733o)) && n51.f.a(java.lang.Integer.valueOf(this.f29734p), java.lang.Integer.valueOf(lcVar.f29734p)) && n51.f.a(this.f29735q, lcVar.f29735q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lc();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29736r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29725d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29726e);
            }
            java.lang.String str2 = this.f29727f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.ae aeVar = this.f29728g;
            if (aeVar != null && zArr[4]) {
                fVar.i(4, aeVar.computeSize());
                this.f29728g.writeFields(fVar);
            }
            java.lang.String str3 = this.f29729h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f29730i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f29731m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            if (zArr[8]) {
                fVar.e(8, this.f29732n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f29733o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f29734p);
            }
            java.lang.String str6 = this.f29735q;
            if (str6 != null && zArr[11]) {
                fVar.j(11, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f29725d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f29726e);
            }
            java.lang.String str8 = this.f29727f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            bw5.ae aeVar2 = this.f29728g;
            if (aeVar2 != null && zArr[4]) {
                i18 += b36.f.i(4, aeVar2.computeSize());
            }
            java.lang.String str9 = this.f29729h;
            if (str9 != null && zArr[5]) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f29730i;
            if (str10 != null && zArr[6]) {
                i18 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f29731m;
            if (str11 != null && zArr[7]) {
                i18 += b36.f.j(7, str11);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f29732n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f29733o);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f29734p);
            }
            java.lang.String str12 = this.f29735q;
            return (str12 == null || !zArr[11]) ? i18 : i18 + b36.f.j(11, str12);
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
                this.f29725d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29726e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29727f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ae aeVar3 = new bw5.ae();
                    if (bArr != null && bArr.length > 0) {
                        aeVar3.parseFrom(bArr);
                    }
                    this.f29728g = aeVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f29729h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29730i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29731m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f29732n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f29733o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f29734p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f29735q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
