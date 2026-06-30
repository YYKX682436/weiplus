package bw5;

/* loaded from: classes9.dex */
public class g8 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27711d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27712e;

    /* renamed from: f, reason: collision with root package name */
    public int f27713f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27714g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27715h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f27716i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27717m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f27718n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f27719o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f27720p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f27721q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f27722r = new boolean[12];

    static {
        new bw5.g8();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.g8 parseFrom(byte[] bArr) {
        return (bw5.g8) super.parseFrom(bArr);
    }

    public bw5.g8 c(java.lang.String str) {
        this.f27719o = str;
        this.f27722r[9] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g8)) {
            return false;
        }
        bw5.g8 g8Var = (bw5.g8) fVar;
        return n51.f.a(this.f27711d, g8Var.f27711d) && n51.f.a(java.lang.Boolean.valueOf(this.f27712e), java.lang.Boolean.valueOf(g8Var.f27712e)) && n51.f.a(java.lang.Integer.valueOf(this.f27713f), java.lang.Integer.valueOf(g8Var.f27713f)) && n51.f.a(java.lang.Boolean.valueOf(this.f27714g), java.lang.Boolean.valueOf(g8Var.f27714g)) && n51.f.a(java.lang.Boolean.valueOf(this.f27715h), java.lang.Boolean.valueOf(g8Var.f27715h)) && n51.f.a(java.lang.Boolean.valueOf(this.f27716i), java.lang.Boolean.valueOf(g8Var.f27716i)) && n51.f.a(java.lang.Boolean.valueOf(this.f27717m), java.lang.Boolean.valueOf(g8Var.f27717m)) && n51.f.a(this.f27718n, g8Var.f27718n) && n51.f.a(this.f27719o, g8Var.f27719o) && n51.f.a(java.lang.Boolean.valueOf(this.f27720p), java.lang.Boolean.valueOf(g8Var.f27720p)) && n51.f.a(java.lang.Boolean.valueOf(this.f27721q), java.lang.Boolean.valueOf(g8Var.f27721q));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.g8();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27722r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27711d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f27712e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27713f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f27714g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f27715h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f27716i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f27717m);
            }
            java.lang.String str2 = this.f27718n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f27719o;
            if (str3 != null && zArr[9]) {
                fVar.j(9, str3);
            }
            if (zArr[10]) {
                fVar.a(10, this.f27720p);
            }
            if (zArr[11]) {
                fVar.a(11, this.f27721q);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f27711d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f27712e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f27713f);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f27714g);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f27715h);
            }
            if (zArr[6]) {
                i18 += b36.f.a(6, this.f27716i);
            }
            if (zArr[7]) {
                i18 += b36.f.a(7, this.f27717m);
            }
            java.lang.String str5 = this.f27718n;
            if (str5 != null && zArr[8]) {
                i18 += b36.f.j(8, str5);
            }
            java.lang.String str6 = this.f27719o;
            if (str6 != null && zArr[9]) {
                i18 += b36.f.j(9, str6);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f27720p);
            }
            return zArr[11] ? i18 + b36.f.a(11, this.f27721q) : i18;
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
                this.f27711d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27712e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27713f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f27714g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f27715h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27716i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f27717m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f27718n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f27719o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f27720p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f27721q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
