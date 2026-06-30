package bw5;

/* loaded from: classes11.dex */
public class gn0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27922d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27923e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27924f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27925g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f27926h;

    /* renamed from: i, reason: collision with root package name */
    public int f27927i;

    /* renamed from: m, reason: collision with root package name */
    public int f27928m;

    /* renamed from: n, reason: collision with root package name */
    public long f27929n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f27930o = new boolean[9];

    static {
        new bw5.gn0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gn0 parseFrom(byte[] bArr) {
        return (bw5.gn0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gn0)) {
            return false;
        }
        bw5.gn0 gn0Var = (bw5.gn0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27922d), java.lang.Integer.valueOf(gn0Var.f27922d)) && n51.f.a(this.f27923e, gn0Var.f27923e) && n51.f.a(this.f27924f, gn0Var.f27924f) && n51.f.a(this.f27925g, gn0Var.f27925g) && n51.f.a(this.f27926h, gn0Var.f27926h) && n51.f.a(java.lang.Integer.valueOf(this.f27927i), java.lang.Integer.valueOf(gn0Var.f27927i)) && n51.f.a(java.lang.Integer.valueOf(this.f27928m), java.lang.Integer.valueOf(gn0Var.f27928m)) && n51.f.a(java.lang.Long.valueOf(this.f27929n), java.lang.Long.valueOf(gn0Var.f27929n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27930o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27922d);
            }
            java.lang.String str = this.f27923e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f27924f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f27925g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f27926h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.e(6, this.f27927i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f27928m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f27929n);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f27922d) : 0;
            java.lang.String str5 = this.f27923e;
            if (str5 != null && zArr[2]) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f27924f;
            if (str6 != null && zArr[3]) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f27925g;
            if (str7 != null && zArr[4]) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f27926h;
            if (str8 != null && zArr[5]) {
                e17 += b36.f.j(5, str8);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f27927i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f27928m);
            }
            return zArr[8] ? e17 + b36.f.h(8, this.f27929n) : e17;
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
                this.f27922d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27923e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27924f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27925g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27926h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27927i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27928m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27929n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
