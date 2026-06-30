package bw5;

/* loaded from: classes9.dex */
public class r6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f32413d;

    /* renamed from: e, reason: collision with root package name */
    public float f32414e;

    /* renamed from: f, reason: collision with root package name */
    public float f32415f;

    /* renamed from: g, reason: collision with root package name */
    public long f32416g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f32417h = new boolean[5];

    static {
        new bw5.r6();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r6)) {
            return false;
        }
        bw5.r6 r6Var = (bw5.r6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f32413d), java.lang.Integer.valueOf(r6Var.f32413d)) && n51.f.a(java.lang.Float.valueOf(this.f32414e), java.lang.Float.valueOf(r6Var.f32414e)) && n51.f.a(java.lang.Float.valueOf(this.f32415f), java.lang.Float.valueOf(r6Var.f32415f)) && n51.f.a(java.lang.Long.valueOf(this.f32416g), java.lang.Long.valueOf(r6Var.f32416g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.r6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32417h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f32413d);
            }
            if (zArr[2]) {
                fVar.d(2, this.f32414e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f32415f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f32416g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f32413d) : 0;
            if (zArr[2]) {
                e17 += b36.f.d(2, this.f32414e);
            }
            if (zArr[3]) {
                e17 += b36.f.d(3, this.f32415f);
            }
            return zArr[4] ? e17 + b36.f.h(4, this.f32416g) : e17;
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
            this.f32413d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32414e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f32415f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f32416g = aVar2.i(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.r6) super.parseFrom(bArr);
    }
}
