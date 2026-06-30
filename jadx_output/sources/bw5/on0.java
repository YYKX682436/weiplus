package bw5;

/* loaded from: classes2.dex */
public class on0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31160d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31161e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31162f;

    /* renamed from: g, reason: collision with root package name */
    public int f31163g;

    /* renamed from: h, reason: collision with root package name */
    public int f31164h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f31165i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f31166m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f31167n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f31168o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f31169p = new boolean[10];

    static {
        new bw5.on0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.on0 parseFrom(byte[] bArr) {
        return (bw5.on0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.on0)) {
            return false;
        }
        bw5.on0 on0Var = (bw5.on0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31160d), java.lang.Integer.valueOf(on0Var.f31160d)) && n51.f.a(this.f31161e, on0Var.f31161e) && n51.f.a(this.f31162f, on0Var.f31162f) && n51.f.a(java.lang.Integer.valueOf(this.f31163g), java.lang.Integer.valueOf(on0Var.f31163g)) && n51.f.a(java.lang.Integer.valueOf(this.f31164h), java.lang.Integer.valueOf(on0Var.f31164h)) && n51.f.a(this.f31165i, on0Var.f31165i) && n51.f.a(this.f31166m, on0Var.f31166m) && n51.f.a(this.f31167n, on0Var.f31167n) && n51.f.a(this.f31168o, on0Var.f31168o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.on0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31169p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31160d);
            }
            java.lang.String str = this.f31161e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f31162f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f31163g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f31164h);
            }
            java.lang.String str3 = this.f31165i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f31166m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f31167n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f31168o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f31160d) : 0;
            java.lang.String str7 = this.f31161e;
            if (str7 != null && zArr[2]) {
                e17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f31162f;
            if (str8 != null && zArr[3]) {
                e17 += b36.f.j(3, str8);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f31163g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f31164h);
            }
            java.lang.String str9 = this.f31165i;
            if (str9 != null && zArr[6]) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f31166m;
            if (str10 != null && zArr[7]) {
                e17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f31167n;
            if (str11 != null && zArr[8]) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f31168o;
            return (str12 == null || !zArr[9]) ? e17 : e17 + b36.f.j(9, str12);
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
                this.f31160d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31161e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31162f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31163g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f31164h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f31165i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f31166m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f31167n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f31168o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
