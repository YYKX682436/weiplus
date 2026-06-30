package bw5;

/* loaded from: classes2.dex */
public class b50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25530d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25531e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25532f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25533g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.e80 f25534h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f25535i = new boolean[6];

    static {
        new bw5.b50();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b50 parseFrom(byte[] bArr) {
        return (bw5.b50) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b50)) {
            return false;
        }
        bw5.b50 b50Var = (bw5.b50) fVar;
        return n51.f.a(this.f25530d, b50Var.f25530d) && n51.f.a(this.f25531e, b50Var.f25531e) && n51.f.a(this.f25532f, b50Var.f25532f) && n51.f.a(java.lang.Boolean.valueOf(this.f25533g), java.lang.Boolean.valueOf(b50Var.f25533g)) && n51.f.a(this.f25534h, b50Var.f25534h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.b50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25535i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25530d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f25531e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f25532f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.a(4, this.f25533g);
            }
            bw5.e80 e80Var = this.f25534h;
            if (e80Var != null && zArr[5]) {
                fVar.i(5, e80Var.computeSize());
                this.f25534h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f25530d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f25531e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f25532f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f25533g);
            }
            bw5.e80 e80Var2 = this.f25534h;
            return (e80Var2 == null || !zArr[5]) ? i18 : i18 + b36.f.i(5, e80Var2.computeSize());
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
            this.f25530d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25531e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f25532f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f25533g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.e80 e80Var3 = new bw5.e80();
            if (bArr != null && bArr.length > 0) {
                e80Var3.parseFrom(bArr);
            }
            this.f25534h = e80Var3;
        }
        zArr[5] = true;
        return 0;
    }
}
