package bw5;

/* loaded from: classes2.dex */
public class jz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f29163d;

    /* renamed from: e, reason: collision with root package name */
    public long f29164e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29165f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f29166g = new boolean[4];

    static {
        new bw5.jz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jz parseFrom(byte[] bArr) {
        return (bw5.jz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jz)) {
            return false;
        }
        bw5.jz jzVar = (bw5.jz) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f29163d), java.lang.Long.valueOf(jzVar.f29163d)) && n51.f.a(java.lang.Long.valueOf(this.f29164e), java.lang.Long.valueOf(jzVar.f29164e)) && n51.f.a(this.f29165f, jzVar.f29165f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29166g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f29163d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f29164e);
            }
            java.lang.String str = this.f29165f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f29163d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f29164e);
            }
            java.lang.String str2 = this.f29165f;
            return (str2 == null || !zArr[3]) ? h17 : h17 + b36.f.j(3, str2);
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
            this.f29163d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29164e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f29165f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
