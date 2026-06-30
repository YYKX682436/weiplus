package bw5;

/* loaded from: classes10.dex */
public class e30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f26710d;

    /* renamed from: e, reason: collision with root package name */
    public float f26711e;

    /* renamed from: f, reason: collision with root package name */
    public int f26712f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f26713g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f26714h;

    /* renamed from: i, reason: collision with root package name */
    public int f26715i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f26716m;

    /* renamed from: n, reason: collision with root package name */
    public int f26717n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f26718o = new boolean[9];

    static {
        new bw5.e30();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.e30 parseFrom(byte[] bArr) {
        return (bw5.e30) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e30)) {
            return false;
        }
        bw5.e30 e30Var = (bw5.e30) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f26710d), java.lang.Float.valueOf(e30Var.f26710d)) && n51.f.a(java.lang.Float.valueOf(this.f26711e), java.lang.Float.valueOf(e30Var.f26711e)) && n51.f.a(java.lang.Integer.valueOf(this.f26712f), java.lang.Integer.valueOf(e30Var.f26712f)) && n51.f.a(this.f26713g, e30Var.f26713g) && n51.f.a(this.f26714h, e30Var.f26714h) && n51.f.a(java.lang.Integer.valueOf(this.f26715i), java.lang.Integer.valueOf(e30Var.f26715i)) && n51.f.a(this.f26716m, e30Var.f26716m) && n51.f.a(java.lang.Integer.valueOf(this.f26717n), java.lang.Integer.valueOf(e30Var.f26717n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.e30();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26718o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f26710d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f26711e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f26712f);
            }
            java.lang.String str = this.f26713g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f26714h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f26715i);
            }
            java.lang.String str3 = this.f26716m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f26717n);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f26710d) : 0;
            if (zArr[2]) {
                d17 += b36.f.d(2, this.f26711e);
            }
            if (zArr[3]) {
                d17 += b36.f.e(3, this.f26712f);
            }
            java.lang.String str4 = this.f26713g;
            if (str4 != null && zArr[4]) {
                d17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f26714h;
            if (str5 != null && zArr[5]) {
                d17 += b36.f.j(5, str5);
            }
            if (zArr[6]) {
                d17 += b36.f.e(6, this.f26715i);
            }
            java.lang.String str6 = this.f26716m;
            if (str6 != null && zArr[7]) {
                d17 += b36.f.j(7, str6);
            }
            return zArr[8] ? d17 + b36.f.e(8, this.f26717n) : d17;
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
                this.f26710d = aVar2.f(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26711e = aVar2.f(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26712f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26713g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26714h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26715i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26716m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f26717n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
