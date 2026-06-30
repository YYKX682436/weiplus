package bw5;

/* loaded from: classes8.dex */
public class qz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32332d;

    /* renamed from: e, reason: collision with root package name */
    public long f32333e;

    /* renamed from: f, reason: collision with root package name */
    public long f32334f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f32335g = new boolean[4];

    static {
        new bw5.qz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qz parseFrom(byte[] bArr) {
        return (bw5.qz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qz)) {
            return false;
        }
        bw5.qz qzVar = (bw5.qz) fVar;
        return n51.f.a(this.f32332d, qzVar.f32332d) && n51.f.a(java.lang.Long.valueOf(this.f32333e), java.lang.Long.valueOf(qzVar.f32333e)) && n51.f.a(java.lang.Long.valueOf(this.f32334f), java.lang.Long.valueOf(qzVar.f32334f));
    }

    public java.lang.String getText() {
        return this.f32335g[1] ? this.f32332d : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32335g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32332d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f32333e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f32334f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f32332d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f32333e);
            }
            return zArr[3] ? i18 + b36.f.h(3, this.f32334f) : i18;
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
            this.f32332d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32333e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f32334f = aVar2.i(intValue);
        zArr[3] = true;
        return 0;
    }
}
