package bw5;

/* loaded from: classes2.dex */
public class ff extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f27250d;

    /* renamed from: e, reason: collision with root package name */
    public int f27251e;

    /* renamed from: f, reason: collision with root package name */
    public int f27252f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f27253g = new boolean[4];

    static {
        new bw5.ff();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ff parseFrom(byte[] bArr) {
        return (bw5.ff) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ff)) {
            return false;
        }
        bw5.ff ffVar = (bw5.ff) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f27250d), java.lang.Integer.valueOf(ffVar.f27250d)) && n51.f.a(java.lang.Integer.valueOf(this.f27251e), java.lang.Integer.valueOf(ffVar.f27251e)) && n51.f.a(java.lang.Integer.valueOf(this.f27252f), java.lang.Integer.valueOf(ffVar.f27252f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ff();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27253g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f27250d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f27251e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f27252f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f27250d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f27251e);
            }
            return zArr[3] ? e17 + b36.f.e(3, this.f27252f) : e17;
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
            this.f27250d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27251e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f27252f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
