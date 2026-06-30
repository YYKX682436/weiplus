package bw5;

/* loaded from: classes2.dex */
public class rv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32689d;

    /* renamed from: e, reason: collision with root package name */
    public float f32690e;

    /* renamed from: f, reason: collision with root package name */
    public float f32691f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f32692g = new boolean[4];

    static {
        new bw5.rv();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rv parseFrom(byte[] bArr) {
        return (bw5.rv) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rv)) {
            return false;
        }
        bw5.rv rvVar = (bw5.rv) fVar;
        return n51.f.a(this.f32689d, rvVar.f32689d) && n51.f.a(java.lang.Float.valueOf(this.f32690e), java.lang.Float.valueOf(rvVar.f32690e)) && n51.f.a(java.lang.Float.valueOf(this.f32691f), java.lang.Float.valueOf(rvVar.f32691f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.rv();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32692g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32689d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.d(2, this.f32690e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f32691f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f32689d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.d(2, this.f32690e);
            }
            return zArr[3] ? i18 + b36.f.d(3, this.f32691f) : i18;
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
            this.f32689d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32690e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f32691f = aVar2.f(intValue);
        zArr[3] = true;
        return 0;
    }
}
