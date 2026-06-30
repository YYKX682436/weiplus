package bw5;

/* loaded from: classes2.dex */
public class z00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f35762d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35763e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35764f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35765g;

    /* renamed from: h, reason: collision with root package name */
    public int f35766h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35767i = new boolean[6];

    static {
        new bw5.z00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.z00 parseFrom(byte[] bArr) {
        return (bw5.z00) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z00)) {
            return false;
        }
        bw5.z00 z00Var = (bw5.z00) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f35762d), java.lang.Boolean.valueOf(z00Var.f35762d)) && n51.f.a(this.f35763e, z00Var.f35763e) && n51.f.a(java.lang.Boolean.valueOf(this.f35764f), java.lang.Boolean.valueOf(z00Var.f35764f)) && n51.f.a(this.f35765g, z00Var.f35765g) && n51.f.a(java.lang.Integer.valueOf(this.f35766h), java.lang.Integer.valueOf(z00Var.f35766h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.z00();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35767i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f35762d);
            }
            java.lang.String str = this.f35763e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f35764f);
            }
            java.lang.String str2 = this.f35765g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f35766h);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f35762d) : 0;
            java.lang.String str3 = this.f35763e;
            if (str3 != null && zArr[2]) {
                a17 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f35764f);
            }
            java.lang.String str4 = this.f35765g;
            if (str4 != null && zArr[4]) {
                a17 += b36.f.j(4, str4);
            }
            return zArr[5] ? a17 + b36.f.e(5, this.f35766h) : a17;
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
        if (intValue == 1) {
            this.f35762d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35763e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f35764f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f35765g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f35766h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
