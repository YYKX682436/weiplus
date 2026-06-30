package bw5;

/* loaded from: classes11.dex */
public class l20 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29610d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.f20 f29611e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29612f;

    /* renamed from: g, reason: collision with root package name */
    public int f29613g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.g20 f29614h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.m20 f29615i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f29616m = new boolean[7];

    static {
        new bw5.l20();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l20)) {
            return false;
        }
        bw5.l20 l20Var = (bw5.l20) fVar;
        return n51.f.a(this.f29610d, l20Var.f29610d) && n51.f.a(this.f29611e, l20Var.f29611e) && n51.f.a(this.f29612f, l20Var.f29612f) && n51.f.a(java.lang.Integer.valueOf(this.f29613g), java.lang.Integer.valueOf(l20Var.f29613g)) && n51.f.a(this.f29614h, l20Var.f29614h) && n51.f.a(this.f29615i, l20Var.f29615i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.l20();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29616m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29610d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.f20 f20Var = this.f29611e;
            if (f20Var != null && zArr[2]) {
                fVar.e(2, f20Var.f27128d);
            }
            java.lang.String str2 = this.f29612f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f29613g);
            }
            bw5.g20 g20Var = this.f29614h;
            if (g20Var != null && zArr[5]) {
                fVar.i(5, g20Var.computeSize());
                this.f29614h.writeFields(fVar);
            }
            bw5.m20 m20Var = this.f29615i;
            if (m20Var != null && zArr[6]) {
                fVar.e(6, m20Var.f30058d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f29610d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            bw5.f20 f20Var2 = this.f29611e;
            if (f20Var2 != null && zArr[2]) {
                i18 += b36.f.e(2, f20Var2.f27128d);
            }
            java.lang.String str4 = this.f29612f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f29613g);
            }
            bw5.g20 g20Var2 = this.f29614h;
            if (g20Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, g20Var2.computeSize());
            }
            bw5.m20 m20Var2 = this.f29615i;
            return (m20Var2 == null || !zArr[6]) ? i18 : i18 + b36.f.e(6, m20Var2.f30058d);
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
        switch (intValue) {
            case 1:
                this.f29610d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29611e = bw5.f20.a(aVar2.g(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                this.f29612f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29613g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.g20 g20Var3 = new bw5.g20();
                    if (bArr != null && bArr.length > 0) {
                        g20Var3.parseFrom(bArr);
                    }
                    this.f29614h = g20Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                int g17 = aVar2.g(intValue);
                this.f29615i = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? null : bw5.m20.HybridRouterPageStatePageDisappear : bw5.m20.HybridRouterPageStatePageAppear : bw5.m20.HybridRouterPageStatePageExit : bw5.m20.HybridRouterPageStatePageEnter : bw5.m20.HybridRouterPageStateDefault;
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.l20) super.parseFrom(bArr);
    }
}
