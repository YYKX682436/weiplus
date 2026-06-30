package bw5;

/* loaded from: classes2.dex */
public class bg extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f25639d;

    /* renamed from: e, reason: collision with root package name */
    public int f25640e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25641f;

    /* renamed from: g, reason: collision with root package name */
    public long f25642g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f25643h = new boolean[5];

    static {
        new bw5.bg();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bg parseFrom(byte[] bArr) {
        return (bw5.bg) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bg)) {
            return false;
        }
        bw5.bg bgVar = (bw5.bg) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f25639d), java.lang.Long.valueOf(bgVar.f25639d)) && n51.f.a(java.lang.Integer.valueOf(this.f25640e), java.lang.Integer.valueOf(bgVar.f25640e)) && n51.f.a(java.lang.Boolean.valueOf(this.f25641f), java.lang.Boolean.valueOf(bgVar.f25641f)) && n51.f.a(java.lang.Long.valueOf(this.f25642g), java.lang.Long.valueOf(bgVar.f25642g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bg();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25643h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f25639d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f25640e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f25641f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f25642g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f25639d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f25640e);
            }
            if (zArr[3]) {
                h17 += b36.f.a(3, this.f25641f);
            }
            return zArr[4] ? h17 + b36.f.h(4, this.f25642g) : h17;
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
            this.f25639d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25640e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f25641f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f25642g = aVar2.i(intValue);
        zArr[4] = true;
        return 0;
    }
}
