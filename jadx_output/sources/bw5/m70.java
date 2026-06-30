package bw5;

/* loaded from: classes2.dex */
public class m70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f30099d;

    /* renamed from: e, reason: collision with root package name */
    public int f30100e;

    /* renamed from: f, reason: collision with root package name */
    public int f30101f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30102g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30103h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f30104i = new boolean[6];

    static {
        new bw5.m70();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m70 parseFrom(byte[] bArr) {
        return (bw5.m70) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.m70)) {
            return false;
        }
        bw5.m70 m70Var = (bw5.m70) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f30099d), java.lang.Integer.valueOf(m70Var.f30099d)) && n51.f.a(java.lang.Integer.valueOf(this.f30100e), java.lang.Integer.valueOf(m70Var.f30100e)) && n51.f.a(java.lang.Integer.valueOf(this.f30101f), java.lang.Integer.valueOf(m70Var.f30101f)) && n51.f.a(this.f30102g, m70Var.f30102g) && n51.f.a(this.f30103h, m70Var.f30103h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.m70();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30104i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f30099d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f30100e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f30101f);
            }
            java.lang.String str = this.f30102g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f30103h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f30099d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f30100e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f30101f);
            }
            java.lang.String str3 = this.f30102g;
            if (str3 != null && zArr[4]) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f30103h;
            return (str4 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str4);
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
            this.f30099d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30100e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f30101f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f30102g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f30103h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
