package bw5;

/* loaded from: classes2.dex */
public class t30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f33236d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33237e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33238f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f33239g = new boolean[4];

    static {
        new bw5.t30();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.t30 parseFrom(byte[] bArr) {
        return (bw5.t30) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t30)) {
            return false;
        }
        bw5.t30 t30Var = (bw5.t30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f33236d), java.lang.Integer.valueOf(t30Var.f33236d)) && n51.f.a(this.f33237e, t30Var.f33237e) && n51.f.a(this.f33238f, t30Var.f33238f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.t30();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33239g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f33236d);
            }
            java.lang.String str = this.f33237e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f33238f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f33236d) : 0;
            java.lang.String str3 = this.f33237e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f33238f;
            return (str4 == null || !zArr[3]) ? e17 : e17 + b36.f.j(3, str4);
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
            this.f33236d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33237e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f33238f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
