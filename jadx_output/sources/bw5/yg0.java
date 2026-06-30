package bw5;

/* loaded from: classes2.dex */
public class yg0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35479d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35480e;

    /* renamed from: f, reason: collision with root package name */
    public int f35481f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f35482g;

    /* renamed from: h, reason: collision with root package name */
    public int f35483h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35484i = new boolean[6];

    static {
        new bw5.yg0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yg0)) {
            return false;
        }
        bw5.yg0 yg0Var = (bw5.yg0) fVar;
        return n51.f.a(this.f35479d, yg0Var.f35479d) && n51.f.a(this.f35480e, yg0Var.f35480e) && n51.f.a(java.lang.Integer.valueOf(this.f35481f), java.lang.Integer.valueOf(yg0Var.f35481f)) && n51.f.a(this.f35482g, yg0Var.f35482g) && n51.f.a(java.lang.Integer.valueOf(this.f35483h), java.lang.Integer.valueOf(yg0Var.f35483h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yg0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f35484i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35479d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f35480e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f35481f);
            }
            java.lang.String str3 = this.f35482g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.e(5, this.f35483h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f35479d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f35480e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f35481f);
            }
            java.lang.String str6 = this.f35482g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f35483h) : i18;
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
            this.f35479d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35480e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f35481f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f35482g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f35483h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.yg0) super.parseFrom(bArr);
    }
}
