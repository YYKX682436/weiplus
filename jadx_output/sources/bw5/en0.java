package bw5;

/* loaded from: classes2.dex */
public class en0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f26963d;

    /* renamed from: e, reason: collision with root package name */
    public double f26964e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26965f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26966g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f26967h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f26968i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f26969m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f26970n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f26971o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f26972p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f26973q = new boolean[11];

    static {
        new bw5.en0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.en0 parseFrom(byte[] bArr) {
        return (bw5.en0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.en0)) {
            return false;
        }
        bw5.en0 en0Var = (bw5.en0) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f26963d), java.lang.Double.valueOf(en0Var.f26963d)) && n51.f.a(java.lang.Double.valueOf(this.f26964e), java.lang.Double.valueOf(en0Var.f26964e)) && n51.f.a(this.f26965f, en0Var.f26965f) && n51.f.a(this.f26966g, en0Var.f26966g) && n51.f.a(this.f26967h, en0Var.f26967h) && n51.f.a(this.f26968i, en0Var.f26968i) && n51.f.a(this.f26969m, en0Var.f26969m) && n51.f.a(this.f26970n, en0Var.f26970n) && n51.f.a(this.f26971o, en0Var.f26971o) && n51.f.a(this.f26972p, en0Var.f26972p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.en0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26973q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.c(1, this.f26963d);
            }
            if (zArr[2]) {
                fVar.c(2, this.f26964e);
            }
            java.lang.String str = this.f26965f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f26966g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f26967h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f26968i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f26969m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f26970n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f26971o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f26972p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = zArr[1] ? 0 + b36.f.c(1, this.f26963d) : 0;
            if (zArr[2]) {
                c17 += b36.f.c(2, this.f26964e);
            }
            java.lang.String str9 = this.f26965f;
            if (str9 != null && zArr[3]) {
                c17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f26966g;
            if (str10 != null && zArr[4]) {
                c17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f26967h;
            if (str11 != null && zArr[5]) {
                c17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f26968i;
            if (str12 != null && zArr[6]) {
                c17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f26969m;
            if (str13 != null && zArr[7]) {
                c17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f26970n;
            if (str14 != null && zArr[8]) {
                c17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f26971o;
            if (str15 != null && zArr[9]) {
                c17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f26972p;
            return (str16 == null || !zArr[10]) ? c17 : c17 + b36.f.j(10, str16);
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
                this.f26963d = aVar2.e(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26964e = aVar2.e(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26965f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26966g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26967h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26968i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26969m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26970n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f26971o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f26972p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
