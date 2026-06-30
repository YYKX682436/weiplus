package bt3;

/* loaded from: classes8.dex */
public class f3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f24264d;

    /* renamed from: e, reason: collision with root package name */
    public int f24265e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f24266f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f24267g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f24268h;

    /* renamed from: i, reason: collision with root package name */
    public int f24269i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bt3.f3)) {
            return false;
        }
        bt3.f3 f3Var = (bt3.f3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f24264d), java.lang.Integer.valueOf(f3Var.f24264d)) && n51.f.a(java.lang.Integer.valueOf(this.f24265e), java.lang.Integer.valueOf(f3Var.f24265e)) && n51.f.a(this.f24266f, f3Var.f24266f) && n51.f.a(this.f24267g, f3Var.f24267g) && n51.f.a(this.f24268h, f3Var.f24268h) && n51.f.a(java.lang.Integer.valueOf(this.f24269i), java.lang.Integer.valueOf(f3Var.f24269i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f24264d);
            fVar.e(2, this.f24265e);
            java.lang.String str = this.f24266f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f24267g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f24268h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            fVar.e(6, this.f24269i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f24264d) + 0 + b36.f.e(2, this.f24265e);
            java.lang.String str3 = this.f24266f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f24267g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f24268h;
            if (gVar2 != null) {
                e17 += b36.f.b(5, gVar2);
            }
            return e17 + b36.f.e(6, this.f24269i);
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
        bt3.f3 f3Var = (bt3.f3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                f3Var.f24264d = aVar2.g(intValue);
                return 0;
            case 2:
                f3Var.f24265e = aVar2.g(intValue);
                return 0;
            case 3:
                f3Var.f24266f = aVar2.k(intValue);
                return 0;
            case 4:
                f3Var.f24267g = aVar2.k(intValue);
                return 0;
            case 5:
                f3Var.f24268h = aVar2.d(intValue);
                return 0;
            case 6:
                f3Var.f24269i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
