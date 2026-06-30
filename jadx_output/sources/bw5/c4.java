package bw5;

/* loaded from: classes2.dex */
public class c4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25904d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25905e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25906f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25907g;

    /* renamed from: h, reason: collision with root package name */
    public int f25908h;

    /* renamed from: i, reason: collision with root package name */
    public int f25909i;

    /* renamed from: m, reason: collision with root package name */
    public int f25910m;

    /* renamed from: n, reason: collision with root package name */
    public int f25911n;

    /* renamed from: o, reason: collision with root package name */
    public int f25912o;

    /* renamed from: p, reason: collision with root package name */
    public int f25913p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f25914q = new boolean[11];

    static {
        new bw5.c4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.c4 parseFrom(byte[] bArr) {
        return (bw5.c4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c4)) {
            return false;
        }
        bw5.c4 c4Var = (bw5.c4) fVar;
        return n51.f.a(this.f25904d, c4Var.f25904d) && n51.f.a(this.f25905e, c4Var.f25905e) && n51.f.a(this.f25906f, c4Var.f25906f) && n51.f.a(this.f25907g, c4Var.f25907g) && n51.f.a(java.lang.Integer.valueOf(this.f25908h), java.lang.Integer.valueOf(c4Var.f25908h)) && n51.f.a(java.lang.Integer.valueOf(this.f25909i), java.lang.Integer.valueOf(c4Var.f25909i)) && n51.f.a(java.lang.Integer.valueOf(this.f25910m), java.lang.Integer.valueOf(c4Var.f25910m)) && n51.f.a(java.lang.Integer.valueOf(this.f25911n), java.lang.Integer.valueOf(c4Var.f25911n)) && n51.f.a(java.lang.Integer.valueOf(this.f25912o), java.lang.Integer.valueOf(c4Var.f25912o)) && n51.f.a(java.lang.Integer.valueOf(this.f25913p), java.lang.Integer.valueOf(c4Var.f25913p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.c4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25914q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25904d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f25905e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f25906f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f25907g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.e(5, this.f25908h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f25909i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f25910m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f25911n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f25912o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f25913p);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f25904d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f25905e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f25906f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f25907g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f25908h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f25909i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f25910m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f25911n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f25912o);
            }
            return zArr[10] ? i18 + b36.f.e(10, this.f25913p) : i18;
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
                this.f25904d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25905e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25906f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25907g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25908h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25909i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25910m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25911n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f25912o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f25913p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
