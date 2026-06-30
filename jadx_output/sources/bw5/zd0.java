package bw5;

/* loaded from: classes7.dex */
public class zd0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f35945d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f35946e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f35947f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f35948g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f35949h = new boolean[5];

    static {
        new bw5.zd0();
    }

    public com.tencent.mm.protobuf.g b() {
        return this.f35949h[2] ? this.f35946e : com.tencent.mm.protobuf.g.f192155b;
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.zd0 parseFrom(byte[] bArr) {
        return (bw5.zd0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zd0)) {
            return false;
        }
        bw5.zd0 zd0Var = (bw5.zd0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f35945d), java.lang.Integer.valueOf(zd0Var.f35945d)) && n51.f.a(this.f35946e, zd0Var.f35946e) && n51.f.a(this.f35947f, zd0Var.f35947f) && n51.f.a(this.f35948g, zd0Var.f35948g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35949h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f35945d);
            }
            com.tencent.mm.protobuf.g gVar = this.f35946e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f35947f;
            if (gVar2 != null && zArr[3]) {
                fVar.b(3, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f35948g;
            if (gVar3 != null && zArr[4]) {
                fVar.b(4, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f35945d) : 0;
            com.tencent.mm.protobuf.g gVar4 = this.f35946e;
            if (gVar4 != null && zArr[2]) {
                e17 += b36.f.b(2, gVar4);
            }
            com.tencent.mm.protobuf.g gVar5 = this.f35947f;
            if (gVar5 != null && zArr[3]) {
                e17 += b36.f.b(3, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f35948g;
            return (gVar6 == null || !zArr[4]) ? e17 : e17 + b36.f.b(4, gVar6);
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
            this.f35945d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35946e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f35947f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f35948g = aVar2.d(intValue);
        zArr[4] = true;
        return 0;
    }
}
