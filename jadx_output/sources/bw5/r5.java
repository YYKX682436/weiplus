package bw5;

/* loaded from: classes2.dex */
public class r5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f32405d;

    /* renamed from: e, reason: collision with root package name */
    public int f32406e;

    /* renamed from: f, reason: collision with root package name */
    public int f32407f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32408g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f32409h = new boolean[5];

    static {
        new bw5.r5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r5 parseFrom(byte[] bArr) {
        return (bw5.r5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r5)) {
            return false;
        }
        bw5.r5 r5Var = (bw5.r5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f32405d), java.lang.Integer.valueOf(r5Var.f32405d)) && n51.f.a(java.lang.Integer.valueOf(this.f32406e), java.lang.Integer.valueOf(r5Var.f32406e)) && n51.f.a(java.lang.Integer.valueOf(this.f32407f), java.lang.Integer.valueOf(r5Var.f32407f)) && n51.f.a(java.lang.Boolean.valueOf(this.f32408g), java.lang.Boolean.valueOf(r5Var.f32408g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.r5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32409h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f32405d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f32406e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f32407f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f32408g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f32405d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f32406e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f32407f);
            }
            return zArr[4] ? e17 + b36.f.a(4, this.f32408g) : e17;
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
            this.f32405d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32406e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f32407f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f32408g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
