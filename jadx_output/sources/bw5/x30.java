package bw5;

/* loaded from: classes2.dex */
public class x30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34939d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34940e;

    /* renamed from: f, reason: collision with root package name */
    public int f34941f;

    /* renamed from: g, reason: collision with root package name */
    public int f34942g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34943h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34944i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34945m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f34946n;

    /* renamed from: o, reason: collision with root package name */
    public long f34947o;

    /* renamed from: p, reason: collision with root package name */
    public long f34948p;

    /* renamed from: q, reason: collision with root package name */
    public long f34949q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f34950r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f34951s = new boolean[13];

    static {
        new bw5.x30();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.x30 parseFrom(byte[] bArr) {
        return (bw5.x30) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.x30)) {
            return false;
        }
        bw5.x30 x30Var = (bw5.x30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34939d), java.lang.Integer.valueOf(x30Var.f34939d)) && n51.f.a(this.f34940e, x30Var.f34940e) && n51.f.a(java.lang.Integer.valueOf(this.f34941f), java.lang.Integer.valueOf(x30Var.f34941f)) && n51.f.a(java.lang.Integer.valueOf(this.f34942g), java.lang.Integer.valueOf(x30Var.f34942g)) && n51.f.a(this.f34943h, x30Var.f34943h) && n51.f.a(this.f34944i, x30Var.f34944i) && n51.f.a(this.f34945m, x30Var.f34945m) && n51.f.a(this.f34946n, x30Var.f34946n) && n51.f.a(java.lang.Long.valueOf(this.f34947o), java.lang.Long.valueOf(x30Var.f34947o)) && n51.f.a(java.lang.Long.valueOf(this.f34948p), java.lang.Long.valueOf(x30Var.f34948p)) && n51.f.a(java.lang.Long.valueOf(this.f34949q), java.lang.Long.valueOf(x30Var.f34949q)) && n51.f.a(this.f34950r, x30Var.f34950r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.x30();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34951s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34939d);
            }
            java.lang.String str = this.f34940e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34941f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34942g);
            }
            com.tencent.mm.protobuf.g gVar = this.f34943h;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f34944i;
            if (gVar2 != null && zArr[6]) {
                fVar.b(6, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f34945m;
            if (gVar3 != null && zArr[7]) {
                fVar.b(7, gVar3);
            }
            java.lang.String str2 = this.f34946n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            if (zArr[9]) {
                fVar.h(9, this.f34947o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f34948p);
            }
            if (zArr[11]) {
                fVar.h(11, this.f34949q);
            }
            java.lang.String str3 = this.f34950r;
            if (str3 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str3);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f34939d) : 0;
            java.lang.String str4 = this.f34940e;
            if (str4 != null && zArr[2]) {
                e17 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f34941f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f34942g);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f34943h;
            if (gVar4 != null && zArr[5]) {
                e17 += b36.f.b(5, gVar4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f34944i;
            if (gVar5 != null && zArr[6]) {
                e17 += b36.f.b(6, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f34945m;
            if (gVar6 != null && zArr[7]) {
                e17 += b36.f.b(7, gVar6);
            }
            java.lang.String str5 = this.f34946n;
            if (str5 != null && zArr[8]) {
                e17 += b36.f.j(8, str5);
            }
            if (zArr[9]) {
                e17 += b36.f.h(9, this.f34947o);
            }
            if (zArr[10]) {
                e17 += b36.f.h(10, this.f34948p);
            }
            if (zArr[11]) {
                e17 += b36.f.h(11, this.f34949q);
            }
            java.lang.String str6 = this.f34950r;
            return (str6 == null || !zArr[12]) ? e17 : e17 + b36.f.j(12, str6);
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
                this.f34939d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34940e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34941f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34942g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34943h = aVar2.d(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34944i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34945m = aVar2.d(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f34946n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34947o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f34948p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f34949q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f34950r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
