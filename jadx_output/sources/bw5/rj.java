package bw5;

/* loaded from: classes2.dex */
public class rj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f32548d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32549e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f32550f = new boolean[3];

    static {
        new bw5.rj();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rj parseFrom(byte[] bArr) {
        return (bw5.rj) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rj)) {
            return false;
        }
        bw5.rj rjVar = (bw5.rj) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f32548d), java.lang.Long.valueOf(rjVar.f32548d)) && n51.f.a(this.f32549e, rjVar.f32549e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.rj();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32550f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f32548d);
            }
            java.lang.String str = this.f32549e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f32548d) : 0;
            java.lang.String str2 = this.f32549e;
            return (str2 == null || !zArr[2]) ? h17 : h17 + b36.f.j(2, str2);
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
            this.f32548d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f32549e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
