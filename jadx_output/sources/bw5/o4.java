package bw5;

/* loaded from: classes2.dex */
public class o4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f30935d;

    /* renamed from: e, reason: collision with root package name */
    public int f30936e;

    /* renamed from: f, reason: collision with root package name */
    public float f30937f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30938g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30939h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30940i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30941m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f30942n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f30943o = new boolean[9];

    static {
        new bw5.o4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o4 parseFrom(byte[] bArr) {
        return (bw5.o4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o4)) {
            return false;
        }
        bw5.o4 o4Var = (bw5.o4) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f30935d), java.lang.Boolean.valueOf(o4Var.f30935d)) && n51.f.a(java.lang.Integer.valueOf(this.f30936e), java.lang.Integer.valueOf(o4Var.f30936e)) && n51.f.a(java.lang.Float.valueOf(this.f30937f), java.lang.Float.valueOf(o4Var.f30937f)) && n51.f.a(this.f30938g, o4Var.f30938g) && n51.f.a(java.lang.Boolean.valueOf(this.f30939h), java.lang.Boolean.valueOf(o4Var.f30939h)) && n51.f.a(this.f30940i, o4Var.f30940i) && n51.f.a(this.f30941m, o4Var.f30941m) && n51.f.a(this.f30942n, o4Var.f30942n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.o4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30943o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f30935d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f30936e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f30937f);
            }
            java.lang.String str = this.f30938g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.a(5, this.f30939h);
            }
            java.lang.String str2 = this.f30940i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f30941m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f30942n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f30935d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f30936e);
            }
            if (zArr[3]) {
                a17 += b36.f.d(3, this.f30937f);
            }
            java.lang.String str5 = this.f30938g;
            if (str5 != null && zArr[4]) {
                a17 += b36.f.j(4, str5);
            }
            if (zArr[5]) {
                a17 += b36.f.a(5, this.f30939h);
            }
            java.lang.String str6 = this.f30940i;
            if (str6 != null && zArr[6]) {
                a17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f30941m;
            if (str7 != null && zArr[7]) {
                a17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f30942n;
            return (str8 == null || !zArr[8]) ? a17 : a17 + b36.f.j(8, str8);
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
                this.f30935d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30936e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30937f = aVar2.f(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30938g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30939h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30940i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f30941m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30942n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
