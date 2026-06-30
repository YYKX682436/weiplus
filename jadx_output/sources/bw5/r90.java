package bw5;

/* loaded from: classes2.dex */
public class r90 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32450d;

    /* renamed from: e, reason: collision with root package name */
    public long f32451e;

    /* renamed from: f, reason: collision with root package name */
    public long f32452f;

    /* renamed from: g, reason: collision with root package name */
    public int f32453g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f32454h = new boolean[5];

    static {
        new bw5.r90();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r90 parseFrom(byte[] bArr) {
        return (bw5.r90) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r90)) {
            return false;
        }
        bw5.r90 r90Var = (bw5.r90) fVar;
        return n51.f.a(this.f32450d, r90Var.f32450d) && n51.f.a(java.lang.Long.valueOf(this.f32451e), java.lang.Long.valueOf(r90Var.f32451e)) && n51.f.a(java.lang.Long.valueOf(this.f32452f), java.lang.Long.valueOf(r90Var.f32452f)) && n51.f.a(java.lang.Integer.valueOf(this.f32453g), java.lang.Integer.valueOf(r90Var.f32453g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.r90();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32454h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32450d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f32451e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f32452f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f32453g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f32450d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f32451e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f32452f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f32453g) : i18;
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
            this.f32450d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32451e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f32452f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f32453g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
