package bw5;

/* loaded from: classes2.dex */
public class fn0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27386d;

    /* renamed from: e, reason: collision with root package name */
    public int f27387e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27388f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27389g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f27390h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f27391i;

    /* renamed from: m, reason: collision with root package name */
    public long f27392m;

    /* renamed from: n, reason: collision with root package name */
    public long f27393n;

    /* renamed from: o, reason: collision with root package name */
    public long f27394o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f27395p = new boolean[10];

    static {
        new bw5.fn0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fn0 parseFrom(byte[] bArr) {
        return (bw5.fn0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fn0)) {
            return false;
        }
        bw5.fn0 fn0Var = (bw5.fn0) fVar;
        return n51.f.a(this.f27386d, fn0Var.f27386d) && n51.f.a(java.lang.Integer.valueOf(this.f27387e), java.lang.Integer.valueOf(fn0Var.f27387e)) && n51.f.a(this.f27388f, fn0Var.f27388f) && n51.f.a(this.f27389g, fn0Var.f27389g) && n51.f.a(this.f27390h, fn0Var.f27390h) && n51.f.a(this.f27391i, fn0Var.f27391i) && n51.f.a(java.lang.Long.valueOf(this.f27392m), java.lang.Long.valueOf(fn0Var.f27392m)) && n51.f.a(java.lang.Long.valueOf(this.f27393n), java.lang.Long.valueOf(fn0Var.f27393n)) && n51.f.a(java.lang.Long.valueOf(this.f27394o), java.lang.Long.valueOf(fn0Var.f27394o));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27395p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27386d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27387e);
            }
            java.lang.String str2 = this.f27388f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f27389g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f27390h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f27391i;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            if (zArr[7]) {
                fVar.h(7, this.f27392m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f27393n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f27394o);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f27386d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f27387e);
            }
            java.lang.String str7 = this.f27388f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f27389g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f27390h;
            if (str9 != null && zArr[5]) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f27391i;
            if (str10 != null && zArr[6]) {
                i18 += b36.f.j(6, str10);
            }
            if (zArr[7]) {
                i18 += b36.f.h(7, this.f27392m);
            }
            if (zArr[8]) {
                i18 += b36.f.h(8, this.f27393n);
            }
            return zArr[9] ? i18 + b36.f.h(9, this.f27394o) : i18;
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
                this.f27386d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27387e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27388f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27389g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27390h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27391i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27392m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27393n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f27394o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
