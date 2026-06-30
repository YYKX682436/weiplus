package bw5;

/* loaded from: classes2.dex */
public class b9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25568d;

    /* renamed from: e, reason: collision with root package name */
    public int f25569e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25570f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25571g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f25572h = new boolean[5];

    static {
        new bw5.b9();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b9 parseFrom(byte[] bArr) {
        return (bw5.b9) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b9)) {
            return false;
        }
        bw5.b9 b9Var = (bw5.b9) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25568d), java.lang.Integer.valueOf(b9Var.f25568d)) && n51.f.a(java.lang.Integer.valueOf(this.f25569e), java.lang.Integer.valueOf(b9Var.f25569e)) && n51.f.a(this.f25570f, b9Var.f25570f) && n51.f.a(this.f25571g, b9Var.f25571g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.b9();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25572h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25568d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f25569e);
            }
            java.lang.String str = this.f25570f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f25571g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f25568d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f25569e);
            }
            java.lang.String str3 = this.f25570f;
            if (str3 != null && zArr[3]) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f25571g;
            return (str4 == null || !zArr[4]) ? e17 : e17 + b36.f.j(4, str4);
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
            this.f25568d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25569e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f25570f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f25571g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
