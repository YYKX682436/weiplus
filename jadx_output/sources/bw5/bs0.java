package bw5;

/* loaded from: classes2.dex */
public class bs0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25831d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25832e;

    /* renamed from: f, reason: collision with root package name */
    public int f25833f;

    /* renamed from: g, reason: collision with root package name */
    public int f25834g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f25835h;

    /* renamed from: i, reason: collision with root package name */
    public int f25836i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f25837m;

    /* renamed from: n, reason: collision with root package name */
    public int f25838n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f25839o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f25840p = new boolean[10];

    static {
        new bw5.bs0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bs0 parseFrom(byte[] bArr) {
        return (bw5.bs0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bs0)) {
            return false;
        }
        bw5.bs0 bs0Var = (bw5.bs0) fVar;
        return n51.f.a(this.f25831d, bs0Var.f25831d) && n51.f.a(this.f25832e, bs0Var.f25832e) && n51.f.a(java.lang.Integer.valueOf(this.f25833f), java.lang.Integer.valueOf(bs0Var.f25833f)) && n51.f.a(java.lang.Integer.valueOf(this.f25834g), java.lang.Integer.valueOf(bs0Var.f25834g)) && n51.f.a(this.f25835h, bs0Var.f25835h) && n51.f.a(java.lang.Integer.valueOf(this.f25836i), java.lang.Integer.valueOf(bs0Var.f25836i)) && n51.f.a(this.f25837m, bs0Var.f25837m) && n51.f.a(java.lang.Integer.valueOf(this.f25838n), java.lang.Integer.valueOf(bs0Var.f25838n)) && n51.f.a(this.f25839o, bs0Var.f25839o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bs0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25840p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25831d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f25832e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f25833f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f25834g);
            }
            java.lang.String str3 = this.f25835h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.e(6, this.f25836i);
            }
            java.lang.String str4 = this.f25837m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            if (zArr[8]) {
                fVar.e(8, this.f25838n);
            }
            java.lang.String str5 = this.f25839o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f25831d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f25832e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f25833f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f25834g);
            }
            java.lang.String str8 = this.f25835h;
            if (str8 != null && zArr[5]) {
                i18 += b36.f.j(5, str8);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f25836i);
            }
            java.lang.String str9 = this.f25837m;
            if (str9 != null && zArr[7]) {
                i18 += b36.f.j(7, str9);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f25838n);
            }
            java.lang.String str10 = this.f25839o;
            return (str10 == null || !zArr[9]) ? i18 : i18 + b36.f.j(9, str10);
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
                this.f25831d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25832e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25833f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25834g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25835h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25836i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25837m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25838n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f25839o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
