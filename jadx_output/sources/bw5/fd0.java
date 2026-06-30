package bw5;

/* loaded from: classes2.dex */
public class fd0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27236d;

    /* renamed from: e, reason: collision with root package name */
    public int f27237e;

    /* renamed from: f, reason: collision with root package name */
    public int f27238f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27239g;

    /* renamed from: h, reason: collision with root package name */
    public int f27240h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f27241i = new boolean[6];

    static {
        new bw5.fd0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fd0 parseFrom(byte[] bArr) {
        return (bw5.fd0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fd0)) {
            return false;
        }
        bw5.fd0 fd0Var = (bw5.fd0) fVar;
        return n51.f.a(this.f27236d, fd0Var.f27236d) && n51.f.a(java.lang.Integer.valueOf(this.f27237e), java.lang.Integer.valueOf(fd0Var.f27237e)) && n51.f.a(java.lang.Integer.valueOf(this.f27238f), java.lang.Integer.valueOf(fd0Var.f27238f)) && n51.f.a(this.f27239g, fd0Var.f27239g) && n51.f.a(java.lang.Integer.valueOf(this.f27240h), java.lang.Integer.valueOf(fd0Var.f27240h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.fd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27241i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27236d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27237e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27238f);
            }
            java.lang.String str2 = this.f27239g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f27240h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f27236d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f27237e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f27238f);
            }
            java.lang.String str4 = this.f27239g;
            if (str4 != null && zArr[4]) {
                i18 += b36.f.j(4, str4);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f27240h) : i18;
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
            this.f27236d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27237e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27238f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f27239g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f27240h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
