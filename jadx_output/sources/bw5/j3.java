package bw5;

/* loaded from: classes10.dex */
public class j3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28776d;

    /* renamed from: e, reason: collision with root package name */
    public int f28777e;

    /* renamed from: f, reason: collision with root package name */
    public int f28778f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28779g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28780h = new boolean[5];

    static {
        new bw5.j3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.j3 parseFrom(byte[] bArr) {
        return (bw5.j3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.j3)) {
            return false;
        }
        bw5.j3 j3Var = (bw5.j3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28776d), java.lang.Integer.valueOf(j3Var.f28776d)) && n51.f.a(java.lang.Integer.valueOf(this.f28777e), java.lang.Integer.valueOf(j3Var.f28777e)) && n51.f.a(java.lang.Integer.valueOf(this.f28778f), java.lang.Integer.valueOf(j3Var.f28778f)) && n51.f.a(java.lang.Boolean.valueOf(this.f28779g), java.lang.Boolean.valueOf(j3Var.f28779g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.j3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28780h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28776d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f28777e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f28778f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f28779g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28776d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f28777e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f28778f);
            }
            return zArr[4] ? e17 + b36.f.a(4, this.f28779g) : e17;
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
            this.f28776d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28777e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28778f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f28779g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
