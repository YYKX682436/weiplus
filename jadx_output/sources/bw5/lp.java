package bw5;

/* loaded from: classes2.dex */
public class lp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29885d;

    /* renamed from: e, reason: collision with root package name */
    public int f29886e;

    /* renamed from: f, reason: collision with root package name */
    public int f29887f;

    /* renamed from: g, reason: collision with root package name */
    public int f29888g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f29889h = new boolean[5];

    static {
        new bw5.lp();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lp parseFrom(byte[] bArr) {
        return (bw5.lp) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lp)) {
            return false;
        }
        bw5.lp lpVar = (bw5.lp) fVar;
        return n51.f.a(this.f29885d, lpVar.f29885d) && n51.f.a(java.lang.Integer.valueOf(this.f29886e), java.lang.Integer.valueOf(lpVar.f29886e)) && n51.f.a(java.lang.Integer.valueOf(this.f29887f), java.lang.Integer.valueOf(lpVar.f29887f)) && n51.f.a(java.lang.Integer.valueOf(this.f29888g), java.lang.Integer.valueOf(lpVar.f29888g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lp();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29889h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29885d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29886e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f29887f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f29888g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f29885d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f29886e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f29887f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f29888g) : i18;
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
            this.f29885d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29886e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f29887f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f29888g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
