package bw5;

/* loaded from: classes2.dex */
public class u3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33715d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33716e;

    /* renamed from: f, reason: collision with root package name */
    public int f33717f;

    /* renamed from: g, reason: collision with root package name */
    public int f33718g;

    /* renamed from: h, reason: collision with root package name */
    public int f33719h;

    /* renamed from: i, reason: collision with root package name */
    public int f33720i;

    /* renamed from: m, reason: collision with root package name */
    public int f33721m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f33722n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f33723o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f33724p;

    /* renamed from: q, reason: collision with root package name */
    public long f33725q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f33726r = new boolean[12];

    static {
        new bw5.u3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.u3 parseFrom(byte[] bArr) {
        return (bw5.u3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u3)) {
            return false;
        }
        bw5.u3 u3Var = (bw5.u3) fVar;
        return n51.f.a(this.f33715d, u3Var.f33715d) && n51.f.a(this.f33716e, u3Var.f33716e) && n51.f.a(java.lang.Integer.valueOf(this.f33717f), java.lang.Integer.valueOf(u3Var.f33717f)) && n51.f.a(java.lang.Integer.valueOf(this.f33718g), java.lang.Integer.valueOf(u3Var.f33718g)) && n51.f.a(java.lang.Integer.valueOf(this.f33719h), java.lang.Integer.valueOf(u3Var.f33719h)) && n51.f.a(java.lang.Integer.valueOf(this.f33720i), java.lang.Integer.valueOf(u3Var.f33720i)) && n51.f.a(java.lang.Integer.valueOf(this.f33721m), java.lang.Integer.valueOf(u3Var.f33721m)) && n51.f.a(this.f33722n, u3Var.f33722n) && n51.f.a(this.f33723o, u3Var.f33723o) && n51.f.a(this.f33724p, u3Var.f33724p) && n51.f.a(java.lang.Long.valueOf(this.f33725q), java.lang.Long.valueOf(u3Var.f33725q));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.u3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33726r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33715d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f33716e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33717f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f33718g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f33719h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f33720i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f33721m);
            }
            java.lang.String str3 = this.f33722n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f33723o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f33724p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            if (zArr[11]) {
                fVar.h(11, this.f33725q);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f33715d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f33716e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f33717f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f33718g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f33719h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f33720i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f33721m);
            }
            java.lang.String str8 = this.f33722n;
            if (str8 != null && zArr[8]) {
                i18 += b36.f.j(8, str8);
            }
            java.lang.String str9 = this.f33723o;
            if (str9 != null && zArr[9]) {
                i18 += b36.f.j(9, str9);
            }
            java.lang.String str10 = this.f33724p;
            if (str10 != null && zArr[10]) {
                i18 += b36.f.j(10, str10);
            }
            return zArr[11] ? i18 + b36.f.h(11, this.f33725q) : i18;
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
                this.f33715d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33716e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33717f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33718g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33719h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33720i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33721m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33722n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33723o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f33724p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f33725q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
