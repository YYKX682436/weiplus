package bw5;

/* loaded from: classes2.dex */
public class ze extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f35950d;

    /* renamed from: e, reason: collision with root package name */
    public int f35951e;

    /* renamed from: f, reason: collision with root package name */
    public int f35952f;

    /* renamed from: g, reason: collision with root package name */
    public int f35953g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f35954h = new boolean[5];

    static {
        new bw5.ze();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ze parseFrom(byte[] bArr) {
        return (bw5.ze) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ze)) {
            return false;
        }
        bw5.ze zeVar = (bw5.ze) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f35950d), java.lang.Integer.valueOf(zeVar.f35950d)) && n51.f.a(java.lang.Integer.valueOf(this.f35951e), java.lang.Integer.valueOf(zeVar.f35951e)) && n51.f.a(java.lang.Integer.valueOf(this.f35952f), java.lang.Integer.valueOf(zeVar.f35952f)) && n51.f.a(java.lang.Integer.valueOf(this.f35953g), java.lang.Integer.valueOf(zeVar.f35953g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ze();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35954h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f35950d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f35951e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f35952f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35953g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f35950d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f35951e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f35952f);
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f35953g) : e17;
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
            this.f35950d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35951e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f35952f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f35953g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
