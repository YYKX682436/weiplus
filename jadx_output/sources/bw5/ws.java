package bw5;

/* loaded from: classes2.dex */
public class ws extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34845d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34846e;

    /* renamed from: f, reason: collision with root package name */
    public int f34847f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f34848g = new boolean[4];

    static {
        new bw5.ws();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ws parseFrom(byte[] bArr) {
        return (bw5.ws) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ws)) {
            return false;
        }
        bw5.ws wsVar = (bw5.ws) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34845d), java.lang.Integer.valueOf(wsVar.f34845d)) && n51.f.a(this.f34846e, wsVar.f34846e) && n51.f.a(java.lang.Integer.valueOf(this.f34847f), java.lang.Integer.valueOf(wsVar.f34847f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ws();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34848g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34845d);
            }
            java.lang.String str = this.f34846e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f34847f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f34845d) : 0;
            java.lang.String str2 = this.f34846e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            return zArr[3] ? e17 + b36.f.e(3, this.f34847f) : e17;
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
            this.f34845d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34846e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f34847f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
