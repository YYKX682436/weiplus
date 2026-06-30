package bw5;

/* loaded from: classes2.dex */
public class j60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28839d;

    /* renamed from: e, reason: collision with root package name */
    public double f28840e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28841f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f28842g;

    /* renamed from: h, reason: collision with root package name */
    public int f28843h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f28844i = new boolean[6];

    static {
        new bw5.j60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.j60 parseFrom(byte[] bArr) {
        return (bw5.j60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j60)) {
            return false;
        }
        bw5.j60 j60Var = (bw5.j60) fVar;
        return n51.f.a(this.f28839d, j60Var.f28839d) && n51.f.a(java.lang.Double.valueOf(this.f28840e), java.lang.Double.valueOf(j60Var.f28840e)) && n51.f.a(this.f28841f, j60Var.f28841f) && n51.f.a(this.f28842g, j60Var.f28842g) && n51.f.a(java.lang.Integer.valueOf(this.f28843h), java.lang.Integer.valueOf(j60Var.f28843h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.j60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28844i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28839d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.c(2, this.f28840e);
            }
            java.lang.String str2 = this.f28841f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f28842g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f28843h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f28839d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            if (zArr[2]) {
                i18 += b36.f.c(2, this.f28840e);
            }
            java.lang.String str5 = this.f28841f;
            if (str5 != null && zArr[3]) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f28842g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f28843h) : i18;
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
            this.f28839d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28840e = aVar2.e(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28841f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f28842g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f28843h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
