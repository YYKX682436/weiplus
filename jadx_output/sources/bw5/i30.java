package bw5;

/* loaded from: classes2.dex */
public class i30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f28449d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28450e;

    /* renamed from: f, reason: collision with root package name */
    public long f28451f;

    /* renamed from: g, reason: collision with root package name */
    public long f28452g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28453h;

    /* renamed from: i, reason: collision with root package name */
    public int f28454i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f28455m = new boolean[7];

    static {
        new bw5.i30();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.i30 parseFrom(byte[] bArr) {
        return (bw5.i30) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.i30)) {
            return false;
        }
        bw5.i30 i30Var = (bw5.i30) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f28449d), java.lang.Boolean.valueOf(i30Var.f28449d)) && n51.f.a(this.f28450e, i30Var.f28450e) && n51.f.a(java.lang.Long.valueOf(this.f28451f), java.lang.Long.valueOf(i30Var.f28451f)) && n51.f.a(java.lang.Long.valueOf(this.f28452g), java.lang.Long.valueOf(i30Var.f28452g)) && n51.f.a(java.lang.Boolean.valueOf(this.f28453h), java.lang.Boolean.valueOf(i30Var.f28453h)) && n51.f.a(java.lang.Integer.valueOf(this.f28454i), java.lang.Integer.valueOf(i30Var.f28454i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.i30();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28455m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f28449d);
            }
            java.lang.String str = this.f28450e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f28451f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f28452g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f28453h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f28454i);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f28449d) : 0;
            java.lang.String str2 = this.f28450e;
            if (str2 != null && zArr[2]) {
                a17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                a17 += b36.f.h(3, this.f28451f);
            }
            if (zArr[4]) {
                a17 += b36.f.h(4, this.f28452g);
            }
            if (zArr[5]) {
                a17 += b36.f.a(5, this.f28453h);
            }
            return zArr[6] ? a17 + b36.f.e(6, this.f28454i) : a17;
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
                this.f28449d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28450e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f28451f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f28452g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f28453h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f28454i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
