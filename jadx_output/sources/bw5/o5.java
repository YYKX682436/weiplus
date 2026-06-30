package bw5;

/* loaded from: classes9.dex */
public class o5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f30949d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f30950e;

    /* renamed from: f, reason: collision with root package name */
    public int f30951f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30952g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30953h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f30954i = new boolean[6];

    static {
        new bw5.o5();
    }

    public com.tencent.mm.protobuf.g b() {
        return this.f30954i[2] ? this.f30950e : com.tencent.mm.protobuf.g.f192155b;
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.o5 parseFrom(byte[] bArr) {
        return (bw5.o5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o5)) {
            return false;
        }
        bw5.o5 o5Var = (bw5.o5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f30949d), java.lang.Integer.valueOf(o5Var.f30949d)) && n51.f.a(this.f30950e, o5Var.f30950e) && n51.f.a(java.lang.Integer.valueOf(this.f30951f), java.lang.Integer.valueOf(o5Var.f30951f)) && n51.f.a(this.f30952g, o5Var.f30952g) && n51.f.a(this.f30953h, o5Var.f30953h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.o5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30954i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f30949d);
            }
            com.tencent.mm.protobuf.g gVar = this.f30950e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f30951f);
            }
            java.lang.String str = this.f30952g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f30953h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f30949d) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f30950e;
            if (gVar2 != null && zArr[2]) {
                e17 += b36.f.b(2, gVar2);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f30951f);
            }
            java.lang.String str3 = this.f30952g;
            if (str3 != null && zArr[4]) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f30953h;
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
            this.f30949d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f30950e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f30951f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f30952g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f30953h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
