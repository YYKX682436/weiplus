package bw5;

/* loaded from: classes2.dex */
public class r30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f32395d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32396e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32397f;

    /* renamed from: g, reason: collision with root package name */
    public int f32398g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f32399h = new boolean[5];

    static {
        new bw5.r30();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r30 parseFrom(byte[] bArr) {
        return (bw5.r30) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r30)) {
            return false;
        }
        bw5.r30 r30Var = (bw5.r30) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f32395d), java.lang.Boolean.valueOf(r30Var.f32395d)) && n51.f.a(java.lang.Boolean.valueOf(this.f32396e), java.lang.Boolean.valueOf(r30Var.f32396e)) && n51.f.a(java.lang.Boolean.valueOf(this.f32397f), java.lang.Boolean.valueOf(r30Var.f32397f)) && n51.f.a(java.lang.Integer.valueOf(this.f32398g), java.lang.Integer.valueOf(r30Var.f32398g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.r30();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32399h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f32395d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f32396e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f32397f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f32398g);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f32395d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f32396e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f32397f);
            }
            return zArr[4] ? a17 + b36.f.e(4, this.f32398g) : a17;
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
            this.f32395d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32396e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f32397f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f32398g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
